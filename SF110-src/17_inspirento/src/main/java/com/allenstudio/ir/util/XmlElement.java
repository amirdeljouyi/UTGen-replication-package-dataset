/*
 * @(#)XmlElement.java
 * Created on 2005-8-12
 */
package com.allenstudio.ir.util;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;
import java.util.Vector;

/**
* The XmlElement is a generic containment class for elements within an XML
* file.
* <p>
* 
* It extends Observable which should be used for gui elements which are
* interested in configuration changes.
* <p>
* 
* Show interested in:
* 
* <pre>
* xmlElement.addObserver(yourObserver);
* </pre>
* 
* <p>
* When making bigger changes on XmlElement and probably its subnodes and/or a
* greater number of attributes at once, you should just change XmlElement
* directly and manually notify the Observers by calling:
* <p>
* 
* <pre>
* xmlElement.setChanged();
* xmlElement.notifyObservers();
* </pre>
* 
* <p>
* There a good introduction for the Observable/Observer pattern in
* Model/View/Controller based applications at www.javaworld.com: -
* {@link http://www.javaworld.com/javaworld/jw-10-1996/jw-10-howto.html}
* 
* @author fdietz
*/
public class XmlElement extends Observable implements Cloneable {
    String name;

    String data;

    Hashtable<String, String> attributes;

    List<XmlElement> subElements;

    XmlElement parent;

    /**
     *
     * 
     * Constructor
     *  
     */
    public XmlElement() {
        subElements = new Vector<XmlElement>();
        this.attributes = new Hashtable<String, String>(10);
    }

    /**
     * **
     * 
     * Constructor
     * 
     * @param String
     *            Name
     *  
     */
    public XmlElement(String name) {
        this.name = name;
        this.attributes = new Hashtable<String, String>(10);
        subElements = new Vector<XmlElement>();
        data = "";
    }

    /**
     * **
     * 
     * Constructor
     * 
     * @param String
     *            Name
     * @param Hashtable
     *            Attributes
     *  
     */
    public XmlElement(String name, Hashtable<String, String> attributes) {
        this.name = name;
        this.attributes = attributes;
        subElements = new Vector<XmlElement>();
    }

    /**
     * **
     * 
     * Constructor
     * 
     * @param Name
     *            String
     * @param Data
     *            String
     *  
     */
    public XmlElement(String name, String data) {
        this.name = name;
        this.data = data;
        subElements = new Vector<XmlElement>();
        this.attributes = new Hashtable<String, String>(10);
    }

    /**
     * Add attribute to this xml element.
     * 
     * @param name
     *            name of key
     * @param value
     *            new attribute value
     * @return old attribute value
     *  
     */
    public Object addAttribute(String name, String value) {
        if ((value != null) && (name != null)) {
            Object returnValue = attributes.put(name, value);

            return returnValue;
        }

        return null;
    }

    /**
     * **
     * 
     * @return String
     * @param String
     *            Name
     *  
     */
    public String getAttribute(String name) {
        return ((String) attributes.get(name));
    }

    public String getAttribute(String name, String defaultValue) {
        if (getAttribute(name) == null) {
            addAttribute(name, defaultValue);
        }

        return getAttribute(name);
    }

    /**
     * **
     * 
     * @return String
     * @param String
     *            Name
     *  
     */
    public Hashtable<String, String> getAttributes() {
        return attributes;
    }

    /**
     * **
     * 
     * 
     * @param Attrs
     *            Hashtable to use as the attributes
     *  
     */
    public void setAttributes(Hashtable<String, String> attrs) {
        attributes = attrs;
    }

    /**
     * **
     * 
     * @return Enumeration
     *  
     */
    public Enumeration getAttributeNames() {
        return (attributes.keys());
    }

    /**
     * **
     * 
     * @return boolean
     * @param XmlElement
     *            E
     *  
     */
    public boolean addElement(XmlElement e) {
        e.setParent(this);

        return (subElements.add(e));
    }

    public XmlElement removeElement(XmlElement e) {
        XmlElement child = null;

        for (int i = 0; i < subElements.size(); i++) {
            child = (XmlElement) subElements.get(i);

            // FIXME -- This will most likely not work.
            //          You want the element removed if the contents are the same
            //          Not just if the element reference is the same.
            if (child == e) {
                subElements.remove(i);
            }
        }

        return (child);
    }

    public XmlElement removeElement(int index) {
        return (XmlElement) subElements.remove(index);
    }

    public void removeAllElements() {
        subElements.clear();
    }

    /**
     * convienience method for the TreeView
     * 
     * this method is modeled after the DefaultMutableTreeNode-class
     * 
     * DefaultMutableTreeNode wraps XmlElement for this purpose
     *  
     */
    public void removeFromParent() {
        if (parent == null) {
            return;
        }

        parent.removeElement(this);
        parent = null;
    }

    public void append(XmlElement e) {
        e.removeFromParent();

        addElement(e);
    }

    /**
     * 
     * convienience method for the TreeView
     * 
     * @param e
     * @param index
     */
    public void insertElement(XmlElement e, int index) {
        e.removeFromParent();

        subElements.add(index, e);
        e.setParent(this);
    }

    /**
     * **
     * 
     * @return Vector
     *  
     */
    public List getElements() {
        return subElements;
    }

    public int count() {
        return subElements.size();
    }

    /**
     * Returns the element whose hierachy is indicated
     * by <code>path</code>. The path is separated with
     * periods(".").<br>
     * <em>Note: if one node has more than one elements
     * that have the same name, that is, if its subnodes
     * have the same path, only the first one is returned.
     * </em> 
     * @return the first element qualified with the path
     * @param path the path string of the specified element
     */
    public XmlElement getElement(String path) {
        int i = path.indexOf('.');
        String topName;
        String subName;

        if (i == 0) {
            path = path.substring(1);
            i = path.indexOf('.');
        }

        if (i > 0) {
            topName = path.substring(0, i);
            subName = path.substring(i + 1);
        } else {
            topName = path;
            subName = null;
        }

        int j;

        for (j = 0; j < subElements.size(); j++) {
            if (((XmlElement) subElements.get(j)).getName().equals(topName)) {
                if (subName != null) {
                    return (((XmlElement) subElements.get(j))
                            .getElement(subName));
                } else {
                    return ((XmlElement) subElements.get(j));
                }
            }
        }

        return null;
    }

    public XmlElement getElement(int index) {
        return (XmlElement) subElements.get(index);
    }

    /**
     * Adds a sub element to this one. The path
     * is separated with dots(".").
     * 
     * @return the <code>XmlElement</code> added
     * @param path The subpath of the sub element to add
     *  
     */
    public XmlElement addSubElement(String path) {
        XmlElement parent = this;
        XmlElement child;
        String name;

        while (path.indexOf('.') != -1) {
            name = path.substring(0, path.indexOf('.'));
            path = path.substring(path.indexOf('.') + 1);

            // if path startsWith "/" -> skip
            if (name.length() == 0)
                continue;

            if (parent.getElement(name) != null) {
                parent = parent.getElement(name);
            } else {
                child = new XmlElement(name);

                parent.addElement(child);
                parent = child;
            }

        }

        child = new XmlElement(path);
        parent.addElement(child);

        return child;
    }

    /**
     * Adds a sub element to this one
     * 
     * @return XmlElement
     * @param element
     *            The XmlElement to add
     *  
     */
    public XmlElement addSubElement(XmlElement e) {
        e.setParent(this);
        subElements.add(e);

        return e;
    }

    /**
     * Adds a sub element to this one
     * 
     * @return XmlElement
     * @param Name
     *            The name of the sub element to add
     * @param Data
     *            String Data for this element
     */
    public XmlElement addSubElement(String name, String data) {
        XmlElement e = new XmlElement(name);
        e.setData(data);
        e.setParent(this);
        subElements.add(e);

        return e;
    }

    /**
     * Sets the parent element
     * 
     * @param Parent
     *            The XmlElement that contains this one
     *  
     */
    public void setParent(XmlElement parent) {
        this.parent = parent;
    }

    /**
     * Gives the XmlElement containing the current element
     * 
     * @return XmlElement
     *  
     */
    public XmlElement getParent() {
        return parent;
    }

    /**
     * Sets the data for this element
     * 
     * @param D
     *            The String representation of the data
     *  
     */
    public void setData(String d) {
        data = d;
    }

    /**
     * Returns the data associated with the current Xml element
     * 
     * @return String
     *  
     */
    public String getData() {
        return data;
    }

    /**
     * Returns the name of the current Xml element
     * 
     * @return String
     *  
     */
    public String getName() {
        return name;
    }

    /**
     * **
     * 
     * @param out
     *            OutputStream to print the data to
     *  
     */

    /*
     * public void write(OutputStream out) throws IOException { PrintWriter PW =
     * new PrintWriter(out); PW.println(" <?xml version=\"1.0\"
     * encoding=\"UTF-8\"?>"); if (SubElements.size() > 0) { for (int i = 0; i <
     * SubElements.size(); i++) { ((XmlElement)
     * SubElements.get(i))._writeSubNode(PW, 4); } } PW.flush(); }
     */

    /**
     * Prints sub nodes to the given data stream
     * 
     * @param out
     *            PrintWriter to use for printing
     * @param indent
     *            Number of spaces to indent things
     *  
     */

    /*
     * private void _writeSubNode(PrintWriter out, int indent) throws
     * IOException { _writeSpace(out, indent); out.print(" <" + Name); //if (
     * Attributes.size()>1) out.print(" ");
     * 
     * for (Enumeration e = Attributes.keys(); e.hasMoreElements();) { String K =
     * (String) e.nextElement(); out.print(K + "=\"" + Attributes.get(K) + "\"
     * b");
     *  } out.print(">");
     * 
     * if (Data != null && !Data.equals("")) { if (Data.length() > 20) {
     * out.println(""); _writeSpace(out, indent + 2); } out.print(Data); } if
     * (SubElements.size() > 0) { out.println(""); for (int i = 0; i <
     * SubElements.size(); i++) { ((XmlElement)
     * SubElements.get(i))._writeSubNode( out, indent + 4); } _writeSpace(out,
     * indent); } out.println(" </" + Name + ">");
     *  }
     */

    /**
     * Prints out a given number of spaces
     * 
     * @param out
     *            PrintWriter to use for printing
     * @param numSpaces
     *            Number of spaces to print
     *  
     */

    /*
     * private void _writeSpace(PrintWriter out, int numSpaces) throws
     * IOException {
     * 
     * for (int i = 0; i < numSpaces; i++) out.print(" "); }
     * 
     * public static void printNode(XmlElement Node, String indent) { String
     * Data = Node.getData(); if (Data == null || Data.equals("")) {
     * System.out.println(indent + Node.getName()); } else {
     * System.out.println(indent + Node.getName() + " = '" + Data + "'"); }
     * Vector Subs = Node.getElements(); int i, j; for (i = 0; i < Subs.size();
     * i++) { printNode((XmlElement) Subs.get(i), indent + " "); } }
     */
    public static void printNode(XmlElement node, String indent) {
        String data = node.getData();

        if ((data == null) || data.equals("")) {
            System.out.println(indent + node.getName());
        } else {
            System.out.println(indent + node.getName() + " = '" + data + "'");
        }

        // print attributes
        for (Enumeration enumeration = node.getAttributes().keys(); enumeration
                .hasMoreElements();) {
            String key = (String) enumeration.nextElement();
            String value = node.getAttribute(key);
            System.out.println(indent + key + ":" + value);
        }

        List subs = node.getElements();

        for (Iterator it = subs.iterator(); it.hasNext();) {
            printNode((XmlElement) it.next(), indent + "    ");

            // for (i = 0; i < subs.size(); i++) {
            // printNode((XmlElement) subs.get(i), indent + " ");
        }
    }

    /** {@inheritDoc} */
    @SuppressWarnings("unchecked")
    @Override
    public Object clone() {
        try {
            XmlElement clone = (XmlElement) super.clone(); // creates a shallow
                                                           // copy of this
                                                           // object

            if (attributes != null) {
                clone.setAttributes((Hashtable<String, String>) getAttributes().clone());
            }

            if (subElements != null) {
                clone.subElements = new Vector();

                List childs = getElements();
                XmlElement child;

                for (Iterator it = childs.iterator(); it.hasNext();) {
                    child = (XmlElement) it.next();

                    // for( int i=0; i<childs.size(); i++ ) {
                    // child = (XmlElement) childs.get(i);
                    clone.addSubElement((XmlElement) child.clone());
                }
            }

            return clone;
        } catch (CloneNotSupportedException cnse) {
            throw new InternalError("Could not clone XmlElement: " + cnse);
        }
    }

    /**
     * Sets the name.
     * 
     * @param name
     *            The name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Notify all Observers.
     * 
     * @see java.util.Observable#notifyObservers()
     */
    @Override
    public void notifyObservers() {
        setChanged();
        super.notifyObservers();
    }

    /**
     * Returns true if the specified objects are equal. They are equal if they
     * are both null OR if the <code>equals()</code> method return true. (
     * <code>obj1.equals(obj2)</code>).
     * 
     * @param obj1
     *            first object to compare with.
     * @param obj2
     *            second object to compare with.
     * @return true if they represent the same object; false if one of them is
     *         null or the <code>equals()</code> method returns false.
     */
    private boolean equals(Object obj1, Object obj2) {
        boolean equal = false;

        if ((obj1 == null) && (obj2 == null)) {
            equal = true;
        } else if ((obj1 != null) && (obj2 != null)) {
            equal = obj1.equals(obj2);
        }

        return equal;
    }

    /** {@inheritDoc}
     *Recursive comparison.
     */
    @Override
    public boolean equals(Object obj) {
        boolean equal = false;

        if ((obj != null) && (obj instanceof XmlElement)) {
            XmlElement other = (XmlElement) obj;

            if (equals(attributes, other.attributes)
                    && equals(data, other.data) && equals(name, other.name)
                    && equals(subElements, other.subElements)) {
                equal = true;
            }
        }

        return equal;
    }

    /** {@inheritDoc} */
    @Override
    public int hashCode() {
        //Hashcode value should be buffered.
        int hashCode = 23;

        if (attributes != null) {
            hashCode += (attributes.hashCode() * 13);
        }

        if (data != null) {
            hashCode += (data.hashCode() * 17);
        }

        if (name != null) {
            hashCode += (name.hashCode() * 29);
        }

        if (subElements != null) {
            hashCode += (subElements.hashCode() * 57);
        }

        return hashCode;
    }
}

//END public class XmlElement

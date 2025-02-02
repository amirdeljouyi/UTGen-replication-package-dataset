/*
 * Originally written by Doug Lea and released into the public domain. This may
 * be used for any purposes whatsoever without acknowledgment. Thanks for the
 * assistance and support of Sun Microsystems Labs, and everyone contributing,
 * testing, and using this code.
 */
package net.sf.xbus.base.core.timeoutcall;

/**
 * Interface describing any class that can generate new Thread objects. Using
 * ThreadFactories removes hardwiring of calls to <code>new Thread</code>,
 * enabling applications to use special thread subclasses, default
 * prioritization settings, etc.
 * <p> [<a
 * href="http://gee.cs.oswego.edu/dl/classes/EDU/oswego/cs/dl/util/concurrent/intro.html">
 * Introduction to this package. </a>]
 * <p>
 */

public interface ThreadFactory
{
	/**
	 * Create a new thread that will run the given command when started
	 */
	public Thread newThread(Runnable command);
}

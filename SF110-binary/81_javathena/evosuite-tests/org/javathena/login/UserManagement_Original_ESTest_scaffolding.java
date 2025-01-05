/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Mar 14 06:49:06 GMT 2024
 */

package org.javathena.login;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class UserManagement_Original_ESTest_scaffolding {

  @org.junit.jupiter.api.extension.RegisterExtension
  public org.evosuite.runtime.vnet.NonFunctionalRequirementExtension nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementExtension();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeAll
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.javathena.login.UserManagement"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.OFF; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @BeforeEach
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @AfterEach
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    /*No java.lang.System property to set*/
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(UserManagement_Original_ESTest_scaffolding.class.getClassLoader() ,
      "com.thoughtworks.xstream.XStream",
      "org.javathena.core.utiles.Functions",
      "com.thoughtworks.xstream.converters.extended.StackTraceElementFactory",
      "com.thoughtworks.xstream.converters.basic.StringBuilderConverter",
      "javolution.util.FastMap$KeySet",
      "com.thoughtworks.xstream.XStream$InitializationException",
      "com.thoughtworks.xstream.mapper.SystemAttributeAliasingMapper",
      "javolution.util.FastMap$EntrySet$1",
      "com.thoughtworks.xstream.converters.extended.EncodedByteArrayConverter",
      "org.javathena.utiles.sql.MySQLConfig",
      "com.thoughtworks.xstream.converters.extended.CurrencyConverter",
      "javolution.lang.Configurable$1",
      "com.thoughtworks.xstream.converters.reflection.SelfStreamingInstanceChecker",
      "com.thoughtworks.xstream.converters.Converter",
      "com.thoughtworks.xstream.core.util.Base64Encoder",
      "com.thoughtworks.xstream.alias.ClassMapper",
      "com.thoughtworks.xstream.converters.basic.BigDecimalConverter",
      "com.thoughtworks.xstream.converters.SingleValueConverter",
      "com.thoughtworks.xstream.converters.reflection.ReflectionProvider$Visitor",
      "com.thoughtworks.xstream.converters.MarshallingContext",
      "javolution.util.Index",
      "com.thoughtworks.xstream.mapper.OuterClassMapper",
      "org.javathena.conf.LoginAthena",
      "com.thoughtworks.xstream.converters.reflection.SerializableConverter$UnserializableParentsReflectionProvider",
      "javolution.context.ObjectFactory$2",
      "org.javathena.login.Login$Timer_interval_check_auth_sync",
      "javolution.context.ObjectFactory$1",
      "com.thoughtworks.xstream.io.HierarchicalStreamReader",
      "com.thoughtworks.xstream.core.util.CompositeClassLoader",
      "com.thoughtworks.xstream.converters.ConverterLookup",
      "com.thoughtworks.xstream.mapper.ClassAliasingMapper",
      "com.thoughtworks.xstream.mapper.CannotResolveClassException",
      "javolution.lang.Immutable",
      "com.thoughtworks.xstream.converters.reflection.FieldDictionary",
      "javolution.xml.XMLSerializable",
      "com.thoughtworks.xstream.mapper.EnumMapper",
      "com.thoughtworks.xstream.mapper.AnnotationConfiguration",
      "com.thoughtworks.xstream.io.xml.XmlFriendlyWriter",
      "com.thoughtworks.xstream.core.util.FastStack",
      "javolution.util.FastComparator$Lexical",
      "com.thoughtworks.xstream.converters.ConversionException",
      "com.thoughtworks.xstream.core.TreeMarshaller$CircularReferenceException",
      "com.thoughtworks.xstream.mapper.MapperWrapper",
      "com.thoughtworks.xstream.mapper.Mapper",
      "com.thoughtworks.xstream.converters.extended.FileConverter",
      "javolution.util.FastMap$ValueIterator$1",
      "com.thoughtworks.xstream.core.util.PrioritizedList$PrioritizedItem",
      "javolution.util.FastComparator$Rehash",
      "com.thoughtworks.xstream.core.util.ObjectIdDictionary",
      "javolution.util.Index$3",
      "javolution.util.Index$4",
      "javolution.util.Index$1",
      "javolution.util.Index$2",
      "com.thoughtworks.xstream.converters.extended.SqlTimestampConverter",
      "com.thoughtworks.xstream.converters.UnmarshallingContext",
      "com.thoughtworks.xstream.converters.extended.ColorConverter",
      "javolution.text.Text",
      "com.thoughtworks.xstream.converters.extended.DurationConverter",
      "com.thoughtworks.xstream.converters.basic.DoubleConverter",
      "com.thoughtworks.xstream.converters.collections.CharArrayConverter",
      "com.thoughtworks.xstream.converters.extended.LookAndFeelConverter",
      "com.thoughtworks.xstream.converters.collections.ArrayConverter",
      "com.thoughtworks.xstream.converters.extended.JavaMethodConverter",
      "com.thoughtworks.xstream.converters.enums.EnumConverter",
      "com.thoughtworks.xstream.converters.collections.MapConverter",
      "com.thoughtworks.xstream.io.HierarchicalStreamWriter",
      "com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter",
      "com.thoughtworks.xstream.core.AbstractReferenceUnmarshaller",
      "javolution.lang.MathLib",
      "com.thoughtworks.xstream.core.util.CustomObjectOutputStream",
      "javolution.util.FastMap$ValueIterator",
      "com.thoughtworks.xstream.core.util.OrderRetainingMap",
      "com.thoughtworks.xstream.mapper.DynamicProxyMapper",
      "com.thoughtworks.xstream.converters.enums.EnumMapConverter",
      "javolution.lang.Configurable$Logic",
      "com.thoughtworks.xstream.converters.basic.ByteConverter",
      "com.thoughtworks.xstream.converters.collections.TreeSetConverter",
      "com.thoughtworks.xstream.converters.extended.LocaleConverter",
      "com.thoughtworks.xstream.io.ExtendedHierarchicalStreamWriterHelper",
      "com.thoughtworks.xstream.core.BaseException",
      "javolution.lang.Realtime",
      "com.thoughtworks.xstream.converters.collections.PropertiesConverter",
      "com.thoughtworks.xstream.core.TreeMarshaller",
      "javolution.context.Allocator",
      "com.thoughtworks.xstream.converters.ConverterRegistry",
      "com.thoughtworks.xstream.core.TreeUnmarshaller",
      "org.javathena.core.data.Excecutable",
      "javolution.lang.Reusable",
      "com.thoughtworks.xstream.core.ReferenceByXPathMarshaller",
      "com.thoughtworks.xstream.mapper.AnnotationMapper",
      "javolution.context.Context$Root",
      "com.thoughtworks.xstream.converters.basic.UUIDConverter",
      "javolution.util.FastCollection",
      "com.thoughtworks.xstream.InitializationException",
      "com.thoughtworks.xstream.converters.extended.SubjectConverter",
      "com.thoughtworks.xstream.mapper.DefaultMapper",
      "com.thoughtworks.xstream.mapper.PackageAliasingMapper$1",
      "com.thoughtworks.xstream.converters.basic.StringConverter",
      "com.thoughtworks.xstream.mapper.ImmutableTypesMapper",
      "com.thoughtworks.xstream.core.AbstractReferenceMarshaller$ReferencedImplicitElementException",
      "com.thoughtworks.xstream.converters.collections.BitSetConverter",
      "org.javathena.login.Login",
      "javolution.context.ObjectFactory",
      "com.thoughtworks.xstream.converters.extended.ThrowableConverter",
      "com.thoughtworks.xstream.converters.reflection.ObjectAccessException",
      "com.thoughtworks.xstream.converters.extended.SqlTimeConverter",
      "com.thoughtworks.xstream.mapper.AttributeMapper",
      "com.thoughtworks.xstream.mapper.DynamicProxyMapper$DynamicProxy",
      "com.thoughtworks.xstream.mapper.AttributeAliasingMapper",
      "com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider",
      "javolution.util.FastComparator$Default",
      "javolution.context.AllocatorContext$1",
      "javolution.context.HeapContext$2",
      "javolution.context.HeapContext$1",
      "com.thoughtworks.xstream.io.WriterWrapper",
      "org.javathena.utiles.ConfigurationManagement",
      "javolution.util.FastTable$3",
      "javolution.util.FastTable$1",
      "org.javathena.login.parse.FromClient",
      "com.thoughtworks.xstream.mapper.CachingMapper",
      "com.thoughtworks.xstream.converters.extended.RegexPatternConverter",
      "com.thoughtworks.xstream.core.util.ObjectIdDictionary$WeakIdWrapper",
      "com.thoughtworks.xstream.MarshallingStrategy",
      "com.thoughtworks.xstream.core.util.OrderRetainingMap$ArraySet",
      "com.thoughtworks.xstream.converters.reflection.SerializableConverter",
      "javolution.util.FastComparator$Identity",
      "com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter$2",
      "com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter$1",
      "javolution.util.FastComparator$1",
      "com.thoughtworks.xstream.converters.basic.CharConverter",
      "com.thoughtworks.xstream.core.util.PrioritizedList$PrioritizedItemIterator",
      "javolution.util.FastCollection$Record",
      "com.thoughtworks.xstream.io.xml.AbstractXmlWriter",
      "com.thoughtworks.xstream.core.DefaultConverterLookup",
      "com.thoughtworks.xstream.converters.reflection.FieldKey",
      "javolution.context.AllocatorContext",
      "com.thoughtworks.xstream.core.AbstractReferenceMarshaller",
      "javolution.util.FastMap$EntrySet",
      "javolution.context.HeapContext$HeapAllocator",
      "com.thoughtworks.xstream.converters.reflection.SerializationMethodInvoker",
      "org.javathena.core.utiles.Constants$BL",
      "javolution.util.FastMap$Values",
      "org.javathena.data.IDBManagementLogin",
      "com.thoughtworks.xstream.converters.basic.ShortConverter",
      "com.thoughtworks.xstream.core.util.CustomObjectOutputStream$CustomPutField",
      "javolution.util.FastComparator",
      "org.javathena.core.data.Auth_data",
      "com.thoughtworks.xstream.core.JVM",
      "com.thoughtworks.xstream.XStreamException",
      "com.thoughtworks.xstream.io.xml.AbstractXmlDriver",
      "javolution.context.Context$1",
      "javolution.util.FastComparator$StringComparator",
      "org.javathena.core.data.Socket_data",
      "com.thoughtworks.xstream.converters.basic.BigIntegerConverter",
      "com.thoughtworks.xstream.converters.ConverterMatcher",
      "com.thoughtworks.xstream.converters.basic.StringBufferConverter",
      "com.thoughtworks.xstream.mapper.AbstractAttributeAliasingMapper",
      "javolution.context.ObjectFactory$Generic",
      "com.thoughtworks.xstream.core.util.CustomObjectOutputStream$StreamCallback",
      "com.thoughtworks.xstream.core.util.ThreadSafeSimpleDateFormat$1",
      "com.thoughtworks.xstream.converters.reflection.AbstractAttributedCharacterIteratorAttributeConverter",
      "com.thoughtworks.xstream.mapper.FieldAliasingMapper",
      "com.thoughtworks.xstream.converters.basic.IntConverter",
      "com.thoughtworks.xstream.converters.extended.StackTraceElementConverter",
      "com.thoughtworks.xstream.core.util.Pool$Factory",
      "com.thoughtworks.xstream.converters.extended.JavaClassConverter",
      "com.thoughtworks.xstream.core.AbstractTreeMarshallingStrategy",
      "com.thoughtworks.xstream.core.MapBackedDataHolder",
      "com.thoughtworks.xstream.converters.basic.DateConverter",
      "com.thoughtworks.xstream.core.util.CustomObjectInputStream$StreamCallback",
      "com.thoughtworks.xstream.converters.SingleValueConverterWrapper",
      "com.thoughtworks.xstream.converters.reflection.SerializableConverter$1",
      "com.thoughtworks.xstream.converters.reflection.ReflectionConverter",
      "com.thoughtworks.xstream.io.StreamException",
      "com.thoughtworks.xstream.converters.basic.LongConverter",
      "org.javathena.core.utiles.MultilanguageManagement",
      "com.thoughtworks.xstream.converters.extended.GregorianCalendarConverter",
      "com.thoughtworks.xstream.converters.extended.TextAttributeConverter",
      "com.thoughtworks.xstream.converters.extended.CharsetConverter",
      "com.thoughtworks.xstream.io.path.Path",
      "javolution.util.FastMap$2",
      "com.thoughtworks.xstream.core.util.ObjectIdDictionary$IdWrapper",
      "javolution.util.FastMap$5",
      "com.thoughtworks.xstream.converters.reflection.ImmutableFieldKeySorter",
      "com.thoughtworks.xstream.converters.enums.EnumSetConverter",
      "javolution.util.FastMap$6",
      "javolution.util.FastMap$9",
      "javolution.util.FastMap$7",
      "com.thoughtworks.xstream.mapper.AbstractXmlFriendlyMapper",
      "javolution.text.TextBuilder",
      "com.thoughtworks.xstream.alias.CannotResolveClassException",
      "org.javathena.core.utiles.Constants",
      "com.thoughtworks.xstream.core.util.Fields",
      "org.javathena.login.sql.data.Auth_data_SQL",
      "com.thoughtworks.xstream.mapper.Mapper$Null",
      "org.javathena.core.data.SessionType",
      "com.thoughtworks.xstream.core.util.ThreadSafeSimpleDateFormat",
      "com.thoughtworks.xstream.core.ReferenceByXPathUnmarshaller",
      "com.thoughtworks.xstream.converters.reflection.ExternalizableConverter",
      "com.thoughtworks.xstream.converters.collections.AbstractCollectionConverter",
      "org.javathena.login.Login$End",
      "com.thoughtworks.xstream.mapper.ImplicitCollectionMapper",
      "com.thoughtworks.xstream.converters.DataHolder",
      "com.thoughtworks.xstream.core.util.CustomObjectInputStream",
      "javolution.util.FastMap$Entry",
      "javolution.util.FastComparator$Direct",
      "javolution.io.UTF8StreamWriter",
      "com.thoughtworks.xstream.converters.extended.DynamicProxyConverter",
      "com.thoughtworks.xstream.core.util.QuickWriter",
      "com.thoughtworks.xstream.mapper.ArrayMapper",
      "com.thoughtworks.xstream.converters.basic.NullConverter",
      "javolution.lang.ValueType",
      "com.thoughtworks.xstream.core.util.ClassLoaderReference",
      "com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer",
      "com.thoughtworks.xstream.converters.basic.FloatConverter",
      "javolution.util.FastMap$KeyIterator",
      "com.thoughtworks.xstream.converters.extended.SqlDateConverter",
      "javolution.JavolutionError",
      "javolution.util.FastMap$KeyIterator$1",
      "com.thoughtworks.xstream.converters.extended.FontConverter",
      "javolution.util.FastTable",
      "com.thoughtworks.xstream.mapper.AnnotationMapper$WeakHashSet",
      "com.thoughtworks.xstream.converters.collections.TreeMapConverter",
      "javolution.context.HeapContext",
      "com.thoughtworks.xstream.core.util.ObjectIdDictionary$Wrapper",
      "com.thoughtworks.xstream.io.ExtendedHierarchicalStreamWriter",
      "org.javathena.login.UserManagement",
      "com.thoughtworks.xstream.core.ReferenceByXPathMarshallingStrategy",
      "javolution.text.TextBuilder$1",
      "javolution.lang.Configurable",
      "com.thoughtworks.xstream.mapper.DefaultImplementationsMapper",
      "javolution.context.Context",
      "org.javathena.login.parse.FromChar",
      "javolution.util.FastMap",
      "com.thoughtworks.xstream.mapper.PackageAliasingMapper",
      "com.thoughtworks.xstream.converters.reflection.ReflectionProvider",
      "com.thoughtworks.xstream.converters.reflection.FieldKeySorter",
      "com.thoughtworks.xstream.mapper.LocalConversionMapper",
      "com.thoughtworks.xstream.io.HierarchicalStreamDriver",
      "com.thoughtworks.xstream.io.path.PathTrackingWriter",
      "com.thoughtworks.xstream.converters.reflection.ReflectionProviderWrapper",
      "com.thoughtworks.xstream.core.util.Pool",
      "org.javathena.core.data.IParse",
      "com.thoughtworks.xstream.converters.ErrorWriter",
      "com.thoughtworks.xstream.mapper.XStream11XmlFriendlyMapper",
      "com.thoughtworks.xstream.converters.basic.URLConverter",
      "com.thoughtworks.xstream.io.xml.PrettyPrintWriter",
      "com.thoughtworks.xstream.core.util.PrioritizedList",
      "javolution.text.Text$2",
      "javolution.text.Text$1",
      "javolution.text.Text$4",
      "com.thoughtworks.xstream.io.path.PathTracker",
      "javolution.text.Text$3",
      "com.thoughtworks.xstream.io.xml.DomDriver",
      "com.thoughtworks.xstream.converters.collections.CollectionConverter",
      "com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter",
      "com.thoughtworks.xstream.converters.basic.BooleanConverter"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(UserManagement_Original_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "javolution.util.FastCollection",
      "javolution.context.Allocator",
      "javolution.context.ObjectFactory$1",
      "javolution.context.ObjectFactory",
      "javolution.util.FastTable$1",
      "javolution.context.ObjectFactory$2",
      "javolution.util.FastTable",
      "javolution.lang.Configurable$Logic",
      "javolution.lang.Configurable$1",
      "javolution.lang.Configurable",
      "javolution.util.FastComparator$1",
      "javolution.util.FastComparator$Default",
      "javolution.util.FastComparator$Direct",
      "javolution.util.FastComparator$Rehash",
      "javolution.util.FastComparator$StringComparator",
      "javolution.util.FastComparator$Identity",
      "javolution.util.FastComparator$Lexical",
      "javolution.util.FastComparator",
      "javolution.util.FastMap$9",
      "javolution.util.FastMap",
      "javolution.util.FastMap$Entry",
      "org.javathena.login.UserManagement",
      "org.javathena.core.utiles.Constants$BL",
      "org.javathena.core.utiles.Constants",
      "org.javathena.core.utiles.MultilanguageManagement",
      "org.javathena.login.Login",
      "com.thoughtworks.xstream.XStream",
      "com.thoughtworks.xstream.io.xml.AbstractXmlDriver",
      "com.thoughtworks.xstream.io.xml.DomDriver",
      "com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer",
      "com.thoughtworks.xstream.core.util.ClassLoaderReference",
      "com.thoughtworks.xstream.core.util.CompositeClassLoader",
      "com.thoughtworks.xstream.core.DefaultConverterLookup",
      "com.thoughtworks.xstream.core.util.PrioritizedList",
      "com.thoughtworks.xstream.core.JVM",
      "com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider",
      "com.thoughtworks.xstream.converters.reflection.FieldDictionary",
      "com.thoughtworks.xstream.converters.reflection.ImmutableFieldKeySorter",
      "com.thoughtworks.xstream.mapper.DefaultMapper",
      "com.thoughtworks.xstream.mapper.MapperWrapper",
      "com.thoughtworks.xstream.mapper.DynamicProxyMapper",
      "com.thoughtworks.xstream.mapper.PackageAliasingMapper$1",
      "com.thoughtworks.xstream.mapper.PackageAliasingMapper",
      "com.thoughtworks.xstream.mapper.ClassAliasingMapper",
      "com.thoughtworks.xstream.mapper.FieldAliasingMapper",
      "com.thoughtworks.xstream.mapper.AbstractAttributeAliasingMapper",
      "com.thoughtworks.xstream.mapper.AttributeAliasingMapper",
      "com.thoughtworks.xstream.mapper.SystemAttributeAliasingMapper",
      "com.thoughtworks.xstream.mapper.ImplicitCollectionMapper",
      "com.thoughtworks.xstream.mapper.OuterClassMapper",
      "com.thoughtworks.xstream.mapper.ArrayMapper",
      "com.thoughtworks.xstream.mapper.DefaultImplementationsMapper",
      "com.thoughtworks.xstream.mapper.Mapper$Null",
      "com.thoughtworks.xstream.mapper.AttributeMapper",
      "com.thoughtworks.xstream.mapper.EnumMapper",
      "com.thoughtworks.xstream.mapper.LocalConversionMapper",
      "com.thoughtworks.xstream.mapper.ImmutableTypesMapper",
      "com.thoughtworks.xstream.mapper.AnnotationMapper",
      "com.thoughtworks.xstream.mapper.AnnotationMapper$WeakHashSet",
      "com.thoughtworks.xstream.mapper.CachingMapper",
      "com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter",
      "com.thoughtworks.xstream.converters.reflection.ReflectionConverter",
      "com.thoughtworks.xstream.converters.reflection.SerializationMethodInvoker",
      "com.thoughtworks.xstream.core.util.PrioritizedList$PrioritizedItem",
      "com.thoughtworks.xstream.converters.reflection.SerializableConverter",
      "com.thoughtworks.xstream.converters.reflection.ReflectionProviderWrapper",
      "com.thoughtworks.xstream.converters.reflection.SerializableConverter$UnserializableParentsReflectionProvider",
      "com.thoughtworks.xstream.converters.reflection.ExternalizableConverter",
      "com.thoughtworks.xstream.converters.basic.NullConverter",
      "com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter",
      "com.thoughtworks.xstream.converters.basic.IntConverter",
      "com.thoughtworks.xstream.converters.SingleValueConverterWrapper",
      "com.thoughtworks.xstream.converters.basic.FloatConverter",
      "com.thoughtworks.xstream.converters.basic.DoubleConverter",
      "com.thoughtworks.xstream.converters.basic.LongConverter",
      "com.thoughtworks.xstream.converters.basic.ShortConverter",
      "com.thoughtworks.xstream.converters.basic.CharConverter",
      "com.thoughtworks.xstream.converters.basic.BooleanConverter",
      "com.thoughtworks.xstream.converters.basic.ByteConverter",
      "com.thoughtworks.xstream.converters.basic.StringConverter",
      "com.thoughtworks.xstream.converters.basic.StringBufferConverter",
      "com.thoughtworks.xstream.converters.basic.DateConverter",
      "com.thoughtworks.xstream.core.util.ThreadSafeSimpleDateFormat",
      "com.thoughtworks.xstream.core.util.Pool",
      "com.thoughtworks.xstream.core.util.ThreadSafeSimpleDateFormat$1",
      "com.thoughtworks.xstream.converters.collections.BitSetConverter",
      "com.thoughtworks.xstream.converters.basic.URLConverter",
      "com.thoughtworks.xstream.converters.basic.BigIntegerConverter",
      "com.thoughtworks.xstream.converters.basic.BigDecimalConverter",
      "com.thoughtworks.xstream.converters.collections.AbstractCollectionConverter",
      "com.thoughtworks.xstream.converters.collections.ArrayConverter",
      "com.thoughtworks.xstream.converters.collections.CharArrayConverter",
      "com.thoughtworks.xstream.converters.collections.CollectionConverter",
      "com.thoughtworks.xstream.converters.collections.MapConverter",
      "com.thoughtworks.xstream.converters.collections.TreeMapConverter",
      "com.thoughtworks.xstream.converters.collections.TreeSetConverter",
      "com.thoughtworks.xstream.core.util.Fields",
      "com.thoughtworks.xstream.converters.collections.PropertiesConverter",
      "com.thoughtworks.xstream.core.util.Base64Encoder",
      "com.thoughtworks.xstream.converters.extended.EncodedByteArrayConverter",
      "com.thoughtworks.xstream.converters.extended.FileConverter",
      "com.thoughtworks.xstream.converters.extended.SqlTimestampConverter",
      "com.thoughtworks.xstream.converters.extended.SqlTimeConverter",
      "com.thoughtworks.xstream.converters.extended.SqlDateConverter",
      "com.thoughtworks.xstream.converters.extended.DynamicProxyConverter",
      "com.thoughtworks.xstream.converters.extended.JavaClassConverter",
      "com.thoughtworks.xstream.converters.extended.JavaMethodConverter",
      "com.thoughtworks.xstream.converters.extended.FontConverter",
      "com.thoughtworks.xstream.converters.extended.ColorConverter",
      "com.thoughtworks.xstream.converters.reflection.AbstractAttributedCharacterIteratorAttributeConverter",
      "com.thoughtworks.xstream.converters.extended.TextAttributeConverter",
      "com.thoughtworks.xstream.core.util.OrderRetainingMap",
      "com.thoughtworks.xstream.core.util.OrderRetainingMap$ArraySet",
      "com.thoughtworks.xstream.converters.reflection.FieldKey",
      "com.thoughtworks.xstream.converters.extended.LookAndFeelConverter",
      "com.thoughtworks.xstream.converters.extended.LocaleConverter",
      "com.thoughtworks.xstream.converters.extended.GregorianCalendarConverter",
      "com.thoughtworks.xstream.converters.extended.SubjectConverter",
      "com.thoughtworks.xstream.converters.extended.ThrowableConverter",
      "com.thoughtworks.xstream.converters.extended.StackTraceElementFactory",
      "com.thoughtworks.xstream.converters.extended.StackTraceElementConverter",
      "com.thoughtworks.xstream.converters.extended.CurrencyConverter",
      "com.thoughtworks.xstream.converters.extended.RegexPatternConverter",
      "com.thoughtworks.xstream.converters.extended.CharsetConverter",
      "com.thoughtworks.xstream.converters.extended.DurationConverter",
      "com.thoughtworks.xstream.converters.enums.EnumConverter",
      "com.thoughtworks.xstream.converters.enums.EnumSetConverter",
      "com.thoughtworks.xstream.converters.enums.EnumMapConverter",
      "com.thoughtworks.xstream.converters.basic.StringBuilderConverter",
      "com.thoughtworks.xstream.converters.basic.UUIDConverter",
      "com.thoughtworks.xstream.converters.reflection.SelfStreamingInstanceChecker",
      "com.thoughtworks.xstream.core.AbstractTreeMarshallingStrategy",
      "com.thoughtworks.xstream.core.ReferenceByXPathMarshallingStrategy",
      "org.javathena.conf.LoginAthena",
      "org.javathena.utiles.ConfigurationManagement",
      "org.javathena.utiles.sql.MySQLConfig",
      "javolution.context.Context$Root",
      "javolution.context.Context$1",
      "javolution.context.Context",
      "javolution.context.HeapContext$1",
      "javolution.context.HeapContext$2",
      "javolution.context.HeapContext",
      "javolution.context.AllocatorContext$1",
      "javolution.context.AllocatorContext",
      "javolution.context.HeapContext$HeapAllocator",
      "org.javathena.core.data.Auth_data",
      "org.javathena.core.utiles.Functions",
      "org.javathena.core.data.Socket_data",
      "org.javathena.login.parse.FromChar",
      "org.javathena.login.parse.FromClient",
      "com.mysql.jdbc.LoadBalancingConnectionProxy",
      "com.mysql.jdbc.LoadBalancedMySQLConnection",
      "javolution.util.FastMap$2",
      "javolution.util.FastMap$5",
      "javolution.util.FastMap$Values",
      "javolution.util.FastMap$ValueIterator$1",
      "javolution.util.FastMap$ValueIterator",
      "org.javathena.login.parse.FromAdmin",
      "com.mysql.jdbc.Field",
      "com.mysql.jdbc.Messages",
      "com.mysql.jdbc.ConnectionPropertiesImpl",
      "com.mysql.jdbc.log.NullLogger",
      "com.mysql.jdbc.Constants",
      "com.mysql.jdbc.Util",
      "com.mysql.jdbc.ConnectionImpl",
      "com.mysql.jdbc.JDBC4Connection",
      "com.mysql.jdbc.ConnectionPropertiesImpl$ConnectionProperty",
      "com.mysql.jdbc.ConnectionPropertiesImpl$BooleanConnectionProperty",
      "com.mysql.jdbc.ConnectionPropertiesImpl$IntegerConnectionProperty",
      "com.mysql.jdbc.ConnectionPropertiesImpl$MemorySizeConnectionProperty",
      "com.mysql.jdbc.ConnectionPropertiesImpl$StringConnectionProperty",
      "com.mysql.jdbc.ConnectionPropertiesImpl$LongConnectionProperty",
      "com.mysql.jdbc.StringUtils",
      "com.mysql.jdbc.VersionedStringProperty",
      "com.mysql.jdbc.CharsetMapping",
      "org.javathena.login.sql.data.Auth_data_SQL",
      "javolution.util.FastMap$7",
      "javolution.util.FastMap$KeySet",
      "com.thoughtworks.xstream.io.xml.AbstractXmlWriter",
      "com.thoughtworks.xstream.io.xml.PrettyPrintWriter",
      "com.thoughtworks.xstream.core.util.FastStack",
      "com.thoughtworks.xstream.core.util.QuickWriter",
      "com.thoughtworks.xstream.core.TreeMarshaller",
      "com.thoughtworks.xstream.core.AbstractReferenceMarshaller",
      "com.thoughtworks.xstream.core.ReferenceByXPathMarshaller",
      "com.thoughtworks.xstream.core.util.ObjectIdDictionary",
      "com.thoughtworks.xstream.io.path.PathTracker",
      "com.thoughtworks.xstream.io.WriterWrapper",
      "com.thoughtworks.xstream.io.path.PathTrackingWriter",
      "com.thoughtworks.xstream.io.ExtendedHierarchicalStreamWriterHelper",
      "com.thoughtworks.xstream.core.util.PrioritizedList$PrioritizedItemIterator",
      "com.thoughtworks.xstream.mapper.DynamicProxyMapper$DynamicProxy",
      "com.thoughtworks.xstream.io.path.Path",
      "com.thoughtworks.xstream.core.util.ObjectIdDictionary$IdWrapper",
      "com.thoughtworks.xstream.core.util.ObjectIdDictionary$WeakIdWrapper",
      "com.thoughtworks.xstream.converters.reflection.SerializableConverter$1",
      "com.thoughtworks.xstream.core.util.CustomObjectOutputStream",
      "com.thoughtworks.xstream.core.MapBackedDataHolder",
      "com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter$1",
      "com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter$2",
      "javolution.util.Index$1",
      "javolution.util.Index$2",
      "javolution.util.Index$3",
      "javolution.util.Index$4",
      "javolution.util.Index",
      "com.thoughtworks.xstream.core.util.FastField",
      "javolution.lang.MathLib",
      "com.mysql.jdbc.interceptors.SessionAssociationInterceptor",
      "javolution.util.FastMap$KeyIterator$1",
      "javolution.util.FastMap$KeyIterator",
      "com.mysql.jdbc.RowDataDynamic",
      "javolution.context.PersistentContext$Reference",
      "javolution.util.FastMap$1",
      "javolution.context.PersistentContext",
      "javolution.util.FastMap$6",
      "javolution.util.FastMap$EntrySet",
      "javolution.util.FastMap$EntrySet$1",
      "javolution.util.FastMap$EntryIterator$1",
      "javolution.util.FastMap$EntryIterator",
      "com.mysql.jdbc.StatementImpl",
      "com.mysql.jdbc.PreparedStatement",
      "com.mysql.jdbc.JDBC4PreparedStatement",
      "com.mysql.jdbc.MysqlIO",
      "com.mysql.jdbc.SequentialBalanceStrategy",
      "javolution.util.FastTable$2",
      "com.mysql.jdbc.exceptions.jdbc4.CommunicationsException",
      "com.mysql.jdbc.SQLError",
      "com.mysql.jdbc.exceptions.jdbc4.MySQLNonTransientConnectionException",
      "com.mysql.jdbc.NonRegisteringDriver",
      "com.mysql.jdbc.Driver",
      "com.mysql.jdbc.interceptors.ResultSetScannerInterceptor",
      "com.mysql.jdbc.V1toV2StatementInterceptorAdapter",
      "com.mysql.jdbc.JDBC4CallableStatement",
      "com.mysql.jdbc.CallableStatement",
      "com.mysql.jdbc.RowDataStatic",
      "com.mysql.jdbc.ReflectiveStatementInterceptorAdapter",
      "com.mysql.jdbc.NoSubInterceptorWrapper",
      "com.mysql.jdbc.RandomBalanceStrategy",
      "javolution.util.FastCollection$1",
      "javolution.util.FastCollection$Unmodifiable",
      "com.mysql.jdbc.BestResponseTimeBalanceStrategy",
      "com.mysql.jdbc.ServerPreparedStatement",
      "com.mysql.jdbc.JDBC4ServerPreparedStatement",
      "com.mysql.jdbc.ReplicationConnection",
      "com.mysql.jdbc.interceptors.ServerStatusDiffInterceptor",
      "javolution.util.FastTable$3",
      "com.mysql.jdbc.Buffer",
      "com.mysql.jdbc.JDBC4ResultSet",
      "com.mysql.jdbc.ResultSetImpl",
      "com.mysql.jdbc.UpdatableResultSet",
      "com.mysql.jdbc.JDBC4UpdatableResultSet",
      "javolution.text.Text$1",
      "javolution.text.Text$2",
      "javolution.io.UTF8StreamWriter",
      "javolution.text.Text$3",
      "javolution.text.Text$4",
      "javolution.text.Text",
      "javolution.util.FastMap$3",
      "javolution.util.FastTable$FastTableIterator$1",
      "javolution.util.FastTable$FastTableIterator",
      "com.mysql.jdbc.RowDataCursor",
      "javolution.text.TextBuilder$1",
      "javolution.text.TextBuilder",
      "com.thoughtworks.xstream.core.BaseException",
      "com.thoughtworks.xstream.XStreamException",
      "com.thoughtworks.xstream.converters.ConversionException"
    );
  }
}

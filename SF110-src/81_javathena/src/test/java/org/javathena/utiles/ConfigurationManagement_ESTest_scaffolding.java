/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Mar 13 18:44:16 GMT 2024
 */

package org.javathena.utiles;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ConfigurationManagement_ESTest_scaffolding {

  @org.junit.jupiter.api.extension.RegisterExtension
  public org.evosuite.runtime.vnet.NonFunctionalRequirementExtension nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementExtension();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeAll
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.javathena.utiles.ConfigurationManagement"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ConfigurationManagement_ESTest_scaffolding.class.getClassLoader() ,
      "com.thoughtworks.xstream.XStream",
      "com.thoughtworks.xstream.core.DefaultConverterLookup",
      "com.thoughtworks.xstream.converters.reflection.FieldKey",
      "org.javathena.core.utiles.Functions",
      "com.thoughtworks.xstream.converters.extended.StackTraceElementFactory",
      "com.thoughtworks.xstream.core.AbstractReferenceMarshaller",
      "com.thoughtworks.xstream.converters.basic.StringBuilderConverter",
      "com.thoughtworks.xstream.XStream$InitializationException",
      "com.thoughtworks.xstream.converters.reflection.SerializationMethodInvoker",
      "org.javathena.core.utiles.Constants$BL",
      "com.thoughtworks.xstream.mapper.SystemAttributeAliasingMapper",
      "com.thoughtworks.xstream.converters.basic.ShortConverter",
      "javolution.util.FastComparator",
      "com.thoughtworks.xstream.converters.extended.EncodedByteArrayConverter",
      "com.thoughtworks.xstream.converters.extended.CurrencyConverter",
      "com.thoughtworks.xstream.core.JVM",
      "javolution.lang.Configurable$1",
      "com.thoughtworks.xstream.converters.reflection.SelfStreamingInstanceChecker",
      "com.thoughtworks.xstream.converters.Converter",
      "com.thoughtworks.xstream.core.util.Base64Encoder",
      "com.thoughtworks.xstream.XStreamException",
      "com.thoughtworks.xstream.alias.ClassMapper",
      "com.thoughtworks.xstream.converters.basic.BigDecimalConverter",
      "com.thoughtworks.xstream.converters.SingleValueConverter",
      "com.thoughtworks.xstream.io.xml.AbstractXmlDriver",
      "com.thoughtworks.xstream.converters.reflection.ReflectionProvider$Visitor",
      "com.thoughtworks.xstream.converters.MarshallingContext",
      "com.thoughtworks.xstream.mapper.OuterClassMapper",
      "org.javathena.conf.LoginAthena",
      "com.thoughtworks.xstream.converters.reflection.SerializableConverter$UnserializableParentsReflectionProvider",
      "javolution.util.FastComparator$StringComparator",
      "com.thoughtworks.xstream.converters.basic.BigIntegerConverter",
      "javolution.context.ObjectFactory$2",
      "javolution.context.ObjectFactory$1",
      "com.thoughtworks.xstream.io.HierarchicalStreamReader",
      "com.thoughtworks.xstream.converters.ConverterMatcher",
      "com.thoughtworks.xstream.converters.basic.StringBufferConverter",
      "com.thoughtworks.xstream.core.util.CompositeClassLoader",
      "com.thoughtworks.xstream.mapper.AbstractAttributeAliasingMapper",
      "com.thoughtworks.xstream.converters.ConverterLookup",
      "com.thoughtworks.xstream.mapper.ClassAliasingMapper",
      "com.thoughtworks.xstream.core.util.CustomObjectOutputStream$StreamCallback",
      "com.thoughtworks.xstream.mapper.CannotResolveClassException",
      "javolution.context.ObjectFactory$Generic",
      "com.thoughtworks.xstream.core.util.ThreadSafeSimpleDateFormat$1",
      "com.thoughtworks.xstream.converters.reflection.AbstractAttributedCharacterIteratorAttributeConverter",
      "com.thoughtworks.xstream.converters.reflection.FieldDictionary",
      "com.thoughtworks.xstream.mapper.FieldAliasingMapper",
      "com.thoughtworks.xstream.mapper.EnumMapper",
      "com.thoughtworks.xstream.mapper.AnnotationConfiguration",
      "javolution.xml.XMLSerializable",
      "com.thoughtworks.xstream.converters.basic.IntConverter",
      "com.thoughtworks.xstream.converters.extended.StackTraceElementConverter",
      "com.thoughtworks.xstream.core.util.Pool$Factory",
      "com.thoughtworks.xstream.converters.extended.JavaClassConverter",
      "com.thoughtworks.xstream.core.AbstractTreeMarshallingStrategy",
      "javolution.util.FastComparator$Lexical",
      "com.thoughtworks.xstream.converters.ConversionException",
      "com.thoughtworks.xstream.mapper.MapperWrapper",
      "com.thoughtworks.xstream.mapper.Mapper",
      "com.thoughtworks.xstream.converters.basic.DateConverter",
      "com.thoughtworks.xstream.core.util.CustomObjectInputStream$StreamCallback",
      "com.thoughtworks.xstream.converters.SingleValueConverterWrapper",
      "com.thoughtworks.xstream.converters.extended.FileConverter",
      "com.thoughtworks.xstream.core.util.PrioritizedList$PrioritizedItem",
      "javolution.util.FastComparator$Rehash",
      "com.thoughtworks.xstream.converters.reflection.ReflectionConverter",
      "com.thoughtworks.xstream.io.StreamException",
      "com.thoughtworks.xstream.converters.basic.LongConverter",
      "org.javathena.core.utiles.MultilanguageManagement",
      "com.thoughtworks.xstream.converters.extended.SqlTimestampConverter",
      "com.thoughtworks.xstream.converters.extended.GregorianCalendarConverter",
      "com.thoughtworks.xstream.converters.UnmarshallingContext",
      "com.thoughtworks.xstream.converters.extended.ColorConverter",
      "com.thoughtworks.xstream.converters.extended.TextAttributeConverter",
      "com.thoughtworks.xstream.converters.extended.CharsetConverter",
      "com.thoughtworks.xstream.converters.extended.DurationConverter",
      "com.thoughtworks.xstream.converters.basic.DoubleConverter",
      "com.thoughtworks.xstream.converters.collections.CharArrayConverter",
      "com.thoughtworks.xstream.converters.extended.LookAndFeelConverter",
      "com.thoughtworks.xstream.converters.collections.ArrayConverter",
      "com.thoughtworks.xstream.converters.reflection.ImmutableFieldKeySorter",
      "com.thoughtworks.xstream.converters.extended.JavaMethodConverter",
      "com.thoughtworks.xstream.converters.enums.EnumConverter",
      "com.thoughtworks.xstream.converters.enums.EnumSetConverter",
      "com.thoughtworks.xstream.converters.collections.MapConverter",
      "com.thoughtworks.xstream.mapper.AbstractXmlFriendlyMapper",
      "com.thoughtworks.xstream.io.HierarchicalStreamWriter",
      "com.thoughtworks.xstream.alias.CannotResolveClassException",
      "org.javathena.core.utiles.Constants",
      "org.javathena.core.utiles.ACO",
      "com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter",
      "com.thoughtworks.xstream.core.AbstractReferenceUnmarshaller",
      "com.thoughtworks.xstream.core.util.Fields",
      "com.thoughtworks.xstream.mapper.Mapper$Null",
      "com.thoughtworks.xstream.core.util.CustomObjectOutputStream",
      "com.thoughtworks.xstream.core.util.ThreadSafeSimpleDateFormat",
      "com.thoughtworks.xstream.core.ReferenceByXPathUnmarshaller",
      "com.thoughtworks.xstream.converters.reflection.ExternalizableConverter",
      "com.thoughtworks.xstream.converters.collections.AbstractCollectionConverter",
      "com.thoughtworks.xstream.mapper.ImplicitCollectionMapper",
      "com.thoughtworks.xstream.core.util.OrderRetainingMap",
      "com.thoughtworks.xstream.mapper.DynamicProxyMapper",
      "com.thoughtworks.xstream.converters.enums.EnumMapConverter",
      "javolution.lang.Configurable$Logic",
      "com.thoughtworks.xstream.converters.DataHolder",
      "com.thoughtworks.xstream.converters.basic.ByteConverter",
      "com.thoughtworks.xstream.core.util.CustomObjectInputStream",
      "com.thoughtworks.xstream.converters.collections.TreeSetConverter",
      "com.thoughtworks.xstream.converters.extended.LocaleConverter",
      "javolution.util.FastComparator$Direct",
      "com.thoughtworks.xstream.converters.extended.DynamicProxyConverter",
      "com.thoughtworks.xstream.core.BaseException",
      "com.thoughtworks.xstream.mapper.ArrayMapper",
      "com.thoughtworks.xstream.converters.basic.NullConverter",
      "javolution.lang.Realtime",
      "com.thoughtworks.xstream.converters.collections.PropertiesConverter",
      "com.thoughtworks.xstream.core.TreeMarshaller",
      "com.thoughtworks.xstream.converters.ConverterRegistry",
      "javolution.context.Allocator",
      "com.thoughtworks.xstream.core.util.ClassLoaderReference",
      "com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer",
      "com.thoughtworks.xstream.core.TreeUnmarshaller",
      "com.thoughtworks.xstream.converters.basic.FloatConverter",
      "com.thoughtworks.xstream.converters.extended.SqlDateConverter",
      "com.thoughtworks.xstream.converters.extended.FontConverter",
      "com.thoughtworks.xstream.core.ReferenceByXPathMarshaller",
      "javolution.lang.Reusable",
      "com.thoughtworks.xstream.mapper.AnnotationMapper",
      "com.thoughtworks.xstream.mapper.AnnotationMapper$WeakHashSet",
      "javolution.util.FastTable",
      "com.thoughtworks.xstream.converters.collections.TreeMapConverter",
      "com.thoughtworks.xstream.converters.basic.UUIDConverter",
      "javolution.util.FastCollection",
      "com.thoughtworks.xstream.InitializationException",
      "com.thoughtworks.xstream.converters.extended.SubjectConverter",
      "com.thoughtworks.xstream.mapper.DefaultMapper",
      "com.thoughtworks.xstream.mapper.PackageAliasingMapper$1",
      "com.thoughtworks.xstream.converters.basic.StringConverter",
      "com.thoughtworks.xstream.mapper.ImmutableTypesMapper",
      "com.thoughtworks.xstream.converters.collections.BitSetConverter",
      "com.thoughtworks.xstream.core.ReferenceByXPathMarshallingStrategy",
      "com.thoughtworks.xstream.mapper.DefaultImplementationsMapper",
      "com.thoughtworks.xstream.converters.extended.ThrowableConverter",
      "javolution.context.ObjectFactory",
      "javolution.lang.Configurable",
      "com.thoughtworks.xstream.converters.reflection.ObjectAccessException",
      "com.thoughtworks.xstream.converters.extended.SqlTimeConverter",
      "com.thoughtworks.xstream.mapper.AttributeMapper",
      "com.thoughtworks.xstream.mapper.AttributeAliasingMapper",
      "com.thoughtworks.xstream.mapper.PackageAliasingMapper",
      "com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider",
      "com.thoughtworks.xstream.converters.reflection.ReflectionProvider",
      "javolution.util.FastComparator$Default",
      "com.thoughtworks.xstream.converters.reflection.FieldKeySorter",
      "com.thoughtworks.xstream.mapper.LocalConversionMapper",
      "org.javathena.utiles.ConfigurationManagement",
      "com.thoughtworks.xstream.io.HierarchicalStreamDriver",
      "javolution.util.FastTable$1",
      "com.thoughtworks.xstream.converters.reflection.ReflectionProviderWrapper",
      "com.thoughtworks.xstream.core.util.Pool",
      "com.thoughtworks.xstream.mapper.CachingMapper",
      "com.thoughtworks.xstream.converters.extended.RegexPatternConverter",
      "com.thoughtworks.xstream.MarshallingStrategy",
      "com.thoughtworks.xstream.core.util.OrderRetainingMap$ArraySet",
      "com.thoughtworks.xstream.converters.ErrorWriter",
      "com.thoughtworks.xstream.converters.reflection.SerializableConverter",
      "com.thoughtworks.xstream.mapper.XStream11XmlFriendlyMapper",
      "com.thoughtworks.xstream.converters.basic.URLConverter",
      "javolution.util.FastComparator$Identity",
      "com.thoughtworks.xstream.core.util.PrioritizedList",
      "com.thoughtworks.xstream.converters.basic.CharConverter",
      "javolution.util.FastComparator$1",
      "com.thoughtworks.xstream.io.xml.DomDriver",
      "com.thoughtworks.xstream.converters.collections.CollectionConverter",
      "com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter",
      "com.thoughtworks.xstream.converters.basic.BooleanConverter",
      "javolution.util.FastCollection$Record"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ConfigurationManagement_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
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
      "org.javathena.utiles.ConfigurationManagement",
      "org.javathena.core.utiles.MultilanguageManagement",
      "org.javathena.core.utiles.Constants$BL",
      "org.javathena.core.utiles.Constants",
      "org.javathena.core.utiles.ACO",
      "org.javathena.core.utiles.Functions",
      "com.thoughtworks.xstream.core.BaseException",
      "com.thoughtworks.xstream.XStreamException",
      "com.thoughtworks.xstream.io.StreamException"
    );
  }
}

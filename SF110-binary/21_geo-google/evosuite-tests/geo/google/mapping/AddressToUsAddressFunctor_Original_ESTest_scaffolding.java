/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Mar 12 00:02:20 GMT 2024
 */

package geo.google.mapping;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class AddressToUsAddressFunctor_Original_ESTest_scaffolding {

  @org.junit.jupiter.api.extension.RegisterExtension
  public org.evosuite.runtime.vnet.NonFunctionalRequirementExtension nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementExtension();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeAll
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "geo.google.mapping.AddressToUsAddressFunctor"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AddressToUsAddressFunctor_Original_ESTest_scaffolding.class.getClassLoader() ,
      "oasis.names.tc.ciq.xsdschema.xal._2.PostBox",
      "geo.google.datamodel.GeoAddressAccuracy",
      "oasis.names.tc.ciq.xsdschema.xal._2.PostalCode",
      "oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType",
      "oasis.names.tc.ciq.xsdschema.xal._2.PostalCode$PostTown",
      "org.apache.commons.lang.builder.ReflectionToStringBuilder",
      "geo.google.datamodel.GeoUsAddress",
      "org.apache.commons.lang.SystemUtils",
      "oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare$DependentThoroughfare",
      "org.apache.commons.lang.builder.ToStringStyle$MultiLineToStringStyle",
      "oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType",
      "org.apache.commons.collections.collection.AbstractCollectionDecorator",
      "oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare",
      "oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea$SubAdministrativeArea",
      "oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType",
      "org.apache.commons.lang.builder.ToStringStyle$SimpleToStringStyle",
      "oasis.names.tc.ciq.xsdschema.xal._2.FirmType",
      "oasis.names.tc.ciq.xsdschema.xal._2.Premise",
      "geo.google.mapping.Functor",
      "geo.google.datamodel.GeoAltitude",
      "geo.google.datamodel.GeoCoordinate",
      "oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType",
      "geo.google.datamodel.GeoAddress",
      "oasis.names.tc.ciq.xsdschema.xal._2.PostOffice",
      "org.apache.commons.lang.builder.ToStringStyle$DefaultToStringStyle",
      "org.apache.commons.lang.builder.ToStringBuilder",
      "org.apache.commons.lang.builder.HashCodeBuilder",
      "oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea",
      "oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails$Address",
      "oasis.names.tc.ciq.xsdschema.xal._2.Locality",
      "oasis.names.tc.ciq.xsdschema.xal._2.AddressLinesType",
      "org.apache.commons.lang.builder.ToStringStyle",
      "org.apache.commons.collections.CollectionUtils",
      "geo.google.mapping.AddressToUsAddressFunctor",
      "org.apache.commons.collections.collection.UnmodifiableCollection",
      "oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType",
      "org.apache.commons.lang.builder.ToStringStyle$NoFieldNameToStringStyle",
      "oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType",
      "geo.google.datamodel.GeoAltitude$GeoAltitudeMode",
      "org.apache.commons.collections.collection.AbstractSerializableCollectionDecorator",
      "org.apache.commons.lang.builder.ToStringStyle$ShortPrefixToStringStyle",
      "oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails$Country",
      "oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails$PostalServiceElements",
      "oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePreDirectionType",
      "org.apache.commons.lang.builder.EqualsBuilder",
      "oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails",
      "org.apache.commons.lang.builder.HashCodeBuilder$1",
      "org.apache.commons.collections.Unmodifiable",
      "org.apache.commons.lang.builder.ToStringStyle$1"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(AddressToUsAddressFunctor_Original_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "geo.google.mapping.AddressToUsAddressFunctor",
      "geo.google.datamodel.GeoAddress",
      "geo.google.datamodel.GeoUsAddress",
      "geo.google.datamodel.GeoCoordinate",
      "geo.google.datamodel.GeoAltitude",
      "oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails",
      "org.apache.commons.lang.builder.ToStringStyle$DefaultToStringStyle",
      "org.apache.commons.lang.builder.ToStringStyle$MultiLineToStringStyle",
      "org.apache.commons.lang.SystemUtils",
      "org.apache.commons.lang.builder.ToStringStyle$NoFieldNameToStringStyle",
      "org.apache.commons.lang.builder.ToStringStyle$ShortPrefixToStringStyle",
      "org.apache.commons.lang.builder.ToStringStyle$SimpleToStringStyle",
      "org.apache.commons.lang.builder.ToStringStyle$1",
      "org.apache.commons.lang.builder.ToStringStyle",
      "org.apache.commons.lang.builder.ToStringBuilder",
      "org.apache.commons.lang.builder.ReflectionToStringBuilder",
      "org.apache.commons.lang.builder.HashCodeBuilder$1",
      "org.apache.commons.lang.builder.HashCodeBuilder",
      "oasis.names.tc.ciq.xsdschema.xal._2.Locality",
      "oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails$Country$CountryNameCode",
      "org.apache.commons.lang.builder.EqualsBuilder",
      "oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails$Country",
      "org.apache.commons.collections.collection.AbstractCollectionDecorator",
      "org.apache.commons.collections.collection.AbstractSerializableCollectionDecorator",
      "org.apache.commons.collections.collection.UnmodifiableCollection",
      "org.apache.commons.collections.CollectionUtils",
      "oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea",
      "oasis.names.tc.ciq.xsdschema.xal._2.AddressLinesType",
      "oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails$PostalServiceElements",
      "oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea$SubAdministrativeArea",
      "oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails$Address",
      "oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare",
      "oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails$PostalServiceElements$Barcode",
      "oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType",
      "oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType",
      "geo.google.datamodel.GeoUtils",
      "oasis.names.tc.ciq.xsdschema.xal._2.PostOffice",
      "oasis.names.tc.ciq.xsdschema.xal._2.Department",
      "oasis.names.tc.ciq.xsdschema.xal._2.Premise",
      "oasis.names.tc.ciq.xsdschema.xal._2.FirmType",
      "oasis.names.tc.ciq.xsdschema.xal._2.PostalCode",
      "oasis.names.tc.ciq.xsdschema.xal._2.PostBox",
      "oasis.names.tc.ciq.xsdschema.xal._2.PostalCode$PostTown",
      "oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType",
      "oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType$DependentLocalityNumber",
      "oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare$DependentThoroughfare",
      "oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType",
      "oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType",
      "oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType$PostalRouteNumber",
      "oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePreDirectionType",
      "oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType",
      "oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails$PostalServiceElements$SortingCode",
      "oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails$PostalServiceElements$EndorsementLineCode",
      "oasis.names.tc.ciq.xsdschema.xal._2.MailStopType",
      "oasis.names.tc.ciq.xsdschema.xal._2.PostOffice$PostOfficeNumber",
      "oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType$LargeMailUserIdentifier",
      "oasis.names.tc.ciq.xsdschema.xal._2.Premise$PremiseLocation",
      "org.apache.commons.lang.ObjectUtils$Null",
      "org.apache.commons.lang.ObjectUtils",
      "oasis.names.tc.ciq.xsdschema.xal._2.PostBox$PostBoxNumberPrefix",
      "oasis.names.tc.ciq.xsdschema.xal._2.PostalCode$PostTown$PostTownSuffix",
      "oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails$PostalServiceElements$AddressLongitude",
      "oasis.names.tc.ciq.xsdschema.xal._2.PostBox$PostBoxNumberSuffix",
      "oasis.names.tc.ciq.xsdschema.xal._2.PostBox$PostBoxNumber",
      "geo.google.datamodel.GeoAddressAccuracy",
      "geo.google.datamodel.GeoAltitude$GeoAltitudeMode"
    );
  }
}

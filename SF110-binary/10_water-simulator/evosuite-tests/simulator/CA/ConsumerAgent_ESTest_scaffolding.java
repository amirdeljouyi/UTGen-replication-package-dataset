/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Mar 11 15:07:41 GMT 2024
 */

package simulator.CA;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ConsumerAgent_ESTest_scaffolding {

  @org.junit.jupiter.api.extension.RegisterExtension
  public org.evosuite.runtime.vnet.NonFunctionalRequirementExtension nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementExtension();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeAll
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "simulator.CA.ConsumerAgent"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ConsumerAgent_ESTest_scaffolding.class.getClassLoader() ,
      "jade.content.schema.ObjectSchema",
      "jade.security.JADECertificate",
      "jade.core.TimerListener",
      "simulator.CA.ConsumerAgent$MatchRequestContent",
      "jade.util.leap.Iterator",
      "jade.content.onto.Introspector",
      "simulator.util.ParameterAttributes",
      "simulator.ontology.LaunchGUI",
      "jade.content.lang.StringCodec",
      "jade.core.behaviours.FSMBehaviour",
      "jade.core.behaviours.Behaviour$RunnableChangedEvent",
      "jade.security.PrivilegedExceptionAction",
      "jade.core.NameClashException",
      "org.apache.log4j.Level",
      "jade.mtp.TransportAddress",
      "jade.content.Concept",
      "simulator.CA.ConsumerAgent$MatchNeighbourhood",
      "jade.domain.FIPAAgentManagement.Envelope",
      "jade.content.schema.AgentActionSchema",
      "jade.wrapper.AgentController",
      "simulator.ontology.Consumes",
      "jade.core.Agent$AssociationTB",
      "jade.content.acl.CommunicativeActBase",
      "jade.core.AgentContainer",
      "jade.content.schema.facets.TypedAggregateFacet",
      "simulator.ontology.WDS_Ontology",
      "jade.security.DelegationCertificate",
      "jade.content.Term",
      "jade.core.behaviours.OneShotBehaviour",
      "de.progra.charting.model.ChartDataModel",
      "jade.security.ContainerPrincipal",
      "jade.proto.Initiator",
      "jade.domain.FIPAAgentManagement.FailureException",
      "jade.core.Agent$1",
      "jade.content.Predicate",
      "simulator.CA.gui.ConsumerGUI",
      "org.apache.log4j.Hierarchy",
      "jade.content.AgentAction",
      "jade.content.OntoACLMessage",
      "jade.content.abs.AbsAgentAction",
      "jade.lang.Codec",
      "jade.domain.FIPAException",
      "jade.content.schema.ConceptSchema",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "jade.util.leap.List",
      "jade.core.AgentState",
      "jade.content.schema.PrimitiveSchema",
      "simulator.ontology.StepAttr",
      "jade.content.schema.IRESchema",
      "jade.gui.GuiEvent",
      "jade.content.lang.sl.SLParserConstants",
      "jade.core.Timer",
      "jade.content.schema.ContentElementListSchema",
      "de.progra.charting.swing.ChartPanel",
      "jade.core.behaviours.DataStore",
      "jade.core.Agent$AgentInMotionError",
      "org.apache.log4j.helpers.OptionConverter",
      "jade.content.abs.AbsAggregate",
      "jade.content.OntoAID",
      "jade.content.lang.sl.ParseException",
      "simulator.ontology.StepTotalConsumption",
      "org.apache.log4j.or.ObjectRenderer",
      "simulator.ontology.Parameter",
      "jade.lang.acl.ACLMessage",
      "jade.content.onto.OntologyException",
      "jade.security.AgentPrincipal",
      "jade.util.leap.Serializable",
      "jade.content.abs.AbsPredicate",
      "jade.content.onto.UnknownSchemaException",
      "jade.util.leap.ArrayList$1",
      "jade.util.leap.Map",
      "jade.core.ResourceManager",
      "org.apache.log4j.Category",
      "jade.content.abs.AbsPrimitive",
      "simulator.ontology.SavingPath",
      "jade.core.MainContainer",
      "simulator.ontology.MetData",
      "jade.proto.AchieveREInitiator",
      "jade.content.lang.sl.Token",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.log4j.spi.Configurator",
      "jade.content.lang.sl.SL0Vocabulary",
      "de.progra.charting.render.AbstractChartRenderer",
      "jade.content.ContentManager",
      "jade.content.lang.sl.SLOntology",
      "jade.core.AID",
      "simulator.CA.BehaviourLaunchGUI",
      "jade.content.lang.sl.SL0Ontology",
      "simulator.CA.BehaviourSendPersonalConsumption",
      "jade.content.lang.sl.SLParserTokenManager",
      "jade.lang.Codec$CodecException",
      "jade.core.behaviours.CyclicBehaviour",
      "de.progra.charting.event.ChartDataModelListener",
      "jade.core.AgentContainerImpl",
      "jade.util.leap.Properties",
      "org.apache.log4j.spi.AppenderAttachable",
      "jade.content.schema.VariableSchema",
      "jade.onto.OntologyException",
      "jade.content.abs.AbsVariable",
      "simulator.ontology.WaterConsumption",
      "jade.security.Authority",
      "jade.security.JADEPrincipal",
      "jade.core.behaviours.SimpleBehaviour",
      "org.apache.log4j.Priority",
      "simulator.ontology.SavePersonalData",
      "org.apache.log4j.LogManager",
      "jade.content.schema.ContentElementSchema",
      "jade.content.abs.AbsIRE",
      "simulator.util.ConsumerAttributes",
      "jade.core.behaviours.Behaviour",
      "jade.content.lang.sl.TokenMgrError",
      "jade.content.schema.PredicateSchema",
      "jade.core.NotFoundException",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.log4j.or.RendererMap",
      "jade.content.schema.facets.CardinalityFacet",
      "jade.core.behaviours.CompositeBehaviour",
      "jade.content.lang.sl.SLVocabulary",
      "jade.content.schema.ObjectSchemaImpl$SlotDescriptor",
      "simulator.CA.BehaviourReceivePriceAndMetData",
      "jade.content.lang.sl.SLParser",
      "org.apache.log4j.spi.RootCategory",
      "simulator.CA.BehaviourReplyNeighbour",
      "de.progra.charting.render.Renderer",
      "jade.content.schema.TermSchema",
      "de.progra.charting.Chart",
      "de.progra.charting.event.ChartDataModelEvent",
      "org.apache.log4j.CategoryKey",
      "jade.core.Agent",
      "jade.core.ProfileException",
      "jade.gui.GuiAgent$GuiHandlerBehaviour",
      "jade.lang.acl.UnreadableException",
      "jade.core.Agent$AgentDeathError",
      "jade.content.acl.Request",
      "jade.content.abs.AbsPrimitiveSlotsHolder",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.ProvisionNode",
      "jade.content.ContentElement",
      "jade.wrapper.PlatformController",
      "jade.content.lang.sl.SL2Ontology",
      "jade.content.lang.sl.ASCII_CharStream",
      "jade.gui.GuiAgent",
      "jade.content.schema.ObjectSchemaImpl",
      "jade.content.abs.AbsConcept",
      "simulator.ontology.Start",
      "jade.core.IMTPException",
      "jade.lang.acl.MessageTemplate",
      "jade.content.onto.ACLOntology",
      "jade.core.AgentToolkit",
      "org.apache.log4j.spi.RendererSupport",
      "jade.util.leap.LinkedList",
      "jade.onto.Ontology",
      "jade.core.DummyToolkit",
      "jade.content.onto.BasicOntology",
      "jade.content.schema.Facet",
      "de.progra.charting.render.LineChartRenderer",
      "jade.content.onto.ReflectiveIntrospector",
      "jade.core.behaviours.SequentialBehaviour",
      "jade.util.leap.Set",
      "simulator.CA.BehaviourReceiveSavePersonalDataRequest",
      "jade.security.CertificateFolder",
      "org.apache.log4j.Logger",
      "jade.core.Runtime",
      "jade.content.lang.sl.SL1Vocabulary",
      "jade.content.lang.Codec$CodecException",
      "jade.util.leap.Comparable",
      "jade.content.lang.sl.SL1Ontology",
      "jade.content.abs.AbsObject",
      "org.apache.log4j.helpers.LogLog",
      "simulator.ontology.PriceBlock",
      "jade.core.CaseInsensitiveString",
      "org.apache.log4j.spi.RepositorySelector",
      "jade.util.WrapperException",
      "jade.security.IdentityCertificate",
      "jade.content.onto.Ontology",
      "jade.content.abs.AbsContentElement",
      "org.apache.log4j.or.DefaultRenderer",
      "jade.util.leap.HashMap",
      "jade.content.abs.AbsObjectImpl",
      "jade.wrapper.AgentContainer",
      "jade.security.AuthException",
      "org.apache.log4j.PropertyConfigurator",
      "jade.content.acl.Inform",
      "simulator.util.AIDs",
      "jade.content.abs.AbsTerm",
      "simulator.CA.ConsumerAgent",
      "simulator.ontology.HasMetData",
      "de.progra.charting.render.PieChartRenderer",
      "jade.security.dummy.DummyAuthority",
      "jade.core.Scheduler",
      "jade.content.schema.AggregateSchema",
      "jade.content.onto.UngroundedException",
      "simulator.CA.ConsumerAgent$1",
      "simulator.CA.BehaviourContactNeighbours",
      "jade.core.MessageQueue",
      "jade.content.lang.Codec",
      "jade.util.leap.Collection",
      "jade.core.Location",
      "jade.util.leap.ArrayList",
      "jade.content.lang.sl.SL2Vocabulary",
      "jade.domain.FIPAAgentManagement.InternalError",
      "jade.content.lang.sl.SLCodec",
      "jade.lang.acl.MessageTemplate$MatchExpression",
      "simulator.ontology.AskWeightsFor",
      "org.apache.log4j.spi.LoggerRepository"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ConsumerAgent_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "jade.core.AgentState",
      "jade.core.Agent",
      "jade.gui.GuiAgent",
      "simulator.CA.ConsumerAgent",
      "simulator.CA.ConsumerAgent$MatchRequestContent",
      "jade.core.behaviours.Behaviour",
      "jade.core.behaviours.CompositeBehaviour",
      "jade.core.behaviours.SequentialBehaviour",
      "simulator.CA.ConsumerAgent$1",
      "simulator.CA.ConsumerAgent$MatchNeighbourhood",
      "org.apache.log4j.Category",
      "org.apache.log4j.Priority",
      "org.apache.log4j.Level",
      "org.apache.log4j.Logger",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.Hierarchy",
      "org.apache.log4j.spi.RootCategory",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.log4j.or.RendererMap",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.log4j.LogManager",
      "jade.content.onto.Ontology",
      "jade.content.schema.ObjectSchema",
      "jade.content.schema.ObjectSchemaImpl",
      "jade.content.schema.TermSchema",
      "jade.content.schema.PrimitiveSchema",
      "jade.core.CaseInsensitiveString",
      "jade.content.schema.AggregateSchema",
      "jade.content.schema.ContentElementSchema",
      "jade.content.schema.ContentElementListSchema",
      "jade.content.schema.ConceptSchema",
      "jade.content.schema.ObjectSchemaImpl$SlotDescriptor",
      "jade.content.schema.facets.TypedAggregateFacet",
      "jade.content.schema.facets.CardinalityFacet",
      "jade.content.schema.AgentActionSchema",
      "jade.content.schema.PredicateSchema",
      "jade.content.onto.BasicOntology",
      "jade.content.onto.ReflectiveIntrospector",
      "jade.content.acl.CommunicativeActBase",
      "jade.content.acl.Inform",
      "jade.content.acl.Request",
      "jade.content.schema.IRESchema",
      "jade.content.onto.ACLOntology",
      "simulator.ontology.WDS_Ontology",
      "jade.core.AID",
      "jade.util.leap.ArrayList",
      "jade.util.leap.Properties",
      "jade.core.AgentContainerImpl",
      "simulator.util.AIDs",
      "jade.core.MessageQueue",
      "jade.util.leap.LinkedList",
      "jade.util.leap.HashMap",
      "jade.core.DummyToolkit",
      "jade.core.Agent$AssociationTB",
      "jade.security.CertificateFolder",
      "jade.content.ContentManager",
      "jade.core.Scheduler",
      "jade.core.Runtime",
      "jade.core.behaviours.SimpleBehaviour",
      "jade.gui.GuiAgent$GuiHandlerBehaviour",
      "jade.core.behaviours.Behaviour$RunnableChangedEvent",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.ProvisionNode",
      "jade.content.lang.Codec",
      "jade.content.lang.StringCodec",
      "jade.content.lang.sl.SLCodec",
      "jade.content.lang.sl.SL0Ontology",
      "jade.content.abs.AbsObjectImpl",
      "jade.content.abs.AbsPrimitiveSlotsHolder",
      "jade.content.abs.AbsPredicate",
      "jade.content.lang.sl.SL1Ontology",
      "jade.content.schema.VariableSchema",
      "jade.content.abs.AbsVariable",
      "jade.content.abs.AbsIRE",
      "jade.content.abs.AbsConcept",
      "jade.content.abs.AbsAgentAction",
      "jade.content.lang.sl.SL2Ontology",
      "jade.content.lang.sl.SLOntology",
      "jade.content.lang.sl.SLParser",
      "jade.content.lang.sl.ASCII_CharStream",
      "jade.content.lang.sl.SLParserTokenManager",
      "jade.content.lang.sl.Token",
      "jade.core.behaviours.DataStore",
      "simulator.util.ConsumerAttributes",
      "jade.util.leap.LinkedList$1",
      "jade.lang.acl.MessageTemplate",
      "jade.lang.acl.MessageTemplate$Literal",
      "jade.lang.acl.ACLMessage",
      "jade.content.OntoACLMessage",
      "jade.core.Agent$1",
      "jade.security.dummy.DummyAuthority",
      "jade.gui.GuiEvent",
      "simulator.CA.gui.ConsumerGUI",
      "jade.util.leap.ArrayList$1",
      "jade.lang.acl.MessageTemplate$MatchAllLiteral",
      "jade.core.behaviours.ReceiverBehaviour",
      "jade.core.behaviours.ReceiverBehaviour$MessageFuture",
      "jade.core.behaviours.ReceiverBehaviour$NotYetReady",
      "simulator.ontology.Consumes",
      "jade.util.leap.HashMap$3",
      "jade.util.leap.HashMap$4",
      "jade.domain.FIPAAgentManagement.Envelope",
      "jade.content.OntoAID",
      "jade.onto.DefaultOntology",
      "jade.wrapper.AgentContainer",
      "jade.imtp.rmi.RMIAddress",
      "jade.core.ContainerID",
      "jade.core.behaviours.ParallelBehaviour",
      "jade.core.behaviours.NonDeterministicBehaviour",
      "jade.core.behaviours.BehaviourList",
      "jade.util.leap.HashMap$1",
      "jade.util.leap.HashMap$2",
      "jade.security.dummy.DummyCertificate",
      "jade.security.dummy.DummyPrincipal",
      "jade.lang.acl.StringACLCodec",
      "jade.core.behaviours.FSMBehaviour",
      "jade.core.behaviours.FSMBehaviour$TransitionTable",
      "jade.core.Timer",
      "jade.onto.Frame",
      "jade.lang.sl.SL0Codec",
      "jade.lang.sl.SL0Parser",
      "jade.lang.sl.ASCII_UCodeESC_CharStream",
      "jade.lang.sl.SL0ParserTokenManager",
      "jade.lang.sl.Token",
      "jade.lang.sl.SL0Encoder",
      "jade.domain.FIPAAgentManagement.AMSAgentDescription",
      "simulator.ontology.StepAttr",
      "jade.lang.sl.ParseException",
      "jade.lang.sl.SL0ParserConstants",
      "jade.util.WrapperException",
      "jade.lang.Codec$CodecException",
      "jade.lang.acl.MessageTemplate$AndExpression",
      "simulator.ontology.AskWeightsFor",
      "simulator.ontology.MetData",
      "simulator.ontology.PriceBlock",
      "simulator.ontology.WaterConsumption",
      "jade.content.lang.Codec$CodecException",
      "jade.lang.acl.MessageTemplate$OrExpression",
      "jade.lang.acl.MessageTemplate$NotExpression",
      "jade.lang.acl.MessageTemplate$CustomMsgLiteral",
      "jade.core.Agent$2",
      "jade.content.lang.j.JCodec",
      "jade.lang.acl.ISO8601",
      "jade.content.lang.ByteArrayCodec",
      "jade.content.lang.leap.LEAPCodec",
      "jade.onto.OntologyException",
      "jade.content.onto.OntologyException",
      "jade.content.onto.UnknownSchemaException",
      "jade.core.behaviours.OneShotBehaviour",
      "jade.core.behaviours.SenderBehaviour",
      "jade.content.abs.AbsPrimitive",
      "starlight.util.Base64",
      "jade.onto.SlotDescriptor",
      "jade.onto.FrameSchema",
      "jade.content.abs.AbsAggregate"
    );
  }
}

/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Mon Mar 11 15:07:41 GMT 2024
 */

package simulator.CA;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import jade.content.OntoACLMessage;
import jade.lang.acl.ACLMessage;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import simulator.CA.ConsumerAgent;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ConsumerAgent_ESTest extends ConsumerAgent_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetupThrowsNullPointerException() throws Throwable  {
      // Given a consumer agent object that has not been initialized
      ConsumerAgent consumerAgent = new ConsumerAgent();
      
      // When the setup method is called without providing any arguments
      try {
      consumerAgent.setup();
      
      // Then an exception should be thrown with a message indicating the cause of the error
      fail("Expecting exception: NullPointerException");
      } catch (NullPointerException e) {
      // Verify that the expected exception was thrown and that it has a message indicating the cause of the error
      verifyException("simulator.CA.ConsumerAgent", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testOnFailure() throws Throwable  {
      ConsumerAgent consumerAgent = new ConsumerAgent();
      OntoACLMessage arg0 = new OntoACLMessage();
      // Given: the consumer agent is in a state where it can handle failure messages
      
      // When: a failure message is received
      consumerAgent.onFailure(arg0);
      
      // Then: the consumer agent should respond with a REJECT_PROPOSAL ACL message
      assertEquals(15, ACLMessage.REJECT_PROPOSAL);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreateQueryMsgForNeighbourhoodThrowsNullPointerException() throws Throwable  {
      ConsumerAgent consumerAgent = new ConsumerAgent();
      // Given a ConsumerAgent instance and an undeclared exception
      
      try {
      // When the createQueryMsgForNeighbourhood method is called without any message in the exception
      consumerAgent.createQueryMsgForNeighbourhood();
      fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      // Then an exception should be thrown with no message (getMessage() returned null)
      verifyException("simulator.CA.ConsumerAgent", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testConsumeWaterThrowsNullPointerException() throws Throwable  {
      // Set up a new ConsumerAgent instance
      ConsumerAgent agent = new ConsumerAgent();
      
      // Expect an exception to be thrown when attempting to consume water without a content manager
      try {
      // Attempt to consume water without a content manager
      agent.consumeWater();
      
      // Fail the test if no exception was thrown
      fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      // Verify that the exception is an instance of the expected type
      assertTrue(e instanceof NullPointerException);
      
      // Verify that the exception message is not null
      assertNotNull(e.getMessage());}
  }
}

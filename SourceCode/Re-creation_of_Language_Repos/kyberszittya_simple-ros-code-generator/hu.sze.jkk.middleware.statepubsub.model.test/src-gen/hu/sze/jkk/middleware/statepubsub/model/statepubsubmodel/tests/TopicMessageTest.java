/**
 */
package hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.tests;

import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelFactory;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.TopicMessage;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Topic Message</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TopicMessageTest extends AbstractMsgTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TopicMessageTest.class);
	}

	/**
	 * Constructs a new Topic Message test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopicMessageTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Topic Message test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TopicMessage getFixture() {
		return (TopicMessage) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StatepubsubmodelFactory.eINSTANCE.createTopicMessage());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //TopicMessageTest

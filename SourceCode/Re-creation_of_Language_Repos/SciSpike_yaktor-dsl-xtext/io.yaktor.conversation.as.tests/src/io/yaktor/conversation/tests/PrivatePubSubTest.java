/**
 */
package io.yaktor.conversation.tests;

import io.yaktor.conversation.ConversationFactory;
import io.yaktor.conversation.PrivatePubSub;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Private Pub Sub</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PrivatePubSubTest extends PublishableByMeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PrivatePubSubTest.class);
	}

	/**
	 * Constructs a new Private Pub Sub test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivatePubSubTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Private Pub Sub test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PrivatePubSub getFixture() {
		return (PrivatePubSub)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ConversationFactory.eINSTANCE.createPrivatePubSub());
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

} //PrivatePubSubTest

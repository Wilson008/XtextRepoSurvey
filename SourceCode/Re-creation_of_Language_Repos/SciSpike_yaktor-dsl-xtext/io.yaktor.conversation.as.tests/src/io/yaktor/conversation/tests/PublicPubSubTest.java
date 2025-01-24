/**
 */
package io.yaktor.conversation.tests;

import io.yaktor.conversation.ConversationFactory;
import io.yaktor.conversation.PublicPubSub;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Public Pub Sub</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PublicPubSubTest extends PubliclyPublishableTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PublicPubSubTest.class);
	}

	/**
	 * Constructs a new Public Pub Sub test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicPubSubTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Public Pub Sub test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PublicPubSub getFixture() {
		return (PublicPubSub)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ConversationFactory.eINSTANCE.createPublicPubSub());
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

} //PublicPubSubTest

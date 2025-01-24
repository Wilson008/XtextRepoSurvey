/**
 */
package io.yaktor.conversation.tests;

import io.yaktor.conversation.ConversationFactory;
import io.yaktor.conversation.PubliclyPublishable;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Publicly Publishable</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PubliclyPublishableTest extends SubscribableByMeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PubliclyPublishableTest.class);
	}

	/**
	 * Constructs a new Publicly Publishable test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PubliclyPublishableTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Publicly Publishable test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PubliclyPublishable getFixture() {
		return (PubliclyPublishable)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ConversationFactory.eINSTANCE.createPubliclyPublishable());
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

} //PubliclyPublishableTest

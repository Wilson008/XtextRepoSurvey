/**
 */
package io.yaktor.conversation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.yaktor.conversation.Join#getJoins <em>Joins</em>}</li>
 * </ul>
 *
 * @see io.yaktor.conversation.ConversationPackage#getJoin()
 * @model
 * @generated
 */
public interface Join extends State {
	/**
	 * Returns the value of the '<em><b>Joins</b></em>' containment reference list.
	 * The list contents are of type {@link io.yaktor.conversation.Junction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Joins</em>' containment reference list.
	 * @see io.yaktor.conversation.ConversationPackage#getJoin_Joins()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Junction> getJoins();

} // Join

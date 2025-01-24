/**
 */
package megal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link megal.Selection#getSelect <em>Select</em>}</li>
 *   <li>{@link megal.Selection#getQuery <em>Query</em>}</li>
 * </ul>
 *
 * @see megal.MegalPackage#getSelection()
 * @model
 * @generated
 */
public interface Selection extends EObject {
	/**
	 * Returns the value of the '<em><b>Select</b></em>' containment reference list.
	 * The list contents are of type {@link megal.QueryEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select</em>' containment reference list.
	 * @see megal.MegalPackage#getSelection_Select()
	 * @model containment="true"
	 * @generated
	 */
	EList<QueryEntry> getSelect();

	/**
	 * Returns the value of the '<em><b>Query</b></em>' containment reference list.
	 * The list contents are of type {@link megal.QueryStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' containment reference list.
	 * @see megal.MegalPackage#getSelection_Query()
	 * @model containment="true"
	 * @generated
	 */
	EList<QueryStatement> getQuery();

} // Selection

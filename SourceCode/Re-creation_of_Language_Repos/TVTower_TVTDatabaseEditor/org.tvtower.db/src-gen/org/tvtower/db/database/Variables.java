/**
 * generated by Xtext 2.35.0
 */
package org.tvtower.db.database;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variables</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tvtower.db.database.Variables#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see org.tvtower.db.database.DatabasePackage#getVariables()
 * @model
 * @generated
 */
public interface Variables extends EObject
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
   * The list contents are of type {@link org.tvtower.db.database.VariableDef}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference list.
   * @see org.tvtower.db.database.DatabasePackage#getVariables_Variable()
   * @model containment="true"
   * @generated
   */
  EList<VariableDef> getVariable();

} // Variables

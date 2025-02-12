/**
 * generated by Xtext 2.35.0
 */
package org.tvtower.db.database;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person Localization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tvtower.db.database.PersonLocalization#getPersons <em>Persons</em>}</li>
 *   <li>{@link org.tvtower.db.database.PersonLocalization#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @see org.tvtower.db.database.DatabasePackage#getPersonLocalization()
 * @model
 * @generated
 */
public interface PersonLocalization extends EObject
{
  /**
   * Returns the value of the '<em><b>Persons</b></em>' containment reference list.
   * The list contents are of type {@link org.tvtower.db.database.PersonLocale}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Persons</em>' containment reference list.
   * @see org.tvtower.db.database.DatabasePackage#getPersonLocalization_Persons()
   * @model containment="true"
   * @generated
   */
  EList<PersonLocale> getPersons();

  /**
   * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
   * The list contents are of type {@link org.tvtower.db.database.RoleLocale}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Roles</em>' containment reference list.
   * @see org.tvtower.db.database.DatabasePackage#getPersonLocalization_Roles()
   * @model containment="true"
   * @generated
   */
  EList<RoleLocale> getRoles();

} // PersonLocalization

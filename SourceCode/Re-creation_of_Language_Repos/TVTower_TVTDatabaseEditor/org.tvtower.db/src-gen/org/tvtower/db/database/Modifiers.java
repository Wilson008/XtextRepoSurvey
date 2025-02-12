/**
 * generated by Xtext 2.35.0
 */
package org.tvtower.db.database;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modifiers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tvtower.db.database.Modifiers#getModifier <em>Modifier</em>}</li>
 * </ul>
 *
 * @see org.tvtower.db.database.DatabasePackage#getModifiers()
 * @model
 * @generated
 */
public interface Modifiers extends TemplateProgrammeModifiers
{
  /**
   * Returns the value of the '<em><b>Modifier</b></em>' containment reference list.
   * The list contents are of type {@link org.tvtower.db.database.Modifier}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modifier</em>' containment reference list.
   * @see org.tvtower.db.database.DatabasePackage#getModifiers_Modifier()
   * @model containment="true"
   * @generated
   */
  EList<Modifier> getModifier();

} // Modifiers

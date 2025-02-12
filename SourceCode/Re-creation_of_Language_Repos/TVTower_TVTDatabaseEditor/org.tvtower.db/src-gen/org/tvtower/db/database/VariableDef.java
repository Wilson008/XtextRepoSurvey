/**
 * generated by Xtext 2.35.0
 */
package org.tvtower.db.database;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tvtower.db.database.VariableDef#getVar <em>Var</em>}</li>
 * </ul>
 *
 * @see org.tvtower.db.database.DatabasePackage#getVariableDef()
 * @model
 * @generated
 */
public interface VariableDef extends ContainsLanguageStrings
{
  /**
   * Returns the value of the '<em><b>Var</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' attribute.
   * @see #setVar(String)
   * @see org.tvtower.db.database.DatabasePackage#getVariableDef_Var()
   * @model
   * @generated
   */
  String getVar();

  /**
   * Sets the value of the '{@link org.tvtower.db.database.VariableDef#getVar <em>Var</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' attribute.
   * @see #getVar()
   * @generated
   */
  void setVar(String value);

} // VariableDef

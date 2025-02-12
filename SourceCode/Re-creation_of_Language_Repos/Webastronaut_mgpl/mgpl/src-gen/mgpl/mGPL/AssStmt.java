/**
 * generated by Xtext 2.35.0
 */
package mgpl.mGPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ass Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mgpl.mGPL.AssStmt#getVariable <em>Variable</em>}</li>
 *   <li>{@link mgpl.mGPL.AssStmt#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see mgpl.mGPL.MGPLPackage#getAssStmt()
 * @model
 * @generated
 */
public interface AssStmt extends Stmt
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference.
   * @see #setVariable(Var)
   * @see mgpl.mGPL.MGPLPackage#getAssStmt_Variable()
   * @model containment="true"
   * @generated
   */
  Var getVariable();

  /**
   * Sets the value of the '{@link mgpl.mGPL.AssStmt#getVariable <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' containment reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(Var value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expr)
   * @see mgpl.mGPL.MGPLPackage#getAssStmt_Expression()
   * @model containment="true"
   * @generated
   */
  Expr getExpression();

  /**
   * Sets the value of the '{@link mgpl.mGPL.AssStmt#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expr value);

} // AssStmt

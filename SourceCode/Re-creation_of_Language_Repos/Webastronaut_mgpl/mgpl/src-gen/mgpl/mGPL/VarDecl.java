/**
 * generated by Xtext 2.35.0
 */
package mgpl.mGPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mgpl.mGPL.VarDecl#getInit <em>Init</em>}</li>
 * </ul>
 *
 * @see mgpl.mGPL.MGPLPackage#getVarDecl()
 * @model
 * @generated
 */
public interface VarDecl extends Decl
{
  /**
   * Returns the value of the '<em><b>Init</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Init</em>' containment reference.
   * @see #setInit(Init)
   * @see mgpl.mGPL.MGPLPackage#getVarDecl_Init()
   * @model containment="true"
   * @generated
   */
  Init getInit();

  /**
   * Sets the value of the '{@link mgpl.mGPL.VarDecl#getInit <em>Init</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Init</em>' containment reference.
   * @see #getInit()
   * @generated
   */
  void setInit(Init value);

} // VarDecl

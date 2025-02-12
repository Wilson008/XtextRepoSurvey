/**
 * generated by Xtext 2.35.0
 */
package jpaqldsl.jPAQLDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Primary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jpaqldsl.jPAQLDsl.BooleanPrimary#getPathExpression <em>Path Expression</em>}</li>
 *   <li>{@link jpaqldsl.jPAQLDsl.BooleanPrimary#getBooleanLiteral <em>Boolean Literal</em>}</li>
 *   <li>{@link jpaqldsl.jPAQLDsl.BooleanPrimary#getInputParameter <em>Input Parameter</em>}</li>
 * </ul>
 *
 * @see jpaqldsl.jPAQLDsl.JPAQLDslPackage#getBooleanPrimary()
 * @model
 * @generated
 */
public interface BooleanPrimary extends EObject
{
  /**
   * Returns the value of the '<em><b>Path Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path Expression</em>' containment reference.
   * @see #setPathExpression(JPAPathExpression)
   * @see jpaqldsl.jPAQLDsl.JPAQLDslPackage#getBooleanPrimary_PathExpression()
   * @model containment="true"
   * @generated
   */
  JPAPathExpression getPathExpression();

  /**
   * Sets the value of the '{@link jpaqldsl.jPAQLDsl.BooleanPrimary#getPathExpression <em>Path Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path Expression</em>' containment reference.
   * @see #getPathExpression()
   * @generated
   */
  void setPathExpression(JPAPathExpression value);

  /**
   * Returns the value of the '<em><b>Boolean Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Boolean Literal</em>' attribute.
   * @see #setBooleanLiteral(String)
   * @see jpaqldsl.jPAQLDsl.JPAQLDslPackage#getBooleanPrimary_BooleanLiteral()
   * @model
   * @generated
   */
  String getBooleanLiteral();

  /**
   * Sets the value of the '{@link jpaqldsl.jPAQLDsl.BooleanPrimary#getBooleanLiteral <em>Boolean Literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Boolean Literal</em>' attribute.
   * @see #getBooleanLiteral()
   * @generated
   */
  void setBooleanLiteral(String value);

  /**
   * Returns the value of the '<em><b>Input Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input Parameter</em>' containment reference.
   * @see #setInputParameter(InputParameter)
   * @see jpaqldsl.jPAQLDsl.JPAQLDslPackage#getBooleanPrimary_InputParameter()
   * @model containment="true"
   * @generated
   */
  InputParameter getInputParameter();

  /**
   * Sets the value of the '{@link jpaqldsl.jPAQLDsl.BooleanPrimary#getInputParameter <em>Input Parameter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input Parameter</em>' containment reference.
   * @see #getInputParameter()
   * @generated
   */
  void setInputParameter(InputParameter value);

} // BooleanPrimary

/**
 * generated by Xtext 2.35.0
 */
package jpaqldsl.jPAQLDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exists Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jpaqldsl.jPAQLDsl.ExistsExpression#getSubQuery <em>Sub Query</em>}</li>
 * </ul>
 *
 * @see jpaqldsl.jPAQLDsl.JPAQLDslPackage#getExistsExpression()
 * @model
 * @generated
 */
public interface ExistsExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Sub Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Query</em>' containment reference.
   * @see #setSubQuery(SubQuery)
   * @see jpaqldsl.jPAQLDsl.JPAQLDslPackage#getExistsExpression_SubQuery()
   * @model containment="true"
   * @generated
   */
  SubQuery getSubQuery();

  /**
   * Sets the value of the '{@link jpaqldsl.jPAQLDsl.ExistsExpression#getSubQuery <em>Sub Query</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sub Query</em>' containment reference.
   * @see #getSubQuery()
   * @generated
   */
  void setSubQuery(SubQuery value);

} // ExistsExpression

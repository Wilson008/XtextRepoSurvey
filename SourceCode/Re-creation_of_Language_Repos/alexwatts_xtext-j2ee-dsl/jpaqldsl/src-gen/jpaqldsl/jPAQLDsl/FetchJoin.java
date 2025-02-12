/**
 * generated by Xtext 2.35.0
 */
package jpaqldsl.jPAQLDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fetch Join</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jpaqldsl.jPAQLDsl.FetchJoin#getJoinSpec <em>Join Spec</em>}</li>
 *   <li>{@link jpaqldsl.jPAQLDsl.FetchJoin#getJoinAssociationPathExpression <em>Join Association Path Expression</em>}</li>
 *   <li>{@link jpaqldsl.jPAQLDsl.FetchJoin#getIdentificationVariable <em>Identification Variable</em>}</li>
 * </ul>
 *
 * @see jpaqldsl.jPAQLDsl.JPAQLDslPackage#getFetchJoin()
 * @model
 * @generated
 */
public interface FetchJoin extends EObject
{
  /**
   * Returns the value of the '<em><b>Join Spec</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Join Spec</em>' attribute.
   * @see #setJoinSpec(String)
   * @see jpaqldsl.jPAQLDsl.JPAQLDslPackage#getFetchJoin_JoinSpec()
   * @model
   * @generated
   */
  String getJoinSpec();

  /**
   * Sets the value of the '{@link jpaqldsl.jPAQLDsl.FetchJoin#getJoinSpec <em>Join Spec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Join Spec</em>' attribute.
   * @see #getJoinSpec()
   * @generated
   */
  void setJoinSpec(String value);

  /**
   * Returns the value of the '<em><b>Join Association Path Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Join Association Path Expression</em>' containment reference.
   * @see #setJoinAssociationPathExpression(JPAPathExpression)
   * @see jpaqldsl.jPAQLDsl.JPAQLDslPackage#getFetchJoin_JoinAssociationPathExpression()
   * @model containment="true"
   * @generated
   */
  JPAPathExpression getJoinAssociationPathExpression();

  /**
   * Sets the value of the '{@link jpaqldsl.jPAQLDsl.FetchJoin#getJoinAssociationPathExpression <em>Join Association Path Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Join Association Path Expression</em>' containment reference.
   * @see #getJoinAssociationPathExpression()
   * @generated
   */
  void setJoinAssociationPathExpression(JPAPathExpression value);

  /**
   * Returns the value of the '<em><b>Identification Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identification Variable</em>' containment reference.
   * @see #setIdentificationVariable(IdentificationVariable)
   * @see jpaqldsl.jPAQLDsl.JPAQLDslPackage#getFetchJoin_IdentificationVariable()
   * @model containment="true"
   * @generated
   */
  IdentificationVariable getIdentificationVariable();

  /**
   * Sets the value of the '{@link jpaqldsl.jPAQLDsl.FetchJoin#getIdentificationVariable <em>Identification Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identification Variable</em>' containment reference.
   * @see #getIdentificationVariable()
   * @generated
   */
  void setIdentificationVariable(IdentificationVariable value);

} // FetchJoin

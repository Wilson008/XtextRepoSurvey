/**
 * generated by Xtext 2.35.0
 */
package jpaqldsl.jPAQLDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jpaqldsl.jPAQLDsl.SelectStatement#getSelectClause <em>Select Clause</em>}</li>
 *   <li>{@link jpaqldsl.jPAQLDsl.SelectStatement#getFromClause <em>From Clause</em>}</li>
 *   <li>{@link jpaqldsl.jPAQLDsl.SelectStatement#getWhereClause <em>Where Clause</em>}</li>
 * </ul>
 *
 * @see jpaqldsl.jPAQLDsl.JPAQLDslPackage#getSelectStatement()
 * @model
 * @generated
 */
public interface SelectStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>Select Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Select Clause</em>' containment reference.
   * @see #setSelectClause(SelectClause)
   * @see jpaqldsl.jPAQLDsl.JPAQLDslPackage#getSelectStatement_SelectClause()
   * @model containment="true"
   * @generated
   */
  SelectClause getSelectClause();

  /**
   * Sets the value of the '{@link jpaqldsl.jPAQLDsl.SelectStatement#getSelectClause <em>Select Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Select Clause</em>' containment reference.
   * @see #getSelectClause()
   * @generated
   */
  void setSelectClause(SelectClause value);

  /**
   * Returns the value of the '<em><b>From Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>From Clause</em>' containment reference.
   * @see #setFromClause(FromClause)
   * @see jpaqldsl.jPAQLDsl.JPAQLDslPackage#getSelectStatement_FromClause()
   * @model containment="true"
   * @generated
   */
  FromClause getFromClause();

  /**
   * Sets the value of the '{@link jpaqldsl.jPAQLDsl.SelectStatement#getFromClause <em>From Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From Clause</em>' containment reference.
   * @see #getFromClause()
   * @generated
   */
  void setFromClause(FromClause value);

  /**
   * Returns the value of the '<em><b>Where Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Where Clause</em>' containment reference.
   * @see #setWhereClause(WhereClause)
   * @see jpaqldsl.jPAQLDsl.JPAQLDslPackage#getSelectStatement_WhereClause()
   * @model containment="true"
   * @generated
   */
  WhereClause getWhereClause();

  /**
   * Sets the value of the '{@link jpaqldsl.jPAQLDsl.SelectStatement#getWhereClause <em>Where Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Where Clause</em>' containment reference.
   * @see #getWhereClause()
   * @generated
   */
  void setWhereClause(WhereClause value);

} // SelectStatement

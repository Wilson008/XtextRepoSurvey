/**
 * generated by Xtext 2.35.0
 */
package jpaqldsl.jPAQLDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Time Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jpaqldsl.jPAQLDsl.DateTimeExpression#getDateTimePrimary <em>Date Time Primary</em>}</li>
 *   <li>{@link jpaqldsl.jPAQLDsl.DateTimeExpression#getSubQuery <em>Sub Query</em>}</li>
 * </ul>
 *
 * @see jpaqldsl.jPAQLDsl.JPAQLDslPackage#getDateTimeExpression()
 * @model
 * @generated
 */
public interface DateTimeExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Date Time Primary</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Date Time Primary</em>' containment reference.
   * @see #setDateTimePrimary(DateTimePrimary)
   * @see jpaqldsl.jPAQLDsl.JPAQLDslPackage#getDateTimeExpression_DateTimePrimary()
   * @model containment="true"
   * @generated
   */
  DateTimePrimary getDateTimePrimary();

  /**
   * Sets the value of the '{@link jpaqldsl.jPAQLDsl.DateTimeExpression#getDateTimePrimary <em>Date Time Primary</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Date Time Primary</em>' containment reference.
   * @see #getDateTimePrimary()
   * @generated
   */
  void setDateTimePrimary(DateTimePrimary value);

  /**
   * Returns the value of the '<em><b>Sub Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Query</em>' containment reference.
   * @see #setSubQuery(SubQuery)
   * @see jpaqldsl.jPAQLDsl.JPAQLDslPackage#getDateTimeExpression_SubQuery()
   * @model containment="true"
   * @generated
   */
  SubQuery getSubQuery();

  /**
   * Sets the value of the '{@link jpaqldsl.jPAQLDsl.DateTimeExpression#getSubQuery <em>Sub Query</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sub Query</em>' containment reference.
   * @see #getSubQuery()
   * @generated
   */
  void setSubQuery(SubQuery value);

} // DateTimeExpression

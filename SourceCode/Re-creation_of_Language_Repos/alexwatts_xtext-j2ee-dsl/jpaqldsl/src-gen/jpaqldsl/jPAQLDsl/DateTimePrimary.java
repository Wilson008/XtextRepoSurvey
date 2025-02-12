/**
 * generated by Xtext 2.35.0
 */
package jpaqldsl.jPAQLDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Time Primary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jpaqldsl.jPAQLDsl.DateTimePrimary#getPathExpression <em>Path Expression</em>}</li>
 *   <li>{@link jpaqldsl.jPAQLDsl.DateTimePrimary#getInputParameter <em>Input Parameter</em>}</li>
 *   <li>{@link jpaqldsl.jPAQLDsl.DateTimePrimary#getFunctionsReturningDateTime <em>Functions Returning Date Time</em>}</li>
 *   <li>{@link jpaqldsl.jPAQLDsl.DateTimePrimary#getAggregateExpression <em>Aggregate Expression</em>}</li>
 * </ul>
 *
 * @see jpaqldsl.jPAQLDsl.JPAQLDslPackage#getDateTimePrimary()
 * @model
 * @generated
 */
public interface DateTimePrimary extends EObject
{
  /**
   * Returns the value of the '<em><b>Path Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path Expression</em>' containment reference.
   * @see #setPathExpression(JPAPathExpression)
   * @see jpaqldsl.jPAQLDsl.JPAQLDslPackage#getDateTimePrimary_PathExpression()
   * @model containment="true"
   * @generated
   */
  JPAPathExpression getPathExpression();

  /**
   * Sets the value of the '{@link jpaqldsl.jPAQLDsl.DateTimePrimary#getPathExpression <em>Path Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path Expression</em>' containment reference.
   * @see #getPathExpression()
   * @generated
   */
  void setPathExpression(JPAPathExpression value);

  /**
   * Returns the value of the '<em><b>Input Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input Parameter</em>' containment reference.
   * @see #setInputParameter(InputParameter)
   * @see jpaqldsl.jPAQLDsl.JPAQLDslPackage#getDateTimePrimary_InputParameter()
   * @model containment="true"
   * @generated
   */
  InputParameter getInputParameter();

  /**
   * Sets the value of the '{@link jpaqldsl.jPAQLDsl.DateTimePrimary#getInputParameter <em>Input Parameter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input Parameter</em>' containment reference.
   * @see #getInputParameter()
   * @generated
   */
  void setInputParameter(InputParameter value);

  /**
   * Returns the value of the '<em><b>Functions Returning Date Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Functions Returning Date Time</em>' attribute.
   * @see #setFunctionsReturningDateTime(String)
   * @see jpaqldsl.jPAQLDsl.JPAQLDslPackage#getDateTimePrimary_FunctionsReturningDateTime()
   * @model
   * @generated
   */
  String getFunctionsReturningDateTime();

  /**
   * Sets the value of the '{@link jpaqldsl.jPAQLDsl.DateTimePrimary#getFunctionsReturningDateTime <em>Functions Returning Date Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Functions Returning Date Time</em>' attribute.
   * @see #getFunctionsReturningDateTime()
   * @generated
   */
  void setFunctionsReturningDateTime(String value);

  /**
   * Returns the value of the '<em><b>Aggregate Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aggregate Expression</em>' containment reference.
   * @see #setAggregateExpression(AggregateExpression)
   * @see jpaqldsl.jPAQLDsl.JPAQLDslPackage#getDateTimePrimary_AggregateExpression()
   * @model containment="true"
   * @generated
   */
  AggregateExpression getAggregateExpression();

  /**
   * Sets the value of the '{@link jpaqldsl.jPAQLDsl.DateTimePrimary#getAggregateExpression <em>Aggregate Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aggregate Expression</em>' containment reference.
   * @see #getAggregateExpression()
   * @generated
   */
  void setAggregateExpression(AggregateExpression value);

} // DateTimePrimary

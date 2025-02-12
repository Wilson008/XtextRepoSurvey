/**
 * generated by Xtext 2.35.0
 */
package de.sos.etj.eTJ;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Flag Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.LogicalFlagExpression#getScenario <em>Scenario</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.LogicalFlagExpression#getColumId <em>Colum Id</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getLogicalFlagExpression()
 * @model
 * @generated
 */
public interface LogicalFlagExpression extends LogicalExpression
{
  /**
   * Returns the value of the '<em><b>Scenario</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scenario</em>' reference.
   * @see #setScenario(Scenario)
   * @see de.sos.etj.eTJ.ETJPackage#getLogicalFlagExpression_Scenario()
   * @model
   * @generated
   */
  Scenario getScenario();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.LogicalFlagExpression#getScenario <em>Scenario</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scenario</em>' reference.
   * @see #getScenario()
   * @generated
   */
  void setScenario(Scenario value);

  /**
   * Returns the value of the '<em><b>Colum Id</b></em>' attribute.
   * The literals are from the enumeration {@link de.sos.etj.eTJ.ColumnId}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Colum Id</em>' attribute.
   * @see de.sos.etj.eTJ.ColumnId
   * @see #setColumId(ColumnId)
   * @see de.sos.etj.eTJ.ETJPackage#getLogicalFlagExpression_ColumId()
   * @model
   * @generated
   */
  ColumnId getColumId();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.LogicalFlagExpression#getColumId <em>Colum Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Colum Id</em>' attribute.
   * @see de.sos.etj.eTJ.ColumnId
   * @see #getColumId()
   * @generated
   */
  void setColumId(ColumnId value);

} // LogicalFlagExpression

/**
 * generated by Xtext 2.35.0
 */
package de.sos.etj.eTJ;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Date Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.LogicalDateLiteral#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getLogicalDateLiteral()
 * @model
 * @generated
 */
public interface LogicalDateLiteral extends LogicalExpression
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(ISODATE)
   * @see de.sos.etj.eTJ.ETJPackage#getLogicalDateLiteral_Value()
   * @model containment="true"
   * @generated
   */
  ISODATE getValue();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.LogicalDateLiteral#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(ISODATE value);

} // LogicalDateLiteral

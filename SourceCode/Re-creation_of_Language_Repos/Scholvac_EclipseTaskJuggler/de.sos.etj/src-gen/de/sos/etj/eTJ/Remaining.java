/**
 * generated by Xtext 2.35.0
 */
package de.sos.etj.eTJ;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remaining</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.Remaining#getRemaining <em>Remaining</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getRemaining()
 * @model
 * @generated
 */
public interface Remaining extends NewTaskAttribute, TaskTimesheetAttribute
{
  /**
   * Returns the value of the '<em><b>Remaining</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Remaining</em>' containment reference.
   * @see #setRemaining(DurationQuantity)
   * @see de.sos.etj.eTJ.ETJPackage#getRemaining_Remaining()
   * @model containment="true"
   * @generated
   */
  DurationQuantity getRemaining();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.Remaining#getRemaining <em>Remaining</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Remaining</em>' containment reference.
   * @see #getRemaining()
   * @generated
   */
  void setRemaining(DurationQuantity value);

} // Remaining

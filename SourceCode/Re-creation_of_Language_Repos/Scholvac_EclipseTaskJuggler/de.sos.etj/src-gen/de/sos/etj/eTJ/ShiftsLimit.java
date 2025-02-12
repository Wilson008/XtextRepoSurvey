/**
 * generated by Xtext 2.35.0
 */
package de.sos.etj.eTJ;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shifts Limit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.ShiftsLimit#getShift <em>Shift</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.ShiftsLimit#getLimit <em>Limit</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getShiftsLimit()
 * @model
 * @generated
 */
public interface ShiftsLimit extends EObject
{
  /**
   * Returns the value of the '<em><b>Shift</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Shift</em>' reference.
   * @see #setShift(Shift)
   * @see de.sos.etj.eTJ.ETJPackage#getShiftsLimit_Shift()
   * @model
   * @generated
   */
  Shift getShift();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.ShiftsLimit#getShift <em>Shift</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Shift</em>' reference.
   * @see #getShift()
   * @generated
   */
  void setShift(Shift value);

  /**
   * Returns the value of the '<em><b>Limit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Limit</em>' containment reference.
   * @see #setLimit(Interval2)
   * @see de.sos.etj.eTJ.ETJPackage#getShiftsLimit_Limit()
   * @model containment="true"
   * @generated
   */
  Interval2 getLimit();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.ShiftsLimit#getLimit <em>Limit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Limit</em>' containment reference.
   * @see #getLimit()
   * @generated
   */
  void setLimit(Interval2 value);

} // ShiftsLimit

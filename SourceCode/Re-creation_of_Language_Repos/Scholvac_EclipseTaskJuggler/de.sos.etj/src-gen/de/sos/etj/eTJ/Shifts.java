/**
 * generated by Xtext 2.35.0
 */
package de.sos.etj.eTJ;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shifts</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.Shifts#getLimits <em>Limits</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getShifts()
 * @model
 * @generated
 */
public interface Shifts extends ShiftsResource, ShiftsTask
{
  /**
   * Returns the value of the '<em><b>Limits</b></em>' containment reference list.
   * The list contents are of type {@link de.sos.etj.eTJ.ShiftsLimit}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Limits</em>' containment reference list.
   * @see de.sos.etj.eTJ.ETJPackage#getShifts_Limits()
   * @model containment="true"
   * @generated
   */
  EList<ShiftsLimit> getLimits();

} // Shifts

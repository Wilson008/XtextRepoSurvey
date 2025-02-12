/**
 * generated by Xtext 2.35.0
 */
package de.sos.etj.eTJ;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.End#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getEnd()
 * @model
 * @generated
 */
public interface End extends ReportAttribute, IcalReportAttribute, ExportAttribute, NewTaskAttribute, NikuReportAttribute, StatusSheetReportAttribute, TaskTimesheetAttribute, TimesheetReportAttribute, ColumnAttribute
{
  /**
   * Returns the value of the '<em><b>End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>End</em>' containment reference.
   * @see #setEnd(ISODATE)
   * @see de.sos.etj.eTJ.ETJPackage#getEnd_End()
   * @model containment="true"
   * @generated
   */
  ISODATE getEnd();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.End#getEnd <em>End</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End</em>' containment reference.
   * @see #getEnd()
   * @generated
   */
  void setEnd(ISODATE value);

} // End

/**
 * generated by Xtext 2.35.0
 */
package de.sos.etj.eTJ;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Max Start</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.MaxStart#getMaxStart <em>Max Start</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getMaxStart()
 * @model
 * @generated
 */
public interface MaxStart extends EObject
{
  /**
   * Returns the value of the '<em><b>Max Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max Start</em>' containment reference.
   * @see #setMaxStart(ISODATE)
   * @see de.sos.etj.eTJ.ETJPackage#getMaxStart_MaxStart()
   * @model containment="true"
   * @generated
   */
  ISODATE getMaxStart();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.MaxStart#getMaxStart <em>Max Start</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max Start</em>' containment reference.
   * @see #getMaxStart()
   * @generated
   */
  void setMaxStart(ISODATE value);

} // MaxStart

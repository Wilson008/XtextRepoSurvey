/**
 * generated by Xtext 2.35.0
 */
package de.sos.etj.eTJ;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alert</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.Alert#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getAlert()
 * @model
 * @generated
 */
public interface Alert extends EObject
{
  /**
   * Returns the value of the '<em><b>Level</b></em>' attribute.
   * The literals are from the enumeration {@link de.sos.etj.eTJ.AlertLevel}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Level</em>' attribute.
   * @see de.sos.etj.eTJ.AlertLevel
   * @see #setLevel(AlertLevel)
   * @see de.sos.etj.eTJ.ETJPackage#getAlert_Level()
   * @model
   * @generated
   */
  AlertLevel getLevel();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.Alert#getLevel <em>Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Level</em>' attribute.
   * @see de.sos.etj.eTJ.AlertLevel
   * @see #getLevel()
   * @generated
   */
  void setLevel(AlertLevel value);

} // Alert

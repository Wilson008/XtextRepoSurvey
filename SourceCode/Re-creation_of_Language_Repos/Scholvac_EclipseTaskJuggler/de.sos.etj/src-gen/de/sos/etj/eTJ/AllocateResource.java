/**
 * generated by Xtext 2.35.0
 */
package de.sos.etj.eTJ;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allocate Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.AllocateResource#getResource <em>Resource</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.AllocateResource#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getAllocateResource()
 * @model
 * @generated
 */
public interface AllocateResource extends EObject
{
  /**
   * Returns the value of the '<em><b>Resource</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resource</em>' reference.
   * @see #setResource(Resource)
   * @see de.sos.etj.eTJ.ETJPackage#getAllocateResource_Resource()
   * @model
   * @generated
   */
  Resource getResource();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.AllocateResource#getResource <em>Resource</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Resource</em>' reference.
   * @see #getResource()
   * @generated
   */
  void setResource(Resource value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link de.sos.etj.eTJ.AllocateResourceAttribute}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see de.sos.etj.eTJ.ETJPackage#getAllocateResource_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<AllocateResourceAttribute> getAttributes();

} // AllocateResource

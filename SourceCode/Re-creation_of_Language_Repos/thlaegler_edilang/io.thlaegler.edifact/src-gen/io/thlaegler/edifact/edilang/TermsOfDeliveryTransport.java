/**
 * generated by Xtext 2.35.0
 */
package io.thlaegler.edifact.edilang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terms Of Delivery Transport</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.TermsOfDeliveryTransport#getDeliveryTransportTermsDescriptionCode <em>Delivery Transport Terms Description Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.TermsOfDeliveryTransport#getCodeListIdentificationCode <em>Code List Identification Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.TermsOfDeliveryTransport#getCodeListResponsibleAgencyCode <em>Code List Responsible Agency Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.TermsOfDeliveryTransport#getDeliveryTransportTermsDescriptions <em>Delivery Transport Terms Descriptions</em>}</li>
 * </ul>
 *
 * @see io.thlaegler.edifact.edilang.EdilangPackage#getTermsOfDeliveryTransport()
 * @model
 * @generated
 */
public interface TermsOfDeliveryTransport extends AbstractEdiFunction
{
  /**
   * Returns the value of the '<em><b>Delivery Transport Terms Description Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Delivery Transport Terms Description Code</em>' attribute.
   * @see #setDeliveryTransportTermsDescriptionCode(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getTermsOfDeliveryTransport_DeliveryTransportTermsDescriptionCode()
   * @model
   * @generated
   */
  String getDeliveryTransportTermsDescriptionCode();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.TermsOfDeliveryTransport#getDeliveryTransportTermsDescriptionCode <em>Delivery Transport Terms Description Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Delivery Transport Terms Description Code</em>' attribute.
   * @see #getDeliveryTransportTermsDescriptionCode()
   * @generated
   */
  void setDeliveryTransportTermsDescriptionCode(String value);

  /**
   * Returns the value of the '<em><b>Code List Identification Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Code List Identification Code</em>' attribute.
   * @see #setCodeListIdentificationCode(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getTermsOfDeliveryTransport_CodeListIdentificationCode()
   * @model
   * @generated
   */
  String getCodeListIdentificationCode();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.TermsOfDeliveryTransport#getCodeListIdentificationCode <em>Code List Identification Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Code List Identification Code</em>' attribute.
   * @see #getCodeListIdentificationCode()
   * @generated
   */
  void setCodeListIdentificationCode(String value);

  /**
   * Returns the value of the '<em><b>Code List Responsible Agency Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Code List Responsible Agency Code</em>' attribute.
   * @see #setCodeListResponsibleAgencyCode(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getTermsOfDeliveryTransport_CodeListResponsibleAgencyCode()
   * @model
   * @generated
   */
  String getCodeListResponsibleAgencyCode();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.TermsOfDeliveryTransport#getCodeListResponsibleAgencyCode <em>Code List Responsible Agency Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Code List Responsible Agency Code</em>' attribute.
   * @see #getCodeListResponsibleAgencyCode()
   * @generated
   */
  void setCodeListResponsibleAgencyCode(String value);

  /**
   * Returns the value of the '<em><b>Delivery Transport Terms Descriptions</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Delivery Transport Terms Descriptions</em>' attribute list.
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getTermsOfDeliveryTransport_DeliveryTransportTermsDescriptions()
   * @model unique="false"
   * @generated
   */
  EList<String> getDeliveryTransportTermsDescriptions();

} // TermsOfDeliveryTransport

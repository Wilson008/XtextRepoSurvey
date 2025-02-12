/**
 * generated by Xtext 2.35.0
 */
package io.thlaegler.edifact.edilang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clinical Intervention Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.ClinicalInterventionDetail#getClinicalInterventionDescriptionCode <em>Clinical Intervention Description Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.ClinicalInterventionDetail#getCodeListIdentificationCode <em>Code List Identification Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.ClinicalInterventionDetail#getCodeListResponsibleAgencyCode <em>Code List Responsible Agency Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.ClinicalInterventionDetail#getClinicalInterventionDescription <em>Clinical Intervention Description</em>}</li>
 * </ul>
 *
 * @see io.thlaegler.edifact.edilang.EdilangPackage#getClinicalInterventionDetail()
 * @model
 * @generated
 */
public interface ClinicalInterventionDetail extends AbstractEdiFunction
{
  /**
   * Returns the value of the '<em><b>Clinical Intervention Description Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Clinical Intervention Description Code</em>' attribute.
   * @see #setClinicalInterventionDescriptionCode(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getClinicalInterventionDetail_ClinicalInterventionDescriptionCode()
   * @model
   * @generated
   */
  String getClinicalInterventionDescriptionCode();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.ClinicalInterventionDetail#getClinicalInterventionDescriptionCode <em>Clinical Intervention Description Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Clinical Intervention Description Code</em>' attribute.
   * @see #getClinicalInterventionDescriptionCode()
   * @generated
   */
  void setClinicalInterventionDescriptionCode(String value);

  /**
   * Returns the value of the '<em><b>Code List Identification Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Code List Identification Code</em>' attribute.
   * @see #setCodeListIdentificationCode(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getClinicalInterventionDetail_CodeListIdentificationCode()
   * @model
   * @generated
   */
  String getCodeListIdentificationCode();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.ClinicalInterventionDetail#getCodeListIdentificationCode <em>Code List Identification Code</em>}' attribute.
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
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getClinicalInterventionDetail_CodeListResponsibleAgencyCode()
   * @model
   * @generated
   */
  String getCodeListResponsibleAgencyCode();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.ClinicalInterventionDetail#getCodeListResponsibleAgencyCode <em>Code List Responsible Agency Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Code List Responsible Agency Code</em>' attribute.
   * @see #getCodeListResponsibleAgencyCode()
   * @generated
   */
  void setCodeListResponsibleAgencyCode(String value);

  /**
   * Returns the value of the '<em><b>Clinical Intervention Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Clinical Intervention Description</em>' attribute.
   * @see #setClinicalInterventionDescription(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getClinicalInterventionDetail_ClinicalInterventionDescription()
   * @model
   * @generated
   */
  String getClinicalInterventionDescription();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.ClinicalInterventionDetail#getClinicalInterventionDescription <em>Clinical Intervention Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Clinical Intervention Description</em>' attribute.
   * @see #getClinicalInterventionDescription()
   * @generated
   */
  void setClinicalInterventionDescription(String value);

} // ClinicalInterventionDetail

/**
 * generated by Xtext 2.35.0
 */
package io.thlaegler.edifact.edilang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Percentage Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.PercentageDetail#getPercentageTypeCodeQualifier <em>Percentage Type Code Qualifier</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.PercentageDetail#getPercentage <em>Percentage</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.PercentageDetail#getPercentageBasisIdentificationCode <em>Percentage Basis Identification Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.PercentageDetail#getCodeListIdentificationCode <em>Code List Identification Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.PercentageDetail#getCodeListResponsibleAgencyCode <em>Code List Responsible Agency Code</em>}</li>
 * </ul>
 *
 * @see io.thlaegler.edifact.edilang.EdilangPackage#getPercentageDetail()
 * @model
 * @generated
 */
public interface PercentageDetail extends AbstractEdiFunction
{
  /**
   * Returns the value of the '<em><b>Percentage Type Code Qualifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Percentage Type Code Qualifier</em>' attribute.
   * @see #setPercentageTypeCodeQualifier(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getPercentageDetail_PercentageTypeCodeQualifier()
   * @model
   * @generated
   */
  String getPercentageTypeCodeQualifier();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.PercentageDetail#getPercentageTypeCodeQualifier <em>Percentage Type Code Qualifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Percentage Type Code Qualifier</em>' attribute.
   * @see #getPercentageTypeCodeQualifier()
   * @generated
   */
  void setPercentageTypeCodeQualifier(String value);

  /**
   * Returns the value of the '<em><b>Percentage</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Percentage</em>' attribute.
   * @see #setPercentage(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getPercentageDetail_Percentage()
   * @model
   * @generated
   */
  String getPercentage();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.PercentageDetail#getPercentage <em>Percentage</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Percentage</em>' attribute.
   * @see #getPercentage()
   * @generated
   */
  void setPercentage(String value);

  /**
   * Returns the value of the '<em><b>Percentage Basis Identification Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Percentage Basis Identification Code</em>' attribute.
   * @see #setPercentageBasisIdentificationCode(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getPercentageDetail_PercentageBasisIdentificationCode()
   * @model
   * @generated
   */
  String getPercentageBasisIdentificationCode();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.PercentageDetail#getPercentageBasisIdentificationCode <em>Percentage Basis Identification Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Percentage Basis Identification Code</em>' attribute.
   * @see #getPercentageBasisIdentificationCode()
   * @generated
   */
  void setPercentageBasisIdentificationCode(String value);

  /**
   * Returns the value of the '<em><b>Code List Identification Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Code List Identification Code</em>' attribute.
   * @see #setCodeListIdentificationCode(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getPercentageDetail_CodeListIdentificationCode()
   * @model
   * @generated
   */
  String getCodeListIdentificationCode();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.PercentageDetail#getCodeListIdentificationCode <em>Code List Identification Code</em>}' attribute.
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
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getPercentageDetail_CodeListResponsibleAgencyCode()
   * @model
   * @generated
   */
  String getCodeListResponsibleAgencyCode();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.PercentageDetail#getCodeListResponsibleAgencyCode <em>Code List Responsible Agency Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Code List Responsible Agency Code</em>' attribute.
   * @see #getCodeListResponsibleAgencyCode()
   * @generated
   */
  void setCodeListResponsibleAgencyCode(String value);

} // PercentageDetail

/**
 * generated by Xtext 2.35.0
 */
package io.thlaegler.edifact.edilang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Index Identification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.IndexIdentification#getIndexCodeQualifier <em>Index Code Qualifier</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.IndexIdentification#getIndexTypeIdentifier <em>Index Type Identifier</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.IndexIdentification#getCodeListIdentificationCode <em>Code List Identification Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.IndexIdentification#getCodeListResponsibleAgencyCode <em>Code List Responsible Agency Code</em>}</li>
 * </ul>
 *
 * @see io.thlaegler.edifact.edilang.EdilangPackage#getIndexIdentification()
 * @model
 * @generated
 */
public interface IndexIdentification extends AbstractEdiFunction
{
  /**
   * Returns the value of the '<em><b>Index Code Qualifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Index Code Qualifier</em>' attribute.
   * @see #setIndexCodeQualifier(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getIndexIdentification_IndexCodeQualifier()
   * @model
   * @generated
   */
  String getIndexCodeQualifier();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.IndexIdentification#getIndexCodeQualifier <em>Index Code Qualifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Index Code Qualifier</em>' attribute.
   * @see #getIndexCodeQualifier()
   * @generated
   */
  void setIndexCodeQualifier(String value);

  /**
   * Returns the value of the '<em><b>Index Type Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Index Type Identifier</em>' attribute.
   * @see #setIndexTypeIdentifier(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getIndexIdentification_IndexTypeIdentifier()
   * @model
   * @generated
   */
  String getIndexTypeIdentifier();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.IndexIdentification#getIndexTypeIdentifier <em>Index Type Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Index Type Identifier</em>' attribute.
   * @see #getIndexTypeIdentifier()
   * @generated
   */
  void setIndexTypeIdentifier(String value);

  /**
   * Returns the value of the '<em><b>Code List Identification Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Code List Identification Code</em>' attribute.
   * @see #setCodeListIdentificationCode(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getIndexIdentification_CodeListIdentificationCode()
   * @model
   * @generated
   */
  String getCodeListIdentificationCode();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.IndexIdentification#getCodeListIdentificationCode <em>Code List Identification Code</em>}' attribute.
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
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getIndexIdentification_CodeListResponsibleAgencyCode()
   * @model
   * @generated
   */
  String getCodeListResponsibleAgencyCode();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.IndexIdentification#getCodeListResponsibleAgencyCode <em>Code List Responsible Agency Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Code List Responsible Agency Code</em>' attribute.
   * @see #getCodeListResponsibleAgencyCode()
   * @generated
   */
  void setCodeListResponsibleAgencyCode(String value);

} // IndexIdentification

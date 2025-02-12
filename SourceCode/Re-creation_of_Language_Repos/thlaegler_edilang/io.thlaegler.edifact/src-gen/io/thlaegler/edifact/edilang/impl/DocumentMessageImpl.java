/**
 * generated by Xtext 2.35.0
 */
package io.thlaegler.edifact.edilang.impl;

import io.thlaegler.edifact.edilang.DocumentMessage;
import io.thlaegler.edifact.edilang.EdilangPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.DocumentMessageImpl#getDocumentNameCode <em>Document Name Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.DocumentMessageImpl#getCodeListIdentificationCode <em>Code List Identification Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.DocumentMessageImpl#getCodeListResponsibleAgencyCode <em>Code List Responsible Agency Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.DocumentMessageImpl#getDocumentName <em>Document Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentMessageImpl extends AbstractEdiFunctionImpl implements DocumentMessage
{
  /**
   * The default value of the '{@link #getDocumentNameCode() <em>Document Name Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDocumentNameCode()
   * @generated
   * @ordered
   */
  protected static final String DOCUMENT_NAME_CODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDocumentNameCode() <em>Document Name Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDocumentNameCode()
   * @generated
   * @ordered
   */
  protected String documentNameCode = DOCUMENT_NAME_CODE_EDEFAULT;

  /**
   * The default value of the '{@link #getCodeListIdentificationCode() <em>Code List Identification Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCodeListIdentificationCode()
   * @generated
   * @ordered
   */
  protected static final String CODE_LIST_IDENTIFICATION_CODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCodeListIdentificationCode() <em>Code List Identification Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCodeListIdentificationCode()
   * @generated
   * @ordered
   */
  protected String codeListIdentificationCode = CODE_LIST_IDENTIFICATION_CODE_EDEFAULT;

  /**
   * The default value of the '{@link #getCodeListResponsibleAgencyCode() <em>Code List Responsible Agency Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCodeListResponsibleAgencyCode()
   * @generated
   * @ordered
   */
  protected static final String CODE_LIST_RESPONSIBLE_AGENCY_CODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCodeListResponsibleAgencyCode() <em>Code List Responsible Agency Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCodeListResponsibleAgencyCode()
   * @generated
   * @ordered
   */
  protected String codeListResponsibleAgencyCode = CODE_LIST_RESPONSIBLE_AGENCY_CODE_EDEFAULT;

  /**
   * The default value of the '{@link #getDocumentName() <em>Document Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDocumentName()
   * @generated
   * @ordered
   */
  protected static final String DOCUMENT_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDocumentName() <em>Document Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDocumentName()
   * @generated
   * @ordered
   */
  protected String documentName = DOCUMENT_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DocumentMessageImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return EdilangPackage.eINSTANCE.getDocumentMessage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDocumentNameCode()
  {
    return documentNameCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDocumentNameCode(String newDocumentNameCode)
  {
    String oldDocumentNameCode = documentNameCode;
    documentNameCode = newDocumentNameCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.DOCUMENT_MESSAGE__DOCUMENT_NAME_CODE, oldDocumentNameCode, documentNameCode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCodeListIdentificationCode()
  {
    return codeListIdentificationCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCodeListIdentificationCode(String newCodeListIdentificationCode)
  {
    String oldCodeListIdentificationCode = codeListIdentificationCode;
    codeListIdentificationCode = newCodeListIdentificationCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.DOCUMENT_MESSAGE__CODE_LIST_IDENTIFICATION_CODE, oldCodeListIdentificationCode, codeListIdentificationCode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCodeListResponsibleAgencyCode()
  {
    return codeListResponsibleAgencyCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCodeListResponsibleAgencyCode(String newCodeListResponsibleAgencyCode)
  {
    String oldCodeListResponsibleAgencyCode = codeListResponsibleAgencyCode;
    codeListResponsibleAgencyCode = newCodeListResponsibleAgencyCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.DOCUMENT_MESSAGE__CODE_LIST_RESPONSIBLE_AGENCY_CODE, oldCodeListResponsibleAgencyCode, codeListResponsibleAgencyCode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDocumentName()
  {
    return documentName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDocumentName(String newDocumentName)
  {
    String oldDocumentName = documentName;
    documentName = newDocumentName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.DOCUMENT_MESSAGE__DOCUMENT_NAME, oldDocumentName, documentName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case EdilangPackage.DOCUMENT_MESSAGE__DOCUMENT_NAME_CODE:
        return getDocumentNameCode();
      case EdilangPackage.DOCUMENT_MESSAGE__CODE_LIST_IDENTIFICATION_CODE:
        return getCodeListIdentificationCode();
      case EdilangPackage.DOCUMENT_MESSAGE__CODE_LIST_RESPONSIBLE_AGENCY_CODE:
        return getCodeListResponsibleAgencyCode();
      case EdilangPackage.DOCUMENT_MESSAGE__DOCUMENT_NAME:
        return getDocumentName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EdilangPackage.DOCUMENT_MESSAGE__DOCUMENT_NAME_CODE:
        setDocumentNameCode((String)newValue);
        return;
      case EdilangPackage.DOCUMENT_MESSAGE__CODE_LIST_IDENTIFICATION_CODE:
        setCodeListIdentificationCode((String)newValue);
        return;
      case EdilangPackage.DOCUMENT_MESSAGE__CODE_LIST_RESPONSIBLE_AGENCY_CODE:
        setCodeListResponsibleAgencyCode((String)newValue);
        return;
      case EdilangPackage.DOCUMENT_MESSAGE__DOCUMENT_NAME:
        setDocumentName((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case EdilangPackage.DOCUMENT_MESSAGE__DOCUMENT_NAME_CODE:
        setDocumentNameCode(DOCUMENT_NAME_CODE_EDEFAULT);
        return;
      case EdilangPackage.DOCUMENT_MESSAGE__CODE_LIST_IDENTIFICATION_CODE:
        setCodeListIdentificationCode(CODE_LIST_IDENTIFICATION_CODE_EDEFAULT);
        return;
      case EdilangPackage.DOCUMENT_MESSAGE__CODE_LIST_RESPONSIBLE_AGENCY_CODE:
        setCodeListResponsibleAgencyCode(CODE_LIST_RESPONSIBLE_AGENCY_CODE_EDEFAULT);
        return;
      case EdilangPackage.DOCUMENT_MESSAGE__DOCUMENT_NAME:
        setDocumentName(DOCUMENT_NAME_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case EdilangPackage.DOCUMENT_MESSAGE__DOCUMENT_NAME_CODE:
        return DOCUMENT_NAME_CODE_EDEFAULT == null ? documentNameCode != null : !DOCUMENT_NAME_CODE_EDEFAULT.equals(documentNameCode);
      case EdilangPackage.DOCUMENT_MESSAGE__CODE_LIST_IDENTIFICATION_CODE:
        return CODE_LIST_IDENTIFICATION_CODE_EDEFAULT == null ? codeListIdentificationCode != null : !CODE_LIST_IDENTIFICATION_CODE_EDEFAULT.equals(codeListIdentificationCode);
      case EdilangPackage.DOCUMENT_MESSAGE__CODE_LIST_RESPONSIBLE_AGENCY_CODE:
        return CODE_LIST_RESPONSIBLE_AGENCY_CODE_EDEFAULT == null ? codeListResponsibleAgencyCode != null : !CODE_LIST_RESPONSIBLE_AGENCY_CODE_EDEFAULT.equals(codeListResponsibleAgencyCode);
      case EdilangPackage.DOCUMENT_MESSAGE__DOCUMENT_NAME:
        return DOCUMENT_NAME_EDEFAULT == null ? documentName != null : !DOCUMENT_NAME_EDEFAULT.equals(documentName);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (documentNameCode: ");
    result.append(documentNameCode);
    result.append(", codeListIdentificationCode: ");
    result.append(codeListIdentificationCode);
    result.append(", codeListResponsibleAgencyCode: ");
    result.append(codeListResponsibleAgencyCode);
    result.append(", documentName: ");
    result.append(documentName);
    result.append(')');
    return result.toString();
  }

} //DocumentMessageImpl

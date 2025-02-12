/**
 * generated by Xtext 2.35.0
 */
package io.thlaegler.edifact.edilang.impl;

import io.thlaegler.edifact.edilang.ApplicationErrorDetail;
import io.thlaegler.edifact.edilang.EdilangPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Error Detail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.ApplicationErrorDetailImpl#getApplictionErrorCode <em>Appliction Error Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.ApplicationErrorDetailImpl#getCodeListIdentificationCode <em>Code List Identification Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.ApplicationErrorDetailImpl#getCodeListResponsibleAgencyCode <em>Code List Responsible Agency Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationErrorDetailImpl extends AbstractEdiFunctionImpl implements ApplicationErrorDetail
{
  /**
   * The default value of the '{@link #getApplictionErrorCode() <em>Appliction Error Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getApplictionErrorCode()
   * @generated
   * @ordered
   */
  protected static final String APPLICTION_ERROR_CODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getApplictionErrorCode() <em>Appliction Error Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getApplictionErrorCode()
   * @generated
   * @ordered
   */
  protected String applictionErrorCode = APPLICTION_ERROR_CODE_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ApplicationErrorDetailImpl()
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
    return EdilangPackage.eINSTANCE.getApplicationErrorDetail();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getApplictionErrorCode()
  {
    return applictionErrorCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setApplictionErrorCode(String newApplictionErrorCode)
  {
    String oldApplictionErrorCode = applictionErrorCode;
    applictionErrorCode = newApplictionErrorCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.APPLICATION_ERROR_DETAIL__APPLICTION_ERROR_CODE, oldApplictionErrorCode, applictionErrorCode));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.APPLICATION_ERROR_DETAIL__CODE_LIST_IDENTIFICATION_CODE, oldCodeListIdentificationCode, codeListIdentificationCode));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.APPLICATION_ERROR_DETAIL__CODE_LIST_RESPONSIBLE_AGENCY_CODE, oldCodeListResponsibleAgencyCode, codeListResponsibleAgencyCode));
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
      case EdilangPackage.APPLICATION_ERROR_DETAIL__APPLICTION_ERROR_CODE:
        return getApplictionErrorCode();
      case EdilangPackage.APPLICATION_ERROR_DETAIL__CODE_LIST_IDENTIFICATION_CODE:
        return getCodeListIdentificationCode();
      case EdilangPackage.APPLICATION_ERROR_DETAIL__CODE_LIST_RESPONSIBLE_AGENCY_CODE:
        return getCodeListResponsibleAgencyCode();
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
      case EdilangPackage.APPLICATION_ERROR_DETAIL__APPLICTION_ERROR_CODE:
        setApplictionErrorCode((String)newValue);
        return;
      case EdilangPackage.APPLICATION_ERROR_DETAIL__CODE_LIST_IDENTIFICATION_CODE:
        setCodeListIdentificationCode((String)newValue);
        return;
      case EdilangPackage.APPLICATION_ERROR_DETAIL__CODE_LIST_RESPONSIBLE_AGENCY_CODE:
        setCodeListResponsibleAgencyCode((String)newValue);
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
      case EdilangPackage.APPLICATION_ERROR_DETAIL__APPLICTION_ERROR_CODE:
        setApplictionErrorCode(APPLICTION_ERROR_CODE_EDEFAULT);
        return;
      case EdilangPackage.APPLICATION_ERROR_DETAIL__CODE_LIST_IDENTIFICATION_CODE:
        setCodeListIdentificationCode(CODE_LIST_IDENTIFICATION_CODE_EDEFAULT);
        return;
      case EdilangPackage.APPLICATION_ERROR_DETAIL__CODE_LIST_RESPONSIBLE_AGENCY_CODE:
        setCodeListResponsibleAgencyCode(CODE_LIST_RESPONSIBLE_AGENCY_CODE_EDEFAULT);
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
      case EdilangPackage.APPLICATION_ERROR_DETAIL__APPLICTION_ERROR_CODE:
        return APPLICTION_ERROR_CODE_EDEFAULT == null ? applictionErrorCode != null : !APPLICTION_ERROR_CODE_EDEFAULT.equals(applictionErrorCode);
      case EdilangPackage.APPLICATION_ERROR_DETAIL__CODE_LIST_IDENTIFICATION_CODE:
        return CODE_LIST_IDENTIFICATION_CODE_EDEFAULT == null ? codeListIdentificationCode != null : !CODE_LIST_IDENTIFICATION_CODE_EDEFAULT.equals(codeListIdentificationCode);
      case EdilangPackage.APPLICATION_ERROR_DETAIL__CODE_LIST_RESPONSIBLE_AGENCY_CODE:
        return CODE_LIST_RESPONSIBLE_AGENCY_CODE_EDEFAULT == null ? codeListResponsibleAgencyCode != null : !CODE_LIST_RESPONSIBLE_AGENCY_CODE_EDEFAULT.equals(codeListResponsibleAgencyCode);
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
    result.append(" (applictionErrorCode: ");
    result.append(applictionErrorCode);
    result.append(", codeListIdentificationCode: ");
    result.append(codeListIdentificationCode);
    result.append(", codeListResponsibleAgencyCode: ");
    result.append(codeListResponsibleAgencyCode);
    result.append(')');
    return result.toString();
  }

} //ApplicationErrorDetailImpl

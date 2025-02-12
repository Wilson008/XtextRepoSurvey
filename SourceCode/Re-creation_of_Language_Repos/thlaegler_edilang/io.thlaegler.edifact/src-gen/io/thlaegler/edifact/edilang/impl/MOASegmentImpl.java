/**
 * generated by Xtext 2.35.0
 */
package io.thlaegler.edifact.edilang.impl;

import io.thlaegler.edifact.edilang.EdilangPackage;
import io.thlaegler.edifact.edilang.MOASegment;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MOA Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.MOASegmentImpl#getMonetaryAmountTypeCodeQualifier <em>Monetary Amount Type Code Qualifier</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.MOASegmentImpl#getMonetaryAmount <em>Monetary Amount</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.MOASegmentImpl#getCurrencyIdentificationCode <em>Currency Identification Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.MOASegmentImpl#getCurrencyTypeCodeQualifier <em>Currency Type Code Qualifier</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.MOASegmentImpl#getStatusDescriptionCode <em>Status Description Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MOASegmentImpl extends AbstractEdiSegmentImpl implements MOASegment
{
  /**
   * The default value of the '{@link #getMonetaryAmountTypeCodeQualifier() <em>Monetary Amount Type Code Qualifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMonetaryAmountTypeCodeQualifier()
   * @generated
   * @ordered
   */
  protected static final String MONETARY_AMOUNT_TYPE_CODE_QUALIFIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMonetaryAmountTypeCodeQualifier() <em>Monetary Amount Type Code Qualifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMonetaryAmountTypeCodeQualifier()
   * @generated
   * @ordered
   */
  protected String monetaryAmountTypeCodeQualifier = MONETARY_AMOUNT_TYPE_CODE_QUALIFIER_EDEFAULT;

  /**
   * The default value of the '{@link #getMonetaryAmount() <em>Monetary Amount</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMonetaryAmount()
   * @generated
   * @ordered
   */
  protected static final String MONETARY_AMOUNT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMonetaryAmount() <em>Monetary Amount</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMonetaryAmount()
   * @generated
   * @ordered
   */
  protected String monetaryAmount = MONETARY_AMOUNT_EDEFAULT;

  /**
   * The default value of the '{@link #getCurrencyIdentificationCode() <em>Currency Identification Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCurrencyIdentificationCode()
   * @generated
   * @ordered
   */
  protected static final String CURRENCY_IDENTIFICATION_CODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCurrencyIdentificationCode() <em>Currency Identification Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCurrencyIdentificationCode()
   * @generated
   * @ordered
   */
  protected String currencyIdentificationCode = CURRENCY_IDENTIFICATION_CODE_EDEFAULT;

  /**
   * The default value of the '{@link #getCurrencyTypeCodeQualifier() <em>Currency Type Code Qualifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCurrencyTypeCodeQualifier()
   * @generated
   * @ordered
   */
  protected static final String CURRENCY_TYPE_CODE_QUALIFIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCurrencyTypeCodeQualifier() <em>Currency Type Code Qualifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCurrencyTypeCodeQualifier()
   * @generated
   * @ordered
   */
  protected String currencyTypeCodeQualifier = CURRENCY_TYPE_CODE_QUALIFIER_EDEFAULT;

  /**
   * The default value of the '{@link #getStatusDescriptionCode() <em>Status Description Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatusDescriptionCode()
   * @generated
   * @ordered
   */
  protected static final String STATUS_DESCRIPTION_CODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStatusDescriptionCode() <em>Status Description Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatusDescriptionCode()
   * @generated
   * @ordered
   */
  protected String statusDescriptionCode = STATUS_DESCRIPTION_CODE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MOASegmentImpl()
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
    return EdilangPackage.eINSTANCE.getMOASegment();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getMonetaryAmountTypeCodeQualifier()
  {
    return monetaryAmountTypeCodeQualifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMonetaryAmountTypeCodeQualifier(String newMonetaryAmountTypeCodeQualifier)
  {
    String oldMonetaryAmountTypeCodeQualifier = monetaryAmountTypeCodeQualifier;
    monetaryAmountTypeCodeQualifier = newMonetaryAmountTypeCodeQualifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.MOA_SEGMENT__MONETARY_AMOUNT_TYPE_CODE_QUALIFIER, oldMonetaryAmountTypeCodeQualifier, monetaryAmountTypeCodeQualifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getMonetaryAmount()
  {
    return monetaryAmount;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMonetaryAmount(String newMonetaryAmount)
  {
    String oldMonetaryAmount = monetaryAmount;
    monetaryAmount = newMonetaryAmount;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.MOA_SEGMENT__MONETARY_AMOUNT, oldMonetaryAmount, monetaryAmount));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCurrencyIdentificationCode()
  {
    return currencyIdentificationCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCurrencyIdentificationCode(String newCurrencyIdentificationCode)
  {
    String oldCurrencyIdentificationCode = currencyIdentificationCode;
    currencyIdentificationCode = newCurrencyIdentificationCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.MOA_SEGMENT__CURRENCY_IDENTIFICATION_CODE, oldCurrencyIdentificationCode, currencyIdentificationCode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCurrencyTypeCodeQualifier()
  {
    return currencyTypeCodeQualifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCurrencyTypeCodeQualifier(String newCurrencyTypeCodeQualifier)
  {
    String oldCurrencyTypeCodeQualifier = currencyTypeCodeQualifier;
    currencyTypeCodeQualifier = newCurrencyTypeCodeQualifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.MOA_SEGMENT__CURRENCY_TYPE_CODE_QUALIFIER, oldCurrencyTypeCodeQualifier, currencyTypeCodeQualifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getStatusDescriptionCode()
  {
    return statusDescriptionCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setStatusDescriptionCode(String newStatusDescriptionCode)
  {
    String oldStatusDescriptionCode = statusDescriptionCode;
    statusDescriptionCode = newStatusDescriptionCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.MOA_SEGMENT__STATUS_DESCRIPTION_CODE, oldStatusDescriptionCode, statusDescriptionCode));
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
      case EdilangPackage.MOA_SEGMENT__MONETARY_AMOUNT_TYPE_CODE_QUALIFIER:
        return getMonetaryAmountTypeCodeQualifier();
      case EdilangPackage.MOA_SEGMENT__MONETARY_AMOUNT:
        return getMonetaryAmount();
      case EdilangPackage.MOA_SEGMENT__CURRENCY_IDENTIFICATION_CODE:
        return getCurrencyIdentificationCode();
      case EdilangPackage.MOA_SEGMENT__CURRENCY_TYPE_CODE_QUALIFIER:
        return getCurrencyTypeCodeQualifier();
      case EdilangPackage.MOA_SEGMENT__STATUS_DESCRIPTION_CODE:
        return getStatusDescriptionCode();
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
      case EdilangPackage.MOA_SEGMENT__MONETARY_AMOUNT_TYPE_CODE_QUALIFIER:
        setMonetaryAmountTypeCodeQualifier((String)newValue);
        return;
      case EdilangPackage.MOA_SEGMENT__MONETARY_AMOUNT:
        setMonetaryAmount((String)newValue);
        return;
      case EdilangPackage.MOA_SEGMENT__CURRENCY_IDENTIFICATION_CODE:
        setCurrencyIdentificationCode((String)newValue);
        return;
      case EdilangPackage.MOA_SEGMENT__CURRENCY_TYPE_CODE_QUALIFIER:
        setCurrencyTypeCodeQualifier((String)newValue);
        return;
      case EdilangPackage.MOA_SEGMENT__STATUS_DESCRIPTION_CODE:
        setStatusDescriptionCode((String)newValue);
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
      case EdilangPackage.MOA_SEGMENT__MONETARY_AMOUNT_TYPE_CODE_QUALIFIER:
        setMonetaryAmountTypeCodeQualifier(MONETARY_AMOUNT_TYPE_CODE_QUALIFIER_EDEFAULT);
        return;
      case EdilangPackage.MOA_SEGMENT__MONETARY_AMOUNT:
        setMonetaryAmount(MONETARY_AMOUNT_EDEFAULT);
        return;
      case EdilangPackage.MOA_SEGMENT__CURRENCY_IDENTIFICATION_CODE:
        setCurrencyIdentificationCode(CURRENCY_IDENTIFICATION_CODE_EDEFAULT);
        return;
      case EdilangPackage.MOA_SEGMENT__CURRENCY_TYPE_CODE_QUALIFIER:
        setCurrencyTypeCodeQualifier(CURRENCY_TYPE_CODE_QUALIFIER_EDEFAULT);
        return;
      case EdilangPackage.MOA_SEGMENT__STATUS_DESCRIPTION_CODE:
        setStatusDescriptionCode(STATUS_DESCRIPTION_CODE_EDEFAULT);
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
      case EdilangPackage.MOA_SEGMENT__MONETARY_AMOUNT_TYPE_CODE_QUALIFIER:
        return MONETARY_AMOUNT_TYPE_CODE_QUALIFIER_EDEFAULT == null ? monetaryAmountTypeCodeQualifier != null : !MONETARY_AMOUNT_TYPE_CODE_QUALIFIER_EDEFAULT.equals(monetaryAmountTypeCodeQualifier);
      case EdilangPackage.MOA_SEGMENT__MONETARY_AMOUNT:
        return MONETARY_AMOUNT_EDEFAULT == null ? monetaryAmount != null : !MONETARY_AMOUNT_EDEFAULT.equals(monetaryAmount);
      case EdilangPackage.MOA_SEGMENT__CURRENCY_IDENTIFICATION_CODE:
        return CURRENCY_IDENTIFICATION_CODE_EDEFAULT == null ? currencyIdentificationCode != null : !CURRENCY_IDENTIFICATION_CODE_EDEFAULT.equals(currencyIdentificationCode);
      case EdilangPackage.MOA_SEGMENT__CURRENCY_TYPE_CODE_QUALIFIER:
        return CURRENCY_TYPE_CODE_QUALIFIER_EDEFAULT == null ? currencyTypeCodeQualifier != null : !CURRENCY_TYPE_CODE_QUALIFIER_EDEFAULT.equals(currencyTypeCodeQualifier);
      case EdilangPackage.MOA_SEGMENT__STATUS_DESCRIPTION_CODE:
        return STATUS_DESCRIPTION_CODE_EDEFAULT == null ? statusDescriptionCode != null : !STATUS_DESCRIPTION_CODE_EDEFAULT.equals(statusDescriptionCode);
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
    result.append(" (monetaryAmountTypeCodeQualifier: ");
    result.append(monetaryAmountTypeCodeQualifier);
    result.append(", monetaryAmount: ");
    result.append(monetaryAmount);
    result.append(", currencyIdentificationCode: ");
    result.append(currencyIdentificationCode);
    result.append(", currencyTypeCodeQualifier: ");
    result.append(currencyTypeCodeQualifier);
    result.append(", statusDescriptionCode: ");
    result.append(statusDescriptionCode);
    result.append(')');
    return result.toString();
  }

} //MOASegmentImpl

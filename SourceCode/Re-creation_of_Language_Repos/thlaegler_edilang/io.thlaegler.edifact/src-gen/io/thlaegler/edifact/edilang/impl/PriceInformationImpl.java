/**
 * generated by Xtext 2.35.0
 */
package io.thlaegler.edifact.edilang.impl;

import io.thlaegler.edifact.edilang.EdilangPackage;
import io.thlaegler.edifact.edilang.PriceInformation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Price Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.PriceInformationImpl#getPriceCodeQualifier <em>Price Code Qualifier</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.PriceInformationImpl#getPriceAmount <em>Price Amount</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.PriceInformationImpl#getPriceTypeCode <em>Price Type Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.PriceInformationImpl#getPriceSpecificationCode <em>Price Specification Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.PriceInformationImpl#getUnitPriceBasisValue <em>Unit Price Basis Value</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.PriceInformationImpl#getMeasurementUnitCode <em>Measurement Unit Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PriceInformationImpl extends AbstractEdiFunctionImpl implements PriceInformation
{
  /**
   * The default value of the '{@link #getPriceCodeQualifier() <em>Price Code Qualifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPriceCodeQualifier()
   * @generated
   * @ordered
   */
  protected static final String PRICE_CODE_QUALIFIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPriceCodeQualifier() <em>Price Code Qualifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPriceCodeQualifier()
   * @generated
   * @ordered
   */
  protected String priceCodeQualifier = PRICE_CODE_QUALIFIER_EDEFAULT;

  /**
   * The default value of the '{@link #getPriceAmount() <em>Price Amount</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPriceAmount()
   * @generated
   * @ordered
   */
  protected static final String PRICE_AMOUNT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPriceAmount() <em>Price Amount</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPriceAmount()
   * @generated
   * @ordered
   */
  protected String priceAmount = PRICE_AMOUNT_EDEFAULT;

  /**
   * The default value of the '{@link #getPriceTypeCode() <em>Price Type Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPriceTypeCode()
   * @generated
   * @ordered
   */
  protected static final String PRICE_TYPE_CODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPriceTypeCode() <em>Price Type Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPriceTypeCode()
   * @generated
   * @ordered
   */
  protected String priceTypeCode = PRICE_TYPE_CODE_EDEFAULT;

  /**
   * The default value of the '{@link #getPriceSpecificationCode() <em>Price Specification Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPriceSpecificationCode()
   * @generated
   * @ordered
   */
  protected static final String PRICE_SPECIFICATION_CODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPriceSpecificationCode() <em>Price Specification Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPriceSpecificationCode()
   * @generated
   * @ordered
   */
  protected String priceSpecificationCode = PRICE_SPECIFICATION_CODE_EDEFAULT;

  /**
   * The default value of the '{@link #getUnitPriceBasisValue() <em>Unit Price Basis Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnitPriceBasisValue()
   * @generated
   * @ordered
   */
  protected static final String UNIT_PRICE_BASIS_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUnitPriceBasisValue() <em>Unit Price Basis Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnitPriceBasisValue()
   * @generated
   * @ordered
   */
  protected String unitPriceBasisValue = UNIT_PRICE_BASIS_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getMeasurementUnitCode() <em>Measurement Unit Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMeasurementUnitCode()
   * @generated
   * @ordered
   */
  protected static final String MEASUREMENT_UNIT_CODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMeasurementUnitCode() <em>Measurement Unit Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMeasurementUnitCode()
   * @generated
   * @ordered
   */
  protected String measurementUnitCode = MEASUREMENT_UNIT_CODE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PriceInformationImpl()
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
    return EdilangPackage.eINSTANCE.getPriceInformation();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPriceCodeQualifier()
  {
    return priceCodeQualifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPriceCodeQualifier(String newPriceCodeQualifier)
  {
    String oldPriceCodeQualifier = priceCodeQualifier;
    priceCodeQualifier = newPriceCodeQualifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.PRICE_INFORMATION__PRICE_CODE_QUALIFIER, oldPriceCodeQualifier, priceCodeQualifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPriceAmount()
  {
    return priceAmount;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPriceAmount(String newPriceAmount)
  {
    String oldPriceAmount = priceAmount;
    priceAmount = newPriceAmount;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.PRICE_INFORMATION__PRICE_AMOUNT, oldPriceAmount, priceAmount));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPriceTypeCode()
  {
    return priceTypeCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPriceTypeCode(String newPriceTypeCode)
  {
    String oldPriceTypeCode = priceTypeCode;
    priceTypeCode = newPriceTypeCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.PRICE_INFORMATION__PRICE_TYPE_CODE, oldPriceTypeCode, priceTypeCode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPriceSpecificationCode()
  {
    return priceSpecificationCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPriceSpecificationCode(String newPriceSpecificationCode)
  {
    String oldPriceSpecificationCode = priceSpecificationCode;
    priceSpecificationCode = newPriceSpecificationCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.PRICE_INFORMATION__PRICE_SPECIFICATION_CODE, oldPriceSpecificationCode, priceSpecificationCode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getUnitPriceBasisValue()
  {
    return unitPriceBasisValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setUnitPriceBasisValue(String newUnitPriceBasisValue)
  {
    String oldUnitPriceBasisValue = unitPriceBasisValue;
    unitPriceBasisValue = newUnitPriceBasisValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.PRICE_INFORMATION__UNIT_PRICE_BASIS_VALUE, oldUnitPriceBasisValue, unitPriceBasisValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getMeasurementUnitCode()
  {
    return measurementUnitCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMeasurementUnitCode(String newMeasurementUnitCode)
  {
    String oldMeasurementUnitCode = measurementUnitCode;
    measurementUnitCode = newMeasurementUnitCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.PRICE_INFORMATION__MEASUREMENT_UNIT_CODE, oldMeasurementUnitCode, measurementUnitCode));
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
      case EdilangPackage.PRICE_INFORMATION__PRICE_CODE_QUALIFIER:
        return getPriceCodeQualifier();
      case EdilangPackage.PRICE_INFORMATION__PRICE_AMOUNT:
        return getPriceAmount();
      case EdilangPackage.PRICE_INFORMATION__PRICE_TYPE_CODE:
        return getPriceTypeCode();
      case EdilangPackage.PRICE_INFORMATION__PRICE_SPECIFICATION_CODE:
        return getPriceSpecificationCode();
      case EdilangPackage.PRICE_INFORMATION__UNIT_PRICE_BASIS_VALUE:
        return getUnitPriceBasisValue();
      case EdilangPackage.PRICE_INFORMATION__MEASUREMENT_UNIT_CODE:
        return getMeasurementUnitCode();
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
      case EdilangPackage.PRICE_INFORMATION__PRICE_CODE_QUALIFIER:
        setPriceCodeQualifier((String)newValue);
        return;
      case EdilangPackage.PRICE_INFORMATION__PRICE_AMOUNT:
        setPriceAmount((String)newValue);
        return;
      case EdilangPackage.PRICE_INFORMATION__PRICE_TYPE_CODE:
        setPriceTypeCode((String)newValue);
        return;
      case EdilangPackage.PRICE_INFORMATION__PRICE_SPECIFICATION_CODE:
        setPriceSpecificationCode((String)newValue);
        return;
      case EdilangPackage.PRICE_INFORMATION__UNIT_PRICE_BASIS_VALUE:
        setUnitPriceBasisValue((String)newValue);
        return;
      case EdilangPackage.PRICE_INFORMATION__MEASUREMENT_UNIT_CODE:
        setMeasurementUnitCode((String)newValue);
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
      case EdilangPackage.PRICE_INFORMATION__PRICE_CODE_QUALIFIER:
        setPriceCodeQualifier(PRICE_CODE_QUALIFIER_EDEFAULT);
        return;
      case EdilangPackage.PRICE_INFORMATION__PRICE_AMOUNT:
        setPriceAmount(PRICE_AMOUNT_EDEFAULT);
        return;
      case EdilangPackage.PRICE_INFORMATION__PRICE_TYPE_CODE:
        setPriceTypeCode(PRICE_TYPE_CODE_EDEFAULT);
        return;
      case EdilangPackage.PRICE_INFORMATION__PRICE_SPECIFICATION_CODE:
        setPriceSpecificationCode(PRICE_SPECIFICATION_CODE_EDEFAULT);
        return;
      case EdilangPackage.PRICE_INFORMATION__UNIT_PRICE_BASIS_VALUE:
        setUnitPriceBasisValue(UNIT_PRICE_BASIS_VALUE_EDEFAULT);
        return;
      case EdilangPackage.PRICE_INFORMATION__MEASUREMENT_UNIT_CODE:
        setMeasurementUnitCode(MEASUREMENT_UNIT_CODE_EDEFAULT);
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
      case EdilangPackage.PRICE_INFORMATION__PRICE_CODE_QUALIFIER:
        return PRICE_CODE_QUALIFIER_EDEFAULT == null ? priceCodeQualifier != null : !PRICE_CODE_QUALIFIER_EDEFAULT.equals(priceCodeQualifier);
      case EdilangPackage.PRICE_INFORMATION__PRICE_AMOUNT:
        return PRICE_AMOUNT_EDEFAULT == null ? priceAmount != null : !PRICE_AMOUNT_EDEFAULT.equals(priceAmount);
      case EdilangPackage.PRICE_INFORMATION__PRICE_TYPE_CODE:
        return PRICE_TYPE_CODE_EDEFAULT == null ? priceTypeCode != null : !PRICE_TYPE_CODE_EDEFAULT.equals(priceTypeCode);
      case EdilangPackage.PRICE_INFORMATION__PRICE_SPECIFICATION_CODE:
        return PRICE_SPECIFICATION_CODE_EDEFAULT == null ? priceSpecificationCode != null : !PRICE_SPECIFICATION_CODE_EDEFAULT.equals(priceSpecificationCode);
      case EdilangPackage.PRICE_INFORMATION__UNIT_PRICE_BASIS_VALUE:
        return UNIT_PRICE_BASIS_VALUE_EDEFAULT == null ? unitPriceBasisValue != null : !UNIT_PRICE_BASIS_VALUE_EDEFAULT.equals(unitPriceBasisValue);
      case EdilangPackage.PRICE_INFORMATION__MEASUREMENT_UNIT_CODE:
        return MEASUREMENT_UNIT_CODE_EDEFAULT == null ? measurementUnitCode != null : !MEASUREMENT_UNIT_CODE_EDEFAULT.equals(measurementUnitCode);
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
    result.append(" (priceCodeQualifier: ");
    result.append(priceCodeQualifier);
    result.append(", priceAmount: ");
    result.append(priceAmount);
    result.append(", priceTypeCode: ");
    result.append(priceTypeCode);
    result.append(", priceSpecificationCode: ");
    result.append(priceSpecificationCode);
    result.append(", unitPriceBasisValue: ");
    result.append(unitPriceBasisValue);
    result.append(", measurementUnitCode: ");
    result.append(measurementUnitCode);
    result.append(')');
    return result.toString();
  }

} //PriceInformationImpl

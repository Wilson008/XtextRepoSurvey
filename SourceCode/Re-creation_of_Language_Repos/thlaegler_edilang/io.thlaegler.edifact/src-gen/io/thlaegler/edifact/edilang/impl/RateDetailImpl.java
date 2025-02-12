/**
 * generated by Xtext 2.35.0
 */
package io.thlaegler.edifact.edilang.impl;

import io.thlaegler.edifact.edilang.EdilangPackage;
import io.thlaegler.edifact.edilang.RateDetail;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rate Detail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.RateDetailImpl#getRateTypeCodeQualifier <em>Rate Type Code Qualifier</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.RateDetailImpl#getUnitPriceBasisRate <em>Unit Price Basis Rate</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.RateDetailImpl#getUnitPriceBasisValue <em>Unit Price Basis Value</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.RateDetailImpl#getMeasurementUnitCode <em>Measurement Unit Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RateDetailImpl extends AbstractEdiFunctionImpl implements RateDetail
{
  /**
   * The default value of the '{@link #getRateTypeCodeQualifier() <em>Rate Type Code Qualifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRateTypeCodeQualifier()
   * @generated
   * @ordered
   */
  protected static final String RATE_TYPE_CODE_QUALIFIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRateTypeCodeQualifier() <em>Rate Type Code Qualifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRateTypeCodeQualifier()
   * @generated
   * @ordered
   */
  protected String rateTypeCodeQualifier = RATE_TYPE_CODE_QUALIFIER_EDEFAULT;

  /**
   * The default value of the '{@link #getUnitPriceBasisRate() <em>Unit Price Basis Rate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnitPriceBasisRate()
   * @generated
   * @ordered
   */
  protected static final String UNIT_PRICE_BASIS_RATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUnitPriceBasisRate() <em>Unit Price Basis Rate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnitPriceBasisRate()
   * @generated
   * @ordered
   */
  protected String unitPriceBasisRate = UNIT_PRICE_BASIS_RATE_EDEFAULT;

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
  protected RateDetailImpl()
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
    return EdilangPackage.eINSTANCE.getRateDetail();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getRateTypeCodeQualifier()
  {
    return rateTypeCodeQualifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRateTypeCodeQualifier(String newRateTypeCodeQualifier)
  {
    String oldRateTypeCodeQualifier = rateTypeCodeQualifier;
    rateTypeCodeQualifier = newRateTypeCodeQualifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.RATE_DETAIL__RATE_TYPE_CODE_QUALIFIER, oldRateTypeCodeQualifier, rateTypeCodeQualifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getUnitPriceBasisRate()
  {
    return unitPriceBasisRate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setUnitPriceBasisRate(String newUnitPriceBasisRate)
  {
    String oldUnitPriceBasisRate = unitPriceBasisRate;
    unitPriceBasisRate = newUnitPriceBasisRate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.RATE_DETAIL__UNIT_PRICE_BASIS_RATE, oldUnitPriceBasisRate, unitPriceBasisRate));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.RATE_DETAIL__UNIT_PRICE_BASIS_VALUE, oldUnitPriceBasisValue, unitPriceBasisValue));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.RATE_DETAIL__MEASUREMENT_UNIT_CODE, oldMeasurementUnitCode, measurementUnitCode));
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
      case EdilangPackage.RATE_DETAIL__RATE_TYPE_CODE_QUALIFIER:
        return getRateTypeCodeQualifier();
      case EdilangPackage.RATE_DETAIL__UNIT_PRICE_BASIS_RATE:
        return getUnitPriceBasisRate();
      case EdilangPackage.RATE_DETAIL__UNIT_PRICE_BASIS_VALUE:
        return getUnitPriceBasisValue();
      case EdilangPackage.RATE_DETAIL__MEASUREMENT_UNIT_CODE:
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
      case EdilangPackage.RATE_DETAIL__RATE_TYPE_CODE_QUALIFIER:
        setRateTypeCodeQualifier((String)newValue);
        return;
      case EdilangPackage.RATE_DETAIL__UNIT_PRICE_BASIS_RATE:
        setUnitPriceBasisRate((String)newValue);
        return;
      case EdilangPackage.RATE_DETAIL__UNIT_PRICE_BASIS_VALUE:
        setUnitPriceBasisValue((String)newValue);
        return;
      case EdilangPackage.RATE_DETAIL__MEASUREMENT_UNIT_CODE:
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
      case EdilangPackage.RATE_DETAIL__RATE_TYPE_CODE_QUALIFIER:
        setRateTypeCodeQualifier(RATE_TYPE_CODE_QUALIFIER_EDEFAULT);
        return;
      case EdilangPackage.RATE_DETAIL__UNIT_PRICE_BASIS_RATE:
        setUnitPriceBasisRate(UNIT_PRICE_BASIS_RATE_EDEFAULT);
        return;
      case EdilangPackage.RATE_DETAIL__UNIT_PRICE_BASIS_VALUE:
        setUnitPriceBasisValue(UNIT_PRICE_BASIS_VALUE_EDEFAULT);
        return;
      case EdilangPackage.RATE_DETAIL__MEASUREMENT_UNIT_CODE:
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
      case EdilangPackage.RATE_DETAIL__RATE_TYPE_CODE_QUALIFIER:
        return RATE_TYPE_CODE_QUALIFIER_EDEFAULT == null ? rateTypeCodeQualifier != null : !RATE_TYPE_CODE_QUALIFIER_EDEFAULT.equals(rateTypeCodeQualifier);
      case EdilangPackage.RATE_DETAIL__UNIT_PRICE_BASIS_RATE:
        return UNIT_PRICE_BASIS_RATE_EDEFAULT == null ? unitPriceBasisRate != null : !UNIT_PRICE_BASIS_RATE_EDEFAULT.equals(unitPriceBasisRate);
      case EdilangPackage.RATE_DETAIL__UNIT_PRICE_BASIS_VALUE:
        return UNIT_PRICE_BASIS_VALUE_EDEFAULT == null ? unitPriceBasisValue != null : !UNIT_PRICE_BASIS_VALUE_EDEFAULT.equals(unitPriceBasisValue);
      case EdilangPackage.RATE_DETAIL__MEASUREMENT_UNIT_CODE:
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
    result.append(" (rateTypeCodeQualifier: ");
    result.append(rateTypeCodeQualifier);
    result.append(", unitPriceBasisRate: ");
    result.append(unitPriceBasisRate);
    result.append(", unitPriceBasisValue: ");
    result.append(unitPriceBasisValue);
    result.append(", measurementUnitCode: ");
    result.append(measurementUnitCode);
    result.append(')');
    return result.toString();
  }

} //RateDetailImpl

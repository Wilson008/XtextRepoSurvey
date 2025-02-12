/**
 * generated by Xtext 2.35.0
 */
package io.thlaegler.edifact.edilang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rate Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.RateDetail#getRateTypeCodeQualifier <em>Rate Type Code Qualifier</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.RateDetail#getUnitPriceBasisRate <em>Unit Price Basis Rate</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.RateDetail#getUnitPriceBasisValue <em>Unit Price Basis Value</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.RateDetail#getMeasurementUnitCode <em>Measurement Unit Code</em>}</li>
 * </ul>
 *
 * @see io.thlaegler.edifact.edilang.EdilangPackage#getRateDetail()
 * @model
 * @generated
 */
public interface RateDetail extends AbstractEdiFunction
{
  /**
   * Returns the value of the '<em><b>Rate Type Code Qualifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rate Type Code Qualifier</em>' attribute.
   * @see #setRateTypeCodeQualifier(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getRateDetail_RateTypeCodeQualifier()
   * @model
   * @generated
   */
  String getRateTypeCodeQualifier();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.RateDetail#getRateTypeCodeQualifier <em>Rate Type Code Qualifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rate Type Code Qualifier</em>' attribute.
   * @see #getRateTypeCodeQualifier()
   * @generated
   */
  void setRateTypeCodeQualifier(String value);

  /**
   * Returns the value of the '<em><b>Unit Price Basis Rate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unit Price Basis Rate</em>' attribute.
   * @see #setUnitPriceBasisRate(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getRateDetail_UnitPriceBasisRate()
   * @model
   * @generated
   */
  String getUnitPriceBasisRate();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.RateDetail#getUnitPriceBasisRate <em>Unit Price Basis Rate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unit Price Basis Rate</em>' attribute.
   * @see #getUnitPriceBasisRate()
   * @generated
   */
  void setUnitPriceBasisRate(String value);

  /**
   * Returns the value of the '<em><b>Unit Price Basis Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unit Price Basis Value</em>' attribute.
   * @see #setUnitPriceBasisValue(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getRateDetail_UnitPriceBasisValue()
   * @model
   * @generated
   */
  String getUnitPriceBasisValue();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.RateDetail#getUnitPriceBasisValue <em>Unit Price Basis Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unit Price Basis Value</em>' attribute.
   * @see #getUnitPriceBasisValue()
   * @generated
   */
  void setUnitPriceBasisValue(String value);

  /**
   * Returns the value of the '<em><b>Measurement Unit Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Measurement Unit Code</em>' attribute.
   * @see #setMeasurementUnitCode(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getRateDetail_MeasurementUnitCode()
   * @model
   * @generated
   */
  String getMeasurementUnitCode();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.RateDetail#getMeasurementUnitCode <em>Measurement Unit Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Measurement Unit Code</em>' attribute.
   * @see #getMeasurementUnitCode()
   * @generated
   */
  void setMeasurementUnitCode(String value);

} // RateDetail

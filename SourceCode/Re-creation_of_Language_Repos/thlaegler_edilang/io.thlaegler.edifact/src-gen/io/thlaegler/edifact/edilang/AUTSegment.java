/**
 * generated by Xtext 2.35.0
 */
package io.thlaegler.edifact.edilang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AUT Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.AUTSegment#getValidationResultValue <em>Validation Result Value</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.AUTSegment#getValidationKeyIdentifier <em>Validation Key Identifier</em>}</li>
 * </ul>
 *
 * @see io.thlaegler.edifact.edilang.EdilangPackage#getAUTSegment()
 * @model
 * @generated
 */
public interface AUTSegment extends AbstractEdiSegment
{
  /**
   * Returns the value of the '<em><b>Validation Result Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Validation Result Value</em>' attribute.
   * @see #setValidationResultValue(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getAUTSegment_ValidationResultValue()
   * @model
   * @generated
   */
  String getValidationResultValue();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.AUTSegment#getValidationResultValue <em>Validation Result Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Validation Result Value</em>' attribute.
   * @see #getValidationResultValue()
   * @generated
   */
  void setValidationResultValue(String value);

  /**
   * Returns the value of the '<em><b>Validation Key Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Validation Key Identifier</em>' attribute.
   * @see #setValidationKeyIdentifier(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getAUTSegment_ValidationKeyIdentifier()
   * @model
   * @generated
   */
  String getValidationKeyIdentifier();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.AUTSegment#getValidationKeyIdentifier <em>Validation Key Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Validation Key Identifier</em>' attribute.
   * @see #getValidationKeyIdentifier()
   * @generated
   */
  void setValidationKeyIdentifier(String value);

} // AUTSegment

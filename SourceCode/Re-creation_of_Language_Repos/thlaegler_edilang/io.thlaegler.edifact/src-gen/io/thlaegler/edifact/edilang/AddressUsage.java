/**
 * generated by Xtext 2.35.0
 */
package io.thlaegler.edifact.edilang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.AddressUsage#getAddressPurposeCode <em>Address Purpose Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.AddressUsage#getAddressTypeCode <em>Address Type Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.AddressUsage#getAddressStatusCode <em>Address Status Code</em>}</li>
 * </ul>
 *
 * @see io.thlaegler.edifact.edilang.EdilangPackage#getAddressUsage()
 * @model
 * @generated
 */
public interface AddressUsage extends AbstractEdiFunction
{
  /**
   * Returns the value of the '<em><b>Address Purpose Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Address Purpose Code</em>' attribute.
   * @see #setAddressPurposeCode(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getAddressUsage_AddressPurposeCode()
   * @model
   * @generated
   */
  String getAddressPurposeCode();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.AddressUsage#getAddressPurposeCode <em>Address Purpose Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Address Purpose Code</em>' attribute.
   * @see #getAddressPurposeCode()
   * @generated
   */
  void setAddressPurposeCode(String value);

  /**
   * Returns the value of the '<em><b>Address Type Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Address Type Code</em>' attribute.
   * @see #setAddressTypeCode(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getAddressUsage_AddressTypeCode()
   * @model
   * @generated
   */
  String getAddressTypeCode();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.AddressUsage#getAddressTypeCode <em>Address Type Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Address Type Code</em>' attribute.
   * @see #getAddressTypeCode()
   * @generated
   */
  void setAddressTypeCode(String value);

  /**
   * Returns the value of the '<em><b>Address Status Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Address Status Code</em>' attribute.
   * @see #setAddressStatusCode(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getAddressUsage_AddressStatusCode()
   * @model
   * @generated
   */
  String getAddressStatusCode();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.AddressUsage#getAddressStatusCode <em>Address Status Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Address Status Code</em>' attribute.
   * @see #getAddressStatusCode()
   * @generated
   */
  void setAddressStatusCode(String value);

} // AddressUsage

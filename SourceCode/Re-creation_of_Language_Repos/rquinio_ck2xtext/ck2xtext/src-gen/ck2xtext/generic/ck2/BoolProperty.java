/**
 * generated by Xtext 2.35.0
 */
package ck2xtext.generic.ck2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bool Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ck2xtext.generic.ck2.BoolProperty#getKey <em>Key</em>}</li>
 *   <li>{@link ck2xtext.generic.ck2.BoolProperty#isValue <em>Value</em>}</li>
 * </ul>
 *
 * @see ck2xtext.generic.ck2.Ck2Package#getBoolProperty()
 * @model
 * @generated
 */
public interface BoolProperty extends Property
{
  /**
   * Returns the value of the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key</em>' attribute.
   * @see #setKey(String)
   * @see ck2xtext.generic.ck2.Ck2Package#getBoolProperty_Key()
   * @model
   * @generated
   */
  String getKey();

  /**
   * Sets the value of the '{@link ck2xtext.generic.ck2.BoolProperty#getKey <em>Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key</em>' attribute.
   * @see #getKey()
   * @generated
   */
  void setKey(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(boolean)
   * @see ck2xtext.generic.ck2.Ck2Package#getBoolProperty_Value()
   * @model
   * @generated
   */
  boolean isValue();

  /**
   * Sets the value of the '{@link ck2xtext.generic.ck2.BoolProperty#isValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #isValue()
   * @generated
   */
  void setValue(boolean value);

} // BoolProperty

/**
 * generated by Xtext 2.35.0
 */
package io.thlaegler.edifact.edilang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Language Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.LanguageDetail#getLanguageNameCode <em>Language Name Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.LanguageDetail#getLanguageName <em>Language Name</em>}</li>
 * </ul>
 *
 * @see io.thlaegler.edifact.edilang.EdilangPackage#getLanguageDetail()
 * @model
 * @generated
 */
public interface LanguageDetail extends AbstractEdiFunction
{
  /**
   * Returns the value of the '<em><b>Language Name Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Language Name Code</em>' attribute.
   * @see #setLanguageNameCode(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getLanguageDetail_LanguageNameCode()
   * @model
   * @generated
   */
  String getLanguageNameCode();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.LanguageDetail#getLanguageNameCode <em>Language Name Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Language Name Code</em>' attribute.
   * @see #getLanguageNameCode()
   * @generated
   */
  void setLanguageNameCode(String value);

  /**
   * Returns the value of the '<em><b>Language Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Language Name</em>' attribute.
   * @see #setLanguageName(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getLanguageDetail_LanguageName()
   * @model
   * @generated
   */
  String getLanguageName();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.LanguageDetail#getLanguageName <em>Language Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Language Name</em>' attribute.
   * @see #getLanguageName()
   * @generated
   */
  void setLanguageName(String value);

} // LanguageDetail

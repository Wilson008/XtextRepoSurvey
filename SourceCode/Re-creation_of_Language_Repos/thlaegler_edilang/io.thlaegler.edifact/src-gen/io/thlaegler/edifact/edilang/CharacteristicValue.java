/**
 * generated by Xtext 2.35.0
 */
package io.thlaegler.edifact.edilang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Characteristic Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.CharacteristicValue#getCharacteristicValueDescriptionCode <em>Characteristic Value Description Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.CharacteristicValue#getCodeListIdentificationCode <em>Code List Identification Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.CharacteristicValue#getCodeListResponsibleAgencyCode <em>Code List Responsible Agency Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.CharacteristicValue#getCharacteristicValueDescription <em>Characteristic Value Description</em>}</li>
 * </ul>
 *
 * @see io.thlaegler.edifact.edilang.EdilangPackage#getCharacteristicValue()
 * @model
 * @generated
 */
public interface CharacteristicValue extends AbstractEdiFunction
{
  /**
   * Returns the value of the '<em><b>Characteristic Value Description Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Characteristic Value Description Code</em>' attribute.
   * @see #setCharacteristicValueDescriptionCode(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getCharacteristicValue_CharacteristicValueDescriptionCode()
   * @model
   * @generated
   */
  String getCharacteristicValueDescriptionCode();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.CharacteristicValue#getCharacteristicValueDescriptionCode <em>Characteristic Value Description Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Characteristic Value Description Code</em>' attribute.
   * @see #getCharacteristicValueDescriptionCode()
   * @generated
   */
  void setCharacteristicValueDescriptionCode(String value);

  /**
   * Returns the value of the '<em><b>Code List Identification Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Code List Identification Code</em>' attribute.
   * @see #setCodeListIdentificationCode(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getCharacteristicValue_CodeListIdentificationCode()
   * @model
   * @generated
   */
  String getCodeListIdentificationCode();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.CharacteristicValue#getCodeListIdentificationCode <em>Code List Identification Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Code List Identification Code</em>' attribute.
   * @see #getCodeListIdentificationCode()
   * @generated
   */
  void setCodeListIdentificationCode(String value);

  /**
   * Returns the value of the '<em><b>Code List Responsible Agency Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Code List Responsible Agency Code</em>' attribute.
   * @see #setCodeListResponsibleAgencyCode(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getCharacteristicValue_CodeListResponsibleAgencyCode()
   * @model
   * @generated
   */
  String getCodeListResponsibleAgencyCode();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.CharacteristicValue#getCodeListResponsibleAgencyCode <em>Code List Responsible Agency Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Code List Responsible Agency Code</em>' attribute.
   * @see #getCodeListResponsibleAgencyCode()
   * @generated
   */
  void setCodeListResponsibleAgencyCode(String value);

  /**
   * Returns the value of the '<em><b>Characteristic Value Description</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Characteristic Value Description</em>' attribute list.
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getCharacteristicValue_CharacteristicValueDescription()
   * @model unique="false"
   * @generated
   */
  EList<String> getCharacteristicValueDescription();

} // CharacteristicValue

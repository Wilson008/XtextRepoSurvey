/**
 * generated by Xtext 2.35.0
 */
package io.thlaegler.edifact.edilang.impl;

import io.thlaegler.edifact.edilang.EdilangPackage;
import io.thlaegler.edifact.edilang.ProductCharacteristic;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Characteristic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.ProductCharacteristicImpl#getCharacteristicDescriptionCode <em>Characteristic Description Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.ProductCharacteristicImpl#getCodeListIdentificationCode <em>Code List Identification Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.ProductCharacteristicImpl#getCodeListResponsibleAgencyCode <em>Code List Responsible Agency Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.ProductCharacteristicImpl#getCharacteristicDescription1 <em>Characteristic Description1</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.ProductCharacteristicImpl#getCharacteristicDescription2 <em>Characteristic Description2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductCharacteristicImpl extends AbstractEdiFunctionImpl implements ProductCharacteristic
{
  /**
   * The default value of the '{@link #getCharacteristicDescriptionCode() <em>Characteristic Description Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCharacteristicDescriptionCode()
   * @generated
   * @ordered
   */
  protected static final String CHARACTERISTIC_DESCRIPTION_CODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCharacteristicDescriptionCode() <em>Characteristic Description Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCharacteristicDescriptionCode()
   * @generated
   * @ordered
   */
  protected String characteristicDescriptionCode = CHARACTERISTIC_DESCRIPTION_CODE_EDEFAULT;

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
   * The default value of the '{@link #getCharacteristicDescription1() <em>Characteristic Description1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCharacteristicDescription1()
   * @generated
   * @ordered
   */
  protected static final String CHARACTERISTIC_DESCRIPTION1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCharacteristicDescription1() <em>Characteristic Description1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCharacteristicDescription1()
   * @generated
   * @ordered
   */
  protected String characteristicDescription1 = CHARACTERISTIC_DESCRIPTION1_EDEFAULT;

  /**
   * The default value of the '{@link #getCharacteristicDescription2() <em>Characteristic Description2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCharacteristicDescription2()
   * @generated
   * @ordered
   */
  protected static final String CHARACTERISTIC_DESCRIPTION2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCharacteristicDescription2() <em>Characteristic Description2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCharacteristicDescription2()
   * @generated
   * @ordered
   */
  protected String characteristicDescription2 = CHARACTERISTIC_DESCRIPTION2_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProductCharacteristicImpl()
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
    return EdilangPackage.eINSTANCE.getProductCharacteristic();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCharacteristicDescriptionCode()
  {
    return characteristicDescriptionCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCharacteristicDescriptionCode(String newCharacteristicDescriptionCode)
  {
    String oldCharacteristicDescriptionCode = characteristicDescriptionCode;
    characteristicDescriptionCode = newCharacteristicDescriptionCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.PRODUCT_CHARACTERISTIC__CHARACTERISTIC_DESCRIPTION_CODE, oldCharacteristicDescriptionCode, characteristicDescriptionCode));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.PRODUCT_CHARACTERISTIC__CODE_LIST_IDENTIFICATION_CODE, oldCodeListIdentificationCode, codeListIdentificationCode));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.PRODUCT_CHARACTERISTIC__CODE_LIST_RESPONSIBLE_AGENCY_CODE, oldCodeListResponsibleAgencyCode, codeListResponsibleAgencyCode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCharacteristicDescription1()
  {
    return characteristicDescription1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCharacteristicDescription1(String newCharacteristicDescription1)
  {
    String oldCharacteristicDescription1 = characteristicDescription1;
    characteristicDescription1 = newCharacteristicDescription1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.PRODUCT_CHARACTERISTIC__CHARACTERISTIC_DESCRIPTION1, oldCharacteristicDescription1, characteristicDescription1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCharacteristicDescription2()
  {
    return characteristicDescription2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCharacteristicDescription2(String newCharacteristicDescription2)
  {
    String oldCharacteristicDescription2 = characteristicDescription2;
    characteristicDescription2 = newCharacteristicDescription2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.PRODUCT_CHARACTERISTIC__CHARACTERISTIC_DESCRIPTION2, oldCharacteristicDescription2, characteristicDescription2));
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
      case EdilangPackage.PRODUCT_CHARACTERISTIC__CHARACTERISTIC_DESCRIPTION_CODE:
        return getCharacteristicDescriptionCode();
      case EdilangPackage.PRODUCT_CHARACTERISTIC__CODE_LIST_IDENTIFICATION_CODE:
        return getCodeListIdentificationCode();
      case EdilangPackage.PRODUCT_CHARACTERISTIC__CODE_LIST_RESPONSIBLE_AGENCY_CODE:
        return getCodeListResponsibleAgencyCode();
      case EdilangPackage.PRODUCT_CHARACTERISTIC__CHARACTERISTIC_DESCRIPTION1:
        return getCharacteristicDescription1();
      case EdilangPackage.PRODUCT_CHARACTERISTIC__CHARACTERISTIC_DESCRIPTION2:
        return getCharacteristicDescription2();
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
      case EdilangPackage.PRODUCT_CHARACTERISTIC__CHARACTERISTIC_DESCRIPTION_CODE:
        setCharacteristicDescriptionCode((String)newValue);
        return;
      case EdilangPackage.PRODUCT_CHARACTERISTIC__CODE_LIST_IDENTIFICATION_CODE:
        setCodeListIdentificationCode((String)newValue);
        return;
      case EdilangPackage.PRODUCT_CHARACTERISTIC__CODE_LIST_RESPONSIBLE_AGENCY_CODE:
        setCodeListResponsibleAgencyCode((String)newValue);
        return;
      case EdilangPackage.PRODUCT_CHARACTERISTIC__CHARACTERISTIC_DESCRIPTION1:
        setCharacteristicDescription1((String)newValue);
        return;
      case EdilangPackage.PRODUCT_CHARACTERISTIC__CHARACTERISTIC_DESCRIPTION2:
        setCharacteristicDescription2((String)newValue);
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
      case EdilangPackage.PRODUCT_CHARACTERISTIC__CHARACTERISTIC_DESCRIPTION_CODE:
        setCharacteristicDescriptionCode(CHARACTERISTIC_DESCRIPTION_CODE_EDEFAULT);
        return;
      case EdilangPackage.PRODUCT_CHARACTERISTIC__CODE_LIST_IDENTIFICATION_CODE:
        setCodeListIdentificationCode(CODE_LIST_IDENTIFICATION_CODE_EDEFAULT);
        return;
      case EdilangPackage.PRODUCT_CHARACTERISTIC__CODE_LIST_RESPONSIBLE_AGENCY_CODE:
        setCodeListResponsibleAgencyCode(CODE_LIST_RESPONSIBLE_AGENCY_CODE_EDEFAULT);
        return;
      case EdilangPackage.PRODUCT_CHARACTERISTIC__CHARACTERISTIC_DESCRIPTION1:
        setCharacteristicDescription1(CHARACTERISTIC_DESCRIPTION1_EDEFAULT);
        return;
      case EdilangPackage.PRODUCT_CHARACTERISTIC__CHARACTERISTIC_DESCRIPTION2:
        setCharacteristicDescription2(CHARACTERISTIC_DESCRIPTION2_EDEFAULT);
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
      case EdilangPackage.PRODUCT_CHARACTERISTIC__CHARACTERISTIC_DESCRIPTION_CODE:
        return CHARACTERISTIC_DESCRIPTION_CODE_EDEFAULT == null ? characteristicDescriptionCode != null : !CHARACTERISTIC_DESCRIPTION_CODE_EDEFAULT.equals(characteristicDescriptionCode);
      case EdilangPackage.PRODUCT_CHARACTERISTIC__CODE_LIST_IDENTIFICATION_CODE:
        return CODE_LIST_IDENTIFICATION_CODE_EDEFAULT == null ? codeListIdentificationCode != null : !CODE_LIST_IDENTIFICATION_CODE_EDEFAULT.equals(codeListIdentificationCode);
      case EdilangPackage.PRODUCT_CHARACTERISTIC__CODE_LIST_RESPONSIBLE_AGENCY_CODE:
        return CODE_LIST_RESPONSIBLE_AGENCY_CODE_EDEFAULT == null ? codeListResponsibleAgencyCode != null : !CODE_LIST_RESPONSIBLE_AGENCY_CODE_EDEFAULT.equals(codeListResponsibleAgencyCode);
      case EdilangPackage.PRODUCT_CHARACTERISTIC__CHARACTERISTIC_DESCRIPTION1:
        return CHARACTERISTIC_DESCRIPTION1_EDEFAULT == null ? characteristicDescription1 != null : !CHARACTERISTIC_DESCRIPTION1_EDEFAULT.equals(characteristicDescription1);
      case EdilangPackage.PRODUCT_CHARACTERISTIC__CHARACTERISTIC_DESCRIPTION2:
        return CHARACTERISTIC_DESCRIPTION2_EDEFAULT == null ? characteristicDescription2 != null : !CHARACTERISTIC_DESCRIPTION2_EDEFAULT.equals(characteristicDescription2);
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
    result.append(" (characteristicDescriptionCode: ");
    result.append(characteristicDescriptionCode);
    result.append(", codeListIdentificationCode: ");
    result.append(codeListIdentificationCode);
    result.append(", codeListResponsibleAgencyCode: ");
    result.append(codeListResponsibleAgencyCode);
    result.append(", characteristicDescription1: ");
    result.append(characteristicDescription1);
    result.append(", characteristicDescription2: ");
    result.append(characteristicDescription2);
    result.append(')');
    return result.toString();
  }

} //ProductCharacteristicImpl

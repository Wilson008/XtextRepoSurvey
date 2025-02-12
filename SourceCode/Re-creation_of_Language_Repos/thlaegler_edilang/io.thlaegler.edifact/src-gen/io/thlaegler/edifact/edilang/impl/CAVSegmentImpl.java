/**
 * generated by Xtext 2.35.0
 */
package io.thlaegler.edifact.edilang.impl;

import io.thlaegler.edifact.edilang.CAVSegment;
import io.thlaegler.edifact.edilang.CharacteristicValue;
import io.thlaegler.edifact.edilang.EdilangPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CAV Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.CAVSegmentImpl#getCharacteristicValue <em>Characteristic Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CAVSegmentImpl extends AbstractEdiSegmentImpl implements CAVSegment
{
  /**
   * The cached value of the '{@link #getCharacteristicValue() <em>Characteristic Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCharacteristicValue()
   * @generated
   * @ordered
   */
  protected CharacteristicValue characteristicValue;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CAVSegmentImpl()
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
    return EdilangPackage.eINSTANCE.getCAVSegment();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CharacteristicValue getCharacteristicValue()
  {
    return characteristicValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCharacteristicValue(CharacteristicValue newCharacteristicValue, NotificationChain msgs)
  {
    CharacteristicValue oldCharacteristicValue = characteristicValue;
    characteristicValue = newCharacteristicValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdilangPackage.CAV_SEGMENT__CHARACTERISTIC_VALUE, oldCharacteristicValue, newCharacteristicValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCharacteristicValue(CharacteristicValue newCharacteristicValue)
  {
    if (newCharacteristicValue != characteristicValue)
    {
      NotificationChain msgs = null;
      if (characteristicValue != null)
        msgs = ((InternalEObject)characteristicValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdilangPackage.CAV_SEGMENT__CHARACTERISTIC_VALUE, null, msgs);
      if (newCharacteristicValue != null)
        msgs = ((InternalEObject)newCharacteristicValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdilangPackage.CAV_SEGMENT__CHARACTERISTIC_VALUE, null, msgs);
      msgs = basicSetCharacteristicValue(newCharacteristicValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.CAV_SEGMENT__CHARACTERISTIC_VALUE, newCharacteristicValue, newCharacteristicValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case EdilangPackage.CAV_SEGMENT__CHARACTERISTIC_VALUE:
        return basicSetCharacteristicValue(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case EdilangPackage.CAV_SEGMENT__CHARACTERISTIC_VALUE:
        return getCharacteristicValue();
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
      case EdilangPackage.CAV_SEGMENT__CHARACTERISTIC_VALUE:
        setCharacteristicValue((CharacteristicValue)newValue);
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
      case EdilangPackage.CAV_SEGMENT__CHARACTERISTIC_VALUE:
        setCharacteristicValue((CharacteristicValue)null);
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
      case EdilangPackage.CAV_SEGMENT__CHARACTERISTIC_VALUE:
        return characteristicValue != null;
    }
    return super.eIsSet(featureID);
  }

} //CAVSegmentImpl

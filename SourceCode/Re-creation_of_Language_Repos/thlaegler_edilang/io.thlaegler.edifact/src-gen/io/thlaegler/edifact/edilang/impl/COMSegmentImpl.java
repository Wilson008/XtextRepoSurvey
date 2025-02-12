/**
 * generated by Xtext 2.35.0
 */
package io.thlaegler.edifact.edilang.impl;

import io.thlaegler.edifact.edilang.COMSegment;
import io.thlaegler.edifact.edilang.CommunicationContact;
import io.thlaegler.edifact.edilang.EdilangPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>COM Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.COMSegmentImpl#getCommunicationContacts <em>Communication Contacts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class COMSegmentImpl extends AbstractEdiSegmentImpl implements COMSegment
{
  /**
   * The cached value of the '{@link #getCommunicationContacts() <em>Communication Contacts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommunicationContacts()
   * @generated
   * @ordered
   */
  protected EList<CommunicationContact> communicationContacts;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected COMSegmentImpl()
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
    return EdilangPackage.eINSTANCE.getCOMSegment();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<CommunicationContact> getCommunicationContacts()
  {
    if (communicationContacts == null)
    {
      communicationContacts = new EObjectContainmentEList<CommunicationContact>(CommunicationContact.class, this, EdilangPackage.COM_SEGMENT__COMMUNICATION_CONTACTS);
    }
    return communicationContacts;
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
      case EdilangPackage.COM_SEGMENT__COMMUNICATION_CONTACTS:
        return ((InternalEList<?>)getCommunicationContacts()).basicRemove(otherEnd, msgs);
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
      case EdilangPackage.COM_SEGMENT__COMMUNICATION_CONTACTS:
        return getCommunicationContacts();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EdilangPackage.COM_SEGMENT__COMMUNICATION_CONTACTS:
        getCommunicationContacts().clear();
        getCommunicationContacts().addAll((Collection<? extends CommunicationContact>)newValue);
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
      case EdilangPackage.COM_SEGMENT__COMMUNICATION_CONTACTS:
        getCommunicationContacts().clear();
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
      case EdilangPackage.COM_SEGMENT__COMMUNICATION_CONTACTS:
        return communicationContacts != null && !communicationContacts.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //COMSegmentImpl

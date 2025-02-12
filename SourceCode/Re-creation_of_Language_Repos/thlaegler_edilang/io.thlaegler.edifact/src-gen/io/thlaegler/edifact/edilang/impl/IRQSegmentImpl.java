/**
 * generated by Xtext 2.35.0
 */
package io.thlaegler.edifact.edilang.impl;

import io.thlaegler.edifact.edilang.EdilangPackage;
import io.thlaegler.edifact.edilang.IRQSegment;
import io.thlaegler.edifact.edilang.InformationRequest;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IRQ Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.IRQSegmentImpl#getInformationRequest <em>Information Request</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IRQSegmentImpl extends AbstractEdiSegmentImpl implements IRQSegment
{
  /**
   * The cached value of the '{@link #getInformationRequest() <em>Information Request</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInformationRequest()
   * @generated
   * @ordered
   */
  protected InformationRequest informationRequest;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IRQSegmentImpl()
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
    return EdilangPackage.eINSTANCE.getIRQSegment();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InformationRequest getInformationRequest()
  {
    return informationRequest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInformationRequest(InformationRequest newInformationRequest, NotificationChain msgs)
  {
    InformationRequest oldInformationRequest = informationRequest;
    informationRequest = newInformationRequest;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdilangPackage.IRQ_SEGMENT__INFORMATION_REQUEST, oldInformationRequest, newInformationRequest);
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
  public void setInformationRequest(InformationRequest newInformationRequest)
  {
    if (newInformationRequest != informationRequest)
    {
      NotificationChain msgs = null;
      if (informationRequest != null)
        msgs = ((InternalEObject)informationRequest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdilangPackage.IRQ_SEGMENT__INFORMATION_REQUEST, null, msgs);
      if (newInformationRequest != null)
        msgs = ((InternalEObject)newInformationRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdilangPackage.IRQ_SEGMENT__INFORMATION_REQUEST, null, msgs);
      msgs = basicSetInformationRequest(newInformationRequest, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.IRQ_SEGMENT__INFORMATION_REQUEST, newInformationRequest, newInformationRequest));
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
      case EdilangPackage.IRQ_SEGMENT__INFORMATION_REQUEST:
        return basicSetInformationRequest(null, msgs);
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
      case EdilangPackage.IRQ_SEGMENT__INFORMATION_REQUEST:
        return getInformationRequest();
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
      case EdilangPackage.IRQ_SEGMENT__INFORMATION_REQUEST:
        setInformationRequest((InformationRequest)newValue);
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
      case EdilangPackage.IRQ_SEGMENT__INFORMATION_REQUEST:
        setInformationRequest((InformationRequest)null);
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
      case EdilangPackage.IRQ_SEGMENT__INFORMATION_REQUEST:
        return informationRequest != null;
    }
    return super.eIsSet(featureID);
  }

} //IRQSegmentImpl

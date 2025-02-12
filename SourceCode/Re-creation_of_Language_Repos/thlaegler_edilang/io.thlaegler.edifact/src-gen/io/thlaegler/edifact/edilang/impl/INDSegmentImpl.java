/**
 * generated by Xtext 2.35.0
 */
package io.thlaegler.edifact.edilang.impl;

import io.thlaegler.edifact.edilang.EdilangPackage;
import io.thlaegler.edifact.edilang.INDSegment;
import io.thlaegler.edifact.edilang.IndexIdentification;
import io.thlaegler.edifact.edilang.IndexValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IND Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.INDSegmentImpl#getIndexIdentification <em>Index Identification</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.INDSegmentImpl#getIndexValue <em>Index Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class INDSegmentImpl extends AbstractEdiSegmentImpl implements INDSegment
{
  /**
   * The cached value of the '{@link #getIndexIdentification() <em>Index Identification</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndexIdentification()
   * @generated
   * @ordered
   */
  protected IndexIdentification indexIdentification;

  /**
   * The cached value of the '{@link #getIndexValue() <em>Index Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndexValue()
   * @generated
   * @ordered
   */
  protected IndexValue indexValue;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected INDSegmentImpl()
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
    return EdilangPackage.eINSTANCE.getINDSegment();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IndexIdentification getIndexIdentification()
  {
    return indexIdentification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIndexIdentification(IndexIdentification newIndexIdentification, NotificationChain msgs)
  {
    IndexIdentification oldIndexIdentification = indexIdentification;
    indexIdentification = newIndexIdentification;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdilangPackage.IND_SEGMENT__INDEX_IDENTIFICATION, oldIndexIdentification, newIndexIdentification);
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
  public void setIndexIdentification(IndexIdentification newIndexIdentification)
  {
    if (newIndexIdentification != indexIdentification)
    {
      NotificationChain msgs = null;
      if (indexIdentification != null)
        msgs = ((InternalEObject)indexIdentification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdilangPackage.IND_SEGMENT__INDEX_IDENTIFICATION, null, msgs);
      if (newIndexIdentification != null)
        msgs = ((InternalEObject)newIndexIdentification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdilangPackage.IND_SEGMENT__INDEX_IDENTIFICATION, null, msgs);
      msgs = basicSetIndexIdentification(newIndexIdentification, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.IND_SEGMENT__INDEX_IDENTIFICATION, newIndexIdentification, newIndexIdentification));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IndexValue getIndexValue()
  {
    return indexValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIndexValue(IndexValue newIndexValue, NotificationChain msgs)
  {
    IndexValue oldIndexValue = indexValue;
    indexValue = newIndexValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdilangPackage.IND_SEGMENT__INDEX_VALUE, oldIndexValue, newIndexValue);
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
  public void setIndexValue(IndexValue newIndexValue)
  {
    if (newIndexValue != indexValue)
    {
      NotificationChain msgs = null;
      if (indexValue != null)
        msgs = ((InternalEObject)indexValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdilangPackage.IND_SEGMENT__INDEX_VALUE, null, msgs);
      if (newIndexValue != null)
        msgs = ((InternalEObject)newIndexValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdilangPackage.IND_SEGMENT__INDEX_VALUE, null, msgs);
      msgs = basicSetIndexValue(newIndexValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.IND_SEGMENT__INDEX_VALUE, newIndexValue, newIndexValue));
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
      case EdilangPackage.IND_SEGMENT__INDEX_IDENTIFICATION:
        return basicSetIndexIdentification(null, msgs);
      case EdilangPackage.IND_SEGMENT__INDEX_VALUE:
        return basicSetIndexValue(null, msgs);
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
      case EdilangPackage.IND_SEGMENT__INDEX_IDENTIFICATION:
        return getIndexIdentification();
      case EdilangPackage.IND_SEGMENT__INDEX_VALUE:
        return getIndexValue();
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
      case EdilangPackage.IND_SEGMENT__INDEX_IDENTIFICATION:
        setIndexIdentification((IndexIdentification)newValue);
        return;
      case EdilangPackage.IND_SEGMENT__INDEX_VALUE:
        setIndexValue((IndexValue)newValue);
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
      case EdilangPackage.IND_SEGMENT__INDEX_IDENTIFICATION:
        setIndexIdentification((IndexIdentification)null);
        return;
      case EdilangPackage.IND_SEGMENT__INDEX_VALUE:
        setIndexValue((IndexValue)null);
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
      case EdilangPackage.IND_SEGMENT__INDEX_IDENTIFICATION:
        return indexIdentification != null;
      case EdilangPackage.IND_SEGMENT__INDEX_VALUE:
        return indexValue != null;
    }
    return super.eIsSet(featureID);
  }

} //INDSegmentImpl

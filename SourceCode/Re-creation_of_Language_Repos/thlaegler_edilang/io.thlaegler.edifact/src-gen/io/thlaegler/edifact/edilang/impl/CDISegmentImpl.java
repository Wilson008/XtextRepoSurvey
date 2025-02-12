/**
 * generated by Xtext 2.35.0
 */
package io.thlaegler.edifact.edilang.impl;

import io.thlaegler.edifact.edilang.CDISegment;
import io.thlaegler.edifact.edilang.EdilangPackage;
import io.thlaegler.edifact.edilang.PhysicalLogicalStateInformation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CDI Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.CDISegmentImpl#getPhysicalLogicalStateTypeCodeQualifier <em>Physical Logical State Type Code Qualifier</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.CDISegmentImpl#getPhysicalLogicalStateInformation <em>Physical Logical State Information</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CDISegmentImpl extends AbstractEdiSegmentImpl implements CDISegment
{
  /**
   * The default value of the '{@link #getPhysicalLogicalStateTypeCodeQualifier() <em>Physical Logical State Type Code Qualifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPhysicalLogicalStateTypeCodeQualifier()
   * @generated
   * @ordered
   */
  protected static final String PHYSICAL_LOGICAL_STATE_TYPE_CODE_QUALIFIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPhysicalLogicalStateTypeCodeQualifier() <em>Physical Logical State Type Code Qualifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPhysicalLogicalStateTypeCodeQualifier()
   * @generated
   * @ordered
   */
  protected String physicalLogicalStateTypeCodeQualifier = PHYSICAL_LOGICAL_STATE_TYPE_CODE_QUALIFIER_EDEFAULT;

  /**
   * The cached value of the '{@link #getPhysicalLogicalStateInformation() <em>Physical Logical State Information</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPhysicalLogicalStateInformation()
   * @generated
   * @ordered
   */
  protected PhysicalLogicalStateInformation physicalLogicalStateInformation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CDISegmentImpl()
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
    return EdilangPackage.eINSTANCE.getCDISegment();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPhysicalLogicalStateTypeCodeQualifier()
  {
    return physicalLogicalStateTypeCodeQualifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPhysicalLogicalStateTypeCodeQualifier(String newPhysicalLogicalStateTypeCodeQualifier)
  {
    String oldPhysicalLogicalStateTypeCodeQualifier = physicalLogicalStateTypeCodeQualifier;
    physicalLogicalStateTypeCodeQualifier = newPhysicalLogicalStateTypeCodeQualifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.CDI_SEGMENT__PHYSICAL_LOGICAL_STATE_TYPE_CODE_QUALIFIER, oldPhysicalLogicalStateTypeCodeQualifier, physicalLogicalStateTypeCodeQualifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PhysicalLogicalStateInformation getPhysicalLogicalStateInformation()
  {
    return physicalLogicalStateInformation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPhysicalLogicalStateInformation(PhysicalLogicalStateInformation newPhysicalLogicalStateInformation, NotificationChain msgs)
  {
    PhysicalLogicalStateInformation oldPhysicalLogicalStateInformation = physicalLogicalStateInformation;
    physicalLogicalStateInformation = newPhysicalLogicalStateInformation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdilangPackage.CDI_SEGMENT__PHYSICAL_LOGICAL_STATE_INFORMATION, oldPhysicalLogicalStateInformation, newPhysicalLogicalStateInformation);
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
  public void setPhysicalLogicalStateInformation(PhysicalLogicalStateInformation newPhysicalLogicalStateInformation)
  {
    if (newPhysicalLogicalStateInformation != physicalLogicalStateInformation)
    {
      NotificationChain msgs = null;
      if (physicalLogicalStateInformation != null)
        msgs = ((InternalEObject)physicalLogicalStateInformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdilangPackage.CDI_SEGMENT__PHYSICAL_LOGICAL_STATE_INFORMATION, null, msgs);
      if (newPhysicalLogicalStateInformation != null)
        msgs = ((InternalEObject)newPhysicalLogicalStateInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdilangPackage.CDI_SEGMENT__PHYSICAL_LOGICAL_STATE_INFORMATION, null, msgs);
      msgs = basicSetPhysicalLogicalStateInformation(newPhysicalLogicalStateInformation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.CDI_SEGMENT__PHYSICAL_LOGICAL_STATE_INFORMATION, newPhysicalLogicalStateInformation, newPhysicalLogicalStateInformation));
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
      case EdilangPackage.CDI_SEGMENT__PHYSICAL_LOGICAL_STATE_INFORMATION:
        return basicSetPhysicalLogicalStateInformation(null, msgs);
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
      case EdilangPackage.CDI_SEGMENT__PHYSICAL_LOGICAL_STATE_TYPE_CODE_QUALIFIER:
        return getPhysicalLogicalStateTypeCodeQualifier();
      case EdilangPackage.CDI_SEGMENT__PHYSICAL_LOGICAL_STATE_INFORMATION:
        return getPhysicalLogicalStateInformation();
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
      case EdilangPackage.CDI_SEGMENT__PHYSICAL_LOGICAL_STATE_TYPE_CODE_QUALIFIER:
        setPhysicalLogicalStateTypeCodeQualifier((String)newValue);
        return;
      case EdilangPackage.CDI_SEGMENT__PHYSICAL_LOGICAL_STATE_INFORMATION:
        setPhysicalLogicalStateInformation((PhysicalLogicalStateInformation)newValue);
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
      case EdilangPackage.CDI_SEGMENT__PHYSICAL_LOGICAL_STATE_TYPE_CODE_QUALIFIER:
        setPhysicalLogicalStateTypeCodeQualifier(PHYSICAL_LOGICAL_STATE_TYPE_CODE_QUALIFIER_EDEFAULT);
        return;
      case EdilangPackage.CDI_SEGMENT__PHYSICAL_LOGICAL_STATE_INFORMATION:
        setPhysicalLogicalStateInformation((PhysicalLogicalStateInformation)null);
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
      case EdilangPackage.CDI_SEGMENT__PHYSICAL_LOGICAL_STATE_TYPE_CODE_QUALIFIER:
        return PHYSICAL_LOGICAL_STATE_TYPE_CODE_QUALIFIER_EDEFAULT == null ? physicalLogicalStateTypeCodeQualifier != null : !PHYSICAL_LOGICAL_STATE_TYPE_CODE_QUALIFIER_EDEFAULT.equals(physicalLogicalStateTypeCodeQualifier);
      case EdilangPackage.CDI_SEGMENT__PHYSICAL_LOGICAL_STATE_INFORMATION:
        return physicalLogicalStateInformation != null;
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
    result.append(" (physicalLogicalStateTypeCodeQualifier: ");
    result.append(physicalLogicalStateTypeCodeQualifier);
    result.append(')');
    return result.toString();
  }

} //CDISegmentImpl

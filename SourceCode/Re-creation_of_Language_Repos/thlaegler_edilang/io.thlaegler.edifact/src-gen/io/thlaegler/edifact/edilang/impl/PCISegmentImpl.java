/**
 * generated by Xtext 2.35.0
 */
package io.thlaegler.edifact.edilang.impl;

import io.thlaegler.edifact.edilang.EdilangPackage;
import io.thlaegler.edifact.edilang.MarksLabels;
import io.thlaegler.edifact.edilang.PCISegment;
import io.thlaegler.edifact.edilang.TypeOfMarking;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCI Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.PCISegmentImpl#getMarketingInstructionsCode <em>Marketing Instructions Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.PCISegmentImpl#getMarksLabels <em>Marks Labels</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.PCISegmentImpl#getContainerPackageContentsIndicatorCode <em>Container Package Contents Indicator Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.PCISegmentImpl#getTypeOfMarking <em>Type Of Marking</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCISegmentImpl extends AbstractEdiSegmentImpl implements PCISegment
{
  /**
   * The default value of the '{@link #getMarketingInstructionsCode() <em>Marketing Instructions Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMarketingInstructionsCode()
   * @generated
   * @ordered
   */
  protected static final String MARKETING_INSTRUCTIONS_CODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMarketingInstructionsCode() <em>Marketing Instructions Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMarketingInstructionsCode()
   * @generated
   * @ordered
   */
  protected String marketingInstructionsCode = MARKETING_INSTRUCTIONS_CODE_EDEFAULT;

  /**
   * The cached value of the '{@link #getMarksLabels() <em>Marks Labels</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMarksLabels()
   * @generated
   * @ordered
   */
  protected MarksLabels marksLabels;

  /**
   * The default value of the '{@link #getContainerPackageContentsIndicatorCode() <em>Container Package Contents Indicator Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContainerPackageContentsIndicatorCode()
   * @generated
   * @ordered
   */
  protected static final String CONTAINER_PACKAGE_CONTENTS_INDICATOR_CODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getContainerPackageContentsIndicatorCode() <em>Container Package Contents Indicator Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContainerPackageContentsIndicatorCode()
   * @generated
   * @ordered
   */
  protected String containerPackageContentsIndicatorCode = CONTAINER_PACKAGE_CONTENTS_INDICATOR_CODE_EDEFAULT;

  /**
   * The cached value of the '{@link #getTypeOfMarking() <em>Type Of Marking</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeOfMarking()
   * @generated
   * @ordered
   */
  protected TypeOfMarking typeOfMarking;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PCISegmentImpl()
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
    return EdilangPackage.eINSTANCE.getPCISegment();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getMarketingInstructionsCode()
  {
    return marketingInstructionsCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMarketingInstructionsCode(String newMarketingInstructionsCode)
  {
    String oldMarketingInstructionsCode = marketingInstructionsCode;
    marketingInstructionsCode = newMarketingInstructionsCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.PCI_SEGMENT__MARKETING_INSTRUCTIONS_CODE, oldMarketingInstructionsCode, marketingInstructionsCode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MarksLabels getMarksLabels()
  {
    return marksLabels;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMarksLabels(MarksLabels newMarksLabels, NotificationChain msgs)
  {
    MarksLabels oldMarksLabels = marksLabels;
    marksLabels = newMarksLabels;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdilangPackage.PCI_SEGMENT__MARKS_LABELS, oldMarksLabels, newMarksLabels);
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
  public void setMarksLabels(MarksLabels newMarksLabels)
  {
    if (newMarksLabels != marksLabels)
    {
      NotificationChain msgs = null;
      if (marksLabels != null)
        msgs = ((InternalEObject)marksLabels).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdilangPackage.PCI_SEGMENT__MARKS_LABELS, null, msgs);
      if (newMarksLabels != null)
        msgs = ((InternalEObject)newMarksLabels).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdilangPackage.PCI_SEGMENT__MARKS_LABELS, null, msgs);
      msgs = basicSetMarksLabels(newMarksLabels, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.PCI_SEGMENT__MARKS_LABELS, newMarksLabels, newMarksLabels));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getContainerPackageContentsIndicatorCode()
  {
    return containerPackageContentsIndicatorCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setContainerPackageContentsIndicatorCode(String newContainerPackageContentsIndicatorCode)
  {
    String oldContainerPackageContentsIndicatorCode = containerPackageContentsIndicatorCode;
    containerPackageContentsIndicatorCode = newContainerPackageContentsIndicatorCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.PCI_SEGMENT__CONTAINER_PACKAGE_CONTENTS_INDICATOR_CODE, oldContainerPackageContentsIndicatorCode, containerPackageContentsIndicatorCode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TypeOfMarking getTypeOfMarking()
  {
    return typeOfMarking;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypeOfMarking(TypeOfMarking newTypeOfMarking, NotificationChain msgs)
  {
    TypeOfMarking oldTypeOfMarking = typeOfMarking;
    typeOfMarking = newTypeOfMarking;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdilangPackage.PCI_SEGMENT__TYPE_OF_MARKING, oldTypeOfMarking, newTypeOfMarking);
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
  public void setTypeOfMarking(TypeOfMarking newTypeOfMarking)
  {
    if (newTypeOfMarking != typeOfMarking)
    {
      NotificationChain msgs = null;
      if (typeOfMarking != null)
        msgs = ((InternalEObject)typeOfMarking).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdilangPackage.PCI_SEGMENT__TYPE_OF_MARKING, null, msgs);
      if (newTypeOfMarking != null)
        msgs = ((InternalEObject)newTypeOfMarking).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdilangPackage.PCI_SEGMENT__TYPE_OF_MARKING, null, msgs);
      msgs = basicSetTypeOfMarking(newTypeOfMarking, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.PCI_SEGMENT__TYPE_OF_MARKING, newTypeOfMarking, newTypeOfMarking));
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
      case EdilangPackage.PCI_SEGMENT__MARKS_LABELS:
        return basicSetMarksLabels(null, msgs);
      case EdilangPackage.PCI_SEGMENT__TYPE_OF_MARKING:
        return basicSetTypeOfMarking(null, msgs);
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
      case EdilangPackage.PCI_SEGMENT__MARKETING_INSTRUCTIONS_CODE:
        return getMarketingInstructionsCode();
      case EdilangPackage.PCI_SEGMENT__MARKS_LABELS:
        return getMarksLabels();
      case EdilangPackage.PCI_SEGMENT__CONTAINER_PACKAGE_CONTENTS_INDICATOR_CODE:
        return getContainerPackageContentsIndicatorCode();
      case EdilangPackage.PCI_SEGMENT__TYPE_OF_MARKING:
        return getTypeOfMarking();
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
      case EdilangPackage.PCI_SEGMENT__MARKETING_INSTRUCTIONS_CODE:
        setMarketingInstructionsCode((String)newValue);
        return;
      case EdilangPackage.PCI_SEGMENT__MARKS_LABELS:
        setMarksLabels((MarksLabels)newValue);
        return;
      case EdilangPackage.PCI_SEGMENT__CONTAINER_PACKAGE_CONTENTS_INDICATOR_CODE:
        setContainerPackageContentsIndicatorCode((String)newValue);
        return;
      case EdilangPackage.PCI_SEGMENT__TYPE_OF_MARKING:
        setTypeOfMarking((TypeOfMarking)newValue);
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
      case EdilangPackage.PCI_SEGMENT__MARKETING_INSTRUCTIONS_CODE:
        setMarketingInstructionsCode(MARKETING_INSTRUCTIONS_CODE_EDEFAULT);
        return;
      case EdilangPackage.PCI_SEGMENT__MARKS_LABELS:
        setMarksLabels((MarksLabels)null);
        return;
      case EdilangPackage.PCI_SEGMENT__CONTAINER_PACKAGE_CONTENTS_INDICATOR_CODE:
        setContainerPackageContentsIndicatorCode(CONTAINER_PACKAGE_CONTENTS_INDICATOR_CODE_EDEFAULT);
        return;
      case EdilangPackage.PCI_SEGMENT__TYPE_OF_MARKING:
        setTypeOfMarking((TypeOfMarking)null);
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
      case EdilangPackage.PCI_SEGMENT__MARKETING_INSTRUCTIONS_CODE:
        return MARKETING_INSTRUCTIONS_CODE_EDEFAULT == null ? marketingInstructionsCode != null : !MARKETING_INSTRUCTIONS_CODE_EDEFAULT.equals(marketingInstructionsCode);
      case EdilangPackage.PCI_SEGMENT__MARKS_LABELS:
        return marksLabels != null;
      case EdilangPackage.PCI_SEGMENT__CONTAINER_PACKAGE_CONTENTS_INDICATOR_CODE:
        return CONTAINER_PACKAGE_CONTENTS_INDICATOR_CODE_EDEFAULT == null ? containerPackageContentsIndicatorCode != null : !CONTAINER_PACKAGE_CONTENTS_INDICATOR_CODE_EDEFAULT.equals(containerPackageContentsIndicatorCode);
      case EdilangPackage.PCI_SEGMENT__TYPE_OF_MARKING:
        return typeOfMarking != null;
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
    result.append(" (marketingInstructionsCode: ");
    result.append(marketingInstructionsCode);
    result.append(", containerPackageContentsIndicatorCode: ");
    result.append(containerPackageContentsIndicatorCode);
    result.append(')');
    return result.toString();
  }

} //PCISegmentImpl

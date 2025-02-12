/**
 * generated by Xtext 2.35.0
 */
package yang.manager.yang.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import yang.manager.yang.UnknownStatement;
import yang.manager.yang.YangPackage;
import yang.manager.yang.YinElementStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Yin Element Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link yang.manager.yang.impl.YinElementStatementImpl#getBoolarg <em>Boolarg</em>}</li>
 *   <li>{@link yang.manager.yang.impl.YinElementStatementImpl#getYinelementunknownstatements <em>Yinelementunknownstatements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class YinElementStatementImpl extends ArgumentSubstatementImpl implements YinElementStatement
{
  /**
   * The default value of the '{@link #getBoolarg() <em>Boolarg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBoolarg()
   * @generated
   * @ordered
   */
  protected static final String BOOLARG_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBoolarg() <em>Boolarg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBoolarg()
   * @generated
   * @ordered
   */
  protected String boolarg = BOOLARG_EDEFAULT;

  /**
   * The cached value of the '{@link #getYinelementunknownstatements() <em>Yinelementunknownstatements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYinelementunknownstatements()
   * @generated
   * @ordered
   */
  protected EList<UnknownStatement> yinelementunknownstatements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected YinElementStatementImpl()
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
    return YangPackage.eINSTANCE.getYinElementStatement();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getBoolarg()
  {
    return boolarg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBoolarg(String newBoolarg)
  {
    String oldBoolarg = boolarg;
    boolarg = newBoolarg;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, YangPackage.YIN_ELEMENT_STATEMENT__BOOLARG, oldBoolarg, boolarg));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<UnknownStatement> getYinelementunknownstatements()
  {
    if (yinelementunknownstatements == null)
    {
      yinelementunknownstatements = new EObjectContainmentEList<UnknownStatement>(UnknownStatement.class, this, YangPackage.YIN_ELEMENT_STATEMENT__YINELEMENTUNKNOWNSTATEMENTS);
    }
    return yinelementunknownstatements;
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
      case YangPackage.YIN_ELEMENT_STATEMENT__YINELEMENTUNKNOWNSTATEMENTS:
        return ((InternalEList<?>)getYinelementunknownstatements()).basicRemove(otherEnd, msgs);
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
      case YangPackage.YIN_ELEMENT_STATEMENT__BOOLARG:
        return getBoolarg();
      case YangPackage.YIN_ELEMENT_STATEMENT__YINELEMENTUNKNOWNSTATEMENTS:
        return getYinelementunknownstatements();
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
      case YangPackage.YIN_ELEMENT_STATEMENT__BOOLARG:
        setBoolarg((String)newValue);
        return;
      case YangPackage.YIN_ELEMENT_STATEMENT__YINELEMENTUNKNOWNSTATEMENTS:
        getYinelementunknownstatements().clear();
        getYinelementunknownstatements().addAll((Collection<? extends UnknownStatement>)newValue);
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
      case YangPackage.YIN_ELEMENT_STATEMENT__BOOLARG:
        setBoolarg(BOOLARG_EDEFAULT);
        return;
      case YangPackage.YIN_ELEMENT_STATEMENT__YINELEMENTUNKNOWNSTATEMENTS:
        getYinelementunknownstatements().clear();
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
      case YangPackage.YIN_ELEMENT_STATEMENT__BOOLARG:
        return BOOLARG_EDEFAULT == null ? boolarg != null : !BOOLARG_EDEFAULT.equals(boolarg);
      case YangPackage.YIN_ELEMENT_STATEMENT__YINELEMENTUNKNOWNSTATEMENTS:
        return yinelementunknownstatements != null && !yinelementunknownstatements.isEmpty();
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
    result.append(" (boolarg: ");
    result.append(boolarg);
    result.append(')');
    return result.toString();
  }

} //YinElementStatementImpl

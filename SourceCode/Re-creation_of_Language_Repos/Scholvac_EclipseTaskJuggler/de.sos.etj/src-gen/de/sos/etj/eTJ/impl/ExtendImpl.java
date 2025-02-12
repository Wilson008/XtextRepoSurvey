/**
 * generated by Xtext 2.35.0
 */
package de.sos.etj.eTJ.impl;

import de.sos.etj.eTJ.ETJPackage;
import de.sos.etj.eTJ.Extend;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extend</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.impl.ExtendImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.impl.ExtendImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.impl.ExtendImpl#isInherit <em>Inherit</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.impl.ExtendImpl#isScenariospecific <em>Scenariospecific</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtendImpl extends MinimalEObjectImpl.Container implements Extend
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The default value of the '{@link #isInherit() <em>Inherit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInherit()
   * @generated
   * @ordered
   */
  protected static final boolean INHERIT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isInherit() <em>Inherit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInherit()
   * @generated
   * @ordered
   */
  protected boolean inherit = INHERIT_EDEFAULT;

  /**
   * The default value of the '{@link #isScenariospecific() <em>Scenariospecific</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isScenariospecific()
   * @generated
   * @ordered
   */
  protected static final boolean SCENARIOSPECIFIC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isScenariospecific() <em>Scenariospecific</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isScenariospecific()
   * @generated
   * @ordered
   */
  protected boolean scenariospecific = SCENARIOSPECIFIC_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExtendImpl()
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
    return ETJPackage.eINSTANCE.getExtend();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ETJPackage.EXTEND__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ETJPackage.EXTEND__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isInherit()
  {
    return inherit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setInherit(boolean newInherit)
  {
    boolean oldInherit = inherit;
    inherit = newInherit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ETJPackage.EXTEND__INHERIT, oldInherit, inherit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isScenariospecific()
  {
    return scenariospecific;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setScenariospecific(boolean newScenariospecific)
  {
    boolean oldScenariospecific = scenariospecific;
    scenariospecific = newScenariospecific;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ETJPackage.EXTEND__SCENARIOSPECIFIC, oldScenariospecific, scenariospecific));
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
      case ETJPackage.EXTEND__NAME:
        return getName();
      case ETJPackage.EXTEND__DESCRIPTION:
        return getDescription();
      case ETJPackage.EXTEND__INHERIT:
        return isInherit();
      case ETJPackage.EXTEND__SCENARIOSPECIFIC:
        return isScenariospecific();
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
      case ETJPackage.EXTEND__NAME:
        setName((String)newValue);
        return;
      case ETJPackage.EXTEND__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case ETJPackage.EXTEND__INHERIT:
        setInherit((Boolean)newValue);
        return;
      case ETJPackage.EXTEND__SCENARIOSPECIFIC:
        setScenariospecific((Boolean)newValue);
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
      case ETJPackage.EXTEND__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ETJPackage.EXTEND__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case ETJPackage.EXTEND__INHERIT:
        setInherit(INHERIT_EDEFAULT);
        return;
      case ETJPackage.EXTEND__SCENARIOSPECIFIC:
        setScenariospecific(SCENARIOSPECIFIC_EDEFAULT);
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
      case ETJPackage.EXTEND__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ETJPackage.EXTEND__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case ETJPackage.EXTEND__INHERIT:
        return inherit != INHERIT_EDEFAULT;
      case ETJPackage.EXTEND__SCENARIOSPECIFIC:
        return scenariospecific != SCENARIOSPECIFIC_EDEFAULT;
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
    result.append(" (name: ");
    result.append(name);
    result.append(", description: ");
    result.append(description);
    result.append(", inherit: ");
    result.append(inherit);
    result.append(", scenariospecific: ");
    result.append(scenariospecific);
    result.append(')');
    return result.toString();
  }

} //ExtendImpl

/**
 * generated by Xtext 2.35.0
 */
package de.sos.etj.eTJ.impl;

import de.sos.etj.eTJ.ETJPackage;
import de.sos.etj.eTJ.Weekdays;
import de.sos.etj.eTJ.WorkHours;
import de.sos.etj.eTJ.WorkingHours;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Working Hours</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.impl.WorkingHoursImpl#getWeekdays <em>Weekdays</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.impl.WorkingHoursImpl#isOff <em>Off</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.impl.WorkingHoursImpl#getHours <em>Hours</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkingHoursImpl extends ProjectAttributeImpl implements WorkingHours
{
  /**
   * The cached value of the '{@link #getWeekdays() <em>Weekdays</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeekdays()
   * @generated
   * @ordered
   */
  protected EList<Weekdays> weekdays;

  /**
   * The default value of the '{@link #isOff() <em>Off</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOff()
   * @generated
   * @ordered
   */
  protected static final boolean OFF_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isOff() <em>Off</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOff()
   * @generated
   * @ordered
   */
  protected boolean off = OFF_EDEFAULT;

  /**
   * The cached value of the '{@link #getHours() <em>Hours</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHours()
   * @generated
   * @ordered
   */
  protected EList<WorkHours> hours;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WorkingHoursImpl()
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
    return ETJPackage.eINSTANCE.getWorkingHours();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Weekdays> getWeekdays()
  {
    if (weekdays == null)
    {
      weekdays = new EObjectContainmentEList<Weekdays>(Weekdays.class, this, ETJPackage.WORKING_HOURS__WEEKDAYS);
    }
    return weekdays;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isOff()
  {
    return off;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOff(boolean newOff)
  {
    boolean oldOff = off;
    off = newOff;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ETJPackage.WORKING_HOURS__OFF, oldOff, off));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<WorkHours> getHours()
  {
    if (hours == null)
    {
      hours = new EObjectContainmentEList<WorkHours>(WorkHours.class, this, ETJPackage.WORKING_HOURS__HOURS);
    }
    return hours;
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
      case ETJPackage.WORKING_HOURS__WEEKDAYS:
        return ((InternalEList<?>)getWeekdays()).basicRemove(otherEnd, msgs);
      case ETJPackage.WORKING_HOURS__HOURS:
        return ((InternalEList<?>)getHours()).basicRemove(otherEnd, msgs);
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
      case ETJPackage.WORKING_HOURS__WEEKDAYS:
        return getWeekdays();
      case ETJPackage.WORKING_HOURS__OFF:
        return isOff();
      case ETJPackage.WORKING_HOURS__HOURS:
        return getHours();
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
      case ETJPackage.WORKING_HOURS__WEEKDAYS:
        getWeekdays().clear();
        getWeekdays().addAll((Collection<? extends Weekdays>)newValue);
        return;
      case ETJPackage.WORKING_HOURS__OFF:
        setOff((Boolean)newValue);
        return;
      case ETJPackage.WORKING_HOURS__HOURS:
        getHours().clear();
        getHours().addAll((Collection<? extends WorkHours>)newValue);
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
      case ETJPackage.WORKING_HOURS__WEEKDAYS:
        getWeekdays().clear();
        return;
      case ETJPackage.WORKING_HOURS__OFF:
        setOff(OFF_EDEFAULT);
        return;
      case ETJPackage.WORKING_HOURS__HOURS:
        getHours().clear();
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
      case ETJPackage.WORKING_HOURS__WEEKDAYS:
        return weekdays != null && !weekdays.isEmpty();
      case ETJPackage.WORKING_HOURS__OFF:
        return off != OFF_EDEFAULT;
      case ETJPackage.WORKING_HOURS__HOURS:
        return hours != null && !hours.isEmpty();
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
    result.append(" (off: ");
    result.append(off);
    result.append(')');
    return result.toString();
  }

} //WorkingHoursImpl

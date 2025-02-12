/**
 * generated by Xtext 2.35.0
 */
package io.thlaegler.edifact.edilang.impl;

import io.thlaegler.edifact.edilang.EdilangPackage;
import io.thlaegler.edifact.edilang.ProductFunction;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.ProductFunctionImpl#getBookingClass <em>Booking Class</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.ProductFunctionImpl#getAvail <em>Avail</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductFunctionImpl extends AbstractEdiFunctionImpl implements ProductFunction
{
  /**
   * The default value of the '{@link #getBookingClass() <em>Booking Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBookingClass()
   * @generated
   * @ordered
   */
  protected static final String BOOKING_CLASS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBookingClass() <em>Booking Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBookingClass()
   * @generated
   * @ordered
   */
  protected String bookingClass = BOOKING_CLASS_EDEFAULT;

  /**
   * The default value of the '{@link #getAvail() <em>Avail</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAvail()
   * @generated
   * @ordered
   */
  protected static final String AVAIL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAvail() <em>Avail</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAvail()
   * @generated
   * @ordered
   */
  protected String avail = AVAIL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProductFunctionImpl()
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
    return EdilangPackage.eINSTANCE.getProductFunction();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getBookingClass()
  {
    return bookingClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBookingClass(String newBookingClass)
  {
    String oldBookingClass = bookingClass;
    bookingClass = newBookingClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.PRODUCT_FUNCTION__BOOKING_CLASS, oldBookingClass, bookingClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getAvail()
  {
    return avail;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAvail(String newAvail)
  {
    String oldAvail = avail;
    avail = newAvail;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.PRODUCT_FUNCTION__AVAIL, oldAvail, avail));
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
      case EdilangPackage.PRODUCT_FUNCTION__BOOKING_CLASS:
        return getBookingClass();
      case EdilangPackage.PRODUCT_FUNCTION__AVAIL:
        return getAvail();
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
      case EdilangPackage.PRODUCT_FUNCTION__BOOKING_CLASS:
        setBookingClass((String)newValue);
        return;
      case EdilangPackage.PRODUCT_FUNCTION__AVAIL:
        setAvail((String)newValue);
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
      case EdilangPackage.PRODUCT_FUNCTION__BOOKING_CLASS:
        setBookingClass(BOOKING_CLASS_EDEFAULT);
        return;
      case EdilangPackage.PRODUCT_FUNCTION__AVAIL:
        setAvail(AVAIL_EDEFAULT);
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
      case EdilangPackage.PRODUCT_FUNCTION__BOOKING_CLASS:
        return BOOKING_CLASS_EDEFAULT == null ? bookingClass != null : !BOOKING_CLASS_EDEFAULT.equals(bookingClass);
      case EdilangPackage.PRODUCT_FUNCTION__AVAIL:
        return AVAIL_EDEFAULT == null ? avail != null : !AVAIL_EDEFAULT.equals(avail);
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
    result.append(" (bookingClass: ");
    result.append(bookingClass);
    result.append(", avail: ");
    result.append(avail);
    result.append(')');
    return result.toString();
  }

} //ProductFunctionImpl

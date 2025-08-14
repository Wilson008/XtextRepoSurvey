/**
 */
package nowheretravel.impl;

import nowheretravel.Hotel;
import nowheretravel.NowheretravelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hotel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nowheretravel.impl.HotelImpl#getHotelName <em>Hotel Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HotelImpl extends ItemImpl implements Hotel {
	/**
	 * The default value of the '{@link #getHotelName() <em>Hotel Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHotelName()
	 * @generated
	 * @ordered
	 */
	protected static final String HOTEL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHotelName() <em>Hotel Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHotelName()
	 * @generated
	 * @ordered
	 */
	protected String hotelName = HOTEL_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HotelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NowheretravelPackage.Literals.HOTEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHotelName() {
		return hotelName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHotelName(String newHotelName) {
		String oldHotelName = hotelName;
		hotelName = newHotelName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NowheretravelPackage.HOTEL__HOTEL_NAME, oldHotelName, hotelName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NowheretravelPackage.HOTEL__HOTEL_NAME:
				return getHotelName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case NowheretravelPackage.HOTEL__HOTEL_NAME:
				setHotelName((String)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case NowheretravelPackage.HOTEL__HOTEL_NAME:
				setHotelName(HOTEL_NAME_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case NowheretravelPackage.HOTEL__HOTEL_NAME:
				return HOTEL_NAME_EDEFAULT == null ? hotelName != null : !HOTEL_NAME_EDEFAULT.equals(hotelName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (hotelName: ");
		result.append(hotelName);
		result.append(')');
		return result.toString();
	}

} //HotelImpl

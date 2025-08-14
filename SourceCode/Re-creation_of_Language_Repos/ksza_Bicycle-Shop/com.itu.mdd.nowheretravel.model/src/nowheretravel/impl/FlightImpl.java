/**
 */
package nowheretravel.impl;

import nowheretravel.Flight;
import nowheretravel.NowheretravelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flight</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nowheretravel.impl.FlightImpl#getDestinationTown <em>Destination Town</em>}</li>
 *   <li>{@link nowheretravel.impl.FlightImpl#getDestinationCountry <em>Destination Country</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlightImpl extends ItemImpl implements Flight {
	/**
	 * The default value of the '{@link #getDestinationTown() <em>Destination Town</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationTown()
	 * @generated
	 * @ordered
	 */
	protected static final String DESTINATION_TOWN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestinationTown() <em>Destination Town</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationTown()
	 * @generated
	 * @ordered
	 */
	protected String destinationTown = DESTINATION_TOWN_EDEFAULT;

	/**
	 * The default value of the '{@link #getDestinationCountry() <em>Destination Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationCountry()
	 * @generated
	 * @ordered
	 */
	protected static final String DESTINATION_COUNTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestinationCountry() <em>Destination Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationCountry()
	 * @generated
	 * @ordered
	 */
	protected String destinationCountry = DESTINATION_COUNTRY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlightImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NowheretravelPackage.Literals.FLIGHT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDestinationTown() {
		return destinationTown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestinationTown(String newDestinationTown) {
		String oldDestinationTown = destinationTown;
		destinationTown = newDestinationTown;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NowheretravelPackage.FLIGHT__DESTINATION_TOWN, oldDestinationTown, destinationTown));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDestinationCountry() {
		return destinationCountry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestinationCountry(String newDestinationCountry) {
		String oldDestinationCountry = destinationCountry;
		destinationCountry = newDestinationCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NowheretravelPackage.FLIGHT__DESTINATION_COUNTRY, oldDestinationCountry, destinationCountry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NowheretravelPackage.FLIGHT__DESTINATION_TOWN:
				return getDestinationTown();
			case NowheretravelPackage.FLIGHT__DESTINATION_COUNTRY:
				return getDestinationCountry();
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
			case NowheretravelPackage.FLIGHT__DESTINATION_TOWN:
				setDestinationTown((String)newValue);
				return;
			case NowheretravelPackage.FLIGHT__DESTINATION_COUNTRY:
				setDestinationCountry((String)newValue);
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
			case NowheretravelPackage.FLIGHT__DESTINATION_TOWN:
				setDestinationTown(DESTINATION_TOWN_EDEFAULT);
				return;
			case NowheretravelPackage.FLIGHT__DESTINATION_COUNTRY:
				setDestinationCountry(DESTINATION_COUNTRY_EDEFAULT);
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
			case NowheretravelPackage.FLIGHT__DESTINATION_TOWN:
				return DESTINATION_TOWN_EDEFAULT == null ? destinationTown != null : !DESTINATION_TOWN_EDEFAULT.equals(destinationTown);
			case NowheretravelPackage.FLIGHT__DESTINATION_COUNTRY:
				return DESTINATION_COUNTRY_EDEFAULT == null ? destinationCountry != null : !DESTINATION_COUNTRY_EDEFAULT.equals(destinationCountry);
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
		result.append(" (destinationTown: ");
		result.append(destinationTown);
		result.append(", destinationCountry: ");
		result.append(destinationCountry);
		result.append(')');
		return result.toString();
	}

} //FlightImpl

/**
 */
package House2.impl;

import House2.ControlRule;
import House2.House;
import House2.House2Package;
import House2.Room;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>House</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link House2.impl.HouseImpl#getRooms <em>Rooms</em>}</li>
 *   <li>{@link House2.impl.HouseImpl#getControlRules <em>Control Rules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HouseImpl extends ContainerImpl implements House {
	/**
	 * The cached value of the '{@link #getRooms() <em>Rooms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRooms()
	 * @generated
	 * @ordered
	 */
	protected EList<Room> rooms;

	/**
	 * The cached value of the '{@link #getControlRules() <em>Control Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlRules()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlRule> controlRules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HouseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return House2Package.Literals.HOUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Room> getRooms() {
		if (rooms == null) {
			rooms = new EObjectContainmentEList<Room>(Room.class, this, House2Package.HOUSE__ROOMS);
		}
		return rooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ControlRule> getControlRules() {
		if (controlRules == null) {
			controlRules = new EObjectContainmentEList<ControlRule>(ControlRule.class, this, House2Package.HOUSE__CONTROL_RULES);
		}
		return controlRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case House2Package.HOUSE__ROOMS:
				return ((InternalEList<?>)getRooms()).basicRemove(otherEnd, msgs);
			case House2Package.HOUSE__CONTROL_RULES:
				return ((InternalEList<?>)getControlRules()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case House2Package.HOUSE__ROOMS:
				return getRooms();
			case House2Package.HOUSE__CONTROL_RULES:
				return getControlRules();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case House2Package.HOUSE__ROOMS:
				getRooms().clear();
				getRooms().addAll((Collection<? extends Room>)newValue);
				return;
			case House2Package.HOUSE__CONTROL_RULES:
				getControlRules().clear();
				getControlRules().addAll((Collection<? extends ControlRule>)newValue);
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
			case House2Package.HOUSE__ROOMS:
				getRooms().clear();
				return;
			case House2Package.HOUSE__CONTROL_RULES:
				getControlRules().clear();
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
			case House2Package.HOUSE__ROOMS:
				return rooms != null && !rooms.isEmpty();
			case House2Package.HOUSE__CONTROL_RULES:
				return controlRules != null && !controlRules.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HouseImpl

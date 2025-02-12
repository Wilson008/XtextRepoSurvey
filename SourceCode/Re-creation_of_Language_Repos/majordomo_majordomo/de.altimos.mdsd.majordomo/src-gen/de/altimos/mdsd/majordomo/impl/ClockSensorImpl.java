/**
 */
package de.altimos.mdsd.majordomo.impl;

import de.altimos.mdsd.majordomo.ClockSensor;
import de.altimos.mdsd.majordomo.Extendable;
import de.altimos.mdsd.majordomo.Extension;
import de.altimos.mdsd.majordomo.FloatSensor;
import de.altimos.mdsd.majordomo.MajordomoPackage;
import de.altimos.mdsd.majordomo.Sensor;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clock Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.altimos.mdsd.majordomo.impl.ClockSensorImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.altimos.mdsd.majordomo.impl.ClockSensorImpl#getCtx <em>Ctx</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClockSensorImpl extends EObjectImpl implements ClockSensor {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClockSensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MajordomoPackage.Literals.CLOCK_SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MajordomoPackage.CLOCK_SENSOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Extendable getCtx() {
		if (eContainerFeatureID() != MajordomoPackage.CLOCK_SENSOR__CTX) return null;
		return (Extendable)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCtx(Extendable newCtx, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCtx, MajordomoPackage.CLOCK_SENSOR__CTX, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCtx(Extendable newCtx) {
		if (newCtx != eInternalContainer() || (eContainerFeatureID() != MajordomoPackage.CLOCK_SENSOR__CTX && newCtx != null)) {
			if (EcoreUtil.isAncestor(this, newCtx))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCtx != null)
				msgs = ((InternalEObject)newCtx).eInverseAdd(this, MajordomoPackage.EXTENDABLE__SENSORS, Extendable.class, msgs);
			msgs = basicSetCtx(newCtx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MajordomoPackage.CLOCK_SENSOR__CTX, newCtx, newCtx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getValue() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MajordomoPackage.CLOCK_SENSOR__CTX:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCtx((Extendable)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MajordomoPackage.CLOCK_SENSOR__CTX:
				return basicSetCtx(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case MajordomoPackage.CLOCK_SENSOR__CTX:
				return eInternalContainer().eInverseRemove(this, MajordomoPackage.EXTENDABLE__SENSORS, Extendable.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MajordomoPackage.CLOCK_SENSOR__NAME:
				return getName();
			case MajordomoPackage.CLOCK_SENSOR__CTX:
				return getCtx();
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
			case MajordomoPackage.CLOCK_SENSOR__NAME:
				setName((String)newValue);
				return;
			case MajordomoPackage.CLOCK_SENSOR__CTX:
				setCtx((Extendable)newValue);
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
			case MajordomoPackage.CLOCK_SENSOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MajordomoPackage.CLOCK_SENSOR__CTX:
				setCtx((Extendable)null);
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
			case MajordomoPackage.CLOCK_SENSOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MajordomoPackage.CLOCK_SENSOR__CTX:
				return getCtx() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Extension.class) {
			switch (derivedFeatureID) {
				case MajordomoPackage.CLOCK_SENSOR__NAME: return MajordomoPackage.EXTENSION__NAME;
				default: return -1;
			}
		}
		if (baseClass == Sensor.class) {
			switch (derivedFeatureID) {
				case MajordomoPackage.CLOCK_SENSOR__CTX: return MajordomoPackage.SENSOR__CTX;
				default: return -1;
			}
		}
		if (baseClass == FloatSensor.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Extension.class) {
			switch (baseFeatureID) {
				case MajordomoPackage.EXTENSION__NAME: return MajordomoPackage.CLOCK_SENSOR__NAME;
				default: return -1;
			}
		}
		if (baseClass == Sensor.class) {
			switch (baseFeatureID) {
				case MajordomoPackage.SENSOR__CTX: return MajordomoPackage.CLOCK_SENSOR__CTX;
				default: return -1;
			}
		}
		if (baseClass == FloatSensor.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ClockSensorImpl

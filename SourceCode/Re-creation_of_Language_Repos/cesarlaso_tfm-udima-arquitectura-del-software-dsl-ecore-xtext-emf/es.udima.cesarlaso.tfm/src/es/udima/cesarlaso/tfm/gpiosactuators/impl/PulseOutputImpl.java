/**
 */
package es.udima.cesarlaso.tfm.gpiosactuators.impl;

import es.udima.cesarlaso.tfm.gpiosactuators.GpiosactuatorsPackage;
import es.udima.cesarlaso.tfm.gpiosactuators.PulseOutput;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pulse Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.gpiosactuators.impl.PulseOutputImpl#getCount <em>Count</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.gpiosactuators.impl.PulseOutputImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.gpiosactuators.impl.PulseOutputImpl#getSpaceWidth <em>Space Width</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PulseOutputImpl extends DigitalActuatorImpl implements PulseOutput {
	/**
	 * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected static final int COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected int count = COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected int width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpaceWidth() <em>Space Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaceWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int SPACE_WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSpaceWidth() <em>Space Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaceWidth()
	 * @generated
	 * @ordered
	 */
	protected int spaceWidth = SPACE_WIDTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PulseOutputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GpiosactuatorsPackage.Literals.PULSE_OUTPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCount() {
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCount(int newCount) {
		int oldCount = count;
		count = newCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GpiosactuatorsPackage.PULSE_OUTPUT__COUNT, oldCount, count));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWidth(int newWidth) {
		int oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GpiosactuatorsPackage.PULSE_OUTPUT__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSpaceWidth() {
		return spaceWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpaceWidth(int newSpaceWidth) {
		int oldSpaceWidth = spaceWidth;
		spaceWidth = newSpaceWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GpiosactuatorsPackage.PULSE_OUTPUT__SPACE_WIDTH, oldSpaceWidth, spaceWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GpiosactuatorsPackage.PULSE_OUTPUT__COUNT:
				return getCount();
			case GpiosactuatorsPackage.PULSE_OUTPUT__WIDTH:
				return getWidth();
			case GpiosactuatorsPackage.PULSE_OUTPUT__SPACE_WIDTH:
				return getSpaceWidth();
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
			case GpiosactuatorsPackage.PULSE_OUTPUT__COUNT:
				setCount((Integer)newValue);
				return;
			case GpiosactuatorsPackage.PULSE_OUTPUT__WIDTH:
				setWidth((Integer)newValue);
				return;
			case GpiosactuatorsPackage.PULSE_OUTPUT__SPACE_WIDTH:
				setSpaceWidth((Integer)newValue);
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
			case GpiosactuatorsPackage.PULSE_OUTPUT__COUNT:
				setCount(COUNT_EDEFAULT);
				return;
			case GpiosactuatorsPackage.PULSE_OUTPUT__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case GpiosactuatorsPackage.PULSE_OUTPUT__SPACE_WIDTH:
				setSpaceWidth(SPACE_WIDTH_EDEFAULT);
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
			case GpiosactuatorsPackage.PULSE_OUTPUT__COUNT:
				return count != COUNT_EDEFAULT;
			case GpiosactuatorsPackage.PULSE_OUTPUT__WIDTH:
				return width != WIDTH_EDEFAULT;
			case GpiosactuatorsPackage.PULSE_OUTPUT__SPACE_WIDTH:
				return spaceWidth != SPACE_WIDTH_EDEFAULT;
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
		result.append(" (count: ");
		result.append(count);
		result.append(", width: ");
		result.append(width);
		result.append(", spaceWidth: ");
		result.append(spaceWidth);
		result.append(')');
		return result.toString();
	}

} //PulseOutputImpl

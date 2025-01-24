/**
 */
package es.udima.cesarlaso.tfm.gpiosevents.impl;

import es.udima.cesarlaso.tfm.gpios.PinResistor;

import es.udima.cesarlaso.tfm.gpiosevents.GpioseventsPackage;
import es.udima.cesarlaso.tfm.gpiosevents.PulseInput;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pulse Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.gpiosevents.impl.PulseInputImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.gpiosevents.impl.PulseInputImpl#getCount <em>Count</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.gpiosevents.impl.PulseInputImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.gpiosevents.impl.PulseInputImpl#getSpaceWidth <em>Space Width</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PulseInputImpl extends DigitalEventImpl implements PulseInput {
	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final PinResistor MODE_EDEFAULT = PinResistor.PULL_UP;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected PinResistor mode = MODE_EDEFAULT;

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
	protected PulseInputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GpioseventsPackage.Literals.PULSE_INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PinResistor getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMode(PinResistor newMode) {
		PinResistor oldMode = mode;
		mode = newMode == null ? MODE_EDEFAULT : newMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GpioseventsPackage.PULSE_INPUT__MODE, oldMode, mode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GpioseventsPackage.PULSE_INPUT__COUNT, oldCount, count));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GpioseventsPackage.PULSE_INPUT__WIDTH, oldWidth, width));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GpioseventsPackage.PULSE_INPUT__SPACE_WIDTH, oldSpaceWidth, spaceWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GpioseventsPackage.PULSE_INPUT__MODE:
				return getMode();
			case GpioseventsPackage.PULSE_INPUT__COUNT:
				return getCount();
			case GpioseventsPackage.PULSE_INPUT__WIDTH:
				return getWidth();
			case GpioseventsPackage.PULSE_INPUT__SPACE_WIDTH:
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
			case GpioseventsPackage.PULSE_INPUT__MODE:
				setMode((PinResistor)newValue);
				return;
			case GpioseventsPackage.PULSE_INPUT__COUNT:
				setCount((Integer)newValue);
				return;
			case GpioseventsPackage.PULSE_INPUT__WIDTH:
				setWidth((Integer)newValue);
				return;
			case GpioseventsPackage.PULSE_INPUT__SPACE_WIDTH:
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
			case GpioseventsPackage.PULSE_INPUT__MODE:
				setMode(MODE_EDEFAULT);
				return;
			case GpioseventsPackage.PULSE_INPUT__COUNT:
				setCount(COUNT_EDEFAULT);
				return;
			case GpioseventsPackage.PULSE_INPUT__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case GpioseventsPackage.PULSE_INPUT__SPACE_WIDTH:
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
			case GpioseventsPackage.PULSE_INPUT__MODE:
				return mode != MODE_EDEFAULT;
			case GpioseventsPackage.PULSE_INPUT__COUNT:
				return count != COUNT_EDEFAULT;
			case GpioseventsPackage.PULSE_INPUT__WIDTH:
				return width != WIDTH_EDEFAULT;
			case GpioseventsPackage.PULSE_INPUT__SPACE_WIDTH:
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
		result.append(" (mode: ");
		result.append(mode);
		result.append(", count: ");
		result.append(count);
		result.append(", width: ");
		result.append(width);
		result.append(", spaceWidth: ");
		result.append(spaceWidth);
		result.append(')');
		return result.toString();
	}

} //PulseInputImpl

/**
 */
package es.udima.cesarlaso.tfm.gpiosactuators.impl;

import es.udima.cesarlaso.tfm.gpiosactuators.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GpiosactuatorsFactoryImpl extends EFactoryImpl implements GpiosactuatorsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GpiosactuatorsFactory init() {
		try {
			GpiosactuatorsFactory theGpiosactuatorsFactory = (GpiosactuatorsFactory)EPackage.Registry.INSTANCE.getEFactory(GpiosactuatorsPackage.eNS_URI);
			if (theGpiosactuatorsFactory != null) {
				return theGpiosactuatorsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GpiosactuatorsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpiosactuatorsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GpiosactuatorsPackage.CHANGE_OUTPUT: return createChangeOutput();
			case GpiosactuatorsPackage.BUTTON_OUTPUT: return createButtonOutput();
			case GpiosactuatorsPackage.PULSE_OUTPUT: return createPulseOutput();
			case GpiosactuatorsPackage.BLINK_OUTPUT: return createBlinkOutput();
			case GpiosactuatorsPackage.BLINK_TIMER_OUTPUT: return createBlinkTimerOutput();
			case GpiosactuatorsPackage.PWM: return createPwm();
			case GpiosactuatorsPackage.TRANSFORM_TO: return createTransformTo();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case GpiosactuatorsPackage.DIGITAL_PIN_STATUS:
				return createDigitalPinStatusFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case GpiosactuatorsPackage.DIGITAL_PIN_STATUS:
				return convertDigitalPinStatusToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChangeOutput createChangeOutput() {
		ChangeOutputImpl changeOutput = new ChangeOutputImpl();
		return changeOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ButtonOutput createButtonOutput() {
		ButtonOutputImpl buttonOutput = new ButtonOutputImpl();
		return buttonOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PulseOutput createPulseOutput() {
		PulseOutputImpl pulseOutput = new PulseOutputImpl();
		return pulseOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BlinkOutput createBlinkOutput() {
		BlinkOutputImpl blinkOutput = new BlinkOutputImpl();
		return blinkOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BlinkTimerOutput createBlinkTimerOutput() {
		BlinkTimerOutputImpl blinkTimerOutput = new BlinkTimerOutputImpl();
		return blinkTimerOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pwm createPwm() {
		PwmImpl pwm = new PwmImpl();
		return pwm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransformTo createTransformTo() {
		TransformToImpl transformTo = new TransformToImpl();
		return transformTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DigitalPinStatus createDigitalPinStatusFromString(EDataType eDataType, String initialValue) {
		DigitalPinStatus result = DigitalPinStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDigitalPinStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GpiosactuatorsPackage getGpiosactuatorsPackage() {
		return (GpiosactuatorsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GpiosactuatorsPackage getPackage() {
		return GpiosactuatorsPackage.eINSTANCE;
	}

} //GpiosactuatorsFactoryImpl

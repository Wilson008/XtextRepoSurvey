/**
 */
package es.udima.cesarlaso.tfm.gpios.impl;

import es.udima.cesarlaso.tfm.gpios.*;

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
public class GpiosFactoryImpl extends EFactoryImpl implements GpiosFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GpiosFactory init() {
		try {
			GpiosFactory theGpiosFactory = (GpiosFactory)EPackage.Registry.INSTANCE.getEFactory(GpiosPackage.eNS_URI);
			if (theGpiosFactory != null) {
				return theGpiosFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GpiosFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpiosFactoryImpl() {
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
			case GpiosPackage.DIGITAL_INPUT_PIN: return createDigitalInputPin();
			case GpiosPackage.DIGITAL_OUTPUT_PIN: return createDigitalOutputPin();
			case GpiosPackage.ANALOG_INPUT_PIN: return createAnalogInputPin();
			case GpiosPackage.ANALOG_OUTPUT_PIN: return createAnalogOutputPin();
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
			case GpiosPackage.DAC_RESOLUTION:
				return createDacResolutionFromString(eDataType, initialValue);
			case GpiosPackage.INTERRUPT_MODE:
				return createInterruptModeFromString(eDataType, initialValue);
			case GpiosPackage.PIN_RESISTOR:
				return createPinResistorFromString(eDataType, initialValue);
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
			case GpiosPackage.DAC_RESOLUTION:
				return convertDacResolutionToString(eDataType, instanceValue);
			case GpiosPackage.INTERRUPT_MODE:
				return convertInterruptModeToString(eDataType, instanceValue);
			case GpiosPackage.PIN_RESISTOR:
				return convertPinResistorToString(eDataType, instanceValue);
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
	public DigitalInputPin createDigitalInputPin() {
		DigitalInputPinImpl digitalInputPin = new DigitalInputPinImpl();
		return digitalInputPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DigitalOutputPin createDigitalOutputPin() {
		DigitalOutputPinImpl digitalOutputPin = new DigitalOutputPinImpl();
		return digitalOutputPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnalogInputPin createAnalogInputPin() {
		AnalogInputPinImpl analogInputPin = new AnalogInputPinImpl();
		return analogInputPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnalogOutputPin createAnalogOutputPin() {
		AnalogOutputPinImpl analogOutputPin = new AnalogOutputPinImpl();
		return analogOutputPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DacResolution createDacResolutionFromString(EDataType eDataType, String initialValue) {
		DacResolution result = DacResolution.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDacResolutionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptMode createInterruptModeFromString(EDataType eDataType, String initialValue) {
		InterruptMode result = InterruptMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInterruptModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PinResistor createPinResistorFromString(EDataType eDataType, String initialValue) {
		PinResistor result = PinResistor.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPinResistorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GpiosPackage getGpiosPackage() {
		return (GpiosPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GpiosPackage getPackage() {
		return GpiosPackage.eINSTANCE;
	}

} //GpiosFactoryImpl

/**
 */
package es.udima.cesarlaso.tfm.gpiosevents.impl;

import es.udima.cesarlaso.tfm.gpiosevents.*;

import org.eclipse.emf.ecore.EClass;
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
public class GpioseventsFactoryImpl extends EFactoryImpl implements GpioseventsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GpioseventsFactory init() {
		try {
			GpioseventsFactory theGpioseventsFactory = (GpioseventsFactory)EPackage.Registry.INSTANCE.getEFactory(GpioseventsPackage.eNS_URI);
			if (theGpioseventsFactory != null) {
				return theGpioseventsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GpioseventsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpioseventsFactoryImpl() {
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
			case GpioseventsPackage.INTERRUPTED: return createInterrupted();
			case GpioseventsPackage.BUTTON_INPUT: return createButtonInput();
			case GpioseventsPackage.BUTTON_INPUT_ACCUMULATOR: return createButtonInputAccumulator();
			case GpioseventsPackage.BUTTON_INPUT_RELEASED: return createButtonInputReleased();
			case GpioseventsPackage.PULSE_INPUT: return createPulseInput();
			case GpioseventsPackage.ANALOG_READ: return createAnalogRead();
			case GpioseventsPackage.ANALOG_READ_PERFORM_ON_HIGH: return createAnalogReadPerformOnHigh();
			case GpioseventsPackage.ANALOG_READ_PERFORM_ON_LOW: return createAnalogReadPerformOnLow();
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
	public Interrupted createInterrupted() {
		InterruptedImpl interrupted = new InterruptedImpl();
		return interrupted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ButtonInput createButtonInput() {
		ButtonInputImpl buttonInput = new ButtonInputImpl();
		return buttonInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ButtonInputAccumulator createButtonInputAccumulator() {
		ButtonInputAccumulatorImpl buttonInputAccumulator = new ButtonInputAccumulatorImpl();
		return buttonInputAccumulator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ButtonInputReleased createButtonInputReleased() {
		ButtonInputReleasedImpl buttonInputReleased = new ButtonInputReleasedImpl();
		return buttonInputReleased;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PulseInput createPulseInput() {
		PulseInputImpl pulseInput = new PulseInputImpl();
		return pulseInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnalogRead createAnalogRead() {
		AnalogReadImpl analogRead = new AnalogReadImpl();
		return analogRead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnalogReadPerformOnHigh createAnalogReadPerformOnHigh() {
		AnalogReadPerformOnHighImpl analogReadPerformOnHigh = new AnalogReadPerformOnHighImpl();
		return analogReadPerformOnHigh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnalogReadPerformOnLow createAnalogReadPerformOnLow() {
		AnalogReadPerformOnLowImpl analogReadPerformOnLow = new AnalogReadPerformOnLowImpl();
		return analogReadPerformOnLow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GpioseventsPackage getGpioseventsPackage() {
		return (GpioseventsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GpioseventsPackage getPackage() {
		return GpioseventsPackage.eINSTANCE;
	}

} //GpioseventsFactoryImpl

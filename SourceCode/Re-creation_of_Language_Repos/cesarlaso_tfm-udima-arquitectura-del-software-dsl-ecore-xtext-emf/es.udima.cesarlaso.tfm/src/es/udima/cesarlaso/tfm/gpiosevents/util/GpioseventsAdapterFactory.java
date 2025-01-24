/**
 */
package es.udima.cesarlaso.tfm.gpiosevents.util;

import es.udima.cesarlaso.tfm.events.Event;

import es.udima.cesarlaso.tfm.gpiosevents.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see es.udima.cesarlaso.tfm.gpiosevents.GpioseventsPackage
 * @generated
 */
public class GpioseventsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GpioseventsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpioseventsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GpioseventsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GpioseventsSwitch<Adapter> modelSwitch =
		new GpioseventsSwitch<Adapter>() {
			@Override
			public Adapter caseGpioEvent(GpioEvent object) {
				return createGpioEventAdapter();
			}
			@Override
			public Adapter caseDigitalEvent(DigitalEvent object) {
				return createDigitalEventAdapter();
			}
			@Override
			public Adapter caseAnalogEvent(AnalogEvent object) {
				return createAnalogEventAdapter();
			}
			@Override
			public Adapter caseInterrupted(Interrupted object) {
				return createInterruptedAdapter();
			}
			@Override
			public Adapter caseButtonInput(ButtonInput object) {
				return createButtonInputAdapter();
			}
			@Override
			public Adapter caseButtonInputAccumulator(ButtonInputAccumulator object) {
				return createButtonInputAccumulatorAdapter();
			}
			@Override
			public Adapter caseButtonInputReleased(ButtonInputReleased object) {
				return createButtonInputReleasedAdapter();
			}
			@Override
			public Adapter casePulseInput(PulseInput object) {
				return createPulseInputAdapter();
			}
			@Override
			public Adapter caseAnalogRead(AnalogRead object) {
				return createAnalogReadAdapter();
			}
			@Override
			public Adapter caseAnalogReadPerformOnChange(AnalogReadPerformOnChange object) {
				return createAnalogReadPerformOnChangeAdapter();
			}
			@Override
			public Adapter caseAnalogReadPerformOnHigh(AnalogReadPerformOnHigh object) {
				return createAnalogReadPerformOnHighAdapter();
			}
			@Override
			public Adapter caseAnalogReadPerformOnLow(AnalogReadPerformOnLow object) {
				return createAnalogReadPerformOnLowAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.gpiosevents.GpioEvent <em>Gpio Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.gpiosevents.GpioEvent
	 * @generated
	 */
	public Adapter createGpioEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.gpiosevents.DigitalEvent <em>Digital Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.gpiosevents.DigitalEvent
	 * @generated
	 */
	public Adapter createDigitalEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.gpiosevents.AnalogEvent <em>Analog Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.gpiosevents.AnalogEvent
	 * @generated
	 */
	public Adapter createAnalogEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.gpiosevents.Interrupted <em>Interrupted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.gpiosevents.Interrupted
	 * @generated
	 */
	public Adapter createInterruptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.gpiosevents.ButtonInput <em>Button Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.gpiosevents.ButtonInput
	 * @generated
	 */
	public Adapter createButtonInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.gpiosevents.ButtonInputAccumulator <em>Button Input Accumulator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.gpiosevents.ButtonInputAccumulator
	 * @generated
	 */
	public Adapter createButtonInputAccumulatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.gpiosevents.ButtonInputReleased <em>Button Input Released</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.gpiosevents.ButtonInputReleased
	 * @generated
	 */
	public Adapter createButtonInputReleasedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.gpiosevents.PulseInput <em>Pulse Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.gpiosevents.PulseInput
	 * @generated
	 */
	public Adapter createPulseInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.gpiosevents.AnalogRead <em>Analog Read</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.gpiosevents.AnalogRead
	 * @generated
	 */
	public Adapter createAnalogReadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.gpiosevents.AnalogReadPerformOnChange <em>Analog Read Perform On Change</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.gpiosevents.AnalogReadPerformOnChange
	 * @generated
	 */
	public Adapter createAnalogReadPerformOnChangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.gpiosevents.AnalogReadPerformOnHigh <em>Analog Read Perform On High</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.gpiosevents.AnalogReadPerformOnHigh
	 * @generated
	 */
	public Adapter createAnalogReadPerformOnHighAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.gpiosevents.AnalogReadPerformOnLow <em>Analog Read Perform On Low</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.gpiosevents.AnalogReadPerformOnLow
	 * @generated
	 */
	public Adapter createAnalogReadPerformOnLowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.events.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.events.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GpioseventsAdapterFactory

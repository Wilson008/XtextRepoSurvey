/**
 */
package es.udima.cesarlaso.tfm.gpiosactuators.util;

import es.udima.cesarlaso.tfm.events.Actuator;

import es.udima.cesarlaso.tfm.gpiosactuators.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see es.udima.cesarlaso.tfm.gpiosactuators.GpiosactuatorsPackage
 * @generated
 */
public class GpiosactuatorsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GpiosactuatorsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpiosactuatorsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GpiosactuatorsPackage.eINSTANCE;
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
	protected GpiosactuatorsSwitch<Adapter> modelSwitch =
		new GpiosactuatorsSwitch<Adapter>() {
			@Override
			public Adapter caseGpioActuator(GpioActuator object) {
				return createGpioActuatorAdapter();
			}
			@Override
			public Adapter caseGpioTimerActuator(GpioTimerActuator object) {
				return createGpioTimerActuatorAdapter();
			}
			@Override
			public Adapter caseDigitalActuator(DigitalActuator object) {
				return createDigitalActuatorAdapter();
			}
			@Override
			public Adapter caseAnalogActuator(AnalogActuator object) {
				return createAnalogActuatorAdapter();
			}
			@Override
			public Adapter caseChangeOutput(ChangeOutput object) {
				return createChangeOutputAdapter();
			}
			@Override
			public Adapter caseButtonOutput(ButtonOutput object) {
				return createButtonOutputAdapter();
			}
			@Override
			public Adapter casePulseOutput(PulseOutput object) {
				return createPulseOutputAdapter();
			}
			@Override
			public Adapter caseBlinkOutput(BlinkOutput object) {
				return createBlinkOutputAdapter();
			}
			@Override
			public Adapter caseBlinkTimerOutput(BlinkTimerOutput object) {
				return createBlinkTimerOutputAdapter();
			}
			@Override
			public Adapter casePwm(Pwm object) {
				return createPwmAdapter();
			}
			@Override
			public Adapter caseTransformTo(TransformTo object) {
				return createTransformToAdapter();
			}
			@Override
			public Adapter caseActuator(Actuator object) {
				return createActuatorAdapter();
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
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.gpiosactuators.GpioActuator <em>Gpio Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.GpioActuator
	 * @generated
	 */
	public Adapter createGpioActuatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.gpiosactuators.GpioTimerActuator <em>Gpio Timer Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.GpioTimerActuator
	 * @generated
	 */
	public Adapter createGpioTimerActuatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.gpiosactuators.DigitalActuator <em>Digital Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.DigitalActuator
	 * @generated
	 */
	public Adapter createDigitalActuatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.gpiosactuators.AnalogActuator <em>Analog Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.AnalogActuator
	 * @generated
	 */
	public Adapter createAnalogActuatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.gpiosactuators.ChangeOutput <em>Change Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.ChangeOutput
	 * @generated
	 */
	public Adapter createChangeOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.gpiosactuators.ButtonOutput <em>Button Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.ButtonOutput
	 * @generated
	 */
	public Adapter createButtonOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.gpiosactuators.PulseOutput <em>Pulse Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.PulseOutput
	 * @generated
	 */
	public Adapter createPulseOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.gpiosactuators.BlinkOutput <em>Blink Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.BlinkOutput
	 * @generated
	 */
	public Adapter createBlinkOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.gpiosactuators.BlinkTimerOutput <em>Blink Timer Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.BlinkTimerOutput
	 * @generated
	 */
	public Adapter createBlinkTimerOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.gpiosactuators.Pwm <em>Pwm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.Pwm
	 * @generated
	 */
	public Adapter createPwmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.gpiosactuators.TransformTo <em>Transform To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.gpiosactuators.TransformTo
	 * @generated
	 */
	public Adapter createTransformToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.events.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.events.Actuator
	 * @generated
	 */
	public Adapter createActuatorAdapter() {
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

} //GpiosactuatorsAdapterFactory

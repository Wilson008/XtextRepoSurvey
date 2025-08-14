/**
 */
package es.udima.cesarlaso.tfm.gpiosactuators.util;

import es.udima.cesarlaso.tfm.events.Actuator;

import es.udima.cesarlaso.tfm.gpiosactuators.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see es.udima.cesarlaso.tfm.gpiosactuators.GpiosactuatorsPackage
 * @generated
 */
public class GpiosactuatorsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GpiosactuatorsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpiosactuatorsSwitch() {
		if (modelPackage == null) {
			modelPackage = GpiosactuatorsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GpiosactuatorsPackage.GPIO_ACTUATOR: {
				GpioActuator gpioActuator = (GpioActuator)theEObject;
				T result = caseGpioActuator(gpioActuator);
				if (result == null) result = caseActuator(gpioActuator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GpiosactuatorsPackage.GPIO_TIMER_ACTUATOR: {
				GpioTimerActuator gpioTimerActuator = (GpioTimerActuator)theEObject;
				T result = caseGpioTimerActuator(gpioTimerActuator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GpiosactuatorsPackage.DIGITAL_ACTUATOR: {
				DigitalActuator digitalActuator = (DigitalActuator)theEObject;
				T result = caseDigitalActuator(digitalActuator);
				if (result == null) result = caseGpioActuator(digitalActuator);
				if (result == null) result = caseActuator(digitalActuator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GpiosactuatorsPackage.ANALOG_ACTUATOR: {
				AnalogActuator analogActuator = (AnalogActuator)theEObject;
				T result = caseAnalogActuator(analogActuator);
				if (result == null) result = caseGpioActuator(analogActuator);
				if (result == null) result = caseActuator(analogActuator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GpiosactuatorsPackage.CHANGE_OUTPUT: {
				ChangeOutput changeOutput = (ChangeOutput)theEObject;
				T result = caseChangeOutput(changeOutput);
				if (result == null) result = caseDigitalActuator(changeOutput);
				if (result == null) result = caseGpioActuator(changeOutput);
				if (result == null) result = caseActuator(changeOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GpiosactuatorsPackage.BUTTON_OUTPUT: {
				ButtonOutput buttonOutput = (ButtonOutput)theEObject;
				T result = caseButtonOutput(buttonOutput);
				if (result == null) result = caseChangeOutput(buttonOutput);
				if (result == null) result = caseGpioTimerActuator(buttonOutput);
				if (result == null) result = caseDigitalActuator(buttonOutput);
				if (result == null) result = caseGpioActuator(buttonOutput);
				if (result == null) result = caseActuator(buttonOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GpiosactuatorsPackage.PULSE_OUTPUT: {
				PulseOutput pulseOutput = (PulseOutput)theEObject;
				T result = casePulseOutput(pulseOutput);
				if (result == null) result = caseDigitalActuator(pulseOutput);
				if (result == null) result = caseGpioActuator(pulseOutput);
				if (result == null) result = caseActuator(pulseOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GpiosactuatorsPackage.BLINK_OUTPUT: {
				BlinkOutput blinkOutput = (BlinkOutput)theEObject;
				T result = caseBlinkOutput(blinkOutput);
				if (result == null) result = caseDigitalActuator(blinkOutput);
				if (result == null) result = caseGpioActuator(blinkOutput);
				if (result == null) result = caseActuator(blinkOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GpiosactuatorsPackage.BLINK_TIMER_OUTPUT: {
				BlinkTimerOutput blinkTimerOutput = (BlinkTimerOutput)theEObject;
				T result = caseBlinkTimerOutput(blinkTimerOutput);
				if (result == null) result = caseBlinkOutput(blinkTimerOutput);
				if (result == null) result = caseGpioTimerActuator(blinkTimerOutput);
				if (result == null) result = caseDigitalActuator(blinkTimerOutput);
				if (result == null) result = caseGpioActuator(blinkTimerOutput);
				if (result == null) result = caseActuator(blinkTimerOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GpiosactuatorsPackage.PWM: {
				Pwm pwm = (Pwm)theEObject;
				T result = casePwm(pwm);
				if (result == null) result = caseAnalogActuator(pwm);
				if (result == null) result = caseGpioActuator(pwm);
				if (result == null) result = caseActuator(pwm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GpiosactuatorsPackage.TRANSFORM_TO: {
				TransformTo transformTo = (TransformTo)theEObject;
				T result = caseTransformTo(transformTo);
				if (result == null) result = caseAnalogActuator(transformTo);
				if (result == null) result = caseGpioTimerActuator(transformTo);
				if (result == null) result = caseGpioActuator(transformTo);
				if (result == null) result = caseActuator(transformTo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gpio Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gpio Actuator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGpioActuator(GpioActuator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gpio Timer Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gpio Timer Actuator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGpioTimerActuator(GpioTimerActuator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Digital Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Digital Actuator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDigitalActuator(DigitalActuator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analog Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analog Actuator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalogActuator(AnalogActuator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeOutput(ChangeOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseButtonOutput(ButtonOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pulse Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pulse Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePulseOutput(PulseOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Blink Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Blink Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlinkOutput(BlinkOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Blink Timer Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Blink Timer Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlinkTimerOutput(BlinkTimerOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pwm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pwm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePwm(Pwm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transform To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transform To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformTo(TransformTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actuator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActuator(Actuator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GpiosactuatorsSwitch

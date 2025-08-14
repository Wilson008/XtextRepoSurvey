/**
 */
package es.udima.cesarlaso.tfm.gpiosevents.util;

import es.udima.cesarlaso.tfm.events.Event;

import es.udima.cesarlaso.tfm.gpiosevents.*;

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
 * @see es.udima.cesarlaso.tfm.gpiosevents.GpioseventsPackage
 * @generated
 */
public class GpioseventsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GpioseventsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpioseventsSwitch() {
		if (modelPackage == null) {
			modelPackage = GpioseventsPackage.eINSTANCE;
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
			case GpioseventsPackage.GPIO_EVENT: {
				GpioEvent gpioEvent = (GpioEvent)theEObject;
				T result = caseGpioEvent(gpioEvent);
				if (result == null) result = caseEvent(gpioEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GpioseventsPackage.DIGITAL_EVENT: {
				DigitalEvent digitalEvent = (DigitalEvent)theEObject;
				T result = caseDigitalEvent(digitalEvent);
				if (result == null) result = caseGpioEvent(digitalEvent);
				if (result == null) result = caseEvent(digitalEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GpioseventsPackage.ANALOG_EVENT: {
				AnalogEvent analogEvent = (AnalogEvent)theEObject;
				T result = caseAnalogEvent(analogEvent);
				if (result == null) result = caseGpioEvent(analogEvent);
				if (result == null) result = caseEvent(analogEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GpioseventsPackage.INTERRUPTED: {
				Interrupted interrupted = (Interrupted)theEObject;
				T result = caseInterrupted(interrupted);
				if (result == null) result = caseDigitalEvent(interrupted);
				if (result == null) result = caseGpioEvent(interrupted);
				if (result == null) result = caseEvent(interrupted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GpioseventsPackage.BUTTON_INPUT: {
				ButtonInput buttonInput = (ButtonInput)theEObject;
				T result = caseButtonInput(buttonInput);
				if (result == null) result = caseDigitalEvent(buttonInput);
				if (result == null) result = caseGpioEvent(buttonInput);
				if (result == null) result = caseEvent(buttonInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GpioseventsPackage.BUTTON_INPUT_ACCUMULATOR: {
				ButtonInputAccumulator buttonInputAccumulator = (ButtonInputAccumulator)theEObject;
				T result = caseButtonInputAccumulator(buttonInputAccumulator);
				if (result == null) result = caseButtonInput(buttonInputAccumulator);
				if (result == null) result = caseDigitalEvent(buttonInputAccumulator);
				if (result == null) result = caseGpioEvent(buttonInputAccumulator);
				if (result == null) result = caseEvent(buttonInputAccumulator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GpioseventsPackage.BUTTON_INPUT_RELEASED: {
				ButtonInputReleased buttonInputReleased = (ButtonInputReleased)theEObject;
				T result = caseButtonInputReleased(buttonInputReleased);
				if (result == null) result = caseDigitalEvent(buttonInputReleased);
				if (result == null) result = caseGpioEvent(buttonInputReleased);
				if (result == null) result = caseEvent(buttonInputReleased);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GpioseventsPackage.PULSE_INPUT: {
				PulseInput pulseInput = (PulseInput)theEObject;
				T result = casePulseInput(pulseInput);
				if (result == null) result = caseDigitalEvent(pulseInput);
				if (result == null) result = caseGpioEvent(pulseInput);
				if (result == null) result = caseEvent(pulseInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GpioseventsPackage.ANALOG_READ: {
				AnalogRead analogRead = (AnalogRead)theEObject;
				T result = caseAnalogRead(analogRead);
				if (result == null) result = caseAnalogEvent(analogRead);
				if (result == null) result = caseGpioEvent(analogRead);
				if (result == null) result = caseEvent(analogRead);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GpioseventsPackage.ANALOG_READ_PERFORM_ON_CHANGE: {
				AnalogReadPerformOnChange analogReadPerformOnChange = (AnalogReadPerformOnChange)theEObject;
				T result = caseAnalogReadPerformOnChange(analogReadPerformOnChange);
				if (result == null) result = caseAnalogRead(analogReadPerformOnChange);
				if (result == null) result = caseAnalogEvent(analogReadPerformOnChange);
				if (result == null) result = caseGpioEvent(analogReadPerformOnChange);
				if (result == null) result = caseEvent(analogReadPerformOnChange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GpioseventsPackage.ANALOG_READ_PERFORM_ON_HIGH: {
				AnalogReadPerformOnHigh analogReadPerformOnHigh = (AnalogReadPerformOnHigh)theEObject;
				T result = caseAnalogReadPerformOnHigh(analogReadPerformOnHigh);
				if (result == null) result = caseAnalogReadPerformOnChange(analogReadPerformOnHigh);
				if (result == null) result = caseAnalogRead(analogReadPerformOnHigh);
				if (result == null) result = caseAnalogEvent(analogReadPerformOnHigh);
				if (result == null) result = caseGpioEvent(analogReadPerformOnHigh);
				if (result == null) result = caseEvent(analogReadPerformOnHigh);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GpioseventsPackage.ANALOG_READ_PERFORM_ON_LOW: {
				AnalogReadPerformOnLow analogReadPerformOnLow = (AnalogReadPerformOnLow)theEObject;
				T result = caseAnalogReadPerformOnLow(analogReadPerformOnLow);
				if (result == null) result = caseAnalogReadPerformOnChange(analogReadPerformOnLow);
				if (result == null) result = caseAnalogRead(analogReadPerformOnLow);
				if (result == null) result = caseAnalogEvent(analogReadPerformOnLow);
				if (result == null) result = caseGpioEvent(analogReadPerformOnLow);
				if (result == null) result = caseEvent(analogReadPerformOnLow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gpio Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gpio Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGpioEvent(GpioEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Digital Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Digital Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDigitalEvent(DigitalEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analog Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analog Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalogEvent(AnalogEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interrupted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interrupted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterrupted(Interrupted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseButtonInput(ButtonInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button Input Accumulator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button Input Accumulator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseButtonInputAccumulator(ButtonInputAccumulator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button Input Released</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button Input Released</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseButtonInputReleased(ButtonInputReleased object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pulse Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pulse Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePulseInput(PulseInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analog Read</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analog Read</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalogRead(AnalogRead object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analog Read Perform On Change</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analog Read Perform On Change</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalogReadPerformOnChange(AnalogReadPerformOnChange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analog Read Perform On High</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analog Read Perform On High</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalogReadPerformOnHigh(AnalogReadPerformOnHigh object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analog Read Perform On Low</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analog Read Perform On Low</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalogReadPerformOnLow(AnalogReadPerformOnLow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
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

} //GpioseventsSwitch

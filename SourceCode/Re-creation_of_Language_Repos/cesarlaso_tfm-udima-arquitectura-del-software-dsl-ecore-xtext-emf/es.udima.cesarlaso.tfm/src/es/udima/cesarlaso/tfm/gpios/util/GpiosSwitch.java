/**
 */
package es.udima.cesarlaso.tfm.gpios.util;

import es.udima.cesarlaso.tfm.gpios.*;

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
 * @see es.udima.cesarlaso.tfm.gpios.GpiosPackage
 * @generated
 */
public class GpiosSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GpiosPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpiosSwitch() {
		if (modelPackage == null) {
			modelPackage = GpiosPackage.eINSTANCE;
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
			case GpiosPackage.PIN: {
				Pin pin = (Pin)theEObject;
				T result = casePin(pin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GpiosPackage.DIGITAL_PIN: {
				DigitalPin digitalPin = (DigitalPin)theEObject;
				T result = caseDigitalPin(digitalPin);
				if (result == null) result = casePin(digitalPin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GpiosPackage.ANALOG_PIN: {
				AnalogPin analogPin = (AnalogPin)theEObject;
				T result = caseAnalogPin(analogPin);
				if (result == null) result = casePin(analogPin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GpiosPackage.DIGITAL_INPUT_PIN: {
				DigitalInputPin digitalInputPin = (DigitalInputPin)theEObject;
				T result = caseDigitalInputPin(digitalInputPin);
				if (result == null) result = caseDigitalPin(digitalInputPin);
				if (result == null) result = casePin(digitalInputPin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GpiosPackage.DIGITAL_OUTPUT_PIN: {
				DigitalOutputPin digitalOutputPin = (DigitalOutputPin)theEObject;
				T result = caseDigitalOutputPin(digitalOutputPin);
				if (result == null) result = caseDigitalPin(digitalOutputPin);
				if (result == null) result = casePin(digitalOutputPin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GpiosPackage.ANALOG_INPUT_PIN: {
				AnalogInputPin analogInputPin = (AnalogInputPin)theEObject;
				T result = caseAnalogInputPin(analogInputPin);
				if (result == null) result = caseAnalogPin(analogInputPin);
				if (result == null) result = casePin(analogInputPin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GpiosPackage.ANALOG_OUTPUT_PIN: {
				AnalogOutputPin analogOutputPin = (AnalogOutputPin)theEObject;
				T result = caseAnalogOutputPin(analogOutputPin);
				if (result == null) result = caseAnalogPin(analogOutputPin);
				if (result == null) result = casePin(analogOutputPin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePin(Pin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Digital Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Digital Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDigitalPin(DigitalPin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analog Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analog Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalogPin(AnalogPin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Digital Input Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Digital Input Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDigitalInputPin(DigitalInputPin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Digital Output Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Digital Output Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDigitalOutputPin(DigitalOutputPin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analog Input Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analog Input Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalogInputPin(AnalogInputPin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analog Output Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analog Output Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalogOutputPin(AnalogOutputPin object) {
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

} //GpiosSwitch

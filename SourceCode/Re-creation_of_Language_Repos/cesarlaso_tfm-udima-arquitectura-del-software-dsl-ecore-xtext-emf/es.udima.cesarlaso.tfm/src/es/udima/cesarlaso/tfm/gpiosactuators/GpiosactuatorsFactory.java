/**
 */
package es.udima.cesarlaso.tfm.gpiosactuators;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.udima.cesarlaso.tfm.gpiosactuators.GpiosactuatorsPackage
 * @generated
 */
public interface GpiosactuatorsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GpiosactuatorsFactory eINSTANCE = es.udima.cesarlaso.tfm.gpiosactuators.impl.GpiosactuatorsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Change Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Output</em>'.
	 * @generated
	 */
	ChangeOutput createChangeOutput();

	/**
	 * Returns a new object of class '<em>Button Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Button Output</em>'.
	 * @generated
	 */
	ButtonOutput createButtonOutput();

	/**
	 * Returns a new object of class '<em>Pulse Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pulse Output</em>'.
	 * @generated
	 */
	PulseOutput createPulseOutput();

	/**
	 * Returns a new object of class '<em>Blink Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Blink Output</em>'.
	 * @generated
	 */
	BlinkOutput createBlinkOutput();

	/**
	 * Returns a new object of class '<em>Blink Timer Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Blink Timer Output</em>'.
	 * @generated
	 */
	BlinkTimerOutput createBlinkTimerOutput();

	/**
	 * Returns a new object of class '<em>Pwm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pwm</em>'.
	 * @generated
	 */
	Pwm createPwm();

	/**
	 * Returns a new object of class '<em>Transform To</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transform To</em>'.
	 * @generated
	 */
	TransformTo createTransformTo();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GpiosactuatorsPackage getGpiosactuatorsPackage();

} //GpiosactuatorsFactory

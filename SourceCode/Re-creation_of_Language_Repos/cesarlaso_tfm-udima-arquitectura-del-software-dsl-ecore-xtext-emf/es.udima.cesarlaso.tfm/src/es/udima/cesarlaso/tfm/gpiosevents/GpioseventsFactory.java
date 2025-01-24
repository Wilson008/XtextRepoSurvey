/**
 */
package es.udima.cesarlaso.tfm.gpiosevents;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.udima.cesarlaso.tfm.gpiosevents.GpioseventsPackage
 * @generated
 */
public interface GpioseventsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GpioseventsFactory eINSTANCE = es.udima.cesarlaso.tfm.gpiosevents.impl.GpioseventsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Interrupted</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interrupted</em>'.
	 * @generated
	 */
	Interrupted createInterrupted();

	/**
	 * Returns a new object of class '<em>Button Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Button Input</em>'.
	 * @generated
	 */
	ButtonInput createButtonInput();

	/**
	 * Returns a new object of class '<em>Button Input Accumulator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Button Input Accumulator</em>'.
	 * @generated
	 */
	ButtonInputAccumulator createButtonInputAccumulator();

	/**
	 * Returns a new object of class '<em>Button Input Released</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Button Input Released</em>'.
	 * @generated
	 */
	ButtonInputReleased createButtonInputReleased();

	/**
	 * Returns a new object of class '<em>Pulse Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pulse Input</em>'.
	 * @generated
	 */
	PulseInput createPulseInput();

	/**
	 * Returns a new object of class '<em>Analog Read</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analog Read</em>'.
	 * @generated
	 */
	AnalogRead createAnalogRead();

	/**
	 * Returns a new object of class '<em>Analog Read Perform On High</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analog Read Perform On High</em>'.
	 * @generated
	 */
	AnalogReadPerformOnHigh createAnalogReadPerformOnHigh();

	/**
	 * Returns a new object of class '<em>Analog Read Perform On Low</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analog Read Perform On Low</em>'.
	 * @generated
	 */
	AnalogReadPerformOnLow createAnalogReadPerformOnLow();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GpioseventsPackage getGpioseventsPackage();

} //GpioseventsFactory

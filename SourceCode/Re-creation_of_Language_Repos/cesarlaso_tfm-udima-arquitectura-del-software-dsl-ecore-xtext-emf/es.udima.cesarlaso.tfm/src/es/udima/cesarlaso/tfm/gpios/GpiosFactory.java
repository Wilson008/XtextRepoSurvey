/**
 */
package es.udima.cesarlaso.tfm.gpios;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.udima.cesarlaso.tfm.gpios.GpiosPackage
 * @generated
 */
public interface GpiosFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GpiosFactory eINSTANCE = es.udima.cesarlaso.tfm.gpios.impl.GpiosFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Digital Input Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Digital Input Pin</em>'.
	 * @generated
	 */
	DigitalInputPin createDigitalInputPin();

	/**
	 * Returns a new object of class '<em>Digital Output Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Digital Output Pin</em>'.
	 * @generated
	 */
	DigitalOutputPin createDigitalOutputPin();

	/**
	 * Returns a new object of class '<em>Analog Input Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analog Input Pin</em>'.
	 * @generated
	 */
	AnalogInputPin createAnalogInputPin();

	/**
	 * Returns a new object of class '<em>Analog Output Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analog Output Pin</em>'.
	 * @generated
	 */
	AnalogOutputPin createAnalogOutputPin();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GpiosPackage getGpiosPackage();

} //GpiosFactory

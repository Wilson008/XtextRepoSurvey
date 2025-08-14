/**
 */
package es.udima.cesarlaso.tfm.iotproyects;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.udima.cesarlaso.tfm.iotproyects.IotproyectsPackage
 * @generated
 */
public interface IotproyectsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IotproyectsFactory eINSTANCE = es.udima.cesarlaso.tfm.iotproyects.impl.IotproyectsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Iot Proyect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Iot Proyect</em>'.
	 * @generated
	 */
	IotProyect createIotProyect();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IotproyectsPackage getIotproyectsPackage();

} //IotproyectsFactory

/**
 */
package es.udima.cesarlaso.tfm.operatingsystemactuators;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.OperatingsystemactuatorsPackage
 * @generated
 */
public interface OperatingsystemactuatorsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OperatingsystemactuatorsFactory eINSTANCE = es.udima.cesarlaso.tfm.operatingsystemactuators.impl.OperatingsystemactuatorsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>System Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Command</em>'.
	 * @generated
	 */
	SystemCommand createSystemCommand();

	/**
	 * Returns a new object of class '<em>Play Sound</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Play Sound</em>'.
	 * @generated
	 */
	PlaySound createPlaySound();

	/**
	 * Returns a new object of class '<em>Download</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Download</em>'.
	 * @generated
	 */
	Download createDownload();

	/**
	 * Returns a new object of class '<em>Background Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Background Image</em>'.
	 * @generated
	 */
	BackgroundImage createBackgroundImage();

	/**
	 * Returns a new object of class '<em>Draw Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Draw Image</em>'.
	 * @generated
	 */
	DrawImage createDrawImage();

	/**
	 * Returns a new object of class '<em>Play Video</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Play Video</em>'.
	 * @generated
	 */
	PlayVideo createPlayVideo();

	/**
	 * Returns a new object of class '<em>File Path</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Path</em>'.
	 * @generated
	 */
	FilePath createFilePath();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OperatingsystemactuatorsPackage getOperatingsystemactuatorsPackage();

} //OperatingsystemactuatorsFactory

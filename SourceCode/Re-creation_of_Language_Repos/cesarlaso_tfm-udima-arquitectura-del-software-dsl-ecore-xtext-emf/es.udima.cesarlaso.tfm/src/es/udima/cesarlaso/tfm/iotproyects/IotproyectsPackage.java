/**
 */
package es.udima.cesarlaso.tfm.iotproyects;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see es.udima.cesarlaso.tfm.iotproyects.IotproyectsFactory
 * @model kind="package"
 * @generated
 */
public interface IotproyectsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "iotproyects";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://tfm.cesarlaso.udima.es/iotproyects";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "es.udima.cesarlaso.tfm.iotproyects";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IotproyectsPackage eINSTANCE = es.udima.cesarlaso.tfm.iotproyects.impl.IotproyectsPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.iotproyects.impl.IotProyectImpl <em>Iot Proyect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.iotproyects.impl.IotProyectImpl
	 * @see es.udima.cesarlaso.tfm.iotproyects.impl.IotproyectsPackageImpl#getIotProyect()
	 * @generated
	 */
	int IOT_PROYECT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOT_PROYECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Product Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOT_PROYECT__PRODUCT_CODE = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOT_PROYECT__VERSION = 2;

	/**
	 * The feature id for the '<em><b>Program</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOT_PROYECT__PROGRAM = 3;

	/**
	 * The feature id for the '<em><b>Deployment Device</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOT_PROYECT__DEPLOYMENT_DEVICE = 4;

	/**
	 * The feature id for the '<em><b>Server</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOT_PROYECT__SERVER = 5;

	/**
	 * The feature id for the '<em><b>Health Monitors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOT_PROYECT__HEALTH_MONITORS = 6;

	/**
	 * The number of structural features of the '<em>Iot Proyect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOT_PROYECT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Iot Proyect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOT_PROYECT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.iotproyects.IotProyect <em>Iot Proyect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iot Proyect</em>'.
	 * @see es.udima.cesarlaso.tfm.iotproyects.IotProyect
	 * @generated
	 */
	EClass getIotProyect();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.iotproyects.IotProyect#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.udima.cesarlaso.tfm.iotproyects.IotProyect#getName()
	 * @see #getIotProyect()
	 * @generated
	 */
	EAttribute getIotProyect_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.iotproyects.IotProyect#getProductCode <em>Product Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Code</em>'.
	 * @see es.udima.cesarlaso.tfm.iotproyects.IotProyect#getProductCode()
	 * @see #getIotProyect()
	 * @generated
	 */
	EAttribute getIotProyect_ProductCode();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.iotproyects.IotProyect#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see es.udima.cesarlaso.tfm.iotproyects.IotProyect#getVersion()
	 * @see #getIotProyect()
	 * @generated
	 */
	EAttribute getIotProyect_Version();

	/**
	 * Returns the meta object for the containment reference '{@link es.udima.cesarlaso.tfm.iotproyects.IotProyect#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program</em>'.
	 * @see es.udima.cesarlaso.tfm.iotproyects.IotProyect#getProgram()
	 * @see #getIotProyect()
	 * @generated
	 */
	EReference getIotProyect_Program();

	/**
	 * Returns the meta object for the containment reference list '{@link es.udima.cesarlaso.tfm.iotproyects.IotProyect#getDeploymentDevice <em>Deployment Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deployment Device</em>'.
	 * @see es.udima.cesarlaso.tfm.iotproyects.IotProyect#getDeploymentDevice()
	 * @see #getIotProyect()
	 * @generated
	 */
	EReference getIotProyect_DeploymentDevice();

	/**
	 * Returns the meta object for the containment reference list '{@link es.udima.cesarlaso.tfm.iotproyects.IotProyect#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Server</em>'.
	 * @see es.udima.cesarlaso.tfm.iotproyects.IotProyect#getServer()
	 * @see #getIotProyect()
	 * @generated
	 */
	EReference getIotProyect_Server();

	/**
	 * Returns the meta object for the containment reference list '{@link es.udima.cesarlaso.tfm.iotproyects.IotProyect#getHealthMonitors <em>Health Monitors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Health Monitors</em>'.
	 * @see es.udima.cesarlaso.tfm.iotproyects.IotProyect#getHealthMonitors()
	 * @see #getIotProyect()
	 * @generated
	 */
	EReference getIotProyect_HealthMonitors();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IotproyectsFactory getIotproyectsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.iotproyects.impl.IotProyectImpl <em>Iot Proyect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.iotproyects.impl.IotProyectImpl
		 * @see es.udima.cesarlaso.tfm.iotproyects.impl.IotproyectsPackageImpl#getIotProyect()
		 * @generated
		 */
		EClass IOT_PROYECT = eINSTANCE.getIotProyect();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IOT_PROYECT__NAME = eINSTANCE.getIotProyect_Name();

		/**
		 * The meta object literal for the '<em><b>Product Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IOT_PROYECT__PRODUCT_CODE = eINSTANCE.getIotProyect_ProductCode();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IOT_PROYECT__VERSION = eINSTANCE.getIotProyect_Version();

		/**
		 * The meta object literal for the '<em><b>Program</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IOT_PROYECT__PROGRAM = eINSTANCE.getIotProyect_Program();

		/**
		 * The meta object literal for the '<em><b>Deployment Device</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IOT_PROYECT__DEPLOYMENT_DEVICE = eINSTANCE.getIotProyect_DeploymentDevice();

		/**
		 * The meta object literal for the '<em><b>Server</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IOT_PROYECT__SERVER = eINSTANCE.getIotProyect_Server();

		/**
		 * The meta object literal for the '<em><b>Health Monitors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IOT_PROYECT__HEALTH_MONITORS = eINSTANCE.getIotProyect_HealthMonitors();

	}

} //IotproyectsPackage

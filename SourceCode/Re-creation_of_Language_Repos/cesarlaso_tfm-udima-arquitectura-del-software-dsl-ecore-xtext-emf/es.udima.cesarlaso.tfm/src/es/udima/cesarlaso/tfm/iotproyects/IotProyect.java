/**
 */
package es.udima.cesarlaso.tfm.iotproyects;

import es.udima.cesarlaso.tfm.deploymentdevices.Device;

import es.udima.cesarlaso.tfm.healthmonitors.HealthMonitorItem;

import es.udima.cesarlaso.tfm.programs.Program;

import es.udima.cesarlaso.tfm.servers.Server;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iot Proyect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.iotproyects.IotProyect#getName <em>Name</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.iotproyects.IotProyect#getProductCode <em>Product Code</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.iotproyects.IotProyect#getVersion <em>Version</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.iotproyects.IotProyect#getProgram <em>Program</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.iotproyects.IotProyect#getDeploymentDevice <em>Deployment Device</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.iotproyects.IotProyect#getServer <em>Server</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.iotproyects.IotProyect#getHealthMonitors <em>Health Monitors</em>}</li>
 * </ul>
 *
 * @see es.udima.cesarlaso.tfm.iotproyects.IotproyectsPackage#getIotProyect()
 * @model
 * @generated
 */
public interface IotProyect extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see es.udima.cesarlaso.tfm.iotproyects.IotproyectsPackage#getIotProyect_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.iotproyects.IotProyect#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Product Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Code</em>' attribute.
	 * @see #setProductCode(int)
	 * @see es.udima.cesarlaso.tfm.iotproyects.IotproyectsPackage#getIotProyect_ProductCode()
	 * @model required="true"
	 * @generated
	 */
	int getProductCode();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.iotproyects.IotProyect#getProductCode <em>Product Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Code</em>' attribute.
	 * @see #getProductCode()
	 * @generated
	 */
	void setProductCode(int value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(int)
	 * @see es.udima.cesarlaso.tfm.iotproyects.IotproyectsPackage#getIotProyect_Version()
	 * @model required="true"
	 * @generated
	 */
	int getVersion();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.iotproyects.IotProyect#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(int value);

	/**
	 * Returns the value of the '<em><b>Program</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program</em>' containment reference.
	 * @see #setProgram(Program)
	 * @see es.udima.cesarlaso.tfm.iotproyects.IotproyectsPackage#getIotProyect_Program()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Program getProgram();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.iotproyects.IotProyect#getProgram <em>Program</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program</em>' containment reference.
	 * @see #getProgram()
	 * @generated
	 */
	void setProgram(Program value);

	/**
	 * Returns the value of the '<em><b>Deployment Device</b></em>' containment reference list.
	 * The list contents are of type {@link es.udima.cesarlaso.tfm.deploymentdevices.Device}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment Device</em>' containment reference list.
	 * @see es.udima.cesarlaso.tfm.iotproyects.IotproyectsPackage#getIotProyect_DeploymentDevice()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Device> getDeploymentDevice();

	/**
	 * Returns the value of the '<em><b>Server</b></em>' containment reference list.
	 * The list contents are of type {@link es.udima.cesarlaso.tfm.servers.Server}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server</em>' containment reference list.
	 * @see es.udima.cesarlaso.tfm.iotproyects.IotproyectsPackage#getIotProyect_Server()
	 * @model containment="true"
	 * @generated
	 */
	EList<Server> getServer();

	/**
	 * Returns the value of the '<em><b>Health Monitors</b></em>' containment reference list.
	 * The list contents are of type {@link es.udima.cesarlaso.tfm.healthmonitors.HealthMonitorItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Health Monitors</em>' containment reference list.
	 * @see es.udima.cesarlaso.tfm.iotproyects.IotproyectsPackage#getIotProyect_HealthMonitors()
	 * @model containment="true"
	 * @generated
	 */
	EList<HealthMonitorItem> getHealthMonitors();

} // IotProyect

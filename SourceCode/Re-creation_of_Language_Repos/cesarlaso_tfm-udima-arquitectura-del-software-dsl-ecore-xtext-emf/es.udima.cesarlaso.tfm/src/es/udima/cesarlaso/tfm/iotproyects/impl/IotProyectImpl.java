/**
 */
package es.udima.cesarlaso.tfm.iotproyects.impl;

import es.udima.cesarlaso.tfm.deploymentdevices.Device;

import es.udima.cesarlaso.tfm.healthmonitors.HealthMonitorItem;

import es.udima.cesarlaso.tfm.iotproyects.IotProyect;
import es.udima.cesarlaso.tfm.iotproyects.IotproyectsPackage;

import es.udima.cesarlaso.tfm.programs.Program;

import es.udima.cesarlaso.tfm.servers.Server;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Iot Proyect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.iotproyects.impl.IotProyectImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.iotproyects.impl.IotProyectImpl#getProductCode <em>Product Code</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.iotproyects.impl.IotProyectImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.iotproyects.impl.IotProyectImpl#getProgram <em>Program</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.iotproyects.impl.IotProyectImpl#getDeploymentDevice <em>Deployment Device</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.iotproyects.impl.IotProyectImpl#getServer <em>Server</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.iotproyects.impl.IotProyectImpl#getHealthMonitors <em>Health Monitors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IotProyectImpl extends MinimalEObjectImpl.Container implements IotProyect {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductCode() <em>Product Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductCode()
	 * @generated
	 * @ordered
	 */
	protected static final int PRODUCT_CODE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getProductCode() <em>Product Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductCode()
	 * @generated
	 * @ordered
	 */
	protected int productCode = PRODUCT_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final int VERSION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected int version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProgram() <em>Program</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgram()
	 * @generated
	 * @ordered
	 */
	protected Program program;

	/**
	 * The cached value of the '{@link #getDeploymentDevice() <em>Deployment Device</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentDevice()
	 * @generated
	 * @ordered
	 */
	protected EList<Device> deploymentDevice;

	/**
	 * The cached value of the '{@link #getServer() <em>Server</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServer()
	 * @generated
	 * @ordered
	 */
	protected EList<Server> server;

	/**
	 * The cached value of the '{@link #getHealthMonitors() <em>Health Monitors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthMonitors()
	 * @generated
	 * @ordered
	 */
	protected EList<HealthMonitorItem> healthMonitors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IotProyectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IotproyectsPackage.Literals.IOT_PROYECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotproyectsPackage.IOT_PROYECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getProductCode() {
		return productCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductCode(int newProductCode) {
		int oldProductCode = productCode;
		productCode = newProductCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotproyectsPackage.IOT_PROYECT__PRODUCT_CODE, oldProductCode, productCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(int newVersion) {
		int oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotproyectsPackage.IOT_PROYECT__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Program getProgram() {
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgram(Program newProgram, NotificationChain msgs) {
		Program oldProgram = program;
		program = newProgram;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IotproyectsPackage.IOT_PROYECT__PROGRAM, oldProgram, newProgram);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProgram(Program newProgram) {
		if (newProgram != program) {
			NotificationChain msgs = null;
			if (program != null)
				msgs = ((InternalEObject)program).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IotproyectsPackage.IOT_PROYECT__PROGRAM, null, msgs);
			if (newProgram != null)
				msgs = ((InternalEObject)newProgram).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IotproyectsPackage.IOT_PROYECT__PROGRAM, null, msgs);
			msgs = basicSetProgram(newProgram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotproyectsPackage.IOT_PROYECT__PROGRAM, newProgram, newProgram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Device> getDeploymentDevice() {
		if (deploymentDevice == null) {
			deploymentDevice = new EObjectContainmentEList<Device>(Device.class, this, IotproyectsPackage.IOT_PROYECT__DEPLOYMENT_DEVICE);
		}
		return deploymentDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Server> getServer() {
		if (server == null) {
			server = new EObjectContainmentEList<Server>(Server.class, this, IotproyectsPackage.IOT_PROYECT__SERVER);
		}
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HealthMonitorItem> getHealthMonitors() {
		if (healthMonitors == null) {
			healthMonitors = new EObjectContainmentEList<HealthMonitorItem>(HealthMonitorItem.class, this, IotproyectsPackage.IOT_PROYECT__HEALTH_MONITORS);
		}
		return healthMonitors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IotproyectsPackage.IOT_PROYECT__PROGRAM:
				return basicSetProgram(null, msgs);
			case IotproyectsPackage.IOT_PROYECT__DEPLOYMENT_DEVICE:
				return ((InternalEList<?>)getDeploymentDevice()).basicRemove(otherEnd, msgs);
			case IotproyectsPackage.IOT_PROYECT__SERVER:
				return ((InternalEList<?>)getServer()).basicRemove(otherEnd, msgs);
			case IotproyectsPackage.IOT_PROYECT__HEALTH_MONITORS:
				return ((InternalEList<?>)getHealthMonitors()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IotproyectsPackage.IOT_PROYECT__NAME:
				return getName();
			case IotproyectsPackage.IOT_PROYECT__PRODUCT_CODE:
				return getProductCode();
			case IotproyectsPackage.IOT_PROYECT__VERSION:
				return getVersion();
			case IotproyectsPackage.IOT_PROYECT__PROGRAM:
				return getProgram();
			case IotproyectsPackage.IOT_PROYECT__DEPLOYMENT_DEVICE:
				return getDeploymentDevice();
			case IotproyectsPackage.IOT_PROYECT__SERVER:
				return getServer();
			case IotproyectsPackage.IOT_PROYECT__HEALTH_MONITORS:
				return getHealthMonitors();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IotproyectsPackage.IOT_PROYECT__NAME:
				setName((String)newValue);
				return;
			case IotproyectsPackage.IOT_PROYECT__PRODUCT_CODE:
				setProductCode((Integer)newValue);
				return;
			case IotproyectsPackage.IOT_PROYECT__VERSION:
				setVersion((Integer)newValue);
				return;
			case IotproyectsPackage.IOT_PROYECT__PROGRAM:
				setProgram((Program)newValue);
				return;
			case IotproyectsPackage.IOT_PROYECT__DEPLOYMENT_DEVICE:
				getDeploymentDevice().clear();
				getDeploymentDevice().addAll((Collection<? extends Device>)newValue);
				return;
			case IotproyectsPackage.IOT_PROYECT__SERVER:
				getServer().clear();
				getServer().addAll((Collection<? extends Server>)newValue);
				return;
			case IotproyectsPackage.IOT_PROYECT__HEALTH_MONITORS:
				getHealthMonitors().clear();
				getHealthMonitors().addAll((Collection<? extends HealthMonitorItem>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case IotproyectsPackage.IOT_PROYECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IotproyectsPackage.IOT_PROYECT__PRODUCT_CODE:
				setProductCode(PRODUCT_CODE_EDEFAULT);
				return;
			case IotproyectsPackage.IOT_PROYECT__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case IotproyectsPackage.IOT_PROYECT__PROGRAM:
				setProgram((Program)null);
				return;
			case IotproyectsPackage.IOT_PROYECT__DEPLOYMENT_DEVICE:
				getDeploymentDevice().clear();
				return;
			case IotproyectsPackage.IOT_PROYECT__SERVER:
				getServer().clear();
				return;
			case IotproyectsPackage.IOT_PROYECT__HEALTH_MONITORS:
				getHealthMonitors().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IotproyectsPackage.IOT_PROYECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IotproyectsPackage.IOT_PROYECT__PRODUCT_CODE:
				return productCode != PRODUCT_CODE_EDEFAULT;
			case IotproyectsPackage.IOT_PROYECT__VERSION:
				return version != VERSION_EDEFAULT;
			case IotproyectsPackage.IOT_PROYECT__PROGRAM:
				return program != null;
			case IotproyectsPackage.IOT_PROYECT__DEPLOYMENT_DEVICE:
				return deploymentDevice != null && !deploymentDevice.isEmpty();
			case IotproyectsPackage.IOT_PROYECT__SERVER:
				return server != null && !server.isEmpty();
			case IotproyectsPackage.IOT_PROYECT__HEALTH_MONITORS:
				return healthMonitors != null && !healthMonitors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", productCode: ");
		result.append(productCode);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //IotProyectImpl

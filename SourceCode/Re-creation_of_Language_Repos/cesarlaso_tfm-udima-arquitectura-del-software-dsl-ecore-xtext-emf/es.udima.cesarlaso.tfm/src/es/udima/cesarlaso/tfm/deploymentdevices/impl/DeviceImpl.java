/**
 */
package es.udima.cesarlaso.tfm.deploymentdevices.impl;

import es.udima.cesarlaso.tfm.deploymentdevices.DeploymentdevicesPackage;
import es.udima.cesarlaso.tfm.deploymentdevices.Device;
import es.udima.cesarlaso.tfm.deploymentdevices.WifiConfiguration;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.deploymentdevices.impl.DeviceImpl#getWifiConfiguration <em>Wifi Configuration</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DeviceImpl extends MinimalEObjectImpl.Container implements Device {
	/**
	 * The cached value of the '{@link #getWifiConfiguration() <em>Wifi Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWifiConfiguration()
	 * @generated
	 * @ordered
	 */
	protected WifiConfiguration wifiConfiguration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentdevicesPackage.Literals.DEVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WifiConfiguration getWifiConfiguration() {
		return wifiConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWifiConfiguration(WifiConfiguration newWifiConfiguration, NotificationChain msgs) {
		WifiConfiguration oldWifiConfiguration = wifiConfiguration;
		wifiConfiguration = newWifiConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeploymentdevicesPackage.DEVICE__WIFI_CONFIGURATION, oldWifiConfiguration, newWifiConfiguration);
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
	public void setWifiConfiguration(WifiConfiguration newWifiConfiguration) {
		if (newWifiConfiguration != wifiConfiguration) {
			NotificationChain msgs = null;
			if (wifiConfiguration != null)
				msgs = ((InternalEObject)wifiConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeploymentdevicesPackage.DEVICE__WIFI_CONFIGURATION, null, msgs);
			if (newWifiConfiguration != null)
				msgs = ((InternalEObject)newWifiConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeploymentdevicesPackage.DEVICE__WIFI_CONFIGURATION, null, msgs);
			msgs = basicSetWifiConfiguration(newWifiConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentdevicesPackage.DEVICE__WIFI_CONFIGURATION, newWifiConfiguration, newWifiConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getDeviceNumber() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DeploymentdevicesPackage.DEVICE__WIFI_CONFIGURATION:
				return basicSetWifiConfiguration(null, msgs);
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
			case DeploymentdevicesPackage.DEVICE__WIFI_CONFIGURATION:
				return getWifiConfiguration();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DeploymentdevicesPackage.DEVICE__WIFI_CONFIGURATION:
				setWifiConfiguration((WifiConfiguration)newValue);
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
			case DeploymentdevicesPackage.DEVICE__WIFI_CONFIGURATION:
				setWifiConfiguration((WifiConfiguration)null);
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
			case DeploymentdevicesPackage.DEVICE__WIFI_CONFIGURATION:
				return wifiConfiguration != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DeploymentdevicesPackage.DEVICE___GET_DEVICE_NUMBER:
				return getDeviceNumber();
		}
		return super.eInvoke(operationID, arguments);
	}

} //DeviceImpl

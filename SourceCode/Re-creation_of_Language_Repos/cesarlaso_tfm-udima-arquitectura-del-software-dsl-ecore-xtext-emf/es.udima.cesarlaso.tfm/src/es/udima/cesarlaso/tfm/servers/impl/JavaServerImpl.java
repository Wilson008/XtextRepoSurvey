/**
 */
package es.udima.cesarlaso.tfm.servers.impl;

import es.udima.cesarlaso.tfm.servers.JavaServer;
import es.udima.cesarlaso.tfm.servers.ServersPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.servers.impl.JavaServerImpl#getNetworkInterfaceAddress <em>Network Interface Address</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.servers.impl.JavaServerImpl#getNetworkInterfacePort <em>Network Interface Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JavaServerImpl extends ServerImpl implements JavaServer {
	/**
	 * The default value of the '{@link #getNetworkInterfaceAddress() <em>Network Interface Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkInterfaceAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String NETWORK_INTERFACE_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNetworkInterfaceAddress() <em>Network Interface Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkInterfaceAddress()
	 * @generated
	 * @ordered
	 */
	protected String networkInterfaceAddress = NETWORK_INTERFACE_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNetworkInterfacePort() <em>Network Interface Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkInterfacePort()
	 * @generated
	 * @ordered
	 */
	protected static final int NETWORK_INTERFACE_PORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNetworkInterfacePort() <em>Network Interface Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkInterfacePort()
	 * @generated
	 * @ordered
	 */
	protected int networkInterfacePort = NETWORK_INTERFACE_PORT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaServerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServersPackage.Literals.JAVA_SERVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNetworkInterfaceAddress() {
		return networkInterfaceAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNetworkInterfaceAddress(String newNetworkInterfaceAddress) {
		String oldNetworkInterfaceAddress = networkInterfaceAddress;
		networkInterfaceAddress = newNetworkInterfaceAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServersPackage.JAVA_SERVER__NETWORK_INTERFACE_ADDRESS, oldNetworkInterfaceAddress, networkInterfaceAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNetworkInterfacePort() {
		return networkInterfacePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNetworkInterfacePort(int newNetworkInterfacePort) {
		int oldNetworkInterfacePort = networkInterfacePort;
		networkInterfacePort = newNetworkInterfacePort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServersPackage.JAVA_SERVER__NETWORK_INTERFACE_PORT, oldNetworkInterfacePort, networkInterfacePort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServersPackage.JAVA_SERVER__NETWORK_INTERFACE_ADDRESS:
				return getNetworkInterfaceAddress();
			case ServersPackage.JAVA_SERVER__NETWORK_INTERFACE_PORT:
				return getNetworkInterfacePort();
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
			case ServersPackage.JAVA_SERVER__NETWORK_INTERFACE_ADDRESS:
				setNetworkInterfaceAddress((String)newValue);
				return;
			case ServersPackage.JAVA_SERVER__NETWORK_INTERFACE_PORT:
				setNetworkInterfacePort((Integer)newValue);
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
			case ServersPackage.JAVA_SERVER__NETWORK_INTERFACE_ADDRESS:
				setNetworkInterfaceAddress(NETWORK_INTERFACE_ADDRESS_EDEFAULT);
				return;
			case ServersPackage.JAVA_SERVER__NETWORK_INTERFACE_PORT:
				setNetworkInterfacePort(NETWORK_INTERFACE_PORT_EDEFAULT);
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
			case ServersPackage.JAVA_SERVER__NETWORK_INTERFACE_ADDRESS:
				return NETWORK_INTERFACE_ADDRESS_EDEFAULT == null ? networkInterfaceAddress != null : !NETWORK_INTERFACE_ADDRESS_EDEFAULT.equals(networkInterfaceAddress);
			case ServersPackage.JAVA_SERVER__NETWORK_INTERFACE_PORT:
				return networkInterfacePort != NETWORK_INTERFACE_PORT_EDEFAULT;
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
		result.append(" (networkInterfaceAddress: ");
		result.append(networkInterfaceAddress);
		result.append(", networkInterfacePort: ");
		result.append(networkInterfacePort);
		result.append(')');
		return result.toString();
	}

} //JavaServerImpl

/**
 */
package es.udima.cesarlaso.tfm.healthmonitors.impl;

import es.udima.cesarlaso.tfm.healthmonitors.HealthmonitorsPackage;
import es.udima.cesarlaso.tfm.healthmonitors.NetworkInterface;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.healthmonitors.impl.NetworkInterfaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.healthmonitors.impl.NetworkInterfaceImpl#getRxBytes <em>Rx Bytes</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.healthmonitors.impl.NetworkInterfaceImpl#getTxBytes <em>Tx Bytes</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.healthmonitors.impl.NetworkInterfaceImpl#getRxPackets <em>Rx Packets</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.healthmonitors.impl.NetworkInterfaceImpl#getTxPackets <em>Tx Packets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkInterfaceImpl extends MinimalEObjectImpl.Container implements NetworkInterface {
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
	 * The default value of the '{@link #getRxBytes() <em>Rx Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRxBytes()
	 * @generated
	 * @ordered
	 */
	protected static final long RX_BYTES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getRxBytes() <em>Rx Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRxBytes()
	 * @generated
	 * @ordered
	 */
	protected long rxBytes = RX_BYTES_EDEFAULT;

	/**
	 * The default value of the '{@link #getTxBytes() <em>Tx Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTxBytes()
	 * @generated
	 * @ordered
	 */
	protected static final long TX_BYTES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTxBytes() <em>Tx Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTxBytes()
	 * @generated
	 * @ordered
	 */
	protected long txBytes = TX_BYTES_EDEFAULT;

	/**
	 * The default value of the '{@link #getRxPackets() <em>Rx Packets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRxPackets()
	 * @generated
	 * @ordered
	 */
	protected static final long RX_PACKETS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getRxPackets() <em>Rx Packets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRxPackets()
	 * @generated
	 * @ordered
	 */
	protected long rxPackets = RX_PACKETS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTxPackets() <em>Tx Packets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTxPackets()
	 * @generated
	 * @ordered
	 */
	protected static final long TX_PACKETS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTxPackets() <em>Tx Packets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTxPackets()
	 * @generated
	 * @ordered
	 */
	protected long txPackets = TX_PACKETS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HealthmonitorsPackage.Literals.NETWORK_INTERFACE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, HealthmonitorsPackage.NETWORK_INTERFACE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getRxBytes() {
		return rxBytes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRxBytes(long newRxBytes) {
		long oldRxBytes = rxBytes;
		rxBytes = newRxBytes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HealthmonitorsPackage.NETWORK_INTERFACE__RX_BYTES, oldRxBytes, rxBytes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getTxBytes() {
		return txBytes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTxBytes(long newTxBytes) {
		long oldTxBytes = txBytes;
		txBytes = newTxBytes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HealthmonitorsPackage.NETWORK_INTERFACE__TX_BYTES, oldTxBytes, txBytes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getRxPackets() {
		return rxPackets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRxPackets(long newRxPackets) {
		long oldRxPackets = rxPackets;
		rxPackets = newRxPackets;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HealthmonitorsPackage.NETWORK_INTERFACE__RX_PACKETS, oldRxPackets, rxPackets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getTxPackets() {
		return txPackets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTxPackets(long newTxPackets) {
		long oldTxPackets = txPackets;
		txPackets = newTxPackets;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HealthmonitorsPackage.NETWORK_INTERFACE__TX_PACKETS, oldTxPackets, txPackets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HealthmonitorsPackage.NETWORK_INTERFACE__NAME:
				return getName();
			case HealthmonitorsPackage.NETWORK_INTERFACE__RX_BYTES:
				return getRxBytes();
			case HealthmonitorsPackage.NETWORK_INTERFACE__TX_BYTES:
				return getTxBytes();
			case HealthmonitorsPackage.NETWORK_INTERFACE__RX_PACKETS:
				return getRxPackets();
			case HealthmonitorsPackage.NETWORK_INTERFACE__TX_PACKETS:
				return getTxPackets();
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
			case HealthmonitorsPackage.NETWORK_INTERFACE__NAME:
				setName((String)newValue);
				return;
			case HealthmonitorsPackage.NETWORK_INTERFACE__RX_BYTES:
				setRxBytes((Long)newValue);
				return;
			case HealthmonitorsPackage.NETWORK_INTERFACE__TX_BYTES:
				setTxBytes((Long)newValue);
				return;
			case HealthmonitorsPackage.NETWORK_INTERFACE__RX_PACKETS:
				setRxPackets((Long)newValue);
				return;
			case HealthmonitorsPackage.NETWORK_INTERFACE__TX_PACKETS:
				setTxPackets((Long)newValue);
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
			case HealthmonitorsPackage.NETWORK_INTERFACE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case HealthmonitorsPackage.NETWORK_INTERFACE__RX_BYTES:
				setRxBytes(RX_BYTES_EDEFAULT);
				return;
			case HealthmonitorsPackage.NETWORK_INTERFACE__TX_BYTES:
				setTxBytes(TX_BYTES_EDEFAULT);
				return;
			case HealthmonitorsPackage.NETWORK_INTERFACE__RX_PACKETS:
				setRxPackets(RX_PACKETS_EDEFAULT);
				return;
			case HealthmonitorsPackage.NETWORK_INTERFACE__TX_PACKETS:
				setTxPackets(TX_PACKETS_EDEFAULT);
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
			case HealthmonitorsPackage.NETWORK_INTERFACE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case HealthmonitorsPackage.NETWORK_INTERFACE__RX_BYTES:
				return rxBytes != RX_BYTES_EDEFAULT;
			case HealthmonitorsPackage.NETWORK_INTERFACE__TX_BYTES:
				return txBytes != TX_BYTES_EDEFAULT;
			case HealthmonitorsPackage.NETWORK_INTERFACE__RX_PACKETS:
				return rxPackets != RX_PACKETS_EDEFAULT;
			case HealthmonitorsPackage.NETWORK_INTERFACE__TX_PACKETS:
				return txPackets != TX_PACKETS_EDEFAULT;
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
		result.append(", rxBytes: ");
		result.append(rxBytes);
		result.append(", txBytes: ");
		result.append(txBytes);
		result.append(", rxPackets: ");
		result.append(rxPackets);
		result.append(", txPackets: ");
		result.append(txPackets);
		result.append(')');
		return result.toString();
	}

} //NetworkInterfaceImpl

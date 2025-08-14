/**
 */
package es.udima.cesarlaso.tfm.healthmonitors;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.healthmonitors.NetworkInterface#getName <em>Name</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.healthmonitors.NetworkInterface#getRxBytes <em>Rx Bytes</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.healthmonitors.NetworkInterface#getTxBytes <em>Tx Bytes</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.healthmonitors.NetworkInterface#getRxPackets <em>Rx Packets</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.healthmonitors.NetworkInterface#getTxPackets <em>Tx Packets</em>}</li>
 * </ul>
 *
 * @see es.udima.cesarlaso.tfm.healthmonitors.HealthmonitorsPackage#getNetworkInterface()
 * @model
 * @generated
 */
public interface NetworkInterface extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see es.udima.cesarlaso.tfm.healthmonitors.HealthmonitorsPackage#getNetworkInterface_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.healthmonitors.NetworkInterface#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Rx Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rx Bytes</em>' attribute.
	 * @see #setRxBytes(long)
	 * @see es.udima.cesarlaso.tfm.healthmonitors.HealthmonitorsPackage#getNetworkInterface_RxBytes()
	 * @model required="true"
	 * @generated
	 */
	long getRxBytes();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.healthmonitors.NetworkInterface#getRxBytes <em>Rx Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rx Bytes</em>' attribute.
	 * @see #getRxBytes()
	 * @generated
	 */
	void setRxBytes(long value);

	/**
	 * Returns the value of the '<em><b>Tx Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tx Bytes</em>' attribute.
	 * @see #setTxBytes(long)
	 * @see es.udima.cesarlaso.tfm.healthmonitors.HealthmonitorsPackage#getNetworkInterface_TxBytes()
	 * @model required="true"
	 * @generated
	 */
	long getTxBytes();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.healthmonitors.NetworkInterface#getTxBytes <em>Tx Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tx Bytes</em>' attribute.
	 * @see #getTxBytes()
	 * @generated
	 */
	void setTxBytes(long value);

	/**
	 * Returns the value of the '<em><b>Rx Packets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rx Packets</em>' attribute.
	 * @see #setRxPackets(long)
	 * @see es.udima.cesarlaso.tfm.healthmonitors.HealthmonitorsPackage#getNetworkInterface_RxPackets()
	 * @model required="true"
	 * @generated
	 */
	long getRxPackets();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.healthmonitors.NetworkInterface#getRxPackets <em>Rx Packets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rx Packets</em>' attribute.
	 * @see #getRxPackets()
	 * @generated
	 */
	void setRxPackets(long value);

	/**
	 * Returns the value of the '<em><b>Tx Packets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tx Packets</em>' attribute.
	 * @see #setTxPackets(long)
	 * @see es.udima.cesarlaso.tfm.healthmonitors.HealthmonitorsPackage#getNetworkInterface_TxPackets()
	 * @model required="true"
	 * @generated
	 */
	long getTxPackets();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.healthmonitors.NetworkInterface#getTxPackets <em>Tx Packets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tx Packets</em>' attribute.
	 * @see #getTxPackets()
	 * @generated
	 */
	void setTxPackets(long value);

} // NetworkInterface

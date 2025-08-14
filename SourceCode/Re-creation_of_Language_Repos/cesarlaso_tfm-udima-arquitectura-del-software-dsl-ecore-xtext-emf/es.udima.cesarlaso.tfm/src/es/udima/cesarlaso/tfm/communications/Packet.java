/**
 */
package es.udima.cesarlaso.tfm.communications;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Packet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Un paquete define la unidad minima de comunicación entre el sistema cliente servidor. Un paquete contiene un numero de secuencia de envío, timestamp de fecha de envío, y uno o varios servicios
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.communications.Packet#getSecuence <em>Secuence</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.communications.Packet#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.communications.Packet#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @see es.udima.cesarlaso.tfm.communications.CommunicationsPackage#getPacket()
 * @model
 * @generated
 */
public interface Packet extends EObject {
	/**
	 * Returns the value of the '<em><b>Secuence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * El número de secuencia, como su nombre indica, ha de ser secuencial desde el punto de vista de quien genere este nímero.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Secuence</em>' attribute.
	 * @see #setSecuence(int)
	 * @see es.udima.cesarlaso.tfm.communications.CommunicationsPackage#getPacket_Secuence()
	 * @model required="true"
	 * @generated
	 */
	int getSecuence();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.communications.Packet#getSecuence <em>Secuence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secuence</em>' attribute.
	 * @see #getSecuence()
	 * @generated
	 */
	void setSecuence(int value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Numero de segundos en formato Unix timestamp, con precisión de milisegundos.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(long)
	 * @see es.udima.cesarlaso.tfm.communications.CommunicationsPackage#getPacket_Timestamp()
	 * @model required="true"
	 * @generated
	 */
	long getTimestamp();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.communications.Packet#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(long value);

	/**
	 * Returns the value of the '<em><b>Services</b></em>' reference list.
	 * The list contents are of type {@link es.udima.cesarlaso.tfm.communications.Service}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Un paquete no puede ir vacio, como mínimo tiene que tener un servicio. 
	 * Un ejemplo de paquete vacio de control es un paquete con un servicio Ping
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Services</em>' reference list.
	 * @see es.udima.cesarlaso.tfm.communications.CommunicationsPackage#getPacket_Services()
	 * @model required="true"
	 * @generated
	 */
	EList<Service> getServices();

} // Packet

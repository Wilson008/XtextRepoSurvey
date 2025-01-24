/**
 */
package es.udima.cesarlaso.tfm.communications;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Response</b></em>'.
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
 *   <li>{@link es.udima.cesarlaso.tfm.communications.ServiceResponse#getRequestId <em>Request Id</em>}</li>
 * </ul>
 *
 * @see es.udima.cesarlaso.tfm.communications.CommunicationsPackage#getServiceResponse()
 * @model abstract="true"
 * @generated
 */
public interface ServiceResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Request Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * El número de secuencia, como su nombre indica, ha de ser secuencial desde el punto de vista de quien genere este nímero.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Request Id</em>' attribute.
	 * @see #setRequestId(int)
	 * @see es.udima.cesarlaso.tfm.communications.CommunicationsPackage#getServiceResponse_RequestId()
	 * @model required="true"
	 * @generated
	 */
	int getRequestId();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.communications.ServiceResponse#getRequestId <em>Request Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Id</em>' attribute.
	 * @see #getRequestId()
	 * @generated
	 */
	void setRequestId(int value);

} // ServiceResponse

/**
 */
package es.udima.cesarlaso.tfm.communications;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Request</b></em>'.
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
 *   <li>{@link es.udima.cesarlaso.tfm.communications.ServiceRequest#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see es.udima.cesarlaso.tfm.communications.CommunicationsPackage#getServiceRequest()
 * @model abstract="true"
 * @generated
 */
public interface ServiceRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * El número de secuencia, como su nombre indica, ha de ser secuencial desde el punto de vista de quien genere este nímero.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see es.udima.cesarlaso.tfm.communications.CommunicationsPackage#getServiceRequest_Id()
	 * @model required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.communications.ServiceRequest#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

} // ServiceRequest

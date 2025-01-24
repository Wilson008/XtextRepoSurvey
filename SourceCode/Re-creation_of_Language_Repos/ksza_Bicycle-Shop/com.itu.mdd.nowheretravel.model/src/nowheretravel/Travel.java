/**
 */
package nowheretravel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Travel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nowheretravel.Travel#getStart <em>Start</em>}</li>
 *   <li>{@link nowheretravel.Travel#getData <em>Data</em>}</li>
 *   <li>{@link nowheretravel.Travel#getEnd <em>End</em>}</li>
 *   <li>{@link nowheretravel.Travel#getConnections <em>Connections</em>}</li>
 *   <li>{@link nowheretravel.Travel#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see nowheretravel.NowheretravelPackage#getTravel()
 * @model
 * @generated
 */
public interface Travel extends EObject {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(Start)
	 * @see nowheretravel.NowheretravelPackage#getTravel_Start()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Start getStart();

	/**
	 * Sets the value of the '{@link nowheretravel.Travel#getStart <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' containment reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Start value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference list.
	 * The list contents are of type {@link nowheretravel.Data}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference list.
	 * @see nowheretravel.NowheretravelPackage#getTravel_Data()
	 * @model containment="true"
	 * @generated
	 */
	EList<Data> getData();

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(End)
	 * @see nowheretravel.NowheretravelPackage#getTravel_End()
	 * @model containment="true" required="true"
	 * @generated
	 */
	End getEnd();

	/**
	 * Sets the value of the '{@link nowheretravel.Travel#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(End value);

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
	 * The list contents are of type {@link nowheretravel.Connection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' containment reference list.
	 * @see nowheretravel.NowheretravelPackage#getTravel_Connections()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connection> getConnections();

	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link nowheretravel.Item}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see nowheretravel.NowheretravelPackage#getTravel_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<Item> getItems();

} // Travel

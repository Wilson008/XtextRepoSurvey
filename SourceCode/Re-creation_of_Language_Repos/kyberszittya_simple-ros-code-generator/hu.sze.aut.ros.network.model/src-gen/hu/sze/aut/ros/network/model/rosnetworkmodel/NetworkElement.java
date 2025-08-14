/**
 */
package hu.sze.aut.ros.network.model.rosnetworkmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.aut.ros.network.model.rosnetworkmodel.NetworkElement#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.RosnetworkmodelPackage#getNetworkElement()
 * @model
 * @generated
 */
public interface NetworkElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.RosnetworkmodelPackage#getNetworkElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hu.sze.aut.ros.network.model.rosnetworkmodel.NetworkElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // NetworkElement

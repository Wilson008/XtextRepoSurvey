/**
 */
package hu.sze.aut.ros.network.model.rosnetworkmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.aut.ros.network.model.rosnetworkmodel.Network#getNode <em>Node</em>}</li>
 *   <li>{@link hu.sze.aut.ros.network.model.rosnetworkmodel.Network#getTopic <em>Topic</em>}</li>
 * </ul>
 *
 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.RosnetworkmodelPackage#getNetwork()
 * @model
 * @generated
 */
public interface Network extends EObject {
	/**
	 * Returns the value of the '<em><b>Node</b></em>' containment reference list.
	 * The list contents are of type {@link hu.sze.aut.ros.network.model.rosnetworkmodel.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' containment reference list.
	 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.RosnetworkmodelPackage#getNetwork_Node()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNode();

	/**
	 * Returns the value of the '<em><b>Topic</b></em>' containment reference list.
	 * The list contents are of type {@link hu.sze.aut.ros.network.model.rosnetworkmodel.Topic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic</em>' containment reference list.
	 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.RosnetworkmodelPackage#getNetwork_Topic()
	 * @model containment="true"
	 * @generated
	 */
	EList<Topic> getTopic();

} // Network

/**
 */
package nowheretravel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nowheretravel.Node#getOutgoingConnections <em>Outgoing Connections</em>}</li>
 *   <li>{@link nowheretravel.Node#getIngoingConnections <em>Ingoing Connections</em>}</li>
 * </ul>
 *
 * @see nowheretravel.NowheretravelPackage#getNode()
 * @model abstract="true"
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Outgoing Connections</b></em>' reference list.
	 * The list contents are of type {@link nowheretravel.Connection}.
	 * It is bidirectional and its opposite is '{@link nowheretravel.Connection#getSourceNode <em>Source Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Connections</em>' reference list.
	 * @see nowheretravel.NowheretravelPackage#getNode_OutgoingConnections()
	 * @see nowheretravel.Connection#getSourceNode
	 * @model opposite="sourceNode"
	 * @generated
	 */
	EList<Connection> getOutgoingConnections();

	/**
	 * Returns the value of the '<em><b>Ingoing Connections</b></em>' reference list.
	 * The list contents are of type {@link nowheretravel.Connection}.
	 * It is bidirectional and its opposite is '{@link nowheretravel.Connection#getTargetNode <em>Target Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ingoing Connections</em>' reference list.
	 * @see nowheretravel.NowheretravelPackage#getNode_IngoingConnections()
	 * @see nowheretravel.Connection#getTargetNode
	 * @model opposite="targetNode"
	 * @generated
	 */
	EList<Connection> getIngoingConnections();

} // Node

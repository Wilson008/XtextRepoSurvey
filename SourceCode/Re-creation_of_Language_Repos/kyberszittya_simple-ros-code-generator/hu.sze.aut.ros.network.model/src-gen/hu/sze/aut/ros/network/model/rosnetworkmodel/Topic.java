/**
 */
package hu.sze.aut.ros.network.model.rosnetworkmodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Topic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.aut.ros.network.model.rosnetworkmodel.Topic#getRosmsg <em>Rosmsg</em>}</li>
 * </ul>
 *
 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.RosnetworkmodelPackage#getTopic()
 * @model
 * @generated
 */
public interface Topic extends NetworkElement {
	/**
	 * Returns the value of the '<em><b>Rosmsg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rosmsg</em>' reference.
	 * @see #setRosmsg(RosMsg)
	 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.RosnetworkmodelPackage#getTopic_Rosmsg()
	 * @model
	 * @generated
	 */
	RosMsg getRosmsg();

	/**
	 * Sets the value of the '{@link hu.sze.aut.ros.network.model.rosnetworkmodel.Topic#getRosmsg <em>Rosmsg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rosmsg</em>' reference.
	 * @see #getRosmsg()
	 * @generated
	 */
	void setRosmsg(RosMsg value);

} // Topic

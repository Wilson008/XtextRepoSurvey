/**
 */
package hu.sze.aut.ros.network.model.rosnetworkmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ros Msg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.aut.ros.network.model.rosnetworkmodel.RosMsg#getName <em>Name</em>}</li>
 *   <li>{@link hu.sze.aut.ros.network.model.rosnetworkmodel.RosMsg#isStamped <em>Stamped</em>}</li>
 *   <li>{@link hu.sze.aut.ros.network.model.rosnetworkmodel.RosMsg#getPackage <em>Package</em>}</li>
 * </ul>
 *
 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.RosnetworkmodelPackage#getRosMsg()
 * @model
 * @generated
 */
public interface RosMsg extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.RosnetworkmodelPackage#getRosMsg_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hu.sze.aut.ros.network.model.rosnetworkmodel.RosMsg#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Stamped</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stamped</em>' attribute.
	 * @see #setStamped(boolean)
	 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.RosnetworkmodelPackage#getRosMsg_Stamped()
	 * @model default="true"
	 * @generated
	 */
	boolean isStamped();

	/**
	 * Sets the value of the '{@link hu.sze.aut.ros.network.model.rosnetworkmodel.RosMsg#isStamped <em>Stamped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stamped</em>' attribute.
	 * @see #isStamped()
	 * @generated
	 */
	void setStamped(boolean value);

	/**
	 * Returns the value of the '<em><b>Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hu.sze.aut.ros.network.model.rosnetworkmodel.Package#getRosmsg <em>Rosmsg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' container reference.
	 * @see #setPackage(hu.sze.aut.ros.network.model.rosnetworkmodel.Package)
	 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.RosnetworkmodelPackage#getRosMsg_Package()
	 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.Package#getRosmsg
	 * @model opposite="rosmsg" transient="false"
	 * @generated
	 */
	hu.sze.aut.ros.network.model.rosnetworkmodel.Package getPackage();

	/**
	 * Sets the value of the '{@link hu.sze.aut.ros.network.model.rosnetworkmodel.RosMsg#getPackage <em>Package</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' container reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(hu.sze.aut.ros.network.model.rosnetworkmodel.Package value);

} // RosMsg

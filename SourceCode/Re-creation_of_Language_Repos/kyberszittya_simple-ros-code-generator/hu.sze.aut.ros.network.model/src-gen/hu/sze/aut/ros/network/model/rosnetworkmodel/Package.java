/**
 */
package hu.sze.aut.ros.network.model.rosnetworkmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.aut.ros.network.model.rosnetworkmodel.Package#getSubpackage <em>Subpackage</em>}</li>
 *   <li>{@link hu.sze.aut.ros.network.model.rosnetworkmodel.Package#getRosmsg <em>Rosmsg</em>}</li>
 *   <li>{@link hu.sze.aut.ros.network.model.rosnetworkmodel.Package#getName <em>Name</em>}</li>
 *   <li>{@link hu.sze.aut.ros.network.model.rosnetworkmodel.Package#getPackage <em>Package</em>}</li>
 * </ul>
 *
 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.RosnetworkmodelPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends EObject {
	/**
	 * Returns the value of the '<em><b>Subpackage</b></em>' containment reference list.
	 * The list contents are of type {@link hu.sze.aut.ros.network.model.rosnetworkmodel.Package}.
	 * It is bidirectional and its opposite is '{@link hu.sze.aut.ros.network.model.rosnetworkmodel.Package#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subpackage</em>' containment reference list.
	 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.RosnetworkmodelPackage#getPackage_Subpackage()
	 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.Package#getPackage
	 * @model opposite="package" containment="true"
	 * @generated
	 */
	EList<Package> getSubpackage();

	/**
	 * Returns the value of the '<em><b>Rosmsg</b></em>' containment reference list.
	 * The list contents are of type {@link hu.sze.aut.ros.network.model.rosnetworkmodel.RosMsg}.
	 * It is bidirectional and its opposite is '{@link hu.sze.aut.ros.network.model.rosnetworkmodel.RosMsg#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rosmsg</em>' containment reference list.
	 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.RosnetworkmodelPackage#getPackage_Rosmsg()
	 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.RosMsg#getPackage
	 * @model opposite="package" containment="true"
	 * @generated
	 */
	EList<RosMsg> getRosmsg();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.RosnetworkmodelPackage#getPackage_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hu.sze.aut.ros.network.model.rosnetworkmodel.Package#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hu.sze.aut.ros.network.model.rosnetworkmodel.Package#getSubpackage <em>Subpackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' container reference.
	 * @see #setPackage(Package)
	 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.RosnetworkmodelPackage#getPackage_Package()
	 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.Package#getSubpackage
	 * @model opposite="subpackage" transient="false"
	 * @generated
	 */
	Package getPackage();

	/**
	 * Sets the value of the '{@link hu.sze.aut.ros.network.model.rosnetworkmodel.Package#getPackage <em>Package</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' container reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(Package value);

} // Package

/**
 */
package hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Parameter Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.NodeParameterGroup#getNodeparameter <em>Nodeparameter</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.NodeParameterGroup#getConfig_obj <em>Config obj</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.NodeParameterGroup#isGenerate_struct <em>Generate struct</em>}</li>
 * </ul>
 *
 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage#getNodeParameterGroup()
 * @model
 * @generated
 */
public interface NodeParameterGroup extends AbstractNodeParameter {
	/**
	 * Returns the value of the '<em><b>Nodeparameter</b></em>' containment reference list.
	 * The list contents are of type {@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.NodeParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodeparameter</em>' containment reference list.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage#getNodeParameterGroup_Nodeparameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<NodeParameter> getNodeparameter();

	/**
	 * Returns the value of the '<em><b>Config obj</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config obj</em>' attribute.
	 * @see #setConfig_obj(String)
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage#getNodeParameterGroup_Config_obj()
	 * @model
	 * @generated
	 */
	String getConfig_obj();

	/**
	 * Sets the value of the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.NodeParameterGroup#getConfig_obj <em>Config obj</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config obj</em>' attribute.
	 * @see #getConfig_obj()
	 * @generated
	 */
	void setConfig_obj(String value);

	/**
	 * Returns the value of the '<em><b>Generate struct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate struct</em>' attribute.
	 * @see #setGenerate_struct(boolean)
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage#getNodeParameterGroup_Generate_struct()
	 * @model
	 * @generated
	 */
	boolean isGenerate_struct();

	/**
	 * Sets the value of the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.NodeParameterGroup#isGenerate_struct <em>Generate struct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate struct</em>' attribute.
	 * @see #isGenerate_struct()
	 * @generated
	 */
	void setGenerate_struct(boolean value);

} // NodeParameterGroup

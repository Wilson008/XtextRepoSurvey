/**
 */
package hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.NodeParameter#getTargetvar <em>Targetvar</em>}</li>
 * </ul>
 *
 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage#getNodeParameter()
 * @model
 * @generated
 */
public interface NodeParameter extends AbstractNodeParameter {
	/**
	 * Returns the value of the '<em><b>Targetvar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targetvar</em>' attribute.
	 * @see #setTargetvar(String)
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage#getNodeParameter_Targetvar()
	 * @model
	 * @generated
	 */
	String getTargetvar();

	/**
	 * Sets the value of the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.NodeParameter#getTargetvar <em>Targetvar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Targetvar</em>' attribute.
	 * @see #getTargetvar()
	 * @generated
	 */
	void setTargetvar(String value);

} // NodeParameter

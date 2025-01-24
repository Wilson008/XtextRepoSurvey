/**
 */
package hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StringParameter#getDefaultval <em>Defaultval</em>}</li>
 * </ul>
 *
 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage#getStringParameter()
 * @model
 * @generated
 */
public interface StringParameter extends NodeParameter {
	/**
	 * Returns the value of the '<em><b>Defaultval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defaultval</em>' attribute.
	 * @see #setDefaultval(String)
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage#getStringParameter_Defaultval()
	 * @model
	 * @generated
	 */
	String getDefaultval();

	/**
	 * Sets the value of the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StringParameter#getDefaultval <em>Defaultval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defaultval</em>' attribute.
	 * @see #getDefaultval()
	 * @generated
	 */
	void setDefaultval(String value);

} // StringParameter

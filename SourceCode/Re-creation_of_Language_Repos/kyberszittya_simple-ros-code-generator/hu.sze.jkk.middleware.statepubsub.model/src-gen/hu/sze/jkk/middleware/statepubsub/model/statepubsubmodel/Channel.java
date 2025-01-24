/**
 */
package hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Channel#getName <em>Name</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Channel#getPortFrom <em>Port From</em>}</li>
 * </ul>
 *
 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage#getChannel()
 * @model abstract="true"
 * @generated
 */
public interface Channel extends DescriptiveElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage#getChannel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Channel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Port From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.OutputPort#getChannel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port From</em>' reference.
	 * @see #setPortFrom(OutputPort)
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage#getChannel_PortFrom()
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.OutputPort#getChannel
	 * @model opposite="channel"
	 * @generated
	 */
	OutputPort getPortFrom();

	/**
	 * Sets the value of the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Channel#getPortFrom <em>Port From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port From</em>' reference.
	 * @see #getPortFrom()
	 * @generated
	 */
	void setPortFrom(OutputPort value);

} // Channel

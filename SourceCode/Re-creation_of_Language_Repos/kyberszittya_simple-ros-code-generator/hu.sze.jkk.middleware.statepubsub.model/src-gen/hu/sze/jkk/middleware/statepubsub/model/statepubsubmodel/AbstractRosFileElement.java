/**
 */
package hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Ros File Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.AbstractRosFileElement#getFilepackage <em>Filepackage</em>}</li>
 * </ul>
 *
 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage#getAbstractRosFileElement()
 * @model abstract="true"
 * @generated
 */
public interface AbstractRosFileElement extends RosElement {
	/**
	 * Returns the value of the '<em><b>Filepackage</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.FilePackage#getAbstractroselement <em>Abstractroselement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filepackage</em>' container reference.
	 * @see #setFilepackage(FilePackage)
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage#getAbstractRosFileElement_Filepackage()
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.FilePackage#getAbstractroselement
	 * @model opposite="abstractroselement" transient="false"
	 * @generated
	 */
	FilePackage getFilepackage();

	/**
	 * Sets the value of the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.AbstractRosFileElement#getFilepackage <em>Filepackage</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filepackage</em>' container reference.
	 * @see #getFilepackage()
	 * @generated
	 */
	void setFilepackage(FilePackage value);

} // AbstractRosFileElement

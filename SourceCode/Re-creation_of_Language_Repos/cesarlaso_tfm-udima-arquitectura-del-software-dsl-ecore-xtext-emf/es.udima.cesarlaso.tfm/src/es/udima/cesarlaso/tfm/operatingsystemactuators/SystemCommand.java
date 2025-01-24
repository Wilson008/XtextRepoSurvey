/**
 */
package es.udima.cesarlaso.tfm.operatingsystemactuators;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.operatingsystemactuators.SystemCommand#getFilePath <em>File Path</em>}</li>
 * </ul>
 *
 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.OperatingsystemactuatorsPackage#getSystemCommand()
 * @model
 * @generated
 */
public interface SystemCommand extends OperatingSystemActuator {
	/**
	 * Returns the value of the '<em><b>File Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Path</em>' reference.
	 * @see #setFilePath(FilePath)
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.OperatingsystemactuatorsPackage#getSystemCommand_FilePath()
	 * @model required="true"
	 * @generated
	 */
	FilePath getFilePath();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.SystemCommand#getFilePath <em>File Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Path</em>' reference.
	 * @see #getFilePath()
	 * @generated
	 */
	void setFilePath(FilePath value);

} // SystemCommand

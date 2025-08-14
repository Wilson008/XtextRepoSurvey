/**
 */
package es.udima.cesarlaso.tfm.operatingsystemactuators;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Play Sound</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.operatingsystemactuators.PlaySound#getVolume <em>Volume</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.operatingsystemactuators.PlaySound#getFilePath <em>File Path</em>}</li>
 * </ul>
 *
 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.OperatingsystemactuatorsPackage#getPlaySound()
 * @model
 * @generated
 */
public interface PlaySound extends OperatingSystemActuator {
	/**
	 * Returns the value of the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume</em>' attribute.
	 * @see #setVolume(int)
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.OperatingsystemactuatorsPackage#getPlaySound_Volume()
	 * @model
	 * @generated
	 */
	int getVolume();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.PlaySound#getVolume <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume</em>' attribute.
	 * @see #getVolume()
	 * @generated
	 */
	void setVolume(int value);

	/**
	 * Returns the value of the '<em><b>File Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Path</em>' reference.
	 * @see #setFilePath(FilePath)
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.OperatingsystemactuatorsPackage#getPlaySound_FilePath()
	 * @model required="true"
	 * @generated
	 */
	FilePath getFilePath();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.PlaySound#getFilePath <em>File Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Path</em>' reference.
	 * @see #getFilePath()
	 * @generated
	 */
	void setFilePath(FilePath value);

} // PlaySound

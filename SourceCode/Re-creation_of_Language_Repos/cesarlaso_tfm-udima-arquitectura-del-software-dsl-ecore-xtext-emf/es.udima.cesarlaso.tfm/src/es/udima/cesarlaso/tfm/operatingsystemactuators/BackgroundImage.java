/**
 */
package es.udima.cesarlaso.tfm.operatingsystemactuators;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Background Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.operatingsystemactuators.BackgroundImage#getFilePath <em>File Path</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.operatingsystemactuators.BackgroundImage#getResizeType <em>Resize Type</em>}</li>
 * </ul>
 *
 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.OperatingsystemactuatorsPackage#getBackgroundImage()
 * @model
 * @generated
 */
public interface BackgroundImage extends OperatingSystemActuator {
	/**
	 * Returns the value of the '<em><b>File Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Path</em>' reference.
	 * @see #setFilePath(FilePath)
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.OperatingsystemactuatorsPackage#getBackgroundImage_FilePath()
	 * @model required="true"
	 * @generated
	 */
	FilePath getFilePath();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.BackgroundImage#getFilePath <em>File Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Path</em>' reference.
	 * @see #getFilePath()
	 * @generated
	 */
	void setFilePath(FilePath value);

	/**
	 * Returns the value of the '<em><b>Resize Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.udima.cesarlaso.tfm.operatingsystemactuators.ResizeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resize Type</em>' attribute.
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.ResizeType
	 * @see #setResizeType(ResizeType)
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.OperatingsystemactuatorsPackage#getBackgroundImage_ResizeType()
	 * @model required="true"
	 * @generated
	 */
	ResizeType getResizeType();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.BackgroundImage#getResizeType <em>Resize Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resize Type</em>' attribute.
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.ResizeType
	 * @see #getResizeType()
	 * @generated
	 */
	void setResizeType(ResizeType value);

} // BackgroundImage

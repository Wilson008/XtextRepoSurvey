/**
 */
package es.udima.cesarlaso.tfm.operatingsystemactuators;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Screen</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.operatingsystemactuators.Screen#getFilePath <em>File Path</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.operatingsystemactuators.Screen#getPositionX <em>Position X</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.operatingsystemactuators.Screen#getPositionY <em>Position Y</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.operatingsystemactuators.Screen#getPositionZ <em>Position Z</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.operatingsystemactuators.Screen#getColor <em>Color</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.operatingsystemactuators.Screen#getResizeType <em>Resize Type</em>}</li>
 * </ul>
 *
 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.OperatingsystemactuatorsPackage#getScreen()
 * @model abstract="true"
 * @generated
 */
public interface Screen extends OperatingSystemActuator {
	/**
	 * Returns the value of the '<em><b>File Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Path</em>' reference.
	 * @see #setFilePath(FilePath)
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.OperatingsystemactuatorsPackage#getScreen_FilePath()
	 * @model required="true"
	 * @generated
	 */
	FilePath getFilePath();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.Screen#getFilePath <em>File Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Path</em>' reference.
	 * @see #getFilePath()
	 * @generated
	 */
	void setFilePath(FilePath value);

	/**
	 * Returns the value of the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position X</em>' attribute.
	 * @see #setPositionX(int)
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.OperatingsystemactuatorsPackage#getScreen_PositionX()
	 * @model required="true"
	 * @generated
	 */
	int getPositionX();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.Screen#getPositionX <em>Position X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position X</em>' attribute.
	 * @see #getPositionX()
	 * @generated
	 */
	void setPositionX(int value);

	/**
	 * Returns the value of the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position Y</em>' attribute.
	 * @see #setPositionY(int)
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.OperatingsystemactuatorsPackage#getScreen_PositionY()
	 * @model required="true"
	 * @generated
	 */
	int getPositionY();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.Screen#getPositionY <em>Position Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position Y</em>' attribute.
	 * @see #getPositionY()
	 * @generated
	 */
	void setPositionY(int value);

	/**
	 * Returns the value of the '<em><b>Position Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position Z</em>' attribute.
	 * @see #setPositionZ(int)
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.OperatingsystemactuatorsPackage#getScreen_PositionZ()
	 * @model required="true"
	 * @generated
	 */
	int getPositionZ();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.Screen#getPositionZ <em>Position Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position Z</em>' attribute.
	 * @see #getPositionZ()
	 * @generated
	 */
	void setPositionZ(int value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(long)
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.OperatingsystemactuatorsPackage#getScreen_Color()
	 * @model required="true"
	 * @generated
	 */
	long getColor();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.Screen#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(long value);

	/**
	 * Returns the value of the '<em><b>Resize Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.udima.cesarlaso.tfm.operatingsystemactuators.ResizeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resize Type</em>' attribute.
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.ResizeType
	 * @see #setResizeType(ResizeType)
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.OperatingsystemactuatorsPackage#getScreen_ResizeType()
	 * @model required="true"
	 * @generated
	 */
	ResizeType getResizeType();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.Screen#getResizeType <em>Resize Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resize Type</em>' attribute.
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.ResizeType
	 * @see #getResizeType()
	 * @generated
	 */
	void setResizeType(ResizeType value);

} // Screen

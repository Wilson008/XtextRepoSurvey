/**
 */
package es.udima.cesarlaso.tfm.operatingsystemactuators;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Download</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.operatingsystemactuators.Download#getUrl <em>Url</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.operatingsystemactuators.Download#getFilePath <em>File Path</em>}</li>
 * </ul>
 *
 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.OperatingsystemactuatorsPackage#getDownload()
 * @model
 * @generated
 */
public interface Download extends OperatingSystemActuator {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.OperatingsystemactuatorsPackage#getDownload_Url()
	 * @model required="true"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.Download#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>File Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Path</em>' reference.
	 * @see #setFilePath(FilePath)
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.OperatingsystemactuatorsPackage#getDownload_FilePath()
	 * @model required="true"
	 * @generated
	 */
	FilePath getFilePath();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.Download#getFilePath <em>File Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Path</em>' reference.
	 * @see #getFilePath()
	 * @generated
	 */
	void setFilePath(FilePath value);

} // Download

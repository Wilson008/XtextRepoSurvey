/**
 */
package nowheretravel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flight</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nowheretravel.Flight#getDestinationTown <em>Destination Town</em>}</li>
 *   <li>{@link nowheretravel.Flight#getDestinationCountry <em>Destination Country</em>}</li>
 * </ul>
 *
 * @see nowheretravel.NowheretravelPackage#getFlight()
 * @model
 * @generated
 */
public interface Flight extends Item {
	/**
	 * Returns the value of the '<em><b>Destination Town</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Town</em>' attribute.
	 * @see #setDestinationTown(String)
	 * @see nowheretravel.NowheretravelPackage#getFlight_DestinationTown()
	 * @model
	 * @generated
	 */
	String getDestinationTown();

	/**
	 * Sets the value of the '{@link nowheretravel.Flight#getDestinationTown <em>Destination Town</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Town</em>' attribute.
	 * @see #getDestinationTown()
	 * @generated
	 */
	void setDestinationTown(String value);

	/**
	 * Returns the value of the '<em><b>Destination Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Country</em>' attribute.
	 * @see #setDestinationCountry(String)
	 * @see nowheretravel.NowheretravelPackage#getFlight_DestinationCountry()
	 * @model
	 * @generated
	 */
	String getDestinationCountry();

	/**
	 * Sets the value of the '{@link nowheretravel.Flight#getDestinationCountry <em>Destination Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Country</em>' attribute.
	 * @see #getDestinationCountry()
	 * @generated
	 */
	void setDestinationCountry(String value);

} // Flight

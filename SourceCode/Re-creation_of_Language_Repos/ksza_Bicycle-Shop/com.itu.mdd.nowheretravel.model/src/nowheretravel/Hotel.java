/**
 */
package nowheretravel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hotel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nowheretravel.Hotel#getHotelName <em>Hotel Name</em>}</li>
 * </ul>
 *
 * @see nowheretravel.NowheretravelPackage#getHotel()
 * @model
 * @generated
 */
public interface Hotel extends Item {
	/**
	 * Returns the value of the '<em><b>Hotel Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hotel Name</em>' attribute.
	 * @see #setHotelName(String)
	 * @see nowheretravel.NowheretravelPackage#getHotel_HotelName()
	 * @model
	 * @generated
	 */
	String getHotelName();

	/**
	 * Sets the value of the '{@link nowheretravel.Hotel#getHotelName <em>Hotel Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hotel Name</em>' attribute.
	 * @see #getHotelName()
	 * @generated
	 */
	void setHotelName(String value);

} // Hotel

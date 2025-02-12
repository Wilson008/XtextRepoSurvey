/**
 * generated by Xtext 2.35.0
 */
package io.thlaegler.edifact.edilang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.ProductFunction#getBookingClass <em>Booking Class</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.ProductFunction#getAvail <em>Avail</em>}</li>
 * </ul>
 *
 * @see io.thlaegler.edifact.edilang.EdilangPackage#getProductFunction()
 * @model
 * @generated
 */
public interface ProductFunction extends AbstractEdiFunction
{
  /**
   * Returns the value of the '<em><b>Booking Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Booking Class</em>' attribute.
   * @see #setBookingClass(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getProductFunction_BookingClass()
   * @model
   * @generated
   */
  String getBookingClass();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.ProductFunction#getBookingClass <em>Booking Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Booking Class</em>' attribute.
   * @see #getBookingClass()
   * @generated
   */
  void setBookingClass(String value);

  /**
   * Returns the value of the '<em><b>Avail</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Avail</em>' attribute.
   * @see #setAvail(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getProductFunction_Avail()
   * @model
   * @generated
   */
  String getAvail();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.ProductFunction#getAvail <em>Avail</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Avail</em>' attribute.
   * @see #getAvail()
   * @generated
   */
  void setAvail(String value);

} // ProductFunction

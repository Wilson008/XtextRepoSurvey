/**
 */
package nowheretravel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Insurance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nowheretravel.Insurance#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see nowheretravel.NowheretravelPackage#getInsurance()
 * @model
 * @generated
 */
public interface Insurance extends Item {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link nowheretravel.InsuranceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see nowheretravel.InsuranceType
	 * @see #setType(InsuranceType)
	 * @see nowheretravel.NowheretravelPackage#getInsurance_Type()
	 * @model
	 * @generated
	 */
	InsuranceType getType();

	/**
	 * Sets the value of the '{@link nowheretravel.Insurance#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see nowheretravel.InsuranceType
	 * @see #getType()
	 * @generated
	 */
	void setType(InsuranceType value);

} // Insurance

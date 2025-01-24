/**
 */
package nowheretravel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Insurance Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see nowheretravel.NowheretravelPackage#getInsuranceType()
 * @model
 * @generated
 */
public enum InsuranceType implements Enumerator {
	/**
	 * The '<em><b>Car Insurance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAR_INSURANCE_VALUE
	 * @generated
	 * @ordered
	 */
	CAR_INSURANCE(0, "CarInsurance", "CarInsurance"),

	/**
	 * The '<em><b>Travel Insurance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAVEL_INSURANCE_VALUE
	 * @generated
	 * @ordered
	 */
	TRAVEL_INSURANCE(1, "TravelInsurance", "TravelInsurance");

	/**
	 * The '<em><b>Car Insurance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAR_INSURANCE
	 * @model name="CarInsurance"
	 * @generated
	 * @ordered
	 */
	public static final int CAR_INSURANCE_VALUE = 0;

	/**
	 * The '<em><b>Travel Insurance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAVEL_INSURANCE
	 * @model name="TravelInsurance"
	 * @generated
	 * @ordered
	 */
	public static final int TRAVEL_INSURANCE_VALUE = 1;

	/**
	 * An array of all the '<em><b>Insurance Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final InsuranceType[] VALUES_ARRAY =
		new InsuranceType[] {
			CAR_INSURANCE,
			TRAVEL_INSURANCE,
		};

	/**
	 * A public read-only list of all the '<em><b>Insurance Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<InsuranceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Insurance Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InsuranceType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InsuranceType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Insurance Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InsuranceType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InsuranceType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Insurance Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InsuranceType get(int value) {
		switch (value) {
			case CAR_INSURANCE_VALUE: return CAR_INSURANCE;
			case TRAVEL_INSURANCE_VALUE: return TRAVEL_INSURANCE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private InsuranceType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //InsuranceType

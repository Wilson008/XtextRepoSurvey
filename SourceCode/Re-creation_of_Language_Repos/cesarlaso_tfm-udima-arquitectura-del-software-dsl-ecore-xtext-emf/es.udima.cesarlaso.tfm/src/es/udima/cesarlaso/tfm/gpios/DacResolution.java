/**
 */
package es.udima.cesarlaso.tfm.gpios;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Dac Resolution</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.udima.cesarlaso.tfm.gpios.GpiosPackage#getDacResolution()
 * @model
 * @generated
 */
public enum DacResolution implements Enumerator {
	/**
	 * The '<em><b>Bits8</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BITS8_VALUE
	 * @generated
	 * @ordered
	 */
	BITS8(8, "Bits8", "Bits8"),

	/**
	 * The '<em><b>Bits12</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BITS12_VALUE
	 * @generated
	 * @ordered
	 */
	BITS12(12, "Bits12", "Bits12"),

	/**
	 * The '<em><b>Bits16</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BITS16_VALUE
	 * @generated
	 * @ordered
	 */
	BITS16(16, "Bits16", "Bits16"),

	/**
	 * The '<em><b>Bits24</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BITS24_VALUE
	 * @generated
	 * @ordered
	 */
	BITS24(24, "Bits24", "Bits24");

	/**
	 * The '<em><b>Bits8</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BITS8
	 * @model name="Bits8"
	 * @generated
	 * @ordered
	 */
	public static final int BITS8_VALUE = 8;

	/**
	 * The '<em><b>Bits12</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BITS12
	 * @model name="Bits12"
	 * @generated
	 * @ordered
	 */
	public static final int BITS12_VALUE = 12;

	/**
	 * The '<em><b>Bits16</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BITS16
	 * @model name="Bits16"
	 * @generated
	 * @ordered
	 */
	public static final int BITS16_VALUE = 16;

	/**
	 * The '<em><b>Bits24</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BITS24
	 * @model name="Bits24"
	 * @generated
	 * @ordered
	 */
	public static final int BITS24_VALUE = 24;

	/**
	 * An array of all the '<em><b>Dac Resolution</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DacResolution[] VALUES_ARRAY =
		new DacResolution[] {
			BITS8,
			BITS12,
			BITS16,
			BITS24,
		};

	/**
	 * A public read-only list of all the '<em><b>Dac Resolution</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DacResolution> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Dac Resolution</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DacResolution get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DacResolution result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Dac Resolution</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DacResolution getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DacResolution result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Dac Resolution</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DacResolution get(int value) {
		switch (value) {
			case BITS8_VALUE: return BITS8;
			case BITS12_VALUE: return BITS12;
			case BITS16_VALUE: return BITS16;
			case BITS24_VALUE: return BITS24;
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
	private DacResolution(int value, String name, String literal) {
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
	
} //DacResolution

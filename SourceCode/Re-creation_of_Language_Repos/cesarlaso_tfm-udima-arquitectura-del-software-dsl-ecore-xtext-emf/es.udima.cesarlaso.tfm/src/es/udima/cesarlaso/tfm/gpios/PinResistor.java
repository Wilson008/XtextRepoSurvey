/**
 */
package es.udima.cesarlaso.tfm.gpios;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Pin Resistor</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.udima.cesarlaso.tfm.gpios.GpiosPackage#getPinResistor()
 * @model
 * @generated
 */
public enum PinResistor implements Enumerator {
	/**
	 * The '<em><b>Pull Up</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PULL_UP_VALUE
	 * @generated
	 * @ordered
	 */
	PULL_UP(0, "PullUp", "PullUp"),

	/**
	 * The '<em><b>Pull Down</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PULL_DOWN_VALUE
	 * @generated
	 * @ordered
	 */
	PULL_DOWN(1, "PullDown", "PullDown");

	/**
	 * The '<em><b>Pull Up</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PULL_UP
	 * @model name="PullUp"
	 * @generated
	 * @ordered
	 */
	public static final int PULL_UP_VALUE = 0;

	/**
	 * The '<em><b>Pull Down</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PULL_DOWN
	 * @model name="PullDown"
	 * @generated
	 * @ordered
	 */
	public static final int PULL_DOWN_VALUE = 1;

	/**
	 * An array of all the '<em><b>Pin Resistor</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PinResistor[] VALUES_ARRAY =
		new PinResistor[] {
			PULL_UP,
			PULL_DOWN,
		};

	/**
	 * A public read-only list of all the '<em><b>Pin Resistor</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PinResistor> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Pin Resistor</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PinResistor get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PinResistor result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pin Resistor</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PinResistor getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PinResistor result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pin Resistor</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PinResistor get(int value) {
		switch (value) {
			case PULL_UP_VALUE: return PULL_UP;
			case PULL_DOWN_VALUE: return PULL_DOWN;
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
	private PinResistor(int value, String name, String literal) {
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
	
} //PinResistor

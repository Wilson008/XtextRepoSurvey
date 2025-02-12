/**
 * generated by Xtext 2.35.0
 */
package uniandes.academia.generator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Enum Realtionship Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see uniandes.academia.generator.GeneratorPackage#getEnumRealtionshipType()
 * @model
 * @generated
 */
public enum EnumRealtionshipType implements Enumerator
{
  /**
   * The '<em><b>COMPOSITE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #COMPOSITE_VALUE
   * @generated
   * @ordered
   */
  COMPOSITE(0, "COMPOSITE", "Composite"),

  /**
   * The '<em><b>SHARED</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SHARED_VALUE
   * @generated
   * @ordered
   */
  SHARED(1, "SHARED", "Shared"),

  /**
   * The '<em><b>SIMPLE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SIMPLE_VALUE
   * @generated
   * @ordered
   */
  SIMPLE(2, "SIMPLE", "Simple");

  /**
   * The '<em><b>COMPOSITE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #COMPOSITE
   * @model literal="Composite"
   * @generated
   * @ordered
   */
  public static final int COMPOSITE_VALUE = 0;

  /**
   * The '<em><b>SHARED</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SHARED
   * @model literal="Shared"
   * @generated
   * @ordered
   */
  public static final int SHARED_VALUE = 1;

  /**
   * The '<em><b>SIMPLE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SIMPLE
   * @model literal="Simple"
   * @generated
   * @ordered
   */
  public static final int SIMPLE_VALUE = 2;

  /**
   * An array of all the '<em><b>Enum Realtionship Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final EnumRealtionshipType[] VALUES_ARRAY =
    new EnumRealtionshipType[]
    {
      COMPOSITE,
      SHARED,
      SIMPLE,
    };

  /**
   * A public read-only list of all the '<em><b>Enum Realtionship Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<EnumRealtionshipType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Enum Realtionship Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static EnumRealtionshipType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      EnumRealtionshipType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Enum Realtionship Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static EnumRealtionshipType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      EnumRealtionshipType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Enum Realtionship Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static EnumRealtionshipType get(int value)
  {
    switch (value)
    {
      case COMPOSITE_VALUE: return COMPOSITE;
      case SHARED_VALUE: return SHARED;
      case SIMPLE_VALUE: return SIMPLE;
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
  private EnumRealtionshipType(int value, String name, String literal)
  {
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
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //EnumRealtionshipType

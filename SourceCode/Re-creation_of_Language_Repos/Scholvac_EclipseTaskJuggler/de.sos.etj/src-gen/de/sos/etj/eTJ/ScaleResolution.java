/**
 * generated by Xtext 2.35.0
 */
package de.sos.etj.eTJ;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Scale Resolution</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.sos.etj.eTJ.ETJPackage#getScaleResolution()
 * @model
 * @generated
 */
public enum ScaleResolution implements Enumerator
{
  /**
   * The '<em><b>HOUR</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #HOUR_VALUE
   * @generated
   * @ordered
   */
  HOUR(0, "HOUR", "hour"),

  /**
   * The '<em><b>DAY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DAY_VALUE
   * @generated
   * @ordered
   */
  DAY(1, "DAY", "day"),

  /**
   * The '<em><b>WEEK</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #WEEK_VALUE
   * @generated
   * @ordered
   */
  WEEK(2, "WEEK", "week"),

  /**
   * The '<em><b>MONTH</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MONTH_VALUE
   * @generated
   * @ordered
   */
  MONTH(3, "MONTH", "month"),

  /**
   * The '<em><b>QUARTER</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #QUARTER_VALUE
   * @generated
   * @ordered
   */
  QUARTER(4, "QUARTER", "quarter"),

  /**
   * The '<em><b>YEAR</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #YEAR_VALUE
   * @generated
   * @ordered
   */
  YEAR(5, "YEAR", "year");

  /**
   * The '<em><b>HOUR</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #HOUR
   * @model literal="hour"
   * @generated
   * @ordered
   */
  public static final int HOUR_VALUE = 0;

  /**
   * The '<em><b>DAY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DAY
   * @model literal="day"
   * @generated
   * @ordered
   */
  public static final int DAY_VALUE = 1;

  /**
   * The '<em><b>WEEK</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #WEEK
   * @model literal="week"
   * @generated
   * @ordered
   */
  public static final int WEEK_VALUE = 2;

  /**
   * The '<em><b>MONTH</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MONTH
   * @model literal="month"
   * @generated
   * @ordered
   */
  public static final int MONTH_VALUE = 3;

  /**
   * The '<em><b>QUARTER</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #QUARTER
   * @model literal="quarter"
   * @generated
   * @ordered
   */
  public static final int QUARTER_VALUE = 4;

  /**
   * The '<em><b>YEAR</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #YEAR
   * @model literal="year"
   * @generated
   * @ordered
   */
  public static final int YEAR_VALUE = 5;

  /**
   * An array of all the '<em><b>Scale Resolution</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final ScaleResolution[] VALUES_ARRAY =
    new ScaleResolution[]
    {
      HOUR,
      DAY,
      WEEK,
      MONTH,
      QUARTER,
      YEAR,
    };

  /**
   * A public read-only list of all the '<em><b>Scale Resolution</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<ScaleResolution> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Scale Resolution</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ScaleResolution get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ScaleResolution result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Scale Resolution</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ScaleResolution getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ScaleResolution result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Scale Resolution</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ScaleResolution get(int value)
  {
    switch (value)
    {
      case HOUR_VALUE: return HOUR;
      case DAY_VALUE: return DAY;
      case WEEK_VALUE: return WEEK;
      case MONTH_VALUE: return MONTH;
      case QUARTER_VALUE: return QUARTER;
      case YEAR_VALUE: return YEAR;
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
  private ScaleResolution(int value, String name, String literal)
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
  
} //ScaleResolution

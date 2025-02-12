/**
 * generated by Xtext 2.35.0
 */
package de.sebastianbenz.xgherkin.gherkin;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Example</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sebastianbenz.xgherkin.gherkin.Example#getHeading <em>Heading</em>}</li>
 *   <li>{@link de.sebastianbenz.xgherkin.gherkin.Example#getRows <em>Rows</em>}</li>
 * </ul>
 *
 * @see de.sebastianbenz.xgherkin.gherkin.GherkinPackage#getExample()
 * @model
 * @generated
 */
public interface Example extends EObject
{
  /**
   * Returns the value of the '<em><b>Heading</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Heading</em>' containment reference.
   * @see #setHeading(ExampleRow)
   * @see de.sebastianbenz.xgherkin.gherkin.GherkinPackage#getExample_Heading()
   * @model containment="true"
   * @generated
   */
  ExampleRow getHeading();

  /**
   * Sets the value of the '{@link de.sebastianbenz.xgherkin.gherkin.Example#getHeading <em>Heading</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Heading</em>' containment reference.
   * @see #getHeading()
   * @generated
   */
  void setHeading(ExampleRow value);

  /**
   * Returns the value of the '<em><b>Rows</b></em>' containment reference list.
   * The list contents are of type {@link de.sebastianbenz.xgherkin.gherkin.ExampleRow}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rows</em>' containment reference list.
   * @see de.sebastianbenz.xgherkin.gherkin.GherkinPackage#getExample_Rows()
   * @model containment="true"
   * @generated
   */
  EList<ExampleRow> getRows();

} // Example

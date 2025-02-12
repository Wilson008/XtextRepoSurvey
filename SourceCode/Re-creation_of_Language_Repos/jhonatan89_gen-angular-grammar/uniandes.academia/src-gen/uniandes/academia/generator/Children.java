/**
 * generated by Xtext 2.35.0
 */
package uniandes.academia.generator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Children</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uniandes.academia.generator.Children#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see uniandes.academia.generator.GeneratorPackage#getChildren()
 * @model
 * @generated
 */
public interface Children extends AbstractElement
{
  /**
   * Returns the value of the '<em><b>Children</b></em>' containment reference list.
   * The list contents are of type {@link uniandes.academia.generator.Child}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Children</em>' containment reference list.
   * @see uniandes.academia.generator.GeneratorPackage#getChildren_Children()
   * @model containment="true"
   * @generated
   */
  EList<Child> getChildren();

} // Children

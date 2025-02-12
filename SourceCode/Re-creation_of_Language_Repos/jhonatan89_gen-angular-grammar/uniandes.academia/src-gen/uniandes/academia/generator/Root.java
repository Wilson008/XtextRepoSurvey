/**
 * generated by Xtext 2.35.0
 */
package uniandes.academia.generator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uniandes.academia.generator.Root#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see uniandes.academia.generator.GeneratorPackage#getRoot()
 * @model
 * @generated
 */
public interface Root extends EObject
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link uniandes.academia.generator.AbstractElement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see uniandes.academia.generator.GeneratorPackage#getRoot_Elements()
   * @model containment="true"
   * @generated
   */
  EList<AbstractElement> getElements();

} // Root

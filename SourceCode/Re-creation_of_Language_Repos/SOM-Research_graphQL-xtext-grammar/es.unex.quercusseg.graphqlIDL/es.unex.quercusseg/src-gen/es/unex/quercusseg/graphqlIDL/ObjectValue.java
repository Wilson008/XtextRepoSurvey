/**
 * generated by Xtext 2.35.0
 */
package es.unex.quercusseg.graphqlIDL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unex.quercusseg.graphqlIDL.ObjectValue#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see es.unex.quercusseg.graphqlIDL.GraphqlIDLPackage#getObjectValue()
 * @model
 * @generated
 */
public interface ObjectValue extends EObject
{
  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
   * The list contents are of type {@link es.unex.quercusseg.graphqlIDL.ObjectField}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference list.
   * @see es.unex.quercusseg.graphqlIDL.GraphqlIDLPackage#getObjectValue_Fields()
   * @model containment="true"
   * @generated
   */
  EList<ObjectField> getFields();

} // ObjectValue

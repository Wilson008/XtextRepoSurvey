/**
 * generated by Xtext 2.35.0
 */
package accessdsl.accessDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Adjustment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link accessdsl.accessDsl.StateAdjustment#getName <em>Name</em>}</li>
 *   <li>{@link accessdsl.accessDsl.StateAdjustment#getImports <em>Imports</em>}</li>
 *   <li>{@link accessdsl.accessDsl.StateAdjustment#getStateOperation <em>State Operation</em>}</li>
 * </ul>
 *
 * @see accessdsl.accessDsl.AccessDslPackage#getStateAdjustment()
 * @model
 * @generated
 */
public interface StateAdjustment extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see accessdsl.accessDsl.AccessDslPackage#getStateAdjustment_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link accessdsl.accessDsl.StateAdjustment#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link accessdsl.accessDsl.Import}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see accessdsl.accessDsl.AccessDslPackage#getStateAdjustment_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>State Operation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>State Operation</em>' containment reference.
   * @see #setStateOperation(StateOperation)
   * @see accessdsl.accessDsl.AccessDslPackage#getStateAdjustment_StateOperation()
   * @model containment="true"
   * @generated
   */
  StateOperation getStateOperation();

  /**
   * Sets the value of the '{@link accessdsl.accessDsl.StateAdjustment#getStateOperation <em>State Operation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>State Operation</em>' containment reference.
   * @see #getStateOperation()
   * @generated
   */
  void setStateOperation(StateOperation value);

} // StateAdjustment

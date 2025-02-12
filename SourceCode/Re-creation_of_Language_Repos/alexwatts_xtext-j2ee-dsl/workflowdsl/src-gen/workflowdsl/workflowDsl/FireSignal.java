/**
 * generated by Xtext 2.35.0
 */
package workflowdsl.workflowDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fire Signal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link workflowdsl.workflowDsl.FireSignal#getFireSignal <em>Fire Signal</em>}</li>
 *   <li>{@link workflowdsl.workflowDsl.FireSignal#getCase <em>Case</em>}</li>
 * </ul>
 *
 * @see workflowdsl.workflowDsl.WorkflowDslPackage#getFireSignal()
 * @model
 * @generated
 */
public interface FireSignal extends EObject
{
  /**
   * Returns the value of the '<em><b>Fire Signal</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fire Signal</em>' reference.
   * @see #setFireSignal(Signal)
   * @see workflowdsl.workflowDsl.WorkflowDslPackage#getFireSignal_FireSignal()
   * @model
   * @generated
   */
  Signal getFireSignal();

  /**
   * Sets the value of the '{@link workflowdsl.workflowDsl.FireSignal#getFireSignal <em>Fire Signal</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fire Signal</em>' reference.
   * @see #getFireSignal()
   * @generated
   */
  void setFireSignal(Signal value);

  /**
   * Returns the value of the '<em><b>Case</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Case</em>' reference.
   * @see #setCase(ConditionalConnector)
   * @see workflowdsl.workflowDsl.WorkflowDslPackage#getFireSignal_Case()
   * @model
   * @generated
   */
  ConditionalConnector getCase();

  /**
   * Sets the value of the '{@link workflowdsl.workflowDsl.FireSignal#getCase <em>Case</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Case</em>' reference.
   * @see #getCase()
   * @generated
   */
  void setCase(ConditionalConnector value);

} // FireSignal

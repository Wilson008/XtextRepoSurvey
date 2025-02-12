/**
 * generated by Xtext 2.35.0
 */
package de.sos.etj.eTJ;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Status Sheet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.TaskStatusSheet#getTask <em>Task</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.TaskStatusSheet#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getTaskStatusSheet()
 * @model
 * @generated
 */
public interface TaskStatusSheet extends StatusSheetAttribute, TaskStatusSheetAttribute
{
  /**
   * Returns the value of the '<em><b>Task</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Task</em>' reference.
   * @see #setTask(Task)
   * @see de.sos.etj.eTJ.ETJPackage#getTaskStatusSheet_Task()
   * @model
   * @generated
   */
  Task getTask();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.TaskStatusSheet#getTask <em>Task</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Task</em>' reference.
   * @see #getTask()
   * @generated
   */
  void setTask(Task value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link de.sos.etj.eTJ.TaskStatusSheetAttribute}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see de.sos.etj.eTJ.ETJPackage#getTaskStatusSheet_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<TaskStatusSheetAttribute> getAttributes();

} // TaskStatusSheet

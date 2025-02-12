/**
 * generated by Xtext 2.35.0
 */
package org.tvtower.db.database;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tvtower.db.database.Task#getId <em>Id</em>}</li>
 *   <li>{@link org.tvtower.db.database.Task#getComment <em>Comment</em>}</li>
 *   <li>{@link org.tvtower.db.database.Task#getCreator <em>Creator</em>}</li>
 *   <li>{@link org.tvtower.db.database.Task#getCreatedBy <em>Created By</em>}</li>
 *   <li>{@link org.tvtower.db.database.Task#getTitle <em>Title</em>}</li>
 *   <li>{@link org.tvtower.db.database.Task#getText <em>Text</em>}</li>
 *   <li>{@link org.tvtower.db.database.Task#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see org.tvtower.db.database.DatabasePackage#getTask()
 * @model
 * @generated
 */
public interface Task extends EObject
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see org.tvtower.db.database.DatabasePackage#getTask_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.tvtower.db.database.Task#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comment</em>' attribute.
   * @see #setComment(String)
   * @see org.tvtower.db.database.DatabasePackage#getTask_Comment()
   * @model
   * @generated
   */
  String getComment();

  /**
   * Sets the value of the '{@link org.tvtower.db.database.Task#getComment <em>Comment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comment</em>' attribute.
   * @see #getComment()
   * @generated
   */
  void setComment(String value);

  /**
   * Returns the value of the '<em><b>Creator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Creator</em>' attribute.
   * @see #setCreator(String)
   * @see org.tvtower.db.database.DatabasePackage#getTask_Creator()
   * @model
   * @generated
   */
  String getCreator();

  /**
   * Sets the value of the '{@link org.tvtower.db.database.Task#getCreator <em>Creator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Creator</em>' attribute.
   * @see #getCreator()
   * @generated
   */
  void setCreator(String value);

  /**
   * Returns the value of the '<em><b>Created By</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Created By</em>' attribute.
   * @see #setCreatedBy(String)
   * @see org.tvtower.db.database.DatabasePackage#getTask_CreatedBy()
   * @model
   * @generated
   */
  String getCreatedBy();

  /**
   * Sets the value of the '{@link org.tvtower.db.database.Task#getCreatedBy <em>Created By</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Created By</em>' attribute.
   * @see #getCreatedBy()
   * @generated
   */
  void setCreatedBy(String value);

  /**
   * Returns the value of the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title</em>' containment reference.
   * @see #setTitle(Title)
   * @see org.tvtower.db.database.DatabasePackage#getTask_Title()
   * @model containment="true"
   * @generated
   */
  Title getTitle();

  /**
   * Sets the value of the '{@link org.tvtower.db.database.Task#getTitle <em>Title</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' containment reference.
   * @see #getTitle()
   * @generated
   */
  void setTitle(Title value);

  /**
   * Returns the value of the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' containment reference.
   * @see #setText(Text)
   * @see org.tvtower.db.database.DatabasePackage#getTask_Text()
   * @model containment="true"
   * @generated
   */
  Text getText();

  /**
   * Sets the value of the '{@link org.tvtower.db.database.Task#getText <em>Text</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' containment reference.
   * @see #getText()
   * @generated
   */
  void setText(Text value);

  /**
   * Returns the value of the '<em><b>Data</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data</em>' containment reference.
   * @see #setData(TaskData)
   * @see org.tvtower.db.database.DatabasePackage#getTask_Data()
   * @model containment="true"
   * @generated
   */
  TaskData getData();

  /**
   * Sets the value of the '{@link org.tvtower.db.database.Task#getData <em>Data</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data</em>' containment reference.
   * @see #getData()
   * @generated
   */
  void setData(TaskData value);

} // Task

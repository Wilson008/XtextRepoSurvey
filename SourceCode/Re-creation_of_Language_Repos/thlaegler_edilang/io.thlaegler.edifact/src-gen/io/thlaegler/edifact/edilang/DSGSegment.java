/**
 * generated by Xtext 2.35.0
 */
package io.thlaegler.edifact.edilang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DSG Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.DSGSegment#getTodo <em>Todo</em>}</li>
 * </ul>
 *
 * @see io.thlaegler.edifact.edilang.EdilangPackage#getDSGSegment()
 * @model
 * @generated
 */
public interface DSGSegment extends AbstractEdiSegment
{
  /**
   * Returns the value of the '<em><b>Todo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Todo</em>' attribute.
   * @see #setTodo(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getDSGSegment_Todo()
   * @model
   * @generated
   */
  String getTodo();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.DSGSegment#getTodo <em>Todo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Todo</em>' attribute.
   * @see #getTodo()
   * @generated
   */
  void setTodo(String value);

} // DSGSegment

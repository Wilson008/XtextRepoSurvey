/**
 * generated by Xtext 2.35.0
 */
package io.thlaegler.edifact.edilang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AJT Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.AJTSegment#getAdjustmentReasonDescriptionCode <em>Adjustment Reason Description Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.AJTSegment#getLineItemIdentifier <em>Line Item Identifier</em>}</li>
 * </ul>
 *
 * @see io.thlaegler.edifact.edilang.EdilangPackage#getAJTSegment()
 * @model
 * @generated
 */
public interface AJTSegment extends AbstractEdiSegment
{
  /**
   * Returns the value of the '<em><b>Adjustment Reason Description Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Adjustment Reason Description Code</em>' attribute.
   * @see #setAdjustmentReasonDescriptionCode(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getAJTSegment_AdjustmentReasonDescriptionCode()
   * @model
   * @generated
   */
  String getAdjustmentReasonDescriptionCode();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.AJTSegment#getAdjustmentReasonDescriptionCode <em>Adjustment Reason Description Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Adjustment Reason Description Code</em>' attribute.
   * @see #getAdjustmentReasonDescriptionCode()
   * @generated
   */
  void setAdjustmentReasonDescriptionCode(String value);

  /**
   * Returns the value of the '<em><b>Line Item Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Line Item Identifier</em>' attribute.
   * @see #setLineItemIdentifier(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getAJTSegment_LineItemIdentifier()
   * @model
   * @generated
   */
  String getLineItemIdentifier();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.AJTSegment#getLineItemIdentifier <em>Line Item Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Line Item Identifier</em>' attribute.
   * @see #getLineItemIdentifier()
   * @generated
   */
  void setLineItemIdentifier(String value);

} // AJTSegment

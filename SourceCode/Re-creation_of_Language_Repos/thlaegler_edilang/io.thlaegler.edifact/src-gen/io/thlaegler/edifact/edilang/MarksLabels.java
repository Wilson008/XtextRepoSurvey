/**
 * generated by Xtext 2.35.0
 */
package io.thlaegler.edifact.edilang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Marks Labels</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.MarksLabels#getShippingMarksDescriptions <em>Shipping Marks Descriptions</em>}</li>
 * </ul>
 *
 * @see io.thlaegler.edifact.edilang.EdilangPackage#getMarksLabels()
 * @model
 * @generated
 */
public interface MarksLabels extends AbstractEdiFunction
{
  /**
   * Returns the value of the '<em><b>Shipping Marks Descriptions</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Shipping Marks Descriptions</em>' attribute list.
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getMarksLabels_ShippingMarksDescriptions()
   * @model unique="false"
   * @generated
   */
  EList<String> getShippingMarksDescriptions();

} // MarksLabels

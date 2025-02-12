/**
 * generated by Xtext 2.35.0
 */
package de.sos.etj.eTJ;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cell Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.CellText#getExpresssion <em>Expresssion</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.CellText#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getCellText()
 * @model
 * @generated
 */
public interface CellText extends ColumnAttribute
{
  /**
   * Returns the value of the '<em><b>Expresssion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expresssion</em>' containment reference.
   * @see #setExpresssion(LogicalExpression)
   * @see de.sos.etj.eTJ.ETJPackage#getCellText_Expresssion()
   * @model containment="true"
   * @generated
   */
  LogicalExpression getExpresssion();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.CellText#getExpresssion <em>Expresssion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expresssion</em>' containment reference.
   * @see #getExpresssion()
   * @generated
   */
  void setExpresssion(LogicalExpression value);

  /**
   * Returns the value of the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' attribute.
   * @see #setText(String)
   * @see de.sos.etj.eTJ.ETJPackage#getCellText_Text()
   * @model
   * @generated
   */
  String getText();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.CellText#getText <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' attribute.
   * @see #getText()
   * @generated
   */
  void setText(String value);

} // CellText

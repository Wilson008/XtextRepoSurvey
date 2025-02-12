/**
 * generated by Xtext 2.35.0
 */
package org.arz.miniScript;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.arz.miniScript.BlockExpression#getExpressions <em>Expressions</em>}</li>
 * </ul>
 *
 * @see org.arz.miniScript.MiniScriptPackage#getBlockExpression()
 * @model
 * @generated
 */
public interface BlockExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
   * The list contents are of type {@link org.arz.miniScript.Expression}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressions</em>' containment reference list.
   * @see org.arz.miniScript.MiniScriptPackage#getBlockExpression_Expressions()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getExpressions();

} // BlockExpression

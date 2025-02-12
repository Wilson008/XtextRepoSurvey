/**
 * generated by Xtext 2.35.0
 */
package jpaqldsl.jPAQLDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jpaqldsl.jPAQLDsl.SelectClause#getSelectExpressions <em>Select Expressions</em>}</li>
 * </ul>
 *
 * @see jpaqldsl.jPAQLDsl.JPAQLDslPackage#getSelectClause()
 * @model
 * @generated
 */
public interface SelectClause extends EObject
{
  /**
   * Returns the value of the '<em><b>Select Expressions</b></em>' containment reference list.
   * The list contents are of type {@link jpaqldsl.jPAQLDsl.SelectExpression}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Select Expressions</em>' containment reference list.
   * @see jpaqldsl.jPAQLDsl.JPAQLDslPackage#getSelectClause_SelectExpressions()
   * @model containment="true"
   * @generated
   */
  EList<SelectExpression> getSelectExpressions();

} // SelectClause

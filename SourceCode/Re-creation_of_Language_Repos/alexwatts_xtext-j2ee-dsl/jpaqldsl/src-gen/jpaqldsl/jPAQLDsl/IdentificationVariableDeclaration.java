/**
 * generated by Xtext 2.35.0
 */
package jpaqldsl.jPAQLDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identification Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jpaqldsl.jPAQLDsl.IdentificationVariableDeclaration#getRangeVariableDeclaration <em>Range Variable Declaration</em>}</li>
 *   <li>{@link jpaqldsl.jPAQLDsl.IdentificationVariableDeclaration#getJoins <em>Joins</em>}</li>
 * </ul>
 *
 * @see jpaqldsl.jPAQLDsl.JPAQLDslPackage#getIdentificationVariableDeclaration()
 * @model
 * @generated
 */
public interface IdentificationVariableDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Range Variable Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Range Variable Declaration</em>' containment reference.
   * @see #setRangeVariableDeclaration(RangeVariableDeclaration)
   * @see jpaqldsl.jPAQLDsl.JPAQLDslPackage#getIdentificationVariableDeclaration_RangeVariableDeclaration()
   * @model containment="true"
   * @generated
   */
  RangeVariableDeclaration getRangeVariableDeclaration();

  /**
   * Sets the value of the '{@link jpaqldsl.jPAQLDsl.IdentificationVariableDeclaration#getRangeVariableDeclaration <em>Range Variable Declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Range Variable Declaration</em>' containment reference.
   * @see #getRangeVariableDeclaration()
   * @generated
   */
  void setRangeVariableDeclaration(RangeVariableDeclaration value);

  /**
   * Returns the value of the '<em><b>Joins</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Joins</em>' containment reference list.
   * @see jpaqldsl.jPAQLDsl.JPAQLDslPackage#getIdentificationVariableDeclaration_Joins()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getJoins();

} // IdentificationVariableDeclaration

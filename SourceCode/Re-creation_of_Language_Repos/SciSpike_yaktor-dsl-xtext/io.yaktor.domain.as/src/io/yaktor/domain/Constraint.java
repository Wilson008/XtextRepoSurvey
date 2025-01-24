/**
 */
package io.yaktor.domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.yaktor.domain.Constraint#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see io.yaktor.domain.DomainPackage#getConstraint()
 * @model
 * @generated
 */
public interface Constraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Fields</b></em>' reference list.
	 * The list contents are of type {@link io.yaktor.domain.ConstraintTypeField}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' reference list.
	 * @see io.yaktor.domain.DomainPackage#getConstraint_Fields()
	 * @model required="true"
	 * @generated
	 */
	EList<ConstraintTypeField> getFields();

} // Constraint

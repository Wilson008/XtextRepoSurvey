/**
 */
package io.yaktor.domain;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.yaktor.domain.EnumType#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see io.yaktor.domain.DomainPackage#getEnumType()
 * @model
 * @generated
 */
public interface EnumType extends NamedType {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link io.yaktor.domain.EnumValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see io.yaktor.domain.DomainPackage#getEnumType_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnumValue> getValues();

} // EnumType

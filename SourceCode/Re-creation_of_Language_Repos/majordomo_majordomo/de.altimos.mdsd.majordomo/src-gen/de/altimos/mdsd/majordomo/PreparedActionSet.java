/**
 */
package de.altimos.mdsd.majordomo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prepared Action Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.altimos.mdsd.majordomo.PreparedActionSet#getCtx <em>Ctx</em>}</li>
 *   <li>{@link de.altimos.mdsd.majordomo.PreparedActionSet#getName <em>Name</em>}</li>
 *   <li>{@link de.altimos.mdsd.majordomo.PreparedActionSet#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see de.altimos.mdsd.majordomo.MajordomoPackage#getPreparedActionSet()
 * @model
 * @generated
 */
public interface PreparedActionSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Ctx</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.altimos.mdsd.majordomo.Program#getPreparedActionSets <em>Prepared Action Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ctx</em>' container reference.
	 * @see #setCtx(Program)
	 * @see de.altimos.mdsd.majordomo.MajordomoPackage#getPreparedActionSet_Ctx()
	 * @see de.altimos.mdsd.majordomo.Program#getPreparedActionSets
	 * @model opposite="preparedActionSets" required="true" transient="false"
	 * @generated
	 */
	Program getCtx();

	/**
	 * Sets the value of the '{@link de.altimos.mdsd.majordomo.PreparedActionSet#getCtx <em>Ctx</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ctx</em>' container reference.
	 * @see #getCtx()
	 * @generated
	 */
	void setCtx(Program value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.altimos.mdsd.majordomo.MajordomoPackage#getPreparedActionSet_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.altimos.mdsd.majordomo.PreparedActionSet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link de.altimos.mdsd.majordomo.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see de.altimos.mdsd.majordomo.MajordomoPackage#getPreparedActionSet_Actions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Action> getActions();

} // PreparedActionSet

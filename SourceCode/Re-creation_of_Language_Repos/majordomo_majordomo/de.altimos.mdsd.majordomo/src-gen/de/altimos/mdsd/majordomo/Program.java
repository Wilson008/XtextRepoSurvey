/**
 */
package de.altimos.mdsd.majordomo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.altimos.mdsd.majordomo.Program#getConstants <em>Constants</em>}</li>
 *   <li>{@link de.altimos.mdsd.majordomo.Program#getPreparedStatements <em>Prepared Statements</em>}</li>
 *   <li>{@link de.altimos.mdsd.majordomo.Program#getPreparedActionSets <em>Prepared Action Sets</em>}</li>
 *   <li>{@link de.altimos.mdsd.majordomo.Program#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @see de.altimos.mdsd.majordomo.MajordomoPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject {
	/**
	 * Returns the value of the '<em><b>Constants</b></em>' containment reference list.
	 * The list contents are of type {@link de.altimos.mdsd.majordomo.PreparedValue}.
	 * It is bidirectional and its opposite is '{@link de.altimos.mdsd.majordomo.PreparedValue#getCtx <em>Ctx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constants</em>' containment reference list.
	 * @see de.altimos.mdsd.majordomo.MajordomoPackage#getProgram_Constants()
	 * @see de.altimos.mdsd.majordomo.PreparedValue#getCtx
	 * @model opposite="ctx" containment="true"
	 * @generated
	 */
	EList<PreparedValue> getConstants();

	/**
	 * Returns the value of the '<em><b>Prepared Statements</b></em>' containment reference list.
	 * The list contents are of type {@link de.altimos.mdsd.majordomo.PreparedStatement}.
	 * It is bidirectional and its opposite is '{@link de.altimos.mdsd.majordomo.PreparedStatement#getCtx <em>Ctx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prepared Statements</em>' containment reference list.
	 * @see de.altimos.mdsd.majordomo.MajordomoPackage#getProgram_PreparedStatements()
	 * @see de.altimos.mdsd.majordomo.PreparedStatement#getCtx
	 * @model opposite="ctx" containment="true"
	 * @generated
	 */
	EList<PreparedStatement> getPreparedStatements();

	/**
	 * Returns the value of the '<em><b>Prepared Action Sets</b></em>' containment reference list.
	 * The list contents are of type {@link de.altimos.mdsd.majordomo.PreparedActionSet}.
	 * It is bidirectional and its opposite is '{@link de.altimos.mdsd.majordomo.PreparedActionSet#getCtx <em>Ctx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prepared Action Sets</em>' containment reference list.
	 * @see de.altimos.mdsd.majordomo.MajordomoPackage#getProgram_PreparedActionSets()
	 * @see de.altimos.mdsd.majordomo.PreparedActionSet#getCtx
	 * @model opposite="ctx" containment="true"
	 * @generated
	 */
	EList<PreparedActionSet> getPreparedActionSets();

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link de.altimos.mdsd.majordomo.Rule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see de.altimos.mdsd.majordomo.MajordomoPackage#getProgram_Rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rule> getRules();

} // Program

/**
 */
package de.altimos.mdsd.majordomo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prepared Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.altimos.mdsd.majordomo.PreparedStatement#getName <em>Name</em>}</li>
 *   <li>{@link de.altimos.mdsd.majordomo.PreparedStatement#getCtx <em>Ctx</em>}</li>
 *   <li>{@link de.altimos.mdsd.majordomo.PreparedStatement#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @see de.altimos.mdsd.majordomo.MajordomoPackage#getPreparedStatement()
 * @model
 * @generated
 */
public interface PreparedStatement extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.altimos.mdsd.majordomo.MajordomoPackage#getPreparedStatement_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.altimos.mdsd.majordomo.PreparedStatement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Ctx</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.altimos.mdsd.majordomo.Program#getPreparedStatements <em>Prepared Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ctx</em>' container reference.
	 * @see #setCtx(Program)
	 * @see de.altimos.mdsd.majordomo.MajordomoPackage#getPreparedStatement_Ctx()
	 * @see de.altimos.mdsd.majordomo.Program#getPreparedStatements
	 * @model opposite="preparedStatements" required="true" transient="false"
	 * @generated
	 */
	Program getCtx();

	/**
	 * Sets the value of the '{@link de.altimos.mdsd.majordomo.PreparedStatement#getCtx <em>Ctx</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ctx</em>' container reference.
	 * @see #getCtx()
	 * @generated
	 */
	void setCtx(Program value);

	/**
	 * Returns the value of the '<em><b>Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement</em>' containment reference.
	 * @see #setStatement(Statement)
	 * @see de.altimos.mdsd.majordomo.MajordomoPackage#getPreparedStatement_Statement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Statement getStatement();

	/**
	 * Sets the value of the '{@link de.altimos.mdsd.majordomo.PreparedStatement#getStatement <em>Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement</em>' containment reference.
	 * @see #getStatement()
	 * @generated
	 */
	void setStatement(Statement value);

} // PreparedStatement

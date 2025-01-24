/**
 */
package megal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link megal.MegalFile#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link megal.MegalFile#getBindings <em>Bindings</em>}</li>
 *   <li>{@link megal.MegalFile#getName <em>Name</em>}</li>
 *   <li>{@link megal.MegalFile#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @see megal.MegalPackage#getMegalFile()
 * @model
 * @generated
 */
public interface MegalFile extends MegalElement {
	/**
	 * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link megal.MegalDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarations</em>' containment reference list.
	 * @see megal.MegalPackage#getMegalFile_Declarations()
	 * @model containment="true"
	 * @generated
	 */
	EList<MegalDeclaration> getDeclarations();

	/**
	 * Returns the value of the '<em><b>Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link megal.MegalLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindings</em>' containment reference list.
	 * @see megal.MegalPackage#getMegalFile_Bindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<MegalLink> getBindings();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see megal.MegalPackage#getMegalFile_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link megal.MegalFile#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' reference list.
	 * The list contents are of type {@link megal.MegalFile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' reference list.
	 * @see megal.MegalPackage#getMegalFile_Imports()
	 * @model
	 * @generated
	 */
	EList<MegalFile> getImports();

} // MegalFile

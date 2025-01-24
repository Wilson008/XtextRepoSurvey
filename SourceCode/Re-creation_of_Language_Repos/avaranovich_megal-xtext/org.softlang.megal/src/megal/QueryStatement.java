/**
 */
package megal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link megal.QueryStatement#getSubject <em>Subject</em>}</li>
 *   <li>{@link megal.QueryStatement#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link megal.QueryStatement#getObject <em>Object</em>}</li>
 * </ul>
 *
 * @see megal.MegalPackage#getQueryStatement()
 * @model
 * @generated
 */
public interface QueryStatement extends EObject {
	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(QueryEntry)
	 * @see megal.MegalPackage#getQueryStatement_Subject()
	 * @model containment="true" required="true"
	 * @generated
	 */
	QueryEntry getSubject();

	/**
	 * Sets the value of the '{@link megal.QueryStatement#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(QueryEntry value);

	/**
	 * Returns the value of the '<em><b>Predicate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicate</em>' reference.
	 * @see #setPredicate(MegalRelationshipType)
	 * @see megal.MegalPackage#getQueryStatement_Predicate()
	 * @model required="true"
	 * @generated
	 */
	MegalRelationshipType getPredicate();

	/**
	 * Sets the value of the '{@link megal.QueryStatement#getPredicate <em>Predicate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predicate</em>' reference.
	 * @see #getPredicate()
	 * @generated
	 */
	void setPredicate(MegalRelationshipType value);

	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' containment reference.
	 * @see #setObject(QueryEntry)
	 * @see megal.MegalPackage#getQueryStatement_Object()
	 * @model containment="true" required="true"
	 * @generated
	 */
	QueryEntry getObject();

	/**
	 * Sets the value of the '{@link megal.QueryStatement#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' containment reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(QueryEntry value);

} // QueryStatement

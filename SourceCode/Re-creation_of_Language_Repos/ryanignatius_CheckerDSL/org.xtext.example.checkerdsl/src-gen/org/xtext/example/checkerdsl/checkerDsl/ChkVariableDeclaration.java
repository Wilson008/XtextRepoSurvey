/**
 * generated by Xtext 2.35.0
 */
package org.xtext.example.checkerdsl.checkerDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chk Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.ChkVariableDeclaration#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.ChkVariableDeclaration#getSz <em>Sz</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.ChkVariableDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.ChkVariableDeclaration#getLimit1 <em>Limit1</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.ChkVariableDeclaration#getLimit <em>Limit</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.ChkVariableDeclaration#getSpValue <em>Sp Value</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getChkVariableDeclaration()
 * @model
 * @generated
 */
public interface ChkVariableDeclaration extends Feature
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getChkVariableDeclaration_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.ChkVariableDeclaration#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Sz</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sz</em>' attribute list.
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getChkVariableDeclaration_Sz()
   * @model unique="false"
   * @generated
   */
  EList<String> getSz();

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getChkVariableDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.ChkVariableDeclaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Limit1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Limit1</em>' containment reference.
   * @see #setLimit1(Limit)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getChkVariableDeclaration_Limit1()
   * @model containment="true"
   * @generated
   */
  Limit getLimit1();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.ChkVariableDeclaration#getLimit1 <em>Limit1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Limit1</em>' containment reference.
   * @see #getLimit1()
   * @generated
   */
  void setLimit1(Limit value);

  /**
   * Returns the value of the '<em><b>Limit</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.checkerdsl.checkerDsl.Limit}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Limit</em>' containment reference list.
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getChkVariableDeclaration_Limit()
   * @model containment="true"
   * @generated
   */
  EList<Limit> getLimit();

  /**
   * Returns the value of the '<em><b>Sp Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sp Value</em>' containment reference.
   * @see #setSpValue(SpValue)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getChkVariableDeclaration_SpValue()
   * @model containment="true"
   * @generated
   */
  SpValue getSpValue();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.ChkVariableDeclaration#getSpValue <em>Sp Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sp Value</em>' containment reference.
   * @see #getSpValue()
   * @generated
   */
  void setSpValue(SpValue value);

} // ChkVariableDeclaration

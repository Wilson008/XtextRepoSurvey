/**
 * generated by Xtext 2.35.0
 */
package com.coffee.hlvl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.coffee.hlvl.Model#getName <em>Name</em>}</li>
 *   <li>{@link com.coffee.hlvl.Model#getExtendedModels <em>Extended Models</em>}</li>
 *   <li>{@link com.coffee.hlvl.Model#getElements <em>Elements</em>}</li>
 *   <li>{@link com.coffee.hlvl.Model#getRelations <em>Relations</em>}</li>
 *   <li>{@link com.coffee.hlvl.Model#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @see com.coffee.hlvl.HlvlPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.coffee.hlvl.HlvlPackage#getModel_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.coffee.hlvl.Model#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Extended Models</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extended Models</em>' containment reference.
   * @see #setExtendedModels(ListOfModelRef)
   * @see com.coffee.hlvl.HlvlPackage#getModel_ExtendedModels()
   * @model containment="true"
   * @generated
   */
  ListOfModelRef getExtendedModels();

  /**
   * Sets the value of the '{@link com.coffee.hlvl.Model#getExtendedModels <em>Extended Models</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Extended Models</em>' containment reference.
   * @see #getExtendedModels()
   * @generated
   */
  void setExtendedModels(ListOfModelRef value);

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link com.coffee.hlvl.ElmDeclaration}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see com.coffee.hlvl.HlvlPackage#getModel_Elements()
   * @model containment="true"
   * @generated
   */
  EList<ElmDeclaration> getElements();

  /**
   * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
   * The list contents are of type {@link com.coffee.hlvl.RelDeclaration}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relations</em>' containment reference list.
   * @see com.coffee.hlvl.HlvlPackage#getModel_Relations()
   * @model containment="true"
   * @generated
   */
  EList<RelDeclaration> getRelations();

  /**
   * Returns the value of the '<em><b>Operations</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operations</em>' containment reference.
   * @see #setOperations(Operations)
   * @see com.coffee.hlvl.HlvlPackage#getModel_Operations()
   * @model containment="true"
   * @generated
   */
  Operations getOperations();

  /**
   * Sets the value of the '{@link com.coffee.hlvl.Model#getOperations <em>Operations</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operations</em>' containment reference.
   * @see #getOperations()
   * @generated
   */
  void setOperations(Operations value);

} // Model

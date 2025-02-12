/**
 * generated by Xtext 2.35.0
 */
package com.coffee.hlvl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Valuation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.coffee.hlvl.Valuation#getElement <em>Element</em>}</li>
 *   <li>{@link com.coffee.hlvl.Valuation#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see com.coffee.hlvl.HlvlPackage#getValuation()
 * @model
 * @generated
 */
public interface Valuation extends EObject
{
  /**
   * Returns the value of the '<em><b>Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' reference.
   * @see #setElement(ElmDeclaration)
   * @see com.coffee.hlvl.HlvlPackage#getValuation_Element()
   * @model
   * @generated
   */
  ElmDeclaration getElement();

  /**
   * Sets the value of the '{@link com.coffee.hlvl.Valuation#getElement <em>Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element</em>' reference.
   * @see #getElement()
   * @generated
   */
  void setElement(ElmDeclaration value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Relational)
   * @see com.coffee.hlvl.HlvlPackage#getValuation_Value()
   * @model containment="true"
   * @generated
   */
  Relational getValue();

  /**
   * Sets the value of the '{@link com.coffee.hlvl.Valuation#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Relational value);

} // Valuation

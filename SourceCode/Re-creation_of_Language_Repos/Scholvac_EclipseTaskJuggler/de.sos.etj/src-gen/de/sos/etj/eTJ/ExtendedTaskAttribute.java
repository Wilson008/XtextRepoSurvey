/**
 * generated by Xtext 2.35.0
 */
package de.sos.etj.eTJ;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extended Task Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.ExtendedTaskAttribute#getExtend <em>Extend</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.ExtendedTaskAttribute#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getExtendedTaskAttribute()
 * @model
 * @generated
 */
public interface ExtendedTaskAttribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Extend</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extend</em>' reference.
   * @see #setExtend(Extend)
   * @see de.sos.etj.eTJ.ETJPackage#getExtendedTaskAttribute_Extend()
   * @model
   * @generated
   */
  Extend getExtend();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.ExtendedTaskAttribute#getExtend <em>Extend</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Extend</em>' reference.
   * @see #getExtend()
   * @generated
   */
  void setExtend(Extend value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see de.sos.etj.eTJ.ETJPackage#getExtendedTaskAttribute_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.ExtendedTaskAttribute#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // ExtendedTaskAttribute

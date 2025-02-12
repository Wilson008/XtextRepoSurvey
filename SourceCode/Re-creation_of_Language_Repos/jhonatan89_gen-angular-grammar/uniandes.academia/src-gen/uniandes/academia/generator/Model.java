/**
 * generated by Xtext 2.35.0
 */
package uniandes.academia.generator;

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
 *   <li>{@link uniandes.academia.generator.Model#getName <em>Name</em>}</li>
 *   <li>{@link uniandes.academia.generator.Model#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link uniandes.academia.generator.Model#getChildren <em>Children</em>}</li>
 *   <li>{@link uniandes.academia.generator.Model#getIdAtribute <em>Id Atribute</em>}</li>
 *   <li>{@link uniandes.academia.generator.Model#getNameAttribute <em>Name Attribute</em>}</li>
 * </ul>
 *
 * @see uniandes.academia.generator.GeneratorPackage#getModel()
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
   * @see uniandes.academia.generator.GeneratorPackage#getModel_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link uniandes.academia.generator.Model#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link uniandes.academia.generator.Attribute}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see uniandes.academia.generator.GeneratorPackage#getModel_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getAttributes();

  /**
   * Returns the value of the '<em><b>Children</b></em>' containment reference list.
   * The list contents are of type {@link uniandes.academia.generator.Child}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Children</em>' containment reference list.
   * @see uniandes.academia.generator.GeneratorPackage#getModel_Children()
   * @model containment="true"
   * @generated
   */
  EList<Child> getChildren();

  /**
   * Returns the value of the '<em><b>Id Atribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id Atribute</em>' attribute.
   * @see #setIdAtribute(String)
   * @see uniandes.academia.generator.GeneratorPackage#getModel_IdAtribute()
   * @model
   * @generated
   */
  String getIdAtribute();

  /**
   * Sets the value of the '{@link uniandes.academia.generator.Model#getIdAtribute <em>Id Atribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id Atribute</em>' attribute.
   * @see #getIdAtribute()
   * @generated
   */
  void setIdAtribute(String value);

  /**
   * Returns the value of the '<em><b>Name Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Attribute</em>' attribute.
   * @see #setNameAttribute(String)
   * @see uniandes.academia.generator.GeneratorPackage#getModel_NameAttribute()
   * @model
   * @generated
   */
  String getNameAttribute();

  /**
   * Sets the value of the '{@link uniandes.academia.generator.Model#getNameAttribute <em>Name Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Attribute</em>' attribute.
   * @see #getNameAttribute()
   * @generated
   */
  void setNameAttribute(String value);

} // Model

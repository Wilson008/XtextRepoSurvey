/**
 * generated by Xtext 2.35.0
 */
package uniandes.academia.generator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visual Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uniandes.academia.generator.VisualModule#getExports <em>Exports</em>}</li>
 *   <li>{@link uniandes.academia.generator.VisualModule#getRoutes <em>Routes</em>}</li>
 *   <li>{@link uniandes.academia.generator.VisualModule#getShow <em>Show</em>}</li>
 *   <li>{@link uniandes.academia.generator.VisualModule#getDefaultRoute <em>Default Route</em>}</li>
 *   <li>{@link uniandes.academia.generator.VisualModule#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see uniandes.academia.generator.GeneratorPackage#getVisualModule()
 * @model
 * @generated
 */
public interface VisualModule extends uniandes.academia.generator.Module
{
  /**
   * Returns the value of the '<em><b>Exports</b></em>' reference list.
   * The list contents are of type {@link uniandes.academia.generator.Module}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exports</em>' reference list.
   * @see uniandes.academia.generator.GeneratorPackage#getVisualModule_Exports()
   * @model
   * @generated
   */
  EList<uniandes.academia.generator.Module> getExports();

  /**
   * Returns the value of the '<em><b>Routes</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Routes</em>' attribute list.
   * @see uniandes.academia.generator.GeneratorPackage#getVisualModule_Routes()
   * @model unique="false"
   * @generated
   */
  EList<String> getRoutes();

  /**
   * Returns the value of the '<em><b>Show</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Show</em>' attribute list.
   * @see uniandes.academia.generator.GeneratorPackage#getVisualModule_Show()
   * @model unique="false"
   * @generated
   */
  EList<String> getShow();

  /**
   * Returns the value of the '<em><b>Default Route</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Route</em>' attribute.
   * @see #setDefaultRoute(String)
   * @see uniandes.academia.generator.GeneratorPackage#getVisualModule_DefaultRoute()
   * @model
   * @generated
   */
  String getDefaultRoute();

  /**
   * Sets the value of the '{@link uniandes.academia.generator.VisualModule#getDefaultRoute <em>Default Route</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Route</em>' attribute.
   * @see #getDefaultRoute()
   * @generated
   */
  void setDefaultRoute(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link uniandes.academia.generator.EnumLayout}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see uniandes.academia.generator.EnumLayout
   * @see #setType(EnumLayout)
   * @see uniandes.academia.generator.GeneratorPackage#getVisualModule_Type()
   * @model
   * @generated
   */
  EnumLayout getType();

  /**
   * Sets the value of the '{@link uniandes.academia.generator.VisualModule#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see uniandes.academia.generator.EnumLayout
   * @see #getType()
   * @generated
   */
  void setType(EnumLayout value);

} // VisualModule

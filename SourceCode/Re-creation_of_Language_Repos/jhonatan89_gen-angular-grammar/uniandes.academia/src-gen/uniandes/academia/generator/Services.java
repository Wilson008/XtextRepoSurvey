/**
 * generated by Xtext 2.35.0
 */
package uniandes.academia.generator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Services</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uniandes.academia.generator.Services#getName <em>Name</em>}</li>
 *   <li>{@link uniandes.academia.generator.Services#getBaseUrl <em>Base Url</em>}</li>
 *   <li>{@link uniandes.academia.generator.Services#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @see uniandes.academia.generator.GeneratorPackage#getServices()
 * @model
 * @generated
 */
public interface Services extends AbstractElement
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see uniandes.academia.generator.GeneratorPackage#getServices_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link uniandes.academia.generator.Services#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Base Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base Url</em>' attribute.
   * @see #setBaseUrl(String)
   * @see uniandes.academia.generator.GeneratorPackage#getServices_BaseUrl()
   * @model
   * @generated
   */
  String getBaseUrl();

  /**
   * Sets the value of the '{@link uniandes.academia.generator.Services#getBaseUrl <em>Base Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base Url</em>' attribute.
   * @see #getBaseUrl()
   * @generated
   */
  void setBaseUrl(String value);

  /**
   * Returns the value of the '<em><b>Services</b></em>' containment reference list.
   * The list contents are of type {@link uniandes.academia.generator.Service}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Services</em>' containment reference list.
   * @see uniandes.academia.generator.GeneratorPackage#getServices_Services()
   * @model containment="true"
   * @generated
   */
  EList<Service> getServices();

} // Services

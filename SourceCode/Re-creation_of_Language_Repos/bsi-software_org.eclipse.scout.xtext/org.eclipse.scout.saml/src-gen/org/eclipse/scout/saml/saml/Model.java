/**
 * generated by Xtext 2.35.0
 */
package org.eclipse.scout.saml.saml;

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
 *   <li>{@link org.eclipse.scout.saml.saml.Model#getModule <em>Module</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.Model#getImports <em>Imports</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.Model#getTranslations <em>Translations</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.Model#getCodes <em>Codes</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.Model#getLookups <em>Lookups</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.Model#getTemplates <em>Templates</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.Model#getForms <em>Forms</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.Model#getLogics <em>Logics</em>}</li>
 * </ul>
 *
 * @see org.eclipse.scout.saml.saml.SamlPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Module</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Module</em>' containment reference.
   * @see #setModule(ModuleElement)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getModel_Module()
   * @model containment="true"
   * @generated
   */
  ModuleElement getModule();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.Model#getModule <em>Module</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Module</em>' containment reference.
   * @see #getModule()
   * @generated
   */
  void setModule(ModuleElement value);

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.scout.saml.saml.ImportElement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.eclipse.scout.saml.saml.SamlPackage#getModel_Imports()
   * @model containment="true"
   * @generated
   */
  EList<ImportElement> getImports();

  /**
   * Returns the value of the '<em><b>Translations</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.scout.saml.saml.TranslationElement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Translations</em>' containment reference list.
   * @see org.eclipse.scout.saml.saml.SamlPackage#getModel_Translations()
   * @model containment="true"
   * @generated
   */
  EList<TranslationElement> getTranslations();

  /**
   * Returns the value of the '<em><b>Codes</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.scout.saml.saml.CodeElement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Codes</em>' containment reference list.
   * @see org.eclipse.scout.saml.saml.SamlPackage#getModel_Codes()
   * @model containment="true"
   * @generated
   */
  EList<CodeElement> getCodes();

  /**
   * Returns the value of the '<em><b>Lookups</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.scout.saml.saml.LookupElement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lookups</em>' containment reference list.
   * @see org.eclipse.scout.saml.saml.SamlPackage#getModel_Lookups()
   * @model containment="true"
   * @generated
   */
  EList<LookupElement> getLookups();

  /**
   * Returns the value of the '<em><b>Templates</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.scout.saml.saml.TemplateElement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Templates</em>' containment reference list.
   * @see org.eclipse.scout.saml.saml.SamlPackage#getModel_Templates()
   * @model containment="true"
   * @generated
   */
  EList<TemplateElement> getTemplates();

  /**
   * Returns the value of the '<em><b>Forms</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.scout.saml.saml.FormElement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Forms</em>' containment reference list.
   * @see org.eclipse.scout.saml.saml.SamlPackage#getModel_Forms()
   * @model containment="true"
   * @generated
   */
  EList<FormElement> getForms();

  /**
   * Returns the value of the '<em><b>Logics</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.scout.saml.saml.LogicElement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Logics</em>' containment reference list.
   * @see org.eclipse.scout.saml.saml.SamlPackage#getModel_Logics()
   * @model containment="true"
   * @generated
   */
  EList<LogicElement> getLogics();

} // Model

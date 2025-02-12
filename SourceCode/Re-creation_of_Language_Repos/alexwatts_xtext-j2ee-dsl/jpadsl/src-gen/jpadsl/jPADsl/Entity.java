/**
 * generated by Xtext 2.35.0
 */
package jpadsl.jPADsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jpadsl.jPADsl.Entity#getDatabaseVendor <em>Database Vendor</em>}</li>
 *   <li>{@link jpadsl.jPADsl.Entity#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link jpadsl.jPADsl.Entity#getReadOnly <em>Read Only</em>}</li>
 *   <li>{@link jpadsl.jPADsl.Entity#getCacheable <em>Cacheable</em>}</li>
 *   <li>{@link jpadsl.jPADsl.Entity#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link jpadsl.jPADsl.Entity#getImports <em>Imports</em>}</li>
 *   <li>{@link jpadsl.jPADsl.Entity#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see jpadsl.jPADsl.JPADslPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends Type
{
  /**
   * Returns the value of the '<em><b>Database Vendor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Database Vendor</em>' reference.
   * @see #setDatabaseVendor(DatabaseMode)
   * @see jpadsl.jPADsl.JPADslPackage#getEntity_DatabaseVendor()
   * @model
   * @generated
   */
  DatabaseMode getDatabaseVendor();

  /**
   * Sets the value of the '{@link jpadsl.jPADsl.Entity#getDatabaseVendor <em>Database Vendor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Database Vendor</em>' reference.
   * @see #getDatabaseVendor()
   * @generated
   */
  void setDatabaseVendor(DatabaseMode value);

  /**
   * Returns the value of the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Type</em>' reference.
   * @see #setSuperType(Entity)
   * @see jpadsl.jPADsl.JPADslPackage#getEntity_SuperType()
   * @model
   * @generated
   */
  Entity getSuperType();

  /**
   * Sets the value of the '{@link jpadsl.jPADsl.Entity#getSuperType <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(Entity value);

  /**
   * Returns the value of the '<em><b>Read Only</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Read Only</em>' containment reference.
   * @see #setReadOnly(ReadOnly)
   * @see jpadsl.jPADsl.JPADslPackage#getEntity_ReadOnly()
   * @model containment="true"
   * @generated
   */
  ReadOnly getReadOnly();

  /**
   * Sets the value of the '{@link jpadsl.jPADsl.Entity#getReadOnly <em>Read Only</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Read Only</em>' containment reference.
   * @see #getReadOnly()
   * @generated
   */
  void setReadOnly(ReadOnly value);

  /**
   * Returns the value of the '<em><b>Cacheable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cacheable</em>' containment reference.
   * @see #setCacheable(Cacheable)
   * @see jpadsl.jPADsl.JPADslPackage#getEntity_Cacheable()
   * @model containment="true"
   * @generated
   */
  Cacheable getCacheable();

  /**
   * Sets the value of the '{@link jpadsl.jPADsl.Entity#getCacheable <em>Cacheable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cacheable</em>' containment reference.
   * @see #getCacheable()
   * @generated
   */
  void setCacheable(Cacheable value);

  /**
   * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifier</em>' containment reference.
   * @see #setIdentifier(Identifier)
   * @see jpadsl.jPADsl.JPADslPackage#getEntity_Identifier()
   * @model containment="true"
   * @generated
   */
  Identifier getIdentifier();

  /**
   * Sets the value of the '{@link jpadsl.jPADsl.Entity#getIdentifier <em>Identifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier</em>' containment reference.
   * @see #getIdentifier()
   * @generated
   */
  void setIdentifier(Identifier value);

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link jpadsl.jPADsl.Import}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see jpadsl.jPADsl.JPADslPackage#getEntity_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Features</b></em>' containment reference list.
   * The list contents are of type {@link jpadsl.jPADsl.Feature}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' containment reference list.
   * @see jpadsl.jPADsl.JPADslPackage#getEntity_Features()
   * @model containment="true"
   * @generated
   */
  EList<Feature> getFeatures();

} // Entity

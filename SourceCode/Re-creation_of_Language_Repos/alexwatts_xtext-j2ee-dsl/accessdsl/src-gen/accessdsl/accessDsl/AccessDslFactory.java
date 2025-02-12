/**
 * generated by Xtext 2.35.0
 */
package accessdsl.accessDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see accessdsl.accessDsl.AccessDslPackage
 * @generated
 */
public interface AccessDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AccessDslFactory eINSTANCE = accessdsl.accessDsl.impl.AccessDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>Unit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unit</em>'.
   * @generated
   */
  Unit createUnit();

  /**
   * Returns a new object of class '<em>Package Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Package Name</em>'.
   * @generated
   */
  PackageName createPackageName();

  /**
   * Returns a new object of class '<em>Container</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Container</em>'.
   * @generated
   */
  Container createContainer();

  /**
   * Returns a new object of class '<em>Container Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Container Element</em>'.
   * @generated
   */
  ContainerElement createContainerElement();

  /**
   * Returns a new object of class '<em>Contained Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Contained Entity</em>'.
   * @generated
   */
  ContainedEntity createContainedEntity();

  /**
   * Returns a new object of class '<em>Query And Type Mapping</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Query And Type Mapping</em>'.
   * @generated
   */
  QueryAndTypeMapping createQueryAndTypeMapping();

  /**
   * Returns a new object of class '<em>Query Mapping</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Query Mapping</em>'.
   * @generated
   */
  QueryMapping createQueryMapping();

  /**
   * Returns a new object of class '<em>Single Result Query Mapping</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Single Result Query Mapping</em>'.
   * @generated
   */
  SingleResultQueryMapping createSingleResultQueryMapping();

  /**
   * Returns a new object of class '<em>Multiple Result Query Mapping</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multiple Result Query Mapping</em>'.
   * @generated
   */
  MultipleResultQueryMapping createMultipleResultQueryMapping();

  /**
   * Returns a new object of class '<em>State Adjustment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State Adjustment</em>'.
   * @generated
   */
  StateAdjustment createStateAdjustment();

  /**
   * Returns a new object of class '<em>State Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State Operation</em>'.
   * @generated
   */
  StateOperation createStateOperation();

  /**
   * Returns a new object of class '<em>Persist Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Persist Operation</em>'.
   * @generated
   */
  PersistOperation createPersistOperation();

  /**
   * Returns a new object of class '<em>Persist And Associate Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Persist And Associate Operation</em>'.
   * @generated
   */
  PersistAndAssociateOperation createPersistAndAssociateOperation();

  /**
   * Returns a new object of class '<em>Associate Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Associate Operation</em>'.
   * @generated
   */
  AssociateOperation createAssociateOperation();

  /**
   * Returns a new object of class '<em>Update Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Update Operation</em>'.
   * @generated
   */
  UpdateOperation createUpdateOperation();

  /**
   * Returns a new object of class '<em>Delete Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Delete Operation</em>'.
   * @generated
   */
  DeleteOperation createDeleteOperation();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  AccessDslPackage getAccessDslPackage();

} //AccessDslFactory

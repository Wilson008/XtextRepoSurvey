/**
 * generated by Xtext 2.35.0
 */
package accessdsl.accessDsl.util;

import accessdsl.accessDsl.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see accessdsl.accessDsl.AccessDslPackage
 * @generated
 */
public class AccessDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AccessDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AccessDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = AccessDslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case AccessDslPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AccessDslPackage.IMPORT:
      {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AccessDslPackage.UNIT:
      {
        Unit unit = (Unit)theEObject;
        T result = caseUnit(unit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AccessDslPackage.PACKAGE_NAME:
      {
        PackageName packageName = (PackageName)theEObject;
        T result = casePackageName(packageName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AccessDslPackage.CONTAINER:
      {
        Container container = (Container)theEObject;
        T result = caseContainer(container);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AccessDslPackage.CONTAINER_ELEMENT:
      {
        ContainerElement containerElement = (ContainerElement)theEObject;
        T result = caseContainerElement(containerElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AccessDslPackage.CONTAINED_ENTITY:
      {
        ContainedEntity containedEntity = (ContainedEntity)theEObject;
        T result = caseContainedEntity(containedEntity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AccessDslPackage.QUERY_AND_TYPE_MAPPING:
      {
        QueryAndTypeMapping queryAndTypeMapping = (QueryAndTypeMapping)theEObject;
        T result = caseQueryAndTypeMapping(queryAndTypeMapping);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AccessDslPackage.QUERY_MAPPING:
      {
        QueryMapping queryMapping = (QueryMapping)theEObject;
        T result = caseQueryMapping(queryMapping);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AccessDslPackage.SINGLE_RESULT_QUERY_MAPPING:
      {
        SingleResultQueryMapping singleResultQueryMapping = (SingleResultQueryMapping)theEObject;
        T result = caseSingleResultQueryMapping(singleResultQueryMapping);
        if (result == null) result = caseQueryMapping(singleResultQueryMapping);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AccessDslPackage.MULTIPLE_RESULT_QUERY_MAPPING:
      {
        MultipleResultQueryMapping multipleResultQueryMapping = (MultipleResultQueryMapping)theEObject;
        T result = caseMultipleResultQueryMapping(multipleResultQueryMapping);
        if (result == null) result = caseQueryMapping(multipleResultQueryMapping);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AccessDslPackage.STATE_ADJUSTMENT:
      {
        StateAdjustment stateAdjustment = (StateAdjustment)theEObject;
        T result = caseStateAdjustment(stateAdjustment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AccessDslPackage.STATE_OPERATION:
      {
        StateOperation stateOperation = (StateOperation)theEObject;
        T result = caseStateOperation(stateOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AccessDslPackage.PERSIST_OPERATION:
      {
        PersistOperation persistOperation = (PersistOperation)theEObject;
        T result = casePersistOperation(persistOperation);
        if (result == null) result = caseStateOperation(persistOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AccessDslPackage.PERSIST_AND_ASSOCIATE_OPERATION:
      {
        PersistAndAssociateOperation persistAndAssociateOperation = (PersistAndAssociateOperation)theEObject;
        T result = casePersistAndAssociateOperation(persistAndAssociateOperation);
        if (result == null) result = caseStateOperation(persistAndAssociateOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AccessDslPackage.ASSOCIATE_OPERATION:
      {
        AssociateOperation associateOperation = (AssociateOperation)theEObject;
        T result = caseAssociateOperation(associateOperation);
        if (result == null) result = caseStateOperation(associateOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AccessDslPackage.UPDATE_OPERATION:
      {
        UpdateOperation updateOperation = (UpdateOperation)theEObject;
        T result = caseUpdateOperation(updateOperation);
        if (result == null) result = caseStateOperation(updateOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AccessDslPackage.DELETE_OPERATION:
      {
        DeleteOperation deleteOperation = (DeleteOperation)theEObject;
        T result = caseDeleteOperation(deleteOperation);
        if (result == null) result = caseStateOperation(deleteOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport(Import object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnit(Unit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Package Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackageName(PackageName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Container</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContainer(Container object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Container Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Container Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContainerElement(ContainerElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Contained Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Contained Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContainedEntity(ContainedEntity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Query And Type Mapping</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Query And Type Mapping</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQueryAndTypeMapping(QueryAndTypeMapping object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Query Mapping</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Query Mapping</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQueryMapping(QueryMapping object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Single Result Query Mapping</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Single Result Query Mapping</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSingleResultQueryMapping(SingleResultQueryMapping object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multiple Result Query Mapping</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multiple Result Query Mapping</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultipleResultQueryMapping(MultipleResultQueryMapping object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State Adjustment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State Adjustment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStateAdjustment(StateAdjustment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStateOperation(StateOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Persist Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Persist Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePersistOperation(PersistOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Persist And Associate Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Persist And Associate Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePersistAndAssociateOperation(PersistAndAssociateOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Associate Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Associate Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssociateOperation(AssociateOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Update Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Update Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUpdateOperation(UpdateOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Delete Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Delete Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeleteOperation(DeleteOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //AccessDslSwitch

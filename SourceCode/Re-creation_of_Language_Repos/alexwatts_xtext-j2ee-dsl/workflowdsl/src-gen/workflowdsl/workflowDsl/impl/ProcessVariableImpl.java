/**
 * generated by Xtext 2.35.0
 */
package workflowdsl.workflowDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import workflowdsl.workflowDsl.ConditionalConnector;
import workflowdsl.workflowDsl.ProcessVariable;
import workflowdsl.workflowDsl.StringBasedConditionalVaraible;
import workflowdsl.workflowDsl.WorkflowDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link workflowdsl.workflowDsl.impl.ProcessVariableImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link workflowdsl.workflowDsl.impl.ProcessVariableImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessVariableImpl extends MinimalEObjectImpl.Container implements ProcessVariable
{
  /**
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected StringBasedConditionalVaraible variable;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected ConditionalConnector value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProcessVariableImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return WorkflowDslPackage.Literals.PROCESS_VARIABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StringBasedConditionalVaraible getVariable()
  {
    if (variable != null && variable.eIsProxy())
    {
      InternalEObject oldVariable = (InternalEObject)variable;
      variable = (StringBasedConditionalVaraible)eResolveProxy(oldVariable);
      if (variable != oldVariable)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowDslPackage.PROCESS_VARIABLE__VARIABLE, oldVariable, variable));
      }
    }
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringBasedConditionalVaraible basicGetVariable()
  {
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVariable(StringBasedConditionalVaraible newVariable)
  {
    StringBasedConditionalVaraible oldVariable = variable;
    variable = newVariable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkflowDslPackage.PROCESS_VARIABLE__VARIABLE, oldVariable, variable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ConditionalConnector getValue()
  {
    if (value != null && value.eIsProxy())
    {
      InternalEObject oldValue = (InternalEObject)value;
      value = (ConditionalConnector)eResolveProxy(oldValue);
      if (value != oldValue)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowDslPackage.PROCESS_VARIABLE__VALUE, oldValue, value));
      }
    }
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionalConnector basicGetValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setValue(ConditionalConnector newValue)
  {
    ConditionalConnector oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkflowDslPackage.PROCESS_VARIABLE__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case WorkflowDslPackage.PROCESS_VARIABLE__VARIABLE:
        if (resolve) return getVariable();
        return basicGetVariable();
      case WorkflowDslPackage.PROCESS_VARIABLE__VALUE:
        if (resolve) return getValue();
        return basicGetValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case WorkflowDslPackage.PROCESS_VARIABLE__VARIABLE:
        setVariable((StringBasedConditionalVaraible)newValue);
        return;
      case WorkflowDslPackage.PROCESS_VARIABLE__VALUE:
        setValue((ConditionalConnector)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case WorkflowDslPackage.PROCESS_VARIABLE__VARIABLE:
        setVariable((StringBasedConditionalVaraible)null);
        return;
      case WorkflowDslPackage.PROCESS_VARIABLE__VALUE:
        setValue((ConditionalConnector)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case WorkflowDslPackage.PROCESS_VARIABLE__VARIABLE:
        return variable != null;
      case WorkflowDslPackage.PROCESS_VARIABLE__VALUE:
        return value != null;
    }
    return super.eIsSet(featureID);
  }

} //ProcessVariableImpl

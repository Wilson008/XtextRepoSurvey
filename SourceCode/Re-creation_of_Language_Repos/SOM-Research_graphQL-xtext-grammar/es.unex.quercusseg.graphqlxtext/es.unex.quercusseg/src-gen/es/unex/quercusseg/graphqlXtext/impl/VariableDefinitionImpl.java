/**
 * generated by Xtext 2.35.0
 */
package es.unex.quercusseg.graphqlXtext.impl;

import es.unex.quercusseg.graphqlXtext.DefaultValue;
import es.unex.quercusseg.graphqlXtext.GraphqlXtextPackage;
import es.unex.quercusseg.graphqlXtext.Type;
import es.unex.quercusseg.graphqlXtext.VariableDefinition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unex.quercusseg.graphqlXtext.impl.VariableDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.unex.quercusseg.graphqlXtext.impl.VariableDefinitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link es.unex.quercusseg.graphqlXtext.impl.VariableDefinitionImpl#getDefValue <em>Def Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableDefinitionImpl extends MinimalEObjectImpl.Container implements VariableDefinition
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Type type;

  /**
   * The cached value of the '{@link #getDefValue() <em>Def Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefValue()
   * @generated
   * @ordered
   */
  protected DefaultValue defValue;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariableDefinitionImpl()
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
    return GraphqlXtextPackage.Literals.VARIABLE_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraphqlXtextPackage.VARIABLE_DEFINITION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Type getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(Type newType, NotificationChain msgs)
  {
    Type oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphqlXtextPackage.VARIABLE_DEFINITION__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setType(Type newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraphqlXtextPackage.VARIABLE_DEFINITION__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraphqlXtextPackage.VARIABLE_DEFINITION__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraphqlXtextPackage.VARIABLE_DEFINITION__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DefaultValue getDefValue()
  {
    return defValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDefValue(DefaultValue newDefValue, NotificationChain msgs)
  {
    DefaultValue oldDefValue = defValue;
    defValue = newDefValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphqlXtextPackage.VARIABLE_DEFINITION__DEF_VALUE, oldDefValue, newDefValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDefValue(DefaultValue newDefValue)
  {
    if (newDefValue != defValue)
    {
      NotificationChain msgs = null;
      if (defValue != null)
        msgs = ((InternalEObject)defValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraphqlXtextPackage.VARIABLE_DEFINITION__DEF_VALUE, null, msgs);
      if (newDefValue != null)
        msgs = ((InternalEObject)newDefValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraphqlXtextPackage.VARIABLE_DEFINITION__DEF_VALUE, null, msgs);
      msgs = basicSetDefValue(newDefValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraphqlXtextPackage.VARIABLE_DEFINITION__DEF_VALUE, newDefValue, newDefValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case GraphqlXtextPackage.VARIABLE_DEFINITION__TYPE:
        return basicSetType(null, msgs);
      case GraphqlXtextPackage.VARIABLE_DEFINITION__DEF_VALUE:
        return basicSetDefValue(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case GraphqlXtextPackage.VARIABLE_DEFINITION__NAME:
        return getName();
      case GraphqlXtextPackage.VARIABLE_DEFINITION__TYPE:
        return getType();
      case GraphqlXtextPackage.VARIABLE_DEFINITION__DEF_VALUE:
        return getDefValue();
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
      case GraphqlXtextPackage.VARIABLE_DEFINITION__NAME:
        setName((String)newValue);
        return;
      case GraphqlXtextPackage.VARIABLE_DEFINITION__TYPE:
        setType((Type)newValue);
        return;
      case GraphqlXtextPackage.VARIABLE_DEFINITION__DEF_VALUE:
        setDefValue((DefaultValue)newValue);
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
      case GraphqlXtextPackage.VARIABLE_DEFINITION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GraphqlXtextPackage.VARIABLE_DEFINITION__TYPE:
        setType((Type)null);
        return;
      case GraphqlXtextPackage.VARIABLE_DEFINITION__DEF_VALUE:
        setDefValue((DefaultValue)null);
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
      case GraphqlXtextPackage.VARIABLE_DEFINITION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GraphqlXtextPackage.VARIABLE_DEFINITION__TYPE:
        return type != null;
      case GraphqlXtextPackage.VARIABLE_DEFINITION__DEF_VALUE:
        return defValue != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //VariableDefinitionImpl

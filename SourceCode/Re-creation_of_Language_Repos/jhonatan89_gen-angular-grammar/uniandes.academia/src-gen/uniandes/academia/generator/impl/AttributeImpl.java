/**
 * generated by Xtext 2.35.0
 */
package uniandes.academia.generator.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uniandes.academia.generator.Attribute;
import uniandes.academia.generator.ComponentBasic;
import uniandes.academia.generator.EnumType;
import uniandes.academia.generator.GeneratorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uniandes.academia.generator.impl.AttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link uniandes.academia.generator.impl.AttributeImpl#getType <em>Type</em>}</li>
 *   <li>{@link uniandes.academia.generator.impl.AttributeImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link uniandes.academia.generator.impl.AttributeImpl#isIsRequired <em>Is Required</em>}</li>
 *   <li>{@link uniandes.academia.generator.impl.AttributeImpl#getMockType <em>Mock Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeImpl extends MinimalEObjectImpl.Container implements Attribute
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
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final EnumType TYPE_EDEFAULT = EnumType.STRING;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected EnumType type = TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getComponent() <em>Component</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponent()
   * @generated
   * @ordered
   */
  protected ComponentBasic component;

  /**
   * The default value of the '{@link #isIsRequired() <em>Is Required</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsRequired()
   * @generated
   * @ordered
   */
  protected static final boolean IS_REQUIRED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsRequired() <em>Is Required</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsRequired()
   * @generated
   * @ordered
   */
  protected boolean isRequired = IS_REQUIRED_EDEFAULT;

  /**
   * The default value of the '{@link #getMockType() <em>Mock Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMockType()
   * @generated
   * @ordered
   */
  protected static final String MOCK_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMockType() <em>Mock Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMockType()
   * @generated
   * @ordered
   */
  protected String mockType = MOCK_TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributeImpl()
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
    return GeneratorPackage.Literals.ATTRIBUTE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.ATTRIBUTE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EnumType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setType(EnumType newType)
  {
    EnumType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.ATTRIBUTE__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ComponentBasic getComponent()
  {
    if (component != null && component.eIsProxy())
    {
      InternalEObject oldComponent = (InternalEObject)component;
      component = (ComponentBasic)eResolveProxy(oldComponent);
      if (component != oldComponent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeneratorPackage.ATTRIBUTE__COMPONENT, oldComponent, component));
      }
    }
    return component;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentBasic basicGetComponent()
  {
    return component;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setComponent(ComponentBasic newComponent)
  {
    ComponentBasic oldComponent = component;
    component = newComponent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.ATTRIBUTE__COMPONENT, oldComponent, component));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isIsRequired()
  {
    return isRequired;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setIsRequired(boolean newIsRequired)
  {
    boolean oldIsRequired = isRequired;
    isRequired = newIsRequired;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.ATTRIBUTE__IS_REQUIRED, oldIsRequired, isRequired));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getMockType()
  {
    return mockType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMockType(String newMockType)
  {
    String oldMockType = mockType;
    mockType = newMockType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.ATTRIBUTE__MOCK_TYPE, oldMockType, mockType));
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
      case GeneratorPackage.ATTRIBUTE__NAME:
        return getName();
      case GeneratorPackage.ATTRIBUTE__TYPE:
        return getType();
      case GeneratorPackage.ATTRIBUTE__COMPONENT:
        if (resolve) return getComponent();
        return basicGetComponent();
      case GeneratorPackage.ATTRIBUTE__IS_REQUIRED:
        return isIsRequired();
      case GeneratorPackage.ATTRIBUTE__MOCK_TYPE:
        return getMockType();
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
      case GeneratorPackage.ATTRIBUTE__NAME:
        setName((String)newValue);
        return;
      case GeneratorPackage.ATTRIBUTE__TYPE:
        setType((EnumType)newValue);
        return;
      case GeneratorPackage.ATTRIBUTE__COMPONENT:
        setComponent((ComponentBasic)newValue);
        return;
      case GeneratorPackage.ATTRIBUTE__IS_REQUIRED:
        setIsRequired((Boolean)newValue);
        return;
      case GeneratorPackage.ATTRIBUTE__MOCK_TYPE:
        setMockType((String)newValue);
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
      case GeneratorPackage.ATTRIBUTE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GeneratorPackage.ATTRIBUTE__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case GeneratorPackage.ATTRIBUTE__COMPONENT:
        setComponent((ComponentBasic)null);
        return;
      case GeneratorPackage.ATTRIBUTE__IS_REQUIRED:
        setIsRequired(IS_REQUIRED_EDEFAULT);
        return;
      case GeneratorPackage.ATTRIBUTE__MOCK_TYPE:
        setMockType(MOCK_TYPE_EDEFAULT);
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
      case GeneratorPackage.ATTRIBUTE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GeneratorPackage.ATTRIBUTE__TYPE:
        return type != TYPE_EDEFAULT;
      case GeneratorPackage.ATTRIBUTE__COMPONENT:
        return component != null;
      case GeneratorPackage.ATTRIBUTE__IS_REQUIRED:
        return isRequired != IS_REQUIRED_EDEFAULT;
      case GeneratorPackage.ATTRIBUTE__MOCK_TYPE:
        return MOCK_TYPE_EDEFAULT == null ? mockType != null : !MOCK_TYPE_EDEFAULT.equals(mockType);
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
    result.append(", type: ");
    result.append(type);
    result.append(", isRequired: ");
    result.append(isRequired);
    result.append(", mockType: ");
    result.append(mockType);
    result.append(')');
    return result.toString();
  }

} //AttributeImpl

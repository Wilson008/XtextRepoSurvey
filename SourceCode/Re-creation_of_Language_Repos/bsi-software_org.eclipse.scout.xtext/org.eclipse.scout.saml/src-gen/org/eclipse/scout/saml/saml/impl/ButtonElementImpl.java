/**
 * generated by Xtext 2.35.0
 */
package org.eclipse.scout.saml.saml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.scout.saml.saml.ButtonElement;
import org.eclipse.scout.saml.saml.MenuElement;
import org.eclipse.scout.saml.saml.SamlPackage;
import org.eclipse.scout.saml.saml.TranslationElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Button Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.ButtonElementImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.ButtonElementImpl#getProcessButton <em>Process Button</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.ButtonElementImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.ButtonElementImpl#getGridWidth <em>Grid Width</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.ButtonElementImpl#getWidthInPixels <em>Width In Pixels</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.ButtonElementImpl#getMenus <em>Menus</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ButtonElementImpl extends FormFieldElementImpl implements ButtonElement
{
  /**
   * The cached value of the '{@link #getText() <em>Text</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getText()
   * @generated
   * @ordered
   */
  protected TranslationElement text;

  /**
   * The default value of the '{@link #getProcessButton() <em>Process Button</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcessButton()
   * @generated
   * @ordered
   */
  protected static final String PROCESS_BUTTON_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getProcessButton() <em>Process Button</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcessButton()
   * @generated
   * @ordered
   */
  protected String processButton = PROCESS_BUTTON_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getGridWidth() <em>Grid Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGridWidth()
   * @generated
   * @ordered
   */
  protected static final int GRID_WIDTH_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getGridWidth() <em>Grid Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGridWidth()
   * @generated
   * @ordered
   */
  protected int gridWidth = GRID_WIDTH_EDEFAULT;

  /**
   * The default value of the '{@link #getWidthInPixels() <em>Width In Pixels</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWidthInPixels()
   * @generated
   * @ordered
   */
  protected static final int WIDTH_IN_PIXELS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getWidthInPixels() <em>Width In Pixels</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWidthInPixels()
   * @generated
   * @ordered
   */
  protected int widthInPixels = WIDTH_IN_PIXELS_EDEFAULT;

  /**
   * The cached value of the '{@link #getMenus() <em>Menus</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMenus()
   * @generated
   * @ordered
   */
  protected EList<MenuElement> menus;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ButtonElementImpl()
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
    return SamlPackage.Literals.BUTTON_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TranslationElement getText()
  {
    if (text != null && text.eIsProxy())
    {
      InternalEObject oldText = (InternalEObject)text;
      text = (TranslationElement)eResolveProxy(oldText);
      if (text != oldText)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SamlPackage.BUTTON_ELEMENT__TEXT, oldText, text));
      }
    }
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TranslationElement basicGetText()
  {
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setText(TranslationElement newText)
  {
    TranslationElement oldText = text;
    text = newText;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.BUTTON_ELEMENT__TEXT, oldText, text));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getProcessButton()
  {
    return processButton;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setProcessButton(String newProcessButton)
  {
    String oldProcessButton = processButton;
    processButton = newProcessButton;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.BUTTON_ELEMENT__PROCESS_BUTTON, oldProcessButton, processButton));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.BUTTON_ELEMENT__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getGridWidth()
  {
    return gridWidth;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setGridWidth(int newGridWidth)
  {
    int oldGridWidth = gridWidth;
    gridWidth = newGridWidth;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.BUTTON_ELEMENT__GRID_WIDTH, oldGridWidth, gridWidth));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getWidthInPixels()
  {
    return widthInPixels;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setWidthInPixels(int newWidthInPixels)
  {
    int oldWidthInPixels = widthInPixels;
    widthInPixels = newWidthInPixels;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.BUTTON_ELEMENT__WIDTH_IN_PIXELS, oldWidthInPixels, widthInPixels));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<MenuElement> getMenus()
  {
    if (menus == null)
    {
      menus = new EObjectContainmentEList<MenuElement>(MenuElement.class, this, SamlPackage.BUTTON_ELEMENT__MENUS);
    }
    return menus;
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
      case SamlPackage.BUTTON_ELEMENT__MENUS:
        return ((InternalEList<?>)getMenus()).basicRemove(otherEnd, msgs);
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
      case SamlPackage.BUTTON_ELEMENT__TEXT:
        if (resolve) return getText();
        return basicGetText();
      case SamlPackage.BUTTON_ELEMENT__PROCESS_BUTTON:
        return getProcessButton();
      case SamlPackage.BUTTON_ELEMENT__TYPE:
        return getType();
      case SamlPackage.BUTTON_ELEMENT__GRID_WIDTH:
        return getGridWidth();
      case SamlPackage.BUTTON_ELEMENT__WIDTH_IN_PIXELS:
        return getWidthInPixels();
      case SamlPackage.BUTTON_ELEMENT__MENUS:
        return getMenus();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SamlPackage.BUTTON_ELEMENT__TEXT:
        setText((TranslationElement)newValue);
        return;
      case SamlPackage.BUTTON_ELEMENT__PROCESS_BUTTON:
        setProcessButton((String)newValue);
        return;
      case SamlPackage.BUTTON_ELEMENT__TYPE:
        setType((String)newValue);
        return;
      case SamlPackage.BUTTON_ELEMENT__GRID_WIDTH:
        setGridWidth((Integer)newValue);
        return;
      case SamlPackage.BUTTON_ELEMENT__WIDTH_IN_PIXELS:
        setWidthInPixels((Integer)newValue);
        return;
      case SamlPackage.BUTTON_ELEMENT__MENUS:
        getMenus().clear();
        getMenus().addAll((Collection<? extends MenuElement>)newValue);
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
      case SamlPackage.BUTTON_ELEMENT__TEXT:
        setText((TranslationElement)null);
        return;
      case SamlPackage.BUTTON_ELEMENT__PROCESS_BUTTON:
        setProcessButton(PROCESS_BUTTON_EDEFAULT);
        return;
      case SamlPackage.BUTTON_ELEMENT__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case SamlPackage.BUTTON_ELEMENT__GRID_WIDTH:
        setGridWidth(GRID_WIDTH_EDEFAULT);
        return;
      case SamlPackage.BUTTON_ELEMENT__WIDTH_IN_PIXELS:
        setWidthInPixels(WIDTH_IN_PIXELS_EDEFAULT);
        return;
      case SamlPackage.BUTTON_ELEMENT__MENUS:
        getMenus().clear();
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
      case SamlPackage.BUTTON_ELEMENT__TEXT:
        return text != null;
      case SamlPackage.BUTTON_ELEMENT__PROCESS_BUTTON:
        return PROCESS_BUTTON_EDEFAULT == null ? processButton != null : !PROCESS_BUTTON_EDEFAULT.equals(processButton);
      case SamlPackage.BUTTON_ELEMENT__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case SamlPackage.BUTTON_ELEMENT__GRID_WIDTH:
        return gridWidth != GRID_WIDTH_EDEFAULT;
      case SamlPackage.BUTTON_ELEMENT__WIDTH_IN_PIXELS:
        return widthInPixels != WIDTH_IN_PIXELS_EDEFAULT;
      case SamlPackage.BUTTON_ELEMENT__MENUS:
        return menus != null && !menus.isEmpty();
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
    result.append(" (processButton: ");
    result.append(processButton);
    result.append(", type: ");
    result.append(type);
    result.append(", gridWidth: ");
    result.append(gridWidth);
    result.append(", widthInPixels: ");
    result.append(widthInPixels);
    result.append(')');
    return result.toString();
  }

} //ButtonElementImpl

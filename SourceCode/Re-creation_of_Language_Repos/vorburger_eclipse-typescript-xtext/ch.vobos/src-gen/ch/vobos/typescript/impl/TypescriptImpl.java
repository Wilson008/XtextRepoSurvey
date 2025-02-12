/**
 * generated by Xtext 2.35.0
 */
package ch.vobos.typescript.impl;

import ch.vobos.typescript.ImportDeclaration;
import ch.vobos.typescript.InterfacesAndClasses;
import ch.vobos.typescript.Typescript;
import ch.vobos.typescript.TypescriptPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Typescript</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.vobos.typescript.impl.TypescriptImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link ch.vobos.typescript.impl.TypescriptImpl#getInterfacesAndClasses <em>Interfaces And Classes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypescriptImpl extends MinimalEObjectImpl.Container implements Typescript
{
  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<ImportDeclaration> imports;

  /**
   * The cached value of the '{@link #getInterfacesAndClasses() <em>Interfaces And Classes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterfacesAndClasses()
   * @generated
   * @ordered
   */
  protected InterfacesAndClasses interfacesAndClasses;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypescriptImpl()
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
    return TypescriptPackage.Literals.TYPESCRIPT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ImportDeclaration> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<ImportDeclaration>(ImportDeclaration.class, this, TypescriptPackage.TYPESCRIPT__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InterfacesAndClasses getInterfacesAndClasses()
  {
    return interfacesAndClasses;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInterfacesAndClasses(InterfacesAndClasses newInterfacesAndClasses, NotificationChain msgs)
  {
    InterfacesAndClasses oldInterfacesAndClasses = interfacesAndClasses;
    interfacesAndClasses = newInterfacesAndClasses;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypescriptPackage.TYPESCRIPT__INTERFACES_AND_CLASSES, oldInterfacesAndClasses, newInterfacesAndClasses);
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
  public void setInterfacesAndClasses(InterfacesAndClasses newInterfacesAndClasses)
  {
    if (newInterfacesAndClasses != interfacesAndClasses)
    {
      NotificationChain msgs = null;
      if (interfacesAndClasses != null)
        msgs = ((InternalEObject)interfacesAndClasses).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypescriptPackage.TYPESCRIPT__INTERFACES_AND_CLASSES, null, msgs);
      if (newInterfacesAndClasses != null)
        msgs = ((InternalEObject)newInterfacesAndClasses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypescriptPackage.TYPESCRIPT__INTERFACES_AND_CLASSES, null, msgs);
      msgs = basicSetInterfacesAndClasses(newInterfacesAndClasses, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypescriptPackage.TYPESCRIPT__INTERFACES_AND_CLASSES, newInterfacesAndClasses, newInterfacesAndClasses));
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
      case TypescriptPackage.TYPESCRIPT__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case TypescriptPackage.TYPESCRIPT__INTERFACES_AND_CLASSES:
        return basicSetInterfacesAndClasses(null, msgs);
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
      case TypescriptPackage.TYPESCRIPT__IMPORTS:
        return getImports();
      case TypescriptPackage.TYPESCRIPT__INTERFACES_AND_CLASSES:
        return getInterfacesAndClasses();
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
      case TypescriptPackage.TYPESCRIPT__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends ImportDeclaration>)newValue);
        return;
      case TypescriptPackage.TYPESCRIPT__INTERFACES_AND_CLASSES:
        setInterfacesAndClasses((InterfacesAndClasses)newValue);
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
      case TypescriptPackage.TYPESCRIPT__IMPORTS:
        getImports().clear();
        return;
      case TypescriptPackage.TYPESCRIPT__INTERFACES_AND_CLASSES:
        setInterfacesAndClasses((InterfacesAndClasses)null);
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
      case TypescriptPackage.TYPESCRIPT__IMPORTS:
        return imports != null && !imports.isEmpty();
      case TypescriptPackage.TYPESCRIPT__INTERFACES_AND_CLASSES:
        return interfacesAndClasses != null;
    }
    return super.eIsSet(featureID);
  }

} //TypescriptImpl

/**
 * generated by Xtext 2.35.0
 */
package edu.tadp.firewall.firewalll.impl;

import edu.tadp.firewall.firewalll.Firewall;
import edu.tadp.firewall.firewalll.FirewalllPackage;
import edu.tadp.firewall.firewalll.ReglaEtiquetada;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Firewall</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.tadp.firewall.firewalll.impl.FirewallImpl#getReglas <em>Reglas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FirewallImpl extends MinimalEObjectImpl.Container implements Firewall
{
  /**
   * The cached value of the '{@link #getReglas() <em>Reglas</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReglas()
   * @generated
   * @ordered
   */
  protected EList<ReglaEtiquetada> reglas;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FirewallImpl()
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
    return FirewalllPackage.Literals.FIREWALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ReglaEtiquetada> getReglas()
  {
    if (reglas == null)
    {
      reglas = new EObjectContainmentEList<ReglaEtiquetada>(ReglaEtiquetada.class, this, FirewalllPackage.FIREWALL__REGLAS);
    }
    return reglas;
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
      case FirewalllPackage.FIREWALL__REGLAS:
        return ((InternalEList<?>)getReglas()).basicRemove(otherEnd, msgs);
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
      case FirewalllPackage.FIREWALL__REGLAS:
        return getReglas();
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
      case FirewalllPackage.FIREWALL__REGLAS:
        getReglas().clear();
        getReglas().addAll((Collection<? extends ReglaEtiquetada>)newValue);
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
      case FirewalllPackage.FIREWALL__REGLAS:
        getReglas().clear();
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
      case FirewalllPackage.FIREWALL__REGLAS:
        return reglas != null && !reglas.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //FirewallImpl

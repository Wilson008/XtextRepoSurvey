/**
 * generated by Xtext 2.35.0
 */
package ase.queryDsl.impl;

import ase.queryDsl.DeletePrescription;
import ase.queryDsl.QueryDslPackage;
import ase.queryDsl.WherePrescription;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delete Prescription</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ase.queryDsl.impl.DeletePrescriptionImpl#getWhereprescription <em>Whereprescription</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeletePrescriptionImpl extends DeleteImpl implements DeletePrescription
{
  /**
   * The cached value of the '{@link #getWhereprescription() <em>Whereprescription</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhereprescription()
   * @generated
   * @ordered
   */
  protected EList<WherePrescription> whereprescription;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeletePrescriptionImpl()
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
    return QueryDslPackage.Literals.DELETE_PRESCRIPTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<WherePrescription> getWhereprescription()
  {
    if (whereprescription == null)
    {
      whereprescription = new EObjectContainmentEList<WherePrescription>(WherePrescription.class, this, QueryDslPackage.DELETE_PRESCRIPTION__WHEREPRESCRIPTION);
    }
    return whereprescription;
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
      case QueryDslPackage.DELETE_PRESCRIPTION__WHEREPRESCRIPTION:
        return ((InternalEList<?>)getWhereprescription()).basicRemove(otherEnd, msgs);
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
      case QueryDslPackage.DELETE_PRESCRIPTION__WHEREPRESCRIPTION:
        return getWhereprescription();
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
      case QueryDslPackage.DELETE_PRESCRIPTION__WHEREPRESCRIPTION:
        getWhereprescription().clear();
        getWhereprescription().addAll((Collection<? extends WherePrescription>)newValue);
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
      case QueryDslPackage.DELETE_PRESCRIPTION__WHEREPRESCRIPTION:
        getWhereprescription().clear();
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
      case QueryDslPackage.DELETE_PRESCRIPTION__WHEREPRESCRIPTION:
        return whereprescription != null && !whereprescription.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DeletePrescriptionImpl

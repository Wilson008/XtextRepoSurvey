/**
 * generated by Xtext 2.35.0
 */
package accessdsl.accessDsl.impl;

import accessdsl.accessDsl.AccessDslPackage;
import accessdsl.accessDsl.QueryMapping;

import jpaqldsl.jPAQLDsl.NamedQuery;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link accessdsl.accessDsl.impl.QueryMappingImpl#getNamedQuery <em>Named Query</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QueryMappingImpl extends MinimalEObjectImpl.Container implements QueryMapping
{
  /**
   * The cached value of the '{@link #getNamedQuery() <em>Named Query</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamedQuery()
   * @generated
   * @ordered
   */
  protected NamedQuery namedQuery;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QueryMappingImpl()
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
    return AccessDslPackage.Literals.QUERY_MAPPING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NamedQuery getNamedQuery()
  {
    if (namedQuery != null && namedQuery.eIsProxy())
    {
      InternalEObject oldNamedQuery = (InternalEObject)namedQuery;
      namedQuery = (NamedQuery)eResolveProxy(oldNamedQuery);
      if (namedQuery != oldNamedQuery)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AccessDslPackage.QUERY_MAPPING__NAMED_QUERY, oldNamedQuery, namedQuery));
      }
    }
    return namedQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedQuery basicGetNamedQuery()
  {
    return namedQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNamedQuery(NamedQuery newNamedQuery)
  {
    NamedQuery oldNamedQuery = namedQuery;
    namedQuery = newNamedQuery;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AccessDslPackage.QUERY_MAPPING__NAMED_QUERY, oldNamedQuery, namedQuery));
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
      case AccessDslPackage.QUERY_MAPPING__NAMED_QUERY:
        if (resolve) return getNamedQuery();
        return basicGetNamedQuery();
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
      case AccessDslPackage.QUERY_MAPPING__NAMED_QUERY:
        setNamedQuery((NamedQuery)newValue);
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
      case AccessDslPackage.QUERY_MAPPING__NAMED_QUERY:
        setNamedQuery((NamedQuery)null);
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
      case AccessDslPackage.QUERY_MAPPING__NAMED_QUERY:
        return namedQuery != null;
    }
    return super.eIsSet(featureID);
  }

} //QueryMappingImpl

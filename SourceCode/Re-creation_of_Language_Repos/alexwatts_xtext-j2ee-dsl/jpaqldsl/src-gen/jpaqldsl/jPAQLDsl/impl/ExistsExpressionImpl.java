/**
 * generated by Xtext 2.35.0
 */
package jpaqldsl.jPAQLDsl.impl;

import jpaqldsl.jPAQLDsl.ExistsExpression;
import jpaqldsl.jPAQLDsl.JPAQLDslPackage;
import jpaqldsl.jPAQLDsl.SubQuery;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exists Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jpaqldsl.jPAQLDsl.impl.ExistsExpressionImpl#getSubQuery <em>Sub Query</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExistsExpressionImpl extends MinimalEObjectImpl.Container implements ExistsExpression
{
  /**
   * The cached value of the '{@link #getSubQuery() <em>Sub Query</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubQuery()
   * @generated
   * @ordered
   */
  protected SubQuery subQuery;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExistsExpressionImpl()
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
    return JPAQLDslPackage.Literals.EXISTS_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SubQuery getSubQuery()
  {
    return subQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSubQuery(SubQuery newSubQuery, NotificationChain msgs)
  {
    SubQuery oldSubQuery = subQuery;
    subQuery = newSubQuery;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JPAQLDslPackage.EXISTS_EXPRESSION__SUB_QUERY, oldSubQuery, newSubQuery);
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
  public void setSubQuery(SubQuery newSubQuery)
  {
    if (newSubQuery != subQuery)
    {
      NotificationChain msgs = null;
      if (subQuery != null)
        msgs = ((InternalEObject)subQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JPAQLDslPackage.EXISTS_EXPRESSION__SUB_QUERY, null, msgs);
      if (newSubQuery != null)
        msgs = ((InternalEObject)newSubQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JPAQLDslPackage.EXISTS_EXPRESSION__SUB_QUERY, null, msgs);
      msgs = basicSetSubQuery(newSubQuery, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JPAQLDslPackage.EXISTS_EXPRESSION__SUB_QUERY, newSubQuery, newSubQuery));
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
      case JPAQLDslPackage.EXISTS_EXPRESSION__SUB_QUERY:
        return basicSetSubQuery(null, msgs);
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
      case JPAQLDslPackage.EXISTS_EXPRESSION__SUB_QUERY:
        return getSubQuery();
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
      case JPAQLDslPackage.EXISTS_EXPRESSION__SUB_QUERY:
        setSubQuery((SubQuery)newValue);
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
      case JPAQLDslPackage.EXISTS_EXPRESSION__SUB_QUERY:
        setSubQuery((SubQuery)null);
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
      case JPAQLDslPackage.EXISTS_EXPRESSION__SUB_QUERY:
        return subQuery != null;
    }
    return super.eIsSet(featureID);
  }

} //ExistsExpressionImpl

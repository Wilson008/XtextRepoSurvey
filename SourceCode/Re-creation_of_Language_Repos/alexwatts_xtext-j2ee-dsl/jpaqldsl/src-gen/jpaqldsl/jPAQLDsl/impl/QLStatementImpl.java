/**
 * generated by Xtext 2.35.0
 */
package jpaqldsl.jPAQLDsl.impl;

import java.util.Collection;

import jpaqldsl.jPAQLDsl.JPAQLDslPackage;
import jpaqldsl.jPAQLDsl.QLStatement;
import jpaqldsl.jPAQLDsl.SelectStatement;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QL Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jpaqldsl.jPAQLDsl.impl.QLStatementImpl#getSelectStatements <em>Select Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QLStatementImpl extends MinimalEObjectImpl.Container implements QLStatement
{
  /**
   * The cached value of the '{@link #getSelectStatements() <em>Select Statements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelectStatements()
   * @generated
   * @ordered
   */
  protected EList<SelectStatement> selectStatements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QLStatementImpl()
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
    return JPAQLDslPackage.Literals.QL_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<SelectStatement> getSelectStatements()
  {
    if (selectStatements == null)
    {
      selectStatements = new EObjectContainmentEList<SelectStatement>(SelectStatement.class, this, JPAQLDslPackage.QL_STATEMENT__SELECT_STATEMENTS);
    }
    return selectStatements;
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
      case JPAQLDslPackage.QL_STATEMENT__SELECT_STATEMENTS:
        return ((InternalEList<?>)getSelectStatements()).basicRemove(otherEnd, msgs);
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
      case JPAQLDslPackage.QL_STATEMENT__SELECT_STATEMENTS:
        return getSelectStatements();
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
      case JPAQLDslPackage.QL_STATEMENT__SELECT_STATEMENTS:
        getSelectStatements().clear();
        getSelectStatements().addAll((Collection<? extends SelectStatement>)newValue);
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
      case JPAQLDslPackage.QL_STATEMENT__SELECT_STATEMENTS:
        getSelectStatements().clear();
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
      case JPAQLDslPackage.QL_STATEMENT__SELECT_STATEMENTS:
        return selectStatements != null && !selectStatements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //QLStatementImpl

/**
 * generated by Xtext 2.35.0
 */
package de.sos.etj.eTJ.impl;

import de.sos.etj.eTJ.ColumnId;
import de.sos.etj.eTJ.ETJPackage;
import de.sos.etj.eTJ.LogicalFlagExpression;
import de.sos.etj.eTJ.Scenario;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Flag Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.impl.LogicalFlagExpressionImpl#getScenario <em>Scenario</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.impl.LogicalFlagExpressionImpl#getColumId <em>Colum Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogicalFlagExpressionImpl extends LogicalExpressionImpl implements LogicalFlagExpression
{
  /**
   * The cached value of the '{@link #getScenario() <em>Scenario</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScenario()
   * @generated
   * @ordered
   */
  protected Scenario scenario;

  /**
   * The default value of the '{@link #getColumId() <em>Colum Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumId()
   * @generated
   * @ordered
   */
  protected static final ColumnId COLUM_ID_EDEFAULT = ColumnId.ACTIVETASKS;

  /**
   * The cached value of the '{@link #getColumId() <em>Colum Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumId()
   * @generated
   * @ordered
   */
  protected ColumnId columId = COLUM_ID_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LogicalFlagExpressionImpl()
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
    return ETJPackage.eINSTANCE.getLogicalFlagExpression();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Scenario getScenario()
  {
    if (scenario != null && scenario.eIsProxy())
    {
      InternalEObject oldScenario = (InternalEObject)scenario;
      scenario = (Scenario)eResolveProxy(oldScenario);
      if (scenario != oldScenario)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ETJPackage.LOGICAL_FLAG_EXPRESSION__SCENARIO, oldScenario, scenario));
      }
    }
    return scenario;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Scenario basicGetScenario()
  {
    return scenario;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setScenario(Scenario newScenario)
  {
    Scenario oldScenario = scenario;
    scenario = newScenario;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ETJPackage.LOGICAL_FLAG_EXPRESSION__SCENARIO, oldScenario, scenario));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ColumnId getColumId()
  {
    return columId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setColumId(ColumnId newColumId)
  {
    ColumnId oldColumId = columId;
    columId = newColumId == null ? COLUM_ID_EDEFAULT : newColumId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ETJPackage.LOGICAL_FLAG_EXPRESSION__COLUM_ID, oldColumId, columId));
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
      case ETJPackage.LOGICAL_FLAG_EXPRESSION__SCENARIO:
        if (resolve) return getScenario();
        return basicGetScenario();
      case ETJPackage.LOGICAL_FLAG_EXPRESSION__COLUM_ID:
        return getColumId();
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
      case ETJPackage.LOGICAL_FLAG_EXPRESSION__SCENARIO:
        setScenario((Scenario)newValue);
        return;
      case ETJPackage.LOGICAL_FLAG_EXPRESSION__COLUM_ID:
        setColumId((ColumnId)newValue);
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
      case ETJPackage.LOGICAL_FLAG_EXPRESSION__SCENARIO:
        setScenario((Scenario)null);
        return;
      case ETJPackage.LOGICAL_FLAG_EXPRESSION__COLUM_ID:
        setColumId(COLUM_ID_EDEFAULT);
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
      case ETJPackage.LOGICAL_FLAG_EXPRESSION__SCENARIO:
        return scenario != null;
      case ETJPackage.LOGICAL_FLAG_EXPRESSION__COLUM_ID:
        return columId != COLUM_ID_EDEFAULT;
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
    result.append(" (columId: ");
    result.append(columId);
    result.append(')');
    return result.toString();
  }

} //LogicalFlagExpressionImpl

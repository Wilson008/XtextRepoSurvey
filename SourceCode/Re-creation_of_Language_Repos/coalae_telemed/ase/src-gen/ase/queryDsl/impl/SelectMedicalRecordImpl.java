/**
 * generated by Xtext 2.35.0
 */
package ase.queryDsl.impl;

import ase.queryDsl.QueryDslPackage;
import ase.queryDsl.SelectMedicalRecord;
import ase.queryDsl.VariableMedicalRecord;
import ase.queryDsl.WhereMedicalRecord;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Select Medical Record</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ase.queryDsl.impl.SelectMedicalRecordImpl#getVariableMedicalRecord <em>Variable Medical Record</em>}</li>
 *   <li>{@link ase.queryDsl.impl.SelectMedicalRecordImpl#getVariableMedicalRecordNext <em>Variable Medical Record Next</em>}</li>
 *   <li>{@link ase.queryDsl.impl.SelectMedicalRecordImpl#getWhere <em>Where</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectMedicalRecordImpl extends SelectImpl implements SelectMedicalRecord
{
  /**
   * The cached value of the '{@link #getVariableMedicalRecord() <em>Variable Medical Record</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableMedicalRecord()
   * @generated
   * @ordered
   */
  protected EList<VariableMedicalRecord> variableMedicalRecord;

  /**
   * The cached value of the '{@link #getVariableMedicalRecordNext() <em>Variable Medical Record Next</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableMedicalRecordNext()
   * @generated
   * @ordered
   */
  protected EList<VariableMedicalRecord> variableMedicalRecordNext;

  /**
   * The cached value of the '{@link #getWhere() <em>Where</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhere()
   * @generated
   * @ordered
   */
  protected EList<WhereMedicalRecord> where;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SelectMedicalRecordImpl()
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
    return QueryDslPackage.Literals.SELECT_MEDICAL_RECORD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<VariableMedicalRecord> getVariableMedicalRecord()
  {
    if (variableMedicalRecord == null)
    {
      variableMedicalRecord = new EDataTypeEList<VariableMedicalRecord>(VariableMedicalRecord.class, this, QueryDslPackage.SELECT_MEDICAL_RECORD__VARIABLE_MEDICAL_RECORD);
    }
    return variableMedicalRecord;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<VariableMedicalRecord> getVariableMedicalRecordNext()
  {
    if (variableMedicalRecordNext == null)
    {
      variableMedicalRecordNext = new EDataTypeEList<VariableMedicalRecord>(VariableMedicalRecord.class, this, QueryDslPackage.SELECT_MEDICAL_RECORD__VARIABLE_MEDICAL_RECORD_NEXT);
    }
    return variableMedicalRecordNext;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<WhereMedicalRecord> getWhere()
  {
    if (where == null)
    {
      where = new EObjectContainmentEList<WhereMedicalRecord>(WhereMedicalRecord.class, this, QueryDslPackage.SELECT_MEDICAL_RECORD__WHERE);
    }
    return where;
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
      case QueryDslPackage.SELECT_MEDICAL_RECORD__WHERE:
        return ((InternalEList<?>)getWhere()).basicRemove(otherEnd, msgs);
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
      case QueryDslPackage.SELECT_MEDICAL_RECORD__VARIABLE_MEDICAL_RECORD:
        return getVariableMedicalRecord();
      case QueryDslPackage.SELECT_MEDICAL_RECORD__VARIABLE_MEDICAL_RECORD_NEXT:
        return getVariableMedicalRecordNext();
      case QueryDslPackage.SELECT_MEDICAL_RECORD__WHERE:
        return getWhere();
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
      case QueryDslPackage.SELECT_MEDICAL_RECORD__VARIABLE_MEDICAL_RECORD:
        getVariableMedicalRecord().clear();
        getVariableMedicalRecord().addAll((Collection<? extends VariableMedicalRecord>)newValue);
        return;
      case QueryDslPackage.SELECT_MEDICAL_RECORD__VARIABLE_MEDICAL_RECORD_NEXT:
        getVariableMedicalRecordNext().clear();
        getVariableMedicalRecordNext().addAll((Collection<? extends VariableMedicalRecord>)newValue);
        return;
      case QueryDslPackage.SELECT_MEDICAL_RECORD__WHERE:
        getWhere().clear();
        getWhere().addAll((Collection<? extends WhereMedicalRecord>)newValue);
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
      case QueryDslPackage.SELECT_MEDICAL_RECORD__VARIABLE_MEDICAL_RECORD:
        getVariableMedicalRecord().clear();
        return;
      case QueryDslPackage.SELECT_MEDICAL_RECORD__VARIABLE_MEDICAL_RECORD_NEXT:
        getVariableMedicalRecordNext().clear();
        return;
      case QueryDslPackage.SELECT_MEDICAL_RECORD__WHERE:
        getWhere().clear();
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
      case QueryDslPackage.SELECT_MEDICAL_RECORD__VARIABLE_MEDICAL_RECORD:
        return variableMedicalRecord != null && !variableMedicalRecord.isEmpty();
      case QueryDslPackage.SELECT_MEDICAL_RECORD__VARIABLE_MEDICAL_RECORD_NEXT:
        return variableMedicalRecordNext != null && !variableMedicalRecordNext.isEmpty();
      case QueryDslPackage.SELECT_MEDICAL_RECORD__WHERE:
        return where != null && !where.isEmpty();
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
    result.append(" (variableMedicalRecord: ");
    result.append(variableMedicalRecord);
    result.append(", variableMedicalRecordNext: ");
    result.append(variableMedicalRecordNext);
    result.append(')');
    return result.toString();
  }

} //SelectMedicalRecordImpl

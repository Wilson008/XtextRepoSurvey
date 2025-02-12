/**
 * generated by Xtext 2.35.0
 */
package ase.queryDsl.impl;

import ase.queryDsl.QueryDslPackage;
import ase.queryDsl.WherePrescription;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Where Prescription</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ase.queryDsl.impl.WherePrescriptionImpl#getPrescriptionId <em>Prescription Id</em>}</li>
 *   <li>{@link ase.queryDsl.impl.WherePrescriptionImpl#getRecordId <em>Record Id</em>}</li>
 *   <li>{@link ase.queryDsl.impl.WherePrescriptionImpl#getMedicationName <em>Medication Name</em>}</li>
 *   <li>{@link ase.queryDsl.impl.WherePrescriptionImpl#getStart <em>Start</em>}</li>
 *   <li>{@link ase.queryDsl.impl.WherePrescriptionImpl#getEnd <em>End</em>}</li>
 *   <li>{@link ase.queryDsl.impl.WherePrescriptionImpl#getOrdered <em>Ordered</em>}</li>
 *   <li>{@link ase.queryDsl.impl.WherePrescriptionImpl#getPrice <em>Price</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WherePrescriptionImpl extends MinimalEObjectImpl.Container implements WherePrescription
{
  /**
   * The cached value of the '{@link #getPrescriptionId() <em>Prescription Id</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrescriptionId()
   * @generated
   * @ordered
   */
  protected EList<Integer> prescriptionId;

  /**
   * The cached value of the '{@link #getRecordId() <em>Record Id</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecordId()
   * @generated
   * @ordered
   */
  protected EList<Integer> recordId;

  /**
   * The cached value of the '{@link #getMedicationName() <em>Medication Name</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMedicationName()
   * @generated
   * @ordered
   */
  protected EList<String> medicationName;

  /**
   * The cached value of the '{@link #getStart() <em>Start</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStart()
   * @generated
   * @ordered
   */
  protected EList<String> start;

  /**
   * The cached value of the '{@link #getEnd() <em>End</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnd()
   * @generated
   * @ordered
   */
  protected EList<String> end;

  /**
   * The cached value of the '{@link #getOrdered() <em>Ordered</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrdered()
   * @generated
   * @ordered
   */
  protected EList<String> ordered;

  /**
   * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrice()
   * @generated
   * @ordered
   */
  protected EList<String> price;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WherePrescriptionImpl()
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
    return QueryDslPackage.Literals.WHERE_PRESCRIPTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Integer> getPrescriptionId()
  {
    if (prescriptionId == null)
    {
      prescriptionId = new EDataTypeEList<Integer>(Integer.class, this, QueryDslPackage.WHERE_PRESCRIPTION__PRESCRIPTION_ID);
    }
    return prescriptionId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Integer> getRecordId()
  {
    if (recordId == null)
    {
      recordId = new EDataTypeEList<Integer>(Integer.class, this, QueryDslPackage.WHERE_PRESCRIPTION__RECORD_ID);
    }
    return recordId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getMedicationName()
  {
    if (medicationName == null)
    {
      medicationName = new EDataTypeEList<String>(String.class, this, QueryDslPackage.WHERE_PRESCRIPTION__MEDICATION_NAME);
    }
    return medicationName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getStart()
  {
    if (start == null)
    {
      start = new EDataTypeEList<String>(String.class, this, QueryDslPackage.WHERE_PRESCRIPTION__START);
    }
    return start;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getEnd()
  {
    if (end == null)
    {
      end = new EDataTypeEList<String>(String.class, this, QueryDslPackage.WHERE_PRESCRIPTION__END);
    }
    return end;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getOrdered()
  {
    if (ordered == null)
    {
      ordered = new EDataTypeEList<String>(String.class, this, QueryDslPackage.WHERE_PRESCRIPTION__ORDERED);
    }
    return ordered;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getPrice()
  {
    if (price == null)
    {
      price = new EDataTypeEList<String>(String.class, this, QueryDslPackage.WHERE_PRESCRIPTION__PRICE);
    }
    return price;
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
      case QueryDslPackage.WHERE_PRESCRIPTION__PRESCRIPTION_ID:
        return getPrescriptionId();
      case QueryDslPackage.WHERE_PRESCRIPTION__RECORD_ID:
        return getRecordId();
      case QueryDslPackage.WHERE_PRESCRIPTION__MEDICATION_NAME:
        return getMedicationName();
      case QueryDslPackage.WHERE_PRESCRIPTION__START:
        return getStart();
      case QueryDslPackage.WHERE_PRESCRIPTION__END:
        return getEnd();
      case QueryDslPackage.WHERE_PRESCRIPTION__ORDERED:
        return getOrdered();
      case QueryDslPackage.WHERE_PRESCRIPTION__PRICE:
        return getPrice();
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
      case QueryDslPackage.WHERE_PRESCRIPTION__PRESCRIPTION_ID:
        getPrescriptionId().clear();
        getPrescriptionId().addAll((Collection<? extends Integer>)newValue);
        return;
      case QueryDslPackage.WHERE_PRESCRIPTION__RECORD_ID:
        getRecordId().clear();
        getRecordId().addAll((Collection<? extends Integer>)newValue);
        return;
      case QueryDslPackage.WHERE_PRESCRIPTION__MEDICATION_NAME:
        getMedicationName().clear();
        getMedicationName().addAll((Collection<? extends String>)newValue);
        return;
      case QueryDslPackage.WHERE_PRESCRIPTION__START:
        getStart().clear();
        getStart().addAll((Collection<? extends String>)newValue);
        return;
      case QueryDslPackage.WHERE_PRESCRIPTION__END:
        getEnd().clear();
        getEnd().addAll((Collection<? extends String>)newValue);
        return;
      case QueryDslPackage.WHERE_PRESCRIPTION__ORDERED:
        getOrdered().clear();
        getOrdered().addAll((Collection<? extends String>)newValue);
        return;
      case QueryDslPackage.WHERE_PRESCRIPTION__PRICE:
        getPrice().clear();
        getPrice().addAll((Collection<? extends String>)newValue);
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
      case QueryDslPackage.WHERE_PRESCRIPTION__PRESCRIPTION_ID:
        getPrescriptionId().clear();
        return;
      case QueryDslPackage.WHERE_PRESCRIPTION__RECORD_ID:
        getRecordId().clear();
        return;
      case QueryDslPackage.WHERE_PRESCRIPTION__MEDICATION_NAME:
        getMedicationName().clear();
        return;
      case QueryDslPackage.WHERE_PRESCRIPTION__START:
        getStart().clear();
        return;
      case QueryDslPackage.WHERE_PRESCRIPTION__END:
        getEnd().clear();
        return;
      case QueryDslPackage.WHERE_PRESCRIPTION__ORDERED:
        getOrdered().clear();
        return;
      case QueryDslPackage.WHERE_PRESCRIPTION__PRICE:
        getPrice().clear();
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
      case QueryDslPackage.WHERE_PRESCRIPTION__PRESCRIPTION_ID:
        return prescriptionId != null && !prescriptionId.isEmpty();
      case QueryDslPackage.WHERE_PRESCRIPTION__RECORD_ID:
        return recordId != null && !recordId.isEmpty();
      case QueryDslPackage.WHERE_PRESCRIPTION__MEDICATION_NAME:
        return medicationName != null && !medicationName.isEmpty();
      case QueryDslPackage.WHERE_PRESCRIPTION__START:
        return start != null && !start.isEmpty();
      case QueryDslPackage.WHERE_PRESCRIPTION__END:
        return end != null && !end.isEmpty();
      case QueryDslPackage.WHERE_PRESCRIPTION__ORDERED:
        return ordered != null && !ordered.isEmpty();
      case QueryDslPackage.WHERE_PRESCRIPTION__PRICE:
        return price != null && !price.isEmpty();
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
    result.append(" (prescriptionId: ");
    result.append(prescriptionId);
    result.append(", recordId: ");
    result.append(recordId);
    result.append(", medicationName: ");
    result.append(medicationName);
    result.append(", start: ");
    result.append(start);
    result.append(", end: ");
    result.append(end);
    result.append(", ordered: ");
    result.append(ordered);
    result.append(", price: ");
    result.append(price);
    result.append(')');
    return result.toString();
  }

} //WherePrescriptionImpl

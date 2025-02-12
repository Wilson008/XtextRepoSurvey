/**
 * generated by Xtext 2.35.0
 */
package org.tvtower.db.database.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.tvtower.db.database.DatabasePackage;
import org.tvtower.db.database.InsignificantPeople;
import org.tvtower.db.database.Person;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Insignificant People</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.tvtower.db.database.impl.InsignificantPeopleImpl#getPersons <em>Persons</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InsignificantPeopleImpl extends DefinitionImpl implements InsignificantPeople
{
  /**
   * The cached value of the '{@link #getPersons() <em>Persons</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPersons()
   * @generated
   * @ordered
   */
  protected EList<Person> persons;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InsignificantPeopleImpl()
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
    return DatabasePackage.Literals.INSIGNIFICANT_PEOPLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Person> getPersons()
  {
    if (persons == null)
    {
      persons = new EObjectContainmentEList<Person>(Person.class, this, DatabasePackage.INSIGNIFICANT_PEOPLE__PERSONS);
    }
    return persons;
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
      case DatabasePackage.INSIGNIFICANT_PEOPLE__PERSONS:
        return ((InternalEList<?>)getPersons()).basicRemove(otherEnd, msgs);
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
      case DatabasePackage.INSIGNIFICANT_PEOPLE__PERSONS:
        return getPersons();
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
      case DatabasePackage.INSIGNIFICANT_PEOPLE__PERSONS:
        getPersons().clear();
        getPersons().addAll((Collection<? extends Person>)newValue);
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
      case DatabasePackage.INSIGNIFICANT_PEOPLE__PERSONS:
        getPersons().clear();
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
      case DatabasePackage.INSIGNIFICANT_PEOPLE__PERSONS:
        return persons != null && !persons.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //InsignificantPeopleImpl

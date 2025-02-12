/**
 * generated by Xtext 2.35.0
 */
package org.tvtower.db.database.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.tvtower.db.database.DatabasePackage;
import org.tvtower.db.database.Person;
import org.tvtower.db.database.PersonLocale;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person Locale</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.tvtower.db.database.impl.PersonLocaleImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link org.tvtower.db.database.impl.PersonLocaleImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link org.tvtower.db.database.impl.PersonLocaleImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link org.tvtower.db.database.impl.PersonLocaleImpl#getNickName <em>Nick Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonLocaleImpl extends MinimalEObjectImpl.Container implements PersonLocale
{
  /**
   * The cached value of the '{@link #getPerson() <em>Person</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPerson()
   * @generated
   * @ordered
   */
  protected Person person;

  /**
   * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstName()
   * @generated
   * @ordered
   */
  protected static final String FIRST_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstName()
   * @generated
   * @ordered
   */
  protected String firstName = FIRST_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLastName()
   * @generated
   * @ordered
   */
  protected static final String LAST_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLastName()
   * @generated
   * @ordered
   */
  protected String lastName = LAST_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getNickName() <em>Nick Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNickName()
   * @generated
   * @ordered
   */
  protected static final String NICK_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNickName() <em>Nick Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNickName()
   * @generated
   * @ordered
   */
  protected String nickName = NICK_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PersonLocaleImpl()
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
    return DatabasePackage.Literals.PERSON_LOCALE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Person getPerson()
  {
    if (person != null && person.eIsProxy())
    {
      InternalEObject oldPerson = (InternalEObject)person;
      person = (Person)eResolveProxy(oldPerson);
      if (person != oldPerson)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatabasePackage.PERSON_LOCALE__PERSON, oldPerson, person));
      }
    }
    return person;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Person basicGetPerson()
  {
    return person;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPerson(Person newPerson)
  {
    Person oldPerson = person;
    person = newPerson;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DatabasePackage.PERSON_LOCALE__PERSON, oldPerson, person));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getFirstName()
  {
    return firstName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFirstName(String newFirstName)
  {
    String oldFirstName = firstName;
    firstName = newFirstName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DatabasePackage.PERSON_LOCALE__FIRST_NAME, oldFirstName, firstName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLastName()
  {
    return lastName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLastName(String newLastName)
  {
    String oldLastName = lastName;
    lastName = newLastName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DatabasePackage.PERSON_LOCALE__LAST_NAME, oldLastName, lastName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getNickName()
  {
    return nickName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNickName(String newNickName)
  {
    String oldNickName = nickName;
    nickName = newNickName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DatabasePackage.PERSON_LOCALE__NICK_NAME, oldNickName, nickName));
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
      case DatabasePackage.PERSON_LOCALE__PERSON:
        if (resolve) return getPerson();
        return basicGetPerson();
      case DatabasePackage.PERSON_LOCALE__FIRST_NAME:
        return getFirstName();
      case DatabasePackage.PERSON_LOCALE__LAST_NAME:
        return getLastName();
      case DatabasePackage.PERSON_LOCALE__NICK_NAME:
        return getNickName();
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
      case DatabasePackage.PERSON_LOCALE__PERSON:
        setPerson((Person)newValue);
        return;
      case DatabasePackage.PERSON_LOCALE__FIRST_NAME:
        setFirstName((String)newValue);
        return;
      case DatabasePackage.PERSON_LOCALE__LAST_NAME:
        setLastName((String)newValue);
        return;
      case DatabasePackage.PERSON_LOCALE__NICK_NAME:
        setNickName((String)newValue);
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
      case DatabasePackage.PERSON_LOCALE__PERSON:
        setPerson((Person)null);
        return;
      case DatabasePackage.PERSON_LOCALE__FIRST_NAME:
        setFirstName(FIRST_NAME_EDEFAULT);
        return;
      case DatabasePackage.PERSON_LOCALE__LAST_NAME:
        setLastName(LAST_NAME_EDEFAULT);
        return;
      case DatabasePackage.PERSON_LOCALE__NICK_NAME:
        setNickName(NICK_NAME_EDEFAULT);
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
      case DatabasePackage.PERSON_LOCALE__PERSON:
        return person != null;
      case DatabasePackage.PERSON_LOCALE__FIRST_NAME:
        return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
      case DatabasePackage.PERSON_LOCALE__LAST_NAME:
        return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
      case DatabasePackage.PERSON_LOCALE__NICK_NAME:
        return NICK_NAME_EDEFAULT == null ? nickName != null : !NICK_NAME_EDEFAULT.equals(nickName);
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
    result.append(" (firstName: ");
    result.append(firstName);
    result.append(", lastName: ");
    result.append(lastName);
    result.append(", nickName: ");
    result.append(nickName);
    result.append(')');
    return result.toString();
  }

} //PersonLocaleImpl

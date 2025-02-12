/**
 * generated by Xtext 2.35.0
 */
package org.tvtower.db.database.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.tvtower.db.database.DatabasePackage;
import org.tvtower.db.database.ProgrammeRole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Programme Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.tvtower.db.database.impl.ProgrammeRoleImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.tvtower.db.database.impl.ProgrammeRoleImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link org.tvtower.db.database.impl.ProgrammeRoleImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link org.tvtower.db.database.impl.ProgrammeRoleImpl#getFirstNameOriginal <em>First Name Original</em>}</li>
 *   <li>{@link org.tvtower.db.database.impl.ProgrammeRoleImpl#getLastNameOriginal <em>Last Name Original</em>}</li>
 *   <li>{@link org.tvtower.db.database.impl.ProgrammeRoleImpl#getNickName <em>Nick Name</em>}</li>
 *   <li>{@link org.tvtower.db.database.impl.ProgrammeRoleImpl#getNickNameOriginal <em>Nick Name Original</em>}</li>
 *   <li>{@link org.tvtower.db.database.impl.ProgrammeRoleImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.tvtower.db.database.impl.ProgrammeRoleImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link org.tvtower.db.database.impl.ProgrammeRoleImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.tvtower.db.database.impl.ProgrammeRoleImpl#getGender <em>Gender</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgrammeRoleImpl extends MinimalEObjectImpl.Container implements ProgrammeRole
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

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
   * The default value of the '{@link #getFirstNameOriginal() <em>First Name Original</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstNameOriginal()
   * @generated
   * @ordered
   */
  protected static final String FIRST_NAME_ORIGINAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFirstNameOriginal() <em>First Name Original</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstNameOriginal()
   * @generated
   * @ordered
   */
  protected String firstNameOriginal = FIRST_NAME_ORIGINAL_EDEFAULT;

  /**
   * The default value of the '{@link #getLastNameOriginal() <em>Last Name Original</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLastNameOriginal()
   * @generated
   * @ordered
   */
  protected static final String LAST_NAME_ORIGINAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLastNameOriginal() <em>Last Name Original</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLastNameOriginal()
   * @generated
   * @ordered
   */
  protected String lastNameOriginal = LAST_NAME_ORIGINAL_EDEFAULT;

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
   * The default value of the '{@link #getNickNameOriginal() <em>Nick Name Original</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNickNameOriginal()
   * @generated
   * @ordered
   */
  protected static final String NICK_NAME_ORIGINAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNickNameOriginal() <em>Nick Name Original</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNickNameOriginal()
   * @generated
   * @ordered
   */
  protected String nickNameOriginal = NICK_NAME_ORIGINAL_EDEFAULT;

  /**
   * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected static final String TITLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected String title = TITLE_EDEFAULT;

  /**
   * The default value of the '{@link #getCountry() <em>Country</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCountry()
   * @generated
   * @ordered
   */
  protected static final String COUNTRY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCountry() <em>Country</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCountry()
   * @generated
   * @ordered
   */
  protected String country = COUNTRY_EDEFAULT;

  /**
   * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComment()
   * @generated
   * @ordered
   */
  protected static final String COMMENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComment()
   * @generated
   * @ordered
   */
  protected String comment = COMMENT_EDEFAULT;

  /**
   * The default value of the '{@link #getGender() <em>Gender</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGender()
   * @generated
   * @ordered
   */
  protected static final String GENDER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGender() <em>Gender</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGender()
   * @generated
   * @ordered
   */
  protected String gender = GENDER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProgrammeRoleImpl()
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
    return DatabasePackage.Literals.PROGRAMME_ROLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DatabasePackage.PROGRAMME_ROLE__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DatabasePackage.PROGRAMME_ROLE__FIRST_NAME, oldFirstName, firstName));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DatabasePackage.PROGRAMME_ROLE__LAST_NAME, oldLastName, lastName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getFirstNameOriginal()
  {
    return firstNameOriginal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFirstNameOriginal(String newFirstNameOriginal)
  {
    String oldFirstNameOriginal = firstNameOriginal;
    firstNameOriginal = newFirstNameOriginal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DatabasePackage.PROGRAMME_ROLE__FIRST_NAME_ORIGINAL, oldFirstNameOriginal, firstNameOriginal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLastNameOriginal()
  {
    return lastNameOriginal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLastNameOriginal(String newLastNameOriginal)
  {
    String oldLastNameOriginal = lastNameOriginal;
    lastNameOriginal = newLastNameOriginal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DatabasePackage.PROGRAMME_ROLE__LAST_NAME_ORIGINAL, oldLastNameOriginal, lastNameOriginal));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DatabasePackage.PROGRAMME_ROLE__NICK_NAME, oldNickName, nickName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getNickNameOriginal()
  {
    return nickNameOriginal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNickNameOriginal(String newNickNameOriginal)
  {
    String oldNickNameOriginal = nickNameOriginal;
    nickNameOriginal = newNickNameOriginal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DatabasePackage.PROGRAMME_ROLE__NICK_NAME_ORIGINAL, oldNickNameOriginal, nickNameOriginal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getTitle()
  {
    return title;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTitle(String newTitle)
  {
    String oldTitle = title;
    title = newTitle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DatabasePackage.PROGRAMME_ROLE__TITLE, oldTitle, title));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCountry()
  {
    return country;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCountry(String newCountry)
  {
    String oldCountry = country;
    country = newCountry;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DatabasePackage.PROGRAMME_ROLE__COUNTRY, oldCountry, country));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getComment()
  {
    return comment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setComment(String newComment)
  {
    String oldComment = comment;
    comment = newComment;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DatabasePackage.PROGRAMME_ROLE__COMMENT, oldComment, comment));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getGender()
  {
    return gender;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setGender(String newGender)
  {
    String oldGender = gender;
    gender = newGender;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DatabasePackage.PROGRAMME_ROLE__GENDER, oldGender, gender));
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
      case DatabasePackage.PROGRAMME_ROLE__NAME:
        return getName();
      case DatabasePackage.PROGRAMME_ROLE__FIRST_NAME:
        return getFirstName();
      case DatabasePackage.PROGRAMME_ROLE__LAST_NAME:
        return getLastName();
      case DatabasePackage.PROGRAMME_ROLE__FIRST_NAME_ORIGINAL:
        return getFirstNameOriginal();
      case DatabasePackage.PROGRAMME_ROLE__LAST_NAME_ORIGINAL:
        return getLastNameOriginal();
      case DatabasePackage.PROGRAMME_ROLE__NICK_NAME:
        return getNickName();
      case DatabasePackage.PROGRAMME_ROLE__NICK_NAME_ORIGINAL:
        return getNickNameOriginal();
      case DatabasePackage.PROGRAMME_ROLE__TITLE:
        return getTitle();
      case DatabasePackage.PROGRAMME_ROLE__COUNTRY:
        return getCountry();
      case DatabasePackage.PROGRAMME_ROLE__COMMENT:
        return getComment();
      case DatabasePackage.PROGRAMME_ROLE__GENDER:
        return getGender();
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
      case DatabasePackage.PROGRAMME_ROLE__NAME:
        setName((String)newValue);
        return;
      case DatabasePackage.PROGRAMME_ROLE__FIRST_NAME:
        setFirstName((String)newValue);
        return;
      case DatabasePackage.PROGRAMME_ROLE__LAST_NAME:
        setLastName((String)newValue);
        return;
      case DatabasePackage.PROGRAMME_ROLE__FIRST_NAME_ORIGINAL:
        setFirstNameOriginal((String)newValue);
        return;
      case DatabasePackage.PROGRAMME_ROLE__LAST_NAME_ORIGINAL:
        setLastNameOriginal((String)newValue);
        return;
      case DatabasePackage.PROGRAMME_ROLE__NICK_NAME:
        setNickName((String)newValue);
        return;
      case DatabasePackage.PROGRAMME_ROLE__NICK_NAME_ORIGINAL:
        setNickNameOriginal((String)newValue);
        return;
      case DatabasePackage.PROGRAMME_ROLE__TITLE:
        setTitle((String)newValue);
        return;
      case DatabasePackage.PROGRAMME_ROLE__COUNTRY:
        setCountry((String)newValue);
        return;
      case DatabasePackage.PROGRAMME_ROLE__COMMENT:
        setComment((String)newValue);
        return;
      case DatabasePackage.PROGRAMME_ROLE__GENDER:
        setGender((String)newValue);
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
      case DatabasePackage.PROGRAMME_ROLE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DatabasePackage.PROGRAMME_ROLE__FIRST_NAME:
        setFirstName(FIRST_NAME_EDEFAULT);
        return;
      case DatabasePackage.PROGRAMME_ROLE__LAST_NAME:
        setLastName(LAST_NAME_EDEFAULT);
        return;
      case DatabasePackage.PROGRAMME_ROLE__FIRST_NAME_ORIGINAL:
        setFirstNameOriginal(FIRST_NAME_ORIGINAL_EDEFAULT);
        return;
      case DatabasePackage.PROGRAMME_ROLE__LAST_NAME_ORIGINAL:
        setLastNameOriginal(LAST_NAME_ORIGINAL_EDEFAULT);
        return;
      case DatabasePackage.PROGRAMME_ROLE__NICK_NAME:
        setNickName(NICK_NAME_EDEFAULT);
        return;
      case DatabasePackage.PROGRAMME_ROLE__NICK_NAME_ORIGINAL:
        setNickNameOriginal(NICK_NAME_ORIGINAL_EDEFAULT);
        return;
      case DatabasePackage.PROGRAMME_ROLE__TITLE:
        setTitle(TITLE_EDEFAULT);
        return;
      case DatabasePackage.PROGRAMME_ROLE__COUNTRY:
        setCountry(COUNTRY_EDEFAULT);
        return;
      case DatabasePackage.PROGRAMME_ROLE__COMMENT:
        setComment(COMMENT_EDEFAULT);
        return;
      case DatabasePackage.PROGRAMME_ROLE__GENDER:
        setGender(GENDER_EDEFAULT);
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
      case DatabasePackage.PROGRAMME_ROLE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DatabasePackage.PROGRAMME_ROLE__FIRST_NAME:
        return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
      case DatabasePackage.PROGRAMME_ROLE__LAST_NAME:
        return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
      case DatabasePackage.PROGRAMME_ROLE__FIRST_NAME_ORIGINAL:
        return FIRST_NAME_ORIGINAL_EDEFAULT == null ? firstNameOriginal != null : !FIRST_NAME_ORIGINAL_EDEFAULT.equals(firstNameOriginal);
      case DatabasePackage.PROGRAMME_ROLE__LAST_NAME_ORIGINAL:
        return LAST_NAME_ORIGINAL_EDEFAULT == null ? lastNameOriginal != null : !LAST_NAME_ORIGINAL_EDEFAULT.equals(lastNameOriginal);
      case DatabasePackage.PROGRAMME_ROLE__NICK_NAME:
        return NICK_NAME_EDEFAULT == null ? nickName != null : !NICK_NAME_EDEFAULT.equals(nickName);
      case DatabasePackage.PROGRAMME_ROLE__NICK_NAME_ORIGINAL:
        return NICK_NAME_ORIGINAL_EDEFAULT == null ? nickNameOriginal != null : !NICK_NAME_ORIGINAL_EDEFAULT.equals(nickNameOriginal);
      case DatabasePackage.PROGRAMME_ROLE__TITLE:
        return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
      case DatabasePackage.PROGRAMME_ROLE__COUNTRY:
        return COUNTRY_EDEFAULT == null ? country != null : !COUNTRY_EDEFAULT.equals(country);
      case DatabasePackage.PROGRAMME_ROLE__COMMENT:
        return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
      case DatabasePackage.PROGRAMME_ROLE__GENDER:
        return GENDER_EDEFAULT == null ? gender != null : !GENDER_EDEFAULT.equals(gender);
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
    result.append(" (name: ");
    result.append(name);
    result.append(", firstName: ");
    result.append(firstName);
    result.append(", lastName: ");
    result.append(lastName);
    result.append(", firstNameOriginal: ");
    result.append(firstNameOriginal);
    result.append(", lastNameOriginal: ");
    result.append(lastNameOriginal);
    result.append(", nickName: ");
    result.append(nickName);
    result.append(", nickNameOriginal: ");
    result.append(nickNameOriginal);
    result.append(", title: ");
    result.append(title);
    result.append(", country: ");
    result.append(country);
    result.append(", comment: ");
    result.append(comment);
    result.append(", gender: ");
    result.append(gender);
    result.append(')');
    return result.toString();
  }

} //ProgrammeRoleImpl

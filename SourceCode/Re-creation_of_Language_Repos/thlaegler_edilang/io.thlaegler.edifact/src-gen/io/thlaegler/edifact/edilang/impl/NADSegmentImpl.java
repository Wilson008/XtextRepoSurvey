/**
 * generated by Xtext 2.35.0
 */
package io.thlaegler.edifact.edilang.impl;

import io.thlaegler.edifact.edilang.CountrySubEntityDetail;
import io.thlaegler.edifact.edilang.EdilangPackage;
import io.thlaegler.edifact.edilang.NADSegment;
import io.thlaegler.edifact.edilang.NameAndAddress;
import io.thlaegler.edifact.edilang.PartyIdentificationDetail;
import io.thlaegler.edifact.edilang.PartyName;
import io.thlaegler.edifact.edilang.Street;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NAD Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.NADSegmentImpl#getPartyFunctionCodeQualifier <em>Party Function Code Qualifier</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.NADSegmentImpl#getPartyIdentificationDetails <em>Party Identification Details</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.NADSegmentImpl#getNameAndAddress <em>Name And Address</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.NADSegmentImpl#getPartyName <em>Party Name</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.NADSegmentImpl#getStreet <em>Street</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.NADSegmentImpl#getCityName <em>City Name</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.NADSegmentImpl#getCountrySubEntityDetails <em>Country Sub Entity Details</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.NADSegmentImpl#getPostalIdentificationCode <em>Postal Identification Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.impl.NADSegmentImpl#getCountryNameCode <em>Country Name Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NADSegmentImpl extends AbstractEdiSegmentImpl implements NADSegment
{
  /**
   * The default value of the '{@link #getPartyFunctionCodeQualifier() <em>Party Function Code Qualifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPartyFunctionCodeQualifier()
   * @generated
   * @ordered
   */
  protected static final String PARTY_FUNCTION_CODE_QUALIFIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPartyFunctionCodeQualifier() <em>Party Function Code Qualifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPartyFunctionCodeQualifier()
   * @generated
   * @ordered
   */
  protected String partyFunctionCodeQualifier = PARTY_FUNCTION_CODE_QUALIFIER_EDEFAULT;

  /**
   * The cached value of the '{@link #getPartyIdentificationDetails() <em>Party Identification Details</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPartyIdentificationDetails()
   * @generated
   * @ordered
   */
  protected PartyIdentificationDetail partyIdentificationDetails;

  /**
   * The cached value of the '{@link #getNameAndAddress() <em>Name And Address</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameAndAddress()
   * @generated
   * @ordered
   */
  protected NameAndAddress nameAndAddress;

  /**
   * The cached value of the '{@link #getPartyName() <em>Party Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPartyName()
   * @generated
   * @ordered
   */
  protected PartyName partyName;

  /**
   * The cached value of the '{@link #getStreet() <em>Street</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStreet()
   * @generated
   * @ordered
   */
  protected Street street;

  /**
   * The default value of the '{@link #getCityName() <em>City Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCityName()
   * @generated
   * @ordered
   */
  protected static final String CITY_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCityName() <em>City Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCityName()
   * @generated
   * @ordered
   */
  protected String cityName = CITY_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getCountrySubEntityDetails() <em>Country Sub Entity Details</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCountrySubEntityDetails()
   * @generated
   * @ordered
   */
  protected CountrySubEntityDetail countrySubEntityDetails;

  /**
   * The default value of the '{@link #getPostalIdentificationCode() <em>Postal Identification Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPostalIdentificationCode()
   * @generated
   * @ordered
   */
  protected static final String POSTAL_IDENTIFICATION_CODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPostalIdentificationCode() <em>Postal Identification Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPostalIdentificationCode()
   * @generated
   * @ordered
   */
  protected String postalIdentificationCode = POSTAL_IDENTIFICATION_CODE_EDEFAULT;

  /**
   * The default value of the '{@link #getCountryNameCode() <em>Country Name Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCountryNameCode()
   * @generated
   * @ordered
   */
  protected static final String COUNTRY_NAME_CODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCountryNameCode() <em>Country Name Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCountryNameCode()
   * @generated
   * @ordered
   */
  protected String countryNameCode = COUNTRY_NAME_CODE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NADSegmentImpl()
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
    return EdilangPackage.eINSTANCE.getNADSegment();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPartyFunctionCodeQualifier()
  {
    return partyFunctionCodeQualifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPartyFunctionCodeQualifier(String newPartyFunctionCodeQualifier)
  {
    String oldPartyFunctionCodeQualifier = partyFunctionCodeQualifier;
    partyFunctionCodeQualifier = newPartyFunctionCodeQualifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.NAD_SEGMENT__PARTY_FUNCTION_CODE_QUALIFIER, oldPartyFunctionCodeQualifier, partyFunctionCodeQualifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PartyIdentificationDetail getPartyIdentificationDetails()
  {
    return partyIdentificationDetails;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPartyIdentificationDetails(PartyIdentificationDetail newPartyIdentificationDetails, NotificationChain msgs)
  {
    PartyIdentificationDetail oldPartyIdentificationDetails = partyIdentificationDetails;
    partyIdentificationDetails = newPartyIdentificationDetails;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdilangPackage.NAD_SEGMENT__PARTY_IDENTIFICATION_DETAILS, oldPartyIdentificationDetails, newPartyIdentificationDetails);
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
  public void setPartyIdentificationDetails(PartyIdentificationDetail newPartyIdentificationDetails)
  {
    if (newPartyIdentificationDetails != partyIdentificationDetails)
    {
      NotificationChain msgs = null;
      if (partyIdentificationDetails != null)
        msgs = ((InternalEObject)partyIdentificationDetails).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdilangPackage.NAD_SEGMENT__PARTY_IDENTIFICATION_DETAILS, null, msgs);
      if (newPartyIdentificationDetails != null)
        msgs = ((InternalEObject)newPartyIdentificationDetails).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdilangPackage.NAD_SEGMENT__PARTY_IDENTIFICATION_DETAILS, null, msgs);
      msgs = basicSetPartyIdentificationDetails(newPartyIdentificationDetails, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.NAD_SEGMENT__PARTY_IDENTIFICATION_DETAILS, newPartyIdentificationDetails, newPartyIdentificationDetails));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NameAndAddress getNameAndAddress()
  {
    return nameAndAddress;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNameAndAddress(NameAndAddress newNameAndAddress, NotificationChain msgs)
  {
    NameAndAddress oldNameAndAddress = nameAndAddress;
    nameAndAddress = newNameAndAddress;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdilangPackage.NAD_SEGMENT__NAME_AND_ADDRESS, oldNameAndAddress, newNameAndAddress);
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
  public void setNameAndAddress(NameAndAddress newNameAndAddress)
  {
    if (newNameAndAddress != nameAndAddress)
    {
      NotificationChain msgs = null;
      if (nameAndAddress != null)
        msgs = ((InternalEObject)nameAndAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdilangPackage.NAD_SEGMENT__NAME_AND_ADDRESS, null, msgs);
      if (newNameAndAddress != null)
        msgs = ((InternalEObject)newNameAndAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdilangPackage.NAD_SEGMENT__NAME_AND_ADDRESS, null, msgs);
      msgs = basicSetNameAndAddress(newNameAndAddress, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.NAD_SEGMENT__NAME_AND_ADDRESS, newNameAndAddress, newNameAndAddress));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PartyName getPartyName()
  {
    return partyName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPartyName(PartyName newPartyName, NotificationChain msgs)
  {
    PartyName oldPartyName = partyName;
    partyName = newPartyName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdilangPackage.NAD_SEGMENT__PARTY_NAME, oldPartyName, newPartyName);
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
  public void setPartyName(PartyName newPartyName)
  {
    if (newPartyName != partyName)
    {
      NotificationChain msgs = null;
      if (partyName != null)
        msgs = ((InternalEObject)partyName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdilangPackage.NAD_SEGMENT__PARTY_NAME, null, msgs);
      if (newPartyName != null)
        msgs = ((InternalEObject)newPartyName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdilangPackage.NAD_SEGMENT__PARTY_NAME, null, msgs);
      msgs = basicSetPartyName(newPartyName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.NAD_SEGMENT__PARTY_NAME, newPartyName, newPartyName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Street getStreet()
  {
    return street;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStreet(Street newStreet, NotificationChain msgs)
  {
    Street oldStreet = street;
    street = newStreet;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdilangPackage.NAD_SEGMENT__STREET, oldStreet, newStreet);
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
  public void setStreet(Street newStreet)
  {
    if (newStreet != street)
    {
      NotificationChain msgs = null;
      if (street != null)
        msgs = ((InternalEObject)street).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdilangPackage.NAD_SEGMENT__STREET, null, msgs);
      if (newStreet != null)
        msgs = ((InternalEObject)newStreet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdilangPackage.NAD_SEGMENT__STREET, null, msgs);
      msgs = basicSetStreet(newStreet, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.NAD_SEGMENT__STREET, newStreet, newStreet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCityName()
  {
    return cityName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCityName(String newCityName)
  {
    String oldCityName = cityName;
    cityName = newCityName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.NAD_SEGMENT__CITY_NAME, oldCityName, cityName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CountrySubEntityDetail getCountrySubEntityDetails()
  {
    return countrySubEntityDetails;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCountrySubEntityDetails(CountrySubEntityDetail newCountrySubEntityDetails, NotificationChain msgs)
  {
    CountrySubEntityDetail oldCountrySubEntityDetails = countrySubEntityDetails;
    countrySubEntityDetails = newCountrySubEntityDetails;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdilangPackage.NAD_SEGMENT__COUNTRY_SUB_ENTITY_DETAILS, oldCountrySubEntityDetails, newCountrySubEntityDetails);
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
  public void setCountrySubEntityDetails(CountrySubEntityDetail newCountrySubEntityDetails)
  {
    if (newCountrySubEntityDetails != countrySubEntityDetails)
    {
      NotificationChain msgs = null;
      if (countrySubEntityDetails != null)
        msgs = ((InternalEObject)countrySubEntityDetails).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdilangPackage.NAD_SEGMENT__COUNTRY_SUB_ENTITY_DETAILS, null, msgs);
      if (newCountrySubEntityDetails != null)
        msgs = ((InternalEObject)newCountrySubEntityDetails).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdilangPackage.NAD_SEGMENT__COUNTRY_SUB_ENTITY_DETAILS, null, msgs);
      msgs = basicSetCountrySubEntityDetails(newCountrySubEntityDetails, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.NAD_SEGMENT__COUNTRY_SUB_ENTITY_DETAILS, newCountrySubEntityDetails, newCountrySubEntityDetails));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPostalIdentificationCode()
  {
    return postalIdentificationCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPostalIdentificationCode(String newPostalIdentificationCode)
  {
    String oldPostalIdentificationCode = postalIdentificationCode;
    postalIdentificationCode = newPostalIdentificationCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.NAD_SEGMENT__POSTAL_IDENTIFICATION_CODE, oldPostalIdentificationCode, postalIdentificationCode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCountryNameCode()
  {
    return countryNameCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCountryNameCode(String newCountryNameCode)
  {
    String oldCountryNameCode = countryNameCode;
    countryNameCode = newCountryNameCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdilangPackage.NAD_SEGMENT__COUNTRY_NAME_CODE, oldCountryNameCode, countryNameCode));
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
      case EdilangPackage.NAD_SEGMENT__PARTY_IDENTIFICATION_DETAILS:
        return basicSetPartyIdentificationDetails(null, msgs);
      case EdilangPackage.NAD_SEGMENT__NAME_AND_ADDRESS:
        return basicSetNameAndAddress(null, msgs);
      case EdilangPackage.NAD_SEGMENT__PARTY_NAME:
        return basicSetPartyName(null, msgs);
      case EdilangPackage.NAD_SEGMENT__STREET:
        return basicSetStreet(null, msgs);
      case EdilangPackage.NAD_SEGMENT__COUNTRY_SUB_ENTITY_DETAILS:
        return basicSetCountrySubEntityDetails(null, msgs);
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
      case EdilangPackage.NAD_SEGMENT__PARTY_FUNCTION_CODE_QUALIFIER:
        return getPartyFunctionCodeQualifier();
      case EdilangPackage.NAD_SEGMENT__PARTY_IDENTIFICATION_DETAILS:
        return getPartyIdentificationDetails();
      case EdilangPackage.NAD_SEGMENT__NAME_AND_ADDRESS:
        return getNameAndAddress();
      case EdilangPackage.NAD_SEGMENT__PARTY_NAME:
        return getPartyName();
      case EdilangPackage.NAD_SEGMENT__STREET:
        return getStreet();
      case EdilangPackage.NAD_SEGMENT__CITY_NAME:
        return getCityName();
      case EdilangPackage.NAD_SEGMENT__COUNTRY_SUB_ENTITY_DETAILS:
        return getCountrySubEntityDetails();
      case EdilangPackage.NAD_SEGMENT__POSTAL_IDENTIFICATION_CODE:
        return getPostalIdentificationCode();
      case EdilangPackage.NAD_SEGMENT__COUNTRY_NAME_CODE:
        return getCountryNameCode();
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
      case EdilangPackage.NAD_SEGMENT__PARTY_FUNCTION_CODE_QUALIFIER:
        setPartyFunctionCodeQualifier((String)newValue);
        return;
      case EdilangPackage.NAD_SEGMENT__PARTY_IDENTIFICATION_DETAILS:
        setPartyIdentificationDetails((PartyIdentificationDetail)newValue);
        return;
      case EdilangPackage.NAD_SEGMENT__NAME_AND_ADDRESS:
        setNameAndAddress((NameAndAddress)newValue);
        return;
      case EdilangPackage.NAD_SEGMENT__PARTY_NAME:
        setPartyName((PartyName)newValue);
        return;
      case EdilangPackage.NAD_SEGMENT__STREET:
        setStreet((Street)newValue);
        return;
      case EdilangPackage.NAD_SEGMENT__CITY_NAME:
        setCityName((String)newValue);
        return;
      case EdilangPackage.NAD_SEGMENT__COUNTRY_SUB_ENTITY_DETAILS:
        setCountrySubEntityDetails((CountrySubEntityDetail)newValue);
        return;
      case EdilangPackage.NAD_SEGMENT__POSTAL_IDENTIFICATION_CODE:
        setPostalIdentificationCode((String)newValue);
        return;
      case EdilangPackage.NAD_SEGMENT__COUNTRY_NAME_CODE:
        setCountryNameCode((String)newValue);
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
      case EdilangPackage.NAD_SEGMENT__PARTY_FUNCTION_CODE_QUALIFIER:
        setPartyFunctionCodeQualifier(PARTY_FUNCTION_CODE_QUALIFIER_EDEFAULT);
        return;
      case EdilangPackage.NAD_SEGMENT__PARTY_IDENTIFICATION_DETAILS:
        setPartyIdentificationDetails((PartyIdentificationDetail)null);
        return;
      case EdilangPackage.NAD_SEGMENT__NAME_AND_ADDRESS:
        setNameAndAddress((NameAndAddress)null);
        return;
      case EdilangPackage.NAD_SEGMENT__PARTY_NAME:
        setPartyName((PartyName)null);
        return;
      case EdilangPackage.NAD_SEGMENT__STREET:
        setStreet((Street)null);
        return;
      case EdilangPackage.NAD_SEGMENT__CITY_NAME:
        setCityName(CITY_NAME_EDEFAULT);
        return;
      case EdilangPackage.NAD_SEGMENT__COUNTRY_SUB_ENTITY_DETAILS:
        setCountrySubEntityDetails((CountrySubEntityDetail)null);
        return;
      case EdilangPackage.NAD_SEGMENT__POSTAL_IDENTIFICATION_CODE:
        setPostalIdentificationCode(POSTAL_IDENTIFICATION_CODE_EDEFAULT);
        return;
      case EdilangPackage.NAD_SEGMENT__COUNTRY_NAME_CODE:
        setCountryNameCode(COUNTRY_NAME_CODE_EDEFAULT);
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
      case EdilangPackage.NAD_SEGMENT__PARTY_FUNCTION_CODE_QUALIFIER:
        return PARTY_FUNCTION_CODE_QUALIFIER_EDEFAULT == null ? partyFunctionCodeQualifier != null : !PARTY_FUNCTION_CODE_QUALIFIER_EDEFAULT.equals(partyFunctionCodeQualifier);
      case EdilangPackage.NAD_SEGMENT__PARTY_IDENTIFICATION_DETAILS:
        return partyIdentificationDetails != null;
      case EdilangPackage.NAD_SEGMENT__NAME_AND_ADDRESS:
        return nameAndAddress != null;
      case EdilangPackage.NAD_SEGMENT__PARTY_NAME:
        return partyName != null;
      case EdilangPackage.NAD_SEGMENT__STREET:
        return street != null;
      case EdilangPackage.NAD_SEGMENT__CITY_NAME:
        return CITY_NAME_EDEFAULT == null ? cityName != null : !CITY_NAME_EDEFAULT.equals(cityName);
      case EdilangPackage.NAD_SEGMENT__COUNTRY_SUB_ENTITY_DETAILS:
        return countrySubEntityDetails != null;
      case EdilangPackage.NAD_SEGMENT__POSTAL_IDENTIFICATION_CODE:
        return POSTAL_IDENTIFICATION_CODE_EDEFAULT == null ? postalIdentificationCode != null : !POSTAL_IDENTIFICATION_CODE_EDEFAULT.equals(postalIdentificationCode);
      case EdilangPackage.NAD_SEGMENT__COUNTRY_NAME_CODE:
        return COUNTRY_NAME_CODE_EDEFAULT == null ? countryNameCode != null : !COUNTRY_NAME_CODE_EDEFAULT.equals(countryNameCode);
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
    result.append(" (partyFunctionCodeQualifier: ");
    result.append(partyFunctionCodeQualifier);
    result.append(", cityName: ");
    result.append(cityName);
    result.append(", postalIdentificationCode: ");
    result.append(postalIdentificationCode);
    result.append(", countryNameCode: ");
    result.append(countryNameCode);
    result.append(')');
    return result.toString();
  }

} //NADSegmentImpl

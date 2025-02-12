/**
 * generated by Xtext 2.35.0
 */
package io.thlaegler.edifact.edilang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NAD Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.NADSegment#getPartyFunctionCodeQualifier <em>Party Function Code Qualifier</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.NADSegment#getPartyIdentificationDetails <em>Party Identification Details</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.NADSegment#getNameAndAddress <em>Name And Address</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.NADSegment#getPartyName <em>Party Name</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.NADSegment#getStreet <em>Street</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.NADSegment#getCityName <em>City Name</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.NADSegment#getCountrySubEntityDetails <em>Country Sub Entity Details</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.NADSegment#getPostalIdentificationCode <em>Postal Identification Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.NADSegment#getCountryNameCode <em>Country Name Code</em>}</li>
 * </ul>
 *
 * @see io.thlaegler.edifact.edilang.EdilangPackage#getNADSegment()
 * @model
 * @generated
 */
public interface NADSegment extends AbstractEdiSegment
{
  /**
   * Returns the value of the '<em><b>Party Function Code Qualifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Party Function Code Qualifier</em>' attribute.
   * @see #setPartyFunctionCodeQualifier(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getNADSegment_PartyFunctionCodeQualifier()
   * @model
   * @generated
   */
  String getPartyFunctionCodeQualifier();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.NADSegment#getPartyFunctionCodeQualifier <em>Party Function Code Qualifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Party Function Code Qualifier</em>' attribute.
   * @see #getPartyFunctionCodeQualifier()
   * @generated
   */
  void setPartyFunctionCodeQualifier(String value);

  /**
   * Returns the value of the '<em><b>Party Identification Details</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Party Identification Details</em>' containment reference.
   * @see #setPartyIdentificationDetails(PartyIdentificationDetail)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getNADSegment_PartyIdentificationDetails()
   * @model containment="true"
   * @generated
   */
  PartyIdentificationDetail getPartyIdentificationDetails();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.NADSegment#getPartyIdentificationDetails <em>Party Identification Details</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Party Identification Details</em>' containment reference.
   * @see #getPartyIdentificationDetails()
   * @generated
   */
  void setPartyIdentificationDetails(PartyIdentificationDetail value);

  /**
   * Returns the value of the '<em><b>Name And Address</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name And Address</em>' containment reference.
   * @see #setNameAndAddress(NameAndAddress)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getNADSegment_NameAndAddress()
   * @model containment="true"
   * @generated
   */
  NameAndAddress getNameAndAddress();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.NADSegment#getNameAndAddress <em>Name And Address</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name And Address</em>' containment reference.
   * @see #getNameAndAddress()
   * @generated
   */
  void setNameAndAddress(NameAndAddress value);

  /**
   * Returns the value of the '<em><b>Party Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Party Name</em>' containment reference.
   * @see #setPartyName(PartyName)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getNADSegment_PartyName()
   * @model containment="true"
   * @generated
   */
  PartyName getPartyName();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.NADSegment#getPartyName <em>Party Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Party Name</em>' containment reference.
   * @see #getPartyName()
   * @generated
   */
  void setPartyName(PartyName value);

  /**
   * Returns the value of the '<em><b>Street</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Street</em>' containment reference.
   * @see #setStreet(Street)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getNADSegment_Street()
   * @model containment="true"
   * @generated
   */
  Street getStreet();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.NADSegment#getStreet <em>Street</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Street</em>' containment reference.
   * @see #getStreet()
   * @generated
   */
  void setStreet(Street value);

  /**
   * Returns the value of the '<em><b>City Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>City Name</em>' attribute.
   * @see #setCityName(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getNADSegment_CityName()
   * @model
   * @generated
   */
  String getCityName();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.NADSegment#getCityName <em>City Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>City Name</em>' attribute.
   * @see #getCityName()
   * @generated
   */
  void setCityName(String value);

  /**
   * Returns the value of the '<em><b>Country Sub Entity Details</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Country Sub Entity Details</em>' containment reference.
   * @see #setCountrySubEntityDetails(CountrySubEntityDetail)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getNADSegment_CountrySubEntityDetails()
   * @model containment="true"
   * @generated
   */
  CountrySubEntityDetail getCountrySubEntityDetails();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.NADSegment#getCountrySubEntityDetails <em>Country Sub Entity Details</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Country Sub Entity Details</em>' containment reference.
   * @see #getCountrySubEntityDetails()
   * @generated
   */
  void setCountrySubEntityDetails(CountrySubEntityDetail value);

  /**
   * Returns the value of the '<em><b>Postal Identification Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Postal Identification Code</em>' attribute.
   * @see #setPostalIdentificationCode(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getNADSegment_PostalIdentificationCode()
   * @model
   * @generated
   */
  String getPostalIdentificationCode();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.NADSegment#getPostalIdentificationCode <em>Postal Identification Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Postal Identification Code</em>' attribute.
   * @see #getPostalIdentificationCode()
   * @generated
   */
  void setPostalIdentificationCode(String value);

  /**
   * Returns the value of the '<em><b>Country Name Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Country Name Code</em>' attribute.
   * @see #setCountryNameCode(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getNADSegment_CountryNameCode()
   * @model
   * @generated
   */
  String getCountryNameCode();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.NADSegment#getCountryNameCode <em>Country Name Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Country Name Code</em>' attribute.
   * @see #getCountryNameCode()
   * @generated
   */
  void setCountryNameCode(String value);

} // NADSegment

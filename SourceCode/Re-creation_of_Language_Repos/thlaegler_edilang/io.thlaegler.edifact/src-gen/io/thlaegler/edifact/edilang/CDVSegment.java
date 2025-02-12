/**
 * generated by Xtext 2.35.0
 */
package io.thlaegler.edifact.edilang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CDV Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.CDVSegment#getCodeValue <em>Code Value</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.CDVSegment#getCodeName <em>Code Name</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.CDVSegment#getMaintenanceOperationCode <em>Maintenance Operation Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.CDVSegment#getCodeValueSourceCode <em>Code Value Source Code</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.CDVSegment#getRequirementsDesignatorCode <em>Requirements Designator Code</em>}</li>
 * </ul>
 *
 * @see io.thlaegler.edifact.edilang.EdilangPackage#getCDVSegment()
 * @model
 * @generated
 */
public interface CDVSegment extends AbstractEdiSegment
{
  /**
   * Returns the value of the '<em><b>Code Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Code Value</em>' attribute.
   * @see #setCodeValue(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getCDVSegment_CodeValue()
   * @model
   * @generated
   */
  String getCodeValue();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.CDVSegment#getCodeValue <em>Code Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Code Value</em>' attribute.
   * @see #getCodeValue()
   * @generated
   */
  void setCodeValue(String value);

  /**
   * Returns the value of the '<em><b>Code Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Code Name</em>' attribute.
   * @see #setCodeName(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getCDVSegment_CodeName()
   * @model
   * @generated
   */
  String getCodeName();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.CDVSegment#getCodeName <em>Code Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Code Name</em>' attribute.
   * @see #getCodeName()
   * @generated
   */
  void setCodeName(String value);

  /**
   * Returns the value of the '<em><b>Maintenance Operation Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Maintenance Operation Code</em>' attribute.
   * @see #setMaintenanceOperationCode(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getCDVSegment_MaintenanceOperationCode()
   * @model
   * @generated
   */
  String getMaintenanceOperationCode();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.CDVSegment#getMaintenanceOperationCode <em>Maintenance Operation Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Maintenance Operation Code</em>' attribute.
   * @see #getMaintenanceOperationCode()
   * @generated
   */
  void setMaintenanceOperationCode(String value);

  /**
   * Returns the value of the '<em><b>Code Value Source Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Code Value Source Code</em>' attribute.
   * @see #setCodeValueSourceCode(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getCDVSegment_CodeValueSourceCode()
   * @model
   * @generated
   */
  String getCodeValueSourceCode();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.CDVSegment#getCodeValueSourceCode <em>Code Value Source Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Code Value Source Code</em>' attribute.
   * @see #getCodeValueSourceCode()
   * @generated
   */
  void setCodeValueSourceCode(String value);

  /**
   * Returns the value of the '<em><b>Requirements Designator Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Requirements Designator Code</em>' attribute.
   * @see #setRequirementsDesignatorCode(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getCDVSegment_RequirementsDesignatorCode()
   * @model
   * @generated
   */
  String getRequirementsDesignatorCode();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.CDVSegment#getRequirementsDesignatorCode <em>Requirements Designator Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Requirements Designator Code</em>' attribute.
   * @see #getRequirementsDesignatorCode()
   * @generated
   */
  void setRequirementsDesignatorCode(String value);

} // CDVSegment

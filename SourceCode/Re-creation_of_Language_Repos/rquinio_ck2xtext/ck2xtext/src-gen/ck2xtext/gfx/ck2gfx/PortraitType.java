/**
 * generated by Xtext 2.35.0
 */
package ck2xtext.gfx.ck2gfx;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Portrait Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ck2xtext.gfx.ck2gfx.PortraitType#getName <em>Name</em>}</li>
 *   <li>{@link ck2xtext.gfx.ck2gfx.PortraitType#getEffectFile <em>Effect File</em>}</li>
 *   <li>{@link ck2xtext.gfx.ck2gfx.PortraitType#getLayers <em>Layers</em>}</li>
 *   <li>{@link ck2xtext.gfx.ck2gfx.PortraitType#getHairColorIndex <em>Hair Color Index</em>}</li>
 *   <li>{@link ck2xtext.gfx.ck2gfx.PortraitType#getHairColor <em>Hair Color</em>}</li>
 *   <li>{@link ck2xtext.gfx.ck2gfx.PortraitType#getEyeColorIndex <em>Eye Color Index</em>}</li>
 *   <li>{@link ck2xtext.gfx.ck2gfx.PortraitType#getEyeColor <em>Eye Color</em>}</li>
 *   <li>{@link ck2xtext.gfx.ck2gfx.PortraitType#getHeadgearThatHidesHair <em>Headgear That Hides Hair</em>}</li>
 * </ul>
 *
 * @see ck2xtext.gfx.ck2gfx.Ck2gfxPackage#getPortraitType()
 * @model
 * @generated
 */
public interface PortraitType extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see ck2xtext.gfx.ck2gfx.Ck2gfxPackage#getPortraitType_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ck2xtext.gfx.ck2gfx.PortraitType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Effect File</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Effect File</em>' attribute.
   * @see #setEffectFile(String)
   * @see ck2xtext.gfx.ck2gfx.Ck2gfxPackage#getPortraitType_EffectFile()
   * @model
   * @generated
   */
  String getEffectFile();

  /**
   * Sets the value of the '{@link ck2xtext.gfx.ck2gfx.PortraitType#getEffectFile <em>Effect File</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Effect File</em>' attribute.
   * @see #getEffectFile()
   * @generated
   */
  void setEffectFile(String value);

  /**
   * Returns the value of the '<em><b>Layers</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Layers</em>' attribute list.
   * @see ck2xtext.gfx.ck2gfx.Ck2gfxPackage#getPortraitType_Layers()
   * @model unique="false"
   * @generated
   */
  EList<String> getLayers();

  /**
   * Returns the value of the '<em><b>Hair Color Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hair Color Index</em>' attribute.
   * @see #setHairColorIndex(int)
   * @see ck2xtext.gfx.ck2gfx.Ck2gfxPackage#getPortraitType_HairColorIndex()
   * @model
   * @generated
   */
  int getHairColorIndex();

  /**
   * Sets the value of the '{@link ck2xtext.gfx.ck2gfx.PortraitType#getHairColorIndex <em>Hair Color Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hair Color Index</em>' attribute.
   * @see #getHairColorIndex()
   * @generated
   */
  void setHairColorIndex(int value);

  /**
   * Returns the value of the '<em><b>Hair Color</b></em>' containment reference list.
   * The list contents are of type {@link ck2xtext.gfx.ck2gfx.Color}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hair Color</em>' containment reference list.
   * @see ck2xtext.gfx.ck2gfx.Ck2gfxPackage#getPortraitType_HairColor()
   * @model containment="true"
   * @generated
   */
  EList<Color> getHairColor();

  /**
   * Returns the value of the '<em><b>Eye Color Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Eye Color Index</em>' attribute.
   * @see #setEyeColorIndex(int)
   * @see ck2xtext.gfx.ck2gfx.Ck2gfxPackage#getPortraitType_EyeColorIndex()
   * @model
   * @generated
   */
  int getEyeColorIndex();

  /**
   * Sets the value of the '{@link ck2xtext.gfx.ck2gfx.PortraitType#getEyeColorIndex <em>Eye Color Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Eye Color Index</em>' attribute.
   * @see #getEyeColorIndex()
   * @generated
   */
  void setEyeColorIndex(int value);

  /**
   * Returns the value of the '<em><b>Eye Color</b></em>' containment reference list.
   * The list contents are of type {@link ck2xtext.gfx.ck2gfx.Color}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Eye Color</em>' containment reference list.
   * @see ck2xtext.gfx.ck2gfx.Ck2gfxPackage#getPortraitType_EyeColor()
   * @model containment="true"
   * @generated
   */
  EList<Color> getEyeColor();

  /**
   * Returns the value of the '<em><b>Headgear That Hides Hair</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Integer}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Headgear That Hides Hair</em>' attribute list.
   * @see ck2xtext.gfx.ck2gfx.Ck2gfxPackage#getPortraitType_HeadgearThatHidesHair()
   * @model unique="false"
   * @generated
   */
  EList<Integer> getHeadgearThatHidesHair();

} // PortraitType

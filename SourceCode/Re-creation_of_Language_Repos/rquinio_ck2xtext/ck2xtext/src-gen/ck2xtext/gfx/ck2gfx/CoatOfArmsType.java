/**
 * generated by Xtext 2.35.0
 */
package ck2xtext.gfx.ck2gfx;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coat Of Arms Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ck2xtext.gfx.ck2gfx.CoatOfArmsType#getName <em>Name</em>}</li>
 *   <li>{@link ck2xtext.gfx.ck2gfx.CoatOfArmsType#getFrame <em>Frame</em>}</li>
 *   <li>{@link ck2xtext.gfx.ck2gfx.CoatOfArmsType#getMask <em>Mask</em>}</li>
 *   <li>{@link ck2xtext.gfx.ck2gfx.CoatOfArmsType#getSealOverlay <em>Seal Overlay</em>}</li>
 *   <li>{@link ck2xtext.gfx.ck2gfx.CoatOfArmsType#getEffect <em>Effect</em>}</li>
 *   <li>{@link ck2xtext.gfx.ck2gfx.CoatOfArmsType#getLayers <em>Layers</em>}</li>
 * </ul>
 *
 * @see ck2xtext.gfx.ck2gfx.Ck2gfxPackage#getCoatOfArmsType()
 * @model
 * @generated
 */
public interface CoatOfArmsType extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see ck2xtext.gfx.ck2gfx.Ck2gfxPackage#getCoatOfArmsType_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ck2xtext.gfx.ck2gfx.CoatOfArmsType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Frame</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Frame</em>' attribute.
   * @see #setFrame(String)
   * @see ck2xtext.gfx.ck2gfx.Ck2gfxPackage#getCoatOfArmsType_Frame()
   * @model
   * @generated
   */
  String getFrame();

  /**
   * Sets the value of the '{@link ck2xtext.gfx.ck2gfx.CoatOfArmsType#getFrame <em>Frame</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Frame</em>' attribute.
   * @see #getFrame()
   * @generated
   */
  void setFrame(String value);

  /**
   * Returns the value of the '<em><b>Mask</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mask</em>' attribute.
   * @see #setMask(String)
   * @see ck2xtext.gfx.ck2gfx.Ck2gfxPackage#getCoatOfArmsType_Mask()
   * @model
   * @generated
   */
  String getMask();

  /**
   * Sets the value of the '{@link ck2xtext.gfx.ck2gfx.CoatOfArmsType#getMask <em>Mask</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mask</em>' attribute.
   * @see #getMask()
   * @generated
   */
  void setMask(String value);

  /**
   * Returns the value of the '<em><b>Seal Overlay</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Seal Overlay</em>' attribute.
   * @see #setSealOverlay(String)
   * @see ck2xtext.gfx.ck2gfx.Ck2gfxPackage#getCoatOfArmsType_SealOverlay()
   * @model
   * @generated
   */
  String getSealOverlay();

  /**
   * Sets the value of the '{@link ck2xtext.gfx.ck2gfx.CoatOfArmsType#getSealOverlay <em>Seal Overlay</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Seal Overlay</em>' attribute.
   * @see #getSealOverlay()
   * @generated
   */
  void setSealOverlay(String value);

  /**
   * Returns the value of the '<em><b>Effect</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Effect</em>' attribute.
   * @see #setEffect(String)
   * @see ck2xtext.gfx.ck2gfx.Ck2gfxPackage#getCoatOfArmsType_Effect()
   * @model
   * @generated
   */
  String getEffect();

  /**
   * Sets the value of the '{@link ck2xtext.gfx.ck2gfx.CoatOfArmsType#getEffect <em>Effect</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Effect</em>' attribute.
   * @see #getEffect()
   * @generated
   */
  void setEffect(String value);

  /**
   * Returns the value of the '<em><b>Layers</b></em>' containment reference list.
   * The list contents are of type {@link ck2xtext.gfx.ck2gfx.CoatOfArmsLayer}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Layers</em>' containment reference list.
   * @see ck2xtext.gfx.ck2gfx.Ck2gfxPackage#getCoatOfArmsType_Layers()
   * @model containment="true"
   * @generated
   */
  EList<CoatOfArmsLayer> getLayers();

} // CoatOfArmsType

/**
 * generated by Xtext 2.35.0
 */
package ck2xtext.gfx.ck2gfx.util;

import ck2xtext.gfx.ck2gfx.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ck2xtext.gfx.ck2gfx.Ck2gfxPackage
 * @generated
 */
public class Ck2gfxSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static Ck2gfxPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ck2gfxSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = Ck2gfxPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case Ck2gfxPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Ck2gfxPackage.COLOR:
      {
        Color color = (Color)theEObject;
        T result = caseColor(color);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Ck2gfxPackage.COLOR_RATIO:
      {
        ColorRatio colorRatio = (ColorRatio)theEObject;
        T result = caseColorRatio(colorRatio);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Ck2gfxPackage.COORDINATES:
      {
        Coordinates coordinates = (Coordinates)theEObject;
        T result = caseCoordinates(coordinates);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Ck2gfxPackage.SPRITE_TYPES:
      {
        SpriteTypes spriteTypes = (SpriteTypes)theEObject;
        T result = caseSpriteTypes(spriteTypes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Ck2gfxPackage.SPRITE_TYPE:
      {
        SpriteType spriteType = (SpriteType)theEObject;
        T result = caseSpriteType(spriteType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Ck2gfxPackage.ANIMATED_SPRITE_TYPE:
      {
        AnimatedSpriteType animatedSpriteType = (AnimatedSpriteType)theEObject;
        T result = caseAnimatedSpriteType(animatedSpriteType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Ck2gfxPackage.CORNERED_TILE_SPRITE_TYPE:
      {
        CorneredTileSpriteType corneredTileSpriteType = (CorneredTileSpriteType)theEObject;
        T result = caseCorneredTileSpriteType(corneredTileSpriteType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Ck2gfxPackage.PROGRESSBAR_TYPE:
      {
        ProgressbarType progressbarType = (ProgressbarType)theEObject;
        T result = caseProgressbarType(progressbarType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Ck2gfxPackage.PORTRAIT_TYPE:
      {
        PortraitType portraitType = (PortraitType)theEObject;
        T result = casePortraitType(portraitType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Ck2gfxPackage.MASKED_SHIELD_TYPE:
      {
        MaskedShieldType maskedShieldType = (MaskedShieldType)theEObject;
        T result = caseMaskedShieldType(maskedShieldType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Ck2gfxPackage.LINE_CHART_TYPE:
      {
        LineChartType lineChartType = (LineChartType)theEObject;
        T result = caseLineChartType(lineChartType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Ck2gfxPackage.COAT_OF_ARMS_TYPE:
      {
        CoatOfArmsType coatOfArmsType = (CoatOfArmsType)theEObject;
        T result = caseCoatOfArmsType(coatOfArmsType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Ck2gfxPackage.COAT_OF_ARMS_LAYER:
      {
        CoatOfArmsLayer coatOfArmsLayer = (CoatOfArmsLayer)theEObject;
        T result = caseCoatOfArmsLayer(coatOfArmsLayer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Ck2gfxPackage.OBJECT_TYPES:
      {
        ObjectTypes objectTypes = (ObjectTypes)theEObject;
        T result = caseObjectTypes(objectTypes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Ck2gfxPackage.EMFX_ACTOR_TYPE:
      {
        EMFXActorType emfxActorType = (EMFXActorType)theEObject;
        T result = caseEMFXActorType(emfxActorType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Ck2gfxPackage.ANIMATION:
      {
        Animation animation = (Animation)theEObject;
        T result = caseAnimation(animation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Ck2gfxPackage.PDXMESH:
      {
        Pdxmesh pdxmesh = (Pdxmesh)theEObject;
        T result = casePdxmesh(pdxmesh);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Ck2gfxPackage.ARROW_TYPE:
      {
        ArrowType arrowType = (ArrowType)theEObject;
        T result = caseArrowType(arrowType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Ck2gfxPackage.BITMAP_FONTS:
      {
        BitmapFonts bitmapFonts = (BitmapFonts)theEObject;
        T result = caseBitmapFonts(bitmapFonts);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Ck2gfxPackage.BITMAP_FONT:
      {
        BitmapFont bitmapFont = (BitmapFont)theEObject;
        T result = caseBitmapFont(bitmapFont);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Ck2gfxPackage.COLOR_CODE:
      {
        ColorCode colorCode = (ColorCode)theEObject;
        T result = caseColorCode(colorCode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Color</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Color</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColor(Color object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Color Ratio</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Color Ratio</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColorRatio(ColorRatio object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Coordinates</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Coordinates</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCoordinates(Coordinates object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sprite Types</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sprite Types</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpriteTypes(SpriteTypes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sprite Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sprite Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpriteType(SpriteType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Animated Sprite Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Animated Sprite Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnimatedSpriteType(AnimatedSpriteType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cornered Tile Sprite Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cornered Tile Sprite Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCorneredTileSpriteType(CorneredTileSpriteType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Progressbar Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Progressbar Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProgressbarType(ProgressbarType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Portrait Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Portrait Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePortraitType(PortraitType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Masked Shield Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Masked Shield Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMaskedShieldType(MaskedShieldType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Line Chart Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Line Chart Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLineChartType(LineChartType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Coat Of Arms Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Coat Of Arms Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCoatOfArmsType(CoatOfArmsType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Coat Of Arms Layer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Coat Of Arms Layer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCoatOfArmsLayer(CoatOfArmsLayer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object Types</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object Types</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectTypes(ObjectTypes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EMFX Actor Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EMFX Actor Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEMFXActorType(EMFXActorType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Animation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Animation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnimation(Animation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pdxmesh</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pdxmesh</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePdxmesh(Pdxmesh object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Arrow Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Arrow Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArrowType(ArrowType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bitmap Fonts</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bitmap Fonts</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBitmapFonts(BitmapFonts object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bitmap Font</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bitmap Font</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBitmapFont(BitmapFont object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Color Code</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Color Code</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColorCode(ColorCode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //Ck2gfxSwitch

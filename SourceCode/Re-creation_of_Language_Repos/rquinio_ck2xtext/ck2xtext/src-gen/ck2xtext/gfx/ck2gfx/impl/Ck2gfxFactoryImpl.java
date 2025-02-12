/**
 * generated by Xtext 2.35.0
 */
package ck2xtext.gfx.ck2gfx.impl;

import ck2xtext.gfx.ck2gfx.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Ck2gfxFactoryImpl extends EFactoryImpl implements Ck2gfxFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Ck2gfxFactory init()
  {
    try
    {
      Ck2gfxFactory theCk2gfxFactory = (Ck2gfxFactory)EPackage.Registry.INSTANCE.getEFactory(Ck2gfxPackage.eNS_URI);
      if (theCk2gfxFactory != null)
      {
        return theCk2gfxFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new Ck2gfxFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ck2gfxFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case Ck2gfxPackage.MODEL: return createModel();
      case Ck2gfxPackage.COLOR: return createColor();
      case Ck2gfxPackage.COLOR_RATIO: return createColorRatio();
      case Ck2gfxPackage.COORDINATES: return createCoordinates();
      case Ck2gfxPackage.SPRITE_TYPES: return createSpriteTypes();
      case Ck2gfxPackage.SPRITE_TYPE: return createSpriteType();
      case Ck2gfxPackage.ANIMATED_SPRITE_TYPE: return createAnimatedSpriteType();
      case Ck2gfxPackage.CORNERED_TILE_SPRITE_TYPE: return createCorneredTileSpriteType();
      case Ck2gfxPackage.PROGRESSBAR_TYPE: return createProgressbarType();
      case Ck2gfxPackage.PORTRAIT_TYPE: return createPortraitType();
      case Ck2gfxPackage.MASKED_SHIELD_TYPE: return createMaskedShieldType();
      case Ck2gfxPackage.LINE_CHART_TYPE: return createLineChartType();
      case Ck2gfxPackage.COAT_OF_ARMS_TYPE: return createCoatOfArmsType();
      case Ck2gfxPackage.COAT_OF_ARMS_LAYER: return createCoatOfArmsLayer();
      case Ck2gfxPackage.OBJECT_TYPES: return createObjectTypes();
      case Ck2gfxPackage.EMFX_ACTOR_TYPE: return createEMFXActorType();
      case Ck2gfxPackage.ANIMATION: return createAnimation();
      case Ck2gfxPackage.PDXMESH: return createPdxmesh();
      case Ck2gfxPackage.ARROW_TYPE: return createArrowType();
      case Ck2gfxPackage.BITMAP_FONTS: return createBitmapFonts();
      case Ck2gfxPackage.BITMAP_FONT: return createBitmapFont();
      case Ck2gfxPackage.COLOR_CODE: return createColorCode();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Color createColor()
  {
    ColorImpl color = new ColorImpl();
    return color;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ColorRatio createColorRatio()
  {
    ColorRatioImpl colorRatio = new ColorRatioImpl();
    return colorRatio;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Coordinates createCoordinates()
  {
    CoordinatesImpl coordinates = new CoordinatesImpl();
    return coordinates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SpriteTypes createSpriteTypes()
  {
    SpriteTypesImpl spriteTypes = new SpriteTypesImpl();
    return spriteTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SpriteType createSpriteType()
  {
    SpriteTypeImpl spriteType = new SpriteTypeImpl();
    return spriteType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AnimatedSpriteType createAnimatedSpriteType()
  {
    AnimatedSpriteTypeImpl animatedSpriteType = new AnimatedSpriteTypeImpl();
    return animatedSpriteType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CorneredTileSpriteType createCorneredTileSpriteType()
  {
    CorneredTileSpriteTypeImpl corneredTileSpriteType = new CorneredTileSpriteTypeImpl();
    return corneredTileSpriteType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ProgressbarType createProgressbarType()
  {
    ProgressbarTypeImpl progressbarType = new ProgressbarTypeImpl();
    return progressbarType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PortraitType createPortraitType()
  {
    PortraitTypeImpl portraitType = new PortraitTypeImpl();
    return portraitType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MaskedShieldType createMaskedShieldType()
  {
    MaskedShieldTypeImpl maskedShieldType = new MaskedShieldTypeImpl();
    return maskedShieldType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LineChartType createLineChartType()
  {
    LineChartTypeImpl lineChartType = new LineChartTypeImpl();
    return lineChartType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CoatOfArmsType createCoatOfArmsType()
  {
    CoatOfArmsTypeImpl coatOfArmsType = new CoatOfArmsTypeImpl();
    return coatOfArmsType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CoatOfArmsLayer createCoatOfArmsLayer()
  {
    CoatOfArmsLayerImpl coatOfArmsLayer = new CoatOfArmsLayerImpl();
    return coatOfArmsLayer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ObjectTypes createObjectTypes()
  {
    ObjectTypesImpl objectTypes = new ObjectTypesImpl();
    return objectTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EMFXActorType createEMFXActorType()
  {
    EMFXActorTypeImpl emfxActorType = new EMFXActorTypeImpl();
    return emfxActorType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Animation createAnimation()
  {
    AnimationImpl animation = new AnimationImpl();
    return animation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Pdxmesh createPdxmesh()
  {
    PdxmeshImpl pdxmesh = new PdxmeshImpl();
    return pdxmesh;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ArrowType createArrowType()
  {
    ArrowTypeImpl arrowType = new ArrowTypeImpl();
    return arrowType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BitmapFonts createBitmapFonts()
  {
    BitmapFontsImpl bitmapFonts = new BitmapFontsImpl();
    return bitmapFonts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BitmapFont createBitmapFont()
  {
    BitmapFontImpl bitmapFont = new BitmapFontImpl();
    return bitmapFont;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ColorCode createColorCode()
  {
    ColorCodeImpl colorCode = new ColorCodeImpl();
    return colorCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Ck2gfxPackage getCk2gfxPackage()
  {
    return (Ck2gfxPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static Ck2gfxPackage getPackage()
  {
    return Ck2gfxPackage.eINSTANCE;
  }

} //Ck2gfxFactoryImpl

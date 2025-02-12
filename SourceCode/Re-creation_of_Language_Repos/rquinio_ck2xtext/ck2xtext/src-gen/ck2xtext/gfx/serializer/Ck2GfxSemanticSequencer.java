/*
 * generated by Xtext 2.35.0
 */
package ck2xtext.gfx.serializer;

import ck2xtext.gfx.ck2gfx.AnimatedSpriteType;
import ck2xtext.gfx.ck2gfx.Animation;
import ck2xtext.gfx.ck2gfx.ArrowType;
import ck2xtext.gfx.ck2gfx.BitmapFont;
import ck2xtext.gfx.ck2gfx.BitmapFonts;
import ck2xtext.gfx.ck2gfx.Ck2gfxPackage;
import ck2xtext.gfx.ck2gfx.CoatOfArmsLayer;
import ck2xtext.gfx.ck2gfx.CoatOfArmsType;
import ck2xtext.gfx.ck2gfx.Color;
import ck2xtext.gfx.ck2gfx.ColorCode;
import ck2xtext.gfx.ck2gfx.ColorRatio;
import ck2xtext.gfx.ck2gfx.Coordinates;
import ck2xtext.gfx.ck2gfx.CorneredTileSpriteType;
import ck2xtext.gfx.ck2gfx.EMFXActorType;
import ck2xtext.gfx.ck2gfx.LineChartType;
import ck2xtext.gfx.ck2gfx.MaskedShieldType;
import ck2xtext.gfx.ck2gfx.Model;
import ck2xtext.gfx.ck2gfx.ObjectTypes;
import ck2xtext.gfx.ck2gfx.Pdxmesh;
import ck2xtext.gfx.ck2gfx.PortraitType;
import ck2xtext.gfx.ck2gfx.ProgressbarType;
import ck2xtext.gfx.ck2gfx.SpriteType;
import ck2xtext.gfx.ck2gfx.SpriteTypes;
import ck2xtext.gfx.services.Ck2GfxGrammarAccess;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class Ck2GfxSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private Ck2GfxGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == Ck2gfxPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case Ck2gfxPackage.ANIMATED_SPRITE_TYPE:
				sequence_AnimatedSpriteType(context, (AnimatedSpriteType) semanticObject); 
				return; 
			case Ck2gfxPackage.ANIMATION:
				sequence_Animation(context, (Animation) semanticObject); 
				return; 
			case Ck2gfxPackage.ARROW_TYPE:
				sequence_ArrowType(context, (ArrowType) semanticObject); 
				return; 
			case Ck2gfxPackage.BITMAP_FONT:
				sequence_BitmapFont(context, (BitmapFont) semanticObject); 
				return; 
			case Ck2gfxPackage.BITMAP_FONTS:
				sequence_BitmapFonts(context, (BitmapFonts) semanticObject); 
				return; 
			case Ck2gfxPackage.COAT_OF_ARMS_LAYER:
				sequence_CoatOfArmsLayer(context, (CoatOfArmsLayer) semanticObject); 
				return; 
			case Ck2gfxPackage.COAT_OF_ARMS_TYPE:
				sequence_CoatOfArmsType(context, (CoatOfArmsType) semanticObject); 
				return; 
			case Ck2gfxPackage.COLOR:
				sequence_Color(context, (Color) semanticObject); 
				return; 
			case Ck2gfxPackage.COLOR_CODE:
				sequence_ColorCode(context, (ColorCode) semanticObject); 
				return; 
			case Ck2gfxPackage.COLOR_RATIO:
				sequence_ColorRatio(context, (ColorRatio) semanticObject); 
				return; 
			case Ck2gfxPackage.COORDINATES:
				sequence_Coordinates(context, (Coordinates) semanticObject); 
				return; 
			case Ck2gfxPackage.CORNERED_TILE_SPRITE_TYPE:
				sequence_CorneredTileSpriteType(context, (CorneredTileSpriteType) semanticObject); 
				return; 
			case Ck2gfxPackage.EMFX_ACTOR_TYPE:
				sequence_EMFXActorType(context, (EMFXActorType) semanticObject); 
				return; 
			case Ck2gfxPackage.LINE_CHART_TYPE:
				sequence_LineChartType(context, (LineChartType) semanticObject); 
				return; 
			case Ck2gfxPackage.MASKED_SHIELD_TYPE:
				sequence_MaskedShieldType(context, (MaskedShieldType) semanticObject); 
				return; 
			case Ck2gfxPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case Ck2gfxPackage.OBJECT_TYPES:
				sequence_ObjectTypes(context, (ObjectTypes) semanticObject); 
				return; 
			case Ck2gfxPackage.PDXMESH:
				sequence_Pdxmesh(context, (Pdxmesh) semanticObject); 
				return; 
			case Ck2gfxPackage.PORTRAIT_TYPE:
				sequence_PortraitType(context, (PortraitType) semanticObject); 
				return; 
			case Ck2gfxPackage.PROGRESSBAR_TYPE:
				sequence_ProgressbarType(context, (ProgressbarType) semanticObject); 
				return; 
			case Ck2gfxPackage.SPRITE_TYPE:
				sequence_SpriteType(context, (SpriteType) semanticObject); 
				return; 
			case Ck2gfxPackage.SPRITE_TYPES:
				sequence_SpriteTypes(context, (SpriteTypes) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     AnimatedSpriteType returns AnimatedSpriteType
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         texturefile=STRING 
	 *         noOfFrames=INT 
	 *         animationRateFps=Number 
	 *         looping=BOOL 
	 *         playOnShow=BOOL
	 *     )
	 * </pre>
	 */
	protected void sequence_AnimatedSpriteType(ISerializationContext context, AnimatedSpriteType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Ck2gfxPackage.Literals.ANIMATED_SPRITE_TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Ck2gfxPackage.Literals.ANIMATED_SPRITE_TYPE__NAME));
			if (transientValues.isValueTransient(semanticObject, Ck2gfxPackage.Literals.ANIMATED_SPRITE_TYPE__TEXTUREFILE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Ck2gfxPackage.Literals.ANIMATED_SPRITE_TYPE__TEXTUREFILE));
			if (transientValues.isValueTransient(semanticObject, Ck2gfxPackage.Literals.ANIMATED_SPRITE_TYPE__NO_OF_FRAMES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Ck2gfxPackage.Literals.ANIMATED_SPRITE_TYPE__NO_OF_FRAMES));
			if (transientValues.isValueTransient(semanticObject, Ck2gfxPackage.Literals.ANIMATED_SPRITE_TYPE__ANIMATION_RATE_FPS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Ck2gfxPackage.Literals.ANIMATED_SPRITE_TYPE__ANIMATION_RATE_FPS));
			if (transientValues.isValueTransient(semanticObject, Ck2gfxPackage.Literals.ANIMATED_SPRITE_TYPE__LOOPING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Ck2gfxPackage.Literals.ANIMATED_SPRITE_TYPE__LOOPING));
			if (transientValues.isValueTransient(semanticObject, Ck2gfxPackage.Literals.ANIMATED_SPRITE_TYPE__PLAY_ON_SHOW) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Ck2gfxPackage.Literals.ANIMATED_SPRITE_TYPE__PLAY_ON_SHOW));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAnimatedSpriteTypeAccess().getNameSTRINGTerminalRuleCall_5_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAnimatedSpriteTypeAccess().getTexturefileSTRINGTerminalRuleCall_8_0(), semanticObject.getTexturefile());
		feeder.accept(grammarAccess.getAnimatedSpriteTypeAccess().getNoOfFramesINTTerminalRuleCall_11_0(), semanticObject.getNoOfFrames());
		feeder.accept(grammarAccess.getAnimatedSpriteTypeAccess().getAnimationRateFpsNumberParserRuleCall_14_0(), semanticObject.getAnimationRateFps());
		feeder.accept(grammarAccess.getAnimatedSpriteTypeAccess().getLoopingBOOLTerminalRuleCall_17_0(), semanticObject.isLooping());
		feeder.accept(grammarAccess.getAnimatedSpriteTypeAccess().getPlayOnShowBOOLTerminalRuleCall_20_0(), semanticObject.isPlayOnShow());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Animation returns Animation
	 *
	 * Constraint:
	 *     (name=STRING file=STRING defaultAnimationTime=Number)
	 * </pre>
	 */
	protected void sequence_Animation(ISerializationContext context, Animation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Ck2gfxPackage.Literals.ANIMATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Ck2gfxPackage.Literals.ANIMATION__NAME));
			if (transientValues.isValueTransient(semanticObject, Ck2gfxPackage.Literals.ANIMATION__FILE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Ck2gfxPackage.Literals.ANIMATION__FILE));
			if (transientValues.isValueTransient(semanticObject, Ck2gfxPackage.Literals.ANIMATION__DEFAULT_ANIMATION_TIME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Ck2gfxPackage.Literals.ANIMATION__DEFAULT_ANIMATION_TIME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAnimationAccess().getNameSTRINGTerminalRuleCall_5_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAnimationAccess().getFileSTRINGTerminalRuleCall_8_0(), semanticObject.getFile());
		feeder.accept(grammarAccess.getAnimationAccess().getDefaultAnimationTimeNumberParserRuleCall_11_0(), semanticObject.getDefaultAnimationTime());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ArrowType returns ArrowType
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         size=Double 
	 *         textureFile=STRING 
	 *         bodyTexture=STRING 
	 *         color=ColorRatio 
	 *         color2=ColorRatio 
	 *         endAt=Double 
	 *         height=Double 
	 *         type=INT 
	 *         heading=Double 
	 *         effect=STRING
	 *     )
	 * </pre>
	 */
	protected void sequence_ArrowType(ISerializationContext context, ArrowType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Ck2gfxPackage.Literals.ARROW_TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Ck2gfxPackage.Literals.ARROW_TYPE__NAME));
			if (transientValues.isValueTransient(semanticObject, Ck2gfxPackage.Literals.ARROW_TYPE__SIZE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Ck2gfxPackage.Literals.ARROW_TYPE__SIZE));
			if (transientValues.isValueTransient(semanticObject, Ck2gfxPackage.Literals.ARROW_TYPE__TEXTURE_FILE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Ck2gfxPackage.Literals.ARROW_TYPE__TEXTURE_FILE));
			if (transientValues.isValueTransient(semanticObject, Ck2gfxPackage.Literals.ARROW_TYPE__BODY_TEXTURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Ck2gfxPackage.Literals.ARROW_TYPE__BODY_TEXTURE));
			if (transientValues.isValueTransient(semanticObject, Ck2gfxPackage.Literals.ARROW_TYPE__COLOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Ck2gfxPackage.Literals.ARROW_TYPE__COLOR));
			if (transientValues.isValueTransient(semanticObject, Ck2gfxPackage.Literals.ARROW_TYPE__COLOR2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Ck2gfxPackage.Literals.ARROW_TYPE__COLOR2));
			if (transientValues.isValueTransient(semanticObject, Ck2gfxPackage.Literals.ARROW_TYPE__END_AT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Ck2gfxPackage.Literals.ARROW_TYPE__END_AT));
			if (transientValues.isValueTransient(semanticObject, Ck2gfxPackage.Literals.ARROW_TYPE__HEIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Ck2gfxPackage.Literals.ARROW_TYPE__HEIGHT));
			if (transientValues.isValueTransient(semanticObject, Ck2gfxPackage.Literals.ARROW_TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Ck2gfxPackage.Literals.ARROW_TYPE__TYPE));
			if (transientValues.isValueTransient(semanticObject, Ck2gfxPackage.Literals.ARROW_TYPE__HEADING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Ck2gfxPackage.Literals.ARROW_TYPE__HEADING));
			if (transientValues.isValueTransient(semanticObject, Ck2gfxPackage.Literals.ARROW_TYPE__EFFECT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Ck2gfxPackage.Literals.ARROW_TYPE__EFFECT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getArrowTypeAccess().getNameSTRINGTerminalRuleCall_5_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getArrowTypeAccess().getSizeDoubleParserRuleCall_8_0(), semanticObject.getSize());
		feeder.accept(grammarAccess.getArrowTypeAccess().getTextureFileSTRINGTerminalRuleCall_11_0(), semanticObject.getTextureFile());
		feeder.accept(grammarAccess.getArrowTypeAccess().getBodyTextureSTRINGTerminalRuleCall_14_0(), semanticObject.getBodyTexture());
		feeder.accept(grammarAccess.getArrowTypeAccess().getColorColorRatioParserRuleCall_17_0(), semanticObject.getColor());
		feeder.accept(grammarAccess.getArrowTypeAccess().getColor2ColorRatioParserRuleCall_20_0(), semanticObject.getColor2());
		feeder.accept(grammarAccess.getArrowTypeAccess().getEndAtDoubleParserRuleCall_23_0(), semanticObject.getEndAt());
		feeder.accept(grammarAccess.getArrowTypeAccess().getHeightDoubleParserRuleCall_26_0(), semanticObject.getHeight());
		feeder.accept(grammarAccess.getArrowTypeAccess().getTypeINTTerminalRuleCall_29_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getArrowTypeAccess().getHeadingDoubleParserRuleCall_32_0(), semanticObject.getHeading());
		feeder.accept(grammarAccess.getArrowTypeAccess().getEffectSTRINGTerminalRuleCall_35_0(), semanticObject.getEffect());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     BitmapFont returns BitmapFont
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         fontName=STRING 
	 *         color=HEX 
	 *         effect=BOOL? 
	 *         colorcodes+=ColorCode* 
	 *         colorcodes+=ColorCode*
	 *     )
	 * </pre>
	 */
	protected void sequence_BitmapFont(ISerializationContext context, BitmapFont semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     BitmapFonts returns BitmapFonts
	 *
	 * Constraint:
	 *     types+=BitmapFont*
	 * </pre>
	 */
	protected void sequence_BitmapFonts(ISerializationContext context, BitmapFonts semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     CoatOfArmsLayer returns CoatOfArmsLayer
	 *
	 * Constraint:
	 *     (mask=STRING center=Coordinates scale=Number)
	 * </pre>
	 */
	protected void sequence_CoatOfArmsLayer(ISerializationContext context, CoatOfArmsLayer semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Ck2gfxPackage.Literals.COAT_OF_ARMS_LAYER__MASK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Ck2gfxPackage.Literals.COAT_OF_ARMS_LAYER__MASK));
			if (transientValues.isValueTransient(semanticObject, Ck2gfxPackage.Literals.COAT_OF_ARMS_LAYER__CENTER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Ck2gfxPackage.Literals.COAT_OF_ARMS_LAYER__CENTER));
			if (transientValues.isValueTransient(semanticObject, Ck2gfxPackage.Literals.COAT_OF_ARMS_LAYER__SCALE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Ck2gfxPackage.Literals.COAT_OF_ARMS_LAYER__SCALE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCoatOfArmsLayerAccess().getMaskSTRINGTerminalRuleCall_5_0(), semanticObject.getMask());
		feeder.accept(grammarAccess.getCoatOfArmsLayerAccess().getCenterCoordinatesParserRuleCall_8_0(), semanticObject.getCenter());
		feeder.accept(grammarAccess.getCoatOfArmsLayerAccess().getScaleNumberParserRuleCall_11_0(), semanticObject.getScale());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     CoatOfArmsType returns CoatOfArmsType
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         frame=STRING 
	 *         mask=STRING 
	 *         sealOverlay=STRING 
	 *         effect=STRING 
	 *         layers+=CoatOfArmsLayer+
	 *     )
	 * </pre>
	 */
	protected void sequence_CoatOfArmsType(ISerializationContext context, CoatOfArmsType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ColorCode returns ColorCode
	 *
	 * Constraint:
	 *     (key=ID value=Color)
	 * </pre>
	 */
	protected void sequence_ColorCode(ISerializationContext context, ColorCode semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Ck2gfxPackage.Literals.COLOR_CODE__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Ck2gfxPackage.Literals.COLOR_CODE__KEY));
			if (transientValues.isValueTransient(semanticObject, Ck2gfxPackage.Literals.COLOR_CODE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Ck2gfxPackage.Literals.COLOR_CODE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getColorCodeAccess().getKeyIDTerminalRuleCall_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getColorCodeAccess().getValueColorParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ColorRatio returns ColorRatio
	 *
	 * Constraint:
	 *     (r=Double g=Double b=Double)
	 * </pre>
	 */
	protected void sequence_ColorRatio(ISerializationContext context, ColorRatio semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Ck2gfxPackage.Literals.COLOR_RATIO__R) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Ck2gfxPackage.Literals.COLOR_RATIO__R));
			if (transientValues.isValueTransient(semanticObject, Ck2gfxPackage.Literals.COLOR_RATIO__G) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Ck2gfxPackage.Literals.COLOR_RATIO__G));
			if (transientValues.isValueTransient(semanticObject, Ck2gfxPackage.Literals.COLOR_RATIO__B) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Ck2gfxPackage.Literals.COLOR_RATIO__B));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getColorRatioAccess().getRDoubleParserRuleCall_1_0(), semanticObject.getR());
		feeder.accept(grammarAccess.getColorRatioAccess().getGDoubleParserRuleCall_2_0(), semanticObject.getG());
		feeder.accept(grammarAccess.getColorRatioAccess().getBDoubleParserRuleCall_3_0(), semanticObject.getB());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Color returns Color
	 *
	 * Constraint:
	 *     (r=INT g=INT b=INT)
	 * </pre>
	 */
	protected void sequence_Color(ISerializationContext context, Color semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Ck2gfxPackage.Literals.COLOR__R) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Ck2gfxPackage.Literals.COLOR__R));
			if (transientValues.isValueTransient(semanticObject, Ck2gfxPackage.Literals.COLOR__G) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Ck2gfxPackage.Literals.COLOR__G));
			if (transientValues.isValueTransient(semanticObject, Ck2gfxPackage.Literals.COLOR__B) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Ck2gfxPackage.Literals.COLOR__B));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getColorAccess().getRINTTerminalRuleCall_1_0(), semanticObject.getR());
		feeder.accept(grammarAccess.getColorAccess().getGINTTerminalRuleCall_2_0(), semanticObject.getG());
		feeder.accept(grammarAccess.getColorAccess().getBINTTerminalRuleCall_3_0(), semanticObject.getB());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Coordinates returns Coordinates
	 *
	 * Constraint:
	 *     (x=Number y=Number)
	 * </pre>
	 */
	protected void sequence_Coordinates(ISerializationContext context, Coordinates semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Ck2gfxPackage.Literals.COORDINATES__X) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Ck2gfxPackage.Literals.COORDINATES__X));
			if (transientValues.isValueTransient(semanticObject, Ck2gfxPackage.Literals.COORDINATES__Y) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Ck2gfxPackage.Literals.COORDINATES__Y));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCoordinatesAccess().getXNumberParserRuleCall_3_0(), semanticObject.getX());
		feeder.accept(grammarAccess.getCoordinatesAccess().getYNumberParserRuleCall_6_0(), semanticObject.getY());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     CorneredTileSpriteType returns CorneredTileSpriteType
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         size=Coordinates? 
	 *         texturefile=STRING? 
	 *         texturefile=STRING? 
	 *         borderSize=Coordinates? 
	 *         allwaysTransparent=BOOL? 
	 *         noRefCount=BOOL? 
	 *         loadType=STRING? 
	 *         tilingCenter=BOOL?
	 *     )
	 * </pre>
	 */
	protected void sequence_CorneredTileSpriteType(ISerializationContext context, CorneredTileSpriteType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     EMFXActorType returns EMFXActorType
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         actorFile=STRING 
	 *         animation=Animation? 
	 *         (
	 *             idle=STRING | 
	 *             move=STRING | 
	 *             attack=STRING | 
	 *             scale=Double | 
	 *             useAnimation=BOOL | 
	 *             cullDistance=Double | 
	 *             scaleOnCullDistance=BOOL
	 *         )*
	 *     )
	 * </pre>
	 */
	protected void sequence_EMFXActorType(ISerializationContext context, EMFXActorType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     LineChartType returns LineChartType
	 *
	 * Constraint:
	 *     (name=STRING size=Coordinates lineWidth=INT)
	 * </pre>
	 */
	protected void sequence_LineChartType(ISerializationContext context, LineChartType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Ck2gfxPackage.Literals.LINE_CHART_TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Ck2gfxPackage.Literals.LINE_CHART_TYPE__NAME));
			if (transientValues.isValueTransient(semanticObject, Ck2gfxPackage.Literals.LINE_CHART_TYPE__SIZE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Ck2gfxPackage.Literals.LINE_CHART_TYPE__SIZE));
			if (transientValues.isValueTransient(semanticObject, Ck2gfxPackage.Literals.LINE_CHART_TYPE__LINE_WIDTH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Ck2gfxPackage.Literals.LINE_CHART_TYPE__LINE_WIDTH));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLineChartTypeAccess().getNameSTRINGTerminalRuleCall_5_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getLineChartTypeAccess().getSizeCoordinatesParserRuleCall_8_0(), semanticObject.getSize());
		feeder.accept(grammarAccess.getLineChartTypeAccess().getLineWidthINTTerminalRuleCall_11_0(), semanticObject.getLineWidth());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     MaskedShieldType returns MaskedShieldType
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         textureFile1=STRING 
	 *         textureFile2=STRING 
	 *         effectFile=STRING 
	 *         allwaysTransparent=BOOL? 
	 *         clickSound=ID?
	 *     )
	 * </pre>
	 */
	protected void sequence_MaskedShieldType(ISerializationContext context, MaskedShieldType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (types+=SpriteTypes | types+=ObjectTypes | types+=BitmapFonts)+
	 * </pre>
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ObjectTypes returns ObjectTypes
	 *
	 * Constraint:
	 *     (types+=EMFXActorType | types+=Pdxmesh | types+=ArrowType)*
	 * </pre>
	 */
	protected void sequence_ObjectTypes(ISerializationContext context, ObjectTypes semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Pdxmesh returns Pdxmesh
	 *
	 * Constraint:
	 *     (name=STRING actorFile=STRING scale=Number cullDistance=Double? scaleOnCullDistance=BOOL?)
	 * </pre>
	 */
	protected void sequence_Pdxmesh(ISerializationContext context, Pdxmesh semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     PortraitType returns PortraitType
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         effectFile=STRING 
	 *         layers+=STRING+ 
	 *         hairColorIndex=INT? 
	 *         hairColor+=Color* 
	 *         eyeColorIndex=INT? 
	 *         eyeColor+=Color* 
	 *         headgearThatHidesHair+=INT*
	 *     )
	 * </pre>
	 */
	protected void sequence_PortraitType(ISerializationContext context, PortraitType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ProgressbarType returns ProgressbarType
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         color=ColorRatio 
	 *         color2=ColorRatio 
	 *         textureFile1=STRING? 
	 *         textureFile2=STRING? 
	 *         (size=Coordinates | horizontal=BOOL)* 
	 *         effectFile=STRING 
	 *         allwaysTransparent=BOOL? 
	 *         maxValue=Number? 
	 *         loadType=STRING? 
	 *         noRefCount=BOOL?
	 *     )
	 * </pre>
	 */
	protected void sequence_ProgressbarType(ISerializationContext context, ProgressbarType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SpriteType returns SpriteType
	 *
	 * Constraint:
	 *     (
	 *         name=STRING | 
	 *         textureFile=STRING | 
	 *         noOfFrames=INT | 
	 *         loadType=STRING | 
	 *         allwaysTransparent=BOOL | 
	 *         noRefCount=BOOL | 
	 *         effectFile=STRING | 
	 *         transparenceCheck=BOOL | 
	 *         canBeLowres=BOOL | 
	 *         clickSound=ID
	 *     )+
	 * </pre>
	 */
	protected void sequence_SpriteType(ISerializationContext context, SpriteType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SpriteTypes returns SpriteTypes
	 *
	 * Constraint:
	 *     (
	 *         types+=SpriteType | 
	 *         types+=AnimatedSpriteType | 
	 *         types+=CorneredTileSpriteType | 
	 *         types+=ProgressbarType | 
	 *         types+=CoatOfArmsType | 
	 *         types+=PortraitType | 
	 *         types+=MaskedShieldType | 
	 *         types+=LineChartType
	 *     )*
	 * </pre>
	 */
	protected void sequence_SpriteTypes(ISerializationContext context, SpriteTypes semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}

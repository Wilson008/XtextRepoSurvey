/*
 * generated by Xtext 2.35.0
 */
package de.altimos.mdsd.majordomo.dsl.serializer;

import com.google.inject.Inject;
import de.altimos.mdsd.majordomo.dsl.services.MajordomoDslGrammarAccess;
import java.util.Set;
import majordomo.ActionSetReference;
import majordomo.BinaryAndOperation;
import majordomo.BinaryOrOperation;
import majordomo.BoilerActor;
import majordomo.BooleanAction;
import majordomo.BooleanSensorStatement;
import majordomo.ClockSensor;
import majordomo.CoffeeActor;
import majordomo.CompareOperation;
import majordomo.ConstantValue;
import majordomo.FloatAction;
import majordomo.House;
import majordomo.LampActor;
import majordomo.LightSensor;
import majordomo.Majordomo;
import majordomo.MajordomoPackage;
import majordomo.NotOperation;
import majordomo.NumberSensor;
import majordomo.PreparedActionSet;
import majordomo.PreparedStatement;
import majordomo.PreparedValue;
import majordomo.Program;
import majordomo.RadiatorActor;
import majordomo.RainSensor;
import majordomo.RollerActor;
import majordomo.RoofWindowActor;
import majordomo.Room;
import majordomo.Rule;
import majordomo.SensorValue;
import majordomo.StatementReference;
import majordomo.SwitchSensor;
import majordomo.TemperatureSensor;
import majordomo.ValueReference;
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
public class MajordomoDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MajordomoDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MajordomoPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MajordomoPackage.ACTION_SET_REFERENCE:
				sequence_ActionSetReference(context, (ActionSetReference) semanticObject); 
				return; 
			case MajordomoPackage.BINARY_AND_OPERATION:
				sequence_BinaryAndOperation(context, (BinaryAndOperation) semanticObject); 
				return; 
			case MajordomoPackage.BINARY_OR_OPERATION:
				sequence_BinaryOrOperation(context, (BinaryOrOperation) semanticObject); 
				return; 
			case MajordomoPackage.BOILER_ACTOR:
				sequence_BoilerActor(context, (BoilerActor) semanticObject); 
				return; 
			case MajordomoPackage.BOOLEAN_ACTION:
				sequence_BooleanAction(context, (BooleanAction) semanticObject); 
				return; 
			case MajordomoPackage.BOOLEAN_SENSOR_STATEMENT:
				sequence_BooleanSensorStatement(context, (BooleanSensorStatement) semanticObject); 
				return; 
			case MajordomoPackage.CLOCK_SENSOR:
				sequence_ClockSensor(context, (ClockSensor) semanticObject); 
				return; 
			case MajordomoPackage.COFFEE_ACTOR:
				sequence_CoffeeActor(context, (CoffeeActor) semanticObject); 
				return; 
			case MajordomoPackage.COMPARE_OPERATION:
				sequence_CompareOperation(context, (CompareOperation) semanticObject); 
				return; 
			case MajordomoPackage.CONSTANT_VALUE:
				sequence_ConstantValue(context, (ConstantValue) semanticObject); 
				return; 
			case MajordomoPackage.FLOAT_ACTION:
				sequence_FloatAction(context, (FloatAction) semanticObject); 
				return; 
			case MajordomoPackage.HOUSE:
				sequence_House(context, (House) semanticObject); 
				return; 
			case MajordomoPackage.LAMP_ACTOR:
				sequence_LampActor(context, (LampActor) semanticObject); 
				return; 
			case MajordomoPackage.LIGHT_SENSOR:
				sequence_LightSensor(context, (LightSensor) semanticObject); 
				return; 
			case MajordomoPackage.MAJORDOMO:
				sequence_Majordomo(context, (Majordomo) semanticObject); 
				return; 
			case MajordomoPackage.NOT_OPERATION:
				sequence_NotOperation(context, (NotOperation) semanticObject); 
				return; 
			case MajordomoPackage.NUMBER_SENSOR:
				sequence_NumberSensor(context, (NumberSensor) semanticObject); 
				return; 
			case MajordomoPackage.PREPARED_ACTION_SET:
				sequence_PreparedActionSet(context, (PreparedActionSet) semanticObject); 
				return; 
			case MajordomoPackage.PREPARED_STATEMENT:
				sequence_PreparedStatement(context, (PreparedStatement) semanticObject); 
				return; 
			case MajordomoPackage.PREPARED_VALUE:
				sequence_PreparedValue(context, (PreparedValue) semanticObject); 
				return; 
			case MajordomoPackage.PROGRAM:
				sequence_Program(context, (Program) semanticObject); 
				return; 
			case MajordomoPackage.RADIATOR_ACTOR:
				sequence_RadiatorActor(context, (RadiatorActor) semanticObject); 
				return; 
			case MajordomoPackage.RAIN_SENSOR:
				sequence_RainSensor(context, (RainSensor) semanticObject); 
				return; 
			case MajordomoPackage.ROLLER_ACTOR:
				sequence_RollerActor(context, (RollerActor) semanticObject); 
				return; 
			case MajordomoPackage.ROOF_WINDOW_ACTOR:
				sequence_RoofWindowActor(context, (RoofWindowActor) semanticObject); 
				return; 
			case MajordomoPackage.ROOM:
				sequence_Room(context, (Room) semanticObject); 
				return; 
			case MajordomoPackage.RULE:
				sequence_Rule(context, (Rule) semanticObject); 
				return; 
			case MajordomoPackage.SENSOR_VALUE:
				sequence_SensorValue(context, (SensorValue) semanticObject); 
				return; 
			case MajordomoPackage.STATEMENT_REFERENCE:
				sequence_StatementReference(context, (StatementReference) semanticObject); 
				return; 
			case MajordomoPackage.SWITCH_SENSOR:
				sequence_SwitchSensor(context, (SwitchSensor) semanticObject); 
				return; 
			case MajordomoPackage.TEMPERATURE_SENSOR:
				sequence_TemperatureSensor(context, (TemperatureSensor) semanticObject); 
				return; 
			case MajordomoPackage.VALUE_REFERENCE:
				sequence_ValueReference(context, (ValueReference) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     ActionSetReference returns ActionSetReference
	 *     Action returns ActionSetReference
	 *
	 * Constraint:
	 *     ref=[PreparedActionSet|Name]
	 * </pre>
	 */
	protected void sequence_ActionSetReference(ISerializationContext context, ActionSetReference semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MajordomoPackage.Literals.ACTION_SET_REFERENCE__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MajordomoPackage.Literals.ACTION_SET_REFERENCE__REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getActionSetReferenceAccess().getRefPreparedActionSetNameParserRuleCall_0_1(), semanticObject.eGet(MajordomoPackage.Literals.ACTION_SET_REFERENCE__REF, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Statement returns BinaryAndOperation
	 *     BinaryOrOperation returns BinaryAndOperation
	 *     BinaryOrOperation.BinaryOrOperation_1_0 returns BinaryAndOperation
	 *     BinaryAndOperation returns BinaryAndOperation
	 *     BinaryAndOperation.BinaryAndOperation_1_0 returns BinaryAndOperation
	 *     NotOperation returns BinaryAndOperation
	 *     UnaryStatement returns BinaryAndOperation
	 *
	 * Constraint:
	 *     (left=BinaryAndOperation_BinaryAndOperation_1_0 right=NotOperation)
	 * </pre>
	 */
	protected void sequence_BinaryAndOperation(ISerializationContext context, BinaryAndOperation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MajordomoPackage.Literals.BINARY_OPERATION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MajordomoPackage.Literals.BINARY_OPERATION__LEFT));
			if (transientValues.isValueTransient(semanticObject, MajordomoPackage.Literals.BINARY_OPERATION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MajordomoPackage.Literals.BINARY_OPERATION__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBinaryAndOperationAccess().getBinaryAndOperationLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getBinaryAndOperationAccess().getRightNotOperationParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Statement returns BinaryOrOperation
	 *     BinaryOrOperation returns BinaryOrOperation
	 *     BinaryOrOperation.BinaryOrOperation_1_0 returns BinaryOrOperation
	 *     BinaryAndOperation returns BinaryOrOperation
	 *     BinaryAndOperation.BinaryAndOperation_1_0 returns BinaryOrOperation
	 *     NotOperation returns BinaryOrOperation
	 *     UnaryStatement returns BinaryOrOperation
	 *
	 * Constraint:
	 *     (left=BinaryOrOperation_BinaryOrOperation_1_0 right=BinaryAndOperation)
	 * </pre>
	 */
	protected void sequence_BinaryOrOperation(ISerializationContext context, BinaryOrOperation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MajordomoPackage.Literals.BINARY_OPERATION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MajordomoPackage.Literals.BINARY_OPERATION__LEFT));
			if (transientValues.isValueTransient(semanticObject, MajordomoPackage.Literals.BINARY_OPERATION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MajordomoPackage.Literals.BINARY_OPERATION__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBinaryOrOperationAccess().getBinaryOrOperationLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getBinaryOrOperationAccess().getRightBinaryAndOperationParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Actor returns BoilerActor
	 *     BoilerActor returns BoilerActor
	 *
	 * Constraint:
	 *     name=Name
	 * </pre>
	 */
	protected void sequence_BoilerActor(ISerializationContext context, BoilerActor semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MajordomoPackage.Literals.EXTENSION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MajordomoPackage.Literals.EXTENSION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBoilerActorAccess().getNameNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Action returns BooleanAction
	 *     BooleanAction returns BooleanAction
	 *
	 * Constraint:
	 *     (actor=[BooleanActor|QualifiedName] value=EBoolean)
	 * </pre>
	 */
	protected void sequence_BooleanAction(ISerializationContext context, BooleanAction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MajordomoPackage.Literals.BOOLEAN_ACTION__ACTOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MajordomoPackage.Literals.BOOLEAN_ACTION__ACTOR));
			if (transientValues.isValueTransient(semanticObject, MajordomoPackage.Literals.BOOLEAN_ACTION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MajordomoPackage.Literals.BOOLEAN_ACTION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBooleanActionAccess().getActorBooleanActorQualifiedNameParserRuleCall_0_0_1(), semanticObject.eGet(MajordomoPackage.Literals.BOOLEAN_ACTION__ACTOR, false));
		feeder.accept(grammarAccess.getBooleanActionAccess().getValueEBooleanParserRuleCall_2_0(), semanticObject.isValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Statement returns BooleanSensorStatement
	 *     BinaryOrOperation returns BooleanSensorStatement
	 *     BinaryOrOperation.BinaryOrOperation_1_0 returns BooleanSensorStatement
	 *     BinaryAndOperation returns BooleanSensorStatement
	 *     BinaryAndOperation.BinaryAndOperation_1_0 returns BooleanSensorStatement
	 *     NotOperation returns BooleanSensorStatement
	 *     UnaryStatement returns BooleanSensorStatement
	 *     BooleanSensorStatement returns BooleanSensorStatement
	 *
	 * Constraint:
	 *     sensor=[BooleanSensor|QualifiedName]
	 * </pre>
	 */
	protected void sequence_BooleanSensorStatement(ISerializationContext context, BooleanSensorStatement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MajordomoPackage.Literals.BOOLEAN_SENSOR_STATEMENT__SENSOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MajordomoPackage.Literals.BOOLEAN_SENSOR_STATEMENT__SENSOR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBooleanSensorStatementAccess().getSensorBooleanSensorQualifiedNameParserRuleCall_0_0_1(), semanticObject.eGet(MajordomoPackage.Literals.BOOLEAN_SENSOR_STATEMENT__SENSOR, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Sensor returns ClockSensor
	 *     ClockSensor returns ClockSensor
	 *
	 * Constraint:
	 *     name=Name
	 * </pre>
	 */
	protected void sequence_ClockSensor(ISerializationContext context, ClockSensor semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MajordomoPackage.Literals.EXTENSION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MajordomoPackage.Literals.EXTENSION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getClockSensorAccess().getNameNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Actor returns CoffeeActor
	 *     CoffeeActor returns CoffeeActor
	 *
	 * Constraint:
	 *     name=Name
	 * </pre>
	 */
	protected void sequence_CoffeeActor(ISerializationContext context, CoffeeActor semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MajordomoPackage.Literals.EXTENSION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MajordomoPackage.Literals.EXTENSION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCoffeeActorAccess().getNameNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Statement returns CompareOperation
	 *     BinaryOrOperation returns CompareOperation
	 *     BinaryOrOperation.BinaryOrOperation_1_0 returns CompareOperation
	 *     BinaryAndOperation returns CompareOperation
	 *     BinaryAndOperation.BinaryAndOperation_1_0 returns CompareOperation
	 *     NotOperation returns CompareOperation
	 *     UnaryStatement returns CompareOperation
	 *     CompareOperation returns CompareOperation
	 *
	 * Constraint:
	 *     (left=ValueExpression comparator=Comparator right=ValueExpression)
	 * </pre>
	 */
	protected void sequence_CompareOperation(ISerializationContext context, CompareOperation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MajordomoPackage.Literals.COMPARE_OPERATION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MajordomoPackage.Literals.COMPARE_OPERATION__LEFT));
			if (transientValues.isValueTransient(semanticObject, MajordomoPackage.Literals.COMPARE_OPERATION__COMPARATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MajordomoPackage.Literals.COMPARE_OPERATION__COMPARATOR));
			if (transientValues.isValueTransient(semanticObject, MajordomoPackage.Literals.COMPARE_OPERATION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MajordomoPackage.Literals.COMPARE_OPERATION__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCompareOperationAccess().getLeftValueExpressionParserRuleCall_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getCompareOperationAccess().getComparatorComparatorEnumRuleCall_1_0(), semanticObject.getComparator());
		feeder.accept(grammarAccess.getCompareOperationAccess().getRightValueExpressionParserRuleCall_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ValueExpression returns ConstantValue
	 *     ConstantValue returns ConstantValue
	 *
	 * Constraint:
	 *     value=EFloat
	 * </pre>
	 */
	protected void sequence_ConstantValue(ISerializationContext context, ConstantValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MajordomoPackage.Literals.CONSTANT_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MajordomoPackage.Literals.CONSTANT_VALUE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConstantValueAccess().getValueEFloatParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Action returns FloatAction
	 *     FloatAction returns FloatAction
	 *
	 * Constraint:
	 *     (actor=[FloatActor|QualifiedName] value=EFloat)
	 * </pre>
	 */
	protected void sequence_FloatAction(ISerializationContext context, FloatAction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MajordomoPackage.Literals.FLOAT_ACTION__ACTOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MajordomoPackage.Literals.FLOAT_ACTION__ACTOR));
			if (transientValues.isValueTransient(semanticObject, MajordomoPackage.Literals.FLOAT_ACTION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MajordomoPackage.Literals.FLOAT_ACTION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFloatActionAccess().getActorFloatActorQualifiedNameParserRuleCall_0_0_1(), semanticObject.eGet(MajordomoPackage.Literals.FLOAT_ACTION__ACTOR, false));
		feeder.accept(grammarAccess.getFloatActionAccess().getValueEFloatParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     House returns House
	 *
	 * Constraint:
	 *     (sensors+=Sensor | actors+=Actor)*
	 * </pre>
	 */
	protected void sequence_House(ISerializationContext context, House semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Actor returns LampActor
	 *     LampActor returns LampActor
	 *
	 * Constraint:
	 *     name=Name
	 * </pre>
	 */
	protected void sequence_LampActor(ISerializationContext context, LampActor semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MajordomoPackage.Literals.EXTENSION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MajordomoPackage.Literals.EXTENSION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLampActorAccess().getNameNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Sensor returns LightSensor
	 *     LightSensor returns LightSensor
	 *
	 * Constraint:
	 *     name=Name
	 * </pre>
	 */
	protected void sequence_LightSensor(ISerializationContext context, LightSensor semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MajordomoPackage.Literals.EXTENSION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MajordomoPackage.Literals.EXTENSION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLightSensorAccess().getNameNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Majordomo returns Majordomo
	 *
	 * Constraint:
	 *     (house=House? rooms+=Room* program=Program)
	 * </pre>
	 */
	protected void sequence_Majordomo(ISerializationContext context, Majordomo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Statement returns NotOperation
	 *     BinaryOrOperation returns NotOperation
	 *     BinaryOrOperation.BinaryOrOperation_1_0 returns NotOperation
	 *     BinaryAndOperation returns NotOperation
	 *     BinaryAndOperation.BinaryAndOperation_1_0 returns NotOperation
	 *     NotOperation returns NotOperation
	 *     UnaryStatement returns NotOperation
	 *
	 * Constraint:
	 *     statement=UnaryStatement
	 * </pre>
	 */
	protected void sequence_NotOperation(ISerializationContext context, NotOperation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MajordomoPackage.Literals.NOT_OPERATION__STATEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MajordomoPackage.Literals.NOT_OPERATION__STATEMENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNotOperationAccess().getStatementUnaryStatementParserRuleCall_1_2_0(), semanticObject.getStatement());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Sensor returns NumberSensor
	 *     NumberSensor returns NumberSensor
	 *
	 * Constraint:
	 *     name=Name
	 * </pre>
	 */
	protected void sequence_NumberSensor(ISerializationContext context, NumberSensor semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MajordomoPackage.Literals.EXTENSION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MajordomoPackage.Literals.EXTENSION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNumberSensorAccess().getNameNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     PreparedActionSet returns PreparedActionSet
	 *
	 * Constraint:
	 *     (name=Name actions+=Action actions+=Action*)
	 * </pre>
	 */
	protected void sequence_PreparedActionSet(ISerializationContext context, PreparedActionSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     PreparedStatement returns PreparedStatement
	 *
	 * Constraint:
	 *     (name=Name statement=Statement)
	 * </pre>
	 */
	protected void sequence_PreparedStatement(ISerializationContext context, PreparedStatement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MajordomoPackage.Literals.PREPARED_STATEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MajordomoPackage.Literals.PREPARED_STATEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, MajordomoPackage.Literals.PREPARED_STATEMENT__STATEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MajordomoPackage.Literals.PREPARED_STATEMENT__STATEMENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPreparedStatementAccess().getNameNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPreparedStatementAccess().getStatementStatementParserRuleCall_3_0(), semanticObject.getStatement());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     PreparedValue returns PreparedValue
	 *
	 * Constraint:
	 *     (name=ConstID value=ValueExpression)
	 * </pre>
	 */
	protected void sequence_PreparedValue(ISerializationContext context, PreparedValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MajordomoPackage.Literals.PREPARED_VALUE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MajordomoPackage.Literals.PREPARED_VALUE__NAME));
			if (transientValues.isValueTransient(semanticObject, MajordomoPackage.Literals.PREPARED_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MajordomoPackage.Literals.PREPARED_VALUE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPreparedValueAccess().getNameConstIDParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPreparedValueAccess().getValueValueExpressionParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Program returns Program
	 *
	 * Constraint:
	 *     (rules+=Rule | preparedStatements+=PreparedStatement | preparedActionSets+=PreparedActionSet | constants+=PreparedValue)*
	 * </pre>
	 */
	protected void sequence_Program(ISerializationContext context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Actor returns RadiatorActor
	 *     RadiatorActor returns RadiatorActor
	 *
	 * Constraint:
	 *     name=Name
	 * </pre>
	 */
	protected void sequence_RadiatorActor(ISerializationContext context, RadiatorActor semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MajordomoPackage.Literals.EXTENSION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MajordomoPackage.Literals.EXTENSION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRadiatorActorAccess().getNameNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Sensor returns RainSensor
	 *     RainSensor returns RainSensor
	 *
	 * Constraint:
	 *     name=Name
	 * </pre>
	 */
	protected void sequence_RainSensor(ISerializationContext context, RainSensor semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MajordomoPackage.Literals.EXTENSION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MajordomoPackage.Literals.EXTENSION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRainSensorAccess().getNameNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Actor returns RollerActor
	 *     RollerActor returns RollerActor
	 *
	 * Constraint:
	 *     name=Name
	 * </pre>
	 */
	protected void sequence_RollerActor(ISerializationContext context, RollerActor semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MajordomoPackage.Literals.EXTENSION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MajordomoPackage.Literals.EXTENSION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRollerActorAccess().getNameNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Actor returns RoofWindowActor
	 *     RoofWindowActor returns RoofWindowActor
	 *
	 * Constraint:
	 *     name=Name
	 * </pre>
	 */
	protected void sequence_RoofWindowActor(ISerializationContext context, RoofWindowActor semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MajordomoPackage.Literals.EXTENSION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MajordomoPackage.Literals.EXTENSION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRoofWindowActorAccess().getNameNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Room returns Room
	 *
	 * Constraint:
	 *     (name=Name (sensors+=Sensor | actors+=Actor)*)
	 * </pre>
	 */
	protected void sequence_Room(ISerializationContext context, Room semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Rule returns Rule
	 *
	 * Constraint:
	 *     (statement=Statement actions+=Action actions+=Action*)
	 * </pre>
	 */
	protected void sequence_Rule(ISerializationContext context, Rule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ValueExpression returns SensorValue
	 *     SensorValue returns SensorValue
	 *
	 * Constraint:
	 *     sensor=[FloatSensor|QualifiedName]
	 * </pre>
	 */
	protected void sequence_SensorValue(ISerializationContext context, SensorValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MajordomoPackage.Literals.SENSOR_VALUE__SENSOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MajordomoPackage.Literals.SENSOR_VALUE__SENSOR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSensorValueAccess().getSensorFloatSensorQualifiedNameParserRuleCall_0_1(), semanticObject.eGet(MajordomoPackage.Literals.SENSOR_VALUE__SENSOR, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Statement returns StatementReference
	 *     BinaryOrOperation returns StatementReference
	 *     BinaryOrOperation.BinaryOrOperation_1_0 returns StatementReference
	 *     BinaryAndOperation returns StatementReference
	 *     BinaryAndOperation.BinaryAndOperation_1_0 returns StatementReference
	 *     NotOperation returns StatementReference
	 *     UnaryStatement returns StatementReference
	 *     StatementReference returns StatementReference
	 *
	 * Constraint:
	 *     ref=[PreparedStatement|Name]
	 * </pre>
	 */
	protected void sequence_StatementReference(ISerializationContext context, StatementReference semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MajordomoPackage.Literals.STATEMENT_REFERENCE__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MajordomoPackage.Literals.STATEMENT_REFERENCE__REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStatementReferenceAccess().getRefPreparedStatementNameParserRuleCall_0_1(), semanticObject.eGet(MajordomoPackage.Literals.STATEMENT_REFERENCE__REF, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Sensor returns SwitchSensor
	 *     SwitchSensor returns SwitchSensor
	 *
	 * Constraint:
	 *     name=Name
	 * </pre>
	 */
	protected void sequence_SwitchSensor(ISerializationContext context, SwitchSensor semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MajordomoPackage.Literals.EXTENSION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MajordomoPackage.Literals.EXTENSION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSwitchSensorAccess().getNameNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Sensor returns TemperatureSensor
	 *     TemperatureSensor returns TemperatureSensor
	 *
	 * Constraint:
	 *     name=Name
	 * </pre>
	 */
	protected void sequence_TemperatureSensor(ISerializationContext context, TemperatureSensor semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MajordomoPackage.Literals.EXTENSION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MajordomoPackage.Literals.EXTENSION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTemperatureSensorAccess().getNameNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ValueExpression returns ValueReference
	 *     ValueReference returns ValueReference
	 *
	 * Constraint:
	 *     ref=[PreparedValue|ConstID]
	 * </pre>
	 */
	protected void sequence_ValueReference(ISerializationContext context, ValueReference semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MajordomoPackage.Literals.VALUE_REFERENCE__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MajordomoPackage.Literals.VALUE_REFERENCE__REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getValueReferenceAccess().getRefPreparedValueConstIDParserRuleCall_0_1(), semanticObject.eGet(MajordomoPackage.Literals.VALUE_REFERENCE__REF, false));
		feeder.finish();
	}
	
	
}

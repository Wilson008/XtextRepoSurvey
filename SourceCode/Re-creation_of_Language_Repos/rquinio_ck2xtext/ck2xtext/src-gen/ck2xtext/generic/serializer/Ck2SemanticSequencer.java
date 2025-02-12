/*
 * generated by Xtext 2.35.0
 */
package ck2xtext.generic.serializer;

import ck2xtext.generic.ck2.BoolClauseProperty;
import ck2xtext.generic.ck2.BoolProperty;
import ck2xtext.generic.ck2.Ck2Package;
import ck2xtext.generic.ck2.CommandProperty;
import ck2xtext.generic.ck2.DateClauseProperty;
import ck2xtext.generic.ck2.DateProperty;
import ck2xtext.generic.ck2.DoubleProperty;
import ck2xtext.generic.ck2.HexadecimalProperty;
import ck2xtext.generic.ck2.IdClauseProperty;
import ck2xtext.generic.ck2.IdProperty;
import ck2xtext.generic.ck2.IntClauseProperty;
import ck2xtext.generic.ck2.IntegerProperty;
import ck2xtext.generic.ck2.List;
import ck2xtext.generic.ck2.ListProperty;
import ck2xtext.generic.ck2.Model;
import ck2xtext.generic.ck2.ProbabilityProperty;
import ck2xtext.generic.ck2.StringProperty;
import ck2xtext.generic.services.Ck2GrammarAccess;
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
public class Ck2SemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private Ck2GrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == Ck2Package.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case Ck2Package.BOOL_CLAUSE_PROPERTY:
				sequence_BoolClauseProperty(context, (BoolClauseProperty) semanticObject); 
				return; 
			case Ck2Package.BOOL_PROPERTY:
				sequence_BoolProperty(context, (BoolProperty) semanticObject); 
				return; 
			case Ck2Package.COMMAND_PROPERTY:
				sequence_CommandProperty(context, (CommandProperty) semanticObject); 
				return; 
			case Ck2Package.DATE_CLAUSE_PROPERTY:
				sequence_DateClauseProperty(context, (DateClauseProperty) semanticObject); 
				return; 
			case Ck2Package.DATE_PROPERTY:
				sequence_DateProperty(context, (DateProperty) semanticObject); 
				return; 
			case Ck2Package.DOUBLE_PROPERTY:
				sequence_DoubleProperty(context, (DoubleProperty) semanticObject); 
				return; 
			case Ck2Package.HEXADECIMAL_PROPERTY:
				sequence_HexadecimalProperty(context, (HexadecimalProperty) semanticObject); 
				return; 
			case Ck2Package.ID_CLAUSE_PROPERTY:
				sequence_IdClauseProperty(context, (IdClauseProperty) semanticObject); 
				return; 
			case Ck2Package.ID_PROPERTY:
				sequence_IdProperty(context, (IdProperty) semanticObject); 
				return; 
			case Ck2Package.INT_CLAUSE_PROPERTY:
				sequence_IntClauseProperty(context, (IntClauseProperty) semanticObject); 
				return; 
			case Ck2Package.INTEGER_PROPERTY:
				sequence_IntegerProperty(context, (IntegerProperty) semanticObject); 
				return; 
			case Ck2Package.LIST:
				sequence_List(context, (List) semanticObject); 
				return; 
			case Ck2Package.LIST_PROPERTY:
				sequence_ListProperty(context, (ListProperty) semanticObject); 
				return; 
			case Ck2Package.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case Ck2Package.PROBABILITY_PROPERTY:
				sequence_ProbabilityProperty(context, (ProbabilityProperty) semanticObject); 
				return; 
			case Ck2Package.STRING_PROPERTY:
				sequence_StringProperty(context, (StringProperty) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Property returns BoolClauseProperty
	 *     BoolClauseProperty returns BoolClauseProperty
	 *
	 * Constraint:
	 *     (name=BOOL value='{' properties+=Property*)
	 * </pre>
	 */
	protected void sequence_BoolClauseProperty(ISerializationContext context, BoolClauseProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Property returns BoolProperty
	 *     BoolProperty returns BoolProperty
	 *
	 * Constraint:
	 *     (key=ID value=BOOL)
	 * </pre>
	 */
	protected void sequence_BoolProperty(ISerializationContext context, BoolProperty semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Ck2Package.Literals.BOOL_PROPERTY__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Ck2Package.Literals.BOOL_PROPERTY__KEY));
			if (transientValues.isValueTransient(semanticObject, Ck2Package.Literals.BOOL_PROPERTY__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Ck2Package.Literals.BOOL_PROPERTY__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBoolPropertyAccess().getKeyIDTerminalRuleCall_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getBoolPropertyAccess().getValueBOOLTerminalRuleCall_2_0(), semanticObject.isValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Property returns CommandProperty
	 *     CommandProperty returns CommandProperty
	 *
	 * Constraint:
	 *     (key=ID value=ID)
	 * </pre>
	 */
	protected void sequence_CommandProperty(ISerializationContext context, CommandProperty semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Ck2Package.Literals.COMMAND_PROPERTY__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Ck2Package.Literals.COMMAND_PROPERTY__KEY));
			if (transientValues.isValueTransient(semanticObject, Ck2Package.Literals.COMMAND_PROPERTY__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Ck2Package.Literals.COMMAND_PROPERTY__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCommandPropertyAccess().getKeyIDTerminalRuleCall_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getCommandPropertyAccess().getValueIDTerminalRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Property returns DateClauseProperty
	 *     Clause returns DateClauseProperty
	 *     DateClauseProperty returns DateClauseProperty
	 *
	 * Constraint:
	 *     (name=Date value='{' properties+=Property*)
	 * </pre>
	 */
	protected void sequence_DateClauseProperty(ISerializationContext context, DateClauseProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Property returns DateProperty
	 *     DateProperty returns DateProperty
	 *
	 * Constraint:
	 *     (key=ID value=Date)
	 * </pre>
	 */
	protected void sequence_DateProperty(ISerializationContext context, DateProperty semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Ck2Package.Literals.DATE_PROPERTY__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Ck2Package.Literals.DATE_PROPERTY__KEY));
			if (transientValues.isValueTransient(semanticObject, Ck2Package.Literals.DATE_PROPERTY__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Ck2Package.Literals.DATE_PROPERTY__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDatePropertyAccess().getKeyIDTerminalRuleCall_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getDatePropertyAccess().getValueDateParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Property returns DoubleProperty
	 *     DoubleProperty returns DoubleProperty
	 *
	 * Constraint:
	 *     (
	 *         (key=ID value=Double) | 
	 *         (key=ID value=Double) | 
	 *         (key=ID value=Double) | 
	 *         (key=ID value=Double) | 
	 *         (key=ID value=Double) | 
	 *         (key=ID value=Double)
	 *     )
	 * </pre>
	 */
	protected void sequence_DoubleProperty(ISerializationContext context, DoubleProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Property returns HexadecimalProperty
	 *     HexadecimalProperty returns HexadecimalProperty
	 *
	 * Constraint:
	 *     (key=ID value=HEX)
	 * </pre>
	 */
	protected void sequence_HexadecimalProperty(ISerializationContext context, HexadecimalProperty semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Ck2Package.Literals.HEXADECIMAL_PROPERTY__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Ck2Package.Literals.HEXADECIMAL_PROPERTY__KEY));
			if (transientValues.isValueTransient(semanticObject, Ck2Package.Literals.HEXADECIMAL_PROPERTY__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Ck2Package.Literals.HEXADECIMAL_PROPERTY__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getHexadecimalPropertyAccess().getKeyIDTerminalRuleCall_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getHexadecimalPropertyAccess().getValueHEXTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Property returns IdClauseProperty
	 *     Clause returns IdClauseProperty
	 *     IdClauseProperty returns IdClauseProperty
	 *
	 * Constraint:
	 *     (name=ID value='{' properties+=Property*)
	 * </pre>
	 */
	protected void sequence_IdClauseProperty(ISerializationContext context, IdClauseProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Property returns IdProperty
	 *     IdProperty returns IdProperty
	 *
	 * Constraint:
	 *     (key=ID value=ID)
	 * </pre>
	 */
	protected void sequence_IdProperty(ISerializationContext context, IdProperty semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Ck2Package.Literals.ID_PROPERTY__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Ck2Package.Literals.ID_PROPERTY__KEY));
			if (transientValues.isValueTransient(semanticObject, Ck2Package.Literals.ID_PROPERTY__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Ck2Package.Literals.ID_PROPERTY__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIdPropertyAccess().getKeyIDTerminalRuleCall_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getIdPropertyAccess().getValueIDTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Property returns IntClauseProperty
	 *     Clause returns IntClauseProperty
	 *     IntClauseProperty returns IntClauseProperty
	 *
	 * Constraint:
	 *     (name=INT value='{' properties+=Property*)
	 * </pre>
	 */
	protected void sequence_IntClauseProperty(ISerializationContext context, IntClauseProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Property returns IntegerProperty
	 *     IntegerProperty returns IntegerProperty
	 *
	 * Constraint:
	 *     (
	 *         (key=ID value=Integer) | 
	 *         (key=ID value=Integer) | 
	 *         (key=ID value=Integer) | 
	 *         (key=ID value=Integer) | 
	 *         (key=ID value=Integer) | 
	 *         (key=ID value=Integer)
	 *     )
	 * </pre>
	 */
	protected void sequence_IntegerProperty(ISerializationContext context, IntegerProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Property returns ListProperty
	 *     ListProperty returns ListProperty
	 *
	 * Constraint:
	 *     (key=ID value=List)
	 * </pre>
	 */
	protected void sequence_ListProperty(ISerializationContext context, ListProperty semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Ck2Package.Literals.LIST_PROPERTY__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Ck2Package.Literals.LIST_PROPERTY__KEY));
			if (transientValues.isValueTransient(semanticObject, Ck2Package.Literals.LIST_PROPERTY__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Ck2Package.Literals.LIST_PROPERTY__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getListPropertyAccess().getKeyIDTerminalRuleCall_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getListPropertyAccess().getValueListParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     List returns List
	 *
	 * Constraint:
	 *     elems+=ListElem+
	 * </pre>
	 */
	protected void sequence_List(ISerializationContext context, List semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     properties+=Property+
	 * </pre>
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Property returns ProbabilityProperty
	 *     ProbabilityProperty returns ProbabilityProperty
	 *
	 * Constraint:
	 *     (key=INT value=ListElem)
	 * </pre>
	 */
	protected void sequence_ProbabilityProperty(ISerializationContext context, ProbabilityProperty semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Ck2Package.Literals.PROBABILITY_PROPERTY__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Ck2Package.Literals.PROBABILITY_PROPERTY__KEY));
			if (transientValues.isValueTransient(semanticObject, Ck2Package.Literals.PROBABILITY_PROPERTY__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Ck2Package.Literals.PROBABILITY_PROPERTY__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getProbabilityPropertyAccess().getKeyINTTerminalRuleCall_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getProbabilityPropertyAccess().getValueListElemParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Property returns StringProperty
	 *     StringProperty returns StringProperty
	 *
	 * Constraint:
	 *     (key=ID value=STRING)
	 * </pre>
	 */
	protected void sequence_StringProperty(ISerializationContext context, StringProperty semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Ck2Package.Literals.STRING_PROPERTY__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Ck2Package.Literals.STRING_PROPERTY__KEY));
			if (transientValues.isValueTransient(semanticObject, Ck2Package.Literals.STRING_PROPERTY__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Ck2Package.Literals.STRING_PROPERTY__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStringPropertyAccess().getKeyIDTerminalRuleCall_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getStringPropertyAccess().getValueSTRINGTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
}

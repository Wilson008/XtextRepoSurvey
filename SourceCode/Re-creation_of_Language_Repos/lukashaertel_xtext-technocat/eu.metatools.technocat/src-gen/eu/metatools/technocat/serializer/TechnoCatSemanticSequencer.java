/*
 * generated by Xtext 2.35.0
 */
package eu.metatools.technocat.serializer;

import com.google.inject.Inject;
import eu.metatools.technocat.services.TechnoCatGrammarAccess;
import eu.metatools.technocat.technoCat.ED;
import eu.metatools.technocat.technoCat.EDItem;
import eu.metatools.technocat.technoCat.ETD;
import eu.metatools.technocat.technoCat.Import;
import eu.metatools.technocat.technoCat.RD;
import eu.metatools.technocat.technoCat.RTD;
import eu.metatools.technocat.technoCat.RTDItem;
import eu.metatools.technocat.technoCat.TechnoCatPackage;
import eu.metatools.technocat.technoCat.TechnologyCatalog;
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
public class TechnoCatSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TechnoCatGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == TechnoCatPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case TechnoCatPackage.ED:
				sequence_ED(context, (ED) semanticObject); 
				return; 
			case TechnoCatPackage.ED_ITEM:
				sequence_EDItem(context, (EDItem) semanticObject); 
				return; 
			case TechnoCatPackage.ETD:
				sequence_ETD(context, (ETD) semanticObject); 
				return; 
			case TechnoCatPackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case TechnoCatPackage.RD:
				sequence_RD(context, (RD) semanticObject); 
				return; 
			case TechnoCatPackage.RTD:
				sequence_RTD(context, (RTD) semanticObject); 
				return; 
			case TechnoCatPackage.RTD_ITEM:
				sequence_RTDItem(context, (RTDItem) semanticObject); 
				return; 
			case TechnoCatPackage.TECHNOLOGY_CATALOG:
				sequence_TechnologyCatalog(context, (TechnologyCatalog) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     EDItem returns EDItem
	 *
	 * Constraint:
	 *     (name=EID value=STRING?)
	 * </pre>
	 */
	protected void sequence_EDItem(ISerializationContext context, EDItem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Element returns ED
	 *     ModelElement returns ED
	 *     InstanceElement returns ED
	 *     ED returns ED
	 *
	 * Constraint:
	 *     (type=[ETD|ETID] items+=EDItem items+=EDItem*)
	 * </pre>
	 */
	protected void sequence_ED(ISerializationContext context, ED semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Element returns ETD
	 *     ModelElement returns ETD
	 *     DefinitionElement returns ETD
	 *     ETD returns ETD
	 *
	 * Constraint:
	 *     (name=ETID (bases+=[ETD|ETID] bases+=[ETD|ETID]*)? value=STRING?)
	 * </pre>
	 */
	protected void sequence_ETD(ISerializationContext context, ETD semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Element returns Import
	 *     Import returns Import
	 *
	 * Constraint:
	 *     ref=[TechnologyCatalog|TCID]
	 * </pre>
	 */
	protected void sequence_Import(ISerializationContext context, Import semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TechnoCatPackage.Literals.IMPORT__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TechnoCatPackage.Literals.IMPORT__REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImportAccess().getRefTechnologyCatalogTCIDParserRuleCall_1_0_1(), semanticObject.eGet(TechnoCatPackage.Literals.IMPORT__REF, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Element returns RD
	 *     ModelElement returns RD
	 *     InstanceElement returns RD
	 *     RD returns RD
	 *
	 * Constraint:
	 *     (left=[EDItem|EID] relation=[RTD|RTID] right=[EDItem|EID] value=STRING?)
	 * </pre>
	 */
	protected void sequence_RD(ISerializationContext context, RD semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     RTDItem returns RTDItem
	 *
	 * Constraint:
	 *     (domain=[ETD|ETID] codomain=[ETD|ETID] value=STRING?)
	 * </pre>
	 */
	protected void sequence_RTDItem(ISerializationContext context, RTDItem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Element returns RTD
	 *     ModelElement returns RTD
	 *     DefinitionElement returns RTD
	 *     RTD returns RTD
	 *
	 * Constraint:
	 *     (name=RTID (bases+=[RTD|RTID] bases+=[RTD|RTID]*)? value=STRING? items+=RTDItem*)
	 * </pre>
	 */
	protected void sequence_RTD(ISerializationContext context, RTD semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     TechnologyCatalog returns TechnologyCatalog
	 *
	 * Constraint:
	 *     (name=TCID (imports+=Import | entityTypes+=ETD | relationTypes+=RTD | entities+=ED | relations+=RD)*)
	 * </pre>
	 */
	protected void sequence_TechnologyCatalog(ISerializationContext context, TechnologyCatalog semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}

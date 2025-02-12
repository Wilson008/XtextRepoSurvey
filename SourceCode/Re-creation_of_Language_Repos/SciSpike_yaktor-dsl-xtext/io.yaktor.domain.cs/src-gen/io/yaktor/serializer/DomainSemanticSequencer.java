/*
 * generated by Xtext 2.35.0
 */
package io.yaktor.serializer;

import com.google.inject.Inject;
import io.yaktor.domain.AmountField;
import io.yaktor.domain.AnyField;
import io.yaktor.domain.Association;
import io.yaktor.domain.AssociationEnd;
import io.yaktor.domain.AssociationRef;
import io.yaktor.domain.BooleanField;
import io.yaktor.domain.CountField;
import io.yaktor.domain.DateField;
import io.yaktor.domain.DomainModel;
import io.yaktor.domain.DomainModelImport;
import io.yaktor.domain.DomainPackage;
import io.yaktor.domain.Entity;
import io.yaktor.domain.EntityReferenceField;
import io.yaktor.domain.EnumField;
import io.yaktor.domain.EnumType;
import io.yaktor.domain.EnumValue;
import io.yaktor.domain.GenerationInclusion;
import io.yaktor.domain.GeoLocationField;
import io.yaktor.domain.IdField;
import io.yaktor.domain.IndexConstraint;
import io.yaktor.domain.IntegerField;
import io.yaktor.domain.JpaGenOptions;
import io.yaktor.domain.JpaTableOptions;
import io.yaktor.domain.MongoNodeGenOptions;
import io.yaktor.domain.MongoNodeTableOptions;
import io.yaktor.domain.NumericField;
import io.yaktor.domain.PersistenceOptions;
import io.yaktor.domain.PriceField;
import io.yaktor.domain.ProjectOptions;
import io.yaktor.domain.ShortIdField;
import io.yaktor.domain.StringField;
import io.yaktor.domain.Type;
import io.yaktor.domain.TypeField;
import io.yaktor.domain.UniqueConstraint;
import io.yaktor.mongoNode.MongoNodePackage;
import io.yaktor.mongoNode.Ttl;
import io.yaktor.services.DomainGrammarAccess;
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
public class DomainSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DomainGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == DomainPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DomainPackage.AMOUNT_FIELD:
				sequence_AmountField(context, (AmountField) semanticObject); 
				return; 
			case DomainPackage.ANY_FIELD:
				sequence_AnyField(context, (AnyField) semanticObject); 
				return; 
			case DomainPackage.ASSOCIATION:
				sequence_Association(context, (Association) semanticObject); 
				return; 
			case DomainPackage.ASSOCIATION_END:
				sequence_AssociationEnd(context, (AssociationEnd) semanticObject); 
				return; 
			case DomainPackage.ASSOCIATION_REF:
				sequence_AssociationRef(context, (AssociationRef) semanticObject); 
				return; 
			case DomainPackage.BOOLEAN_FIELD:
				sequence_BooleanField(context, (BooleanField) semanticObject); 
				return; 
			case DomainPackage.COUNT_FIELD:
				sequence_CountField(context, (CountField) semanticObject); 
				return; 
			case DomainPackage.DATE_FIELD:
				sequence_DateField(context, (DateField) semanticObject); 
				return; 
			case DomainPackage.DOMAIN_MODEL:
				sequence_DomainModel(context, (DomainModel) semanticObject); 
				return; 
			case DomainPackage.DOMAIN_MODEL_IMPORT:
				sequence_DomainModelImport(context, (DomainModelImport) semanticObject); 
				return; 
			case DomainPackage.ENTITY:
				sequence_Entity(context, (Entity) semanticObject); 
				return; 
			case DomainPackage.ENTITY_REFERENCE_FIELD:
				sequence_EntityReferenceField(context, (EntityReferenceField) semanticObject); 
				return; 
			case DomainPackage.ENUM_FIELD:
				sequence_EnumField(context, (EnumField) semanticObject); 
				return; 
			case DomainPackage.ENUM_TYPE:
				sequence_EnumType(context, (EnumType) semanticObject); 
				return; 
			case DomainPackage.ENUM_VALUE:
				sequence_EnumValue(context, (EnumValue) semanticObject); 
				return; 
			case DomainPackage.GENERATION_INCLUSION:
				sequence_GenerationInclusion(context, (GenerationInclusion) semanticObject); 
				return; 
			case DomainPackage.GEO_LOCATION_FIELD:
				sequence_GeoLocationField(context, (GeoLocationField) semanticObject); 
				return; 
			case DomainPackage.ID_FIELD:
				sequence_IdField(context, (IdField) semanticObject); 
				return; 
			case DomainPackage.INDEX_CONSTRAINT:
				sequence_IndexConstraint(context, (IndexConstraint) semanticObject); 
				return; 
			case DomainPackage.INTEGER_FIELD:
				sequence_IntegerField(context, (IntegerField) semanticObject); 
				return; 
			case DomainPackage.JPA_GEN_OPTIONS:
				sequence_JpaGenOptions(context, (JpaGenOptions) semanticObject); 
				return; 
			case DomainPackage.JPA_TABLE_OPTIONS:
				sequence_JpaTableOptions(context, (JpaTableOptions) semanticObject); 
				return; 
			case DomainPackage.MONGO_NODE_GEN_OPTIONS:
				sequence_MongoNodeGenOptions(context, (MongoNodeGenOptions) semanticObject); 
				return; 
			case DomainPackage.MONGO_NODE_TABLE_OPTIONS:
				sequence_MongoNodeTableOptions(context, (MongoNodeTableOptions) semanticObject); 
				return; 
			case DomainPackage.NUMERIC_FIELD:
				sequence_NumericField(context, (NumericField) semanticObject); 
				return; 
			case DomainPackage.PERSISTENCE_OPTIONS:
				sequence_PersistenceOptions(context, (PersistenceOptions) semanticObject); 
				return; 
			case DomainPackage.PRICE_FIELD:
				sequence_PriceField(context, (PriceField) semanticObject); 
				return; 
			case DomainPackage.PROJECT_OPTIONS:
				sequence_ProjectOptions(context, (ProjectOptions) semanticObject); 
				return; 
			case DomainPackage.SHORT_ID_FIELD:
				sequence_ShortIdField(context, (ShortIdField) semanticObject); 
				return; 
			case DomainPackage.STRING_FIELD:
				sequence_StringField(context, (StringField) semanticObject); 
				return; 
			case DomainPackage.TYPE:
				sequence_Type(context, (Type) semanticObject); 
				return; 
			case DomainPackage.TYPE_FIELD:
				sequence_TypeField(context, (TypeField) semanticObject); 
				return; 
			case DomainPackage.UNIQUE_CONSTRAINT:
				sequence_UniqueConstraint(context, (UniqueConstraint) semanticObject); 
				return; 
			}
		else if (epackage == MongoNodePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MongoNodePackage.TTL:
				sequence_Ttl(context, (Ttl) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     SimpleField returns AmountField
	 *     Field returns AmountField
	 *     ConstraintTypeField returns AmountField
	 *     AmountField returns AmountField
	 *
	 * Constraint:
	 *     (name=ID cardinality=Cardinality? (indexed?='indexed' | unique?='unique')*)
	 * </pre>
	 */
	protected void sequence_AmountField(ISerializationContext context, AmountField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Field returns AnyField
	 *     AnyField returns AnyField
	 *
	 * Constraint:
	 *     (name=ID cardinality=Cardinality?)
	 * </pre>
	 */
	protected void sequence_AnyField(ISerializationContext context, AnyField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     AssociationEnd returns AssociationEnd
	 *     ConstraintTypeField returns AssociationEnd
	 *
	 * Constraint:
	 *     (references=[Entity|PossiblyQualifiedName] name=ID cardinality=Cardinality? isComposition?='composition'? unique?='unique'?)
	 * </pre>
	 */
	protected void sequence_AssociationEnd(ISerializationContext context, AssociationEnd semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     NamedType returns AssociationRef
	 *     AssociationRef returns AssociationRef
	 *
	 * Constraint:
	 *     ref=[Association|PossiblyQualifiedName]
	 * </pre>
	 */
	protected void sequence_AssociationRef(ISerializationContext context, AssociationRef semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DomainPackage.Literals.ASSOCIATION_REF__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainPackage.Literals.ASSOCIATION_REF__REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAssociationRefAccess().getRefAssociationPossiblyQualifiedNameParserRuleCall_1_0_1(), semanticObject.eGet(DomainPackage.Literals.ASSOCIATION_REF__REF, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     NamedType returns Association
	 *     Association returns Association
	 *
	 * Constraint:
	 *     (name=ID start=AssociationEnd isUnidirectional?='--&gt;'? end=AssociationEnd)
	 * </pre>
	 */
	protected void sequence_Association(ISerializationContext context, Association semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SimpleField returns BooleanField
	 *     Field returns BooleanField
	 *     ConstraintTypeField returns BooleanField
	 *     BooleanField returns BooleanField
	 *
	 * Constraint:
	 *     (name=ID cardinality=Cardinality? (unique?='unique' | indexed?='indexed' | defaultValue=BooleanConst)*)
	 * </pre>
	 */
	protected void sequence_BooleanField(ISerializationContext context, BooleanField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SimpleField returns CountField
	 *     Field returns CountField
	 *     ConstraintTypeField returns CountField
	 *     CountField returns CountField
	 *
	 * Constraint:
	 *     (name=ID cardinality=Cardinality? (indexed?='indexed' | unique?='unique')*)
	 * </pre>
	 */
	protected void sequence_CountField(ISerializationContext context, CountField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SimpleField returns DateField
	 *     Field returns DateField
	 *     ConstraintTypeField returns DateField
	 *     DateField returns DateField
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         defaultValue=STRING? 
	 *         cardinality=Cardinality? 
	 *         (
	 *             before=STRING | 
	 *             after=STRING | 
	 *             unique?='unique' | 
	 *             indexed?='indexed' | 
	 *             past?='past' | 
	 *             future?='future'
	 *         )*
	 *     )
	 * </pre>
	 */
	protected void sequence_DateField(ISerializationContext context, DateField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     DomainModelImport returns DomainModelImport
	 *
	 * Constraint:
	 *     (ref=[DomainModel|ID] alias=ID?)
	 * </pre>
	 */
	protected void sequence_DomainModelImport(ISerializationContext context, DomainModelImport semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     DomainModel returns DomainModel
	 *
	 * Constraint:
	 *     (domainModelImports+=DomainModelImport* name=ID genOptions=GenOptions? types+=NamedType*)
	 * </pre>
	 */
	protected void sequence_DomainModel(ISerializationContext context, DomainModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SimpleField returns EntityReferenceField
	 *     Field returns EntityReferenceField
	 *     ConstraintTypeField returns EntityReferenceField
	 *     EntityReferenceField returns EntityReferenceField
	 *
	 * Constraint:
	 *     (refType=[Entity|PossiblyQualifiedName] name=ID cardinality=Cardinality?)
	 * </pre>
	 */
	protected void sequence_EntityReferenceField(ISerializationContext context, EntityReferenceField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     NamedType returns Entity
	 *     Entity returns Entity
	 *
	 * Constraint:
	 *     (
	 *         isAbstract?='abstract'? 
	 *         name=ID 
	 *         supertype=[Entity|PossiblyQualifiedName]? 
	 *         metaData?='auditable'? 
	 *         fields+=Field* 
	 *         uniqueConstraints+=UniqueConstraint* 
	 *         indexConstraints+=IndexConstraint* 
	 *         keys+=[Field|ID]?
	 *     )
	 * </pre>
	 */
	protected void sequence_Entity(ISerializationContext context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SimpleField returns EnumField
	 *     Field returns EnumField
	 *     ConstraintTypeField returns EnumField
	 *     EnumField returns EnumField
	 *
	 * Constraint:
	 *     (isType=[EnumType|PossiblyQualifiedName] name=ID cardinality=Cardinality? isJpaEnumType=JpaEnumType?)
	 * </pre>
	 */
	protected void sequence_EnumField(ISerializationContext context, EnumField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     NamedType returns EnumType
	 *     EnumType returns EnumType
	 *
	 * Constraint:
	 *     (name=ID values+=EnumValue+)
	 * </pre>
	 */
	protected void sequence_EnumType(ISerializationContext context, EnumType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     EnumValue returns EnumValue
	 *
	 * Constraint:
	 *     (name=ID value=STRING)
	 * </pre>
	 */
	protected void sequence_EnumValue(ISerializationContext context, EnumValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DomainPackage.Literals.ENUM_VALUE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainPackage.Literals.ENUM_VALUE__NAME));
			if (transientValues.isValueTransient(semanticObject, DomainPackage.Literals.ENUM_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainPackage.Literals.ENUM_VALUE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEnumValueAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getEnumValueAccess().getValueSTRINGTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     GenerationInclusion returns GenerationInclusion
	 *
	 * Constraint:
	 *     (
	 *         types=InclusionType | 
	 *         controller=InclusionType | 
	 *         resources=InclusionType | 
	 *         properties=InclusionType | 
	 *         views=InclusionType | 
	 *         webxml=InclusionType | 
	 *         pom=InclusionType | 
	 *         styles=InclusionType | 
	 *         classes=InclusionType | 
	 *         layouts=InclusionType | 
	 *         webmvc=InclusionType | 
	 *         tags=InclusionType
	 *     )+
	 * </pre>
	 */
	protected void sequence_GenerationInclusion(ISerializationContext context, GenerationInclusion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SimpleField returns GeoLocationField
	 *     Field returns GeoLocationField
	 *     ConstraintTypeField returns GeoLocationField
	 *     GeoLocationField returns GeoLocationField
	 *
	 * Constraint:
	 *     (name=ID cardinality=SinglularCardinality?)
	 * </pre>
	 */
	protected void sequence_GeoLocationField(ISerializationContext context, GeoLocationField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SimpleField returns IdField
	 *     Field returns IdField
	 *     ConstraintTypeField returns IdField
	 *     IdField returns IdField
	 *
	 * Constraint:
	 *     (name=ID cardinality=Cardinality? (unique?='unique' | indexed?='indexed')*)
	 * </pre>
	 */
	protected void sequence_IdField(ISerializationContext context, IdField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     IndexConstraint returns IndexConstraint
	 *
	 * Constraint:
	 *     fields+=[ConstraintTypeField|PossiblyQualifiedName]+
	 * </pre>
	 */
	protected void sequence_IndexConstraint(ISerializationContext context, IndexConstraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SimpleField returns IntegerField
	 *     Field returns IntegerField
	 *     ConstraintTypeField returns IntegerField
	 *     IntegerField returns IntegerField
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         cardinality=Cardinality? 
	 *         (defaultValue=IntegerConst | unique?='unique' | indexed?='indexed' | minValue=IntegerConst | maxValue=IntegerConst)*
	 *     )
	 * </pre>
	 */
	protected void sequence_IntegerField(ISerializationContext context, IntegerField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     GenOptions returns JpaGenOptions
	 *     JpaGenOptions returns JpaGenOptions
	 *
	 * Constraint:
	 *     (
	 *         project=ProjectOptions 
	 *         persistence=PersistenceOptions? 
	 *         generationInclusion=GenerationInclusion? 
	 *         useAspects?='use-aspects'? 
	 *         metaData?='auditable'? 
	 *         tableOptions+=JpaTableOptions*
	 *     )
	 * </pre>
	 */
	protected void sequence_JpaGenOptions(ISerializationContext context, JpaGenOptions semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     JpaTableOptions returns JpaTableOptions
	 *
	 * Constraint:
	 *     (type=[Entity|ID] singleTableRoot?='single-table-root'?)
	 * </pre>
	 */
	protected void sequence_JpaTableOptions(ISerializationContext context, JpaTableOptions semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     GenOptions returns MongoNodeGenOptions
	 *     MongoNodeGenOptions returns MongoNodeGenOptions
	 *
	 * Constraint:
	 *     (useLogger?='use-logger'? modelPath=STRING? testPath=STRING? generateTest?='gen-test'? tableOptions+=MongoNodeTableOptions*)
	 * </pre>
	 */
	protected void sequence_MongoNodeGenOptions(ISerializationContext context, MongoNodeGenOptions semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     MongoNodeTableOptions returns MongoNodeTableOptions
	 *
	 * Constraint:
	 *     (type=[Entity|ID] ttl=Ttl? singleTableRoot?='single-table-root'?)
	 * </pre>
	 */
	protected void sequence_MongoNodeTableOptions(ISerializationContext context, MongoNodeTableOptions semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SimpleField returns NumericField
	 *     Field returns NumericField
	 *     ConstraintTypeField returns NumericField
	 *     NumericField returns NumericField
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         cardinality=Cardinality? 
	 *         (defaultValue=FloatingPointConst | unique?='unique' | indexed?='indexed' | minValue=FloatingPointConst | maxValue=FloatingPointConst)*
	 *     )
	 * </pre>
	 */
	protected void sequence_NumericField(ISerializationContext context, NumericField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     PersistenceOptions returns PersistenceOptions
	 *
	 * Constraint:
	 *     (
	 *         dbType=DbType | 
	 *         dbProvider=DbProvider | 
	 *         userName=ID | 
	 *         password=ID | 
	 *         password=STRING | 
	 *         url=STRING | 
	 *         dbName=ID
	 *     )+
	 * </pre>
	 */
	protected void sequence_PersistenceOptions(ISerializationContext context, PersistenceOptions semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SimpleField returns PriceField
	 *     Field returns PriceField
	 *     ConstraintTypeField returns PriceField
	 *     PriceField returns PriceField
	 *
	 * Constraint:
	 *     (name=ID cardinality=Cardinality? (indexed?='indexed' | unique?='unique')*)
	 * </pre>
	 */
	protected void sequence_PriceField(ISerializationContext context, PriceField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ProjectOptions returns ProjectOptions
	 *
	 * Constraint:
	 *     (name=ID | rootPackage=QualifiedName | domainSubpackage=QualifiedName | controllerSubpackage=QualifiedName | jsonSupport?='json-support')+
	 * </pre>
	 */
	protected void sequence_ProjectOptions(ISerializationContext context, ProjectOptions semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SimpleField returns ShortIdField
	 *     Field returns ShortIdField
	 *     ConstraintTypeField returns ShortIdField
	 *     ShortIdField returns ShortIdField
	 *
	 * Constraint:
	 *     (name=ID cardinality=Cardinality? ((unique?='unique' | indexed?='indexed')? (pattern=STRING maxValue=INT?)?)+)
	 * </pre>
	 */
	protected void sequence_ShortIdField(ISerializationContext context, ShortIdField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SimpleField returns StringField
	 *     Field returns StringField
	 *     ConstraintTypeField returns StringField
	 *     StringField returns StringField
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         cardinality=Cardinality? 
	 *         (
	 *             defaultValue=STRING | 
	 *             pattern=STRING | 
	 *             unique?='unique' | 
	 *             indexed?='indexed' | 
	 *             obscured?='obscured' | 
	 *             minLength=INT | 
	 *             maxLength=INT
	 *         )*
	 *     )
	 * </pre>
	 */
	protected void sequence_StringField(ISerializationContext context, StringField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Ttl returns Ttl
	 *
	 * Constraint:
	 *     (field=[DateField|PossiblyQualifiedName] expireAfterSeconds=INT)
	 * </pre>
	 */
	protected void sequence_Ttl(ISerializationContext context, Ttl semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MongoNodePackage.Literals.TTL__FIELD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MongoNodePackage.Literals.TTL__FIELD));
			if (transientValues.isValueTransient(semanticObject, MongoNodePackage.Literals.TTL__EXPIRE_AFTER_SECONDS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MongoNodePackage.Literals.TTL__EXPIRE_AFTER_SECONDS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTtlAccess().getFieldDateFieldPossiblyQualifiedNameParserRuleCall_1_0_1(), semanticObject.eGet(MongoNodePackage.Literals.TTL__FIELD, false));
		feeder.accept(grammarAccess.getTtlAccess().getExpireAfterSecondsINTTerminalRuleCall_2_0(), semanticObject.getExpireAfterSeconds());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Field returns TypeField
	 *     TypeField returns TypeField
	 *
	 * Constraint:
	 *     (isType=[Type|PossiblyQualifiedName] name=ID cardinality=Cardinality?)
	 * </pre>
	 */
	protected void sequence_TypeField(ISerializationContext context, TypeField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     NamedType returns Type
	 *     Type returns Type
	 *
	 * Constraint:
	 *     (
	 *         isAbstract?='abstract'? 
	 *         name=ID 
	 *         supertype=[Type|PossiblyQualifiedName]? 
	 *         fields+=Field* 
	 *         uniqueConstraints+=UniqueConstraint* 
	 *         indexConstraints+=IndexConstraint* 
	 *         keys+=[Field|ID]?
	 *     )
	 * </pre>
	 */
	protected void sequence_Type(ISerializationContext context, Type semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     UniqueConstraint returns UniqueConstraint
	 *
	 * Constraint:
	 *     fields+=[ConstraintTypeField|PossiblyQualifiedName]+
	 * </pre>
	 */
	protected void sequence_UniqueConstraint(ISerializationContext context, UniqueConstraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}

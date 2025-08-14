/**
 */
package megal.impl;

import megal.MegalAnnotation;
import megal.MegalDeclaration;
import megal.MegalElement;
import megal.MegalEntity;
import megal.MegalEntityType;
import megal.MegalFactory;
import megal.MegalFile;
import megal.MegalLink;
import megal.MegalNamed;
import megal.MegalPackage;
import megal.MegalPair;
import megal.MegalRelationship;
import megal.MegalRelationshipType;
import megal.QueryEntity;
import megal.QueryEntry;
import megal.QueryParam;
import megal.QueryPos;
import megal.QueryReference;
import megal.QueryStatement;
import megal.QueryString;
import megal.Selection;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MegalPackageImpl extends EPackageImpl implements MegalPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass megalAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass megalElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass megalFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass megalLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass megalDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass megalRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass megalPairEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass megalNamedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass megalEntityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass megalRelationshipTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass megalEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryPosEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see megal.MegalPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MegalPackageImpl() {
		super(eNS_URI, MegalFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MegalPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MegalPackage init() {
		if (isInited) return (MegalPackage)EPackage.Registry.INSTANCE.getEPackage(MegalPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMegalPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MegalPackageImpl theMegalPackage = registeredMegalPackage instanceof MegalPackageImpl ? (MegalPackageImpl)registeredMegalPackage : new MegalPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theMegalPackage.createPackageContents();

		// Initialize created meta-data
		theMegalPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMegalPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MegalPackage.eNS_URI, theMegalPackage);
		return theMegalPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMegalAnnotation() {
		return megalAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMegalAnnotation_Key() {
		return (EAttribute)megalAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMegalAnnotation_Selection() {
		return (EReference)megalAnnotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMegalElement() {
		return megalElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMegalElement_Annotations() {
		return (EReference)megalElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMegalFile() {
		return megalFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMegalFile_Declarations() {
		return (EReference)megalFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMegalFile_Bindings() {
		return (EReference)megalFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMegalFile_Name() {
		return (EAttribute)megalFileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMegalFile_Imports() {
		return (EReference)megalFileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMegalLink() {
		return megalLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMegalLink_Link() {
		return (EReference)megalLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMegalLink_To() {
		return (EAttribute)megalLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMegalLink_First() {
		return (EReference)megalLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMegalLink_Second() {
		return (EReference)megalLinkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMegalDeclaration() {
		return megalDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMegalRelationship() {
		return megalRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMegalRelationship_Type() {
		return (EReference)megalRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMegalRelationship_Left() {
		return (EReference)megalRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMegalRelationship_Right() {
		return (EReference)megalRelationshipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMegalPair() {
		return megalPairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMegalPair_Set() {
		return (EReference)megalPairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMegalPair_First() {
		return (EReference)megalPairEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMegalPair_Second() {
		return (EReference)megalPairEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMegalNamed() {
		return megalNamedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMegalNamed_Name() {
		return (EAttribute)megalNamedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMegalEntityType() {
		return megalEntityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMegalEntityType_Supertype() {
		return (EReference)megalEntityTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMegalRelationshipType() {
		return megalRelationshipTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMegalRelationshipType_Left() {
		return (EReference)megalRelationshipTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMegalRelationshipType_Right() {
		return (EReference)megalRelationshipTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMegalRelationshipType_LeftBoth() {
		return (EAttribute)megalRelationshipTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMegalRelationshipType_RightBoth() {
		return (EAttribute)megalRelationshipTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMegalRelationshipType_LeftMany() {
		return (EAttribute)megalRelationshipTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMegalRelationshipType_RightMany() {
		return (EAttribute)megalRelationshipTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMegalRelationshipType_LeftParams() {
		return (EReference)megalRelationshipTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMegalRelationshipType_RightParams() {
		return (EReference)megalRelationshipTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMegalEntity() {
		return megalEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMegalEntity_Type() {
		return (EReference)megalEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMegalEntity_Params() {
		return (EReference)megalEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMegalEntity_Many() {
		return (EAttribute)megalEntityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSelection() {
		return selectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSelection_Select() {
		return (EReference)selectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSelection_Query() {
		return (EReference)selectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQueryStatement() {
		return queryStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQueryStatement_Subject() {
		return (EReference)queryStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQueryStatement_Predicate() {
		return (EReference)queryStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQueryStatement_Object() {
		return (EReference)queryStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQueryEntry() {
		return queryEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQueryParam() {
		return queryParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQueryParam_Name() {
		return (EAttribute)queryParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQueryParam_Type() {
		return (EReference)queryParamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQueryReference() {
		return queryReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQueryReference_Ref() {
		return (EReference)queryReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQueryString() {
		return queryStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQueryString_Value() {
		return (EAttribute)queryStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQueryEntity() {
		return queryEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQueryEntity_Entity() {
		return (EReference)queryEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQueryPos() {
		return queryPosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQueryPos_Value() {
		return (EAttribute)queryPosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MegalFactory getMegalFactory() {
		return (MegalFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		megalAnnotationEClass = createEClass(MEGAL_ANNOTATION);
		createEAttribute(megalAnnotationEClass, MEGAL_ANNOTATION__KEY);
		createEReference(megalAnnotationEClass, MEGAL_ANNOTATION__SELECTION);

		megalElementEClass = createEClass(MEGAL_ELEMENT);
		createEReference(megalElementEClass, MEGAL_ELEMENT__ANNOTATIONS);

		megalFileEClass = createEClass(MEGAL_FILE);
		createEReference(megalFileEClass, MEGAL_FILE__DECLARATIONS);
		createEReference(megalFileEClass, MEGAL_FILE__BINDINGS);
		createEAttribute(megalFileEClass, MEGAL_FILE__NAME);
		createEReference(megalFileEClass, MEGAL_FILE__IMPORTS);

		megalLinkEClass = createEClass(MEGAL_LINK);
		createEReference(megalLinkEClass, MEGAL_LINK__LINK);
		createEAttribute(megalLinkEClass, MEGAL_LINK__TO);
		createEReference(megalLinkEClass, MEGAL_LINK__FIRST);
		createEReference(megalLinkEClass, MEGAL_LINK__SECOND);

		megalDeclarationEClass = createEClass(MEGAL_DECLARATION);

		megalRelationshipEClass = createEClass(MEGAL_RELATIONSHIP);
		createEReference(megalRelationshipEClass, MEGAL_RELATIONSHIP__TYPE);
		createEReference(megalRelationshipEClass, MEGAL_RELATIONSHIP__LEFT);
		createEReference(megalRelationshipEClass, MEGAL_RELATIONSHIP__RIGHT);

		megalPairEClass = createEClass(MEGAL_PAIR);
		createEReference(megalPairEClass, MEGAL_PAIR__SET);
		createEReference(megalPairEClass, MEGAL_PAIR__FIRST);
		createEReference(megalPairEClass, MEGAL_PAIR__SECOND);

		megalNamedEClass = createEClass(MEGAL_NAMED);
		createEAttribute(megalNamedEClass, MEGAL_NAMED__NAME);

		megalEntityTypeEClass = createEClass(MEGAL_ENTITY_TYPE);
		createEReference(megalEntityTypeEClass, MEGAL_ENTITY_TYPE__SUPERTYPE);

		megalRelationshipTypeEClass = createEClass(MEGAL_RELATIONSHIP_TYPE);
		createEReference(megalRelationshipTypeEClass, MEGAL_RELATIONSHIP_TYPE__LEFT);
		createEReference(megalRelationshipTypeEClass, MEGAL_RELATIONSHIP_TYPE__RIGHT);
		createEAttribute(megalRelationshipTypeEClass, MEGAL_RELATIONSHIP_TYPE__LEFT_BOTH);
		createEAttribute(megalRelationshipTypeEClass, MEGAL_RELATIONSHIP_TYPE__RIGHT_BOTH);
		createEAttribute(megalRelationshipTypeEClass, MEGAL_RELATIONSHIP_TYPE__LEFT_MANY);
		createEAttribute(megalRelationshipTypeEClass, MEGAL_RELATIONSHIP_TYPE__RIGHT_MANY);
		createEReference(megalRelationshipTypeEClass, MEGAL_RELATIONSHIP_TYPE__LEFT_PARAMS);
		createEReference(megalRelationshipTypeEClass, MEGAL_RELATIONSHIP_TYPE__RIGHT_PARAMS);

		megalEntityEClass = createEClass(MEGAL_ENTITY);
		createEReference(megalEntityEClass, MEGAL_ENTITY__TYPE);
		createEReference(megalEntityEClass, MEGAL_ENTITY__PARAMS);
		createEAttribute(megalEntityEClass, MEGAL_ENTITY__MANY);

		selectionEClass = createEClass(SELECTION);
		createEReference(selectionEClass, SELECTION__SELECT);
		createEReference(selectionEClass, SELECTION__QUERY);

		queryStatementEClass = createEClass(QUERY_STATEMENT);
		createEReference(queryStatementEClass, QUERY_STATEMENT__SUBJECT);
		createEReference(queryStatementEClass, QUERY_STATEMENT__PREDICATE);
		createEReference(queryStatementEClass, QUERY_STATEMENT__OBJECT);

		queryEntryEClass = createEClass(QUERY_ENTRY);

		queryParamEClass = createEClass(QUERY_PARAM);
		createEAttribute(queryParamEClass, QUERY_PARAM__NAME);
		createEReference(queryParamEClass, QUERY_PARAM__TYPE);

		queryReferenceEClass = createEClass(QUERY_REFERENCE);
		createEReference(queryReferenceEClass, QUERY_REFERENCE__REF);

		queryStringEClass = createEClass(QUERY_STRING);
		createEAttribute(queryStringEClass, QUERY_STRING__VALUE);

		queryEntityEClass = createEClass(QUERY_ENTITY);
		createEReference(queryEntityEClass, QUERY_ENTITY__ENTITY);

		queryPosEClass = createEClass(QUERY_POS);
		createEAttribute(queryPosEClass, QUERY_POS__VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		megalFileEClass.getESuperTypes().add(this.getMegalElement());
		megalLinkEClass.getESuperTypes().add(this.getMegalElement());
		megalDeclarationEClass.getESuperTypes().add(this.getMegalElement());
		megalRelationshipEClass.getESuperTypes().add(this.getMegalDeclaration());
		megalPairEClass.getESuperTypes().add(this.getMegalDeclaration());
		megalNamedEClass.getESuperTypes().add(this.getMegalDeclaration());
		megalEntityTypeEClass.getESuperTypes().add(this.getMegalNamed());
		megalRelationshipTypeEClass.getESuperTypes().add(this.getMegalNamed());
		megalEntityEClass.getESuperTypes().add(this.getMegalNamed());
		queryParamEClass.getESuperTypes().add(this.getQueryEntry());
		queryReferenceEClass.getESuperTypes().add(this.getQueryEntry());
		queryStringEClass.getESuperTypes().add(this.getQueryEntry());
		queryEntityEClass.getESuperTypes().add(this.getQueryEntry());
		queryPosEClass.getESuperTypes().add(this.getQueryEntry());

		// Initialize classes, features, and operations; add parameters
		initEClass(megalAnnotationEClass, MegalAnnotation.class, "MegalAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMegalAnnotation_Key(), ecorePackage.getEString(), "key", null, 0, 1, MegalAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMegalAnnotation_Selection(), this.getSelection(), null, "selection", null, 0, 1, MegalAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(megalElementEClass, MegalElement.class, "MegalElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMegalElement_Annotations(), this.getMegalAnnotation(), null, "annotations", null, 0, -1, MegalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(megalFileEClass, MegalFile.class, "MegalFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMegalFile_Declarations(), this.getMegalDeclaration(), null, "declarations", null, 0, -1, MegalFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMegalFile_Bindings(), this.getMegalLink(), null, "bindings", null, 0, -1, MegalFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMegalFile_Name(), ecorePackage.getEString(), "name", null, 1, 1, MegalFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMegalFile_Imports(), this.getMegalFile(), null, "imports", null, 0, -1, MegalFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(megalLinkEClass, MegalLink.class, "MegalLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMegalLink_Link(), this.getMegalEntity(), null, "link", null, 1, 1, MegalLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMegalLink_To(), ecorePackage.getEString(), "to", null, 1, 1, MegalLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMegalLink_First(), this.getMegalEntity(), null, "first", null, 0, 1, MegalLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMegalLink_Second(), this.getMegalEntity(), null, "second", null, 0, 1, MegalLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(megalDeclarationEClass, MegalDeclaration.class, "MegalDeclaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(megalRelationshipEClass, MegalRelationship.class, "MegalRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMegalRelationship_Type(), this.getMegalRelationshipType(), null, "type", null, 1, 1, MegalRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMegalRelationship_Left(), this.getMegalEntity(), null, "left", null, 1, 1, MegalRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMegalRelationship_Right(), this.getMegalEntity(), null, "right", null, 1, 1, MegalRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(megalPairEClass, MegalPair.class, "MegalPair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMegalPair_Set(), this.getMegalEntity(), null, "set", null, 1, 1, MegalPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMegalPair_First(), this.getMegalEntity(), null, "first", null, 1, 1, MegalPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMegalPair_Second(), this.getMegalEntity(), null, "second", null, 1, 1, MegalPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(megalNamedEClass, MegalNamed.class, "MegalNamed", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMegalNamed_Name(), ecorePackage.getEString(), "name", null, 1, 1, MegalNamed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(megalEntityTypeEClass, MegalEntityType.class, "MegalEntityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMegalEntityType_Supertype(), this.getMegalEntityType(), null, "supertype", null, 0, 1, MegalEntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(megalRelationshipTypeEClass, MegalRelationshipType.class, "MegalRelationshipType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMegalRelationshipType_Left(), this.getMegalEntityType(), null, "left", null, 1, 1, MegalRelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMegalRelationshipType_Right(), this.getMegalEntityType(), null, "right", null, 1, 1, MegalRelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMegalRelationshipType_LeftBoth(), ecorePackage.getEBoolean(), "leftBoth", null, 0, 1, MegalRelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMegalRelationshipType_RightBoth(), ecorePackage.getEBoolean(), "rightBoth", null, 0, 1, MegalRelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMegalRelationshipType_LeftMany(), ecorePackage.getEBoolean(), "leftMany", null, 0, 1, MegalRelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMegalRelationshipType_RightMany(), ecorePackage.getEBoolean(), "rightMany", null, 0, 1, MegalRelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMegalRelationshipType_LeftParams(), this.getMegalEntity(), null, "leftParams", null, 0, -1, MegalRelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMegalRelationshipType_RightParams(), this.getMegalEntity(), null, "rightParams", null, 0, -1, MegalRelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(megalEntityEClass, MegalEntity.class, "MegalEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMegalEntity_Type(), this.getMegalEntityType(), null, "type", null, 1, 1, MegalEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMegalEntity_Params(), this.getMegalEntity(), null, "params", null, 0, -1, MegalEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMegalEntity_Many(), ecorePackage.getEBoolean(), "many", null, 0, 1, MegalEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectionEClass, Selection.class, "Selection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSelection_Select(), this.getQueryEntry(), null, "select", null, 0, -1, Selection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelection_Query(), this.getQueryStatement(), null, "query", null, 0, -1, Selection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryStatementEClass, QueryStatement.class, "QueryStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQueryStatement_Subject(), this.getQueryEntry(), null, "subject", null, 1, 1, QueryStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQueryStatement_Predicate(), this.getMegalRelationshipType(), null, "predicate", null, 1, 1, QueryStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQueryStatement_Object(), this.getQueryEntry(), null, "object", null, 1, 1, QueryStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryEntryEClass, QueryEntry.class, "QueryEntry", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(queryParamEClass, QueryParam.class, "QueryParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQueryParam_Name(), ecorePackage.getEString(), "name", null, 1, 1, QueryParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQueryParam_Type(), this.getMegalEntityType(), null, "type", null, 0, 1, QueryParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryReferenceEClass, QueryReference.class, "QueryReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQueryReference_Ref(), this.getQueryParam(), null, "ref", null, 0, 1, QueryReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryStringEClass, QueryString.class, "QueryString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQueryString_Value(), ecorePackage.getEString(), "value", null, 1, 1, QueryString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryEntityEClass, QueryEntity.class, "QueryEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQueryEntity_Entity(), this.getMegalEntity(), null, "entity", null, 1, 1, QueryEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryPosEClass, QueryPos.class, "QueryPos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQueryPos_Value(), ecorePackage.getEInt(), "value", null, 1, 1, QueryPos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MegalPackageImpl

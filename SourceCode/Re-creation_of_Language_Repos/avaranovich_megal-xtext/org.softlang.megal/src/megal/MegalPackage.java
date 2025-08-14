/**
 */
package megal;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see megal.MegalFactory
 * @model kind="package"
 * @generated
 */
public interface MegalPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "megal";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://softlang.wikidot.com/megal";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MegalPackage eINSTANCE = megal.impl.MegalPackageImpl.init();

	/**
	 * The meta object id for the '{@link megal.impl.MegalAnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see megal.impl.MegalAnnotationImpl
	 * @see megal.impl.MegalPackageImpl#getMegalAnnotation()
	 * @generated
	 */
	int MEGAL_ANNOTATION = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_ANNOTATION__KEY = 0;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_ANNOTATION__SELECTION = 1;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_ANNOTATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_ANNOTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link megal.MegalElement <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see megal.MegalElement
	 * @see megal.impl.MegalPackageImpl#getMegalElement()
	 * @generated
	 */
	int MEGAL_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_ELEMENT__ANNOTATIONS = 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link megal.impl.MegalFileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see megal.impl.MegalFileImpl
	 * @see megal.impl.MegalPackageImpl#getMegalFile()
	 * @generated
	 */
	int MEGAL_FILE = 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_FILE__ANNOTATIONS = MEGAL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_FILE__DECLARATIONS = MEGAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_FILE__BINDINGS = MEGAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_FILE__NAME = MEGAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_FILE__IMPORTS = MEGAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_FILE_FEATURE_COUNT = MEGAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_FILE_OPERATION_COUNT = MEGAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link megal.impl.MegalLinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see megal.impl.MegalLinkImpl
	 * @see megal.impl.MegalPackageImpl#getMegalLink()
	 * @generated
	 */
	int MEGAL_LINK = 3;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_LINK__ANNOTATIONS = MEGAL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_LINK__LINK = MEGAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_LINK__TO = MEGAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_LINK__FIRST = MEGAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Second</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_LINK__SECOND = MEGAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_LINK_FEATURE_COUNT = MEGAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_LINK_OPERATION_COUNT = MEGAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link megal.impl.MegalDeclarationImpl <em>Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see megal.impl.MegalDeclarationImpl
	 * @see megal.impl.MegalPackageImpl#getMegalDeclaration()
	 * @generated
	 */
	int MEGAL_DECLARATION = 4;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_DECLARATION__ANNOTATIONS = MEGAL_ELEMENT__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_DECLARATION_FEATURE_COUNT = MEGAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_DECLARATION_OPERATION_COUNT = MEGAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link megal.impl.MegalRelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see megal.impl.MegalRelationshipImpl
	 * @see megal.impl.MegalPackageImpl#getMegalRelationship()
	 * @generated
	 */
	int MEGAL_RELATIONSHIP = 5;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_RELATIONSHIP__ANNOTATIONS = MEGAL_DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_RELATIONSHIP__TYPE = MEGAL_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_RELATIONSHIP__LEFT = MEGAL_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_RELATIONSHIP__RIGHT = MEGAL_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_RELATIONSHIP_FEATURE_COUNT = MEGAL_DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_RELATIONSHIP_OPERATION_COUNT = MEGAL_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link megal.impl.MegalPairImpl <em>Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see megal.impl.MegalPairImpl
	 * @see megal.impl.MegalPackageImpl#getMegalPair()
	 * @generated
	 */
	int MEGAL_PAIR = 6;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_PAIR__ANNOTATIONS = MEGAL_DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_PAIR__SET = MEGAL_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_PAIR__FIRST = MEGAL_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Second</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_PAIR__SECOND = MEGAL_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_PAIR_FEATURE_COUNT = MEGAL_DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_PAIR_OPERATION_COUNT = MEGAL_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link megal.impl.MegalNamedImpl <em>Named</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see megal.impl.MegalNamedImpl
	 * @see megal.impl.MegalPackageImpl#getMegalNamed()
	 * @generated
	 */
	int MEGAL_NAMED = 7;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_NAMED__ANNOTATIONS = MEGAL_DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_NAMED__NAME = MEGAL_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_NAMED_FEATURE_COUNT = MEGAL_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Named</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_NAMED_OPERATION_COUNT = MEGAL_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link megal.impl.MegalEntityTypeImpl <em>Entity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see megal.impl.MegalEntityTypeImpl
	 * @see megal.impl.MegalPackageImpl#getMegalEntityType()
	 * @generated
	 */
	int MEGAL_ENTITY_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_ENTITY_TYPE__ANNOTATIONS = MEGAL_NAMED__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_ENTITY_TYPE__NAME = MEGAL_NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Supertype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_ENTITY_TYPE__SUPERTYPE = MEGAL_NAMED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_ENTITY_TYPE_FEATURE_COUNT = MEGAL_NAMED_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Entity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_ENTITY_TYPE_OPERATION_COUNT = MEGAL_NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link megal.impl.MegalRelationshipTypeImpl <em>Relationship Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see megal.impl.MegalRelationshipTypeImpl
	 * @see megal.impl.MegalPackageImpl#getMegalRelationshipType()
	 * @generated
	 */
	int MEGAL_RELATIONSHIP_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_RELATIONSHIP_TYPE__ANNOTATIONS = MEGAL_NAMED__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_RELATIONSHIP_TYPE__NAME = MEGAL_NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_RELATIONSHIP_TYPE__LEFT = MEGAL_NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_RELATIONSHIP_TYPE__RIGHT = MEGAL_NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Left Both</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_RELATIONSHIP_TYPE__LEFT_BOTH = MEGAL_NAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Right Both</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_RELATIONSHIP_TYPE__RIGHT_BOTH = MEGAL_NAMED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Left Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_RELATIONSHIP_TYPE__LEFT_MANY = MEGAL_NAMED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Right Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_RELATIONSHIP_TYPE__RIGHT_MANY = MEGAL_NAMED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Left Params</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_RELATIONSHIP_TYPE__LEFT_PARAMS = MEGAL_NAMED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Right Params</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_RELATIONSHIP_TYPE__RIGHT_PARAMS = MEGAL_NAMED_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Relationship Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_RELATIONSHIP_TYPE_FEATURE_COUNT = MEGAL_NAMED_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Relationship Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_RELATIONSHIP_TYPE_OPERATION_COUNT = MEGAL_NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link megal.impl.MegalEntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see megal.impl.MegalEntityImpl
	 * @see megal.impl.MegalPackageImpl#getMegalEntity()
	 * @generated
	 */
	int MEGAL_ENTITY = 10;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_ENTITY__ANNOTATIONS = MEGAL_NAMED__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_ENTITY__NAME = MEGAL_NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_ENTITY__TYPE = MEGAL_NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Params</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_ENTITY__PARAMS = MEGAL_NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_ENTITY__MANY = MEGAL_NAMED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_ENTITY_FEATURE_COUNT = MEGAL_NAMED_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_ENTITY_OPERATION_COUNT = MEGAL_NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link megal.impl.SelectionImpl <em>Selection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see megal.impl.SelectionImpl
	 * @see megal.impl.MegalPackageImpl#getSelection()
	 * @generated
	 */
	int SELECTION = 11;

	/**
	 * The feature id for the '<em><b>Select</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__SELECT = 0;

	/**
	 * The feature id for the '<em><b>Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__QUERY = 1;

	/**
	 * The number of structural features of the '<em>Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link megal.impl.QueryStatementImpl <em>Query Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see megal.impl.QueryStatementImpl
	 * @see megal.impl.MegalPackageImpl#getQueryStatement()
	 * @generated
	 */
	int QUERY_STATEMENT = 12;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_STATEMENT__SUBJECT = 0;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_STATEMENT__PREDICATE = 1;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_STATEMENT__OBJECT = 2;

	/**
	 * The number of structural features of the '<em>Query Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_STATEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Query Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link megal.QueryEntry <em>Query Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see megal.QueryEntry
	 * @see megal.impl.MegalPackageImpl#getQueryEntry()
	 * @generated
	 */
	int QUERY_ENTRY = 13;

	/**
	 * The number of structural features of the '<em>Query Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_ENTRY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Query Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link megal.impl.QueryParamImpl <em>Query Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see megal.impl.QueryParamImpl
	 * @see megal.impl.MegalPackageImpl#getQueryParam()
	 * @generated
	 */
	int QUERY_PARAM = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAM__NAME = QUERY_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAM__TYPE = QUERY_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Query Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAM_FEATURE_COUNT = QUERY_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Query Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAM_OPERATION_COUNT = QUERY_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link megal.impl.QueryReferenceImpl <em>Query Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see megal.impl.QueryReferenceImpl
	 * @see megal.impl.MegalPackageImpl#getQueryReference()
	 * @generated
	 */
	int QUERY_REFERENCE = 15;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_REFERENCE__REF = QUERY_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Query Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_REFERENCE_FEATURE_COUNT = QUERY_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Query Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_REFERENCE_OPERATION_COUNT = QUERY_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link megal.impl.QueryStringImpl <em>Query String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see megal.impl.QueryStringImpl
	 * @see megal.impl.MegalPackageImpl#getQueryString()
	 * @generated
	 */
	int QUERY_STRING = 16;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_STRING__VALUE = QUERY_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Query String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_STRING_FEATURE_COUNT = QUERY_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Query String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_STRING_OPERATION_COUNT = QUERY_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link megal.impl.QueryEntityImpl <em>Query Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see megal.impl.QueryEntityImpl
	 * @see megal.impl.MegalPackageImpl#getQueryEntity()
	 * @generated
	 */
	int QUERY_ENTITY = 17;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_ENTITY__ENTITY = QUERY_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Query Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_ENTITY_FEATURE_COUNT = QUERY_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Query Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_ENTITY_OPERATION_COUNT = QUERY_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link megal.impl.QueryPosImpl <em>Query Pos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see megal.impl.QueryPosImpl
	 * @see megal.impl.MegalPackageImpl#getQueryPos()
	 * @generated
	 */
	int QUERY_POS = 18;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_POS__VALUE = QUERY_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Query Pos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_POS_FEATURE_COUNT = QUERY_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Query Pos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_POS_OPERATION_COUNT = QUERY_ENTRY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link megal.MegalAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see megal.MegalAnnotation
	 * @generated
	 */
	EClass getMegalAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link megal.MegalAnnotation#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see megal.MegalAnnotation#getKey()
	 * @see #getMegalAnnotation()
	 * @generated
	 */
	EAttribute getMegalAnnotation_Key();

	/**
	 * Returns the meta object for the containment reference '{@link megal.MegalAnnotation#getSelection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Selection</em>'.
	 * @see megal.MegalAnnotation#getSelection()
	 * @see #getMegalAnnotation()
	 * @generated
	 */
	EReference getMegalAnnotation_Selection();

	/**
	 * Returns the meta object for class '{@link megal.MegalElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see megal.MegalElement
	 * @generated
	 */
	EClass getMegalElement();

	/**
	 * Returns the meta object for the containment reference list '{@link megal.MegalElement#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see megal.MegalElement#getAnnotations()
	 * @see #getMegalElement()
	 * @generated
	 */
	EReference getMegalElement_Annotations();

	/**
	 * Returns the meta object for class '{@link megal.MegalFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see megal.MegalFile
	 * @generated
	 */
	EClass getMegalFile();

	/**
	 * Returns the meta object for the containment reference list '{@link megal.MegalFile#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see megal.MegalFile#getDeclarations()
	 * @see #getMegalFile()
	 * @generated
	 */
	EReference getMegalFile_Declarations();

	/**
	 * Returns the meta object for the containment reference list '{@link megal.MegalFile#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see megal.MegalFile#getBindings()
	 * @see #getMegalFile()
	 * @generated
	 */
	EReference getMegalFile_Bindings();

	/**
	 * Returns the meta object for the attribute '{@link megal.MegalFile#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see megal.MegalFile#getName()
	 * @see #getMegalFile()
	 * @generated
	 */
	EAttribute getMegalFile_Name();

	/**
	 * Returns the meta object for the reference list '{@link megal.MegalFile#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Imports</em>'.
	 * @see megal.MegalFile#getImports()
	 * @see #getMegalFile()
	 * @generated
	 */
	EReference getMegalFile_Imports();

	/**
	 * Returns the meta object for class '{@link megal.MegalLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see megal.MegalLink
	 * @generated
	 */
	EClass getMegalLink();

	/**
	 * Returns the meta object for the reference '{@link megal.MegalLink#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Link</em>'.
	 * @see megal.MegalLink#getLink()
	 * @see #getMegalLink()
	 * @generated
	 */
	EReference getMegalLink_Link();

	/**
	 * Returns the meta object for the attribute '{@link megal.MegalLink#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see megal.MegalLink#getTo()
	 * @see #getMegalLink()
	 * @generated
	 */
	EAttribute getMegalLink_To();

	/**
	 * Returns the meta object for the reference '{@link megal.MegalLink#getFirst <em>First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First</em>'.
	 * @see megal.MegalLink#getFirst()
	 * @see #getMegalLink()
	 * @generated
	 */
	EReference getMegalLink_First();

	/**
	 * Returns the meta object for the reference '{@link megal.MegalLink#getSecond <em>Second</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Second</em>'.
	 * @see megal.MegalLink#getSecond()
	 * @see #getMegalLink()
	 * @generated
	 */
	EReference getMegalLink_Second();

	/**
	 * Returns the meta object for class '{@link megal.MegalDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaration</em>'.
	 * @see megal.MegalDeclaration
	 * @generated
	 */
	EClass getMegalDeclaration();

	/**
	 * Returns the meta object for class '{@link megal.MegalRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see megal.MegalRelationship
	 * @generated
	 */
	EClass getMegalRelationship();

	/**
	 * Returns the meta object for the reference '{@link megal.MegalRelationship#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see megal.MegalRelationship#getType()
	 * @see #getMegalRelationship()
	 * @generated
	 */
	EReference getMegalRelationship_Type();

	/**
	 * Returns the meta object for the reference '{@link megal.MegalRelationship#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left</em>'.
	 * @see megal.MegalRelationship#getLeft()
	 * @see #getMegalRelationship()
	 * @generated
	 */
	EReference getMegalRelationship_Left();

	/**
	 * Returns the meta object for the reference '{@link megal.MegalRelationship#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right</em>'.
	 * @see megal.MegalRelationship#getRight()
	 * @see #getMegalRelationship()
	 * @generated
	 */
	EReference getMegalRelationship_Right();

	/**
	 * Returns the meta object for class '{@link megal.MegalPair <em>Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pair</em>'.
	 * @see megal.MegalPair
	 * @generated
	 */
	EClass getMegalPair();

	/**
	 * Returns the meta object for the reference '{@link megal.MegalPair#getSet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Set</em>'.
	 * @see megal.MegalPair#getSet()
	 * @see #getMegalPair()
	 * @generated
	 */
	EReference getMegalPair_Set();

	/**
	 * Returns the meta object for the reference '{@link megal.MegalPair#getFirst <em>First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First</em>'.
	 * @see megal.MegalPair#getFirst()
	 * @see #getMegalPair()
	 * @generated
	 */
	EReference getMegalPair_First();

	/**
	 * Returns the meta object for the reference '{@link megal.MegalPair#getSecond <em>Second</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Second</em>'.
	 * @see megal.MegalPair#getSecond()
	 * @see #getMegalPair()
	 * @generated
	 */
	EReference getMegalPair_Second();

	/**
	 * Returns the meta object for class '{@link megal.MegalNamed <em>Named</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named</em>'.
	 * @see megal.MegalNamed
	 * @generated
	 */
	EClass getMegalNamed();

	/**
	 * Returns the meta object for the attribute '{@link megal.MegalNamed#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see megal.MegalNamed#getName()
	 * @see #getMegalNamed()
	 * @generated
	 */
	EAttribute getMegalNamed_Name();

	/**
	 * Returns the meta object for class '{@link megal.MegalEntityType <em>Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Type</em>'.
	 * @see megal.MegalEntityType
	 * @generated
	 */
	EClass getMegalEntityType();

	/**
	 * Returns the meta object for the reference '{@link megal.MegalEntityType#getSupertype <em>Supertype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Supertype</em>'.
	 * @see megal.MegalEntityType#getSupertype()
	 * @see #getMegalEntityType()
	 * @generated
	 */
	EReference getMegalEntityType_Supertype();

	/**
	 * Returns the meta object for class '{@link megal.MegalRelationshipType <em>Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Type</em>'.
	 * @see megal.MegalRelationshipType
	 * @generated
	 */
	EClass getMegalRelationshipType();

	/**
	 * Returns the meta object for the reference '{@link megal.MegalRelationshipType#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left</em>'.
	 * @see megal.MegalRelationshipType#getLeft()
	 * @see #getMegalRelationshipType()
	 * @generated
	 */
	EReference getMegalRelationshipType_Left();

	/**
	 * Returns the meta object for the reference '{@link megal.MegalRelationshipType#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right</em>'.
	 * @see megal.MegalRelationshipType#getRight()
	 * @see #getMegalRelationshipType()
	 * @generated
	 */
	EReference getMegalRelationshipType_Right();

	/**
	 * Returns the meta object for the attribute '{@link megal.MegalRelationshipType#isLeftBoth <em>Left Both</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left Both</em>'.
	 * @see megal.MegalRelationshipType#isLeftBoth()
	 * @see #getMegalRelationshipType()
	 * @generated
	 */
	EAttribute getMegalRelationshipType_LeftBoth();

	/**
	 * Returns the meta object for the attribute '{@link megal.MegalRelationshipType#isRightBoth <em>Right Both</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right Both</em>'.
	 * @see megal.MegalRelationshipType#isRightBoth()
	 * @see #getMegalRelationshipType()
	 * @generated
	 */
	EAttribute getMegalRelationshipType_RightBoth();

	/**
	 * Returns the meta object for the attribute '{@link megal.MegalRelationshipType#isLeftMany <em>Left Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left Many</em>'.
	 * @see megal.MegalRelationshipType#isLeftMany()
	 * @see #getMegalRelationshipType()
	 * @generated
	 */
	EAttribute getMegalRelationshipType_LeftMany();

	/**
	 * Returns the meta object for the attribute '{@link megal.MegalRelationshipType#isRightMany <em>Right Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right Many</em>'.
	 * @see megal.MegalRelationshipType#isRightMany()
	 * @see #getMegalRelationshipType()
	 * @generated
	 */
	EAttribute getMegalRelationshipType_RightMany();

	/**
	 * Returns the meta object for the reference list '{@link megal.MegalRelationshipType#getLeftParams <em>Left Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Left Params</em>'.
	 * @see megal.MegalRelationshipType#getLeftParams()
	 * @see #getMegalRelationshipType()
	 * @generated
	 */
	EReference getMegalRelationshipType_LeftParams();

	/**
	 * Returns the meta object for the reference list '{@link megal.MegalRelationshipType#getRightParams <em>Right Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Right Params</em>'.
	 * @see megal.MegalRelationshipType#getRightParams()
	 * @see #getMegalRelationshipType()
	 * @generated
	 */
	EReference getMegalRelationshipType_RightParams();

	/**
	 * Returns the meta object for class '{@link megal.MegalEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see megal.MegalEntity
	 * @generated
	 */
	EClass getMegalEntity();

	/**
	 * Returns the meta object for the reference '{@link megal.MegalEntity#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see megal.MegalEntity#getType()
	 * @see #getMegalEntity()
	 * @generated
	 */
	EReference getMegalEntity_Type();

	/**
	 * Returns the meta object for the reference list '{@link megal.MegalEntity#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Params</em>'.
	 * @see megal.MegalEntity#getParams()
	 * @see #getMegalEntity()
	 * @generated
	 */
	EReference getMegalEntity_Params();

	/**
	 * Returns the meta object for the attribute '{@link megal.MegalEntity#isMany <em>Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Many</em>'.
	 * @see megal.MegalEntity#isMany()
	 * @see #getMegalEntity()
	 * @generated
	 */
	EAttribute getMegalEntity_Many();

	/**
	 * Returns the meta object for class '{@link megal.Selection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection</em>'.
	 * @see megal.Selection
	 * @generated
	 */
	EClass getSelection();

	/**
	 * Returns the meta object for the containment reference list '{@link megal.Selection#getSelect <em>Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Select</em>'.
	 * @see megal.Selection#getSelect()
	 * @see #getSelection()
	 * @generated
	 */
	EReference getSelection_Select();

	/**
	 * Returns the meta object for the containment reference list '{@link megal.Selection#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Query</em>'.
	 * @see megal.Selection#getQuery()
	 * @see #getSelection()
	 * @generated
	 */
	EReference getSelection_Query();

	/**
	 * Returns the meta object for class '{@link megal.QueryStatement <em>Query Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Statement</em>'.
	 * @see megal.QueryStatement
	 * @generated
	 */
	EClass getQueryStatement();

	/**
	 * Returns the meta object for the containment reference '{@link megal.QueryStatement#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subject</em>'.
	 * @see megal.QueryStatement#getSubject()
	 * @see #getQueryStatement()
	 * @generated
	 */
	EReference getQueryStatement_Subject();

	/**
	 * Returns the meta object for the reference '{@link megal.QueryStatement#getPredicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Predicate</em>'.
	 * @see megal.QueryStatement#getPredicate()
	 * @see #getQueryStatement()
	 * @generated
	 */
	EReference getQueryStatement_Predicate();

	/**
	 * Returns the meta object for the containment reference '{@link megal.QueryStatement#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see megal.QueryStatement#getObject()
	 * @see #getQueryStatement()
	 * @generated
	 */
	EReference getQueryStatement_Object();

	/**
	 * Returns the meta object for class '{@link megal.QueryEntry <em>Query Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Entry</em>'.
	 * @see megal.QueryEntry
	 * @generated
	 */
	EClass getQueryEntry();

	/**
	 * Returns the meta object for class '{@link megal.QueryParam <em>Query Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Param</em>'.
	 * @see megal.QueryParam
	 * @generated
	 */
	EClass getQueryParam();

	/**
	 * Returns the meta object for the attribute '{@link megal.QueryParam#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see megal.QueryParam#getName()
	 * @see #getQueryParam()
	 * @generated
	 */
	EAttribute getQueryParam_Name();

	/**
	 * Returns the meta object for the reference '{@link megal.QueryParam#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see megal.QueryParam#getType()
	 * @see #getQueryParam()
	 * @generated
	 */
	EReference getQueryParam_Type();

	/**
	 * Returns the meta object for class '{@link megal.QueryReference <em>Query Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Reference</em>'.
	 * @see megal.QueryReference
	 * @generated
	 */
	EClass getQueryReference();

	/**
	 * Returns the meta object for the reference '{@link megal.QueryReference#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see megal.QueryReference#getRef()
	 * @see #getQueryReference()
	 * @generated
	 */
	EReference getQueryReference_Ref();

	/**
	 * Returns the meta object for class '{@link megal.QueryString <em>Query String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query String</em>'.
	 * @see megal.QueryString
	 * @generated
	 */
	EClass getQueryString();

	/**
	 * Returns the meta object for the attribute '{@link megal.QueryString#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see megal.QueryString#getValue()
	 * @see #getQueryString()
	 * @generated
	 */
	EAttribute getQueryString_Value();

	/**
	 * Returns the meta object for class '{@link megal.QueryEntity <em>Query Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Entity</em>'.
	 * @see megal.QueryEntity
	 * @generated
	 */
	EClass getQueryEntity();

	/**
	 * Returns the meta object for the reference '{@link megal.QueryEntity#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see megal.QueryEntity#getEntity()
	 * @see #getQueryEntity()
	 * @generated
	 */
	EReference getQueryEntity_Entity();

	/**
	 * Returns the meta object for class '{@link megal.QueryPos <em>Query Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Pos</em>'.
	 * @see megal.QueryPos
	 * @generated
	 */
	EClass getQueryPos();

	/**
	 * Returns the meta object for the attribute '{@link megal.QueryPos#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see megal.QueryPos#getValue()
	 * @see #getQueryPos()
	 * @generated
	 */
	EAttribute getQueryPos_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MegalFactory getMegalFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link megal.impl.MegalAnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see megal.impl.MegalAnnotationImpl
		 * @see megal.impl.MegalPackageImpl#getMegalAnnotation()
		 * @generated
		 */
		EClass MEGAL_ANNOTATION = eINSTANCE.getMegalAnnotation();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEGAL_ANNOTATION__KEY = eINSTANCE.getMegalAnnotation_Key();

		/**
		 * The meta object literal for the '<em><b>Selection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEGAL_ANNOTATION__SELECTION = eINSTANCE.getMegalAnnotation_Selection();

		/**
		 * The meta object literal for the '{@link megal.MegalElement <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see megal.MegalElement
		 * @see megal.impl.MegalPackageImpl#getMegalElement()
		 * @generated
		 */
		EClass MEGAL_ELEMENT = eINSTANCE.getMegalElement();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEGAL_ELEMENT__ANNOTATIONS = eINSTANCE.getMegalElement_Annotations();

		/**
		 * The meta object literal for the '{@link megal.impl.MegalFileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see megal.impl.MegalFileImpl
		 * @see megal.impl.MegalPackageImpl#getMegalFile()
		 * @generated
		 */
		EClass MEGAL_FILE = eINSTANCE.getMegalFile();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEGAL_FILE__DECLARATIONS = eINSTANCE.getMegalFile_Declarations();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEGAL_FILE__BINDINGS = eINSTANCE.getMegalFile_Bindings();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEGAL_FILE__NAME = eINSTANCE.getMegalFile_Name();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEGAL_FILE__IMPORTS = eINSTANCE.getMegalFile_Imports();

		/**
		 * The meta object literal for the '{@link megal.impl.MegalLinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see megal.impl.MegalLinkImpl
		 * @see megal.impl.MegalPackageImpl#getMegalLink()
		 * @generated
		 */
		EClass MEGAL_LINK = eINSTANCE.getMegalLink();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEGAL_LINK__LINK = eINSTANCE.getMegalLink_Link();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEGAL_LINK__TO = eINSTANCE.getMegalLink_To();

		/**
		 * The meta object literal for the '<em><b>First</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEGAL_LINK__FIRST = eINSTANCE.getMegalLink_First();

		/**
		 * The meta object literal for the '<em><b>Second</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEGAL_LINK__SECOND = eINSTANCE.getMegalLink_Second();

		/**
		 * The meta object literal for the '{@link megal.impl.MegalDeclarationImpl <em>Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see megal.impl.MegalDeclarationImpl
		 * @see megal.impl.MegalPackageImpl#getMegalDeclaration()
		 * @generated
		 */
		EClass MEGAL_DECLARATION = eINSTANCE.getMegalDeclaration();

		/**
		 * The meta object literal for the '{@link megal.impl.MegalRelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see megal.impl.MegalRelationshipImpl
		 * @see megal.impl.MegalPackageImpl#getMegalRelationship()
		 * @generated
		 */
		EClass MEGAL_RELATIONSHIP = eINSTANCE.getMegalRelationship();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEGAL_RELATIONSHIP__TYPE = eINSTANCE.getMegalRelationship_Type();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEGAL_RELATIONSHIP__LEFT = eINSTANCE.getMegalRelationship_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEGAL_RELATIONSHIP__RIGHT = eINSTANCE.getMegalRelationship_Right();

		/**
		 * The meta object literal for the '{@link megal.impl.MegalPairImpl <em>Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see megal.impl.MegalPairImpl
		 * @see megal.impl.MegalPackageImpl#getMegalPair()
		 * @generated
		 */
		EClass MEGAL_PAIR = eINSTANCE.getMegalPair();

		/**
		 * The meta object literal for the '<em><b>Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEGAL_PAIR__SET = eINSTANCE.getMegalPair_Set();

		/**
		 * The meta object literal for the '<em><b>First</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEGAL_PAIR__FIRST = eINSTANCE.getMegalPair_First();

		/**
		 * The meta object literal for the '<em><b>Second</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEGAL_PAIR__SECOND = eINSTANCE.getMegalPair_Second();

		/**
		 * The meta object literal for the '{@link megal.impl.MegalNamedImpl <em>Named</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see megal.impl.MegalNamedImpl
		 * @see megal.impl.MegalPackageImpl#getMegalNamed()
		 * @generated
		 */
		EClass MEGAL_NAMED = eINSTANCE.getMegalNamed();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEGAL_NAMED__NAME = eINSTANCE.getMegalNamed_Name();

		/**
		 * The meta object literal for the '{@link megal.impl.MegalEntityTypeImpl <em>Entity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see megal.impl.MegalEntityTypeImpl
		 * @see megal.impl.MegalPackageImpl#getMegalEntityType()
		 * @generated
		 */
		EClass MEGAL_ENTITY_TYPE = eINSTANCE.getMegalEntityType();

		/**
		 * The meta object literal for the '<em><b>Supertype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEGAL_ENTITY_TYPE__SUPERTYPE = eINSTANCE.getMegalEntityType_Supertype();

		/**
		 * The meta object literal for the '{@link megal.impl.MegalRelationshipTypeImpl <em>Relationship Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see megal.impl.MegalRelationshipTypeImpl
		 * @see megal.impl.MegalPackageImpl#getMegalRelationshipType()
		 * @generated
		 */
		EClass MEGAL_RELATIONSHIP_TYPE = eINSTANCE.getMegalRelationshipType();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEGAL_RELATIONSHIP_TYPE__LEFT = eINSTANCE.getMegalRelationshipType_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEGAL_RELATIONSHIP_TYPE__RIGHT = eINSTANCE.getMegalRelationshipType_Right();

		/**
		 * The meta object literal for the '<em><b>Left Both</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEGAL_RELATIONSHIP_TYPE__LEFT_BOTH = eINSTANCE.getMegalRelationshipType_LeftBoth();

		/**
		 * The meta object literal for the '<em><b>Right Both</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEGAL_RELATIONSHIP_TYPE__RIGHT_BOTH = eINSTANCE.getMegalRelationshipType_RightBoth();

		/**
		 * The meta object literal for the '<em><b>Left Many</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEGAL_RELATIONSHIP_TYPE__LEFT_MANY = eINSTANCE.getMegalRelationshipType_LeftMany();

		/**
		 * The meta object literal for the '<em><b>Right Many</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEGAL_RELATIONSHIP_TYPE__RIGHT_MANY = eINSTANCE.getMegalRelationshipType_RightMany();

		/**
		 * The meta object literal for the '<em><b>Left Params</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEGAL_RELATIONSHIP_TYPE__LEFT_PARAMS = eINSTANCE.getMegalRelationshipType_LeftParams();

		/**
		 * The meta object literal for the '<em><b>Right Params</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEGAL_RELATIONSHIP_TYPE__RIGHT_PARAMS = eINSTANCE.getMegalRelationshipType_RightParams();

		/**
		 * The meta object literal for the '{@link megal.impl.MegalEntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see megal.impl.MegalEntityImpl
		 * @see megal.impl.MegalPackageImpl#getMegalEntity()
		 * @generated
		 */
		EClass MEGAL_ENTITY = eINSTANCE.getMegalEntity();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEGAL_ENTITY__TYPE = eINSTANCE.getMegalEntity_Type();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEGAL_ENTITY__PARAMS = eINSTANCE.getMegalEntity_Params();

		/**
		 * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEGAL_ENTITY__MANY = eINSTANCE.getMegalEntity_Many();

		/**
		 * The meta object literal for the '{@link megal.impl.SelectionImpl <em>Selection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see megal.impl.SelectionImpl
		 * @see megal.impl.MegalPackageImpl#getSelection()
		 * @generated
		 */
		EClass SELECTION = eINSTANCE.getSelection();

		/**
		 * The meta object literal for the '<em><b>Select</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTION__SELECT = eINSTANCE.getSelection_Select();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTION__QUERY = eINSTANCE.getSelection_Query();

		/**
		 * The meta object literal for the '{@link megal.impl.QueryStatementImpl <em>Query Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see megal.impl.QueryStatementImpl
		 * @see megal.impl.MegalPackageImpl#getQueryStatement()
		 * @generated
		 */
		EClass QUERY_STATEMENT = eINSTANCE.getQueryStatement();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_STATEMENT__SUBJECT = eINSTANCE.getQueryStatement_Subject();

		/**
		 * The meta object literal for the '<em><b>Predicate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_STATEMENT__PREDICATE = eINSTANCE.getQueryStatement_Predicate();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_STATEMENT__OBJECT = eINSTANCE.getQueryStatement_Object();

		/**
		 * The meta object literal for the '{@link megal.QueryEntry <em>Query Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see megal.QueryEntry
		 * @see megal.impl.MegalPackageImpl#getQueryEntry()
		 * @generated
		 */
		EClass QUERY_ENTRY = eINSTANCE.getQueryEntry();

		/**
		 * The meta object literal for the '{@link megal.impl.QueryParamImpl <em>Query Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see megal.impl.QueryParamImpl
		 * @see megal.impl.MegalPackageImpl#getQueryParam()
		 * @generated
		 */
		EClass QUERY_PARAM = eINSTANCE.getQueryParam();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_PARAM__NAME = eINSTANCE.getQueryParam_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_PARAM__TYPE = eINSTANCE.getQueryParam_Type();

		/**
		 * The meta object literal for the '{@link megal.impl.QueryReferenceImpl <em>Query Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see megal.impl.QueryReferenceImpl
		 * @see megal.impl.MegalPackageImpl#getQueryReference()
		 * @generated
		 */
		EClass QUERY_REFERENCE = eINSTANCE.getQueryReference();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_REFERENCE__REF = eINSTANCE.getQueryReference_Ref();

		/**
		 * The meta object literal for the '{@link megal.impl.QueryStringImpl <em>Query String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see megal.impl.QueryStringImpl
		 * @see megal.impl.MegalPackageImpl#getQueryString()
		 * @generated
		 */
		EClass QUERY_STRING = eINSTANCE.getQueryString();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_STRING__VALUE = eINSTANCE.getQueryString_Value();

		/**
		 * The meta object literal for the '{@link megal.impl.QueryEntityImpl <em>Query Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see megal.impl.QueryEntityImpl
		 * @see megal.impl.MegalPackageImpl#getQueryEntity()
		 * @generated
		 */
		EClass QUERY_ENTITY = eINSTANCE.getQueryEntity();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_ENTITY__ENTITY = eINSTANCE.getQueryEntity_Entity();

		/**
		 * The meta object literal for the '{@link megal.impl.QueryPosImpl <em>Query Pos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see megal.impl.QueryPosImpl
		 * @see megal.impl.MegalPackageImpl#getQueryPos()
		 * @generated
		 */
		EClass QUERY_POS = eINSTANCE.getQueryPos();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_POS__VALUE = eINSTANCE.getQueryPos_Value();

	}

} //MegalPackage

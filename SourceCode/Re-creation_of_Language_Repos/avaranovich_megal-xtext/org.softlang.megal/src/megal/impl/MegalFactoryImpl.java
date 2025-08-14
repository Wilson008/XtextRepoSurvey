/**
 */
package megal.impl;

import megal.*;

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
public class MegalFactoryImpl extends EFactoryImpl implements MegalFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MegalFactory init() {
		try {
			MegalFactory theMegalFactory = (MegalFactory)EPackage.Registry.INSTANCE.getEFactory(MegalPackage.eNS_URI);
			if (theMegalFactory != null) {
				return theMegalFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MegalFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MegalFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MegalPackage.MEGAL_ANNOTATION: return createMegalAnnotation();
			case MegalPackage.MEGAL_FILE: return createMegalFile();
			case MegalPackage.MEGAL_LINK: return createMegalLink();
			case MegalPackage.MEGAL_RELATIONSHIP: return createMegalRelationship();
			case MegalPackage.MEGAL_PAIR: return createMegalPair();
			case MegalPackage.MEGAL_ENTITY_TYPE: return createMegalEntityType();
			case MegalPackage.MEGAL_RELATIONSHIP_TYPE: return createMegalRelationshipType();
			case MegalPackage.MEGAL_ENTITY: return createMegalEntity();
			case MegalPackage.SELECTION: return createSelection();
			case MegalPackage.QUERY_STATEMENT: return createQueryStatement();
			case MegalPackage.QUERY_PARAM: return createQueryParam();
			case MegalPackage.QUERY_REFERENCE: return createQueryReference();
			case MegalPackage.QUERY_STRING: return createQueryString();
			case MegalPackage.QUERY_ENTITY: return createQueryEntity();
			case MegalPackage.QUERY_POS: return createQueryPos();
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
	public MegalAnnotation createMegalAnnotation() {
		MegalAnnotationImpl megalAnnotation = new MegalAnnotationImpl();
		return megalAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MegalFile createMegalFile() {
		MegalFileImpl megalFile = new MegalFileImpl();
		return megalFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MegalLink createMegalLink() {
		MegalLinkImpl megalLink = new MegalLinkImpl();
		return megalLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MegalRelationship createMegalRelationship() {
		MegalRelationshipImpl megalRelationship = new MegalRelationshipImpl();
		return megalRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MegalPair createMegalPair() {
		MegalPairImpl megalPair = new MegalPairImpl();
		return megalPair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MegalEntityType createMegalEntityType() {
		MegalEntityTypeImpl megalEntityType = new MegalEntityTypeImpl();
		return megalEntityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MegalRelationshipType createMegalRelationshipType() {
		MegalRelationshipTypeImpl megalRelationshipType = new MegalRelationshipTypeImpl();
		return megalRelationshipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MegalEntity createMegalEntity() {
		MegalEntityImpl megalEntity = new MegalEntityImpl();
		return megalEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Selection createSelection() {
		SelectionImpl selection = new SelectionImpl();
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QueryStatement createQueryStatement() {
		QueryStatementImpl queryStatement = new QueryStatementImpl();
		return queryStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QueryParam createQueryParam() {
		QueryParamImpl queryParam = new QueryParamImpl();
		return queryParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QueryReference createQueryReference() {
		QueryReferenceImpl queryReference = new QueryReferenceImpl();
		return queryReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QueryString createQueryString() {
		QueryStringImpl queryString = new QueryStringImpl();
		return queryString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QueryEntity createQueryEntity() {
		QueryEntityImpl queryEntity = new QueryEntityImpl();
		return queryEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QueryPos createQueryPos() {
		QueryPosImpl queryPos = new QueryPosImpl();
		return queryPos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MegalPackage getMegalPackage() {
		return (MegalPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MegalPackage getPackage() {
		return MegalPackage.eINSTANCE;
	}

} //MegalFactoryImpl

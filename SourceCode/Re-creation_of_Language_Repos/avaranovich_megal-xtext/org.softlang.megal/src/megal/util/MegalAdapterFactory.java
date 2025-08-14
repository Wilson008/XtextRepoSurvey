/**
 */
package megal.util;

import megal.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see megal.MegalPackage
 * @generated
 */
public class MegalAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MegalPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MegalAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MegalPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MegalSwitch<Adapter> modelSwitch =
		new MegalSwitch<Adapter>() {
			@Override
			public Adapter caseMegalAnnotation(MegalAnnotation object) {
				return createMegalAnnotationAdapter();
			}
			@Override
			public Adapter caseMegalElement(MegalElement object) {
				return createMegalElementAdapter();
			}
			@Override
			public Adapter caseMegalFile(MegalFile object) {
				return createMegalFileAdapter();
			}
			@Override
			public Adapter caseMegalLink(MegalLink object) {
				return createMegalLinkAdapter();
			}
			@Override
			public Adapter caseMegalDeclaration(MegalDeclaration object) {
				return createMegalDeclarationAdapter();
			}
			@Override
			public Adapter caseMegalRelationship(MegalRelationship object) {
				return createMegalRelationshipAdapter();
			}
			@Override
			public Adapter caseMegalPair(MegalPair object) {
				return createMegalPairAdapter();
			}
			@Override
			public Adapter caseMegalNamed(MegalNamed object) {
				return createMegalNamedAdapter();
			}
			@Override
			public Adapter caseMegalEntityType(MegalEntityType object) {
				return createMegalEntityTypeAdapter();
			}
			@Override
			public Adapter caseMegalRelationshipType(MegalRelationshipType object) {
				return createMegalRelationshipTypeAdapter();
			}
			@Override
			public Adapter caseMegalEntity(MegalEntity object) {
				return createMegalEntityAdapter();
			}
			@Override
			public Adapter caseSelection(Selection object) {
				return createSelectionAdapter();
			}
			@Override
			public Adapter caseQueryStatement(QueryStatement object) {
				return createQueryStatementAdapter();
			}
			@Override
			public Adapter caseQueryEntry(QueryEntry object) {
				return createQueryEntryAdapter();
			}
			@Override
			public Adapter caseQueryParam(QueryParam object) {
				return createQueryParamAdapter();
			}
			@Override
			public Adapter caseQueryReference(QueryReference object) {
				return createQueryReferenceAdapter();
			}
			@Override
			public Adapter caseQueryString(QueryString object) {
				return createQueryStringAdapter();
			}
			@Override
			public Adapter caseQueryEntity(QueryEntity object) {
				return createQueryEntityAdapter();
			}
			@Override
			public Adapter caseQueryPos(QueryPos object) {
				return createQueryPosAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link megal.MegalAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see megal.MegalAnnotation
	 * @generated
	 */
	public Adapter createMegalAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link megal.MegalElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see megal.MegalElement
	 * @generated
	 */
	public Adapter createMegalElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link megal.MegalFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see megal.MegalFile
	 * @generated
	 */
	public Adapter createMegalFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link megal.MegalLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see megal.MegalLink
	 * @generated
	 */
	public Adapter createMegalLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link megal.MegalDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see megal.MegalDeclaration
	 * @generated
	 */
	public Adapter createMegalDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link megal.MegalRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see megal.MegalRelationship
	 * @generated
	 */
	public Adapter createMegalRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link megal.MegalPair <em>Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see megal.MegalPair
	 * @generated
	 */
	public Adapter createMegalPairAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link megal.MegalNamed <em>Named</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see megal.MegalNamed
	 * @generated
	 */
	public Adapter createMegalNamedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link megal.MegalEntityType <em>Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see megal.MegalEntityType
	 * @generated
	 */
	public Adapter createMegalEntityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link megal.MegalRelationshipType <em>Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see megal.MegalRelationshipType
	 * @generated
	 */
	public Adapter createMegalRelationshipTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link megal.MegalEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see megal.MegalEntity
	 * @generated
	 */
	public Adapter createMegalEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link megal.Selection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see megal.Selection
	 * @generated
	 */
	public Adapter createSelectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link megal.QueryStatement <em>Query Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see megal.QueryStatement
	 * @generated
	 */
	public Adapter createQueryStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link megal.QueryEntry <em>Query Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see megal.QueryEntry
	 * @generated
	 */
	public Adapter createQueryEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link megal.QueryParam <em>Query Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see megal.QueryParam
	 * @generated
	 */
	public Adapter createQueryParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link megal.QueryReference <em>Query Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see megal.QueryReference
	 * @generated
	 */
	public Adapter createQueryReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link megal.QueryString <em>Query String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see megal.QueryString
	 * @generated
	 */
	public Adapter createQueryStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link megal.QueryEntity <em>Query Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see megal.QueryEntity
	 * @generated
	 */
	public Adapter createQueryEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link megal.QueryPos <em>Query Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see megal.QueryPos
	 * @generated
	 */
	public Adapter createQueryPosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MegalAdapterFactory

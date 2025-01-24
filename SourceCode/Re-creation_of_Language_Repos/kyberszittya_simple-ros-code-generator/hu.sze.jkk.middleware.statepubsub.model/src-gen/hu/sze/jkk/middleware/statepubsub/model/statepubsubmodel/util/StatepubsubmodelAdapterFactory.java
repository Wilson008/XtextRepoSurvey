/**
 */
package hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.util;

import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage
 * @generated
 */
public class StatepubsubmodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StatepubsubmodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatepubsubmodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = StatepubsubmodelPackage.eINSTANCE;
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
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatepubsubmodelSwitch<Adapter> modelSwitch = new StatepubsubmodelSwitch<Adapter>() {
		@Override
		public Adapter caseStack(Stack object) {
			return createStackAdapter();
		}

		@Override
		public Adapter caseInputPort(InputPort object) {
			return createInputPortAdapter();
		}

		@Override
		public Adapter caseOutputPort(OutputPort object) {
			return createOutputPortAdapter();
		}

		@Override
		public Adapter casePort(Port object) {
			return createPortAdapter();
		}

		@Override
		public Adapter caseRosRuntimeElement(RosRuntimeElement object) {
			return createRosRuntimeElementAdapter();
		}

		@Override
		public Adapter caseTopicMessage(TopicMessage object) {
			return createTopicMessageAdapter();
		}

		@Override
		public Adapter caseTopic(Topic object) {
			return createTopicAdapter();
		}

		@Override
		public Adapter caseContinousState(ContinousState object) {
			return createContinousStateAdapter();
		}

		@Override
		public Adapter caseDescriptiveElement(DescriptiveElement object) {
			return createDescriptiveElementAdapter();
		}

		@Override
		public Adapter caseWorkerThread(WorkerThread object) {
			return createWorkerThreadAdapter();
		}

		@Override
		public Adapter caseBehavior(Behavior object) {
			return createBehaviorAdapter();
		}

		@Override
		public Adapter caseHybridSystem(HybridSystem object) {
			return createHybridSystemAdapter();
		}

		@Override
		public Adapter caseLocation(Location object) {
			return createLocationAdapter();
		}

		@Override
		public Adapter caseTransition(Transition object) {
			return createTransitionAdapter();
		}

		@Override
		public Adapter caseContinuousVariable(ContinuousVariable object) {
			return createContinuousVariableAdapter();
		}

		@Override
		public Adapter caseActivity(Activity object) {
			return createActivityAdapter();
		}

		@Override
		public Adapter caseDiscreteEvent(DiscreteEvent object) {
			return createDiscreteEventAdapter();
		}

		@Override
		public Adapter caseFuzzyHybridSystem(FuzzyHybridSystem object) {
			return createFuzzyHybridSystemAdapter();
		}

		@Override
		public Adapter caseRuleSet(RuleSet object) {
			return createRuleSetAdapter();
		}

		@Override
		public Adapter caseInvariant(Invariant object) {
			return createInvariantAdapter();
		}

		@Override
		public Adapter caseNodeParameter(NodeParameter object) {
			return createNodeParameterAdapter();
		}

		@Override
		public Adapter caseNodeParameterGroup(NodeParameterGroup object) {
			return createNodeParameterGroupAdapter();
		}

		@Override
		public Adapter caseAbstractNodeParameter(AbstractNodeParameter object) {
			return createAbstractNodeParameterAdapter();
		}

		@Override
		public Adapter caseDoubleParameter(DoubleParameter object) {
			return createDoubleParameterAdapter();
		}

		@Override
		public Adapter caseStringParameter(StringParameter object) {
			return createStringParameterAdapter();
		}

		@Override
		public Adapter caseBooleanParameter(BooleanParameter object) {
			return createBooleanParameterAdapter();
		}

		@Override
		public Adapter caseIntegerParameter(IntegerParameter object) {
			return createIntegerParameterAdapter();
		}

		@Override
		public Adapter caseErrorLocation(ErrorLocation object) {
			return createErrorLocationAdapter();
		}

		@Override
		public Adapter caseServiceType(ServiceType object) {
			return createServiceTypeAdapter();
		}

		@Override
		public Adapter caseAbstractMsgType(AbstractMsgType object) {
			return createAbstractMsgTypeAdapter();
		}

		@Override
		public Adapter caseChannel(Channel object) {
			return createChannelAdapter();
		}

		@Override
		public Adapter caseService(Service object) {
			return createServiceAdapter();
		}

		@Override
		public Adapter caseFilePackage(FilePackage object) {
			return createFilePackageAdapter();
		}

		@Override
		public Adapter caseAbstractRosFileElement(AbstractRosFileElement object) {
			return createAbstractRosFileElementAdapter();
		}

		@Override
		public Adapter caseRosElement(RosElement object) {
			return createRosElementAdapter();
		}

		@Override
		public Adapter caseNode(Node object) {
			return createNodeAdapter();
		}

		@Override
		public Adapter caseTemplateNode(TemplateNode object) {
			return createTemplateNodeAdapter();
		}

		@Override
		public Adapter caseFilterDefinition(FilterDefinition object) {
			return createFilterDefinitionAdapter();
		}

		@Override
		public Adapter caseFilterConnection(FilterConnection object) {
			return createFilterConnectionAdapter();
		}

		@Override
		public Adapter caseInternalNode(InternalNode object) {
			return createInternalNodeAdapter();
		}

		@Override
		public Adapter caseSerializedField(SerializedField object) {
			return createSerializedFieldAdapter();
		}

		@Override
		public Adapter caseInternalEdge(InternalEdge object) {
			return createInternalEdgeAdapter();
		}

		@Override
		public Adapter caseInternalElement(InternalElement object) {
			return createInternalElementAdapter();
		}

		@Override
		public Adapter caseDirectConnection(DirectConnection object) {
			return createDirectConnectionAdapter();
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
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Stack <em>Stack</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Stack
	 * @generated
	 */
	public Adapter createStackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.InputPort <em>Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.InputPort
	 * @generated
	 */
	public Adapter createInputPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.OutputPort <em>Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.OutputPort
	 * @generated
	 */
	public Adapter createOutputPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.RosRuntimeElement <em>Ros Runtime Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.RosRuntimeElement
	 * @generated
	 */
	public Adapter createRosRuntimeElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.TopicMessage <em>Topic Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.TopicMessage
	 * @generated
	 */
	public Adapter createTopicMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Topic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Topic
	 * @generated
	 */
	public Adapter createTopicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.ContinousState <em>Continous State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.ContinousState
	 * @generated
	 */
	public Adapter createContinousStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.DescriptiveElement <em>Descriptive Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.DescriptiveElement
	 * @generated
	 */
	public Adapter createDescriptiveElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.WorkerThread <em>Worker Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.WorkerThread
	 * @generated
	 */
	public Adapter createWorkerThreadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Behavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Behavior
	 * @generated
	 */
	public Adapter createBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.HybridSystem <em>Hybrid System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.HybridSystem
	 * @generated
	 */
	public Adapter createHybridSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Location
	 * @generated
	 */
	public Adapter createLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.ContinuousVariable <em>Continuous Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.ContinuousVariable
	 * @generated
	 */
	public Adapter createContinuousVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.DiscreteEvent <em>Discrete Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.DiscreteEvent
	 * @generated
	 */
	public Adapter createDiscreteEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.FuzzyHybridSystem <em>Fuzzy Hybrid System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.FuzzyHybridSystem
	 * @generated
	 */
	public Adapter createFuzzyHybridSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.RuleSet <em>Rule Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.RuleSet
	 * @generated
	 */
	public Adapter createRuleSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Invariant <em>Invariant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Invariant
	 * @generated
	 */
	public Adapter createInvariantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.NodeParameter <em>Node Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.NodeParameter
	 * @generated
	 */
	public Adapter createNodeParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.NodeParameterGroup <em>Node Parameter Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.NodeParameterGroup
	 * @generated
	 */
	public Adapter createNodeParameterGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.AbstractNodeParameter <em>Abstract Node Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.AbstractNodeParameter
	 * @generated
	 */
	public Adapter createAbstractNodeParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.DoubleParameter <em>Double Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.DoubleParameter
	 * @generated
	 */
	public Adapter createDoubleParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StringParameter <em>String Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StringParameter
	 * @generated
	 */
	public Adapter createStringParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.BooleanParameter <em>Boolean Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.BooleanParameter
	 * @generated
	 */
	public Adapter createBooleanParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.IntegerParameter <em>Integer Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.IntegerParameter
	 * @generated
	 */
	public Adapter createIntegerParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.ErrorLocation <em>Error Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.ErrorLocation
	 * @generated
	 */
	public Adapter createErrorLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.ServiceType <em>Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.ServiceType
	 * @generated
	 */
	public Adapter createServiceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.AbstractMsgType <em>Abstract Msg Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.AbstractMsgType
	 * @generated
	 */
	public Adapter createAbstractMsgTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Channel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Channel
	 * @generated
	 */
	public Adapter createChannelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.FilePackage <em>File Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.FilePackage
	 * @generated
	 */
	public Adapter createFilePackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.AbstractRosFileElement <em>Abstract Ros File Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.AbstractRosFileElement
	 * @generated
	 */
	public Adapter createAbstractRosFileElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.RosElement <em>Ros Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.RosElement
	 * @generated
	 */
	public Adapter createRosElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.TemplateNode <em>Template Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.TemplateNode
	 * @generated
	 */
	public Adapter createTemplateNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.FilterDefinition <em>Filter Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.FilterDefinition
	 * @generated
	 */
	public Adapter createFilterDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.FilterConnection <em>Filter Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.FilterConnection
	 * @generated
	 */
	public Adapter createFilterConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.InternalNode <em>Internal Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.InternalNode
	 * @generated
	 */
	public Adapter createInternalNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.SerializedField <em>Serialized Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.SerializedField
	 * @generated
	 */
	public Adapter createSerializedFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.InternalEdge <em>Internal Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.InternalEdge
	 * @generated
	 */
	public Adapter createInternalEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.InternalElement <em>Internal Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.InternalElement
	 * @generated
	 */
	public Adapter createInternalElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.DirectConnection <em>Direct Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.DirectConnection
	 * @generated
	 */
	public Adapter createDirectConnectionAdapter() {
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

} //StatepubsubmodelAdapterFactory

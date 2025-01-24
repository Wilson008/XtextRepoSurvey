/**
 */
package hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl;

import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class StatepubsubmodelFactoryImpl extends EFactoryImpl implements StatepubsubmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StatepubsubmodelFactory init() {
		try {
			StatepubsubmodelFactory theStatepubsubmodelFactory = (StatepubsubmodelFactory) EPackage.Registry.INSTANCE
					.getEFactory(StatepubsubmodelPackage.eNS_URI);
			if (theStatepubsubmodelFactory != null) {
				return theStatepubsubmodelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StatepubsubmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatepubsubmodelFactoryImpl() {
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
		case StatepubsubmodelPackage.STACK:
			return createStack();
		case StatepubsubmodelPackage.INPUT_PORT:
			return createInputPort();
		case StatepubsubmodelPackage.OUTPUT_PORT:
			return createOutputPort();
		case StatepubsubmodelPackage.TOPIC_MESSAGE:
			return createTopicMessage();
		case StatepubsubmodelPackage.TOPIC:
			return createTopic();
		case StatepubsubmodelPackage.CONTINOUS_STATE:
			return createContinousState();
		case StatepubsubmodelPackage.WORKER_THREAD:
			return createWorkerThread();
		case StatepubsubmodelPackage.HYBRID_SYSTEM:
			return createHybridSystem();
		case StatepubsubmodelPackage.LOCATION:
			return createLocation();
		case StatepubsubmodelPackage.TRANSITION:
			return createTransition();
		case StatepubsubmodelPackage.CONTINUOUS_VARIABLE:
			return createContinuousVariable();
		case StatepubsubmodelPackage.ACTIVITY:
			return createActivity();
		case StatepubsubmodelPackage.DISCRETE_EVENT:
			return createDiscreteEvent();
		case StatepubsubmodelPackage.FUZZY_HYBRID_SYSTEM:
			return createFuzzyHybridSystem();
		case StatepubsubmodelPackage.RULE_SET:
			return createRuleSet();
		case StatepubsubmodelPackage.INVARIANT:
			return createInvariant();
		case StatepubsubmodelPackage.NODE_PARAMETER:
			return createNodeParameter();
		case StatepubsubmodelPackage.NODE_PARAMETER_GROUP:
			return createNodeParameterGroup();
		case StatepubsubmodelPackage.DOUBLE_PARAMETER:
			return createDoubleParameter();
		case StatepubsubmodelPackage.STRING_PARAMETER:
			return createStringParameter();
		case StatepubsubmodelPackage.BOOLEAN_PARAMETER:
			return createBooleanParameter();
		case StatepubsubmodelPackage.INTEGER_PARAMETER:
			return createIntegerParameter();
		case StatepubsubmodelPackage.ERROR_LOCATION:
			return createErrorLocation();
		case StatepubsubmodelPackage.SERVICE_TYPE:
			return createServiceType();
		case StatepubsubmodelPackage.SERVICE:
			return createService();
		case StatepubsubmodelPackage.FILE_PACKAGE:
			return createFilePackage();
		case StatepubsubmodelPackage.NODE:
			return createNode();
		case StatepubsubmodelPackage.TEMPLATE_NODE:
			return createTemplateNode();
		case StatepubsubmodelPackage.FILTER_DEFINITION:
			return createFilterDefinition();
		case StatepubsubmodelPackage.FILTER_CONNECTION:
			return createFilterConnection();
		case StatepubsubmodelPackage.SERIALIZED_FIELD:
			return createSerializedField();
		case StatepubsubmodelPackage.DIRECT_CONNECTION:
			return createDirectConnection();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case StatepubsubmodelPackage.NETWORK_TYPE:
			return createNetworkTypeFromString(eDataType, initialValue);
		case StatepubsubmodelPackage.LANGUAGE_TYPE:
			return createLanguageTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case StatepubsubmodelPackage.NETWORK_TYPE:
			return convertNetworkTypeToString(eDataType, instanceValue);
		case StatepubsubmodelPackage.LANGUAGE_TYPE:
			return convertLanguageTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stack createStack() {
		StackImpl stack = new StackImpl();
		return stack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPort createInputPort() {
		InputPortImpl inputPort = new InputPortImpl();
		return inputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPort createOutputPort() {
		OutputPortImpl outputPort = new OutputPortImpl();
		return outputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopicMessage createTopicMessage() {
		TopicMessageImpl topicMessage = new TopicMessageImpl();
		return topicMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Topic createTopic() {
		TopicImpl topic = new TopicImpl();
		return topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinousState createContinousState() {
		ContinousStateImpl continousState = new ContinousStateImpl();
		return continousState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkerThread createWorkerThread() {
		WorkerThreadImpl workerThread = new WorkerThreadImpl();
		return workerThread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HybridSystem createHybridSystem() {
		HybridSystemImpl hybridSystem = new HybridSystemImpl();
		return hybridSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuousVariable createContinuousVariable() {
		ContinuousVariableImpl continuousVariable = new ContinuousVariableImpl();
		return continuousVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteEvent createDiscreteEvent() {
		DiscreteEventImpl discreteEvent = new DiscreteEventImpl();
		return discreteEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FuzzyHybridSystem createFuzzyHybridSystem() {
		FuzzyHybridSystemImpl fuzzyHybridSystem = new FuzzyHybridSystemImpl();
		return fuzzyHybridSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleSet createRuleSet() {
		RuleSetImpl ruleSet = new RuleSetImpl();
		return ruleSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Invariant createInvariant() {
		InvariantImpl invariant = new InvariantImpl();
		return invariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeParameter createNodeParameter() {
		NodeParameterImpl nodeParameter = new NodeParameterImpl();
		return nodeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeParameterGroup createNodeParameterGroup() {
		NodeParameterGroupImpl nodeParameterGroup = new NodeParameterGroupImpl();
		return nodeParameterGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleParameter createDoubleParameter() {
		DoubleParameterImpl doubleParameter = new DoubleParameterImpl();
		return doubleParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringParameter createStringParameter() {
		StringParameterImpl stringParameter = new StringParameterImpl();
		return stringParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanParameter createBooleanParameter() {
		BooleanParameterImpl booleanParameter = new BooleanParameterImpl();
		return booleanParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerParameter createIntegerParameter() {
		IntegerParameterImpl integerParameter = new IntegerParameterImpl();
		return integerParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorLocation createErrorLocation() {
		ErrorLocationImpl errorLocation = new ErrorLocationImpl();
		return errorLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceType createServiceType() {
		ServiceTypeImpl serviceType = new ServiceTypeImpl();
		return serviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilePackage createFilePackage() {
		FilePackageImpl filePackage = new FilePackageImpl();
		return filePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateNode createTemplateNode() {
		TemplateNodeImpl templateNode = new TemplateNodeImpl();
		return templateNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterDefinition createFilterDefinition() {
		FilterDefinitionImpl filterDefinition = new FilterDefinitionImpl();
		return filterDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterConnection createFilterConnection() {
		FilterConnectionImpl filterConnection = new FilterConnectionImpl();
		return filterConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SerializedField createSerializedField() {
		SerializedFieldImpl serializedField = new SerializedFieldImpl();
		return serializedField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectConnection createDirectConnection() {
		DirectConnectionImpl directConnection = new DirectConnectionImpl();
		return directConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkType createNetworkTypeFromString(EDataType eDataType, String initialValue) {
		NetworkType result = NetworkType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNetworkTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageType createLanguageTypeFromString(EDataType eDataType, String initialValue) {
		LanguageType result = LanguageType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLanguageTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatepubsubmodelPackage getStatepubsubmodelPackage() {
		return (StatepubsubmodelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StatepubsubmodelPackage getPackage() {
		return StatepubsubmodelPackage.eINSTANCE;
	}

} //StatepubsubmodelFactoryImpl

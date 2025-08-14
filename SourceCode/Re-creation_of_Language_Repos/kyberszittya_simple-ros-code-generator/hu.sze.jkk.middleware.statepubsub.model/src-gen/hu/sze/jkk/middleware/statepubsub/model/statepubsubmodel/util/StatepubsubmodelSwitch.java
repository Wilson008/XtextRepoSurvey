/**
 */
package hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.util;

import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage
 * @generated
 */
public class StatepubsubmodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StatepubsubmodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatepubsubmodelSwitch() {
		if (modelPackage == null) {
			modelPackage = StatepubsubmodelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case StatepubsubmodelPackage.STACK: {
			Stack stack = (Stack) theEObject;
			T result = caseStack(stack);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatepubsubmodelPackage.INPUT_PORT: {
			InputPort inputPort = (InputPort) theEObject;
			T result = caseInputPort(inputPort);
			if (result == null)
				result = casePort(inputPort);
			if (result == null)
				result = caseInternalNode(inputPort);
			if (result == null)
				result = caseInternalElement(inputPort);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatepubsubmodelPackage.OUTPUT_PORT: {
			OutputPort outputPort = (OutputPort) theEObject;
			T result = caseOutputPort(outputPort);
			if (result == null)
				result = casePort(outputPort);
			if (result == null)
				result = caseInternalNode(outputPort);
			if (result == null)
				result = caseInternalElement(outputPort);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatepubsubmodelPackage.PORT: {
			Port port = (Port) theEObject;
			T result = casePort(port);
			if (result == null)
				result = caseInternalNode(port);
			if (result == null)
				result = caseInternalElement(port);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT: {
			RosRuntimeElement rosRuntimeElement = (RosRuntimeElement) theEObject;
			T result = caseRosRuntimeElement(rosRuntimeElement);
			if (result == null)
				result = caseDescriptiveElement(rosRuntimeElement);
			if (result == null)
				result = caseAbstractRosFileElement(rosRuntimeElement);
			if (result == null)
				result = caseRosElement(rosRuntimeElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatepubsubmodelPackage.TOPIC_MESSAGE: {
			TopicMessage topicMessage = (TopicMessage) theEObject;
			T result = caseTopicMessage(topicMessage);
			if (result == null)
				result = caseAbstractMsgType(topicMessage);
			if (result == null)
				result = caseAbstractRosFileElement(topicMessage);
			if (result == null)
				result = caseRosElement(topicMessage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatepubsubmodelPackage.TOPIC: {
			Topic topic = (Topic) theEObject;
			T result = caseTopic(topic);
			if (result == null)
				result = caseChannel(topic);
			if (result == null)
				result = caseDescriptiveElement(topic);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatepubsubmodelPackage.CONTINOUS_STATE: {
			ContinousState continousState = (ContinousState) theEObject;
			T result = caseContinousState(continousState);
			if (result == null)
				result = caseInternalNode(continousState);
			if (result == null)
				result = caseInternalElement(continousState);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatepubsubmodelPackage.DESCRIPTIVE_ELEMENT: {
			DescriptiveElement descriptiveElement = (DescriptiveElement) theEObject;
			T result = caseDescriptiveElement(descriptiveElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatepubsubmodelPackage.WORKER_THREAD: {
			WorkerThread workerThread = (WorkerThread) theEObject;
			T result = caseWorkerThread(workerThread);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatepubsubmodelPackage.BEHAVIOR: {
			Behavior behavior = (Behavior) theEObject;
			T result = caseBehavior(behavior);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatepubsubmodelPackage.HYBRID_SYSTEM: {
			HybridSystem hybridSystem = (HybridSystem) theEObject;
			T result = caseHybridSystem(hybridSystem);
			if (result == null)
				result = caseBehavior(hybridSystem);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatepubsubmodelPackage.LOCATION: {
			Location location = (Location) theEObject;
			T result = caseLocation(location);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatepubsubmodelPackage.TRANSITION: {
			Transition transition = (Transition) theEObject;
			T result = caseTransition(transition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatepubsubmodelPackage.CONTINUOUS_VARIABLE: {
			ContinuousVariable continuousVariable = (ContinuousVariable) theEObject;
			T result = caseContinuousVariable(continuousVariable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatepubsubmodelPackage.ACTIVITY: {
			Activity activity = (Activity) theEObject;
			T result = caseActivity(activity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatepubsubmodelPackage.DISCRETE_EVENT: {
			DiscreteEvent discreteEvent = (DiscreteEvent) theEObject;
			T result = caseDiscreteEvent(discreteEvent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatepubsubmodelPackage.FUZZY_HYBRID_SYSTEM: {
			FuzzyHybridSystem fuzzyHybridSystem = (FuzzyHybridSystem) theEObject;
			T result = caseFuzzyHybridSystem(fuzzyHybridSystem);
			if (result == null)
				result = caseHybridSystem(fuzzyHybridSystem);
			if (result == null)
				result = caseBehavior(fuzzyHybridSystem);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatepubsubmodelPackage.RULE_SET: {
			RuleSet ruleSet = (RuleSet) theEObject;
			T result = caseRuleSet(ruleSet);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatepubsubmodelPackage.INVARIANT: {
			Invariant invariant = (Invariant) theEObject;
			T result = caseInvariant(invariant);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatepubsubmodelPackage.NODE_PARAMETER: {
			NodeParameter nodeParameter = (NodeParameter) theEObject;
			T result = caseNodeParameter(nodeParameter);
			if (result == null)
				result = caseAbstractNodeParameter(nodeParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatepubsubmodelPackage.NODE_PARAMETER_GROUP: {
			NodeParameterGroup nodeParameterGroup = (NodeParameterGroup) theEObject;
			T result = caseNodeParameterGroup(nodeParameterGroup);
			if (result == null)
				result = caseAbstractNodeParameter(nodeParameterGroup);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatepubsubmodelPackage.ABSTRACT_NODE_PARAMETER: {
			AbstractNodeParameter abstractNodeParameter = (AbstractNodeParameter) theEObject;
			T result = caseAbstractNodeParameter(abstractNodeParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatepubsubmodelPackage.DOUBLE_PARAMETER: {
			DoubleParameter doubleParameter = (DoubleParameter) theEObject;
			T result = caseDoubleParameter(doubleParameter);
			if (result == null)
				result = caseNodeParameter(doubleParameter);
			if (result == null)
				result = caseAbstractNodeParameter(doubleParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatepubsubmodelPackage.STRING_PARAMETER: {
			StringParameter stringParameter = (StringParameter) theEObject;
			T result = caseStringParameter(stringParameter);
			if (result == null)
				result = caseNodeParameter(stringParameter);
			if (result == null)
				result = caseAbstractNodeParameter(stringParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatepubsubmodelPackage.BOOLEAN_PARAMETER: {
			BooleanParameter booleanParameter = (BooleanParameter) theEObject;
			T result = caseBooleanParameter(booleanParameter);
			if (result == null)
				result = caseNodeParameter(booleanParameter);
			if (result == null)
				result = caseAbstractNodeParameter(booleanParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatepubsubmodelPackage.INTEGER_PARAMETER: {
			IntegerParameter integerParameter = (IntegerParameter) theEObject;
			T result = caseIntegerParameter(integerParameter);
			if (result == null)
				result = caseNodeParameter(integerParameter);
			if (result == null)
				result = caseAbstractNodeParameter(integerParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatepubsubmodelPackage.ERROR_LOCATION: {
			ErrorLocation errorLocation = (ErrorLocation) theEObject;
			T result = caseErrorLocation(errorLocation);
			if (result == null)
				result = caseLocation(errorLocation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatepubsubmodelPackage.SERVICE_TYPE: {
			ServiceType serviceType = (ServiceType) theEObject;
			T result = caseServiceType(serviceType);
			if (result == null)
				result = caseAbstractMsgType(serviceType);
			if (result == null)
				result = caseAbstractRosFileElement(serviceType);
			if (result == null)
				result = caseRosElement(serviceType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatepubsubmodelPackage.ABSTRACT_MSG_TYPE: {
			AbstractMsgType abstractMsgType = (AbstractMsgType) theEObject;
			T result = caseAbstractMsgType(abstractMsgType);
			if (result == null)
				result = caseAbstractRosFileElement(abstractMsgType);
			if (result == null)
				result = caseRosElement(abstractMsgType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatepubsubmodelPackage.CHANNEL: {
			Channel channel = (Channel) theEObject;
			T result = caseChannel(channel);
			if (result == null)
				result = caseDescriptiveElement(channel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatepubsubmodelPackage.SERVICE: {
			Service service = (Service) theEObject;
			T result = caseService(service);
			if (result == null)
				result = caseChannel(service);
			if (result == null)
				result = caseDescriptiveElement(service);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatepubsubmodelPackage.FILE_PACKAGE: {
			FilePackage filePackage = (FilePackage) theEObject;
			T result = caseFilePackage(filePackage);
			if (result == null)
				result = caseRosElement(filePackage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatepubsubmodelPackage.ABSTRACT_ROS_FILE_ELEMENT: {
			AbstractRosFileElement abstractRosFileElement = (AbstractRosFileElement) theEObject;
			T result = caseAbstractRosFileElement(abstractRosFileElement);
			if (result == null)
				result = caseRosElement(abstractRosFileElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatepubsubmodelPackage.ROS_ELEMENT: {
			RosElement rosElement = (RosElement) theEObject;
			T result = caseRosElement(rosElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatepubsubmodelPackage.NODE: {
			Node node = (Node) theEObject;
			T result = caseNode(node);
			if (result == null)
				result = caseRosRuntimeElement(node);
			if (result == null)
				result = caseDescriptiveElement(node);
			if (result == null)
				result = caseAbstractRosFileElement(node);
			if (result == null)
				result = caseRosElement(node);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatepubsubmodelPackage.TEMPLATE_NODE: {
			TemplateNode templateNode = (TemplateNode) theEObject;
			T result = caseTemplateNode(templateNode);
			if (result == null)
				result = caseRosRuntimeElement(templateNode);
			if (result == null)
				result = caseDescriptiveElement(templateNode);
			if (result == null)
				result = caseAbstractRosFileElement(templateNode);
			if (result == null)
				result = caseRosElement(templateNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatepubsubmodelPackage.FILTER_DEFINITION: {
			FilterDefinition filterDefinition = (FilterDefinition) theEObject;
			T result = caseFilterDefinition(filterDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatepubsubmodelPackage.FILTER_CONNECTION: {
			FilterConnection filterConnection = (FilterConnection) theEObject;
			T result = caseFilterConnection(filterConnection);
			if (result == null)
				result = caseInternalEdge(filterConnection);
			if (result == null)
				result = caseInternalElement(filterConnection);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatepubsubmodelPackage.INTERNAL_NODE: {
			InternalNode internalNode = (InternalNode) theEObject;
			T result = caseInternalNode(internalNode);
			if (result == null)
				result = caseInternalElement(internalNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatepubsubmodelPackage.SERIALIZED_FIELD: {
			SerializedField serializedField = (SerializedField) theEObject;
			T result = caseSerializedField(serializedField);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatepubsubmodelPackage.INTERNAL_EDGE: {
			InternalEdge internalEdge = (InternalEdge) theEObject;
			T result = caseInternalEdge(internalEdge);
			if (result == null)
				result = caseInternalElement(internalEdge);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatepubsubmodelPackage.INTERNAL_ELEMENT: {
			InternalElement internalElement = (InternalElement) theEObject;
			T result = caseInternalElement(internalElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatepubsubmodelPackage.DIRECT_CONNECTION: {
			DirectConnection directConnection = (DirectConnection) theEObject;
			T result = caseDirectConnection(directConnection);
			if (result == null)
				result = caseInternalEdge(directConnection);
			if (result == null)
				result = caseInternalElement(directConnection);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stack</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stack</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStack(Stack object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputPort(InputPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputPort(OutputPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort(Port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ros Runtime Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ros Runtime Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRosRuntimeElement(RosRuntimeElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Topic Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Topic Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopicMessage(TopicMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Topic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Topic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopic(Topic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continous State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continous State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinousState(ContinousState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Descriptive Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Descriptive Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescriptiveElement(DescriptiveElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Worker Thread</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Worker Thread</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkerThread(WorkerThread object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehavior(Behavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hybrid System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hybrid System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHybridSystem(HybridSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocation(Location object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continuous Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continuous Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinuousVariable(ContinuousVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity(Activity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discrete Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discrete Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscreteEvent(DiscreteEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fuzzy Hybrid System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fuzzy Hybrid System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuzzyHybridSystem(FuzzyHybridSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuleSet(RuleSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invariant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invariant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvariant(Invariant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeParameter(NodeParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Parameter Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Parameter Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeParameterGroup(NodeParameterGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Node Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Node Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractNodeParameter(AbstractNodeParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoubleParameter(DoubleParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringParameter(StringParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanParameter(BooleanParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerParameter(IntegerParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorLocation(ErrorLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceType(ServiceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Msg Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Msg Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractMsgType(AbstractMsgType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Channel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Channel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChannel(Channel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseService(Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilePackage(FilePackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Ros File Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Ros File Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractRosFileElement(AbstractRosFileElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ros Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ros Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRosElement(RosElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateNode(TemplateNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilterDefinition(FilterDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilterConnection(FilterConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalNode(InternalNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Serialized Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Serialized Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSerializedField(SerializedField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalEdge(InternalEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalElement(InternalElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Direct Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Direct Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectConnection(DirectConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //StatepubsubmodelSwitch

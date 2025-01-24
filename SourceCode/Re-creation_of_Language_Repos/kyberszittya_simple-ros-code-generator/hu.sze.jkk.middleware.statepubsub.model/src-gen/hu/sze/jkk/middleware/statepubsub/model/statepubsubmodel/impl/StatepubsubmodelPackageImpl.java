/**
 */
package hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl;

import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.AbstractMsgType;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.AbstractNodeParameter;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.AbstractRosFileElement;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Activity;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Behavior;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.BooleanParameter;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Channel;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.ContinousState;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.ContinuousVariable;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.DescriptiveElement;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.DirectConnection;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.DiscreteEvent;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.DoubleParameter;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.ErrorLocation;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.FilePackage;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.FilterConnection;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.FilterDefinition;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.FuzzyHybridSystem;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.HybridSystem;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.InputPort;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.IntegerParameter;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.InternalEdge;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.InternalElement;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.InternalNode;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Invariant;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.LanguageType;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Location;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.NetworkType;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Node;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.NodeParameter;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.NodeParameterGroup;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.OutputPort;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Port;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.RosElement;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.RosRuntimeElement;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.RuleSet;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.SerializedField;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Service;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.ServiceType;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Stack;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelFactory;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StringParameter;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.TemplateNode;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Topic;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.TopicMessage;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Transition;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.WorkerThread;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StatepubsubmodelPackageImpl extends EPackageImpl implements StatepubsubmodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rosRuntimeElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topicMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continousStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptiveElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workerThreadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hybridSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continuousVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discreteEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fuzzyHybridSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invariantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeParameterGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractNodeParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doubleParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractMsgTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass channelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filePackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractRosFileElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rosElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serializedFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum networkTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum languageTypeEEnum = null;

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
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StatepubsubmodelPackageImpl() {
		super(eNS_URI, StatepubsubmodelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StatepubsubmodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StatepubsubmodelPackage init() {
		if (isInited)
			return (StatepubsubmodelPackage) EPackage.Registry.INSTANCE.getEPackage(StatepubsubmodelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredStatepubsubmodelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		StatepubsubmodelPackageImpl theStatepubsubmodelPackage = registeredStatepubsubmodelPackage instanceof StatepubsubmodelPackageImpl
				? (StatepubsubmodelPackageImpl) registeredStatepubsubmodelPackage
				: new StatepubsubmodelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theStatepubsubmodelPackage.createPackageContents();

		// Initialize created meta-data
		theStatepubsubmodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStatepubsubmodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StatepubsubmodelPackage.eNS_URI, theStatepubsubmodelPackage);
		return theStatepubsubmodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStack() {
		return stackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStack_Name() {
		return (EAttribute) stackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStack_Channels() {
		return (EReference) stackEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStack_Networktype() {
		return (EAttribute) stackEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStack_Filepackage() {
		return (EReference) stackEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputPort() {
		return inputPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputPort_Sync_function_name() {
		return (EAttribute) inputPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputPort_SynchronizesState() {
		return (EReference) inputPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputPort_Channel() {
		return (EReference) inputPortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputPort() {
		return outputPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputPort_Channel() {
		return (EReference) outputPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_Estimated_freq() {
		return (EAttribute) portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_Sync_time_stamp() {
		return (EAttribute) portEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_Sample_tolerance() {
		return (EAttribute) portEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRosRuntimeElement() {
		return rosRuntimeElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRosRuntimeElement_Continousstate() {
		return (EReference) rosRuntimeElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRosRuntimeElement_Implements() {
		return (EReference) rosRuntimeElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRosRuntimeElement_Namespace() {
		return (EAttribute) rosRuntimeElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRosRuntimeElement_Behavior() {
		return (EReference) rosRuntimeElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRosRuntimeElement_Language() {
		return (EAttribute) rosRuntimeElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRosRuntimeElement_Nodeparameters() {
		return (EReference) rosRuntimeElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRosRuntimeElement_Port() {
		return (EReference) rosRuntimeElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRosRuntimeElement_Filterconnection() {
		return (EReference) rosRuntimeElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRosRuntimeElement_Internaledge() {
		return (EReference) rosRuntimeElementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTopicMessage() {
		return topicMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTopic() {
		return topicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopic_Type() {
		return (EReference) topicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContinousState() {
		return continousStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContinousState_SynchronizeWith() {
		return (EReference) continousStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContinousState_Workerthread() {
		return (EReference) continousStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescriptiveElement() {
		return descriptiveElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptiveElement_Description() {
		return (EAttribute) descriptiveElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkerThread() {
		return workerThreadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkerThread_Freq() {
		return (EAttribute) workerThreadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkerThread_DoFunc() {
		return (EAttribute) workerThreadEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehavior() {
		return behaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHybridSystem() {
		return hybridSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHybridSystem_Location() {
		return (EReference) hybridSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHybridSystem_Transition() {
		return (EReference) hybridSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHybridSystem_Name() {
		return (EAttribute) hybridSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHybridSystem_Variable() {
		return (EReference) hybridSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHybridSystem_Activity() {
		return (EReference) hybridSystemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHybridSystem_Event() {
		return (EReference) hybridSystemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHybridSystem_Invariant() {
		return (EReference) hybridSystemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Name() {
		return (EAttribute) locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Name() {
		return (EAttribute) transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Target() {
		return (EReference) transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Source() {
		return (EReference) transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Discreteevent() {
		return (EReference) transitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Continuousvariable() {
		return (EReference) transitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContinuousVariable() {
		return continuousVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContinuousVariable_Name() {
		return (EAttribute) continuousVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContinuousVariable_Continousstate() {
		return (EReference) continuousVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Continousvariable() {
		return (EReference) activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiscreteEvent() {
		return discreteEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscreteEvent_Name() {
		return (EAttribute) discreteEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFuzzyHybridSystem() {
		return fuzzyHybridSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFuzzyHybridSystem_Ruleset() {
		return (EReference) fuzzyHybridSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleSet() {
		return ruleSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleSet_Name() {
		return (EAttribute) ruleSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvariant() {
		return invariantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvariant_Location() {
		return (EReference) invariantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeParameter() {
		return nodeParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeParameter_Targetvar() {
		return (EAttribute) nodeParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeParameterGroup() {
		return nodeParameterGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeParameterGroup_Nodeparameter() {
		return (EReference) nodeParameterGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeParameterGroup_Config_obj() {
		return (EAttribute) nodeParameterGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeParameterGroup_Generate_struct() {
		return (EAttribute) nodeParameterGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractNodeParameter() {
		return abstractNodeParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractNodeParameter_Name() {
		return (EAttribute) abstractNodeParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoubleParameter() {
		return doubleParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoubleParameter_Maxval() {
		return (EAttribute) doubleParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoubleParameter_Minval() {
		return (EAttribute) doubleParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoubleParameter_Step() {
		return (EAttribute) doubleParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoubleParameter_Defaultval() {
		return (EAttribute) doubleParameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringParameter() {
		return stringParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringParameter_Defaultval() {
		return (EAttribute) stringParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanParameter() {
		return booleanParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanParameter_Defaultval() {
		return (EAttribute) booleanParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerParameter() {
		return integerParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerParameter_Maxval() {
		return (EAttribute) integerParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerParameter_Minval() {
		return (EAttribute) integerParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerParameter_Step() {
		return (EAttribute) integerParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerParameter_Defaultval() {
		return (EAttribute) integerParameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorLocation() {
		return errorLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceType() {
		return serviceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractMsgType() {
		return abstractMsgTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChannel() {
		return channelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannel_Name() {
		return (EAttribute) channelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChannel_PortFrom() {
		return (EReference) channelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_Type() {
		return (EReference) serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilePackage() {
		return filePackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilePackage_Abstractroselement() {
		return (EReference) filePackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilePackage_Filter() {
		return (EReference) filePackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractRosFileElement() {
		return abstractRosFileElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractRosFileElement_Filepackage() {
		return (EReference) abstractRosFileElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRosElement() {
		return rosElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRosElement_Name() {
		return (EAttribute) rosElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRosElement_Generateartifact() {
		return (EAttribute) rosElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateNode() {
		return templateNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilterDefinition() {
		return filterDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterDefinition_Name() {
		return (EAttribute) filterDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterDefinition_Input_field() {
		return (EReference) filterDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterDefinition_Output_field() {
		return (EReference) filterDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilterConnection() {
		return filterConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterConnection_Usedfilter() {
		return (EReference) filterConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterConnection_Input() {
		return (EReference) filterConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterConnection_Output() {
		return (EReference) filterConnectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalNode() {
		return internalNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSerializedField() {
		return serializedFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSerializedField_Topicmessage() {
		return (EReference) serializedFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSerializedField_Id() {
		return (EAttribute) serializedFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalEdge() {
		return internalEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalElement() {
		return internalElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInternalElement_Name() {
		return (EAttribute) internalElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInternalElement_Debug() {
		return (EAttribute) internalElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectConnection() {
		return directConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirectConnection_Port() {
		return (EReference) directConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirectConnection_Continousstate() {
		return (EReference) directConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNetworkType() {
		return networkTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLanguageType() {
		return languageTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatepubsubmodelFactory getStatepubsubmodelFactory() {
		return (StatepubsubmodelFactory) getEFactoryInstance();
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
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		stackEClass = createEClass(STACK);
		createEAttribute(stackEClass, STACK__NAME);
		createEReference(stackEClass, STACK__CHANNELS);
		createEAttribute(stackEClass, STACK__NETWORKTYPE);
		createEReference(stackEClass, STACK__FILEPACKAGE);

		inputPortEClass = createEClass(INPUT_PORT);
		createEAttribute(inputPortEClass, INPUT_PORT__SYNC_FUNCTION_NAME);
		createEReference(inputPortEClass, INPUT_PORT__SYNCHRONIZES_STATE);
		createEReference(inputPortEClass, INPUT_PORT__CHANNEL);

		outputPortEClass = createEClass(OUTPUT_PORT);
		createEReference(outputPortEClass, OUTPUT_PORT__CHANNEL);

		portEClass = createEClass(PORT);
		createEAttribute(portEClass, PORT__ESTIMATED_FREQ);
		createEAttribute(portEClass, PORT__SYNC_TIME_STAMP);
		createEAttribute(portEClass, PORT__SAMPLE_TOLERANCE);

		rosRuntimeElementEClass = createEClass(ROS_RUNTIME_ELEMENT);
		createEReference(rosRuntimeElementEClass, ROS_RUNTIME_ELEMENT__CONTINOUSSTATE);
		createEReference(rosRuntimeElementEClass, ROS_RUNTIME_ELEMENT__IMPLEMENTS);
		createEAttribute(rosRuntimeElementEClass, ROS_RUNTIME_ELEMENT__NAMESPACE);
		createEReference(rosRuntimeElementEClass, ROS_RUNTIME_ELEMENT__BEHAVIOR);
		createEAttribute(rosRuntimeElementEClass, ROS_RUNTIME_ELEMENT__LANGUAGE);
		createEReference(rosRuntimeElementEClass, ROS_RUNTIME_ELEMENT__NODEPARAMETERS);
		createEReference(rosRuntimeElementEClass, ROS_RUNTIME_ELEMENT__PORT);
		createEReference(rosRuntimeElementEClass, ROS_RUNTIME_ELEMENT__FILTERCONNECTION);
		createEReference(rosRuntimeElementEClass, ROS_RUNTIME_ELEMENT__INTERNALEDGE);

		topicMessageEClass = createEClass(TOPIC_MESSAGE);

		topicEClass = createEClass(TOPIC);
		createEReference(topicEClass, TOPIC__TYPE);

		continousStateEClass = createEClass(CONTINOUS_STATE);
		createEReference(continousStateEClass, CONTINOUS_STATE__SYNCHRONIZE_WITH);
		createEReference(continousStateEClass, CONTINOUS_STATE__WORKERTHREAD);

		descriptiveElementEClass = createEClass(DESCRIPTIVE_ELEMENT);
		createEAttribute(descriptiveElementEClass, DESCRIPTIVE_ELEMENT__DESCRIPTION);

		workerThreadEClass = createEClass(WORKER_THREAD);
		createEAttribute(workerThreadEClass, WORKER_THREAD__FREQ);
		createEAttribute(workerThreadEClass, WORKER_THREAD__DO_FUNC);

		behaviorEClass = createEClass(BEHAVIOR);

		hybridSystemEClass = createEClass(HYBRID_SYSTEM);
		createEReference(hybridSystemEClass, HYBRID_SYSTEM__LOCATION);
		createEReference(hybridSystemEClass, HYBRID_SYSTEM__TRANSITION);
		createEAttribute(hybridSystemEClass, HYBRID_SYSTEM__NAME);
		createEReference(hybridSystemEClass, HYBRID_SYSTEM__VARIABLE);
		createEReference(hybridSystemEClass, HYBRID_SYSTEM__ACTIVITY);
		createEReference(hybridSystemEClass, HYBRID_SYSTEM__EVENT);
		createEReference(hybridSystemEClass, HYBRID_SYSTEM__INVARIANT);

		locationEClass = createEClass(LOCATION);
		createEAttribute(locationEClass, LOCATION__NAME);

		transitionEClass = createEClass(TRANSITION);
		createEAttribute(transitionEClass, TRANSITION__NAME);
		createEReference(transitionEClass, TRANSITION__TARGET);
		createEReference(transitionEClass, TRANSITION__SOURCE);
		createEReference(transitionEClass, TRANSITION__DISCRETEEVENT);
		createEReference(transitionEClass, TRANSITION__CONTINUOUSVARIABLE);

		continuousVariableEClass = createEClass(CONTINUOUS_VARIABLE);
		createEAttribute(continuousVariableEClass, CONTINUOUS_VARIABLE__NAME);
		createEReference(continuousVariableEClass, CONTINUOUS_VARIABLE__CONTINOUSSTATE);

		activityEClass = createEClass(ACTIVITY);
		createEReference(activityEClass, ACTIVITY__CONTINOUSVARIABLE);

		discreteEventEClass = createEClass(DISCRETE_EVENT);
		createEAttribute(discreteEventEClass, DISCRETE_EVENT__NAME);

		fuzzyHybridSystemEClass = createEClass(FUZZY_HYBRID_SYSTEM);
		createEReference(fuzzyHybridSystemEClass, FUZZY_HYBRID_SYSTEM__RULESET);

		ruleSetEClass = createEClass(RULE_SET);
		createEAttribute(ruleSetEClass, RULE_SET__NAME);

		invariantEClass = createEClass(INVARIANT);
		createEReference(invariantEClass, INVARIANT__LOCATION);

		nodeParameterEClass = createEClass(NODE_PARAMETER);
		createEAttribute(nodeParameterEClass, NODE_PARAMETER__TARGETVAR);

		nodeParameterGroupEClass = createEClass(NODE_PARAMETER_GROUP);
		createEReference(nodeParameterGroupEClass, NODE_PARAMETER_GROUP__NODEPARAMETER);
		createEAttribute(nodeParameterGroupEClass, NODE_PARAMETER_GROUP__CONFIG_OBJ);
		createEAttribute(nodeParameterGroupEClass, NODE_PARAMETER_GROUP__GENERATE_STRUCT);

		abstractNodeParameterEClass = createEClass(ABSTRACT_NODE_PARAMETER);
		createEAttribute(abstractNodeParameterEClass, ABSTRACT_NODE_PARAMETER__NAME);

		doubleParameterEClass = createEClass(DOUBLE_PARAMETER);
		createEAttribute(doubleParameterEClass, DOUBLE_PARAMETER__MAXVAL);
		createEAttribute(doubleParameterEClass, DOUBLE_PARAMETER__MINVAL);
		createEAttribute(doubleParameterEClass, DOUBLE_PARAMETER__STEP);
		createEAttribute(doubleParameterEClass, DOUBLE_PARAMETER__DEFAULTVAL);

		stringParameterEClass = createEClass(STRING_PARAMETER);
		createEAttribute(stringParameterEClass, STRING_PARAMETER__DEFAULTVAL);

		booleanParameterEClass = createEClass(BOOLEAN_PARAMETER);
		createEAttribute(booleanParameterEClass, BOOLEAN_PARAMETER__DEFAULTVAL);

		integerParameterEClass = createEClass(INTEGER_PARAMETER);
		createEAttribute(integerParameterEClass, INTEGER_PARAMETER__MAXVAL);
		createEAttribute(integerParameterEClass, INTEGER_PARAMETER__MINVAL);
		createEAttribute(integerParameterEClass, INTEGER_PARAMETER__STEP);
		createEAttribute(integerParameterEClass, INTEGER_PARAMETER__DEFAULTVAL);

		errorLocationEClass = createEClass(ERROR_LOCATION);

		serviceTypeEClass = createEClass(SERVICE_TYPE);

		abstractMsgTypeEClass = createEClass(ABSTRACT_MSG_TYPE);

		channelEClass = createEClass(CHANNEL);
		createEAttribute(channelEClass, CHANNEL__NAME);
		createEReference(channelEClass, CHANNEL__PORT_FROM);

		serviceEClass = createEClass(SERVICE);
		createEReference(serviceEClass, SERVICE__TYPE);

		filePackageEClass = createEClass(FILE_PACKAGE);
		createEReference(filePackageEClass, FILE_PACKAGE__ABSTRACTROSELEMENT);
		createEReference(filePackageEClass, FILE_PACKAGE__FILTER);

		abstractRosFileElementEClass = createEClass(ABSTRACT_ROS_FILE_ELEMENT);
		createEReference(abstractRosFileElementEClass, ABSTRACT_ROS_FILE_ELEMENT__FILEPACKAGE);

		rosElementEClass = createEClass(ROS_ELEMENT);
		createEAttribute(rosElementEClass, ROS_ELEMENT__NAME);
		createEAttribute(rosElementEClass, ROS_ELEMENT__GENERATEARTIFACT);

		nodeEClass = createEClass(NODE);

		templateNodeEClass = createEClass(TEMPLATE_NODE);

		filterDefinitionEClass = createEClass(FILTER_DEFINITION);
		createEAttribute(filterDefinitionEClass, FILTER_DEFINITION__NAME);
		createEReference(filterDefinitionEClass, FILTER_DEFINITION__INPUT_FIELD);
		createEReference(filterDefinitionEClass, FILTER_DEFINITION__OUTPUT_FIELD);

		filterConnectionEClass = createEClass(FILTER_CONNECTION);
		createEReference(filterConnectionEClass, FILTER_CONNECTION__USEDFILTER);
		createEReference(filterConnectionEClass, FILTER_CONNECTION__INPUT);
		createEReference(filterConnectionEClass, FILTER_CONNECTION__OUTPUT);

		internalNodeEClass = createEClass(INTERNAL_NODE);

		serializedFieldEClass = createEClass(SERIALIZED_FIELD);
		createEReference(serializedFieldEClass, SERIALIZED_FIELD__TOPICMESSAGE);
		createEAttribute(serializedFieldEClass, SERIALIZED_FIELD__ID);

		internalEdgeEClass = createEClass(INTERNAL_EDGE);

		internalElementEClass = createEClass(INTERNAL_ELEMENT);
		createEAttribute(internalElementEClass, INTERNAL_ELEMENT__NAME);
		createEAttribute(internalElementEClass, INTERNAL_ELEMENT__DEBUG);

		directConnectionEClass = createEClass(DIRECT_CONNECTION);
		createEReference(directConnectionEClass, DIRECT_CONNECTION__PORT);
		createEReference(directConnectionEClass, DIRECT_CONNECTION__CONTINOUSSTATE);

		// Create enums
		networkTypeEEnum = createEEnum(NETWORK_TYPE);
		languageTypeEEnum = createEEnum(LANGUAGE_TYPE);
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
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		inputPortEClass.getESuperTypes().add(this.getPort());
		outputPortEClass.getESuperTypes().add(this.getPort());
		portEClass.getESuperTypes().add(this.getInternalNode());
		rosRuntimeElementEClass.getESuperTypes().add(this.getDescriptiveElement());
		rosRuntimeElementEClass.getESuperTypes().add(this.getAbstractRosFileElement());
		topicMessageEClass.getESuperTypes().add(this.getAbstractMsgType());
		topicEClass.getESuperTypes().add(this.getChannel());
		continousStateEClass.getESuperTypes().add(this.getInternalNode());
		hybridSystemEClass.getESuperTypes().add(this.getBehavior());
		fuzzyHybridSystemEClass.getESuperTypes().add(this.getHybridSystem());
		nodeParameterEClass.getESuperTypes().add(this.getAbstractNodeParameter());
		nodeParameterGroupEClass.getESuperTypes().add(this.getAbstractNodeParameter());
		doubleParameterEClass.getESuperTypes().add(this.getNodeParameter());
		stringParameterEClass.getESuperTypes().add(this.getNodeParameter());
		booleanParameterEClass.getESuperTypes().add(this.getNodeParameter());
		integerParameterEClass.getESuperTypes().add(this.getNodeParameter());
		errorLocationEClass.getESuperTypes().add(this.getLocation());
		serviceTypeEClass.getESuperTypes().add(this.getAbstractMsgType());
		abstractMsgTypeEClass.getESuperTypes().add(this.getAbstractRosFileElement());
		channelEClass.getESuperTypes().add(this.getDescriptiveElement());
		serviceEClass.getESuperTypes().add(this.getChannel());
		filePackageEClass.getESuperTypes().add(this.getRosElement());
		abstractRosFileElementEClass.getESuperTypes().add(this.getRosElement());
		nodeEClass.getESuperTypes().add(this.getRosRuntimeElement());
		templateNodeEClass.getESuperTypes().add(this.getRosRuntimeElement());
		filterConnectionEClass.getESuperTypes().add(this.getInternalEdge());
		internalNodeEClass.getESuperTypes().add(this.getInternalElement());
		internalEdgeEClass.getESuperTypes().add(this.getInternalElement());
		directConnectionEClass.getESuperTypes().add(this.getInternalEdge());

		// Initialize classes, features, and operations; add parameters
		initEClass(stackEClass, Stack.class, "Stack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStack_Name(), ecorePackage.getEString(), "name", null, 0, 1, Stack.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStack_Channels(), this.getChannel(), null, "channels", null, 0, -1, Stack.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStack_Networktype(), this.getNetworkType(), "networktype", null, 0, -1, Stack.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getStack_Filepackage(), this.getFilePackage(), null, "filepackage", null, 0, -1, Stack.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputPortEClass, InputPort.class, "InputPort", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInputPort_Sync_function_name(), ecorePackage.getEString(), "sync_function_name", null, 0, 1,
				InputPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getInputPort_SynchronizesState(), this.getContinousState(),
				this.getContinousState_SynchronizeWith(), "synchronizesState", null, 0, 1, InputPort.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputPort_Channel(), this.getChannel(), null, "channel", null, 0, 1, InputPort.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputPortEClass, OutputPort.class, "OutputPort", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutputPort_Channel(), this.getChannel(), this.getChannel_PortFrom(), "channel", null, 0, 1,
				OutputPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portEClass, Port.class, "Port", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPort_Estimated_freq(), ecorePackage.getEInt(), "estimated_freq", null, 0, 1, Port.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPort_Sync_time_stamp(), ecorePackage.getEBoolean(), "sync_time_stamp", "true", 0, 1,
				Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getPort_Sample_tolerance(), ecorePackage.getEDouble(), "sample_tolerance", null, 0, 1,
				Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(rosRuntimeElementEClass, RosRuntimeElement.class, "RosRuntimeElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRosRuntimeElement_Continousstate(), this.getContinousState(), null, "continousstate", null, 0,
				-1, RosRuntimeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRosRuntimeElement_Implements(), this.getRosRuntimeElement(), null, "implements", null, 0, 1,
				RosRuntimeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRosRuntimeElement_Namespace(), ecorePackage.getEString(), "namespace", null, 0, 1,
				RosRuntimeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getRosRuntimeElement_Behavior(), this.getBehavior(), null, "behavior", null, 0, -1,
				RosRuntimeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRosRuntimeElement_Language(), this.getLanguageType(), "language", null, 0, -1,
				RosRuntimeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getRosRuntimeElement_Nodeparameters(), this.getAbstractNodeParameter(), null, "nodeparameters",
				null, 0, -1, RosRuntimeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRosRuntimeElement_Port(), this.getPort(), null, "port", null, 0, -1, RosRuntimeElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRosRuntimeElement_Filterconnection(), this.getFilterConnection(), null, "filterconnection",
				null, 0, -1, RosRuntimeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRosRuntimeElement_Internaledge(), this.getInternalEdge(), null, "internaledge", null, 0, -1,
				RosRuntimeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(topicMessageEClass, TopicMessage.class, "TopicMessage", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(topicEClass, Topic.class, "Topic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTopic_Type(), this.getTopicMessage(), null, "type", null, 0, 1, Topic.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(continousStateEClass, ContinousState.class, "ContinousState", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContinousState_SynchronizeWith(), this.getInputPort(), this.getInputPort_SynchronizesState(),
				"synchronizeWith", null, 0, -1, ContinousState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContinousState_Workerthread(), this.getWorkerThread(), null, "workerthread", null, 0, 1,
				ContinousState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(descriptiveElementEClass, DescriptiveElement.class, "DescriptiveElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDescriptiveElement_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				DescriptiveElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(workerThreadEClass, WorkerThread.class, "WorkerThread", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkerThread_Freq(), ecorePackage.getEInt(), "freq", null, 0, 1, WorkerThread.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkerThread_DoFunc(), ecorePackage.getEString(), "doFunc", null, 0, 1, WorkerThread.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(behaviorEClass, Behavior.class, "Behavior", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hybridSystemEClass, HybridSystem.class, "HybridSystem", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHybridSystem_Location(), this.getLocation(), null, "location", null, 0, -1,
				HybridSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHybridSystem_Transition(), this.getTransition(), null, "transition", null, 0, -1,
				HybridSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHybridSystem_Name(), ecorePackage.getEString(), "name", null, 0, 1, HybridSystem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHybridSystem_Variable(), this.getContinuousVariable(), null, "variable", null, 0, -1,
				HybridSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHybridSystem_Activity(), this.getActivity(), null, "activity", null, 0, -1,
				HybridSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHybridSystem_Event(), this.getDiscreteEvent(), null, "event", null, 0, -1, HybridSystem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHybridSystem_Invariant(), this.getInvariant(), null, "invariant", null, 0, -1,
				HybridSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocation_Name(), ecorePackage.getEString(), "name", null, 0, 1, Location.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransition_Name(), ecorePackage.getEString(), "name", null, 0, 1, Transition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Target(), this.getLocation(), null, "target", null, 0, 1, Transition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Source(), this.getLocation(), null, "source", null, 0, 1, Transition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Discreteevent(), this.getDiscreteEvent(), null, "discreteevent", null, 0, 1,
				Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Continuousvariable(), this.getContinuousVariable(), null, "continuousvariable",
				null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(continuousVariableEClass, ContinuousVariable.class, "ContinuousVariable", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContinuousVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				ContinuousVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getContinuousVariable_Continousstate(), this.getContinousState(), null, "continousstate", null,
				0, 1, ContinuousVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivity_Continousvariable(), this.getContinuousVariable(), null, "continousvariable", null,
				0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(discreteEventEClass, DiscreteEvent.class, "DiscreteEvent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiscreteEvent_Name(), ecorePackage.getEString(), "name", null, 0, 1, DiscreteEvent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fuzzyHybridSystemEClass, FuzzyHybridSystem.class, "FuzzyHybridSystem", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFuzzyHybridSystem_Ruleset(), this.getRuleSet(), null, "ruleset", null, 0, -1,
				FuzzyHybridSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleSetEClass, RuleSet.class, "RuleSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRuleSet_Name(), ecorePackage.getEString(), "name", null, 0, 1, RuleSet.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(invariantEClass, Invariant.class, "Invariant", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInvariant_Location(), this.getLocation(), null, "location", null, 0, 1, Invariant.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeParameterEClass, NodeParameter.class, "NodeParameter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNodeParameter_Targetvar(), ecorePackage.getEString(), "targetvar", null, 0, 1,
				NodeParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(nodeParameterGroupEClass, NodeParameterGroup.class, "NodeParameterGroup", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodeParameterGroup_Nodeparameter(), this.getNodeParameter(), null, "nodeparameter", null, 0,
				-1, NodeParameterGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeParameterGroup_Config_obj(), ecorePackage.getEString(), "config_obj", null, 0, 1,
				NodeParameterGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeParameterGroup_Generate_struct(), ecorePackage.getEBoolean(), "generate_struct", null, 0,
				1, NodeParameterGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractNodeParameterEClass, AbstractNodeParameter.class, "AbstractNodeParameter", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractNodeParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				AbstractNodeParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doubleParameterEClass, DoubleParameter.class, "DoubleParameter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDoubleParameter_Maxval(), ecorePackage.getEDouble(), "maxval", null, 0, 1,
				DoubleParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoubleParameter_Minval(), ecorePackage.getEDouble(), "minval", null, 0, 1,
				DoubleParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoubleParameter_Step(), ecorePackage.getEDouble(), "step", null, 0, 1, DoubleParameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoubleParameter_Defaultval(), ecorePackage.getEDouble(), "defaultval", null, 0, 1,
				DoubleParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(stringParameterEClass, StringParameter.class, "StringParameter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringParameter_Defaultval(), ecorePackage.getEString(), "defaultval", null, 0, 1,
				StringParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(booleanParameterEClass, BooleanParameter.class, "BooleanParameter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanParameter_Defaultval(), ecorePackage.getEBoolean(), "defaultval", null, 0, 1,
				BooleanParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(integerParameterEClass, IntegerParameter.class, "IntegerParameter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerParameter_Maxval(), ecorePackage.getEInt(), "maxval", null, 0, 1,
				IntegerParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegerParameter_Minval(), ecorePackage.getEInt(), "minval", null, 0, 1,
				IntegerParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegerParameter_Step(), ecorePackage.getEInt(), "step", null, 0, 1, IntegerParameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegerParameter_Defaultval(), ecorePackage.getEInt(), "defaultval", null, 0, 1,
				IntegerParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(errorLocationEClass, ErrorLocation.class, "ErrorLocation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceTypeEClass, ServiceType.class, "ServiceType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractMsgTypeEClass, AbstractMsgType.class, "AbstractMsgType", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(channelEClass, Channel.class, "Channel", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChannel_Name(), ecorePackage.getEString(), "name", null, 0, 1, Channel.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannel_PortFrom(), this.getOutputPort(), this.getOutputPort_Channel(), "portFrom", null, 0,
				1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getService_Type(), this.getServiceType(), null, "type", null, 0, 1, Service.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(filePackageEClass, FilePackage.class, "FilePackage", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFilePackage_Abstractroselement(), this.getAbstractRosFileElement(),
				this.getAbstractRosFileElement_Filepackage(), "abstractroselement", null, 0, -1, FilePackage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilePackage_Filter(), this.getFilterDefinition(), null, "filter", null, 0, -1,
				FilePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractRosFileElementEClass, AbstractRosFileElement.class, "AbstractRosFileElement", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractRosFileElement_Filepackage(), this.getFilePackage(),
				this.getFilePackage_Abstractroselement(), "filepackage", null, 0, 1, AbstractRosFileElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rosElementEClass, RosElement.class, "RosElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRosElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, RosElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRosElement_Generateartifact(), ecorePackage.getEBoolean(), "generateartifact", null, 0, 1,
				RosElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(templateNodeEClass, TemplateNode.class, "TemplateNode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(filterDefinitionEClass, FilterDefinition.class, "FilterDefinition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFilterDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				FilterDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getFilterDefinition_Input_field(), this.getSerializedField(), null, "input_field", null, 0, -1,
				FilterDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilterDefinition_Output_field(), this.getSerializedField(), null, "output_field", null, 0, 1,
				FilterDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filterConnectionEClass, FilterConnection.class, "FilterConnection", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFilterConnection_Usedfilter(), this.getFilterDefinition(), null, "usedfilter", null, 0, 1,
				FilterConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilterConnection_Input(), this.getInternalNode(), null, "input", null, 0, -1,
				FilterConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilterConnection_Output(), this.getInternalNode(), null, "output", null, 0, 1,
				FilterConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internalNodeEClass, InternalNode.class, "InternalNode", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(serializedFieldEClass, SerializedField.class, "SerializedField", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSerializedField_Topicmessage(), this.getTopicMessage(), null, "topicmessage", null, 0, 1,
				SerializedField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSerializedField_Id(), ecorePackage.getEString(), "id", null, 0, 1, SerializedField.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internalEdgeEClass, InternalEdge.class, "InternalEdge", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(internalElementEClass, InternalElement.class, "InternalElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInternalElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, InternalElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInternalElement_Debug(), ecorePackage.getEBoolean(), "debug", null, 0, 1,
				InternalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(directConnectionEClass, DirectConnection.class, "DirectConnection", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDirectConnection_Port(), this.getPort(), null, "port", null, 0, 1, DirectConnection.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDirectConnection_Continousstate(), this.getContinousState(), null, "continousstate", null, 0,
				1, DirectConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(networkTypeEEnum, NetworkType.class, "NetworkType");
		addEEnumLiteral(networkTypeEEnum, NetworkType.ROS1);
		addEEnumLiteral(networkTypeEEnum, NetworkType.ROS2);

		initEEnum(languageTypeEEnum, LanguageType.class, "LanguageType");
		addEEnumLiteral(languageTypeEEnum, LanguageType.PYTHON);
		addEEnumLiteral(languageTypeEEnum, LanguageType.CPP);

		// Create resource
		createResource(eNS_URI);
	}

} //StatepubsubmodelPackageImpl

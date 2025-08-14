/**
 */
package hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelFactory
 * @model kind="package"
 * @generated
 */
public interface StatepubsubmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "statepubsubmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://jkk.sze.hu/statepubsubmodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "statepubsubmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatepubsubmodelPackage eINSTANCE = hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StackImpl <em>Stack</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StackImpl
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getStack()
	 * @generated
	 */
	int STACK = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Channels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK__CHANNELS = 1;

	/**
	 * The feature id for the '<em><b>Networktype</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK__NETWORKTYPE = 2;

	/**
	 * The feature id for the '<em><b>Filepackage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK__FILEPACKAGE = 3;

	/**
	 * The number of structural features of the '<em>Stack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Stack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.InternalElementImpl <em>Internal Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.InternalElementImpl
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getInternalElement()
	 * @generated
	 */
	int INTERNAL_ELEMENT = 42;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Debug</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT__DEBUG = 1;

	/**
	 * The number of structural features of the '<em>Internal Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Internal Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.InternalNodeImpl <em>Internal Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.InternalNodeImpl
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getInternalNode()
	 * @generated
	 */
	int INTERNAL_NODE = 39;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_NODE__NAME = INTERNAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Debug</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_NODE__DEBUG = INTERNAL_ELEMENT__DEBUG;

	/**
	 * The number of structural features of the '<em>Internal Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_NODE_FEATURE_COUNT = INTERNAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Internal Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_NODE_OPERATION_COUNT = INTERNAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.PortImpl
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = INTERNAL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Debug</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__DEBUG = INTERNAL_NODE__DEBUG;

	/**
	 * The feature id for the '<em><b>Estimated freq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__ESTIMATED_FREQ = INTERNAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sync time stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__SYNC_TIME_STAMP = INTERNAL_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sample tolerance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__SAMPLE_TOLERANCE = INTERNAL_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = INTERNAL_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = INTERNAL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.InputPortImpl <em>Input Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.InputPortImpl
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getInputPort()
	 * @generated
	 */
	int INPUT_PORT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Debug</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__DEBUG = PORT__DEBUG;

	/**
	 * The feature id for the '<em><b>Estimated freq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__ESTIMATED_FREQ = PORT__ESTIMATED_FREQ;

	/**
	 * The feature id for the '<em><b>Sync time stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__SYNC_TIME_STAMP = PORT__SYNC_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Sample tolerance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__SAMPLE_TOLERANCE = PORT__SAMPLE_TOLERANCE;

	/**
	 * The feature id for the '<em><b>Sync function name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__SYNC_FUNCTION_NAME = PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Synchronizes State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__SYNCHRONIZES_STATE = PORT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__CHANNEL = PORT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Input Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Input Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.OutputPortImpl <em>Output Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.OutputPortImpl
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getOutputPort()
	 * @generated
	 */
	int OUTPUT_PORT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Debug</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__DEBUG = PORT__DEBUG;

	/**
	 * The feature id for the '<em><b>Estimated freq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__ESTIMATED_FREQ = PORT__ESTIMATED_FREQ;

	/**
	 * The feature id for the '<em><b>Sync time stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__SYNC_TIME_STAMP = PORT__SYNC_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Sample tolerance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__SAMPLE_TOLERANCE = PORT__SAMPLE_TOLERANCE;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__CHANNEL = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Output Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Output Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.DescriptiveElementImpl <em>Descriptive Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.DescriptiveElementImpl
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getDescriptiveElement()
	 * @generated
	 */
	int DESCRIPTIVE_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIVE_ELEMENT__DESCRIPTION = 0;

	/**
	 * The number of structural features of the '<em>Descriptive Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIVE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Descriptive Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIVE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.RosRuntimeElementImpl <em>Ros Runtime Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.RosRuntimeElementImpl
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getRosRuntimeElement()
	 * @generated
	 */
	int ROS_RUNTIME_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_RUNTIME_ELEMENT__DESCRIPTION = DESCRIPTIVE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_RUNTIME_ELEMENT__NAME = DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generateartifact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_RUNTIME_ELEMENT__GENERATEARTIFACT = DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Filepackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_RUNTIME_ELEMENT__FILEPACKAGE = DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Continousstate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_RUNTIME_ELEMENT__CONTINOUSSTATE = DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_RUNTIME_ELEMENT__IMPLEMENTS = DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_RUNTIME_ELEMENT__NAMESPACE = DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_RUNTIME_ELEMENT__BEHAVIOR = DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_RUNTIME_ELEMENT__LANGUAGE = DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Nodeparameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_RUNTIME_ELEMENT__NODEPARAMETERS = DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_RUNTIME_ELEMENT__PORT = DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Filterconnection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_RUNTIME_ELEMENT__FILTERCONNECTION = DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Internaledge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_RUNTIME_ELEMENT__INTERNALEDGE = DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Ros Runtime Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_RUNTIME_ELEMENT_FEATURE_COUNT = DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Ros Runtime Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_RUNTIME_ELEMENT_OPERATION_COUNT = DESCRIPTIVE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.RosElementImpl <em>Ros Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.RosElementImpl
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getRosElement()
	 * @generated
	 */
	int ROS_ELEMENT = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Generateartifact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_ELEMENT__GENERATEARTIFACT = 1;

	/**
	 * The number of structural features of the '<em>Ros Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Ros Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.AbstractRosFileElementImpl <em>Abstract Ros File Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.AbstractRosFileElementImpl
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getAbstractRosFileElement()
	 * @generated
	 */
	int ABSTRACT_ROS_FILE_ELEMENT = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ROS_FILE_ELEMENT__NAME = ROS_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Generateartifact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ROS_FILE_ELEMENT__GENERATEARTIFACT = ROS_ELEMENT__GENERATEARTIFACT;

	/**
	 * The feature id for the '<em><b>Filepackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ROS_FILE_ELEMENT__FILEPACKAGE = ROS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Ros File Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ROS_FILE_ELEMENT_FEATURE_COUNT = ROS_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Abstract Ros File Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ROS_FILE_ELEMENT_OPERATION_COUNT = ROS_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.AbstractMsgTypeImpl <em>Abstract Msg Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.AbstractMsgTypeImpl
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getAbstractMsgType()
	 * @generated
	 */
	int ABSTRACT_MSG_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MSG_TYPE__NAME = ABSTRACT_ROS_FILE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Generateartifact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MSG_TYPE__GENERATEARTIFACT = ABSTRACT_ROS_FILE_ELEMENT__GENERATEARTIFACT;

	/**
	 * The feature id for the '<em><b>Filepackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MSG_TYPE__FILEPACKAGE = ABSTRACT_ROS_FILE_ELEMENT__FILEPACKAGE;

	/**
	 * The number of structural features of the '<em>Abstract Msg Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MSG_TYPE_FEATURE_COUNT = ABSTRACT_ROS_FILE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstract Msg Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MSG_TYPE_OPERATION_COUNT = ABSTRACT_ROS_FILE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.TopicMessageImpl <em>Topic Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.TopicMessageImpl
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getTopicMessage()
	 * @generated
	 */
	int TOPIC_MESSAGE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_MESSAGE__NAME = ABSTRACT_MSG_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Generateartifact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_MESSAGE__GENERATEARTIFACT = ABSTRACT_MSG_TYPE__GENERATEARTIFACT;

	/**
	 * The feature id for the '<em><b>Filepackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_MESSAGE__FILEPACKAGE = ABSTRACT_MSG_TYPE__FILEPACKAGE;

	/**
	 * The number of structural features of the '<em>Topic Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_MESSAGE_FEATURE_COUNT = ABSTRACT_MSG_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Topic Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_MESSAGE_OPERATION_COUNT = ABSTRACT_MSG_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.ChannelImpl <em>Channel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.ChannelImpl
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getChannel()
	 * @generated
	 */
	int CHANNEL = 30;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__DESCRIPTION = DESCRIPTIVE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__NAME = DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__PORT_FROM = DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_FEATURE_COUNT = DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_OPERATION_COUNT = DESCRIPTIVE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.TopicImpl <em>Topic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.TopicImpl
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getTopic()
	 * @generated
	 */
	int TOPIC = 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__DESCRIPTION = CHANNEL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__NAME = CHANNEL__NAME;

	/**
	 * The feature id for the '<em><b>Port From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__PORT_FROM = CHANNEL__PORT_FROM;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__TYPE = CHANNEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Topic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_FEATURE_COUNT = CHANNEL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Topic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_OPERATION_COUNT = CHANNEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.ContinousStateImpl <em>Continous State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.ContinousStateImpl
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getContinousState()
	 * @generated
	 */
	int CONTINOUS_STATE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINOUS_STATE__NAME = INTERNAL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Debug</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINOUS_STATE__DEBUG = INTERNAL_NODE__DEBUG;

	/**
	 * The feature id for the '<em><b>Synchronize With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINOUS_STATE__SYNCHRONIZE_WITH = INTERNAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Workerthread</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINOUS_STATE__WORKERTHREAD = INTERNAL_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Continous State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINOUS_STATE_FEATURE_COUNT = INTERNAL_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Continous State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINOUS_STATE_OPERATION_COUNT = INTERNAL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.WorkerThreadImpl <em>Worker Thread</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.WorkerThreadImpl
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getWorkerThread()
	 * @generated
	 */
	int WORKER_THREAD = 9;

	/**
	 * The feature id for the '<em><b>Freq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER_THREAD__FREQ = 0;

	/**
	 * The feature id for the '<em><b>Do Func</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER_THREAD__DO_FUNC = 1;

	/**
	 * The number of structural features of the '<em>Worker Thread</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER_THREAD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Worker Thread</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER_THREAD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.BehaviorImpl <em>Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.BehaviorImpl
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getBehavior()
	 * @generated
	 */
	int BEHAVIOR = 10;

	/**
	 * The number of structural features of the '<em>Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.HybridSystemImpl <em>Hybrid System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.HybridSystemImpl
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getHybridSystem()
	 * @generated
	 */
	int HYBRID_SYSTEM = 11;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_SYSTEM__LOCATION = BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_SYSTEM__TRANSITION = BEHAVIOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_SYSTEM__NAME = BEHAVIOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_SYSTEM__VARIABLE = BEHAVIOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_SYSTEM__ACTIVITY = BEHAVIOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_SYSTEM__EVENT = BEHAVIOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Invariant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_SYSTEM__INVARIANT = BEHAVIOR_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Hybrid System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_SYSTEM_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Hybrid System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_SYSTEM_OPERATION_COUNT = BEHAVIOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.LocationImpl
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.TransitionImpl
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = 2;

	/**
	 * The feature id for the '<em><b>Discreteevent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__DISCRETEEVENT = 3;

	/**
	 * The feature id for the '<em><b>Continuousvariable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__CONTINUOUSVARIABLE = 4;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.ContinuousVariableImpl <em>Continuous Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.ContinuousVariableImpl
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getContinuousVariable()
	 * @generated
	 */
	int CONTINUOUS_VARIABLE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_VARIABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Continousstate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_VARIABLE__CONTINOUSSTATE = 1;

	/**
	 * The number of structural features of the '<em>Continuous Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_VARIABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Continuous Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.ActivityImpl
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 15;

	/**
	 * The feature id for the '<em><b>Continousvariable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__CONTINOUSVARIABLE = 0;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.DiscreteEventImpl <em>Discrete Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.DiscreteEventImpl
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getDiscreteEvent()
	 * @generated
	 */
	int DISCRETE_EVENT = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_EVENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Discrete Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_EVENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Discrete Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.FuzzyHybridSystemImpl <em>Fuzzy Hybrid System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.FuzzyHybridSystemImpl
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getFuzzyHybridSystem()
	 * @generated
	 */
	int FUZZY_HYBRID_SYSTEM = 17;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZY_HYBRID_SYSTEM__LOCATION = HYBRID_SYSTEM__LOCATION;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZY_HYBRID_SYSTEM__TRANSITION = HYBRID_SYSTEM__TRANSITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZY_HYBRID_SYSTEM__NAME = HYBRID_SYSTEM__NAME;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZY_HYBRID_SYSTEM__VARIABLE = HYBRID_SYSTEM__VARIABLE;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZY_HYBRID_SYSTEM__ACTIVITY = HYBRID_SYSTEM__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZY_HYBRID_SYSTEM__EVENT = HYBRID_SYSTEM__EVENT;

	/**
	 * The feature id for the '<em><b>Invariant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZY_HYBRID_SYSTEM__INVARIANT = HYBRID_SYSTEM__INVARIANT;

	/**
	 * The feature id for the '<em><b>Ruleset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZY_HYBRID_SYSTEM__RULESET = HYBRID_SYSTEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fuzzy Hybrid System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZY_HYBRID_SYSTEM_FEATURE_COUNT = HYBRID_SYSTEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Fuzzy Hybrid System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZY_HYBRID_SYSTEM_OPERATION_COUNT = HYBRID_SYSTEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.RuleSetImpl <em>Rule Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.RuleSetImpl
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getRuleSet()
	 * @generated
	 */
	int RULE_SET = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SET__NAME = 0;

	/**
	 * The number of structural features of the '<em>Rule Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SET_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Rule Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.InvariantImpl <em>Invariant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.InvariantImpl
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getInvariant()
	 * @generated
	 */
	int INVARIANT = 19;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANT__LOCATION = 0;

	/**
	 * The number of structural features of the '<em>Invariant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Invariant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.AbstractNodeParameterImpl <em>Abstract Node Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.AbstractNodeParameterImpl
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getAbstractNodeParameter()
	 * @generated
	 */
	int ABSTRACT_NODE_PARAMETER = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE_PARAMETER__NAME = 0;

	/**
	 * The number of structural features of the '<em>Abstract Node Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE_PARAMETER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Abstract Node Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.NodeParameterImpl <em>Node Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.NodeParameterImpl
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getNodeParameter()
	 * @generated
	 */
	int NODE_PARAMETER = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PARAMETER__NAME = ABSTRACT_NODE_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Targetvar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PARAMETER__TARGETVAR = ABSTRACT_NODE_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PARAMETER_FEATURE_COUNT = ABSTRACT_NODE_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Node Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PARAMETER_OPERATION_COUNT = ABSTRACT_NODE_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.NodeParameterGroupImpl <em>Node Parameter Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.NodeParameterGroupImpl
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getNodeParameterGroup()
	 * @generated
	 */
	int NODE_PARAMETER_GROUP = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PARAMETER_GROUP__NAME = ABSTRACT_NODE_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Nodeparameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PARAMETER_GROUP__NODEPARAMETER = ABSTRACT_NODE_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Config obj</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PARAMETER_GROUP__CONFIG_OBJ = ABSTRACT_NODE_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Generate struct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PARAMETER_GROUP__GENERATE_STRUCT = ABSTRACT_NODE_PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Node Parameter Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PARAMETER_GROUP_FEATURE_COUNT = ABSTRACT_NODE_PARAMETER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Node Parameter Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PARAMETER_GROUP_OPERATION_COUNT = ABSTRACT_NODE_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.DoubleParameterImpl <em>Double Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.DoubleParameterImpl
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getDoubleParameter()
	 * @generated
	 */
	int DOUBLE_PARAMETER = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_PARAMETER__NAME = NODE_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Targetvar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_PARAMETER__TARGETVAR = NODE_PARAMETER__TARGETVAR;

	/**
	 * The feature id for the '<em><b>Maxval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_PARAMETER__MAXVAL = NODE_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Minval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_PARAMETER__MINVAL = NODE_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_PARAMETER__STEP = NODE_PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Defaultval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_PARAMETER__DEFAULTVAL = NODE_PARAMETER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Double Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_PARAMETER_FEATURE_COUNT = NODE_PARAMETER_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Double Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_PARAMETER_OPERATION_COUNT = NODE_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StringParameterImpl <em>String Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StringParameterImpl
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getStringParameter()
	 * @generated
	 */
	int STRING_PARAMETER = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PARAMETER__NAME = NODE_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Targetvar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PARAMETER__TARGETVAR = NODE_PARAMETER__TARGETVAR;

	/**
	 * The feature id for the '<em><b>Defaultval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PARAMETER__DEFAULTVAL = NODE_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PARAMETER_FEATURE_COUNT = NODE_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PARAMETER_OPERATION_COUNT = NODE_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.BooleanParameterImpl <em>Boolean Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.BooleanParameterImpl
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getBooleanParameter()
	 * @generated
	 */
	int BOOLEAN_PARAMETER = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAMETER__NAME = NODE_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Targetvar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAMETER__TARGETVAR = NODE_PARAMETER__TARGETVAR;

	/**
	 * The feature id for the '<em><b>Defaultval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAMETER__DEFAULTVAL = NODE_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAMETER_FEATURE_COUNT = NODE_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAMETER_OPERATION_COUNT = NODE_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.IntegerParameterImpl <em>Integer Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.IntegerParameterImpl
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getIntegerParameter()
	 * @generated
	 */
	int INTEGER_PARAMETER = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_PARAMETER__NAME = NODE_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Targetvar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_PARAMETER__TARGETVAR = NODE_PARAMETER__TARGETVAR;

	/**
	 * The feature id for the '<em><b>Maxval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_PARAMETER__MAXVAL = NODE_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Minval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_PARAMETER__MINVAL = NODE_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_PARAMETER__STEP = NODE_PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Defaultval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_PARAMETER__DEFAULTVAL = NODE_PARAMETER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Integer Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_PARAMETER_FEATURE_COUNT = NODE_PARAMETER_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Integer Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_PARAMETER_OPERATION_COUNT = NODE_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.ErrorLocationImpl <em>Error Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.ErrorLocationImpl
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getErrorLocation()
	 * @generated
	 */
	int ERROR_LOCATION = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_LOCATION__NAME = LOCATION__NAME;

	/**
	 * The number of structural features of the '<em>Error Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_LOCATION_FEATURE_COUNT = LOCATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Error Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_LOCATION_OPERATION_COUNT = LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.ServiceTypeImpl <em>Service Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.ServiceTypeImpl
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getServiceType()
	 * @generated
	 */
	int SERVICE_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__NAME = ABSTRACT_MSG_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Generateartifact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__GENERATEARTIFACT = ABSTRACT_MSG_TYPE__GENERATEARTIFACT;

	/**
	 * The feature id for the '<em><b>Filepackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__FILEPACKAGE = ABSTRACT_MSG_TYPE__FILEPACKAGE;

	/**
	 * The number of structural features of the '<em>Service Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE_FEATURE_COUNT = ABSTRACT_MSG_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Service Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE_OPERATION_COUNT = ABSTRACT_MSG_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.ServiceImpl
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 31;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__DESCRIPTION = CHANNEL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = CHANNEL__NAME;

	/**
	 * The feature id for the '<em><b>Port From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__PORT_FROM = CHANNEL__PORT_FROM;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__TYPE = CHANNEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = CHANNEL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = CHANNEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.FilePackageImpl <em>File Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.FilePackageImpl
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getFilePackage()
	 * @generated
	 */
	int FILE_PACKAGE = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_PACKAGE__NAME = ROS_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Generateartifact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_PACKAGE__GENERATEARTIFACT = ROS_ELEMENT__GENERATEARTIFACT;

	/**
	 * The feature id for the '<em><b>Abstractroselement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_PACKAGE__ABSTRACTROSELEMENT = ROS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_PACKAGE__FILTER = ROS_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>File Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_PACKAGE_FEATURE_COUNT = ROS_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>File Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_PACKAGE_OPERATION_COUNT = ROS_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.NodeImpl
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 35;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__DESCRIPTION = ROS_RUNTIME_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = ROS_RUNTIME_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Generateartifact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__GENERATEARTIFACT = ROS_RUNTIME_ELEMENT__GENERATEARTIFACT;

	/**
	 * The feature id for the '<em><b>Filepackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__FILEPACKAGE = ROS_RUNTIME_ELEMENT__FILEPACKAGE;

	/**
	 * The feature id for the '<em><b>Continousstate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CONTINOUSSTATE = ROS_RUNTIME_ELEMENT__CONTINOUSSTATE;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__IMPLEMENTS = ROS_RUNTIME_ELEMENT__IMPLEMENTS;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAMESPACE = ROS_RUNTIME_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__BEHAVIOR = ROS_RUNTIME_ELEMENT__BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__LANGUAGE = ROS_RUNTIME_ELEMENT__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Nodeparameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NODEPARAMETERS = ROS_RUNTIME_ELEMENT__NODEPARAMETERS;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PORT = ROS_RUNTIME_ELEMENT__PORT;

	/**
	 * The feature id for the '<em><b>Filterconnection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__FILTERCONNECTION = ROS_RUNTIME_ELEMENT__FILTERCONNECTION;

	/**
	 * The feature id for the '<em><b>Internaledge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__INTERNALEDGE = ROS_RUNTIME_ELEMENT__INTERNALEDGE;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = ROS_RUNTIME_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = ROS_RUNTIME_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.TemplateNodeImpl <em>Template Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.TemplateNodeImpl
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getTemplateNode()
	 * @generated
	 */
	int TEMPLATE_NODE = 36;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_NODE__DESCRIPTION = ROS_RUNTIME_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_NODE__NAME = ROS_RUNTIME_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Generateartifact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_NODE__GENERATEARTIFACT = ROS_RUNTIME_ELEMENT__GENERATEARTIFACT;

	/**
	 * The feature id for the '<em><b>Filepackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_NODE__FILEPACKAGE = ROS_RUNTIME_ELEMENT__FILEPACKAGE;

	/**
	 * The feature id for the '<em><b>Continousstate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_NODE__CONTINOUSSTATE = ROS_RUNTIME_ELEMENT__CONTINOUSSTATE;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_NODE__IMPLEMENTS = ROS_RUNTIME_ELEMENT__IMPLEMENTS;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_NODE__NAMESPACE = ROS_RUNTIME_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_NODE__BEHAVIOR = ROS_RUNTIME_ELEMENT__BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_NODE__LANGUAGE = ROS_RUNTIME_ELEMENT__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Nodeparameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_NODE__NODEPARAMETERS = ROS_RUNTIME_ELEMENT__NODEPARAMETERS;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_NODE__PORT = ROS_RUNTIME_ELEMENT__PORT;

	/**
	 * The feature id for the '<em><b>Filterconnection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_NODE__FILTERCONNECTION = ROS_RUNTIME_ELEMENT__FILTERCONNECTION;

	/**
	 * The feature id for the '<em><b>Internaledge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_NODE__INTERNALEDGE = ROS_RUNTIME_ELEMENT__INTERNALEDGE;

	/**
	 * The number of structural features of the '<em>Template Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_NODE_FEATURE_COUNT = ROS_RUNTIME_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Template Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_NODE_OPERATION_COUNT = ROS_RUNTIME_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.FilterDefinitionImpl <em>Filter Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.FilterDefinitionImpl
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getFilterDefinition()
	 * @generated
	 */
	int FILTER_DEFINITION = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_DEFINITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Input field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_DEFINITION__INPUT_FIELD = 1;

	/**
	 * The feature id for the '<em><b>Output field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_DEFINITION__OUTPUT_FIELD = 2;

	/**
	 * The number of structural features of the '<em>Filter Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_DEFINITION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Filter Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.InternalEdgeImpl <em>Internal Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.InternalEdgeImpl
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getInternalEdge()
	 * @generated
	 */
	int INTERNAL_EDGE = 41;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_EDGE__NAME = INTERNAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Debug</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_EDGE__DEBUG = INTERNAL_ELEMENT__DEBUG;

	/**
	 * The number of structural features of the '<em>Internal Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_EDGE_FEATURE_COUNT = INTERNAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Internal Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_EDGE_OPERATION_COUNT = INTERNAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.FilterConnectionImpl <em>Filter Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.FilterConnectionImpl
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getFilterConnection()
	 * @generated
	 */
	int FILTER_CONNECTION = 38;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_CONNECTION__NAME = INTERNAL_EDGE__NAME;

	/**
	 * The feature id for the '<em><b>Debug</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_CONNECTION__DEBUG = INTERNAL_EDGE__DEBUG;

	/**
	 * The feature id for the '<em><b>Usedfilter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_CONNECTION__USEDFILTER = INTERNAL_EDGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_CONNECTION__INPUT = INTERNAL_EDGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_CONNECTION__OUTPUT = INTERNAL_EDGE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Filter Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_CONNECTION_FEATURE_COUNT = INTERNAL_EDGE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Filter Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_CONNECTION_OPERATION_COUNT = INTERNAL_EDGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.SerializedFieldImpl <em>Serialized Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.SerializedFieldImpl
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getSerializedField()
	 * @generated
	 */
	int SERIALIZED_FIELD = 40;

	/**
	 * The feature id for the '<em><b>Topicmessage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZED_FIELD__TOPICMESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZED_FIELD__ID = 1;

	/**
	 * The number of structural features of the '<em>Serialized Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZED_FIELD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Serialized Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZED_FIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.DirectConnectionImpl <em>Direct Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.DirectConnectionImpl
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getDirectConnection()
	 * @generated
	 */
	int DIRECT_CONNECTION = 43;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_CONNECTION__NAME = INTERNAL_EDGE__NAME;

	/**
	 * The feature id for the '<em><b>Debug</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_CONNECTION__DEBUG = INTERNAL_EDGE__DEBUG;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_CONNECTION__PORT = INTERNAL_EDGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Continousstate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_CONNECTION__CONTINOUSSTATE = INTERNAL_EDGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Direct Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_CONNECTION_FEATURE_COUNT = INTERNAL_EDGE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Direct Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_CONNECTION_OPERATION_COUNT = INTERNAL_EDGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.NetworkType <em>Network Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.NetworkType
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getNetworkType()
	 * @generated
	 */
	int NETWORK_TYPE = 44;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.LanguageType <em>Language Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.LanguageType
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getLanguageType()
	 * @generated
	 */
	int LANGUAGE_TYPE = 45;

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Stack <em>Stack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stack</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Stack
	 * @generated
	 */
	EClass getStack();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Stack#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Stack#getName()
	 * @see #getStack()
	 * @generated
	 */
	EAttribute getStack_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Stack#getChannels <em>Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Channels</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Stack#getChannels()
	 * @see #getStack()
	 * @generated
	 */
	EReference getStack_Channels();

	/**
	 * Returns the meta object for the attribute list '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Stack#getNetworktype <em>Networktype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Networktype</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Stack#getNetworktype()
	 * @see #getStack()
	 * @generated
	 */
	EAttribute getStack_Networktype();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Stack#getFilepackage <em>Filepackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filepackage</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Stack#getFilepackage()
	 * @see #getStack()
	 * @generated
	 */
	EReference getStack_Filepackage();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.InputPort <em>Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Port</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.InputPort
	 * @generated
	 */
	EClass getInputPort();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.InputPort#getSync_function_name <em>Sync function name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sync function name</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.InputPort#getSync_function_name()
	 * @see #getInputPort()
	 * @generated
	 */
	EAttribute getInputPort_Sync_function_name();

	/**
	 * Returns the meta object for the reference '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.InputPort#getSynchronizesState <em>Synchronizes State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronizes State</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.InputPort#getSynchronizesState()
	 * @see #getInputPort()
	 * @generated
	 */
	EReference getInputPort_SynchronizesState();

	/**
	 * Returns the meta object for the reference '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.InputPort#getChannel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Channel</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.InputPort#getChannel()
	 * @see #getInputPort()
	 * @generated
	 */
	EReference getInputPort_Channel();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.OutputPort <em>Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Port</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.OutputPort
	 * @generated
	 */
	EClass getOutputPort();

	/**
	 * Returns the meta object for the reference '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.OutputPort#getChannel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Channel</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.OutputPort#getChannel()
	 * @see #getOutputPort()
	 * @generated
	 */
	EReference getOutputPort_Channel();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Port#getEstimated_freq <em>Estimated freq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated freq</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Port#getEstimated_freq()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Estimated_freq();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Port#isSync_time_stamp <em>Sync time stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sync time stamp</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Port#isSync_time_stamp()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Sync_time_stamp();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Port#getSample_tolerance <em>Sample tolerance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sample tolerance</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Port#getSample_tolerance()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Sample_tolerance();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.RosRuntimeElement <em>Ros Runtime Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ros Runtime Element</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.RosRuntimeElement
	 * @generated
	 */
	EClass getRosRuntimeElement();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.RosRuntimeElement#getContinousstate <em>Continousstate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Continousstate</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.RosRuntimeElement#getContinousstate()
	 * @see #getRosRuntimeElement()
	 * @generated
	 */
	EReference getRosRuntimeElement_Continousstate();

	/**
	 * Returns the meta object for the reference '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.RosRuntimeElement#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implements</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.RosRuntimeElement#getImplements()
	 * @see #getRosRuntimeElement()
	 * @generated
	 */
	EReference getRosRuntimeElement_Implements();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.RosRuntimeElement#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.RosRuntimeElement#getNamespace()
	 * @see #getRosRuntimeElement()
	 * @generated
	 */
	EAttribute getRosRuntimeElement_Namespace();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.RosRuntimeElement#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behavior</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.RosRuntimeElement#getBehavior()
	 * @see #getRosRuntimeElement()
	 * @generated
	 */
	EReference getRosRuntimeElement_Behavior();

	/**
	 * Returns the meta object for the attribute list '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.RosRuntimeElement#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Language</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.RosRuntimeElement#getLanguage()
	 * @see #getRosRuntimeElement()
	 * @generated
	 */
	EAttribute getRosRuntimeElement_Language();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.RosRuntimeElement#getNodeparameters <em>Nodeparameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodeparameters</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.RosRuntimeElement#getNodeparameters()
	 * @see #getRosRuntimeElement()
	 * @generated
	 */
	EReference getRosRuntimeElement_Nodeparameters();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.RosRuntimeElement#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.RosRuntimeElement#getPort()
	 * @see #getRosRuntimeElement()
	 * @generated
	 */
	EReference getRosRuntimeElement_Port();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.RosRuntimeElement#getFilterconnection <em>Filterconnection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filterconnection</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.RosRuntimeElement#getFilterconnection()
	 * @see #getRosRuntimeElement()
	 * @generated
	 */
	EReference getRosRuntimeElement_Filterconnection();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.RosRuntimeElement#getInternaledge <em>Internaledge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Internaledge</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.RosRuntimeElement#getInternaledge()
	 * @see #getRosRuntimeElement()
	 * @generated
	 */
	EReference getRosRuntimeElement_Internaledge();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.TopicMessage <em>Topic Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Topic Message</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.TopicMessage
	 * @generated
	 */
	EClass getTopicMessage();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Topic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Topic</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Topic
	 * @generated
	 */
	EClass getTopic();

	/**
	 * Returns the meta object for the reference '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Topic#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Topic#getType()
	 * @see #getTopic()
	 * @generated
	 */
	EReference getTopic_Type();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.ContinousState <em>Continous State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Continous State</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.ContinousState
	 * @generated
	 */
	EClass getContinousState();

	/**
	 * Returns the meta object for the reference list '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.ContinousState#getSynchronizeWith <em>Synchronize With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Synchronize With</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.ContinousState#getSynchronizeWith()
	 * @see #getContinousState()
	 * @generated
	 */
	EReference getContinousState_SynchronizeWith();

	/**
	 * Returns the meta object for the containment reference '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.ContinousState#getWorkerthread <em>Workerthread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Workerthread</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.ContinousState#getWorkerthread()
	 * @see #getContinousState()
	 * @generated
	 */
	EReference getContinousState_Workerthread();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.DescriptiveElement <em>Descriptive Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Descriptive Element</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.DescriptiveElement
	 * @generated
	 */
	EClass getDescriptiveElement();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.DescriptiveElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.DescriptiveElement#getDescription()
	 * @see #getDescriptiveElement()
	 * @generated
	 */
	EAttribute getDescriptiveElement_Description();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.WorkerThread <em>Worker Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Worker Thread</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.WorkerThread
	 * @generated
	 */
	EClass getWorkerThread();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.WorkerThread#getFreq <em>Freq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Freq</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.WorkerThread#getFreq()
	 * @see #getWorkerThread()
	 * @generated
	 */
	EAttribute getWorkerThread_Freq();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.WorkerThread#getDoFunc <em>Do Func</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Do Func</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.WorkerThread#getDoFunc()
	 * @see #getWorkerThread()
	 * @generated
	 */
	EAttribute getWorkerThread_DoFunc();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Behavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Behavior
	 * @generated
	 */
	EClass getBehavior();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.HybridSystem <em>Hybrid System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hybrid System</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.HybridSystem
	 * @generated
	 */
	EClass getHybridSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.HybridSystem#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Location</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.HybridSystem#getLocation()
	 * @see #getHybridSystem()
	 * @generated
	 */
	EReference getHybridSystem_Location();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.HybridSystem#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transition</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.HybridSystem#getTransition()
	 * @see #getHybridSystem()
	 * @generated
	 */
	EReference getHybridSystem_Transition();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.HybridSystem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.HybridSystem#getName()
	 * @see #getHybridSystem()
	 * @generated
	 */
	EAttribute getHybridSystem_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.HybridSystem#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.HybridSystem#getVariable()
	 * @see #getHybridSystem()
	 * @generated
	 */
	EReference getHybridSystem_Variable();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.HybridSystem#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activity</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.HybridSystem#getActivity()
	 * @see #getHybridSystem()
	 * @generated
	 */
	EReference getHybridSystem_Activity();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.HybridSystem#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.HybridSystem#getEvent()
	 * @see #getHybridSystem()
	 * @generated
	 */
	EReference getHybridSystem_Event();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.HybridSystem#getInvariant <em>Invariant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Invariant</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.HybridSystem#getInvariant()
	 * @see #getHybridSystem()
	 * @generated
	 */
	EReference getHybridSystem_Invariant();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Location#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Location#getName()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Name();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Transition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Transition#getName()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Name();

	/**
	 * Returns the meta object for the reference '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for the reference '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Transition#getDiscreteevent <em>Discreteevent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Discreteevent</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Transition#getDiscreteevent()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Discreteevent();

	/**
	 * Returns the meta object for the reference '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Transition#getContinuousvariable <em>Continuousvariable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Continuousvariable</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Transition#getContinuousvariable()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Continuousvariable();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.ContinuousVariable <em>Continuous Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Continuous Variable</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.ContinuousVariable
	 * @generated
	 */
	EClass getContinuousVariable();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.ContinuousVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.ContinuousVariable#getName()
	 * @see #getContinuousVariable()
	 * @generated
	 */
	EAttribute getContinuousVariable_Name();

	/**
	 * Returns the meta object for the reference '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.ContinuousVariable#getContinousstate <em>Continousstate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Continousstate</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.ContinuousVariable#getContinousstate()
	 * @see #getContinuousVariable()
	 * @generated
	 */
	EReference getContinuousVariable_Continousstate();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the reference '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Activity#getContinousvariable <em>Continousvariable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Continousvariable</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Activity#getContinousvariable()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Continousvariable();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.DiscreteEvent <em>Discrete Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discrete Event</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.DiscreteEvent
	 * @generated
	 */
	EClass getDiscreteEvent();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.DiscreteEvent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.DiscreteEvent#getName()
	 * @see #getDiscreteEvent()
	 * @generated
	 */
	EAttribute getDiscreteEvent_Name();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.FuzzyHybridSystem <em>Fuzzy Hybrid System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fuzzy Hybrid System</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.FuzzyHybridSystem
	 * @generated
	 */
	EClass getFuzzyHybridSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.FuzzyHybridSystem#getRuleset <em>Ruleset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ruleset</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.FuzzyHybridSystem#getRuleset()
	 * @see #getFuzzyHybridSystem()
	 * @generated
	 */
	EReference getFuzzyHybridSystem_Ruleset();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.RuleSet <em>Rule Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Set</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.RuleSet
	 * @generated
	 */
	EClass getRuleSet();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.RuleSet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.RuleSet#getName()
	 * @see #getRuleSet()
	 * @generated
	 */
	EAttribute getRuleSet_Name();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Invariant <em>Invariant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invariant</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Invariant
	 * @generated
	 */
	EClass getInvariant();

	/**
	 * Returns the meta object for the reference '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Invariant#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Invariant#getLocation()
	 * @see #getInvariant()
	 * @generated
	 */
	EReference getInvariant_Location();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.NodeParameter <em>Node Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Parameter</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.NodeParameter
	 * @generated
	 */
	EClass getNodeParameter();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.NodeParameter#getTargetvar <em>Targetvar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Targetvar</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.NodeParameter#getTargetvar()
	 * @see #getNodeParameter()
	 * @generated
	 */
	EAttribute getNodeParameter_Targetvar();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.NodeParameterGroup <em>Node Parameter Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Parameter Group</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.NodeParameterGroup
	 * @generated
	 */
	EClass getNodeParameterGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.NodeParameterGroup#getNodeparameter <em>Nodeparameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodeparameter</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.NodeParameterGroup#getNodeparameter()
	 * @see #getNodeParameterGroup()
	 * @generated
	 */
	EReference getNodeParameterGroup_Nodeparameter();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.NodeParameterGroup#getConfig_obj <em>Config obj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config obj</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.NodeParameterGroup#getConfig_obj()
	 * @see #getNodeParameterGroup()
	 * @generated
	 */
	EAttribute getNodeParameterGroup_Config_obj();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.NodeParameterGroup#isGenerate_struct <em>Generate struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate struct</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.NodeParameterGroup#isGenerate_struct()
	 * @see #getNodeParameterGroup()
	 * @generated
	 */
	EAttribute getNodeParameterGroup_Generate_struct();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.AbstractNodeParameter <em>Abstract Node Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Node Parameter</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.AbstractNodeParameter
	 * @generated
	 */
	EClass getAbstractNodeParameter();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.AbstractNodeParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.AbstractNodeParameter#getName()
	 * @see #getAbstractNodeParameter()
	 * @generated
	 */
	EAttribute getAbstractNodeParameter_Name();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.DoubleParameter <em>Double Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Parameter</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.DoubleParameter
	 * @generated
	 */
	EClass getDoubleParameter();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.DoubleParameter#getMaxval <em>Maxval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maxval</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.DoubleParameter#getMaxval()
	 * @see #getDoubleParameter()
	 * @generated
	 */
	EAttribute getDoubleParameter_Maxval();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.DoubleParameter#getMinval <em>Minval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minval</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.DoubleParameter#getMinval()
	 * @see #getDoubleParameter()
	 * @generated
	 */
	EAttribute getDoubleParameter_Minval();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.DoubleParameter#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.DoubleParameter#getStep()
	 * @see #getDoubleParameter()
	 * @generated
	 */
	EAttribute getDoubleParameter_Step();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.DoubleParameter#getDefaultval <em>Defaultval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Defaultval</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.DoubleParameter#getDefaultval()
	 * @see #getDoubleParameter()
	 * @generated
	 */
	EAttribute getDoubleParameter_Defaultval();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StringParameter <em>String Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Parameter</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StringParameter
	 * @generated
	 */
	EClass getStringParameter();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StringParameter#getDefaultval <em>Defaultval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Defaultval</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StringParameter#getDefaultval()
	 * @see #getStringParameter()
	 * @generated
	 */
	EAttribute getStringParameter_Defaultval();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.BooleanParameter <em>Boolean Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Parameter</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.BooleanParameter
	 * @generated
	 */
	EClass getBooleanParameter();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.BooleanParameter#isDefaultval <em>Defaultval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Defaultval</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.BooleanParameter#isDefaultval()
	 * @see #getBooleanParameter()
	 * @generated
	 */
	EAttribute getBooleanParameter_Defaultval();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.IntegerParameter <em>Integer Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Parameter</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.IntegerParameter
	 * @generated
	 */
	EClass getIntegerParameter();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.IntegerParameter#getMaxval <em>Maxval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maxval</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.IntegerParameter#getMaxval()
	 * @see #getIntegerParameter()
	 * @generated
	 */
	EAttribute getIntegerParameter_Maxval();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.IntegerParameter#getMinval <em>Minval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minval</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.IntegerParameter#getMinval()
	 * @see #getIntegerParameter()
	 * @generated
	 */
	EAttribute getIntegerParameter_Minval();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.IntegerParameter#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.IntegerParameter#getStep()
	 * @see #getIntegerParameter()
	 * @generated
	 */
	EAttribute getIntegerParameter_Step();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.IntegerParameter#getDefaultval <em>Defaultval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Defaultval</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.IntegerParameter#getDefaultval()
	 * @see #getIntegerParameter()
	 * @generated
	 */
	EAttribute getIntegerParameter_Defaultval();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.ErrorLocation <em>Error Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Location</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.ErrorLocation
	 * @generated
	 */
	EClass getErrorLocation();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.ServiceType <em>Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Type</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.ServiceType
	 * @generated
	 */
	EClass getServiceType();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.AbstractMsgType <em>Abstract Msg Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Msg Type</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.AbstractMsgType
	 * @generated
	 */
	EClass getAbstractMsgType();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Channel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Channel</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Channel
	 * @generated
	 */
	EClass getChannel();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Channel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Channel#getName()
	 * @see #getChannel()
	 * @generated
	 */
	EAttribute getChannel_Name();

	/**
	 * Returns the meta object for the reference '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Channel#getPortFrom <em>Port From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port From</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Channel#getPortFrom()
	 * @see #getChannel()
	 * @generated
	 */
	EReference getChannel_PortFrom();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the reference '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Service#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Service#getType()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Type();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.FilePackage <em>File Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Package</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.FilePackage
	 * @generated
	 */
	EClass getFilePackage();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.FilePackage#getAbstractroselement <em>Abstractroselement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstractroselement</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.FilePackage#getAbstractroselement()
	 * @see #getFilePackage()
	 * @generated
	 */
	EReference getFilePackage_Abstractroselement();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.FilePackage#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filter</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.FilePackage#getFilter()
	 * @see #getFilePackage()
	 * @generated
	 */
	EReference getFilePackage_Filter();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.AbstractRosFileElement <em>Abstract Ros File Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Ros File Element</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.AbstractRosFileElement
	 * @generated
	 */
	EClass getAbstractRosFileElement();

	/**
	 * Returns the meta object for the container reference '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.AbstractRosFileElement#getFilepackage <em>Filepackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Filepackage</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.AbstractRosFileElement#getFilepackage()
	 * @see #getAbstractRosFileElement()
	 * @generated
	 */
	EReference getAbstractRosFileElement_Filepackage();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.RosElement <em>Ros Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ros Element</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.RosElement
	 * @generated
	 */
	EClass getRosElement();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.RosElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.RosElement#getName()
	 * @see #getRosElement()
	 * @generated
	 */
	EAttribute getRosElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.RosElement#isGenerateartifact <em>Generateartifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generateartifact</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.RosElement#isGenerateartifact()
	 * @see #getRosElement()
	 * @generated
	 */
	EAttribute getRosElement_Generateartifact();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.TemplateNode <em>Template Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Node</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.TemplateNode
	 * @generated
	 */
	EClass getTemplateNode();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.FilterDefinition <em>Filter Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Definition</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.FilterDefinition
	 * @generated
	 */
	EClass getFilterDefinition();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.FilterDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.FilterDefinition#getName()
	 * @see #getFilterDefinition()
	 * @generated
	 */
	EAttribute getFilterDefinition_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.FilterDefinition#getInput_field <em>Input field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input field</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.FilterDefinition#getInput_field()
	 * @see #getFilterDefinition()
	 * @generated
	 */
	EReference getFilterDefinition_Input_field();

	/**
	 * Returns the meta object for the containment reference '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.FilterDefinition#getOutput_field <em>Output field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output field</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.FilterDefinition#getOutput_field()
	 * @see #getFilterDefinition()
	 * @generated
	 */
	EReference getFilterDefinition_Output_field();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.FilterConnection <em>Filter Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Connection</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.FilterConnection
	 * @generated
	 */
	EClass getFilterConnection();

	/**
	 * Returns the meta object for the reference '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.FilterConnection#getUsedfilter <em>Usedfilter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Usedfilter</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.FilterConnection#getUsedfilter()
	 * @see #getFilterConnection()
	 * @generated
	 */
	EReference getFilterConnection_Usedfilter();

	/**
	 * Returns the meta object for the reference list '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.FilterConnection#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.FilterConnection#getInput()
	 * @see #getFilterConnection()
	 * @generated
	 */
	EReference getFilterConnection_Input();

	/**
	 * Returns the meta object for the reference '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.FilterConnection#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.FilterConnection#getOutput()
	 * @see #getFilterConnection()
	 * @generated
	 */
	EReference getFilterConnection_Output();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.InternalNode <em>Internal Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Node</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.InternalNode
	 * @generated
	 */
	EClass getInternalNode();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.SerializedField <em>Serialized Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Serialized Field</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.SerializedField
	 * @generated
	 */
	EClass getSerializedField();

	/**
	 * Returns the meta object for the reference '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.SerializedField#getTopicmessage <em>Topicmessage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Topicmessage</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.SerializedField#getTopicmessage()
	 * @see #getSerializedField()
	 * @generated
	 */
	EReference getSerializedField_Topicmessage();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.SerializedField#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.SerializedField#getId()
	 * @see #getSerializedField()
	 * @generated
	 */
	EAttribute getSerializedField_Id();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.InternalEdge <em>Internal Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Edge</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.InternalEdge
	 * @generated
	 */
	EClass getInternalEdge();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.InternalElement <em>Internal Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Element</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.InternalElement
	 * @generated
	 */
	EClass getInternalElement();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.InternalElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.InternalElement#getName()
	 * @see #getInternalElement()
	 * @generated
	 */
	EAttribute getInternalElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.InternalElement#isDebug <em>Debug</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Debug</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.InternalElement#isDebug()
	 * @see #getInternalElement()
	 * @generated
	 */
	EAttribute getInternalElement_Debug();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.DirectConnection <em>Direct Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Direct Connection</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.DirectConnection
	 * @generated
	 */
	EClass getDirectConnection();

	/**
	 * Returns the meta object for the reference '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.DirectConnection#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.DirectConnection#getPort()
	 * @see #getDirectConnection()
	 * @generated
	 */
	EReference getDirectConnection_Port();

	/**
	 * Returns the meta object for the reference '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.DirectConnection#getContinousstate <em>Continousstate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Continousstate</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.DirectConnection#getContinousstate()
	 * @see #getDirectConnection()
	 * @generated
	 */
	EReference getDirectConnection_Continousstate();

	/**
	 * Returns the meta object for enum '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.NetworkType <em>Network Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Network Type</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.NetworkType
	 * @generated
	 */
	EEnum getNetworkType();

	/**
	 * Returns the meta object for enum '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.LanguageType <em>Language Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Language Type</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.LanguageType
	 * @generated
	 */
	EEnum getLanguageType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StatepubsubmodelFactory getStatepubsubmodelFactory();

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
		 * The meta object literal for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StackImpl <em>Stack</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StackImpl
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getStack()
		 * @generated
		 */
		EClass STACK = eINSTANCE.getStack();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK__NAME = eINSTANCE.getStack_Name();

		/**
		 * The meta object literal for the '<em><b>Channels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STACK__CHANNELS = eINSTANCE.getStack_Channels();

		/**
		 * The meta object literal for the '<em><b>Networktype</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK__NETWORKTYPE = eINSTANCE.getStack_Networktype();

		/**
		 * The meta object literal for the '<em><b>Filepackage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STACK__FILEPACKAGE = eINSTANCE.getStack_Filepackage();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.InputPortImpl <em>Input Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.InputPortImpl
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getInputPort()
		 * @generated
		 */
		EClass INPUT_PORT = eINSTANCE.getInputPort();

		/**
		 * The meta object literal for the '<em><b>Sync function name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_PORT__SYNC_FUNCTION_NAME = eINSTANCE.getInputPort_Sync_function_name();

		/**
		 * The meta object literal for the '<em><b>Synchronizes State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_PORT__SYNCHRONIZES_STATE = eINSTANCE.getInputPort_SynchronizesState();

		/**
		 * The meta object literal for the '<em><b>Channel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_PORT__CHANNEL = eINSTANCE.getInputPort_Channel();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.OutputPortImpl <em>Output Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.OutputPortImpl
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getOutputPort()
		 * @generated
		 */
		EClass OUTPUT_PORT = eINSTANCE.getOutputPort();

		/**
		 * The meta object literal for the '<em><b>Channel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_PORT__CHANNEL = eINSTANCE.getOutputPort_Channel();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.PortImpl
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Estimated freq</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__ESTIMATED_FREQ = eINSTANCE.getPort_Estimated_freq();

		/**
		 * The meta object literal for the '<em><b>Sync time stamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__SYNC_TIME_STAMP = eINSTANCE.getPort_Sync_time_stamp();

		/**
		 * The meta object literal for the '<em><b>Sample tolerance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__SAMPLE_TOLERANCE = eINSTANCE.getPort_Sample_tolerance();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.RosRuntimeElementImpl <em>Ros Runtime Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.RosRuntimeElementImpl
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getRosRuntimeElement()
		 * @generated
		 */
		EClass ROS_RUNTIME_ELEMENT = eINSTANCE.getRosRuntimeElement();

		/**
		 * The meta object literal for the '<em><b>Continousstate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_RUNTIME_ELEMENT__CONTINOUSSTATE = eINSTANCE.getRosRuntimeElement_Continousstate();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_RUNTIME_ELEMENT__IMPLEMENTS = eINSTANCE.getRosRuntimeElement_Implements();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_RUNTIME_ELEMENT__NAMESPACE = eINSTANCE.getRosRuntimeElement_Namespace();

		/**
		 * The meta object literal for the '<em><b>Behavior</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_RUNTIME_ELEMENT__BEHAVIOR = eINSTANCE.getRosRuntimeElement_Behavior();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_RUNTIME_ELEMENT__LANGUAGE = eINSTANCE.getRosRuntimeElement_Language();

		/**
		 * The meta object literal for the '<em><b>Nodeparameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_RUNTIME_ELEMENT__NODEPARAMETERS = eINSTANCE.getRosRuntimeElement_Nodeparameters();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_RUNTIME_ELEMENT__PORT = eINSTANCE.getRosRuntimeElement_Port();

		/**
		 * The meta object literal for the '<em><b>Filterconnection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_RUNTIME_ELEMENT__FILTERCONNECTION = eINSTANCE.getRosRuntimeElement_Filterconnection();

		/**
		 * The meta object literal for the '<em><b>Internaledge</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_RUNTIME_ELEMENT__INTERNALEDGE = eINSTANCE.getRosRuntimeElement_Internaledge();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.TopicMessageImpl <em>Topic Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.TopicMessageImpl
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getTopicMessage()
		 * @generated
		 */
		EClass TOPIC_MESSAGE = eINSTANCE.getTopicMessage();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.TopicImpl <em>Topic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.TopicImpl
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getTopic()
		 * @generated
		 */
		EClass TOPIC = eINSTANCE.getTopic();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPIC__TYPE = eINSTANCE.getTopic_Type();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.ContinousStateImpl <em>Continous State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.ContinousStateImpl
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getContinousState()
		 * @generated
		 */
		EClass CONTINOUS_STATE = eINSTANCE.getContinousState();

		/**
		 * The meta object literal for the '<em><b>Synchronize With</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTINOUS_STATE__SYNCHRONIZE_WITH = eINSTANCE.getContinousState_SynchronizeWith();

		/**
		 * The meta object literal for the '<em><b>Workerthread</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTINOUS_STATE__WORKERTHREAD = eINSTANCE.getContinousState_Workerthread();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.DescriptiveElementImpl <em>Descriptive Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.DescriptiveElementImpl
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getDescriptiveElement()
		 * @generated
		 */
		EClass DESCRIPTIVE_ELEMENT = eINSTANCE.getDescriptiveElement();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTIVE_ELEMENT__DESCRIPTION = eINSTANCE.getDescriptiveElement_Description();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.WorkerThreadImpl <em>Worker Thread</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.WorkerThreadImpl
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getWorkerThread()
		 * @generated
		 */
		EClass WORKER_THREAD = eINSTANCE.getWorkerThread();

		/**
		 * The meta object literal for the '<em><b>Freq</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKER_THREAD__FREQ = eINSTANCE.getWorkerThread_Freq();

		/**
		 * The meta object literal for the '<em><b>Do Func</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKER_THREAD__DO_FUNC = eINSTANCE.getWorkerThread_DoFunc();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.BehaviorImpl <em>Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.BehaviorImpl
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getBehavior()
		 * @generated
		 */
		EClass BEHAVIOR = eINSTANCE.getBehavior();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.HybridSystemImpl <em>Hybrid System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.HybridSystemImpl
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getHybridSystem()
		 * @generated
		 */
		EClass HYBRID_SYSTEM = eINSTANCE.getHybridSystem();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYBRID_SYSTEM__LOCATION = eINSTANCE.getHybridSystem_Location();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYBRID_SYSTEM__TRANSITION = eINSTANCE.getHybridSystem_Transition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYBRID_SYSTEM__NAME = eINSTANCE.getHybridSystem_Name();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYBRID_SYSTEM__VARIABLE = eINSTANCE.getHybridSystem_Variable();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYBRID_SYSTEM__ACTIVITY = eINSTANCE.getHybridSystem_Activity();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYBRID_SYSTEM__EVENT = eINSTANCE.getHybridSystem_Event();

		/**
		 * The meta object literal for the '<em><b>Invariant</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYBRID_SYSTEM__INVARIANT = eINSTANCE.getHybridSystem_Invariant();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.LocationImpl
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__NAME = eINSTANCE.getLocation_Name();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.TransitionImpl
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__NAME = eINSTANCE.getTransition_Name();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Discreteevent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__DISCRETEEVENT = eINSTANCE.getTransition_Discreteevent();

		/**
		 * The meta object literal for the '<em><b>Continuousvariable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__CONTINUOUSVARIABLE = eINSTANCE.getTransition_Continuousvariable();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.ContinuousVariableImpl <em>Continuous Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.ContinuousVariableImpl
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getContinuousVariable()
		 * @generated
		 */
		EClass CONTINUOUS_VARIABLE = eINSTANCE.getContinuousVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTINUOUS_VARIABLE__NAME = eINSTANCE.getContinuousVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Continousstate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTINUOUS_VARIABLE__CONTINOUSSTATE = eINSTANCE.getContinuousVariable_Continousstate();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.ActivityImpl
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Continousvariable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__CONTINOUSVARIABLE = eINSTANCE.getActivity_Continousvariable();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.DiscreteEventImpl <em>Discrete Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.DiscreteEventImpl
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getDiscreteEvent()
		 * @generated
		 */
		EClass DISCRETE_EVENT = eINSTANCE.getDiscreteEvent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCRETE_EVENT__NAME = eINSTANCE.getDiscreteEvent_Name();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.FuzzyHybridSystemImpl <em>Fuzzy Hybrid System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.FuzzyHybridSystemImpl
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getFuzzyHybridSystem()
		 * @generated
		 */
		EClass FUZZY_HYBRID_SYSTEM = eINSTANCE.getFuzzyHybridSystem();

		/**
		 * The meta object literal for the '<em><b>Ruleset</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUZZY_HYBRID_SYSTEM__RULESET = eINSTANCE.getFuzzyHybridSystem_Ruleset();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.RuleSetImpl <em>Rule Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.RuleSetImpl
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getRuleSet()
		 * @generated
		 */
		EClass RULE_SET = eINSTANCE.getRuleSet();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_SET__NAME = eINSTANCE.getRuleSet_Name();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.InvariantImpl <em>Invariant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.InvariantImpl
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getInvariant()
		 * @generated
		 */
		EClass INVARIANT = eINSTANCE.getInvariant();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVARIANT__LOCATION = eINSTANCE.getInvariant_Location();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.NodeParameterImpl <em>Node Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.NodeParameterImpl
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getNodeParameter()
		 * @generated
		 */
		EClass NODE_PARAMETER = eINSTANCE.getNodeParameter();

		/**
		 * The meta object literal for the '<em><b>Targetvar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_PARAMETER__TARGETVAR = eINSTANCE.getNodeParameter_Targetvar();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.NodeParameterGroupImpl <em>Node Parameter Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.NodeParameterGroupImpl
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getNodeParameterGroup()
		 * @generated
		 */
		EClass NODE_PARAMETER_GROUP = eINSTANCE.getNodeParameterGroup();

		/**
		 * The meta object literal for the '<em><b>Nodeparameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_PARAMETER_GROUP__NODEPARAMETER = eINSTANCE.getNodeParameterGroup_Nodeparameter();

		/**
		 * The meta object literal for the '<em><b>Config obj</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_PARAMETER_GROUP__CONFIG_OBJ = eINSTANCE.getNodeParameterGroup_Config_obj();

		/**
		 * The meta object literal for the '<em><b>Generate struct</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_PARAMETER_GROUP__GENERATE_STRUCT = eINSTANCE.getNodeParameterGroup_Generate_struct();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.AbstractNodeParameterImpl <em>Abstract Node Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.AbstractNodeParameterImpl
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getAbstractNodeParameter()
		 * @generated
		 */
		EClass ABSTRACT_NODE_PARAMETER = eINSTANCE.getAbstractNodeParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_NODE_PARAMETER__NAME = eINSTANCE.getAbstractNodeParameter_Name();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.DoubleParameterImpl <em>Double Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.DoubleParameterImpl
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getDoubleParameter()
		 * @generated
		 */
		EClass DOUBLE_PARAMETER = eINSTANCE.getDoubleParameter();

		/**
		 * The meta object literal for the '<em><b>Maxval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE_PARAMETER__MAXVAL = eINSTANCE.getDoubleParameter_Maxval();

		/**
		 * The meta object literal for the '<em><b>Minval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE_PARAMETER__MINVAL = eINSTANCE.getDoubleParameter_Minval();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE_PARAMETER__STEP = eINSTANCE.getDoubleParameter_Step();

		/**
		 * The meta object literal for the '<em><b>Defaultval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE_PARAMETER__DEFAULTVAL = eINSTANCE.getDoubleParameter_Defaultval();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StringParameterImpl <em>String Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StringParameterImpl
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getStringParameter()
		 * @generated
		 */
		EClass STRING_PARAMETER = eINSTANCE.getStringParameter();

		/**
		 * The meta object literal for the '<em><b>Defaultval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_PARAMETER__DEFAULTVAL = eINSTANCE.getStringParameter_Defaultval();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.BooleanParameterImpl <em>Boolean Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.BooleanParameterImpl
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getBooleanParameter()
		 * @generated
		 */
		EClass BOOLEAN_PARAMETER = eINSTANCE.getBooleanParameter();

		/**
		 * The meta object literal for the '<em><b>Defaultval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_PARAMETER__DEFAULTVAL = eINSTANCE.getBooleanParameter_Defaultval();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.IntegerParameterImpl <em>Integer Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.IntegerParameterImpl
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getIntegerParameter()
		 * @generated
		 */
		EClass INTEGER_PARAMETER = eINSTANCE.getIntegerParameter();

		/**
		 * The meta object literal for the '<em><b>Maxval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_PARAMETER__MAXVAL = eINSTANCE.getIntegerParameter_Maxval();

		/**
		 * The meta object literal for the '<em><b>Minval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_PARAMETER__MINVAL = eINSTANCE.getIntegerParameter_Minval();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_PARAMETER__STEP = eINSTANCE.getIntegerParameter_Step();

		/**
		 * The meta object literal for the '<em><b>Defaultval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_PARAMETER__DEFAULTVAL = eINSTANCE.getIntegerParameter_Defaultval();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.ErrorLocationImpl <em>Error Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.ErrorLocationImpl
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getErrorLocation()
		 * @generated
		 */
		EClass ERROR_LOCATION = eINSTANCE.getErrorLocation();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.ServiceTypeImpl <em>Service Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.ServiceTypeImpl
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getServiceType()
		 * @generated
		 */
		EClass SERVICE_TYPE = eINSTANCE.getServiceType();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.AbstractMsgTypeImpl <em>Abstract Msg Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.AbstractMsgTypeImpl
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getAbstractMsgType()
		 * @generated
		 */
		EClass ABSTRACT_MSG_TYPE = eINSTANCE.getAbstractMsgType();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.ChannelImpl <em>Channel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.ChannelImpl
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getChannel()
		 * @generated
		 */
		EClass CHANNEL = eINSTANCE.getChannel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL__NAME = eINSTANCE.getChannel_Name();

		/**
		 * The meta object literal for the '<em><b>Port From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL__PORT_FROM = eINSTANCE.getChannel_PortFrom();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.ServiceImpl
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__TYPE = eINSTANCE.getService_Type();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.FilePackageImpl <em>File Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.FilePackageImpl
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getFilePackage()
		 * @generated
		 */
		EClass FILE_PACKAGE = eINSTANCE.getFilePackage();

		/**
		 * The meta object literal for the '<em><b>Abstractroselement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_PACKAGE__ABSTRACTROSELEMENT = eINSTANCE.getFilePackage_Abstractroselement();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_PACKAGE__FILTER = eINSTANCE.getFilePackage_Filter();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.AbstractRosFileElementImpl <em>Abstract Ros File Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.AbstractRosFileElementImpl
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getAbstractRosFileElement()
		 * @generated
		 */
		EClass ABSTRACT_ROS_FILE_ELEMENT = eINSTANCE.getAbstractRosFileElement();

		/**
		 * The meta object literal for the '<em><b>Filepackage</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ROS_FILE_ELEMENT__FILEPACKAGE = eINSTANCE.getAbstractRosFileElement_Filepackage();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.RosElementImpl <em>Ros Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.RosElementImpl
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getRosElement()
		 * @generated
		 */
		EClass ROS_ELEMENT = eINSTANCE.getRosElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_ELEMENT__NAME = eINSTANCE.getRosElement_Name();

		/**
		 * The meta object literal for the '<em><b>Generateartifact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_ELEMENT__GENERATEARTIFACT = eINSTANCE.getRosElement_Generateartifact();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.NodeImpl
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.TemplateNodeImpl <em>Template Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.TemplateNodeImpl
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getTemplateNode()
		 * @generated
		 */
		EClass TEMPLATE_NODE = eINSTANCE.getTemplateNode();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.FilterDefinitionImpl <em>Filter Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.FilterDefinitionImpl
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getFilterDefinition()
		 * @generated
		 */
		EClass FILTER_DEFINITION = eINSTANCE.getFilterDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER_DEFINITION__NAME = eINSTANCE.getFilterDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Input field</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_DEFINITION__INPUT_FIELD = eINSTANCE.getFilterDefinition_Input_field();

		/**
		 * The meta object literal for the '<em><b>Output field</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_DEFINITION__OUTPUT_FIELD = eINSTANCE.getFilterDefinition_Output_field();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.FilterConnectionImpl <em>Filter Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.FilterConnectionImpl
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getFilterConnection()
		 * @generated
		 */
		EClass FILTER_CONNECTION = eINSTANCE.getFilterConnection();

		/**
		 * The meta object literal for the '<em><b>Usedfilter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_CONNECTION__USEDFILTER = eINSTANCE.getFilterConnection_Usedfilter();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_CONNECTION__INPUT = eINSTANCE.getFilterConnection_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_CONNECTION__OUTPUT = eINSTANCE.getFilterConnection_Output();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.InternalNodeImpl <em>Internal Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.InternalNodeImpl
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getInternalNode()
		 * @generated
		 */
		EClass INTERNAL_NODE = eINSTANCE.getInternalNode();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.SerializedFieldImpl <em>Serialized Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.SerializedFieldImpl
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getSerializedField()
		 * @generated
		 */
		EClass SERIALIZED_FIELD = eINSTANCE.getSerializedField();

		/**
		 * The meta object literal for the '<em><b>Topicmessage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERIALIZED_FIELD__TOPICMESSAGE = eINSTANCE.getSerializedField_Topicmessage();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERIALIZED_FIELD__ID = eINSTANCE.getSerializedField_Id();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.InternalEdgeImpl <em>Internal Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.InternalEdgeImpl
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getInternalEdge()
		 * @generated
		 */
		EClass INTERNAL_EDGE = eINSTANCE.getInternalEdge();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.InternalElementImpl <em>Internal Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.InternalElementImpl
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getInternalElement()
		 * @generated
		 */
		EClass INTERNAL_ELEMENT = eINSTANCE.getInternalElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_ELEMENT__NAME = eINSTANCE.getInternalElement_Name();

		/**
		 * The meta object literal for the '<em><b>Debug</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_ELEMENT__DEBUG = eINSTANCE.getInternalElement_Debug();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.DirectConnectionImpl <em>Direct Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.DirectConnectionImpl
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getDirectConnection()
		 * @generated
		 */
		EClass DIRECT_CONNECTION = eINSTANCE.getDirectConnection();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECT_CONNECTION__PORT = eINSTANCE.getDirectConnection_Port();

		/**
		 * The meta object literal for the '<em><b>Continousstate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECT_CONNECTION__CONTINOUSSTATE = eINSTANCE.getDirectConnection_Continousstate();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.NetworkType <em>Network Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.NetworkType
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getNetworkType()
		 * @generated
		 */
		EEnum NETWORK_TYPE = eINSTANCE.getNetworkType();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.LanguageType <em>Language Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.LanguageType
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getLanguageType()
		 * @generated
		 */
		EEnum LANGUAGE_TYPE = eINSTANCE.getLanguageType();

	}

} //StatepubsubmodelPackage

/**
 */
package hu.sze.aut.ros.network.model.rosnetworkmodel;

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
 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.RosnetworkmodelFactory
 * @model kind="package"
 * @generated
 */
public interface RosnetworkmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rosnetworkmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://jkk.sze.hu/rosnetworkmodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rosnetworkmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RosnetworkmodelPackage eINSTANCE = hu.sze.aut.ros.network.model.rosnetworkmodel.impl.RosnetworkmodelPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link hu.sze.aut.ros.network.model.rosnetworkmodel.impl.NetworkElementImpl <em>Network Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.impl.NetworkElementImpl
	 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.impl.RosnetworkmodelPackageImpl#getNetworkElement()
	 * @generated
	 */
	int NETWORK_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Network Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Network Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.sze.aut.ros.network.model.rosnetworkmodel.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.impl.NodeImpl
	 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.impl.RosnetworkmodelPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = NETWORK_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = NETWORK_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = NETWORK_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.sze.aut.ros.network.model.rosnetworkmodel.impl.TopicImpl <em>Topic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.impl.TopicImpl
	 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.impl.RosnetworkmodelPackageImpl#getTopic()
	 * @generated
	 */
	int TOPIC = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__NAME = NETWORK_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Rosmsg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__ROSMSG = NETWORK_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Topic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_FEATURE_COUNT = NETWORK_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Topic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_OPERATION_COUNT = NETWORK_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.sze.aut.ros.network.model.rosnetworkmodel.impl.NetworkImpl <em>Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.impl.NetworkImpl
	 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.impl.RosnetworkmodelPackageImpl#getNetwork()
	 * @generated
	 */
	int NETWORK = 2;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__NODE = 0;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__TOPIC = 1;

	/**
	 * The number of structural features of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.sze.aut.ros.network.model.rosnetworkmodel.impl.MsgDefinitionsImpl <em>Msg Definitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.impl.MsgDefinitionsImpl
	 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.impl.RosnetworkmodelPackageImpl#getMsgDefinitions()
	 * @generated
	 */
	int MSG_DEFINITIONS = 4;

	/**
	 * The feature id for the '<em><b>Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG_DEFINITIONS__PACKAGE = 0;

	/**
	 * The number of structural features of the '<em>Msg Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG_DEFINITIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Msg Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG_DEFINITIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.sze.aut.ros.network.model.rosnetworkmodel.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.impl.PackageImpl
	 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.impl.RosnetworkmodelPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 5;

	/**
	 * The feature id for the '<em><b>Subpackage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__SUBPACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Rosmsg</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ROSMSG = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PACKAGE = 3;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.sze.aut.ros.network.model.rosnetworkmodel.impl.RosMsgImpl <em>Ros Msg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.impl.RosMsgImpl
	 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.impl.RosnetworkmodelPackageImpl#getRosMsg()
	 * @generated
	 */
	int ROS_MSG = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_MSG__NAME = 0;

	/**
	 * The feature id for the '<em><b>Stamped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_MSG__STAMPED = 1;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_MSG__PACKAGE = 2;

	/**
	 * The number of structural features of the '<em>Ros Msg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_MSG_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Ros Msg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_MSG_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link hu.sze.aut.ros.network.model.rosnetworkmodel.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for class '{@link hu.sze.aut.ros.network.model.rosnetworkmodel.Topic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Topic</em>'.
	 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.Topic
	 * @generated
	 */
	EClass getTopic();

	/**
	 * Returns the meta object for the reference '{@link hu.sze.aut.ros.network.model.rosnetworkmodel.Topic#getRosmsg <em>Rosmsg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rosmsg</em>'.
	 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.Topic#getRosmsg()
	 * @see #getTopic()
	 * @generated
	 */
	EReference getTopic_Rosmsg();

	/**
	 * Returns the meta object for class '{@link hu.sze.aut.ros.network.model.rosnetworkmodel.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network</em>'.
	 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.Network
	 * @generated
	 */
	EClass getNetwork();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.sze.aut.ros.network.model.rosnetworkmodel.Network#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node</em>'.
	 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.Network#getNode()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_Node();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.sze.aut.ros.network.model.rosnetworkmodel.Network#getTopic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Topic</em>'.
	 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.Network#getTopic()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_Topic();

	/**
	 * Returns the meta object for class '{@link hu.sze.aut.ros.network.model.rosnetworkmodel.NetworkElement <em>Network Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Element</em>'.
	 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.NetworkElement
	 * @generated
	 */
	EClass getNetworkElement();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.aut.ros.network.model.rosnetworkmodel.NetworkElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.NetworkElement#getName()
	 * @see #getNetworkElement()
	 * @generated
	 */
	EAttribute getNetworkElement_Name();

	/**
	 * Returns the meta object for class '{@link hu.sze.aut.ros.network.model.rosnetworkmodel.MsgDefinitions <em>Msg Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Msg Definitions</em>'.
	 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.MsgDefinitions
	 * @generated
	 */
	EClass getMsgDefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.sze.aut.ros.network.model.rosnetworkmodel.MsgDefinitions#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Package</em>'.
	 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.MsgDefinitions#getPackage()
	 * @see #getMsgDefinitions()
	 * @generated
	 */
	EReference getMsgDefinitions_Package();

	/**
	 * Returns the meta object for class '{@link hu.sze.aut.ros.network.model.rosnetworkmodel.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.sze.aut.ros.network.model.rosnetworkmodel.Package#getSubpackage <em>Subpackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subpackage</em>'.
	 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.Package#getSubpackage()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Subpackage();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.sze.aut.ros.network.model.rosnetworkmodel.Package#getRosmsg <em>Rosmsg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rosmsg</em>'.
	 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.Package#getRosmsg()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Rosmsg();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.aut.ros.network.model.rosnetworkmodel.Package#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.Package#getName()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Name();

	/**
	 * Returns the meta object for the container reference '{@link hu.sze.aut.ros.network.model.rosnetworkmodel.Package#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Package</em>'.
	 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.Package#getPackage()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Package();

	/**
	 * Returns the meta object for class '{@link hu.sze.aut.ros.network.model.rosnetworkmodel.RosMsg <em>Ros Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ros Msg</em>'.
	 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.RosMsg
	 * @generated
	 */
	EClass getRosMsg();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.aut.ros.network.model.rosnetworkmodel.RosMsg#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.RosMsg#getName()
	 * @see #getRosMsg()
	 * @generated
	 */
	EAttribute getRosMsg_Name();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.aut.ros.network.model.rosnetworkmodel.RosMsg#isStamped <em>Stamped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stamped</em>'.
	 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.RosMsg#isStamped()
	 * @see #getRosMsg()
	 * @generated
	 */
	EAttribute getRosMsg_Stamped();

	/**
	 * Returns the meta object for the container reference '{@link hu.sze.aut.ros.network.model.rosnetworkmodel.RosMsg#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Package</em>'.
	 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.RosMsg#getPackage()
	 * @see #getRosMsg()
	 * @generated
	 */
	EReference getRosMsg_Package();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RosnetworkmodelFactory getRosnetworkmodelFactory();

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
		 * The meta object literal for the '{@link hu.sze.aut.ros.network.model.rosnetworkmodel.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.impl.NodeImpl
		 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.impl.RosnetworkmodelPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '{@link hu.sze.aut.ros.network.model.rosnetworkmodel.impl.TopicImpl <em>Topic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.impl.TopicImpl
		 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.impl.RosnetworkmodelPackageImpl#getTopic()
		 * @generated
		 */
		EClass TOPIC = eINSTANCE.getTopic();

		/**
		 * The meta object literal for the '<em><b>Rosmsg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPIC__ROSMSG = eINSTANCE.getTopic_Rosmsg();

		/**
		 * The meta object literal for the '{@link hu.sze.aut.ros.network.model.rosnetworkmodel.impl.NetworkImpl <em>Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.impl.NetworkImpl
		 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.impl.RosnetworkmodelPackageImpl#getNetwork()
		 * @generated
		 */
		EClass NETWORK = eINSTANCE.getNetwork();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK__NODE = eINSTANCE.getNetwork_Node();

		/**
		 * The meta object literal for the '<em><b>Topic</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK__TOPIC = eINSTANCE.getNetwork_Topic();

		/**
		 * The meta object literal for the '{@link hu.sze.aut.ros.network.model.rosnetworkmodel.impl.NetworkElementImpl <em>Network Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.impl.NetworkElementImpl
		 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.impl.RosnetworkmodelPackageImpl#getNetworkElement()
		 * @generated
		 */
		EClass NETWORK_ELEMENT = eINSTANCE.getNetworkElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_ELEMENT__NAME = eINSTANCE.getNetworkElement_Name();

		/**
		 * The meta object literal for the '{@link hu.sze.aut.ros.network.model.rosnetworkmodel.impl.MsgDefinitionsImpl <em>Msg Definitions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.impl.MsgDefinitionsImpl
		 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.impl.RosnetworkmodelPackageImpl#getMsgDefinitions()
		 * @generated
		 */
		EClass MSG_DEFINITIONS = eINSTANCE.getMsgDefinitions();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSG_DEFINITIONS__PACKAGE = eINSTANCE.getMsgDefinitions_Package();

		/**
		 * The meta object literal for the '{@link hu.sze.aut.ros.network.model.rosnetworkmodel.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.impl.PackageImpl
		 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.impl.RosnetworkmodelPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Subpackage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__SUBPACKAGE = eINSTANCE.getPackage_Subpackage();

		/**
		 * The meta object literal for the '<em><b>Rosmsg</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__ROSMSG = eINSTANCE.getPackage_Rosmsg();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__NAME = eINSTANCE.getPackage_Name();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__PACKAGE = eINSTANCE.getPackage_Package();

		/**
		 * The meta object literal for the '{@link hu.sze.aut.ros.network.model.rosnetworkmodel.impl.RosMsgImpl <em>Ros Msg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.impl.RosMsgImpl
		 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.impl.RosnetworkmodelPackageImpl#getRosMsg()
		 * @generated
		 */
		EClass ROS_MSG = eINSTANCE.getRosMsg();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_MSG__NAME = eINSTANCE.getRosMsg_Name();

		/**
		 * The meta object literal for the '<em><b>Stamped</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_MSG__STAMPED = eINSTANCE.getRosMsg_Stamped();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_MSG__PACKAGE = eINSTANCE.getRosMsg_Package();

	}

} //RosnetworkmodelPackage

/**
 */
package hu.sze.aut.ros.network.model.rosnetworkmodel.impl;

import hu.sze.aut.ros.network.model.rosnetworkmodel.MsgDefinitions;
import hu.sze.aut.ros.network.model.rosnetworkmodel.Network;
import hu.sze.aut.ros.network.model.rosnetworkmodel.NetworkElement;
import hu.sze.aut.ros.network.model.rosnetworkmodel.Node;
import hu.sze.aut.ros.network.model.rosnetworkmodel.RosMsg;
import hu.sze.aut.ros.network.model.rosnetworkmodel.RosnetworkmodelFactory;
import hu.sze.aut.ros.network.model.rosnetworkmodel.RosnetworkmodelPackage;
import hu.sze.aut.ros.network.model.rosnetworkmodel.Topic;

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
public class RosnetworkmodelFactoryImpl extends EFactoryImpl implements RosnetworkmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RosnetworkmodelFactory init() {
		try {
			RosnetworkmodelFactory theRosnetworkmodelFactory = (RosnetworkmodelFactory) EPackage.Registry.INSTANCE
					.getEFactory(RosnetworkmodelPackage.eNS_URI);
			if (theRosnetworkmodelFactory != null) {
				return theRosnetworkmodelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RosnetworkmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RosnetworkmodelFactoryImpl() {
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
		case RosnetworkmodelPackage.NODE:
			return createNode();
		case RosnetworkmodelPackage.TOPIC:
			return createTopic();
		case RosnetworkmodelPackage.NETWORK:
			return createNetwork();
		case RosnetworkmodelPackage.NETWORK_ELEMENT:
			return createNetworkElement();
		case RosnetworkmodelPackage.MSG_DEFINITIONS:
			return createMsgDefinitions();
		case RosnetworkmodelPackage.PACKAGE:
			return createPackage();
		case RosnetworkmodelPackage.ROS_MSG:
			return createRosMsg();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
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
	public Topic createTopic() {
		TopicImpl topic = new TopicImpl();
		return topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Network createNetwork() {
		NetworkImpl network = new NetworkImpl();
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkElement createNetworkElement() {
		NetworkElementImpl networkElement = new NetworkElementImpl();
		return networkElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MsgDefinitions createMsgDefinitions() {
		MsgDefinitionsImpl msgDefinitions = new MsgDefinitionsImpl();
		return msgDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public hu.sze.aut.ros.network.model.rosnetworkmodel.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RosMsg createRosMsg() {
		RosMsgImpl rosMsg = new RosMsgImpl();
		return rosMsg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RosnetworkmodelPackage getRosnetworkmodelPackage() {
		return (RosnetworkmodelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RosnetworkmodelPackage getPackage() {
		return RosnetworkmodelPackage.eINSTANCE;
	}

} //RosnetworkmodelFactoryImpl

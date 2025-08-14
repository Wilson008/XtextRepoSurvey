/**
 */
package hu.sze.aut.ros.network.model.rosnetworkmodel.util;

import hu.sze.aut.ros.network.model.rosnetworkmodel.MsgDefinitions;
import hu.sze.aut.ros.network.model.rosnetworkmodel.Network;
import hu.sze.aut.ros.network.model.rosnetworkmodel.NetworkElement;
import hu.sze.aut.ros.network.model.rosnetworkmodel.Node;
import hu.sze.aut.ros.network.model.rosnetworkmodel.RosMsg;
import hu.sze.aut.ros.network.model.rosnetworkmodel.RosnetworkmodelPackage;
import hu.sze.aut.ros.network.model.rosnetworkmodel.Topic;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.RosnetworkmodelPackage
 * @generated
 */
public class RosnetworkmodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RosnetworkmodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RosnetworkmodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RosnetworkmodelPackage.eINSTANCE;
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
	protected RosnetworkmodelSwitch<Adapter> modelSwitch = new RosnetworkmodelSwitch<Adapter>() {
		@Override
		public Adapter caseNode(Node object) {
			return createNodeAdapter();
		}

		@Override
		public Adapter caseTopic(Topic object) {
			return createTopicAdapter();
		}

		@Override
		public Adapter caseNetwork(Network object) {
			return createNetworkAdapter();
		}

		@Override
		public Adapter caseNetworkElement(NetworkElement object) {
			return createNetworkElementAdapter();
		}

		@Override
		public Adapter caseMsgDefinitions(MsgDefinitions object) {
			return createMsgDefinitionsAdapter();
		}

		@Override
		public Adapter casePackage(hu.sze.aut.ros.network.model.rosnetworkmodel.Package object) {
			return createPackageAdapter();
		}

		@Override
		public Adapter caseRosMsg(RosMsg object) {
			return createRosMsgAdapter();
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
	 * Creates a new adapter for an object of class '{@link hu.sze.aut.ros.network.model.rosnetworkmodel.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.aut.ros.network.model.rosnetworkmodel.Topic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.Topic
	 * @generated
	 */
	public Adapter createTopicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.aut.ros.network.model.rosnetworkmodel.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.Network
	 * @generated
	 */
	public Adapter createNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.aut.ros.network.model.rosnetworkmodel.NetworkElement <em>Network Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.NetworkElement
	 * @generated
	 */
	public Adapter createNetworkElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.aut.ros.network.model.rosnetworkmodel.MsgDefinitions <em>Msg Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.MsgDefinitions
	 * @generated
	 */
	public Adapter createMsgDefinitionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.aut.ros.network.model.rosnetworkmodel.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.aut.ros.network.model.rosnetworkmodel.RosMsg <em>Ros Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.aut.ros.network.model.rosnetworkmodel.RosMsg
	 * @generated
	 */
	public Adapter createRosMsgAdapter() {
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

} //RosnetworkmodelAdapterFactory

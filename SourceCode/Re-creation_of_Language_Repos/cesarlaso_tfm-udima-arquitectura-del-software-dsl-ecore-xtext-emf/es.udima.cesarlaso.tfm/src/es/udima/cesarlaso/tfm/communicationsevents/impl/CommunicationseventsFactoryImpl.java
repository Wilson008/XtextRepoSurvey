/**
 */
package es.udima.cesarlaso.tfm.communicationsevents.impl;

import es.udima.cesarlaso.tfm.communicationsevents.*;

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
public class CommunicationseventsFactoryImpl extends EFactoryImpl implements CommunicationseventsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CommunicationseventsFactory init() {
		try {
			CommunicationseventsFactory theCommunicationseventsFactory = (CommunicationseventsFactory)EPackage.Registry.INSTANCE.getEFactory(CommunicationseventsPackage.eNS_URI);
			if (theCommunicationseventsFactory != null) {
				return theCommunicationseventsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CommunicationseventsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationseventsFactoryImpl() {
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
			case CommunicationseventsPackage.NETWORK_CONNECTED: return createNetworkConnected();
			case CommunicationseventsPackage.NETWORK_DISCONNECTED: return createNetworkDisconnected();
			case CommunicationseventsPackage.SERVER_CONNECTED: return createServerConnected();
			case CommunicationseventsPackage.SERVER_DISCONNECTED: return createServerDisconnected();
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
	public NetworkConnected createNetworkConnected() {
		NetworkConnectedImpl networkConnected = new NetworkConnectedImpl();
		return networkConnected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworkDisconnected createNetworkDisconnected() {
		NetworkDisconnectedImpl networkDisconnected = new NetworkDisconnectedImpl();
		return networkDisconnected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServerConnected createServerConnected() {
		ServerConnectedImpl serverConnected = new ServerConnectedImpl();
		return serverConnected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServerDisconnected createServerDisconnected() {
		ServerDisconnectedImpl serverDisconnected = new ServerDisconnectedImpl();
		return serverDisconnected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationseventsPackage getCommunicationseventsPackage() {
		return (CommunicationseventsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CommunicationseventsPackage getPackage() {
		return CommunicationseventsPackage.eINSTANCE;
	}

} //CommunicationseventsFactoryImpl

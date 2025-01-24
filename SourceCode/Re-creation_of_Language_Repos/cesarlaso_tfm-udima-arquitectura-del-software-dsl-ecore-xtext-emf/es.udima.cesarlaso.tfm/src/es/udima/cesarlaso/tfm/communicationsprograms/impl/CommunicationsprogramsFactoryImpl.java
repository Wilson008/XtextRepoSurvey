/**
 */
package es.udima.cesarlaso.tfm.communicationsprograms.impl;

import es.udima.cesarlaso.tfm.communicationsprograms.*;

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
public class CommunicationsprogramsFactoryImpl extends EFactoryImpl implements CommunicationsprogramsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CommunicationsprogramsFactory init() {
		try {
			CommunicationsprogramsFactory theCommunicationsprogramsFactory = (CommunicationsprogramsFactory)EPackage.Registry.INSTANCE.getEFactory(CommunicationsprogramsPackage.eNS_URI);
			if (theCommunicationsprogramsFactory != null) {
				return theCommunicationsprogramsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CommunicationsprogramsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationsprogramsFactoryImpl() {
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
			case CommunicationsprogramsPackage.PROGRAM_EVENT_EVENT: return createProgramEventEvent();
			case CommunicationsprogramsPackage.PROGRAM_ACTUATOR_SERVICE: return createProgramActuatorService();
			case CommunicationsprogramsPackage.REMOTE_EVENT: return createRemoteEvent();
			case CommunicationsprogramsPackage.REMOTE_ACTUATOR: return createRemoteActuator();
			case CommunicationsprogramsPackage.REMOTE_EVENT_IDENTIFIER: return createRemoteEventIdentifier();
			case CommunicationsprogramsPackage.REMOTE_ACTUATOR_IDENTIFIER: return createRemoteActuatorIdentifier();
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
	public ProgramEventEvent createProgramEventEvent() {
		ProgramEventEventImpl programEventEvent = new ProgramEventEventImpl();
		return programEventEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgramActuatorService createProgramActuatorService() {
		ProgramActuatorServiceImpl programActuatorService = new ProgramActuatorServiceImpl();
		return programActuatorService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RemoteEvent createRemoteEvent() {
		RemoteEventImpl remoteEvent = new RemoteEventImpl();
		return remoteEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RemoteActuator createRemoteActuator() {
		RemoteActuatorImpl remoteActuator = new RemoteActuatorImpl();
		return remoteActuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RemoteEventIdentifier createRemoteEventIdentifier() {
		RemoteEventIdentifierImpl remoteEventIdentifier = new RemoteEventIdentifierImpl();
		return remoteEventIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RemoteActuatorIdentifier createRemoteActuatorIdentifier() {
		RemoteActuatorIdentifierImpl remoteActuatorIdentifier = new RemoteActuatorIdentifierImpl();
		return remoteActuatorIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationsprogramsPackage getCommunicationsprogramsPackage() {
		return (CommunicationsprogramsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CommunicationsprogramsPackage getPackage() {
		return CommunicationsprogramsPackage.eINSTANCE;
	}

} //CommunicationsprogramsFactoryImpl

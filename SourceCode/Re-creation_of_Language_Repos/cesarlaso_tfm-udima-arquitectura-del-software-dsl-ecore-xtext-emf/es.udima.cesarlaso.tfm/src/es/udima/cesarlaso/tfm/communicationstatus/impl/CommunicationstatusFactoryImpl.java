/**
 */
package es.udima.cesarlaso.tfm.communicationstatus.impl;

import es.udima.cesarlaso.tfm.communicationstatus.*;

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
public class CommunicationstatusFactoryImpl extends EFactoryImpl implements CommunicationstatusFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CommunicationstatusFactory init() {
		try {
			CommunicationstatusFactory theCommunicationstatusFactory = (CommunicationstatusFactory)EPackage.Registry.INSTANCE.getEFactory(CommunicationstatusPackage.eNS_URI);
			if (theCommunicationstatusFactory != null) {
				return theCommunicationstatusFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CommunicationstatusFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationstatusFactoryImpl() {
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
			case CommunicationstatusPackage.PING: return createPing();
			case CommunicationstatusPackage.PONG: return createPong();
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
	public Ping createPing() {
		PingImpl ping = new PingImpl();
		return ping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pong createPong() {
		PongImpl pong = new PongImpl();
		return pong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationstatusPackage getCommunicationstatusPackage() {
		return (CommunicationstatusPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CommunicationstatusPackage getPackage() {
		return CommunicationstatusPackage.eINSTANCE;
	}

} //CommunicationstatusFactoryImpl

/**
 */
package es.udima.cesarlaso.tfm.communicationshealths.impl;

import es.udima.cesarlaso.tfm.communicationshealths.*;

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
public class CommunicationshealthsFactoryImpl extends EFactoryImpl implements CommunicationshealthsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CommunicationshealthsFactory init() {
		try {
			CommunicationshealthsFactory theCommunicationshealthsFactory = (CommunicationshealthsFactory)EPackage.Registry.INSTANCE.getEFactory(CommunicationshealthsPackage.eNS_URI);
			if (theCommunicationshealthsFactory != null) {
				return theCommunicationshealthsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CommunicationshealthsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationshealthsFactoryImpl() {
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
			case CommunicationshealthsPackage.HEALTH_SERVICE: return createHealthService();
			case CommunicationshealthsPackage.HEALTH_MONITOR_REQUEST: return createHealthMonitorRequest();
			case CommunicationshealthsPackage.HEALTH_MONITOR_UPDATE: return createHealthMonitorUpdate();
			case CommunicationshealthsPackage.HEALTH_MONITOR_NOTIFICATION: return createHealthMonitorNotification();
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
	public HealthService createHealthService() {
		HealthServiceImpl healthService = new HealthServiceImpl();
		return healthService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HealthMonitorRequest createHealthMonitorRequest() {
		HealthMonitorRequestImpl healthMonitorRequest = new HealthMonitorRequestImpl();
		return healthMonitorRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HealthMonitorUpdate createHealthMonitorUpdate() {
		HealthMonitorUpdateImpl healthMonitorUpdate = new HealthMonitorUpdateImpl();
		return healthMonitorUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HealthMonitorNotification createHealthMonitorNotification() {
		HealthMonitorNotificationImpl healthMonitorNotification = new HealthMonitorNotificationImpl();
		return healthMonitorNotification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationshealthsPackage getCommunicationshealthsPackage() {
		return (CommunicationshealthsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CommunicationshealthsPackage getPackage() {
		return CommunicationshealthsPackage.eINSTANCE;
	}

} //CommunicationshealthsFactoryImpl

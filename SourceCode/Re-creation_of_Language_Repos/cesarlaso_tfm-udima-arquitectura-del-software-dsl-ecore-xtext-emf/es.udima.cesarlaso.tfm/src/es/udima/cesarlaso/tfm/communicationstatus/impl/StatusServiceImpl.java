/**
 */
package es.udima.cesarlaso.tfm.communicationstatus.impl;

import es.udima.cesarlaso.tfm.communications.impl.ServiceImpl;

import es.udima.cesarlaso.tfm.communicationstatus.CommunicationstatusPackage;
import es.udima.cesarlaso.tfm.communicationstatus.StatusService;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Status Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class StatusServiceImpl extends ServiceImpl implements StatusService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatusServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommunicationstatusPackage.Literals.STATUS_SERVICE;
	}

} //StatusServiceImpl

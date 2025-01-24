/**
 */
package es.udima.cesarlaso.tfm.communicationsprograms.impl;

import es.udima.cesarlaso.tfm.communications.impl.ServiceImpl;

import es.udima.cesarlaso.tfm.communicationsprograms.CommunicationsprogramsPackage;
import es.udima.cesarlaso.tfm.communicationsprograms.ProgramService;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.communicationsprograms.impl.ProgramServiceImpl#getGeneratedTimestamp <em>Generated Timestamp</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ProgramServiceImpl extends ServiceImpl implements ProgramService {
	/**
	 * The default value of the '{@link #getGeneratedTimestamp() <em>Generated Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final long GENERATED_TIMESTAMP_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getGeneratedTimestamp() <em>Generated Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedTimestamp()
	 * @generated
	 * @ordered
	 */
	protected long generatedTimestamp = GENERATED_TIMESTAMP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommunicationsprogramsPackage.Literals.PROGRAM_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getGeneratedTimestamp() {
		return generatedTimestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeneratedTimestamp(long newGeneratedTimestamp) {
		long oldGeneratedTimestamp = generatedTimestamp;
		generatedTimestamp = newGeneratedTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationsprogramsPackage.PROGRAM_SERVICE__GENERATED_TIMESTAMP, oldGeneratedTimestamp, generatedTimestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommunicationsprogramsPackage.PROGRAM_SERVICE__GENERATED_TIMESTAMP:
				return getGeneratedTimestamp();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CommunicationsprogramsPackage.PROGRAM_SERVICE__GENERATED_TIMESTAMP:
				setGeneratedTimestamp((Long)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CommunicationsprogramsPackage.PROGRAM_SERVICE__GENERATED_TIMESTAMP:
				setGeneratedTimestamp(GENERATED_TIMESTAMP_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CommunicationsprogramsPackage.PROGRAM_SERVICE__GENERATED_TIMESTAMP:
				return generatedTimestamp != GENERATED_TIMESTAMP_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (generatedTimestamp: ");
		result.append(generatedTimestamp);
		result.append(')');
		return result.toString();
	}

} //ProgramServiceImpl

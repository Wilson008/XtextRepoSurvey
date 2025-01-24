/**
 */
package es.udima.cesarlaso.tfm.programs.impl;

import es.udima.cesarlaso.tfm.communicationsprograms.RemoteIdentifier;

import es.udima.cesarlaso.tfm.gpios.Pin;

import es.udima.cesarlaso.tfm.operatingsystemactuators.FilePath;

import es.udima.cesarlaso.tfm.programs.Program;
import es.udima.cesarlaso.tfm.programs.ProgramState;
import es.udima.cesarlaso.tfm.programs.ProgramsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.programs.impl.ProgramImpl#getState <em>State</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.programs.impl.ProgramImpl#getStates <em>States</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.programs.impl.ProgramImpl#getGpioAliases <em>Gpio Aliases</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.programs.impl.ProgramImpl#getRemoteIdentifiers <em>Remote Identifiers</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.programs.impl.ProgramImpl#getFiles <em>Files</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramImpl extends MinimalEObjectImpl.Container implements Program {
	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected ProgramState state;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<ProgramState> states;

	/**
	 * The cached value of the '{@link #getGpioAliases() <em>Gpio Aliases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGpioAliases()
	 * @generated
	 * @ordered
	 */
	protected EList<Pin> gpioAliases;

	/**
	 * The cached value of the '{@link #getRemoteIdentifiers() <em>Remote Identifiers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteIdentifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<RemoteIdentifier> remoteIdentifiers;

	/**
	 * The cached value of the '{@link #getFiles() <em>Files</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiles()
	 * @generated
	 * @ordered
	 */
	protected EList<FilePath> files;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProgramsPackage.Literals.PROGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgramState getState() {
		if (state != null && state.eIsProxy()) {
			InternalEObject oldState = (InternalEObject)state;
			state = (ProgramState)eResolveProxy(oldState);
			if (state != oldState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProgramsPackage.PROGRAM__STATE, oldState, state));
			}
		}
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramState basicGetState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setState(ProgramState newState) {
		ProgramState oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProgramsPackage.PROGRAM__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProgramState> getStates() {
		if (states == null) {
			states = new EObjectContainmentEList<ProgramState>(ProgramState.class, this, ProgramsPackage.PROGRAM__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Pin> getGpioAliases() {
		if (gpioAliases == null) {
			gpioAliases = new EObjectContainmentEList<Pin>(Pin.class, this, ProgramsPackage.PROGRAM__GPIO_ALIASES);
		}
		return gpioAliases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RemoteIdentifier> getRemoteIdentifiers() {
		if (remoteIdentifiers == null) {
			remoteIdentifiers = new EObjectContainmentEList<RemoteIdentifier>(RemoteIdentifier.class, this, ProgramsPackage.PROGRAM__REMOTE_IDENTIFIERS);
		}
		return remoteIdentifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FilePath> getFiles() {
		if (files == null) {
			files = new EObjectContainmentEList<FilePath>(FilePath.class, this, ProgramsPackage.PROGRAM__FILES);
		}
		return files;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProgramsPackage.PROGRAM__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
			case ProgramsPackage.PROGRAM__GPIO_ALIASES:
				return ((InternalEList<?>)getGpioAliases()).basicRemove(otherEnd, msgs);
			case ProgramsPackage.PROGRAM__REMOTE_IDENTIFIERS:
				return ((InternalEList<?>)getRemoteIdentifiers()).basicRemove(otherEnd, msgs);
			case ProgramsPackage.PROGRAM__FILES:
				return ((InternalEList<?>)getFiles()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProgramsPackage.PROGRAM__STATE:
				if (resolve) return getState();
				return basicGetState();
			case ProgramsPackage.PROGRAM__STATES:
				return getStates();
			case ProgramsPackage.PROGRAM__GPIO_ALIASES:
				return getGpioAliases();
			case ProgramsPackage.PROGRAM__REMOTE_IDENTIFIERS:
				return getRemoteIdentifiers();
			case ProgramsPackage.PROGRAM__FILES:
				return getFiles();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProgramsPackage.PROGRAM__STATE:
				setState((ProgramState)newValue);
				return;
			case ProgramsPackage.PROGRAM__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends ProgramState>)newValue);
				return;
			case ProgramsPackage.PROGRAM__GPIO_ALIASES:
				getGpioAliases().clear();
				getGpioAliases().addAll((Collection<? extends Pin>)newValue);
				return;
			case ProgramsPackage.PROGRAM__REMOTE_IDENTIFIERS:
				getRemoteIdentifiers().clear();
				getRemoteIdentifiers().addAll((Collection<? extends RemoteIdentifier>)newValue);
				return;
			case ProgramsPackage.PROGRAM__FILES:
				getFiles().clear();
				getFiles().addAll((Collection<? extends FilePath>)newValue);
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
			case ProgramsPackage.PROGRAM__STATE:
				setState((ProgramState)null);
				return;
			case ProgramsPackage.PROGRAM__STATES:
				getStates().clear();
				return;
			case ProgramsPackage.PROGRAM__GPIO_ALIASES:
				getGpioAliases().clear();
				return;
			case ProgramsPackage.PROGRAM__REMOTE_IDENTIFIERS:
				getRemoteIdentifiers().clear();
				return;
			case ProgramsPackage.PROGRAM__FILES:
				getFiles().clear();
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
			case ProgramsPackage.PROGRAM__STATE:
				return state != null;
			case ProgramsPackage.PROGRAM__STATES:
				return states != null && !states.isEmpty();
			case ProgramsPackage.PROGRAM__GPIO_ALIASES:
				return gpioAliases != null && !gpioAliases.isEmpty();
			case ProgramsPackage.PROGRAM__REMOTE_IDENTIFIERS:
				return remoteIdentifiers != null && !remoteIdentifiers.isEmpty();
			case ProgramsPackage.PROGRAM__FILES:
				return files != null && !files.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProgramImpl

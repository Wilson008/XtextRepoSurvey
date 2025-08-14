/**
 */
package hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl;

import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.ContinousState;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.InputPort;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.WorkerThread;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Continous State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.ContinousStateImpl#getSynchronizeWith <em>Synchronize With</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.ContinousStateImpl#getWorkerthread <em>Workerthread</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContinousStateImpl extends InternalNodeImpl implements ContinousState {
	/**
	 * The cached value of the '{@link #getSynchronizeWith() <em>Synchronize With</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchronizeWith()
	 * @generated
	 * @ordered
	 */
	protected EList<InputPort> synchronizeWith;

	/**
	 * The cached value of the '{@link #getWorkerthread() <em>Workerthread</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkerthread()
	 * @generated
	 * @ordered
	 */
	protected WorkerThread workerthread;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContinousStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatepubsubmodelPackage.Literals.CONTINOUS_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPort> getSynchronizeWith() {
		if (synchronizeWith == null) {
			synchronizeWith = new EObjectWithInverseResolvingEList<InputPort>(InputPort.class, this,
					StatepubsubmodelPackage.CONTINOUS_STATE__SYNCHRONIZE_WITH,
					StatepubsubmodelPackage.INPUT_PORT__SYNCHRONIZES_STATE);
		}
		return synchronizeWith;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkerThread getWorkerthread() {
		return workerthread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkerthread(WorkerThread newWorkerthread, NotificationChain msgs) {
		WorkerThread oldWorkerthread = workerthread;
		workerthread = newWorkerthread;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					StatepubsubmodelPackage.CONTINOUS_STATE__WORKERTHREAD, oldWorkerthread, newWorkerthread);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkerthread(WorkerThread newWorkerthread) {
		if (newWorkerthread != workerthread) {
			NotificationChain msgs = null;
			if (workerthread != null)
				msgs = ((InternalEObject) workerthread).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - StatepubsubmodelPackage.CONTINOUS_STATE__WORKERTHREAD, null, msgs);
			if (newWorkerthread != null)
				msgs = ((InternalEObject) newWorkerthread).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - StatepubsubmodelPackage.CONTINOUS_STATE__WORKERTHREAD, null, msgs);
			msgs = basicSetWorkerthread(newWorkerthread, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatepubsubmodelPackage.CONTINOUS_STATE__WORKERTHREAD,
					newWorkerthread, newWorkerthread));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StatepubsubmodelPackage.CONTINOUS_STATE__SYNCHRONIZE_WITH:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSynchronizeWith()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StatepubsubmodelPackage.CONTINOUS_STATE__SYNCHRONIZE_WITH:
			return ((InternalEList<?>) getSynchronizeWith()).basicRemove(otherEnd, msgs);
		case StatepubsubmodelPackage.CONTINOUS_STATE__WORKERTHREAD:
			return basicSetWorkerthread(null, msgs);
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
		case StatepubsubmodelPackage.CONTINOUS_STATE__SYNCHRONIZE_WITH:
			return getSynchronizeWith();
		case StatepubsubmodelPackage.CONTINOUS_STATE__WORKERTHREAD:
			return getWorkerthread();
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
		case StatepubsubmodelPackage.CONTINOUS_STATE__SYNCHRONIZE_WITH:
			getSynchronizeWith().clear();
			getSynchronizeWith().addAll((Collection<? extends InputPort>) newValue);
			return;
		case StatepubsubmodelPackage.CONTINOUS_STATE__WORKERTHREAD:
			setWorkerthread((WorkerThread) newValue);
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
		case StatepubsubmodelPackage.CONTINOUS_STATE__SYNCHRONIZE_WITH:
			getSynchronizeWith().clear();
			return;
		case StatepubsubmodelPackage.CONTINOUS_STATE__WORKERTHREAD:
			setWorkerthread((WorkerThread) null);
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
		case StatepubsubmodelPackage.CONTINOUS_STATE__SYNCHRONIZE_WITH:
			return synchronizeWith != null && !synchronizeWith.isEmpty();
		case StatepubsubmodelPackage.CONTINOUS_STATE__WORKERTHREAD:
			return workerthread != null;
		}
		return super.eIsSet(featureID);
	}

} //ContinousStateImpl

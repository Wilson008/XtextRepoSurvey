/**
 */
package hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Continous State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.ContinousState#getSynchronizeWith <em>Synchronize With</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.ContinousState#getWorkerthread <em>Workerthread</em>}</li>
 * </ul>
 *
 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage#getContinousState()
 * @model
 * @generated
 */
public interface ContinousState extends InternalNode {
	/**
	 * Returns the value of the '<em><b>Synchronize With</b></em>' reference list.
	 * The list contents are of type {@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.InputPort}.
	 * It is bidirectional and its opposite is '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.InputPort#getSynchronizesState <em>Synchronizes State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchronize With</em>' reference list.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage#getContinousState_SynchronizeWith()
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.InputPort#getSynchronizesState
	 * @model opposite="synchronizesState"
	 * @generated
	 */
	EList<InputPort> getSynchronizeWith();

	/**
	 * Returns the value of the '<em><b>Workerthread</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workerthread</em>' containment reference.
	 * @see #setWorkerthread(WorkerThread)
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage#getContinousState_Workerthread()
	 * @model containment="true"
	 * @generated
	 */
	WorkerThread getWorkerthread();

	/**
	 * Sets the value of the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.ContinousState#getWorkerthread <em>Workerthread</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workerthread</em>' containment reference.
	 * @see #getWorkerthread()
	 * @generated
	 */
	void setWorkerthread(WorkerThread value);

} // ContinousState

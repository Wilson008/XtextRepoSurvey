/**
 */
package hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Worker Thread</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.WorkerThread#getFreq <em>Freq</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.WorkerThread#getDoFunc <em>Do Func</em>}</li>
 * </ul>
 *
 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage#getWorkerThread()
 * @model
 * @generated
 */
public interface WorkerThread extends EObject {
	/**
	 * Returns the value of the '<em><b>Freq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Freq</em>' attribute.
	 * @see #setFreq(int)
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage#getWorkerThread_Freq()
	 * @model
	 * @generated
	 */
	int getFreq();

	/**
	 * Sets the value of the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.WorkerThread#getFreq <em>Freq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Freq</em>' attribute.
	 * @see #getFreq()
	 * @generated
	 */
	void setFreq(int value);

	/**
	 * Returns the value of the '<em><b>Do Func</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Do Func</em>' attribute.
	 * @see #setDoFunc(String)
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage#getWorkerThread_DoFunc()
	 * @model
	 * @generated
	 */
	String getDoFunc();

	/**
	 * Sets the value of the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.WorkerThread#getDoFunc <em>Do Func</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Do Func</em>' attribute.
	 * @see #getDoFunc()
	 * @generated
	 */
	void setDoFunc(String value);

} // WorkerThread

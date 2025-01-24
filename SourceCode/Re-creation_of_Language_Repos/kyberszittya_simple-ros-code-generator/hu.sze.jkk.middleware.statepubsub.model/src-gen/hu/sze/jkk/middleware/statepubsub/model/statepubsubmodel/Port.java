/**
 */
package hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Port#getEstimated_freq <em>Estimated freq</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Port#isSync_time_stamp <em>Sync time stamp</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Port#getSample_tolerance <em>Sample tolerance</em>}</li>
 * </ul>
 *
 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage#getPort()
 * @model abstract="true"
 * @generated
 */
public interface Port extends InternalNode {
	/**
	 * Returns the value of the '<em><b>Estimated freq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated freq</em>' attribute.
	 * @see #setEstimated_freq(int)
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage#getPort_Estimated_freq()
	 * @model
	 * @generated
	 */
	int getEstimated_freq();

	/**
	 * Sets the value of the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Port#getEstimated_freq <em>Estimated freq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated freq</em>' attribute.
	 * @see #getEstimated_freq()
	 * @generated
	 */
	void setEstimated_freq(int value);

	/**
	 * Returns the value of the '<em><b>Sync time stamp</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sync time stamp</em>' attribute.
	 * @see #setSync_time_stamp(boolean)
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage#getPort_Sync_time_stamp()
	 * @model default="true"
	 * @generated
	 */
	boolean isSync_time_stamp();

	/**
	 * Sets the value of the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Port#isSync_time_stamp <em>Sync time stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sync time stamp</em>' attribute.
	 * @see #isSync_time_stamp()
	 * @generated
	 */
	void setSync_time_stamp(boolean value);

	/**
	 * Returns the value of the '<em><b>Sample tolerance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sample tolerance</em>' attribute.
	 * @see #setSample_tolerance(double)
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage#getPort_Sample_tolerance()
	 * @model
	 * @generated
	 */
	double getSample_tolerance();

	/**
	 * Sets the value of the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Port#getSample_tolerance <em>Sample tolerance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sample tolerance</em>' attribute.
	 * @see #getSample_tolerance()
	 * @generated
	 */
	void setSample_tolerance(double value);

} // Port

/**
 */
package es.udima.cesarlaso.tfm.communicationsprograms;

import es.udima.cesarlaso.tfm.communications.Service;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.communicationsprograms.ProgramService#getGeneratedTimestamp <em>Generated Timestamp</em>}</li>
 * </ul>
 *
 * @see es.udima.cesarlaso.tfm.communicationsprograms.CommunicationsprogramsPackage#getProgramService()
 * @model abstract="true"
 * @generated
 */
public interface ProgramService extends Service {
	/**
	 * Returns the value of the '<em><b>Generated Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Timestamp</em>' attribute.
	 * @see #setGeneratedTimestamp(long)
	 * @see es.udima.cesarlaso.tfm.communicationsprograms.CommunicationsprogramsPackage#getProgramService_GeneratedTimestamp()
	 * @model required="true"
	 * @generated
	 */
	long getGeneratedTimestamp();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.communicationsprograms.ProgramService#getGeneratedTimestamp <em>Generated Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generated Timestamp</em>' attribute.
	 * @see #getGeneratedTimestamp()
	 * @generated
	 */
	void setGeneratedTimestamp(long value);

} // ProgramService

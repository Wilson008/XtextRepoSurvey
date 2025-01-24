/**
 */
package es.udima.cesarlaso.tfm.programs;

import es.udima.cesarlaso.tfm.communicationsprograms.RemoteIdentifier;

import es.udima.cesarlaso.tfm.gpios.Pin;

import es.udima.cesarlaso.tfm.operatingsystemactuators.FilePath;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Programa es el modelo principal del dominio. Representa una serie de estados, eventos, actuadores
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.programs.Program#getState <em>State</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.programs.Program#getStates <em>States</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.programs.Program#getGpioAliases <em>Gpio Aliases</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.programs.Program#getRemoteIdentifiers <em>Remote Identifiers</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.programs.Program#getFiles <em>Files</em>}</li>
 * </ul>
 *
 * @see es.udima.cesarlaso.tfm.programs.ProgramsPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject {
	/**
	 * Returns the value of the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' reference.
	 * @see #setState(ProgramState)
	 * @see es.udima.cesarlaso.tfm.programs.ProgramsPackage#getProgram_State()
	 * @model required="true"
	 * @generated
	 */
	ProgramState getState();

	/**
	 * Sets the value of the '{@link es.udima.cesarlaso.tfm.programs.Program#getState <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(ProgramState value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link es.udima.cesarlaso.tfm.programs.ProgramState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see es.udima.cesarlaso.tfm.programs.ProgramsPackage#getProgram_States()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ProgramState> getStates();

	/**
	 * Returns the value of the '<em><b>Gpio Aliases</b></em>' containment reference list.
	 * The list contents are of type {@link es.udima.cesarlaso.tfm.gpios.Pin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gpio Aliases</em>' containment reference list.
	 * @see es.udima.cesarlaso.tfm.programs.ProgramsPackage#getProgram_GpioAliases()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pin> getGpioAliases();

	/**
	 * Returns the value of the '<em><b>Remote Identifiers</b></em>' containment reference list.
	 * The list contents are of type {@link es.udima.cesarlaso.tfm.communicationsprograms.RemoteIdentifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote Identifiers</em>' containment reference list.
	 * @see es.udima.cesarlaso.tfm.programs.ProgramsPackage#getProgram_RemoteIdentifiers()
	 * @model containment="true"
	 * @generated
	 */
	EList<RemoteIdentifier> getRemoteIdentifiers();

	/**
	 * Returns the value of the '<em><b>Files</b></em>' containment reference list.
	 * The list contents are of type {@link es.udima.cesarlaso.tfm.operatingsystemactuators.FilePath}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Files</em>' containment reference list.
	 * @see es.udima.cesarlaso.tfm.programs.ProgramsPackage#getProgram_Files()
	 * @model containment="true"
	 * @generated
	 */
	EList<FilePath> getFiles();

} // Program

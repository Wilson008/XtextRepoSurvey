/**
 */
package es.udima.cesarlaso.tfm.programs;

import es.udima.cesarlaso.tfm.events.EventsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see es.udima.cesarlaso.tfm.programs.ProgramsFactory
 * @model kind="package"
 * @generated
 */
public interface ProgramsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "programs";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://tfm.cesarlaso.udima.es/programs";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "es.udima.cesarlaso.tfm.programs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProgramsPackage eINSTANCE = es.udima.cesarlaso.tfm.programs.impl.ProgramsPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.programs.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.programs.impl.ProgramImpl
	 * @see es.udima.cesarlaso.tfm.programs.impl.ProgramsPackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__STATE = 0;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__STATES = 1;

	/**
	 * The feature id for the '<em><b>Gpio Aliases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__GPIO_ALIASES = 2;

	/**
	 * The feature id for the '<em><b>Remote Identifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__REMOTE_IDENTIFIERS = 3;

	/**
	 * The feature id for the '<em><b>Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__FILES = 4;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.programs.impl.ProgramStateImpl <em>Program State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.programs.impl.ProgramStateImpl
	 * @see es.udima.cesarlaso.tfm.programs.impl.ProgramsPackageImpl#getProgramState()
	 * @generated
	 */
	int PROGRAM_STATE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_STATE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_STATE__EVENTS = 1;

	/**
	 * The number of structural features of the '<em>Program State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_STATE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Program State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.programs.impl.ChangeStateActuatorImpl <em>Change State Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.programs.impl.ChangeStateActuatorImpl
	 * @see es.udima.cesarlaso.tfm.programs.impl.ProgramsPackageImpl#getChangeStateActuator()
	 * @generated
	 */
	int CHANGE_STATE_ACTUATOR = 2;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_STATE_ACTUATOR__STATE = EventsPackage.ACTUATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Change State Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_STATE_ACTUATOR_FEATURE_COUNT = EventsPackage.ACTUATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Change State Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_STATE_ACTUATOR_OPERATION_COUNT = EventsPackage.ACTUATOR_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.programs.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see es.udima.cesarlaso.tfm.programs.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the reference '{@link es.udima.cesarlaso.tfm.programs.Program#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see es.udima.cesarlaso.tfm.programs.Program#getState()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_State();

	/**
	 * Returns the meta object for the containment reference list '{@link es.udima.cesarlaso.tfm.programs.Program#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see es.udima.cesarlaso.tfm.programs.Program#getStates()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_States();

	/**
	 * Returns the meta object for the containment reference list '{@link es.udima.cesarlaso.tfm.programs.Program#getGpioAliases <em>Gpio Aliases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gpio Aliases</em>'.
	 * @see es.udima.cesarlaso.tfm.programs.Program#getGpioAliases()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_GpioAliases();

	/**
	 * Returns the meta object for the containment reference list '{@link es.udima.cesarlaso.tfm.programs.Program#getRemoteIdentifiers <em>Remote Identifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Remote Identifiers</em>'.
	 * @see es.udima.cesarlaso.tfm.programs.Program#getRemoteIdentifiers()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_RemoteIdentifiers();

	/**
	 * Returns the meta object for the containment reference list '{@link es.udima.cesarlaso.tfm.programs.Program#getFiles <em>Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Files</em>'.
	 * @see es.udima.cesarlaso.tfm.programs.Program#getFiles()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Files();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.programs.ProgramState <em>Program State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program State</em>'.
	 * @see es.udima.cesarlaso.tfm.programs.ProgramState
	 * @generated
	 */
	EClass getProgramState();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.programs.ProgramState#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.udima.cesarlaso.tfm.programs.ProgramState#getName()
	 * @see #getProgramState()
	 * @generated
	 */
	EAttribute getProgramState_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link es.udima.cesarlaso.tfm.programs.ProgramState#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see es.udima.cesarlaso.tfm.programs.ProgramState#getEvents()
	 * @see #getProgramState()
	 * @generated
	 */
	EReference getProgramState_Events();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.programs.ChangeStateActuator <em>Change State Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change State Actuator</em>'.
	 * @see es.udima.cesarlaso.tfm.programs.ChangeStateActuator
	 * @generated
	 */
	EClass getChangeStateActuator();

	/**
	 * Returns the meta object for the reference '{@link es.udima.cesarlaso.tfm.programs.ChangeStateActuator#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see es.udima.cesarlaso.tfm.programs.ChangeStateActuator#getState()
	 * @see #getChangeStateActuator()
	 * @generated
	 */
	EReference getChangeStateActuator_State();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProgramsFactory getProgramsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.programs.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.programs.impl.ProgramImpl
		 * @see es.udima.cesarlaso.tfm.programs.impl.ProgramsPackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__STATE = eINSTANCE.getProgram_State();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__STATES = eINSTANCE.getProgram_States();

		/**
		 * The meta object literal for the '<em><b>Gpio Aliases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__GPIO_ALIASES = eINSTANCE.getProgram_GpioAliases();

		/**
		 * The meta object literal for the '<em><b>Remote Identifiers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__REMOTE_IDENTIFIERS = eINSTANCE.getProgram_RemoteIdentifiers();

		/**
		 * The meta object literal for the '<em><b>Files</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__FILES = eINSTANCE.getProgram_Files();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.programs.impl.ProgramStateImpl <em>Program State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.programs.impl.ProgramStateImpl
		 * @see es.udima.cesarlaso.tfm.programs.impl.ProgramsPackageImpl#getProgramState()
		 * @generated
		 */
		EClass PROGRAM_STATE = eINSTANCE.getProgramState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM_STATE__NAME = eINSTANCE.getProgramState_Name();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM_STATE__EVENTS = eINSTANCE.getProgramState_Events();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.programs.impl.ChangeStateActuatorImpl <em>Change State Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.programs.impl.ChangeStateActuatorImpl
		 * @see es.udima.cesarlaso.tfm.programs.impl.ProgramsPackageImpl#getChangeStateActuator()
		 * @generated
		 */
		EClass CHANGE_STATE_ACTUATOR = eINSTANCE.getChangeStateActuator();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_STATE_ACTUATOR__STATE = eINSTANCE.getChangeStateActuator_State();

	}

} //ProgramsPackage

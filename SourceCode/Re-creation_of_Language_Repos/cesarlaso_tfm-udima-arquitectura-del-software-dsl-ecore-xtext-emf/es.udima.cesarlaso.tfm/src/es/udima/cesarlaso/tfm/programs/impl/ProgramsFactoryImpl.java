/**
 */
package es.udima.cesarlaso.tfm.programs.impl;

import es.udima.cesarlaso.tfm.programs.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProgramsFactoryImpl extends EFactoryImpl implements ProgramsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProgramsFactory init() {
		try {
			ProgramsFactory theProgramsFactory = (ProgramsFactory)EPackage.Registry.INSTANCE.getEFactory(ProgramsPackage.eNS_URI);
			if (theProgramsFactory != null) {
				return theProgramsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProgramsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ProgramsPackage.PROGRAM: return createProgram();
			case ProgramsPackage.PROGRAM_STATE: return createProgramState();
			case ProgramsPackage.CHANGE_STATE_ACTUATOR: return createChangeStateActuator();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Program createProgram() {
		ProgramImpl program = new ProgramImpl();
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgramState createProgramState() {
		ProgramStateImpl programState = new ProgramStateImpl();
		return programState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChangeStateActuator createChangeStateActuator() {
		ChangeStateActuatorImpl changeStateActuator = new ChangeStateActuatorImpl();
		return changeStateActuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgramsPackage getProgramsPackage() {
		return (ProgramsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProgramsPackage getPackage() {
		return ProgramsPackage.eINSTANCE;
	}

} //ProgramsFactoryImpl

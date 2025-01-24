/**
 */
package de.altimos.mdsd.majordomo.impl;

import de.altimos.mdsd.majordomo.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class MajordomoFactoryImpl extends EFactoryImpl implements MajordomoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MajordomoFactory init() {
		try {
			MajordomoFactory theMajordomoFactory = (MajordomoFactory)EPackage.Registry.INSTANCE.getEFactory(MajordomoPackage.eNS_URI);
			if (theMajordomoFactory != null) {
				return theMajordomoFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MajordomoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MajordomoFactoryImpl() {
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
			case MajordomoPackage.MAJORDOMO: return createMajordomo();
			case MajordomoPackage.HOUSE: return createHouse();
			case MajordomoPackage.ROOM: return createRoom();
			case MajordomoPackage.RULE: return createRule();
			case MajordomoPackage.LIGHT_SENSOR: return createLightSensor();
			case MajordomoPackage.TEMPERATURE_SENSOR: return createTemperatureSensor();
			case MajordomoPackage.RAIN_SENSOR: return createRainSensor();
			case MajordomoPackage.SWITCH_SENSOR: return createSwitchSensor();
			case MajordomoPackage.NUMBER_SENSOR: return createNumberSensor();
			case MajordomoPackage.CLOCK_SENSOR: return createClockSensor();
			case MajordomoPackage.LAMP_ACTOR: return createLampActor();
			case MajordomoPackage.ROLLER_ACTOR: return createRollerActor();
			case MajordomoPackage.ROOF_WINDOW_ACTOR: return createRoofWindowActor();
			case MajordomoPackage.BOILER_ACTOR: return createBoilerActor();
			case MajordomoPackage.RADIATOR_ACTOR: return createRadiatorActor();
			case MajordomoPackage.FLOAT_ACTION: return createFloatAction();
			case MajordomoPackage.BOOLEAN_ACTION: return createBooleanAction();
			case MajordomoPackage.COFFEE_ACTOR: return createCoffeeActor();
			case MajordomoPackage.NOT_OPERATION: return createNotOperation();
			case MajordomoPackage.COMPARE_OPERATION: return createCompareOperation();
			case MajordomoPackage.BOOLEAN_SENSOR_STATEMENT: return createBooleanSensorStatement();
			case MajordomoPackage.CONSTANT_VALUE: return createConstantValue();
			case MajordomoPackage.SENSOR_VALUE: return createSensorValue();
			case MajordomoPackage.STATEMENT_REFERENCE: return createStatementReference();
			case MajordomoPackage.PROGRAM: return createProgram();
			case MajordomoPackage.PREPARED_STATEMENT: return createPreparedStatement();
			case MajordomoPackage.PREPARED_ACTION_SET: return createPreparedActionSet();
			case MajordomoPackage.ACTION_SET_REFERENCE: return createActionSetReference();
			case MajordomoPackage.BINARY_AND_OPERATION: return createBinaryAndOperation();
			case MajordomoPackage.BINARY_OR_OPERATION: return createBinaryOrOperation();
			case MajordomoPackage.PREPARED_VALUE: return createPreparedValue();
			case MajordomoPackage.VALUE_REFERENCE: return createValueReference();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MajordomoPackage.COMPARATOR:
				return createComparatorFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MajordomoPackage.COMPARATOR:
				return convertComparatorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Majordomo createMajordomo() {
		MajordomoImpl majordomo = new MajordomoImpl();
		return majordomo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public House createHouse() {
		HouseImpl house = new HouseImpl();
		return house;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Room createRoom() {
		RoomImpl room = new RoomImpl();
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rule createRule() {
		RuleImpl rule = new RuleImpl();
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LightSensor createLightSensor() {
		LightSensorImpl lightSensor = new LightSensorImpl();
		return lightSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemperatureSensor createTemperatureSensor() {
		TemperatureSensorImpl temperatureSensor = new TemperatureSensorImpl();
		return temperatureSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RainSensor createRainSensor() {
		RainSensorImpl rainSensor = new RainSensorImpl();
		return rainSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SwitchSensor createSwitchSensor() {
		SwitchSensorImpl switchSensor = new SwitchSensorImpl();
		return switchSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumberSensor createNumberSensor() {
		NumberSensorImpl numberSensor = new NumberSensorImpl();
		return numberSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClockSensor createClockSensor() {
		ClockSensorImpl clockSensor = new ClockSensorImpl();
		return clockSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LampActor createLampActor() {
		LampActorImpl lampActor = new LampActorImpl();
		return lampActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RollerActor createRollerActor() {
		RollerActorImpl rollerActor = new RollerActorImpl();
		return rollerActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoofWindowActor createRoofWindowActor() {
		RoofWindowActorImpl roofWindowActor = new RoofWindowActorImpl();
		return roofWindowActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoilerActor createBoilerActor() {
		BoilerActorImpl boilerActor = new BoilerActorImpl();
		return boilerActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RadiatorActor createRadiatorActor() {
		RadiatorActorImpl radiatorActor = new RadiatorActorImpl();
		return radiatorActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FloatAction createFloatAction() {
		FloatActionImpl floatAction = new FloatActionImpl();
		return floatAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanAction createBooleanAction() {
		BooleanActionImpl booleanAction = new BooleanActionImpl();
		return booleanAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoffeeActor createCoffeeActor() {
		CoffeeActorImpl coffeeActor = new CoffeeActorImpl();
		return coffeeActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotOperation createNotOperation() {
		NotOperationImpl notOperation = new NotOperationImpl();
		return notOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompareOperation createCompareOperation() {
		CompareOperationImpl compareOperation = new CompareOperationImpl();
		return compareOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanSensorStatement createBooleanSensorStatement() {
		BooleanSensorStatementImpl booleanSensorStatement = new BooleanSensorStatementImpl();
		return booleanSensorStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstantValue createConstantValue() {
		ConstantValueImpl constantValue = new ConstantValueImpl();
		return constantValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SensorValue createSensorValue() {
		SensorValueImpl sensorValue = new SensorValueImpl();
		return sensorValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatementReference createStatementReference() {
		StatementReferenceImpl statementReference = new StatementReferenceImpl();
		return statementReference;
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
	public PreparedStatement createPreparedStatement() {
		PreparedStatementImpl preparedStatement = new PreparedStatementImpl();
		return preparedStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PreparedActionSet createPreparedActionSet() {
		PreparedActionSetImpl preparedActionSet = new PreparedActionSetImpl();
		return preparedActionSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionSetReference createActionSetReference() {
		ActionSetReferenceImpl actionSetReference = new ActionSetReferenceImpl();
		return actionSetReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryAndOperation createBinaryAndOperation() {
		BinaryAndOperationImpl binaryAndOperation = new BinaryAndOperationImpl();
		return binaryAndOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryOrOperation createBinaryOrOperation() {
		BinaryOrOperationImpl binaryOrOperation = new BinaryOrOperationImpl();
		return binaryOrOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PreparedValue createPreparedValue() {
		PreparedValueImpl preparedValue = new PreparedValueImpl();
		return preparedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueReference createValueReference() {
		ValueReferenceImpl valueReference = new ValueReferenceImpl();
		return valueReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comparator createComparatorFromString(EDataType eDataType, String initialValue) {
		Comparator result = Comparator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComparatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MajordomoPackage getMajordomoPackage() {
		return (MajordomoPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MajordomoPackage getPackage() {
		return MajordomoPackage.eINSTANCE;
	}

} //MajordomoFactoryImpl

/**
 */
package House2.impl;

import House2.*;

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
public class House2FactoryImpl extends EFactoryImpl implements House2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static House2Factory init() {
		try {
			House2Factory theHouse2Factory = (House2Factory)EPackage.Registry.INSTANCE.getEFactory(House2Package.eNS_URI);
			if (theHouse2Factory != null) {
				return theHouse2Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new House2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public House2FactoryImpl() {
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
			case House2Package.HOUSE: return createHouse();
			case House2Package.ROOM: return createRoom();
			case House2Package.TEMPERATURE_SENSOR: return createTemperatureSensor();
			case House2Package.TWILIGHT_SWITCH: return createTwilightSwitch();
			case House2Package.BOILER: return createBoiler();
			case House2Package.ROLLER_BLIND: return createRollerBlind();
			case House2Package.CONTROL_RULE: return createControlRule();
			case House2Package.LESS_THAN_CONDITION: return createLessThanCondition();
			case House2Package.GREATER_THAN_CONDITION: return createGreaterThanCondition();
			case House2Package.LAMP: return createLamp();
			case House2Package.EQUAL_CONDITION: return createEqualCondition();
			case House2Package.RAIN_SENSOR: return createRainSensor();
			case House2Package.BOOLEAN_ACTION: return createBooleanAction();
			case House2Package.VALUE_ACTION: return createValueAction();
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
	public TwilightSwitch createTwilightSwitch() {
		TwilightSwitchImpl twilightSwitch = new TwilightSwitchImpl();
		return twilightSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boiler createBoiler() {
		BoilerImpl boiler = new BoilerImpl();
		return boiler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RollerBlind createRollerBlind() {
		RollerBlindImpl rollerBlind = new RollerBlindImpl();
		return rollerBlind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlRule createControlRule() {
		ControlRuleImpl controlRule = new ControlRuleImpl();
		return controlRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LessThanCondition createLessThanCondition() {
		LessThanConditionImpl lessThanCondition = new LessThanConditionImpl();
		return lessThanCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GreaterThanCondition createGreaterThanCondition() {
		GreaterThanConditionImpl greaterThanCondition = new GreaterThanConditionImpl();
		return greaterThanCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lamp createLamp() {
		LampImpl lamp = new LampImpl();
		return lamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EqualCondition createEqualCondition() {
		EqualConditionImpl equalCondition = new EqualConditionImpl();
		return equalCondition;
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
	public ValueAction createValueAction() {
		ValueActionImpl valueAction = new ValueActionImpl();
		return valueAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public House2Package getHouse2Package() {
		return (House2Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static House2Package getPackage() {
		return House2Package.eINSTANCE;
	}

} //House2FactoryImpl

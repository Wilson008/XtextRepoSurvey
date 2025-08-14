/**
 */
package majordomo.util;

import majordomo.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see majordomo.MajordomoPackage
 * @generated
 */
public class MajordomoAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MajordomoPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MajordomoAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MajordomoPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MajordomoSwitch<Adapter> modelSwitch =
		new MajordomoSwitch<Adapter>() {
			@Override
			public Adapter caseMajordomo(Majordomo object) {
				return createMajordomoAdapter();
			}
			@Override
			public Adapter caseHouse(House object) {
				return createHouseAdapter();
			}
			@Override
			public Adapter caseExtendable(Extendable object) {
				return createExtendableAdapter();
			}
			@Override
			public Adapter caseRoom(Room object) {
				return createRoomAdapter();
			}
			@Override
			public Adapter caseSensor(Sensor object) {
				return createSensorAdapter();
			}
			@Override
			public Adapter caseActor(Actor object) {
				return createActorAdapter();
			}
			@Override
			public Adapter caseRule(Rule object) {
				return createRuleAdapter();
			}
			@Override
			public Adapter caseExtension(Extension object) {
				return createExtensionAdapter();
			}
			@Override
			public Adapter caseLightSensor(LightSensor object) {
				return createLightSensorAdapter();
			}
			@Override
			public Adapter caseTemperatureSensor(TemperatureSensor object) {
				return createTemperatureSensorAdapter();
			}
			@Override
			public Adapter caseRainSensor(RainSensor object) {
				return createRainSensorAdapter();
			}
			@Override
			public Adapter caseSwitchSensor(SwitchSensor object) {
				return createSwitchSensorAdapter();
			}
			@Override
			public Adapter caseNumberSensor(NumberSensor object) {
				return createNumberSensorAdapter();
			}
			@Override
			public Adapter caseClockSensor(ClockSensor object) {
				return createClockSensorAdapter();
			}
			@Override
			public Adapter caseLampActor(LampActor object) {
				return createLampActorAdapter();
			}
			@Override
			public Adapter caseRollerActor(RollerActor object) {
				return createRollerActorAdapter();
			}
			@Override
			public Adapter caseRoofWindowActor(RoofWindowActor object) {
				return createRoofWindowActorAdapter();
			}
			@Override
			public Adapter caseBoilerActor(BoilerActor object) {
				return createBoilerActorAdapter();
			}
			@Override
			public Adapter caseRadiatorActor(RadiatorActor object) {
				return createRadiatorActorAdapter();
			}
			@Override
			public Adapter caseRoomMountable(RoomMountable object) {
				return createRoomMountableAdapter();
			}
			@Override
			public Adapter caseHouseMountable(HouseMountable object) {
				return createHouseMountableAdapter();
			}
			@Override
			public Adapter caseBooleanSensor(BooleanSensor object) {
				return createBooleanSensorAdapter();
			}
			@Override
			public Adapter caseFloatSensor(FloatSensor object) {
				return createFloatSensorAdapter();
			}
			@Override
			public Adapter caseBooleanActor(BooleanActor object) {
				return createBooleanActorAdapter();
			}
			@Override
			public Adapter caseFloatActor(FloatActor object) {
				return createFloatActorAdapter();
			}
			@Override
			public Adapter caseStatement(Statement object) {
				return createStatementAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseFloatAction(FloatAction object) {
				return createFloatActionAdapter();
			}
			@Override
			public Adapter caseBooleanAction(BooleanAction object) {
				return createBooleanActionAdapter();
			}
			@Override
			public Adapter caseCoffeeActor(CoffeeActor object) {
				return createCoffeeActorAdapter();
			}
			@Override
			public Adapter caseBinaryOperation(BinaryOperation object) {
				return createBinaryOperationAdapter();
			}
			@Override
			public Adapter caseNotOperation(NotOperation object) {
				return createNotOperationAdapter();
			}
			@Override
			public Adapter caseCompareOperation(CompareOperation object) {
				return createCompareOperationAdapter();
			}
			@Override
			public Adapter caseBooleanSensorStatement(BooleanSensorStatement object) {
				return createBooleanSensorStatementAdapter();
			}
			@Override
			public Adapter caseValueExpression(ValueExpression object) {
				return createValueExpressionAdapter();
			}
			@Override
			public Adapter caseConstantValue(ConstantValue object) {
				return createConstantValueAdapter();
			}
			@Override
			public Adapter caseSensorValue(SensorValue object) {
				return createSensorValueAdapter();
			}
			@Override
			public Adapter caseStatementReference(StatementReference object) {
				return createStatementReferenceAdapter();
			}
			@Override
			public Adapter caseProgram(Program object) {
				return createProgramAdapter();
			}
			@Override
			public Adapter casePreparedStatement(PreparedStatement object) {
				return createPreparedStatementAdapter();
			}
			@Override
			public Adapter casePreparedActionSet(PreparedActionSet object) {
				return createPreparedActionSetAdapter();
			}
			@Override
			public Adapter caseActionSetReference(ActionSetReference object) {
				return createActionSetReferenceAdapter();
			}
			@Override
			public Adapter caseBinaryAndOperation(BinaryAndOperation object) {
				return createBinaryAndOperationAdapter();
			}
			@Override
			public Adapter caseBinaryOrOperation(BinaryOrOperation object) {
				return createBinaryOrOperationAdapter();
			}
			@Override
			public Adapter casePreparedValue(PreparedValue object) {
				return createPreparedValueAdapter();
			}
			@Override
			public Adapter caseValueReference(ValueReference object) {
				return createValueReferenceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link majordomo.Majordomo <em>Majordomo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see majordomo.Majordomo
	 * @generated
	 */
	public Adapter createMajordomoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link majordomo.House <em>House</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see majordomo.House
	 * @generated
	 */
	public Adapter createHouseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link majordomo.Extendable <em>Extendable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see majordomo.Extendable
	 * @generated
	 */
	public Adapter createExtendableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link majordomo.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see majordomo.Room
	 * @generated
	 */
	public Adapter createRoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link majordomo.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see majordomo.Sensor
	 * @generated
	 */
	public Adapter createSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link majordomo.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see majordomo.Actor
	 * @generated
	 */
	public Adapter createActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link majordomo.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see majordomo.Rule
	 * @generated
	 */
	public Adapter createRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link majordomo.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see majordomo.Extension
	 * @generated
	 */
	public Adapter createExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link majordomo.LightSensor <em>Light Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see majordomo.LightSensor
	 * @generated
	 */
	public Adapter createLightSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link majordomo.TemperatureSensor <em>Temperature Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see majordomo.TemperatureSensor
	 * @generated
	 */
	public Adapter createTemperatureSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link majordomo.RainSensor <em>Rain Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see majordomo.RainSensor
	 * @generated
	 */
	public Adapter createRainSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link majordomo.SwitchSensor <em>Switch Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see majordomo.SwitchSensor
	 * @generated
	 */
	public Adapter createSwitchSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link majordomo.NumberSensor <em>Number Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see majordomo.NumberSensor
	 * @generated
	 */
	public Adapter createNumberSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link majordomo.ClockSensor <em>Clock Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see majordomo.ClockSensor
	 * @generated
	 */
	public Adapter createClockSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link majordomo.LampActor <em>Lamp Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see majordomo.LampActor
	 * @generated
	 */
	public Adapter createLampActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link majordomo.RollerActor <em>Roller Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see majordomo.RollerActor
	 * @generated
	 */
	public Adapter createRollerActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link majordomo.RoofWindowActor <em>Roof Window Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see majordomo.RoofWindowActor
	 * @generated
	 */
	public Adapter createRoofWindowActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link majordomo.BoilerActor <em>Boiler Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see majordomo.BoilerActor
	 * @generated
	 */
	public Adapter createBoilerActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link majordomo.RadiatorActor <em>Radiator Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see majordomo.RadiatorActor
	 * @generated
	 */
	public Adapter createRadiatorActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link majordomo.RoomMountable <em>Room Mountable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see majordomo.RoomMountable
	 * @generated
	 */
	public Adapter createRoomMountableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link majordomo.HouseMountable <em>House Mountable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see majordomo.HouseMountable
	 * @generated
	 */
	public Adapter createHouseMountableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link majordomo.BooleanSensor <em>Boolean Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see majordomo.BooleanSensor
	 * @generated
	 */
	public Adapter createBooleanSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link majordomo.FloatSensor <em>Float Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see majordomo.FloatSensor
	 * @generated
	 */
	public Adapter createFloatSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link majordomo.BooleanActor <em>Boolean Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see majordomo.BooleanActor
	 * @generated
	 */
	public Adapter createBooleanActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link majordomo.FloatActor <em>Float Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see majordomo.FloatActor
	 * @generated
	 */
	public Adapter createFloatActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link majordomo.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see majordomo.Statement
	 * @generated
	 */
	public Adapter createStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link majordomo.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see majordomo.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link majordomo.FloatAction <em>Float Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see majordomo.FloatAction
	 * @generated
	 */
	public Adapter createFloatActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link majordomo.BooleanAction <em>Boolean Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see majordomo.BooleanAction
	 * @generated
	 */
	public Adapter createBooleanActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link majordomo.CoffeeActor <em>Coffee Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see majordomo.CoffeeActor
	 * @generated
	 */
	public Adapter createCoffeeActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link majordomo.BinaryOperation <em>Binary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see majordomo.BinaryOperation
	 * @generated
	 */
	public Adapter createBinaryOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link majordomo.NotOperation <em>Not Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see majordomo.NotOperation
	 * @generated
	 */
	public Adapter createNotOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link majordomo.CompareOperation <em>Compare Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see majordomo.CompareOperation
	 * @generated
	 */
	public Adapter createCompareOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link majordomo.BooleanSensorStatement <em>Boolean Sensor Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see majordomo.BooleanSensorStatement
	 * @generated
	 */
	public Adapter createBooleanSensorStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link majordomo.ValueExpression <em>Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see majordomo.ValueExpression
	 * @generated
	 */
	public Adapter createValueExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link majordomo.ConstantValue <em>Constant Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see majordomo.ConstantValue
	 * @generated
	 */
	public Adapter createConstantValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link majordomo.SensorValue <em>Sensor Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see majordomo.SensorValue
	 * @generated
	 */
	public Adapter createSensorValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link majordomo.StatementReference <em>Statement Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see majordomo.StatementReference
	 * @generated
	 */
	public Adapter createStatementReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link majordomo.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see majordomo.Program
	 * @generated
	 */
	public Adapter createProgramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link majordomo.PreparedStatement <em>Prepared Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see majordomo.PreparedStatement
	 * @generated
	 */
	public Adapter createPreparedStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link majordomo.PreparedActionSet <em>Prepared Action Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see majordomo.PreparedActionSet
	 * @generated
	 */
	public Adapter createPreparedActionSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link majordomo.ActionSetReference <em>Action Set Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see majordomo.ActionSetReference
	 * @generated
	 */
	public Adapter createActionSetReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link majordomo.BinaryAndOperation <em>Binary And Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see majordomo.BinaryAndOperation
	 * @generated
	 */
	public Adapter createBinaryAndOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link majordomo.BinaryOrOperation <em>Binary Or Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see majordomo.BinaryOrOperation
	 * @generated
	 */
	public Adapter createBinaryOrOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link majordomo.PreparedValue <em>Prepared Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see majordomo.PreparedValue
	 * @generated
	 */
	public Adapter createPreparedValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link majordomo.ValueReference <em>Value Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see majordomo.ValueReference
	 * @generated
	 */
	public Adapter createValueReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MajordomoAdapterFactory

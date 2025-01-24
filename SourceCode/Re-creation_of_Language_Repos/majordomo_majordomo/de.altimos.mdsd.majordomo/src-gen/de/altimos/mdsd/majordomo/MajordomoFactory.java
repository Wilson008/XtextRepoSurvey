/**
 */
package de.altimos.mdsd.majordomo;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.altimos.mdsd.majordomo.MajordomoPackage
 * @generated
 */
public interface MajordomoFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MajordomoFactory eINSTANCE = de.altimos.mdsd.majordomo.impl.MajordomoFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Majordomo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Majordomo</em>'.
	 * @generated
	 */
	Majordomo createMajordomo();

	/**
	 * Returns a new object of class '<em>House</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>House</em>'.
	 * @generated
	 */
	House createHouse();

	/**
	 * Returns a new object of class '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room</em>'.
	 * @generated
	 */
	Room createRoom();

	/**
	 * Returns a new object of class '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule</em>'.
	 * @generated
	 */
	Rule createRule();

	/**
	 * Returns a new object of class '<em>Light Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Light Sensor</em>'.
	 * @generated
	 */
	LightSensor createLightSensor();

	/**
	 * Returns a new object of class '<em>Temperature Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Temperature Sensor</em>'.
	 * @generated
	 */
	TemperatureSensor createTemperatureSensor();

	/**
	 * Returns a new object of class '<em>Rain Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rain Sensor</em>'.
	 * @generated
	 */
	RainSensor createRainSensor();

	/**
	 * Returns a new object of class '<em>Switch Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Switch Sensor</em>'.
	 * @generated
	 */
	SwitchSensor createSwitchSensor();

	/**
	 * Returns a new object of class '<em>Number Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Sensor</em>'.
	 * @generated
	 */
	NumberSensor createNumberSensor();

	/**
	 * Returns a new object of class '<em>Clock Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clock Sensor</em>'.
	 * @generated
	 */
	ClockSensor createClockSensor();

	/**
	 * Returns a new object of class '<em>Lamp Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lamp Actor</em>'.
	 * @generated
	 */
	LampActor createLampActor();

	/**
	 * Returns a new object of class '<em>Roller Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Roller Actor</em>'.
	 * @generated
	 */
	RollerActor createRollerActor();

	/**
	 * Returns a new object of class '<em>Roof Window Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Roof Window Actor</em>'.
	 * @generated
	 */
	RoofWindowActor createRoofWindowActor();

	/**
	 * Returns a new object of class '<em>Boiler Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boiler Actor</em>'.
	 * @generated
	 */
	BoilerActor createBoilerActor();

	/**
	 * Returns a new object of class '<em>Radiator Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Radiator Actor</em>'.
	 * @generated
	 */
	RadiatorActor createRadiatorActor();

	/**
	 * Returns a new object of class '<em>Float Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Float Action</em>'.
	 * @generated
	 */
	FloatAction createFloatAction();

	/**
	 * Returns a new object of class '<em>Boolean Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Action</em>'.
	 * @generated
	 */
	BooleanAction createBooleanAction();

	/**
	 * Returns a new object of class '<em>Coffee Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coffee Actor</em>'.
	 * @generated
	 */
	CoffeeActor createCoffeeActor();

	/**
	 * Returns a new object of class '<em>Not Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Operation</em>'.
	 * @generated
	 */
	NotOperation createNotOperation();

	/**
	 * Returns a new object of class '<em>Compare Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compare Operation</em>'.
	 * @generated
	 */
	CompareOperation createCompareOperation();

	/**
	 * Returns a new object of class '<em>Boolean Sensor Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Sensor Statement</em>'.
	 * @generated
	 */
	BooleanSensorStatement createBooleanSensorStatement();

	/**
	 * Returns a new object of class '<em>Constant Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constant Value</em>'.
	 * @generated
	 */
	ConstantValue createConstantValue();

	/**
	 * Returns a new object of class '<em>Sensor Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensor Value</em>'.
	 * @generated
	 */
	SensorValue createSensorValue();

	/**
	 * Returns a new object of class '<em>Statement Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statement Reference</em>'.
	 * @generated
	 */
	StatementReference createStatementReference();

	/**
	 * Returns a new object of class '<em>Program</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Program</em>'.
	 * @generated
	 */
	Program createProgram();

	/**
	 * Returns a new object of class '<em>Prepared Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prepared Statement</em>'.
	 * @generated
	 */
	PreparedStatement createPreparedStatement();

	/**
	 * Returns a new object of class '<em>Prepared Action Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prepared Action Set</em>'.
	 * @generated
	 */
	PreparedActionSet createPreparedActionSet();

	/**
	 * Returns a new object of class '<em>Action Set Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Set Reference</em>'.
	 * @generated
	 */
	ActionSetReference createActionSetReference();

	/**
	 * Returns a new object of class '<em>Binary And Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary And Operation</em>'.
	 * @generated
	 */
	BinaryAndOperation createBinaryAndOperation();

	/**
	 * Returns a new object of class '<em>Binary Or Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Or Operation</em>'.
	 * @generated
	 */
	BinaryOrOperation createBinaryOrOperation();

	/**
	 * Returns a new object of class '<em>Prepared Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prepared Value</em>'.
	 * @generated
	 */
	PreparedValue createPreparedValue();

	/**
	 * Returns a new object of class '<em>Value Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Reference</em>'.
	 * @generated
	 */
	ValueReference createValueReference();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MajordomoPackage getMajordomoPackage();

} //MajordomoFactory

/**
 */
package House2;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see House2.House2Package
 * @generated
 */
public interface House2Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	House2Factory eINSTANCE = House2.impl.House2FactoryImpl.init();

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
	 * Returns a new object of class '<em>Temperature Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Temperature Sensor</em>'.
	 * @generated
	 */
	TemperatureSensor createTemperatureSensor();

	/**
	 * Returns a new object of class '<em>Twilight Switch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Twilight Switch</em>'.
	 * @generated
	 */
	TwilightSwitch createTwilightSwitch();

	/**
	 * Returns a new object of class '<em>Boiler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boiler</em>'.
	 * @generated
	 */
	Boiler createBoiler();

	/**
	 * Returns a new object of class '<em>Roller Blind</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Roller Blind</em>'.
	 * @generated
	 */
	RollerBlind createRollerBlind();

	/**
	 * Returns a new object of class '<em>Control Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Rule</em>'.
	 * @generated
	 */
	ControlRule createControlRule();

	/**
	 * Returns a new object of class '<em>Less Than Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Less Than Condition</em>'.
	 * @generated
	 */
	LessThanCondition createLessThanCondition();

	/**
	 * Returns a new object of class '<em>Greater Than Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Greater Than Condition</em>'.
	 * @generated
	 */
	GreaterThanCondition createGreaterThanCondition();

	/**
	 * Returns a new object of class '<em>Lamp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lamp</em>'.
	 * @generated
	 */
	Lamp createLamp();

	/**
	 * Returns a new object of class '<em>Equal Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equal Condition</em>'.
	 * @generated
	 */
	EqualCondition createEqualCondition();

	/**
	 * Returns a new object of class '<em>Rain Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rain Sensor</em>'.
	 * @generated
	 */
	RainSensor createRainSensor();

	/**
	 * Returns a new object of class '<em>Boolean Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Action</em>'.
	 * @generated
	 */
	BooleanAction createBooleanAction();

	/**
	 * Returns a new object of class '<em>Value Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Action</em>'.
	 * @generated
	 */
	ValueAction createValueAction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	House2Package getHouse2Package();

} //House2Factory

/**
 */
package de.altimos.mdsd.majordomo;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.altimos.mdsd.majordomo.MajordomoFactory
 * @model kind="package"
 *        annotation="ComparatorDescription GT:\040Greater\040than='null' GE:\040Greater\040or\040Equal\040than='null' LT:\040Less\040than='null' LE:\040Less\040or\040Equal\040than='null'"
 * @generated
 */
public interface MajordomoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "majordomo";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mdsd.altimos.de/majordomo/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "majordomo";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MajordomoPackage eINSTANCE = de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.MajordomoImpl <em>Majordomo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getMajordomo()
	 * @generated
	 */
	int MAJORDOMO = 0;

	/**
	 * The feature id for the '<em><b>House</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAJORDOMO__HOUSE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAJORDOMO__NAME = 1;

	/**
	 * The feature id for the '<em><b>Rooms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAJORDOMO__ROOMS = 2;

	/**
	 * The feature id for the '<em><b>Program</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAJORDOMO__PROGRAM = 3;

	/**
	 * The number of structural features of the '<em>Majordomo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAJORDOMO_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.Extendable <em>Extendable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.Extendable
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getExtendable()
	 * @generated
	 */
	int EXTENDABLE = 2;

	/**
	 * The feature id for the '<em><b>Sensors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDABLE__SENSORS = 0;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDABLE__ACTORS = 1;

	/**
	 * The number of structural features of the '<em>Extendable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.HouseImpl <em>House</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.HouseImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getHouse()
	 * @generated
	 */
	int HOUSE = 1;

	/**
	 * The feature id for the '<em><b>Sensors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__SENSORS = EXTENDABLE__SENSORS;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__ACTORS = EXTENDABLE__ACTORS;

	/**
	 * The number of structural features of the '<em>House</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_FEATURE_COUNT = EXTENDABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.RoomImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 3;

	/**
	 * The feature id for the '<em><b>Sensors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__SENSORS = EXTENDABLE__SENSORS;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__ACTORS = EXTENDABLE__ACTORS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__NAME = EXTENDABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = EXTENDABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.ExtensionImpl <em>Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.ExtensionImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getExtension()
	 * @generated
	 */
	int EXTENSION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.SensorImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NAME = EXTENSION__NAME;

	/**
	 * The feature id for the '<em><b>Ctx</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__CTX = EXTENSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = EXTENSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.ActorImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAME = EXTENSION__NAME;

	/**
	 * The feature id for the '<em><b>Ctx</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__CTX = EXTENSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = EXTENSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.RuleImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 6;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__STATEMENT = 0;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__ACTIONS = 1;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.HouseMountable <em>House Mountable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.HouseMountable
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getHouseMountable()
	 * @generated
	 */
	int HOUSE_MOUNTABLE = 20;

	/**
	 * The number of structural features of the '<em>House Mountable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_MOUNTABLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.LightSensorImpl <em>Light Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.LightSensorImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getLightSensor()
	 * @generated
	 */
	int LIGHT_SENSOR = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SENSOR__NAME = HOUSE_MOUNTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ctx</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SENSOR__CTX = HOUSE_MOUNTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Light Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SENSOR_FEATURE_COUNT = HOUSE_MOUNTABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.TemperatureSensorImpl <em>Temperature Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.TemperatureSensorImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getTemperatureSensor()
	 * @generated
	 */
	int TEMPERATURE_SENSOR = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURE_SENSOR__NAME = HOUSE_MOUNTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ctx</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURE_SENSOR__CTX = HOUSE_MOUNTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Temperature Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURE_SENSOR_FEATURE_COUNT = HOUSE_MOUNTABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.RainSensorImpl <em>Rain Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.RainSensorImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getRainSensor()
	 * @generated
	 */
	int RAIN_SENSOR = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIN_SENSOR__NAME = HOUSE_MOUNTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ctx</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIN_SENSOR__CTX = HOUSE_MOUNTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rain Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIN_SENSOR_FEATURE_COUNT = HOUSE_MOUNTABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.RoomMountable <em>Room Mountable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.RoomMountable
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getRoomMountable()
	 * @generated
	 */
	int ROOM_MOUNTABLE = 19;

	/**
	 * The number of structural features of the '<em>Room Mountable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MOUNTABLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.SwitchSensorImpl <em>Switch Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.SwitchSensorImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getSwitchSensor()
	 * @generated
	 */
	int SWITCH_SENSOR = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_SENSOR__NAME = ROOM_MOUNTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ctx</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_SENSOR__CTX = ROOM_MOUNTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Switch Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_SENSOR_FEATURE_COUNT = ROOM_MOUNTABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.NumberSensorImpl <em>Number Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.NumberSensorImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getNumberSensor()
	 * @generated
	 */
	int NUMBER_SENSOR = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SENSOR__NAME = ROOM_MOUNTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ctx</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SENSOR__CTX = ROOM_MOUNTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Number Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SENSOR_FEATURE_COUNT = ROOM_MOUNTABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.ClockSensorImpl <em>Clock Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.ClockSensorImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getClockSensor()
	 * @generated
	 */
	int CLOCK_SENSOR = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_SENSOR__NAME = HOUSE_MOUNTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ctx</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_SENSOR__CTX = HOUSE_MOUNTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Clock Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_SENSOR_FEATURE_COUNT = HOUSE_MOUNTABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.LampActorImpl <em>Lamp Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.LampActorImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getLampActor()
	 * @generated
	 */
	int LAMP_ACTOR = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMP_ACTOR__NAME = HOUSE_MOUNTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ctx</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMP_ACTOR__CTX = HOUSE_MOUNTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Lamp Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMP_ACTOR_FEATURE_COUNT = HOUSE_MOUNTABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.RollerActorImpl <em>Roller Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.RollerActorImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getRollerActor()
	 * @generated
	 */
	int ROLLER_ACTOR = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLER_ACTOR__NAME = ROOM_MOUNTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ctx</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLER_ACTOR__CTX = ROOM_MOUNTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Roller Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLER_ACTOR_FEATURE_COUNT = ROOM_MOUNTABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.RoofWindowActorImpl <em>Roof Window Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.RoofWindowActorImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getRoofWindowActor()
	 * @generated
	 */
	int ROOF_WINDOW_ACTOR = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOF_WINDOW_ACTOR__NAME = ROOM_MOUNTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ctx</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOF_WINDOW_ACTOR__CTX = ROOM_MOUNTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Roof Window Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOF_WINDOW_ACTOR_FEATURE_COUNT = ROOM_MOUNTABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.BoilerActorImpl <em>Boiler Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.BoilerActorImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getBoilerActor()
	 * @generated
	 */
	int BOILER_ACTOR = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOILER_ACTOR__NAME = HOUSE_MOUNTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ctx</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOILER_ACTOR__CTX = HOUSE_MOUNTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Boiler Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOILER_ACTOR_FEATURE_COUNT = HOUSE_MOUNTABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.RadiatorActorImpl <em>Radiator Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.RadiatorActorImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getRadiatorActor()
	 * @generated
	 */
	int RADIATOR_ACTOR = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIATOR_ACTOR__NAME = ROOM_MOUNTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ctx</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIATOR_ACTOR__CTX = ROOM_MOUNTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Radiator Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIATOR_ACTOR_FEATURE_COUNT = ROOM_MOUNTABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.BooleanSensorImpl <em>Boolean Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.BooleanSensorImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getBooleanSensor()
	 * @generated
	 */
	int BOOLEAN_SENSOR = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SENSOR__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Ctx</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SENSOR__CTX = SENSOR__CTX;

	/**
	 * The number of structural features of the '<em>Boolean Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.FloatSensorImpl <em>Float Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.FloatSensorImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getFloatSensor()
	 * @generated
	 */
	int FLOAT_SENSOR = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_SENSOR__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Ctx</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_SENSOR__CTX = SENSOR__CTX;

	/**
	 * The number of structural features of the '<em>Float Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.BooleanActorImpl <em>Boolean Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.BooleanActorImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getBooleanActor()
	 * @generated
	 */
	int BOOLEAN_ACTOR = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ACTOR__NAME = ACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Ctx</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ACTOR__CTX = ACTOR__CTX;

	/**
	 * The number of structural features of the '<em>Boolean Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ACTOR_FEATURE_COUNT = ACTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.FloatActorImpl <em>Float Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.FloatActorImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getFloatActor()
	 * @generated
	 */
	int FLOAT_ACTOR = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_ACTOR__NAME = ACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Ctx</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_ACTOR__CTX = ACTOR__CTX;

	/**
	 * The number of structural features of the '<em>Float Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_ACTOR_FEATURE_COUNT = ACTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.Statement <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.Statement
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 25;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.Action <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.Action
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 26;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.FloatActionImpl <em>Float Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.FloatActionImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getFloatAction()
	 * @generated
	 */
	int FLOAT_ACTION = 27;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_ACTION__ACTOR = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_ACTION__VALUE = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Float Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.BooleanActionImpl <em>Boolean Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.BooleanActionImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getBooleanAction()
	 * @generated
	 */
	int BOOLEAN_ACTION = 28;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ACTION__ACTOR = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ACTION__VALUE = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Boolean Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.CoffeeActorImpl <em>Coffee Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.CoffeeActorImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getCoffeeActor()
	 * @generated
	 */
	int COFFEE_ACTOR = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COFFEE_ACTOR__NAME = ROOM_MOUNTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ctx</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COFFEE_ACTOR__CTX = ROOM_MOUNTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Coffee Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COFFEE_ACTOR_FEATURE_COUNT = ROOM_MOUNTABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.BinaryOperationImpl <em>Binary Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.BinaryOperationImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getBinaryOperation()
	 * @generated
	 */
	int BINARY_OPERATION = 30;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION__LEFT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION__RIGHT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.NotOperationImpl <em>Not Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.NotOperationImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getNotOperation()
	 * @generated
	 */
	int NOT_OPERATION = 31;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATION__STATEMENT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.CompareOperationImpl <em>Compare Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.CompareOperationImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getCompareOperation()
	 * @generated
	 */
	int COMPARE_OPERATION = 32;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE_OPERATION__COMPARATOR = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE_OPERATION__LEFT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE_OPERATION__RIGHT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Compare Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE_OPERATION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.BooleanSensorStatementImpl <em>Boolean Sensor Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.BooleanSensorStatementImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getBooleanSensorStatement()
	 * @generated
	 */
	int BOOLEAN_SENSOR_STATEMENT = 33;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SENSOR_STATEMENT__SENSOR = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Sensor Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SENSOR_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.ValueExpression <em>Value Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.ValueExpression
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getValueExpression()
	 * @generated
	 */
	int VALUE_EXPRESSION = 34;

	/**
	 * The number of structural features of the '<em>Value Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.ConstantValueImpl <em>Constant Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.ConstantValueImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getConstantValue()
	 * @generated
	 */
	int CONSTANT_VALUE = 35;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_VALUE__VALUE = VALUE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constant Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_VALUE_FEATURE_COUNT = VALUE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.SensorValueImpl <em>Sensor Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.SensorValueImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getSensorValue()
	 * @generated
	 */
	int SENSOR_VALUE = 36;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_VALUE__SENSOR = VALUE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sensor Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_VALUE_FEATURE_COUNT = VALUE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.StatementReferenceImpl <em>Statement Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.StatementReferenceImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getStatementReference()
	 * @generated
	 */
	int STATEMENT_REFERENCE = 37;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_REFERENCE__REF = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Statement Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_REFERENCE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.ProgramImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 38;

	/**
	 * The feature id for the '<em><b>Constants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__CONSTANTS = 0;

	/**
	 * The feature id for the '<em><b>Prepared Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__PREPARED_STATEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Prepared Action Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__PREPARED_ACTION_SETS = 2;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__RULES = 3;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.PreparedStatementImpl <em>Prepared Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.PreparedStatementImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getPreparedStatement()
	 * @generated
	 */
	int PREPARED_STATEMENT = 39;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPARED_STATEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Ctx</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPARED_STATEMENT__CTX = 1;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPARED_STATEMENT__STATEMENT = 2;

	/**
	 * The number of structural features of the '<em>Prepared Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPARED_STATEMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.PreparedActionSetImpl <em>Prepared Action Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.PreparedActionSetImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getPreparedActionSet()
	 * @generated
	 */
	int PREPARED_ACTION_SET = 40;

	/**
	 * The feature id for the '<em><b>Ctx</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPARED_ACTION_SET__CTX = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPARED_ACTION_SET__NAME = 1;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPARED_ACTION_SET__ACTIONS = 2;

	/**
	 * The number of structural features of the '<em>Prepared Action Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPARED_ACTION_SET_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.ActionSetReferenceImpl <em>Action Set Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.ActionSetReferenceImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getActionSetReference()
	 * @generated
	 */
	int ACTION_SET_REFERENCE = 41;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SET_REFERENCE__REF = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action Set Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SET_REFERENCE_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.BinaryAndOperationImpl <em>Binary And Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.BinaryAndOperationImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getBinaryAndOperation()
	 * @generated
	 */
	int BINARY_AND_OPERATION = 42;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_AND_OPERATION__LEFT = BINARY_OPERATION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_AND_OPERATION__RIGHT = BINARY_OPERATION__RIGHT;

	/**
	 * The number of structural features of the '<em>Binary And Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_AND_OPERATION_FEATURE_COUNT = BINARY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.BinaryOrOperationImpl <em>Binary Or Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.BinaryOrOperationImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getBinaryOrOperation()
	 * @generated
	 */
	int BINARY_OR_OPERATION = 43;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OR_OPERATION__LEFT = BINARY_OPERATION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OR_OPERATION__RIGHT = BINARY_OPERATION__RIGHT;

	/**
	 * The number of structural features of the '<em>Binary Or Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OR_OPERATION_FEATURE_COUNT = BINARY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.PreparedValueImpl <em>Prepared Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.PreparedValueImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getPreparedValue()
	 * @generated
	 */
	int PREPARED_VALUE = 44;

	/**
	 * The feature id for the '<em><b>Ctx</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPARED_VALUE__CTX = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPARED_VALUE__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPARED_VALUE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Prepared Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPARED_VALUE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.ValueReferenceImpl <em>Value Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.ValueReferenceImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getValueReference()
	 * @generated
	 */
	int VALUE_REFERENCE = 45;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_REFERENCE__REF = VALUE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Value Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_REFERENCE_FEATURE_COUNT = VALUE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.Comparator <em>Comparator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.Comparator
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getComparator()
	 * @generated
	 */
	int COMPARATOR = 46;


	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.Majordomo <em>Majordomo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Majordomo</em>'.
	 * @see de.altimos.mdsd.majordomo.Majordomo
	 * @generated
	 */
	EClass getMajordomo();

	/**
	 * Returns the meta object for the containment reference '{@link de.altimos.mdsd.majordomo.Majordomo#getHouse <em>House</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>House</em>'.
	 * @see de.altimos.mdsd.majordomo.Majordomo#getHouse()
	 * @see #getMajordomo()
	 * @generated
	 */
	EReference getMajordomo_House();

	/**
	 * Returns the meta object for the attribute '{@link de.altimos.mdsd.majordomo.Majordomo#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.altimos.mdsd.majordomo.Majordomo#getName()
	 * @see #getMajordomo()
	 * @generated
	 */
	EAttribute getMajordomo_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link de.altimos.mdsd.majordomo.Majordomo#getRooms <em>Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rooms</em>'.
	 * @see de.altimos.mdsd.majordomo.Majordomo#getRooms()
	 * @see #getMajordomo()
	 * @generated
	 */
	EReference getMajordomo_Rooms();

	/**
	 * Returns the meta object for the containment reference '{@link de.altimos.mdsd.majordomo.Majordomo#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program</em>'.
	 * @see de.altimos.mdsd.majordomo.Majordomo#getProgram()
	 * @see #getMajordomo()
	 * @generated
	 */
	EReference getMajordomo_Program();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.House <em>House</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>House</em>'.
	 * @see de.altimos.mdsd.majordomo.House
	 * @generated
	 */
	EClass getHouse();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.Extendable <em>Extendable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extendable</em>'.
	 * @see de.altimos.mdsd.majordomo.Extendable
	 * @generated
	 */
	EClass getExtendable();

	/**
	 * Returns the meta object for the containment reference list '{@link de.altimos.mdsd.majordomo.Extendable#getSensors <em>Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sensors</em>'.
	 * @see de.altimos.mdsd.majordomo.Extendable#getSensors()
	 * @see #getExtendable()
	 * @generated
	 */
	EReference getExtendable_Sensors();

	/**
	 * Returns the meta object for the containment reference list '{@link de.altimos.mdsd.majordomo.Extendable#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actors</em>'.
	 * @see de.altimos.mdsd.majordomo.Extendable#getActors()
	 * @see #getExtendable()
	 * @generated
	 */
	EReference getExtendable_Actors();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see de.altimos.mdsd.majordomo.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the attribute '{@link de.altimos.mdsd.majordomo.Room#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.altimos.mdsd.majordomo.Room#getName()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Name();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see de.altimos.mdsd.majordomo.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for the container reference '{@link de.altimos.mdsd.majordomo.Sensor#getCtx <em>Ctx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Ctx</em>'.
	 * @see de.altimos.mdsd.majordomo.Sensor#getCtx()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_Ctx();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see de.altimos.mdsd.majordomo.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the container reference '{@link de.altimos.mdsd.majordomo.Actor#getCtx <em>Ctx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Ctx</em>'.
	 * @see de.altimos.mdsd.majordomo.Actor#getCtx()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_Ctx();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see de.altimos.mdsd.majordomo.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the containment reference '{@link de.altimos.mdsd.majordomo.Rule#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statement</em>'.
	 * @see de.altimos.mdsd.majordomo.Rule#getStatement()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Statement();

	/**
	 * Returns the meta object for the containment reference list '{@link de.altimos.mdsd.majordomo.Rule#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see de.altimos.mdsd.majordomo.Rule#getActions()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Actions();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension</em>'.
	 * @see de.altimos.mdsd.majordomo.Extension
	 * @generated
	 */
	EClass getExtension();

	/**
	 * Returns the meta object for the attribute '{@link de.altimos.mdsd.majordomo.Extension#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.altimos.mdsd.majordomo.Extension#getName()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_Name();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.LightSensor <em>Light Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Light Sensor</em>'.
	 * @see de.altimos.mdsd.majordomo.LightSensor
	 * @generated
	 */
	EClass getLightSensor();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.TemperatureSensor <em>Temperature Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temperature Sensor</em>'.
	 * @see de.altimos.mdsd.majordomo.TemperatureSensor
	 * @generated
	 */
	EClass getTemperatureSensor();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.RainSensor <em>Rain Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rain Sensor</em>'.
	 * @see de.altimos.mdsd.majordomo.RainSensor
	 * @generated
	 */
	EClass getRainSensor();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.SwitchSensor <em>Switch Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Sensor</em>'.
	 * @see de.altimos.mdsd.majordomo.SwitchSensor
	 * @generated
	 */
	EClass getSwitchSensor();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.NumberSensor <em>Number Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Sensor</em>'.
	 * @see de.altimos.mdsd.majordomo.NumberSensor
	 * @generated
	 */
	EClass getNumberSensor();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.ClockSensor <em>Clock Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clock Sensor</em>'.
	 * @see de.altimos.mdsd.majordomo.ClockSensor
	 * @generated
	 */
	EClass getClockSensor();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.LampActor <em>Lamp Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lamp Actor</em>'.
	 * @see de.altimos.mdsd.majordomo.LampActor
	 * @generated
	 */
	EClass getLampActor();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.RollerActor <em>Roller Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Roller Actor</em>'.
	 * @see de.altimos.mdsd.majordomo.RollerActor
	 * @generated
	 */
	EClass getRollerActor();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.RoofWindowActor <em>Roof Window Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Roof Window Actor</em>'.
	 * @see de.altimos.mdsd.majordomo.RoofWindowActor
	 * @generated
	 */
	EClass getRoofWindowActor();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.BoilerActor <em>Boiler Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boiler Actor</em>'.
	 * @see de.altimos.mdsd.majordomo.BoilerActor
	 * @generated
	 */
	EClass getBoilerActor();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.RadiatorActor <em>Radiator Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Radiator Actor</em>'.
	 * @see de.altimos.mdsd.majordomo.RadiatorActor
	 * @generated
	 */
	EClass getRadiatorActor();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.RoomMountable <em>Room Mountable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Mountable</em>'.
	 * @see de.altimos.mdsd.majordomo.RoomMountable
	 * @generated
	 */
	EClass getRoomMountable();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.HouseMountable <em>House Mountable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>House Mountable</em>'.
	 * @see de.altimos.mdsd.majordomo.HouseMountable
	 * @generated
	 */
	EClass getHouseMountable();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.BooleanSensor <em>Boolean Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Sensor</em>'.
	 * @see de.altimos.mdsd.majordomo.BooleanSensor
	 * @generated
	 */
	EClass getBooleanSensor();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.FloatSensor <em>Float Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float Sensor</em>'.
	 * @see de.altimos.mdsd.majordomo.FloatSensor
	 * @generated
	 */
	EClass getFloatSensor();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.BooleanActor <em>Boolean Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Actor</em>'.
	 * @see de.altimos.mdsd.majordomo.BooleanActor
	 * @generated
	 */
	EClass getBooleanActor();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.FloatActor <em>Float Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float Actor</em>'.
	 * @see de.altimos.mdsd.majordomo.FloatActor
	 * @generated
	 */
	EClass getFloatActor();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see de.altimos.mdsd.majordomo.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see de.altimos.mdsd.majordomo.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.FloatAction <em>Float Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float Action</em>'.
	 * @see de.altimos.mdsd.majordomo.FloatAction
	 * @generated
	 */
	EClass getFloatAction();

	/**
	 * Returns the meta object for the reference '{@link de.altimos.mdsd.majordomo.FloatAction#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actor</em>'.
	 * @see de.altimos.mdsd.majordomo.FloatAction#getActor()
	 * @see #getFloatAction()
	 * @generated
	 */
	EReference getFloatAction_Actor();

	/**
	 * Returns the meta object for the attribute '{@link de.altimos.mdsd.majordomo.FloatAction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.altimos.mdsd.majordomo.FloatAction#getValue()
	 * @see #getFloatAction()
	 * @generated
	 */
	EAttribute getFloatAction_Value();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.BooleanAction <em>Boolean Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Action</em>'.
	 * @see de.altimos.mdsd.majordomo.BooleanAction
	 * @generated
	 */
	EClass getBooleanAction();

	/**
	 * Returns the meta object for the reference '{@link de.altimos.mdsd.majordomo.BooleanAction#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actor</em>'.
	 * @see de.altimos.mdsd.majordomo.BooleanAction#getActor()
	 * @see #getBooleanAction()
	 * @generated
	 */
	EReference getBooleanAction_Actor();

	/**
	 * Returns the meta object for the attribute '{@link de.altimos.mdsd.majordomo.BooleanAction#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.altimos.mdsd.majordomo.BooleanAction#isValue()
	 * @see #getBooleanAction()
	 * @generated
	 */
	EAttribute getBooleanAction_Value();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.CoffeeActor <em>Coffee Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coffee Actor</em>'.
	 * @see de.altimos.mdsd.majordomo.CoffeeActor
	 * @generated
	 */
	EClass getCoffeeActor();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.BinaryOperation <em>Binary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Operation</em>'.
	 * @see de.altimos.mdsd.majordomo.BinaryOperation
	 * @generated
	 */
	EClass getBinaryOperation();

	/**
	 * Returns the meta object for the containment reference '{@link de.altimos.mdsd.majordomo.BinaryOperation#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see de.altimos.mdsd.majordomo.BinaryOperation#getLeft()
	 * @see #getBinaryOperation()
	 * @generated
	 */
	EReference getBinaryOperation_Left();

	/**
	 * Returns the meta object for the containment reference '{@link de.altimos.mdsd.majordomo.BinaryOperation#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see de.altimos.mdsd.majordomo.BinaryOperation#getRight()
	 * @see #getBinaryOperation()
	 * @generated
	 */
	EReference getBinaryOperation_Right();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.NotOperation <em>Not Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Operation</em>'.
	 * @see de.altimos.mdsd.majordomo.NotOperation
	 * @generated
	 */
	EClass getNotOperation();

	/**
	 * Returns the meta object for the containment reference '{@link de.altimos.mdsd.majordomo.NotOperation#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statement</em>'.
	 * @see de.altimos.mdsd.majordomo.NotOperation#getStatement()
	 * @see #getNotOperation()
	 * @generated
	 */
	EReference getNotOperation_Statement();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.CompareOperation <em>Compare Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compare Operation</em>'.
	 * @see de.altimos.mdsd.majordomo.CompareOperation
	 * @generated
	 */
	EClass getCompareOperation();

	/**
	 * Returns the meta object for the attribute '{@link de.altimos.mdsd.majordomo.CompareOperation#getComparator <em>Comparator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparator</em>'.
	 * @see de.altimos.mdsd.majordomo.CompareOperation#getComparator()
	 * @see #getCompareOperation()
	 * @generated
	 */
	EAttribute getCompareOperation_Comparator();

	/**
	 * Returns the meta object for the containment reference '{@link de.altimos.mdsd.majordomo.CompareOperation#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see de.altimos.mdsd.majordomo.CompareOperation#getLeft()
	 * @see #getCompareOperation()
	 * @generated
	 */
	EReference getCompareOperation_Left();

	/**
	 * Returns the meta object for the containment reference '{@link de.altimos.mdsd.majordomo.CompareOperation#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see de.altimos.mdsd.majordomo.CompareOperation#getRight()
	 * @see #getCompareOperation()
	 * @generated
	 */
	EReference getCompareOperation_Right();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.BooleanSensorStatement <em>Boolean Sensor Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Sensor Statement</em>'.
	 * @see de.altimos.mdsd.majordomo.BooleanSensorStatement
	 * @generated
	 */
	EClass getBooleanSensorStatement();

	/**
	 * Returns the meta object for the reference '{@link de.altimos.mdsd.majordomo.BooleanSensorStatement#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sensor</em>'.
	 * @see de.altimos.mdsd.majordomo.BooleanSensorStatement#getSensor()
	 * @see #getBooleanSensorStatement()
	 * @generated
	 */
	EReference getBooleanSensorStatement_Sensor();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.ValueExpression <em>Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Expression</em>'.
	 * @see de.altimos.mdsd.majordomo.ValueExpression
	 * @generated
	 */
	EClass getValueExpression();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.ConstantValue <em>Constant Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant Value</em>'.
	 * @see de.altimos.mdsd.majordomo.ConstantValue
	 * @generated
	 */
	EClass getConstantValue();

	/**
	 * Returns the meta object for the attribute '{@link de.altimos.mdsd.majordomo.ConstantValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.altimos.mdsd.majordomo.ConstantValue#getValue()
	 * @see #getConstantValue()
	 * @generated
	 */
	EAttribute getConstantValue_Value();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.SensorValue <em>Sensor Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor Value</em>'.
	 * @see de.altimos.mdsd.majordomo.SensorValue
	 * @generated
	 */
	EClass getSensorValue();

	/**
	 * Returns the meta object for the reference '{@link de.altimos.mdsd.majordomo.SensorValue#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sensor</em>'.
	 * @see de.altimos.mdsd.majordomo.SensorValue#getSensor()
	 * @see #getSensorValue()
	 * @generated
	 */
	EReference getSensorValue_Sensor();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.StatementReference <em>Statement Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement Reference</em>'.
	 * @see de.altimos.mdsd.majordomo.StatementReference
	 * @generated
	 */
	EClass getStatementReference();

	/**
	 * Returns the meta object for the reference '{@link de.altimos.mdsd.majordomo.StatementReference#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see de.altimos.mdsd.majordomo.StatementReference#getRef()
	 * @see #getStatementReference()
	 * @generated
	 */
	EReference getStatementReference_Ref();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see de.altimos.mdsd.majordomo.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the containment reference list '{@link de.altimos.mdsd.majordomo.Program#getConstants <em>Constants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constants</em>'.
	 * @see de.altimos.mdsd.majordomo.Program#getConstants()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Constants();

	/**
	 * Returns the meta object for the containment reference list '{@link de.altimos.mdsd.majordomo.Program#getPreparedStatements <em>Prepared Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prepared Statements</em>'.
	 * @see de.altimos.mdsd.majordomo.Program#getPreparedStatements()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_PreparedStatements();

	/**
	 * Returns the meta object for the containment reference list '{@link de.altimos.mdsd.majordomo.Program#getPreparedActionSets <em>Prepared Action Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prepared Action Sets</em>'.
	 * @see de.altimos.mdsd.majordomo.Program#getPreparedActionSets()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_PreparedActionSets();

	/**
	 * Returns the meta object for the containment reference list '{@link de.altimos.mdsd.majordomo.Program#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see de.altimos.mdsd.majordomo.Program#getRules()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Rules();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.PreparedStatement <em>Prepared Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prepared Statement</em>'.
	 * @see de.altimos.mdsd.majordomo.PreparedStatement
	 * @generated
	 */
	EClass getPreparedStatement();

	/**
	 * Returns the meta object for the attribute '{@link de.altimos.mdsd.majordomo.PreparedStatement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.altimos.mdsd.majordomo.PreparedStatement#getName()
	 * @see #getPreparedStatement()
	 * @generated
	 */
	EAttribute getPreparedStatement_Name();

	/**
	 * Returns the meta object for the container reference '{@link de.altimos.mdsd.majordomo.PreparedStatement#getCtx <em>Ctx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Ctx</em>'.
	 * @see de.altimos.mdsd.majordomo.PreparedStatement#getCtx()
	 * @see #getPreparedStatement()
	 * @generated
	 */
	EReference getPreparedStatement_Ctx();

	/**
	 * Returns the meta object for the containment reference '{@link de.altimos.mdsd.majordomo.PreparedStatement#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statement</em>'.
	 * @see de.altimos.mdsd.majordomo.PreparedStatement#getStatement()
	 * @see #getPreparedStatement()
	 * @generated
	 */
	EReference getPreparedStatement_Statement();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.PreparedActionSet <em>Prepared Action Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prepared Action Set</em>'.
	 * @see de.altimos.mdsd.majordomo.PreparedActionSet
	 * @generated
	 */
	EClass getPreparedActionSet();

	/**
	 * Returns the meta object for the container reference '{@link de.altimos.mdsd.majordomo.PreparedActionSet#getCtx <em>Ctx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Ctx</em>'.
	 * @see de.altimos.mdsd.majordomo.PreparedActionSet#getCtx()
	 * @see #getPreparedActionSet()
	 * @generated
	 */
	EReference getPreparedActionSet_Ctx();

	/**
	 * Returns the meta object for the attribute '{@link de.altimos.mdsd.majordomo.PreparedActionSet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.altimos.mdsd.majordomo.PreparedActionSet#getName()
	 * @see #getPreparedActionSet()
	 * @generated
	 */
	EAttribute getPreparedActionSet_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link de.altimos.mdsd.majordomo.PreparedActionSet#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see de.altimos.mdsd.majordomo.PreparedActionSet#getActions()
	 * @see #getPreparedActionSet()
	 * @generated
	 */
	EReference getPreparedActionSet_Actions();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.ActionSetReference <em>Action Set Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Set Reference</em>'.
	 * @see de.altimos.mdsd.majordomo.ActionSetReference
	 * @generated
	 */
	EClass getActionSetReference();

	/**
	 * Returns the meta object for the reference '{@link de.altimos.mdsd.majordomo.ActionSetReference#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see de.altimos.mdsd.majordomo.ActionSetReference#getRef()
	 * @see #getActionSetReference()
	 * @generated
	 */
	EReference getActionSetReference_Ref();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.BinaryAndOperation <em>Binary And Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary And Operation</em>'.
	 * @see de.altimos.mdsd.majordomo.BinaryAndOperation
	 * @generated
	 */
	EClass getBinaryAndOperation();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.BinaryOrOperation <em>Binary Or Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Or Operation</em>'.
	 * @see de.altimos.mdsd.majordomo.BinaryOrOperation
	 * @generated
	 */
	EClass getBinaryOrOperation();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.PreparedValue <em>Prepared Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prepared Value</em>'.
	 * @see de.altimos.mdsd.majordomo.PreparedValue
	 * @generated
	 */
	EClass getPreparedValue();

	/**
	 * Returns the meta object for the container reference '{@link de.altimos.mdsd.majordomo.PreparedValue#getCtx <em>Ctx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Ctx</em>'.
	 * @see de.altimos.mdsd.majordomo.PreparedValue#getCtx()
	 * @see #getPreparedValue()
	 * @generated
	 */
	EReference getPreparedValue_Ctx();

	/**
	 * Returns the meta object for the containment reference '{@link de.altimos.mdsd.majordomo.PreparedValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see de.altimos.mdsd.majordomo.PreparedValue#getValue()
	 * @see #getPreparedValue()
	 * @generated
	 */
	EReference getPreparedValue_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.altimos.mdsd.majordomo.PreparedValue#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.altimos.mdsd.majordomo.PreparedValue#getName()
	 * @see #getPreparedValue()
	 * @generated
	 */
	EAttribute getPreparedValue_Name();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.ValueReference <em>Value Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Reference</em>'.
	 * @see de.altimos.mdsd.majordomo.ValueReference
	 * @generated
	 */
	EClass getValueReference();

	/**
	 * Returns the meta object for the reference '{@link de.altimos.mdsd.majordomo.ValueReference#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see de.altimos.mdsd.majordomo.ValueReference#getRef()
	 * @see #getValueReference()
	 * @generated
	 */
	EReference getValueReference_Ref();

	/**
	 * Returns the meta object for enum '{@link de.altimos.mdsd.majordomo.Comparator <em>Comparator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comparator</em>'.
	 * @see de.altimos.mdsd.majordomo.Comparator
	 * @generated
	 */
	EEnum getComparator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MajordomoFactory getMajordomoFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.MajordomoImpl <em>Majordomo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getMajordomo()
		 * @generated
		 */
		EClass MAJORDOMO = eINSTANCE.getMajordomo();

		/**
		 * The meta object literal for the '<em><b>House</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAJORDOMO__HOUSE = eINSTANCE.getMajordomo_House();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAJORDOMO__NAME = eINSTANCE.getMajordomo_Name();

		/**
		 * The meta object literal for the '<em><b>Rooms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAJORDOMO__ROOMS = eINSTANCE.getMajordomo_Rooms();

		/**
		 * The meta object literal for the '<em><b>Program</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAJORDOMO__PROGRAM = eINSTANCE.getMajordomo_Program();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.HouseImpl <em>House</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.HouseImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getHouse()
		 * @generated
		 */
		EClass HOUSE = eINSTANCE.getHouse();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.Extendable <em>Extendable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.Extendable
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getExtendable()
		 * @generated
		 */
		EClass EXTENDABLE = eINSTANCE.getExtendable();

		/**
		 * The meta object literal for the '<em><b>Sensors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDABLE__SENSORS = eINSTANCE.getExtendable_Sensors();

		/**
		 * The meta object literal for the '<em><b>Actors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDABLE__ACTORS = eINSTANCE.getExtendable_Actors();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.RoomImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__NAME = eINSTANCE.getRoom_Name();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.SensorImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '<em><b>Ctx</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__CTX = eINSTANCE.getSensor_Ctx();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.ActorImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '<em><b>Ctx</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__CTX = eINSTANCE.getActor_Ctx();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.RuleImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__STATEMENT = eINSTANCE.getRule_Statement();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__ACTIONS = eINSTANCE.getRule_Actions();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.ExtensionImpl <em>Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.ExtensionImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getExtension()
		 * @generated
		 */
		EClass EXTENSION = eINSTANCE.getExtension();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION__NAME = eINSTANCE.getExtension_Name();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.LightSensorImpl <em>Light Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.LightSensorImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getLightSensor()
		 * @generated
		 */
		EClass LIGHT_SENSOR = eINSTANCE.getLightSensor();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.TemperatureSensorImpl <em>Temperature Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.TemperatureSensorImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getTemperatureSensor()
		 * @generated
		 */
		EClass TEMPERATURE_SENSOR = eINSTANCE.getTemperatureSensor();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.RainSensorImpl <em>Rain Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.RainSensorImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getRainSensor()
		 * @generated
		 */
		EClass RAIN_SENSOR = eINSTANCE.getRainSensor();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.SwitchSensorImpl <em>Switch Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.SwitchSensorImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getSwitchSensor()
		 * @generated
		 */
		EClass SWITCH_SENSOR = eINSTANCE.getSwitchSensor();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.NumberSensorImpl <em>Number Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.NumberSensorImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getNumberSensor()
		 * @generated
		 */
		EClass NUMBER_SENSOR = eINSTANCE.getNumberSensor();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.ClockSensorImpl <em>Clock Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.ClockSensorImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getClockSensor()
		 * @generated
		 */
		EClass CLOCK_SENSOR = eINSTANCE.getClockSensor();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.LampActorImpl <em>Lamp Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.LampActorImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getLampActor()
		 * @generated
		 */
		EClass LAMP_ACTOR = eINSTANCE.getLampActor();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.RollerActorImpl <em>Roller Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.RollerActorImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getRollerActor()
		 * @generated
		 */
		EClass ROLLER_ACTOR = eINSTANCE.getRollerActor();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.RoofWindowActorImpl <em>Roof Window Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.RoofWindowActorImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getRoofWindowActor()
		 * @generated
		 */
		EClass ROOF_WINDOW_ACTOR = eINSTANCE.getRoofWindowActor();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.BoilerActorImpl <em>Boiler Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.BoilerActorImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getBoilerActor()
		 * @generated
		 */
		EClass BOILER_ACTOR = eINSTANCE.getBoilerActor();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.RadiatorActorImpl <em>Radiator Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.RadiatorActorImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getRadiatorActor()
		 * @generated
		 */
		EClass RADIATOR_ACTOR = eINSTANCE.getRadiatorActor();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.RoomMountable <em>Room Mountable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.RoomMountable
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getRoomMountable()
		 * @generated
		 */
		EClass ROOM_MOUNTABLE = eINSTANCE.getRoomMountable();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.HouseMountable <em>House Mountable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.HouseMountable
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getHouseMountable()
		 * @generated
		 */
		EClass HOUSE_MOUNTABLE = eINSTANCE.getHouseMountable();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.BooleanSensorImpl <em>Boolean Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.BooleanSensorImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getBooleanSensor()
		 * @generated
		 */
		EClass BOOLEAN_SENSOR = eINSTANCE.getBooleanSensor();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.FloatSensorImpl <em>Float Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.FloatSensorImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getFloatSensor()
		 * @generated
		 */
		EClass FLOAT_SENSOR = eINSTANCE.getFloatSensor();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.BooleanActorImpl <em>Boolean Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.BooleanActorImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getBooleanActor()
		 * @generated
		 */
		EClass BOOLEAN_ACTOR = eINSTANCE.getBooleanActor();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.FloatActorImpl <em>Float Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.FloatActorImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getFloatActor()
		 * @generated
		 */
		EClass FLOAT_ACTOR = eINSTANCE.getFloatActor();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.Statement <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.Statement
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.Action <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.Action
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.FloatActionImpl <em>Float Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.FloatActionImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getFloatAction()
		 * @generated
		 */
		EClass FLOAT_ACTION = eINSTANCE.getFloatAction();

		/**
		 * The meta object literal for the '<em><b>Actor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOAT_ACTION__ACTOR = eINSTANCE.getFloatAction_Actor();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT_ACTION__VALUE = eINSTANCE.getFloatAction_Value();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.BooleanActionImpl <em>Boolean Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.BooleanActionImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getBooleanAction()
		 * @generated
		 */
		EClass BOOLEAN_ACTION = eINSTANCE.getBooleanAction();

		/**
		 * The meta object literal for the '<em><b>Actor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_ACTION__ACTOR = eINSTANCE.getBooleanAction_Actor();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_ACTION__VALUE = eINSTANCE.getBooleanAction_Value();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.CoffeeActorImpl <em>Coffee Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.CoffeeActorImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getCoffeeActor()
		 * @generated
		 */
		EClass COFFEE_ACTOR = eINSTANCE.getCoffeeActor();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.BinaryOperationImpl <em>Binary Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.BinaryOperationImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getBinaryOperation()
		 * @generated
		 */
		EClass BINARY_OPERATION = eINSTANCE.getBinaryOperation();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_OPERATION__LEFT = eINSTANCE.getBinaryOperation_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_OPERATION__RIGHT = eINSTANCE.getBinaryOperation_Right();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.NotOperationImpl <em>Not Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.NotOperationImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getNotOperation()
		 * @generated
		 */
		EClass NOT_OPERATION = eINSTANCE.getNotOperation();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT_OPERATION__STATEMENT = eINSTANCE.getNotOperation_Statement();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.CompareOperationImpl <em>Compare Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.CompareOperationImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getCompareOperation()
		 * @generated
		 */
		EClass COMPARE_OPERATION = eINSTANCE.getCompareOperation();

		/**
		 * The meta object literal for the '<em><b>Comparator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARE_OPERATION__COMPARATOR = eINSTANCE.getCompareOperation_Comparator();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARE_OPERATION__LEFT = eINSTANCE.getCompareOperation_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARE_OPERATION__RIGHT = eINSTANCE.getCompareOperation_Right();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.BooleanSensorStatementImpl <em>Boolean Sensor Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.BooleanSensorStatementImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getBooleanSensorStatement()
		 * @generated
		 */
		EClass BOOLEAN_SENSOR_STATEMENT = eINSTANCE.getBooleanSensorStatement();

		/**
		 * The meta object literal for the '<em><b>Sensor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_SENSOR_STATEMENT__SENSOR = eINSTANCE.getBooleanSensorStatement_Sensor();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.ValueExpression <em>Value Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.ValueExpression
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getValueExpression()
		 * @generated
		 */
		EClass VALUE_EXPRESSION = eINSTANCE.getValueExpression();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.ConstantValueImpl <em>Constant Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.ConstantValueImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getConstantValue()
		 * @generated
		 */
		EClass CONSTANT_VALUE = eINSTANCE.getConstantValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT_VALUE__VALUE = eINSTANCE.getConstantValue_Value();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.SensorValueImpl <em>Sensor Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.SensorValueImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getSensorValue()
		 * @generated
		 */
		EClass SENSOR_VALUE = eINSTANCE.getSensorValue();

		/**
		 * The meta object literal for the '<em><b>Sensor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR_VALUE__SENSOR = eINSTANCE.getSensorValue_Sensor();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.StatementReferenceImpl <em>Statement Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.StatementReferenceImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getStatementReference()
		 * @generated
		 */
		EClass STATEMENT_REFERENCE = eINSTANCE.getStatementReference();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_REFERENCE__REF = eINSTANCE.getStatementReference_Ref();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.ProgramImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Constants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__CONSTANTS = eINSTANCE.getProgram_Constants();

		/**
		 * The meta object literal for the '<em><b>Prepared Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__PREPARED_STATEMENTS = eINSTANCE.getProgram_PreparedStatements();

		/**
		 * The meta object literal for the '<em><b>Prepared Action Sets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__PREPARED_ACTION_SETS = eINSTANCE.getProgram_PreparedActionSets();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__RULES = eINSTANCE.getProgram_Rules();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.PreparedStatementImpl <em>Prepared Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.PreparedStatementImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getPreparedStatement()
		 * @generated
		 */
		EClass PREPARED_STATEMENT = eINSTANCE.getPreparedStatement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREPARED_STATEMENT__NAME = eINSTANCE.getPreparedStatement_Name();

		/**
		 * The meta object literal for the '<em><b>Ctx</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREPARED_STATEMENT__CTX = eINSTANCE.getPreparedStatement_Ctx();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREPARED_STATEMENT__STATEMENT = eINSTANCE.getPreparedStatement_Statement();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.PreparedActionSetImpl <em>Prepared Action Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.PreparedActionSetImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getPreparedActionSet()
		 * @generated
		 */
		EClass PREPARED_ACTION_SET = eINSTANCE.getPreparedActionSet();

		/**
		 * The meta object literal for the '<em><b>Ctx</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREPARED_ACTION_SET__CTX = eINSTANCE.getPreparedActionSet_Ctx();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREPARED_ACTION_SET__NAME = eINSTANCE.getPreparedActionSet_Name();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREPARED_ACTION_SET__ACTIONS = eINSTANCE.getPreparedActionSet_Actions();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.ActionSetReferenceImpl <em>Action Set Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.ActionSetReferenceImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getActionSetReference()
		 * @generated
		 */
		EClass ACTION_SET_REFERENCE = eINSTANCE.getActionSetReference();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_SET_REFERENCE__REF = eINSTANCE.getActionSetReference_Ref();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.BinaryAndOperationImpl <em>Binary And Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.BinaryAndOperationImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getBinaryAndOperation()
		 * @generated
		 */
		EClass BINARY_AND_OPERATION = eINSTANCE.getBinaryAndOperation();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.BinaryOrOperationImpl <em>Binary Or Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.BinaryOrOperationImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getBinaryOrOperation()
		 * @generated
		 */
		EClass BINARY_OR_OPERATION = eINSTANCE.getBinaryOrOperation();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.PreparedValueImpl <em>Prepared Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.PreparedValueImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getPreparedValue()
		 * @generated
		 */
		EClass PREPARED_VALUE = eINSTANCE.getPreparedValue();

		/**
		 * The meta object literal for the '<em><b>Ctx</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREPARED_VALUE__CTX = eINSTANCE.getPreparedValue_Ctx();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREPARED_VALUE__VALUE = eINSTANCE.getPreparedValue_Value();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREPARED_VALUE__NAME = eINSTANCE.getPreparedValue_Name();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.ValueReferenceImpl <em>Value Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.ValueReferenceImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getValueReference()
		 * @generated
		 */
		EClass VALUE_REFERENCE = eINSTANCE.getValueReference();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_REFERENCE__REF = eINSTANCE.getValueReference_Ref();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.Comparator <em>Comparator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.Comparator
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getComparator()
		 * @generated
		 */
		EEnum COMPARATOR = eINSTANCE.getComparator();

	}

} //MajordomoPackage

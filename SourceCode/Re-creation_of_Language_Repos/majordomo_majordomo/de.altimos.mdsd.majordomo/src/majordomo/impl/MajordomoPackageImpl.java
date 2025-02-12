/**
 */
package majordomo.impl;

import majordomo.Action;
import majordomo.ActionSetReference;
import majordomo.Actor;
import majordomo.BinaryAndOperation;
import majordomo.BinaryOperation;
import majordomo.BinaryOrOperation;
import majordomo.BoilerActor;
import majordomo.BooleanAction;
import majordomo.BooleanActor;
import majordomo.BooleanSensor;
import majordomo.BooleanSensorStatement;
import majordomo.ClockSensor;
import majordomo.CoffeeActor;
import majordomo.Comparator;
import majordomo.CompareOperation;
import majordomo.ConstantValue;
import majordomo.Extendable;
import majordomo.Extension;
import majordomo.FloatAction;
import majordomo.FloatActor;
import majordomo.FloatSensor;
import majordomo.House;
import majordomo.HouseMountable;
import majordomo.LampActor;
import majordomo.LightSensor;
import majordomo.Majordomo;
import majordomo.MajordomoFactory;
import majordomo.MajordomoPackage;
import majordomo.NotOperation;
import majordomo.NumberSensor;
import majordomo.PreparedActionSet;
import majordomo.PreparedStatement;
import majordomo.PreparedValue;
import majordomo.Program;
import majordomo.RadiatorActor;
import majordomo.RainSensor;
import majordomo.RollerActor;
import majordomo.RoofWindowActor;
import majordomo.Room;
import majordomo.RoomMountable;
import majordomo.Rule;
import majordomo.Sensor;
import majordomo.SensorValue;
import majordomo.Statement;
import majordomo.StatementReference;
import majordomo.SwitchSensor;
import majordomo.TemperatureSensor;
import majordomo.ValueExpression;
import majordomo.ValueReference;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MajordomoPackageImpl extends EPackageImpl implements MajordomoPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass majordomoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass houseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lightSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temperatureSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rainSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clockSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lampActorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rollerActorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roofWindowActorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boilerActorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass radiatorActorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomMountableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass houseMountableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floatSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanActorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floatActorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floatActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coffeeActorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compareOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanSensorStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preparedStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preparedActionSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionSetReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryAndOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryOrOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preparedValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum comparatorEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see majordomo.MajordomoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MajordomoPackageImpl() {
		super(eNS_URI, MajordomoFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MajordomoPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MajordomoPackage init() {
		if (isInited) return (MajordomoPackage)EPackage.Registry.INSTANCE.getEPackage(MajordomoPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMajordomoPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MajordomoPackageImpl theMajordomoPackage = registeredMajordomoPackage instanceof MajordomoPackageImpl ? (MajordomoPackageImpl)registeredMajordomoPackage : new MajordomoPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theMajordomoPackage.createPackageContents();

		// Initialize created meta-data
		theMajordomoPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMajordomoPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MajordomoPackage.eNS_URI, theMajordomoPackage);
		return theMajordomoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMajordomo() {
		return majordomoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMajordomo_House() {
		return (EReference)majordomoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMajordomo_Name() {
		return (EAttribute)majordomoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMajordomo_Rooms() {
		return (EReference)majordomoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMajordomo_Program() {
		return (EReference)majordomoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHouse() {
		return houseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExtendable() {
		return extendableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtendable_Sensors() {
		return (EReference)extendableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtendable_Actors() {
		return (EReference)extendableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRoom() {
		return roomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoom_Name() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSensor() {
		return sensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSensor_Ctx() {
		return (EReference)sensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActor() {
		return actorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActor_Ctx() {
		return (EReference)actorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRule() {
		return ruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRule_Statement() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRule_Actions() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExtension() {
		return extensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExtension_Name() {
		return (EAttribute)extensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLightSensor() {
		return lightSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTemperatureSensor() {
		return temperatureSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRainSensor() {
		return rainSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSwitchSensor() {
		return switchSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNumberSensor() {
		return numberSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClockSensor() {
		return clockSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLampActor() {
		return lampActorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRollerActor() {
		return rollerActorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRoofWindowActor() {
		return roofWindowActorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBoilerActor() {
		return boilerActorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRadiatorActor() {
		return radiatorActorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRoomMountable() {
		return roomMountableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHouseMountable() {
		return houseMountableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBooleanSensor() {
		return booleanSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getBooleanSensor__GetValue() {
		return booleanSensorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFloatSensor() {
		return floatSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFloatSensor__GetValue() {
		return floatSensorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBooleanActor() {
		return booleanActorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getBooleanActor__SetValue__boolean() {
		return booleanActorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFloatActor() {
		return floatActorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFloatActor__SetValue__float() {
		return floatActorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStatement() {
		return statementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFloatAction() {
		return floatActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFloatAction_Actor() {
		return (EReference)floatActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFloatAction_Value() {
		return (EAttribute)floatActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBooleanAction() {
		return booleanActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBooleanAction_Actor() {
		return (EReference)booleanActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBooleanAction_Value() {
		return (EAttribute)booleanActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCoffeeActor() {
		return coffeeActorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBinaryOperation() {
		return binaryOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBinaryOperation_Left() {
		return (EReference)binaryOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBinaryOperation_Right() {
		return (EReference)binaryOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNotOperation() {
		return notOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNotOperation_Statement() {
		return (EReference)notOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompareOperation() {
		return compareOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompareOperation_Comparator() {
		return (EAttribute)compareOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompareOperation_Left() {
		return (EReference)compareOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompareOperation_Right() {
		return (EReference)compareOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBooleanSensorStatement() {
		return booleanSensorStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBooleanSensorStatement_Sensor() {
		return (EReference)booleanSensorStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValueExpression() {
		return valueExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConstantValue() {
		return constantValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConstantValue_Value() {
		return (EAttribute)constantValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSensorValue() {
		return sensorValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSensorValue_Sensor() {
		return (EReference)sensorValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStatementReference() {
		return statementReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStatementReference_Ref() {
		return (EReference)statementReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProgram() {
		return programEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgram_Constants() {
		return (EReference)programEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgram_PreparedStatements() {
		return (EReference)programEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgram_PreparedActionSets() {
		return (EReference)programEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgram_Rules() {
		return (EReference)programEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPreparedStatement() {
		return preparedStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPreparedStatement_Name() {
		return (EAttribute)preparedStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPreparedStatement_Ctx() {
		return (EReference)preparedStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPreparedStatement_Statement() {
		return (EReference)preparedStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPreparedActionSet() {
		return preparedActionSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPreparedActionSet_Ctx() {
		return (EReference)preparedActionSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPreparedActionSet_Name() {
		return (EAttribute)preparedActionSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPreparedActionSet_Actions() {
		return (EReference)preparedActionSetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActionSetReference() {
		return actionSetReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActionSetReference_Ref() {
		return (EReference)actionSetReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBinaryAndOperation() {
		return binaryAndOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBinaryOrOperation() {
		return binaryOrOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPreparedValue() {
		return preparedValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPreparedValue_Ctx() {
		return (EReference)preparedValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPreparedValue_Value() {
		return (EReference)preparedValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPreparedValue_Name() {
		return (EAttribute)preparedValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValueReference() {
		return valueReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getValueReference_Ref() {
		return (EReference)valueReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getComparator() {
		return comparatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MajordomoFactory getMajordomoFactory() {
		return (MajordomoFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		majordomoEClass = createEClass(MAJORDOMO);
		createEReference(majordomoEClass, MAJORDOMO__HOUSE);
		createEAttribute(majordomoEClass, MAJORDOMO__NAME);
		createEReference(majordomoEClass, MAJORDOMO__ROOMS);
		createEReference(majordomoEClass, MAJORDOMO__PROGRAM);

		houseEClass = createEClass(HOUSE);

		extendableEClass = createEClass(EXTENDABLE);
		createEReference(extendableEClass, EXTENDABLE__SENSORS);
		createEReference(extendableEClass, EXTENDABLE__ACTORS);

		roomEClass = createEClass(ROOM);
		createEAttribute(roomEClass, ROOM__NAME);

		sensorEClass = createEClass(SENSOR);
		createEReference(sensorEClass, SENSOR__CTX);

		actorEClass = createEClass(ACTOR);
		createEReference(actorEClass, ACTOR__CTX);

		ruleEClass = createEClass(RULE);
		createEReference(ruleEClass, RULE__STATEMENT);
		createEReference(ruleEClass, RULE__ACTIONS);

		extensionEClass = createEClass(EXTENSION);
		createEAttribute(extensionEClass, EXTENSION__NAME);

		lightSensorEClass = createEClass(LIGHT_SENSOR);

		temperatureSensorEClass = createEClass(TEMPERATURE_SENSOR);

		rainSensorEClass = createEClass(RAIN_SENSOR);

		switchSensorEClass = createEClass(SWITCH_SENSOR);

		numberSensorEClass = createEClass(NUMBER_SENSOR);

		clockSensorEClass = createEClass(CLOCK_SENSOR);

		lampActorEClass = createEClass(LAMP_ACTOR);

		rollerActorEClass = createEClass(ROLLER_ACTOR);

		roofWindowActorEClass = createEClass(ROOF_WINDOW_ACTOR);

		boilerActorEClass = createEClass(BOILER_ACTOR);

		radiatorActorEClass = createEClass(RADIATOR_ACTOR);

		roomMountableEClass = createEClass(ROOM_MOUNTABLE);

		houseMountableEClass = createEClass(HOUSE_MOUNTABLE);

		booleanSensorEClass = createEClass(BOOLEAN_SENSOR);
		createEOperation(booleanSensorEClass, BOOLEAN_SENSOR___GET_VALUE);

		floatSensorEClass = createEClass(FLOAT_SENSOR);
		createEOperation(floatSensorEClass, FLOAT_SENSOR___GET_VALUE);

		booleanActorEClass = createEClass(BOOLEAN_ACTOR);
		createEOperation(booleanActorEClass, BOOLEAN_ACTOR___SET_VALUE__BOOLEAN);

		floatActorEClass = createEClass(FLOAT_ACTOR);
		createEOperation(floatActorEClass, FLOAT_ACTOR___SET_VALUE__FLOAT);

		statementEClass = createEClass(STATEMENT);

		actionEClass = createEClass(ACTION);

		floatActionEClass = createEClass(FLOAT_ACTION);
		createEReference(floatActionEClass, FLOAT_ACTION__ACTOR);
		createEAttribute(floatActionEClass, FLOAT_ACTION__VALUE);

		booleanActionEClass = createEClass(BOOLEAN_ACTION);
		createEReference(booleanActionEClass, BOOLEAN_ACTION__ACTOR);
		createEAttribute(booleanActionEClass, BOOLEAN_ACTION__VALUE);

		coffeeActorEClass = createEClass(COFFEE_ACTOR);

		binaryOperationEClass = createEClass(BINARY_OPERATION);
		createEReference(binaryOperationEClass, BINARY_OPERATION__LEFT);
		createEReference(binaryOperationEClass, BINARY_OPERATION__RIGHT);

		notOperationEClass = createEClass(NOT_OPERATION);
		createEReference(notOperationEClass, NOT_OPERATION__STATEMENT);

		compareOperationEClass = createEClass(COMPARE_OPERATION);
		createEAttribute(compareOperationEClass, COMPARE_OPERATION__COMPARATOR);
		createEReference(compareOperationEClass, COMPARE_OPERATION__LEFT);
		createEReference(compareOperationEClass, COMPARE_OPERATION__RIGHT);

		booleanSensorStatementEClass = createEClass(BOOLEAN_SENSOR_STATEMENT);
		createEReference(booleanSensorStatementEClass, BOOLEAN_SENSOR_STATEMENT__SENSOR);

		valueExpressionEClass = createEClass(VALUE_EXPRESSION);

		constantValueEClass = createEClass(CONSTANT_VALUE);
		createEAttribute(constantValueEClass, CONSTANT_VALUE__VALUE);

		sensorValueEClass = createEClass(SENSOR_VALUE);
		createEReference(sensorValueEClass, SENSOR_VALUE__SENSOR);

		statementReferenceEClass = createEClass(STATEMENT_REFERENCE);
		createEReference(statementReferenceEClass, STATEMENT_REFERENCE__REF);

		programEClass = createEClass(PROGRAM);
		createEReference(programEClass, PROGRAM__CONSTANTS);
		createEReference(programEClass, PROGRAM__PREPARED_STATEMENTS);
		createEReference(programEClass, PROGRAM__PREPARED_ACTION_SETS);
		createEReference(programEClass, PROGRAM__RULES);

		preparedStatementEClass = createEClass(PREPARED_STATEMENT);
		createEAttribute(preparedStatementEClass, PREPARED_STATEMENT__NAME);
		createEReference(preparedStatementEClass, PREPARED_STATEMENT__CTX);
		createEReference(preparedStatementEClass, PREPARED_STATEMENT__STATEMENT);

		preparedActionSetEClass = createEClass(PREPARED_ACTION_SET);
		createEReference(preparedActionSetEClass, PREPARED_ACTION_SET__CTX);
		createEAttribute(preparedActionSetEClass, PREPARED_ACTION_SET__NAME);
		createEReference(preparedActionSetEClass, PREPARED_ACTION_SET__ACTIONS);

		actionSetReferenceEClass = createEClass(ACTION_SET_REFERENCE);
		createEReference(actionSetReferenceEClass, ACTION_SET_REFERENCE__REF);

		binaryAndOperationEClass = createEClass(BINARY_AND_OPERATION);

		binaryOrOperationEClass = createEClass(BINARY_OR_OPERATION);

		preparedValueEClass = createEClass(PREPARED_VALUE);
		createEReference(preparedValueEClass, PREPARED_VALUE__CTX);
		createEReference(preparedValueEClass, PREPARED_VALUE__VALUE);
		createEAttribute(preparedValueEClass, PREPARED_VALUE__NAME);

		valueReferenceEClass = createEClass(VALUE_REFERENCE);
		createEReference(valueReferenceEClass, VALUE_REFERENCE__REF);

		// Create enums
		comparatorEEnum = createEEnum(COMPARATOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		houseEClass.getESuperTypes().add(this.getExtendable());
		roomEClass.getESuperTypes().add(this.getExtendable());
		sensorEClass.getESuperTypes().add(this.getExtension());
		actorEClass.getESuperTypes().add(this.getExtension());
		lightSensorEClass.getESuperTypes().add(this.getHouseMountable());
		lightSensorEClass.getESuperTypes().add(this.getRoomMountable());
		lightSensorEClass.getESuperTypes().add(this.getFloatSensor());
		temperatureSensorEClass.getESuperTypes().add(this.getHouseMountable());
		temperatureSensorEClass.getESuperTypes().add(this.getRoomMountable());
		temperatureSensorEClass.getESuperTypes().add(this.getFloatSensor());
		rainSensorEClass.getESuperTypes().add(this.getHouseMountable());
		rainSensorEClass.getESuperTypes().add(this.getBooleanSensor());
		switchSensorEClass.getESuperTypes().add(this.getRoomMountable());
		switchSensorEClass.getESuperTypes().add(this.getBooleanSensor());
		numberSensorEClass.getESuperTypes().add(this.getRoomMountable());
		numberSensorEClass.getESuperTypes().add(this.getFloatSensor());
		clockSensorEClass.getESuperTypes().add(this.getHouseMountable());
		clockSensorEClass.getESuperTypes().add(this.getFloatSensor());
		lampActorEClass.getESuperTypes().add(this.getHouseMountable());
		lampActorEClass.getESuperTypes().add(this.getRoomMountable());
		lampActorEClass.getESuperTypes().add(this.getFloatActor());
		rollerActorEClass.getESuperTypes().add(this.getRoomMountable());
		rollerActorEClass.getESuperTypes().add(this.getBooleanActor());
		roofWindowActorEClass.getESuperTypes().add(this.getRoomMountable());
		roofWindowActorEClass.getESuperTypes().add(this.getBooleanActor());
		boilerActorEClass.getESuperTypes().add(this.getHouseMountable());
		boilerActorEClass.getESuperTypes().add(this.getBooleanActor());
		radiatorActorEClass.getESuperTypes().add(this.getRoomMountable());
		radiatorActorEClass.getESuperTypes().add(this.getBooleanActor());
		booleanSensorEClass.getESuperTypes().add(this.getSensor());
		floatSensorEClass.getESuperTypes().add(this.getSensor());
		booleanActorEClass.getESuperTypes().add(this.getActor());
		floatActorEClass.getESuperTypes().add(this.getActor());
		floatActionEClass.getESuperTypes().add(this.getAction());
		booleanActionEClass.getESuperTypes().add(this.getAction());
		coffeeActorEClass.getESuperTypes().add(this.getRoomMountable());
		coffeeActorEClass.getESuperTypes().add(this.getBooleanActor());
		binaryOperationEClass.getESuperTypes().add(this.getStatement());
		notOperationEClass.getESuperTypes().add(this.getStatement());
		compareOperationEClass.getESuperTypes().add(this.getStatement());
		booleanSensorStatementEClass.getESuperTypes().add(this.getStatement());
		constantValueEClass.getESuperTypes().add(this.getValueExpression());
		sensorValueEClass.getESuperTypes().add(this.getValueExpression());
		statementReferenceEClass.getESuperTypes().add(this.getStatement());
		actionSetReferenceEClass.getESuperTypes().add(this.getAction());
		binaryAndOperationEClass.getESuperTypes().add(this.getBinaryOperation());
		binaryOrOperationEClass.getESuperTypes().add(this.getBinaryOperation());
		valueReferenceEClass.getESuperTypes().add(this.getValueExpression());

		// Initialize classes, features, and operations; add parameters
		initEClass(majordomoEClass, Majordomo.class, "Majordomo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMajordomo_House(), this.getHouse(), null, "house", null, 0, 1, Majordomo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMajordomo_Name(), ecorePackage.getEString(), "name", "m", 1, 1, Majordomo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMajordomo_Rooms(), this.getRoom(), null, "rooms", null, 0, -1, Majordomo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMajordomo_Program(), this.getProgram(), null, "program", null, 1, 1, Majordomo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(houseEClass, House.class, "House", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(extendableEClass, Extendable.class, "Extendable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtendable_Sensors(), this.getSensor(), this.getSensor_Ctx(), "sensors", null, 0, -1, Extendable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtendable_Actors(), this.getActor(), this.getActor_Ctx(), "actors", null, 0, -1, Extendable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roomEClass, Room.class, "Room", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoom_Name(), ecorePackage.getEString(), "name", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sensorEClass, Sensor.class, "Sensor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSensor_Ctx(), this.getExtendable(), this.getExtendable_Sensors(), "ctx", null, 1, 1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actorEClass, Actor.class, "Actor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActor_Ctx(), this.getExtendable(), this.getExtendable_Actors(), "ctx", null, 1, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRule_Statement(), this.getStatement(), null, "statement", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_Actions(), this.getAction(), null, "actions", null, 1, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extensionEClass, Extension.class, "Extension", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtension_Name(), ecorePackage.getEString(), "name", null, 1, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lightSensorEClass, LightSensor.class, "LightSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(temperatureSensorEClass, TemperatureSensor.class, "TemperatureSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rainSensorEClass, RainSensor.class, "RainSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(switchSensorEClass, SwitchSensor.class, "SwitchSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(numberSensorEClass, NumberSensor.class, "NumberSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(clockSensorEClass, ClockSensor.class, "ClockSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lampActorEClass, LampActor.class, "LampActor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rollerActorEClass, RollerActor.class, "RollerActor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roofWindowActorEClass, RoofWindowActor.class, "RoofWindowActor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(boilerActorEClass, BoilerActor.class, "BoilerActor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(radiatorActorEClass, RadiatorActor.class, "RadiatorActor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roomMountableEClass, RoomMountable.class, "RoomMountable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(houseMountableEClass, HouseMountable.class, "HouseMountable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanSensorEClass, BooleanSensor.class, "BooleanSensor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getBooleanSensor__GetValue(), ecorePackage.getEBoolean(), "getValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(floatSensorEClass, FloatSensor.class, "FloatSensor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getFloatSensor__GetValue(), ecorePackage.getEFloat(), "getValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(booleanActorEClass, BooleanActor.class, "BooleanActor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getBooleanActor__SetValue__boolean(), null, "setValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(floatActorEClass, FloatActor.class, "FloatActor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getFloatActor__SetValue__float(), null, "setValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(statementEClass, Statement.class, "Statement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionEClass, Action.class, "Action", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(floatActionEClass, FloatAction.class, "FloatAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFloatAction_Actor(), this.getFloatActor(), null, "actor", null, 1, 1, FloatAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFloatAction_Value(), ecorePackage.getEFloat(), "value", null, 1, 1, FloatAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanActionEClass, BooleanAction.class, "BooleanAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooleanAction_Actor(), this.getBooleanActor(), null, "actor", null, 1, 1, BooleanAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBooleanAction_Value(), ecorePackage.getEBoolean(), "value", null, 1, 1, BooleanAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coffeeActorEClass, CoffeeActor.class, "CoffeeActor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(binaryOperationEClass, BinaryOperation.class, "BinaryOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryOperation_Left(), this.getStatement(), null, "left", null, 1, 1, BinaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryOperation_Right(), this.getStatement(), null, "right", null, 1, 1, BinaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notOperationEClass, NotOperation.class, "NotOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNotOperation_Statement(), this.getStatement(), null, "statement", null, 1, 1, NotOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compareOperationEClass, CompareOperation.class, "CompareOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompareOperation_Comparator(), this.getComparator(), "comparator", null, 1, 1, CompareOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompareOperation_Left(), this.getValueExpression(), null, "left", null, 1, 1, CompareOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompareOperation_Right(), this.getValueExpression(), null, "right", null, 1, 1, CompareOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanSensorStatementEClass, BooleanSensorStatement.class, "BooleanSensorStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooleanSensorStatement_Sensor(), this.getBooleanSensor(), null, "sensor", null, 1, 1, BooleanSensorStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueExpressionEClass, ValueExpression.class, "ValueExpression", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constantValueEClass, ConstantValue.class, "ConstantValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstantValue_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, ConstantValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sensorValueEClass, SensorValue.class, "SensorValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSensorValue_Sensor(), this.getFloatSensor(), null, "sensor", null, 1, 1, SensorValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statementReferenceEClass, StatementReference.class, "StatementReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStatementReference_Ref(), this.getPreparedStatement(), null, "ref", null, 1, 1, StatementReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(programEClass, Program.class, "Program", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProgram_Constants(), this.getPreparedValue(), this.getPreparedValue_Ctx(), "constants", null, 0, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgram_PreparedStatements(), this.getPreparedStatement(), this.getPreparedStatement_Ctx(), "preparedStatements", null, 0, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgram_PreparedActionSets(), this.getPreparedActionSet(), this.getPreparedActionSet_Ctx(), "preparedActionSets", null, 0, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgram_Rules(), this.getRule(), null, "rules", null, 0, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(preparedStatementEClass, PreparedStatement.class, "PreparedStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPreparedStatement_Name(), ecorePackage.getEString(), "name", null, 1, 1, PreparedStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPreparedStatement_Ctx(), this.getProgram(), this.getProgram_PreparedStatements(), "ctx", null, 1, 1, PreparedStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPreparedStatement_Statement(), this.getStatement(), null, "statement", null, 1, 1, PreparedStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(preparedActionSetEClass, PreparedActionSet.class, "PreparedActionSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPreparedActionSet_Ctx(), this.getProgram(), this.getProgram_PreparedActionSets(), "ctx", null, 1, 1, PreparedActionSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPreparedActionSet_Name(), ecorePackage.getEString(), "name", null, 1, 1, PreparedActionSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPreparedActionSet_Actions(), this.getAction(), null, "actions", null, 1, -1, PreparedActionSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionSetReferenceEClass, ActionSetReference.class, "ActionSetReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionSetReference_Ref(), this.getPreparedActionSet(), null, "ref", null, 1, 1, ActionSetReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryAndOperationEClass, BinaryAndOperation.class, "BinaryAndOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(binaryOrOperationEClass, BinaryOrOperation.class, "BinaryOrOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(preparedValueEClass, PreparedValue.class, "PreparedValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPreparedValue_Ctx(), this.getProgram(), this.getProgram_Constants(), "ctx", null, 1, 1, PreparedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPreparedValue_Value(), this.getValueExpression(), null, "value", null, 1, 1, PreparedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPreparedValue_Name(), ecorePackage.getEString(), "name", null, 1, 1, PreparedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueReferenceEClass, ValueReference.class, "ValueReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueReference_Ref(), this.getPreparedValue(), null, "ref", null, 1, 1, ValueReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(comparatorEEnum, Comparator.class, "Comparator");
		addEEnumLiteral(comparatorEEnum, Comparator.GT);
		addEEnumLiteral(comparatorEEnum, Comparator.GE);
		addEEnumLiteral(comparatorEEnum, Comparator.LT);
		addEEnumLiteral(comparatorEEnum, Comparator.LE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// ComparatorDescription
		createComparatorDescriptionAnnotations();
	}

	/**
	 * Initializes the annotations for <b>ComparatorDescription</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createComparatorDescriptionAnnotations() {
		String source = "ComparatorDescription";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "GT: Greater than", null,
			   "GE: Greater or Equal than", null,
			   "LT: Less than", null,
			   "LE: Less or Equal than", null
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Comparator")
		   });
	}

} //MajordomoPackageImpl

/**
 */
package es.udima.cesarlaso.tfm.timers;

import es.udima.cesarlaso.tfm.events.EventsPackage;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see es.udima.cesarlaso.tfm.timers.TimersFactory
 * @model kind="package"
 * @generated
 */
public interface TimersPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "timers";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://tfm.cesarlaso.udima.es/timers";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "es.udima.cesarlaso.tfm.timers";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TimersPackage eINSTANCE = es.udima.cesarlaso.tfm.timers.impl.TimersPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.timers.impl.TimerImpl <em>Timer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.timers.impl.TimerImpl
	 * @see es.udima.cesarlaso.tfm.timers.impl.TimersPackageImpl#getTimer()
	 * @generated
	 */
	int TIMER = 0;

	/**
	 * The number of structural features of the '<em>Timer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Timer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.timers.impl.TimerEventImpl <em>Timer Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.timers.impl.TimerEventImpl
	 * @see es.udima.cesarlaso.tfm.timers.impl.TimersPackageImpl#getTimerEvent()
	 * @generated
	 */
	int TIMER_EVENT = 1;

	/**
	 * The feature id for the '<em><b>Actuators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_EVENT__ACTUATORS = EventsPackage.EVENT__ACTUATORS;

	/**
	 * The feature id for the '<em><b>Timer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_EVENT__TIMER = EventsPackage.EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Timer Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_EVENT_FEATURE_COUNT = EventsPackage.EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Timer Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_EVENT_OPERATION_COUNT = EventsPackage.EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.timers.impl.NowImpl <em>Now</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.timers.impl.NowImpl
	 * @see es.udima.cesarlaso.tfm.timers.impl.TimersPackageImpl#getNow()
	 * @generated
	 */
	int NOW = 2;

	/**
	 * The number of structural features of the '<em>Now</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOW_FEATURE_COUNT = TIMER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Now</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOW_OPERATION_COUNT = TIMER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.timers.impl.RepeatedImpl <em>Repeated</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.timers.impl.RepeatedImpl
	 * @see es.udima.cesarlaso.tfm.timers.impl.TimersPackageImpl#getRepeated()
	 * @generated
	 */
	int REPEATED = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEATED__VALUE = TIMER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Repeated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEATED_FEATURE_COUNT = TIMER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Repeated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEATED_OPERATION_COUNT = TIMER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.timers.impl.ClockImpl <em>Clock</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.timers.impl.ClockImpl
	 * @see es.udima.cesarlaso.tfm.timers.impl.TimersPackageImpl#getClock()
	 * @generated
	 */
	int CLOCK = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__VALUE = TIMER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Clock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_FEATURE_COUNT = TIMER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Clock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_OPERATION_COUNT = TIMER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.timers.impl.CronImpl <em>Cron</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.timers.impl.CronImpl
	 * @see es.udima.cesarlaso.tfm.timers.impl.TimersPackageImpl#getCron()
	 * @generated
	 */
	int CRON = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRON__VALUE = TIMER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cron</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRON_FEATURE_COUNT = TIMER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cron</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRON_OPERATION_COUNT = TIMER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.timers.impl.TimeImpl <em>Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.timers.impl.TimeImpl
	 * @see es.udima.cesarlaso.tfm.timers.impl.TimersPackageImpl#getTime()
	 * @generated
	 */
	int TIME = 6;

	/**
	 * The feature id for the '<em><b>Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__HOUR = 0;

	/**
	 * The feature id for the '<em><b>Minute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__MINUTE = 1;

	/**
	 * The feature id for the '<em><b>Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__SECOND = 2;

	/**
	 * The number of structural features of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.timers.impl.TimeUnitValueImpl <em>Time Unit Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.timers.impl.TimeUnitValueImpl
	 * @see es.udima.cesarlaso.tfm.timers.impl.TimersPackageImpl#getTimeUnitValue()
	 * @generated
	 */
	int TIME_UNIT_VALUE = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_UNIT_VALUE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_UNIT_VALUE__UNIT = 1;

	/**
	 * The number of structural features of the '<em>Time Unit Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_UNIT_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Time Unit Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_UNIT_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.udima.cesarlaso.tfm.timers.TimeUnitType <em>Time Unit Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.udima.cesarlaso.tfm.timers.TimeUnitType
	 * @see es.udima.cesarlaso.tfm.timers.impl.TimersPackageImpl#getTimeUnitType()
	 * @generated
	 */
	int TIME_UNIT_TYPE = 8;


	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.timers.Timer <em>Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timer</em>'.
	 * @see es.udima.cesarlaso.tfm.timers.Timer
	 * @generated
	 */
	EClass getTimer();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.timers.TimerEvent <em>Timer Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timer Event</em>'.
	 * @see es.udima.cesarlaso.tfm.timers.TimerEvent
	 * @generated
	 */
	EClass getTimerEvent();

	/**
	 * Returns the meta object for the containment reference '{@link es.udima.cesarlaso.tfm.timers.TimerEvent#getTimer <em>Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timer</em>'.
	 * @see es.udima.cesarlaso.tfm.timers.TimerEvent#getTimer()
	 * @see #getTimerEvent()
	 * @generated
	 */
	EReference getTimerEvent_Timer();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.timers.Now <em>Now</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Now</em>'.
	 * @see es.udima.cesarlaso.tfm.timers.Now
	 * @generated
	 */
	EClass getNow();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.timers.Repeated <em>Repeated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repeated</em>'.
	 * @see es.udima.cesarlaso.tfm.timers.Repeated
	 * @generated
	 */
	EClass getRepeated();

	/**
	 * Returns the meta object for the containment reference '{@link es.udima.cesarlaso.tfm.timers.Repeated#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see es.udima.cesarlaso.tfm.timers.Repeated#getValue()
	 * @see #getRepeated()
	 * @generated
	 */
	EReference getRepeated_Value();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.timers.Clock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clock</em>'.
	 * @see es.udima.cesarlaso.tfm.timers.Clock
	 * @generated
	 */
	EClass getClock();

	/**
	 * Returns the meta object for the containment reference '{@link es.udima.cesarlaso.tfm.timers.Clock#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see es.udima.cesarlaso.tfm.timers.Clock#getValue()
	 * @see #getClock()
	 * @generated
	 */
	EReference getClock_Value();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.timers.Cron <em>Cron</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cron</em>'.
	 * @see es.udima.cesarlaso.tfm.timers.Cron
	 * @generated
	 */
	EClass getCron();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.timers.Cron#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see es.udima.cesarlaso.tfm.timers.Cron#getValue()
	 * @see #getCron()
	 * @generated
	 */
	EAttribute getCron_Value();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.timers.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time</em>'.
	 * @see es.udima.cesarlaso.tfm.timers.Time
	 * @generated
	 */
	EClass getTime();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.timers.Time#getHour <em>Hour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hour</em>'.
	 * @see es.udima.cesarlaso.tfm.timers.Time#getHour()
	 * @see #getTime()
	 * @generated
	 */
	EAttribute getTime_Hour();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.timers.Time#getMinute <em>Minute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minute</em>'.
	 * @see es.udima.cesarlaso.tfm.timers.Time#getMinute()
	 * @see #getTime()
	 * @generated
	 */
	EAttribute getTime_Minute();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.timers.Time#getSecond <em>Second</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second</em>'.
	 * @see es.udima.cesarlaso.tfm.timers.Time#getSecond()
	 * @see #getTime()
	 * @generated
	 */
	EAttribute getTime_Second();

	/**
	 * Returns the meta object for class '{@link es.udima.cesarlaso.tfm.timers.TimeUnitValue <em>Time Unit Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Unit Value</em>'.
	 * @see es.udima.cesarlaso.tfm.timers.TimeUnitValue
	 * @generated
	 */
	EClass getTimeUnitValue();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.timers.TimeUnitValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see es.udima.cesarlaso.tfm.timers.TimeUnitValue#getValue()
	 * @see #getTimeUnitValue()
	 * @generated
	 */
	EAttribute getTimeUnitValue_Value();

	/**
	 * Returns the meta object for the attribute '{@link es.udima.cesarlaso.tfm.timers.TimeUnitValue#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see es.udima.cesarlaso.tfm.timers.TimeUnitValue#getUnit()
	 * @see #getTimeUnitValue()
	 * @generated
	 */
	EAttribute getTimeUnitValue_Unit();

	/**
	 * Returns the meta object for enum '{@link es.udima.cesarlaso.tfm.timers.TimeUnitType <em>Time Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Unit Type</em>'.
	 * @see es.udima.cesarlaso.tfm.timers.TimeUnitType
	 * @generated
	 */
	EEnum getTimeUnitType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TimersFactory getTimersFactory();

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
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.timers.impl.TimerImpl <em>Timer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.timers.impl.TimerImpl
		 * @see es.udima.cesarlaso.tfm.timers.impl.TimersPackageImpl#getTimer()
		 * @generated
		 */
		EClass TIMER = eINSTANCE.getTimer();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.timers.impl.TimerEventImpl <em>Timer Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.timers.impl.TimerEventImpl
		 * @see es.udima.cesarlaso.tfm.timers.impl.TimersPackageImpl#getTimerEvent()
		 * @generated
		 */
		EClass TIMER_EVENT = eINSTANCE.getTimerEvent();

		/**
		 * The meta object literal for the '<em><b>Timer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMER_EVENT__TIMER = eINSTANCE.getTimerEvent_Timer();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.timers.impl.NowImpl <em>Now</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.timers.impl.NowImpl
		 * @see es.udima.cesarlaso.tfm.timers.impl.TimersPackageImpl#getNow()
		 * @generated
		 */
		EClass NOW = eINSTANCE.getNow();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.timers.impl.RepeatedImpl <em>Repeated</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.timers.impl.RepeatedImpl
		 * @see es.udima.cesarlaso.tfm.timers.impl.TimersPackageImpl#getRepeated()
		 * @generated
		 */
		EClass REPEATED = eINSTANCE.getRepeated();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEATED__VALUE = eINSTANCE.getRepeated_Value();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.timers.impl.ClockImpl <em>Clock</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.timers.impl.ClockImpl
		 * @see es.udima.cesarlaso.tfm.timers.impl.TimersPackageImpl#getClock()
		 * @generated
		 */
		EClass CLOCK = eINSTANCE.getClock();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOCK__VALUE = eINSTANCE.getClock_Value();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.timers.impl.CronImpl <em>Cron</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.timers.impl.CronImpl
		 * @see es.udima.cesarlaso.tfm.timers.impl.TimersPackageImpl#getCron()
		 * @generated
		 */
		EClass CRON = eINSTANCE.getCron();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRON__VALUE = eINSTANCE.getCron_Value();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.timers.impl.TimeImpl <em>Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.timers.impl.TimeImpl
		 * @see es.udima.cesarlaso.tfm.timers.impl.TimersPackageImpl#getTime()
		 * @generated
		 */
		EClass TIME = eINSTANCE.getTime();

		/**
		 * The meta object literal for the '<em><b>Hour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME__HOUR = eINSTANCE.getTime_Hour();

		/**
		 * The meta object literal for the '<em><b>Minute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME__MINUTE = eINSTANCE.getTime_Minute();

		/**
		 * The meta object literal for the '<em><b>Second</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME__SECOND = eINSTANCE.getTime_Second();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.timers.impl.TimeUnitValueImpl <em>Time Unit Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.timers.impl.TimeUnitValueImpl
		 * @see es.udima.cesarlaso.tfm.timers.impl.TimersPackageImpl#getTimeUnitValue()
		 * @generated
		 */
		EClass TIME_UNIT_VALUE = eINSTANCE.getTimeUnitValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_UNIT_VALUE__VALUE = eINSTANCE.getTimeUnitValue_Value();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_UNIT_VALUE__UNIT = eINSTANCE.getTimeUnitValue_Unit();

		/**
		 * The meta object literal for the '{@link es.udima.cesarlaso.tfm.timers.TimeUnitType <em>Time Unit Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.udima.cesarlaso.tfm.timers.TimeUnitType
		 * @see es.udima.cesarlaso.tfm.timers.impl.TimersPackageImpl#getTimeUnitType()
		 * @generated
		 */
		EEnum TIME_UNIT_TYPE = eINSTANCE.getTimeUnitType();

	}

} //TimersPackage

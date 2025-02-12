/**
 */
package de.altimos.mdsd.majordomo.provider;

import de.altimos.mdsd.majordomo.util.MajordomoAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MajordomoItemProviderAdapterFactory extends MajordomoAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MajordomoItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.altimos.mdsd.majordomo.Majordomo} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MajordomoItemProvider majordomoItemProvider;

	/**
	 * This creates an adapter for a {@link de.altimos.mdsd.majordomo.Majordomo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMajordomoAdapter() {
		if (majordomoItemProvider == null) {
			majordomoItemProvider = new MajordomoItemProvider(this);
		}

		return majordomoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.altimos.mdsd.majordomo.House} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HouseItemProvider houseItemProvider;

	/**
	 * This creates an adapter for a {@link de.altimos.mdsd.majordomo.House}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHouseAdapter() {
		if (houseItemProvider == null) {
			houseItemProvider = new HouseItemProvider(this);
		}

		return houseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.altimos.mdsd.majordomo.Room} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomItemProvider roomItemProvider;

	/**
	 * This creates an adapter for a {@link de.altimos.mdsd.majordomo.Room}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRoomAdapter() {
		if (roomItemProvider == null) {
			roomItemProvider = new RoomItemProvider(this);
		}

		return roomItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.altimos.mdsd.majordomo.Rule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleItemProvider ruleItemProvider;

	/**
	 * This creates an adapter for a {@link de.altimos.mdsd.majordomo.Rule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRuleAdapter() {
		if (ruleItemProvider == null) {
			ruleItemProvider = new RuleItemProvider(this);
		}

		return ruleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.altimos.mdsd.majordomo.LightSensor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LightSensorItemProvider lightSensorItemProvider;

	/**
	 * This creates an adapter for a {@link de.altimos.mdsd.majordomo.LightSensor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLightSensorAdapter() {
		if (lightSensorItemProvider == null) {
			lightSensorItemProvider = new LightSensorItemProvider(this);
		}

		return lightSensorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.altimos.mdsd.majordomo.TemperatureSensor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemperatureSensorItemProvider temperatureSensorItemProvider;

	/**
	 * This creates an adapter for a {@link de.altimos.mdsd.majordomo.TemperatureSensor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTemperatureSensorAdapter() {
		if (temperatureSensorItemProvider == null) {
			temperatureSensorItemProvider = new TemperatureSensorItemProvider(this);
		}

		return temperatureSensorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.altimos.mdsd.majordomo.RainSensor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RainSensorItemProvider rainSensorItemProvider;

	/**
	 * This creates an adapter for a {@link de.altimos.mdsd.majordomo.RainSensor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRainSensorAdapter() {
		if (rainSensorItemProvider == null) {
			rainSensorItemProvider = new RainSensorItemProvider(this);
		}

		return rainSensorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.altimos.mdsd.majordomo.SwitchSensor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwitchSensorItemProvider switchSensorItemProvider;

	/**
	 * This creates an adapter for a {@link de.altimos.mdsd.majordomo.SwitchSensor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSwitchSensorAdapter() {
		if (switchSensorItemProvider == null) {
			switchSensorItemProvider = new SwitchSensorItemProvider(this);
		}

		return switchSensorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.altimos.mdsd.majordomo.NumberSensor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumberSensorItemProvider numberSensorItemProvider;

	/**
	 * This creates an adapter for a {@link de.altimos.mdsd.majordomo.NumberSensor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNumberSensorAdapter() {
		if (numberSensorItemProvider == null) {
			numberSensorItemProvider = new NumberSensorItemProvider(this);
		}

		return numberSensorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.altimos.mdsd.majordomo.ClockSensor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClockSensorItemProvider clockSensorItemProvider;

	/**
	 * This creates an adapter for a {@link de.altimos.mdsd.majordomo.ClockSensor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClockSensorAdapter() {
		if (clockSensorItemProvider == null) {
			clockSensorItemProvider = new ClockSensorItemProvider(this);
		}

		return clockSensorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.altimos.mdsd.majordomo.LampActor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LampActorItemProvider lampActorItemProvider;

	/**
	 * This creates an adapter for a {@link de.altimos.mdsd.majordomo.LampActor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLampActorAdapter() {
		if (lampActorItemProvider == null) {
			lampActorItemProvider = new LampActorItemProvider(this);
		}

		return lampActorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.altimos.mdsd.majordomo.RollerActor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RollerActorItemProvider rollerActorItemProvider;

	/**
	 * This creates an adapter for a {@link de.altimos.mdsd.majordomo.RollerActor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRollerActorAdapter() {
		if (rollerActorItemProvider == null) {
			rollerActorItemProvider = new RollerActorItemProvider(this);
		}

		return rollerActorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.altimos.mdsd.majordomo.RoofWindowActor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoofWindowActorItemProvider roofWindowActorItemProvider;

	/**
	 * This creates an adapter for a {@link de.altimos.mdsd.majordomo.RoofWindowActor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRoofWindowActorAdapter() {
		if (roofWindowActorItemProvider == null) {
			roofWindowActorItemProvider = new RoofWindowActorItemProvider(this);
		}

		return roofWindowActorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.altimos.mdsd.majordomo.BoilerActor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoilerActorItemProvider boilerActorItemProvider;

	/**
	 * This creates an adapter for a {@link de.altimos.mdsd.majordomo.BoilerActor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBoilerActorAdapter() {
		if (boilerActorItemProvider == null) {
			boilerActorItemProvider = new BoilerActorItemProvider(this);
		}

		return boilerActorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.altimos.mdsd.majordomo.RadiatorActor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RadiatorActorItemProvider radiatorActorItemProvider;

	/**
	 * This creates an adapter for a {@link de.altimos.mdsd.majordomo.RadiatorActor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRadiatorActorAdapter() {
		if (radiatorActorItemProvider == null) {
			radiatorActorItemProvider = new RadiatorActorItemProvider(this);
		}

		return radiatorActorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.altimos.mdsd.majordomo.FloatAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FloatActionItemProvider floatActionItemProvider;

	/**
	 * This creates an adapter for a {@link de.altimos.mdsd.majordomo.FloatAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFloatActionAdapter() {
		if (floatActionItemProvider == null) {
			floatActionItemProvider = new FloatActionItemProvider(this);
		}

		return floatActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.altimos.mdsd.majordomo.BooleanAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanActionItemProvider booleanActionItemProvider;

	/**
	 * This creates an adapter for a {@link de.altimos.mdsd.majordomo.BooleanAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBooleanActionAdapter() {
		if (booleanActionItemProvider == null) {
			booleanActionItemProvider = new BooleanActionItemProvider(this);
		}

		return booleanActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.altimos.mdsd.majordomo.CoffeeActor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoffeeActorItemProvider coffeeActorItemProvider;

	/**
	 * This creates an adapter for a {@link de.altimos.mdsd.majordomo.CoffeeActor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCoffeeActorAdapter() {
		if (coffeeActorItemProvider == null) {
			coffeeActorItemProvider = new CoffeeActorItemProvider(this);
		}

		return coffeeActorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.altimos.mdsd.majordomo.NotOperation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotOperationItemProvider notOperationItemProvider;

	/**
	 * This creates an adapter for a {@link de.altimos.mdsd.majordomo.NotOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNotOperationAdapter() {
		if (notOperationItemProvider == null) {
			notOperationItemProvider = new NotOperationItemProvider(this);
		}

		return notOperationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.altimos.mdsd.majordomo.CompareOperation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompareOperationItemProvider compareOperationItemProvider;

	/**
	 * This creates an adapter for a {@link de.altimos.mdsd.majordomo.CompareOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompareOperationAdapter() {
		if (compareOperationItemProvider == null) {
			compareOperationItemProvider = new CompareOperationItemProvider(this);
		}

		return compareOperationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.altimos.mdsd.majordomo.BooleanSensorStatement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanSensorStatementItemProvider booleanSensorStatementItemProvider;

	/**
	 * This creates an adapter for a {@link de.altimos.mdsd.majordomo.BooleanSensorStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBooleanSensorStatementAdapter() {
		if (booleanSensorStatementItemProvider == null) {
			booleanSensorStatementItemProvider = new BooleanSensorStatementItemProvider(this);
		}

		return booleanSensorStatementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.altimos.mdsd.majordomo.ConstantValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstantValueItemProvider constantValueItemProvider;

	/**
	 * This creates an adapter for a {@link de.altimos.mdsd.majordomo.ConstantValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConstantValueAdapter() {
		if (constantValueItemProvider == null) {
			constantValueItemProvider = new ConstantValueItemProvider(this);
		}

		return constantValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.altimos.mdsd.majordomo.SensorValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorValueItemProvider sensorValueItemProvider;

	/**
	 * This creates an adapter for a {@link de.altimos.mdsd.majordomo.SensorValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSensorValueAdapter() {
		if (sensorValueItemProvider == null) {
			sensorValueItemProvider = new SensorValueItemProvider(this);
		}

		return sensorValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.altimos.mdsd.majordomo.StatementReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatementReferenceItemProvider statementReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link de.altimos.mdsd.majordomo.StatementReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStatementReferenceAdapter() {
		if (statementReferenceItemProvider == null) {
			statementReferenceItemProvider = new StatementReferenceItemProvider(this);
		}

		return statementReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.altimos.mdsd.majordomo.Program} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramItemProvider programItemProvider;

	/**
	 * This creates an adapter for a {@link de.altimos.mdsd.majordomo.Program}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProgramAdapter() {
		if (programItemProvider == null) {
			programItemProvider = new ProgramItemProvider(this);
		}

		return programItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.altimos.mdsd.majordomo.PreparedStatement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreparedStatementItemProvider preparedStatementItemProvider;

	/**
	 * This creates an adapter for a {@link de.altimos.mdsd.majordomo.PreparedStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPreparedStatementAdapter() {
		if (preparedStatementItemProvider == null) {
			preparedStatementItemProvider = new PreparedStatementItemProvider(this);
		}

		return preparedStatementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.altimos.mdsd.majordomo.PreparedActionSet} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreparedActionSetItemProvider preparedActionSetItemProvider;

	/**
	 * This creates an adapter for a {@link de.altimos.mdsd.majordomo.PreparedActionSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPreparedActionSetAdapter() {
		if (preparedActionSetItemProvider == null) {
			preparedActionSetItemProvider = new PreparedActionSetItemProvider(this);
		}

		return preparedActionSetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.altimos.mdsd.majordomo.ActionSetReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionSetReferenceItemProvider actionSetReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link de.altimos.mdsd.majordomo.ActionSetReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActionSetReferenceAdapter() {
		if (actionSetReferenceItemProvider == null) {
			actionSetReferenceItemProvider = new ActionSetReferenceItemProvider(this);
		}

		return actionSetReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.altimos.mdsd.majordomo.BinaryAndOperation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryAndOperationItemProvider binaryAndOperationItemProvider;

	/**
	 * This creates an adapter for a {@link de.altimos.mdsd.majordomo.BinaryAndOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBinaryAndOperationAdapter() {
		if (binaryAndOperationItemProvider == null) {
			binaryAndOperationItemProvider = new BinaryAndOperationItemProvider(this);
		}

		return binaryAndOperationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.altimos.mdsd.majordomo.BinaryOrOperation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryOrOperationItemProvider binaryOrOperationItemProvider;

	/**
	 * This creates an adapter for a {@link de.altimos.mdsd.majordomo.BinaryOrOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBinaryOrOperationAdapter() {
		if (binaryOrOperationItemProvider == null) {
			binaryOrOperationItemProvider = new BinaryOrOperationItemProvider(this);
		}

		return binaryOrOperationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.altimos.mdsd.majordomo.PreparedValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreparedValueItemProvider preparedValueItemProvider;

	/**
	 * This creates an adapter for a {@link de.altimos.mdsd.majordomo.PreparedValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPreparedValueAdapter() {
		if (preparedValueItemProvider == null) {
			preparedValueItemProvider = new PreparedValueItemProvider(this);
		}

		return preparedValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.altimos.mdsd.majordomo.ValueReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueReferenceItemProvider valueReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link de.altimos.mdsd.majordomo.ValueReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createValueReferenceAdapter() {
		if (valueReferenceItemProvider == null) {
			valueReferenceItemProvider = new ValueReferenceItemProvider(this);
		}

		return valueReferenceItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (majordomoItemProvider != null) majordomoItemProvider.dispose();
		if (houseItemProvider != null) houseItemProvider.dispose();
		if (roomItemProvider != null) roomItemProvider.dispose();
		if (ruleItemProvider != null) ruleItemProvider.dispose();
		if (lightSensorItemProvider != null) lightSensorItemProvider.dispose();
		if (temperatureSensorItemProvider != null) temperatureSensorItemProvider.dispose();
		if (rainSensorItemProvider != null) rainSensorItemProvider.dispose();
		if (switchSensorItemProvider != null) switchSensorItemProvider.dispose();
		if (numberSensorItemProvider != null) numberSensorItemProvider.dispose();
		if (clockSensorItemProvider != null) clockSensorItemProvider.dispose();
		if (lampActorItemProvider != null) lampActorItemProvider.dispose();
		if (rollerActorItemProvider != null) rollerActorItemProvider.dispose();
		if (roofWindowActorItemProvider != null) roofWindowActorItemProvider.dispose();
		if (boilerActorItemProvider != null) boilerActorItemProvider.dispose();
		if (radiatorActorItemProvider != null) radiatorActorItemProvider.dispose();
		if (floatActionItemProvider != null) floatActionItemProvider.dispose();
		if (booleanActionItemProvider != null) booleanActionItemProvider.dispose();
		if (coffeeActorItemProvider != null) coffeeActorItemProvider.dispose();
		if (notOperationItemProvider != null) notOperationItemProvider.dispose();
		if (compareOperationItemProvider != null) compareOperationItemProvider.dispose();
		if (booleanSensorStatementItemProvider != null) booleanSensorStatementItemProvider.dispose();
		if (constantValueItemProvider != null) constantValueItemProvider.dispose();
		if (sensorValueItemProvider != null) sensorValueItemProvider.dispose();
		if (statementReferenceItemProvider != null) statementReferenceItemProvider.dispose();
		if (programItemProvider != null) programItemProvider.dispose();
		if (preparedStatementItemProvider != null) preparedStatementItemProvider.dispose();
		if (preparedActionSetItemProvider != null) preparedActionSetItemProvider.dispose();
		if (actionSetReferenceItemProvider != null) actionSetReferenceItemProvider.dispose();
		if (binaryAndOperationItemProvider != null) binaryAndOperationItemProvider.dispose();
		if (binaryOrOperationItemProvider != null) binaryOrOperationItemProvider.dispose();
		if (preparedValueItemProvider != null) preparedValueItemProvider.dispose();
		if (valueReferenceItemProvider != null) valueReferenceItemProvider.dispose();
	}

}

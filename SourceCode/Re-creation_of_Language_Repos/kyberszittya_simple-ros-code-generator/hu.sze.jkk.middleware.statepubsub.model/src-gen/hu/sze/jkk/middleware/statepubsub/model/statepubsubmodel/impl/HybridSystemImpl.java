/**
 */
package hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl;

import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Activity;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.ContinuousVariable;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.DiscreteEvent;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.HybridSystem;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Invariant;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Location;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Transition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hybrid System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.HybridSystemImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.HybridSystemImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.HybridSystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.HybridSystemImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.HybridSystemImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.HybridSystemImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.HybridSystemImpl#getInvariant <em>Invariant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HybridSystemImpl extends BehaviorImpl implements HybridSystem {
	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> location;

	/**
	 * The cached value of the '{@link #getTransition() <em>Transition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transition;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<ContinuousVariable> variable;

	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity> activity;

	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<DiscreteEvent> event;

	/**
	 * The cached value of the '{@link #getInvariant() <em>Invariant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvariant()
	 * @generated
	 * @ordered
	 */
	protected EList<Invariant> invariant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HybridSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatepubsubmodelPackage.Literals.HYBRID_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Location> getLocation() {
		if (location == null) {
			location = new EObjectContainmentEList<Location>(Location.class, this,
					StatepubsubmodelPackage.HYBRID_SYSTEM__LOCATION);
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransition() {
		if (transition == null) {
			transition = new EObjectContainmentEList<Transition>(Transition.class, this,
					StatepubsubmodelPackage.HYBRID_SYSTEM__TRANSITION);
		}
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatepubsubmodelPackage.HYBRID_SYSTEM__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContinuousVariable> getVariable() {
		if (variable == null) {
			variable = new EObjectContainmentEList<ContinuousVariable>(ContinuousVariable.class, this,
					StatepubsubmodelPackage.HYBRID_SYSTEM__VARIABLE);
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity> getActivity() {
		if (activity == null) {
			activity = new EObjectContainmentEList<Activity>(Activity.class, this,
					StatepubsubmodelPackage.HYBRID_SYSTEM__ACTIVITY);
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiscreteEvent> getEvent() {
		if (event == null) {
			event = new EObjectContainmentEList<DiscreteEvent>(DiscreteEvent.class, this,
					StatepubsubmodelPackage.HYBRID_SYSTEM__EVENT);
		}
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Invariant> getInvariant() {
		if (invariant == null) {
			invariant = new EObjectContainmentEList<Invariant>(Invariant.class, this,
					StatepubsubmodelPackage.HYBRID_SYSTEM__INVARIANT);
		}
		return invariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StatepubsubmodelPackage.HYBRID_SYSTEM__LOCATION:
			return ((InternalEList<?>) getLocation()).basicRemove(otherEnd, msgs);
		case StatepubsubmodelPackage.HYBRID_SYSTEM__TRANSITION:
			return ((InternalEList<?>) getTransition()).basicRemove(otherEnd, msgs);
		case StatepubsubmodelPackage.HYBRID_SYSTEM__VARIABLE:
			return ((InternalEList<?>) getVariable()).basicRemove(otherEnd, msgs);
		case StatepubsubmodelPackage.HYBRID_SYSTEM__ACTIVITY:
			return ((InternalEList<?>) getActivity()).basicRemove(otherEnd, msgs);
		case StatepubsubmodelPackage.HYBRID_SYSTEM__EVENT:
			return ((InternalEList<?>) getEvent()).basicRemove(otherEnd, msgs);
		case StatepubsubmodelPackage.HYBRID_SYSTEM__INVARIANT:
			return ((InternalEList<?>) getInvariant()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StatepubsubmodelPackage.HYBRID_SYSTEM__LOCATION:
			return getLocation();
		case StatepubsubmodelPackage.HYBRID_SYSTEM__TRANSITION:
			return getTransition();
		case StatepubsubmodelPackage.HYBRID_SYSTEM__NAME:
			return getName();
		case StatepubsubmodelPackage.HYBRID_SYSTEM__VARIABLE:
			return getVariable();
		case StatepubsubmodelPackage.HYBRID_SYSTEM__ACTIVITY:
			return getActivity();
		case StatepubsubmodelPackage.HYBRID_SYSTEM__EVENT:
			return getEvent();
		case StatepubsubmodelPackage.HYBRID_SYSTEM__INVARIANT:
			return getInvariant();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case StatepubsubmodelPackage.HYBRID_SYSTEM__LOCATION:
			getLocation().clear();
			getLocation().addAll((Collection<? extends Location>) newValue);
			return;
		case StatepubsubmodelPackage.HYBRID_SYSTEM__TRANSITION:
			getTransition().clear();
			getTransition().addAll((Collection<? extends Transition>) newValue);
			return;
		case StatepubsubmodelPackage.HYBRID_SYSTEM__NAME:
			setName((String) newValue);
			return;
		case StatepubsubmodelPackage.HYBRID_SYSTEM__VARIABLE:
			getVariable().clear();
			getVariable().addAll((Collection<? extends ContinuousVariable>) newValue);
			return;
		case StatepubsubmodelPackage.HYBRID_SYSTEM__ACTIVITY:
			getActivity().clear();
			getActivity().addAll((Collection<? extends Activity>) newValue);
			return;
		case StatepubsubmodelPackage.HYBRID_SYSTEM__EVENT:
			getEvent().clear();
			getEvent().addAll((Collection<? extends DiscreteEvent>) newValue);
			return;
		case StatepubsubmodelPackage.HYBRID_SYSTEM__INVARIANT:
			getInvariant().clear();
			getInvariant().addAll((Collection<? extends Invariant>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case StatepubsubmodelPackage.HYBRID_SYSTEM__LOCATION:
			getLocation().clear();
			return;
		case StatepubsubmodelPackage.HYBRID_SYSTEM__TRANSITION:
			getTransition().clear();
			return;
		case StatepubsubmodelPackage.HYBRID_SYSTEM__NAME:
			setName(NAME_EDEFAULT);
			return;
		case StatepubsubmodelPackage.HYBRID_SYSTEM__VARIABLE:
			getVariable().clear();
			return;
		case StatepubsubmodelPackage.HYBRID_SYSTEM__ACTIVITY:
			getActivity().clear();
			return;
		case StatepubsubmodelPackage.HYBRID_SYSTEM__EVENT:
			getEvent().clear();
			return;
		case StatepubsubmodelPackage.HYBRID_SYSTEM__INVARIANT:
			getInvariant().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case StatepubsubmodelPackage.HYBRID_SYSTEM__LOCATION:
			return location != null && !location.isEmpty();
		case StatepubsubmodelPackage.HYBRID_SYSTEM__TRANSITION:
			return transition != null && !transition.isEmpty();
		case StatepubsubmodelPackage.HYBRID_SYSTEM__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case StatepubsubmodelPackage.HYBRID_SYSTEM__VARIABLE:
			return variable != null && !variable.isEmpty();
		case StatepubsubmodelPackage.HYBRID_SYSTEM__ACTIVITY:
			return activity != null && !activity.isEmpty();
		case StatepubsubmodelPackage.HYBRID_SYSTEM__EVENT:
			return event != null && !event.isEmpty();
		case StatepubsubmodelPackage.HYBRID_SYSTEM__INVARIANT:
			return invariant != null && !invariant.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //HybridSystemImpl

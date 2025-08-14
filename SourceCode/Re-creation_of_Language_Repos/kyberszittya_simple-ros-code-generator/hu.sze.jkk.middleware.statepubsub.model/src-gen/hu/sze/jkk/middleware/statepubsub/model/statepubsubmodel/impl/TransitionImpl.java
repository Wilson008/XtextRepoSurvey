/**
 */
package hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl;

import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.ContinuousVariable;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.DiscreteEvent;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Location;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Transition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.TransitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.TransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.TransitionImpl#getDiscreteevent <em>Discreteevent</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.TransitionImpl#getContinuousvariable <em>Continuousvariable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition {
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
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Location target;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Location source;

	/**
	 * The cached value of the '{@link #getDiscreteevent() <em>Discreteevent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscreteevent()
	 * @generated
	 * @ordered
	 */
	protected DiscreteEvent discreteevent;

	/**
	 * The cached value of the '{@link #getContinuousvariable() <em>Continuousvariable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContinuousvariable()
	 * @generated
	 * @ordered
	 */
	protected ContinuousVariable continuousvariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatepubsubmodelPackage.Literals.TRANSITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StatepubsubmodelPackage.TRANSITION__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (Location) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StatepubsubmodelPackage.TRANSITION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Location newTarget) {
		Location oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatepubsubmodelPackage.TRANSITION__TARGET, oldTarget,
					target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (Location) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StatepubsubmodelPackage.TRANSITION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Location newSource) {
		Location oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatepubsubmodelPackage.TRANSITION__SOURCE, oldSource,
					source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteEvent getDiscreteevent() {
		if (discreteevent != null && discreteevent.eIsProxy()) {
			InternalEObject oldDiscreteevent = (InternalEObject) discreteevent;
			discreteevent = (DiscreteEvent) eResolveProxy(oldDiscreteevent);
			if (discreteevent != oldDiscreteevent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StatepubsubmodelPackage.TRANSITION__DISCRETEEVENT, oldDiscreteevent, discreteevent));
			}
		}
		return discreteevent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteEvent basicGetDiscreteevent() {
		return discreteevent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscreteevent(DiscreteEvent newDiscreteevent) {
		DiscreteEvent oldDiscreteevent = discreteevent;
		discreteevent = newDiscreteevent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatepubsubmodelPackage.TRANSITION__DISCRETEEVENT,
					oldDiscreteevent, discreteevent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuousVariable getContinuousvariable() {
		if (continuousvariable != null && continuousvariable.eIsProxy()) {
			InternalEObject oldContinuousvariable = (InternalEObject) continuousvariable;
			continuousvariable = (ContinuousVariable) eResolveProxy(oldContinuousvariable);
			if (continuousvariable != oldContinuousvariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StatepubsubmodelPackage.TRANSITION__CONTINUOUSVARIABLE, oldContinuousvariable,
							continuousvariable));
			}
		}
		return continuousvariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuousVariable basicGetContinuousvariable() {
		return continuousvariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContinuousvariable(ContinuousVariable newContinuousvariable) {
		ContinuousVariable oldContinuousvariable = continuousvariable;
		continuousvariable = newContinuousvariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StatepubsubmodelPackage.TRANSITION__CONTINUOUSVARIABLE, oldContinuousvariable, continuousvariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StatepubsubmodelPackage.TRANSITION__NAME:
			return getName();
		case StatepubsubmodelPackage.TRANSITION__TARGET:
			if (resolve)
				return getTarget();
			return basicGetTarget();
		case StatepubsubmodelPackage.TRANSITION__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case StatepubsubmodelPackage.TRANSITION__DISCRETEEVENT:
			if (resolve)
				return getDiscreteevent();
			return basicGetDiscreteevent();
		case StatepubsubmodelPackage.TRANSITION__CONTINUOUSVARIABLE:
			if (resolve)
				return getContinuousvariable();
			return basicGetContinuousvariable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case StatepubsubmodelPackage.TRANSITION__NAME:
			setName((String) newValue);
			return;
		case StatepubsubmodelPackage.TRANSITION__TARGET:
			setTarget((Location) newValue);
			return;
		case StatepubsubmodelPackage.TRANSITION__SOURCE:
			setSource((Location) newValue);
			return;
		case StatepubsubmodelPackage.TRANSITION__DISCRETEEVENT:
			setDiscreteevent((DiscreteEvent) newValue);
			return;
		case StatepubsubmodelPackage.TRANSITION__CONTINUOUSVARIABLE:
			setContinuousvariable((ContinuousVariable) newValue);
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
		case StatepubsubmodelPackage.TRANSITION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case StatepubsubmodelPackage.TRANSITION__TARGET:
			setTarget((Location) null);
			return;
		case StatepubsubmodelPackage.TRANSITION__SOURCE:
			setSource((Location) null);
			return;
		case StatepubsubmodelPackage.TRANSITION__DISCRETEEVENT:
			setDiscreteevent((DiscreteEvent) null);
			return;
		case StatepubsubmodelPackage.TRANSITION__CONTINUOUSVARIABLE:
			setContinuousvariable((ContinuousVariable) null);
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
		case StatepubsubmodelPackage.TRANSITION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case StatepubsubmodelPackage.TRANSITION__TARGET:
			return target != null;
		case StatepubsubmodelPackage.TRANSITION__SOURCE:
			return source != null;
		case StatepubsubmodelPackage.TRANSITION__DISCRETEEVENT:
			return discreteevent != null;
		case StatepubsubmodelPackage.TRANSITION__CONTINUOUSVARIABLE:
			return continuousvariable != null;
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

} //TransitionImpl

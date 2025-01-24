/**
 */
package hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl;

import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.FuzzyHybridSystem;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.RuleSet;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fuzzy Hybrid System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.FuzzyHybridSystemImpl#getRuleset <em>Ruleset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FuzzyHybridSystemImpl extends HybridSystemImpl implements FuzzyHybridSystem {
	/**
	 * The cached value of the '{@link #getRuleset() <em>Ruleset</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleset()
	 * @generated
	 * @ordered
	 */
	protected EList<RuleSet> ruleset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FuzzyHybridSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatepubsubmodelPackage.Literals.FUZZY_HYBRID_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RuleSet> getRuleset() {
		if (ruleset == null) {
			ruleset = new EObjectContainmentEList<RuleSet>(RuleSet.class, this,
					StatepubsubmodelPackage.FUZZY_HYBRID_SYSTEM__RULESET);
		}
		return ruleset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StatepubsubmodelPackage.FUZZY_HYBRID_SYSTEM__RULESET:
			return ((InternalEList<?>) getRuleset()).basicRemove(otherEnd, msgs);
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
		case StatepubsubmodelPackage.FUZZY_HYBRID_SYSTEM__RULESET:
			return getRuleset();
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
		case StatepubsubmodelPackage.FUZZY_HYBRID_SYSTEM__RULESET:
			getRuleset().clear();
			getRuleset().addAll((Collection<? extends RuleSet>) newValue);
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
		case StatepubsubmodelPackage.FUZZY_HYBRID_SYSTEM__RULESET:
			getRuleset().clear();
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
		case StatepubsubmodelPackage.FUZZY_HYBRID_SYSTEM__RULESET:
			return ruleset != null && !ruleset.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FuzzyHybridSystemImpl

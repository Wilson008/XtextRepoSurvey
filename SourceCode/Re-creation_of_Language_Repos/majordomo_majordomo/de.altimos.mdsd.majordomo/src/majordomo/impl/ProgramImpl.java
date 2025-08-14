/**
 */
package majordomo.impl;

import java.util.Collection;

import majordomo.MajordomoPackage;
import majordomo.PreparedActionSet;
import majordomo.PreparedStatement;
import majordomo.PreparedValue;
import majordomo.Program;
import majordomo.Rule;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link majordomo.impl.ProgramImpl#getConstants <em>Constants</em>}</li>
 *   <li>{@link majordomo.impl.ProgramImpl#getPreparedStatements <em>Prepared Statements</em>}</li>
 *   <li>{@link majordomo.impl.ProgramImpl#getPreparedActionSets <em>Prepared Action Sets</em>}</li>
 *   <li>{@link majordomo.impl.ProgramImpl#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramImpl extends MinimalEObjectImpl.Container implements Program {
	/**
	 * The cached value of the '{@link #getConstants() <em>Constants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstants()
	 * @generated
	 * @ordered
	 */
	protected EList<PreparedValue> constants;

	/**
	 * The cached value of the '{@link #getPreparedStatements() <em>Prepared Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreparedStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<PreparedStatement> preparedStatements;

	/**
	 * The cached value of the '{@link #getPreparedActionSets() <em>Prepared Action Sets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreparedActionSets()
	 * @generated
	 * @ordered
	 */
	protected EList<PreparedActionSet> preparedActionSets;

	/**
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected EList<Rule> rules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MajordomoPackage.Literals.PROGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PreparedValue> getConstants() {
		if (constants == null) {
			constants = new EObjectContainmentWithInverseEList<PreparedValue>(PreparedValue.class, this, MajordomoPackage.PROGRAM__CONSTANTS, MajordomoPackage.PREPARED_VALUE__CTX);
		}
		return constants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PreparedStatement> getPreparedStatements() {
		if (preparedStatements == null) {
			preparedStatements = new EObjectContainmentWithInverseEList<PreparedStatement>(PreparedStatement.class, this, MajordomoPackage.PROGRAM__PREPARED_STATEMENTS, MajordomoPackage.PREPARED_STATEMENT__CTX);
		}
		return preparedStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PreparedActionSet> getPreparedActionSets() {
		if (preparedActionSets == null) {
			preparedActionSets = new EObjectContainmentWithInverseEList<PreparedActionSet>(PreparedActionSet.class, this, MajordomoPackage.PROGRAM__PREPARED_ACTION_SETS, MajordomoPackage.PREPARED_ACTION_SET__CTX);
		}
		return preparedActionSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Rule> getRules() {
		if (rules == null) {
			rules = new EObjectContainmentEList<Rule>(Rule.class, this, MajordomoPackage.PROGRAM__RULES);
		}
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MajordomoPackage.PROGRAM__CONSTANTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConstants()).basicAdd(otherEnd, msgs);
			case MajordomoPackage.PROGRAM__PREPARED_STATEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPreparedStatements()).basicAdd(otherEnd, msgs);
			case MajordomoPackage.PROGRAM__PREPARED_ACTION_SETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPreparedActionSets()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MajordomoPackage.PROGRAM__CONSTANTS:
				return ((InternalEList<?>)getConstants()).basicRemove(otherEnd, msgs);
			case MajordomoPackage.PROGRAM__PREPARED_STATEMENTS:
				return ((InternalEList<?>)getPreparedStatements()).basicRemove(otherEnd, msgs);
			case MajordomoPackage.PROGRAM__PREPARED_ACTION_SETS:
				return ((InternalEList<?>)getPreparedActionSets()).basicRemove(otherEnd, msgs);
			case MajordomoPackage.PROGRAM__RULES:
				return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
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
			case MajordomoPackage.PROGRAM__CONSTANTS:
				return getConstants();
			case MajordomoPackage.PROGRAM__PREPARED_STATEMENTS:
				return getPreparedStatements();
			case MajordomoPackage.PROGRAM__PREPARED_ACTION_SETS:
				return getPreparedActionSets();
			case MajordomoPackage.PROGRAM__RULES:
				return getRules();
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
			case MajordomoPackage.PROGRAM__CONSTANTS:
				getConstants().clear();
				getConstants().addAll((Collection<? extends PreparedValue>)newValue);
				return;
			case MajordomoPackage.PROGRAM__PREPARED_STATEMENTS:
				getPreparedStatements().clear();
				getPreparedStatements().addAll((Collection<? extends PreparedStatement>)newValue);
				return;
			case MajordomoPackage.PROGRAM__PREPARED_ACTION_SETS:
				getPreparedActionSets().clear();
				getPreparedActionSets().addAll((Collection<? extends PreparedActionSet>)newValue);
				return;
			case MajordomoPackage.PROGRAM__RULES:
				getRules().clear();
				getRules().addAll((Collection<? extends Rule>)newValue);
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
			case MajordomoPackage.PROGRAM__CONSTANTS:
				getConstants().clear();
				return;
			case MajordomoPackage.PROGRAM__PREPARED_STATEMENTS:
				getPreparedStatements().clear();
				return;
			case MajordomoPackage.PROGRAM__PREPARED_ACTION_SETS:
				getPreparedActionSets().clear();
				return;
			case MajordomoPackage.PROGRAM__RULES:
				getRules().clear();
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
			case MajordomoPackage.PROGRAM__CONSTANTS:
				return constants != null && !constants.isEmpty();
			case MajordomoPackage.PROGRAM__PREPARED_STATEMENTS:
				return preparedStatements != null && !preparedStatements.isEmpty();
			case MajordomoPackage.PROGRAM__PREPARED_ACTION_SETS:
				return preparedActionSets != null && !preparedActionSets.isEmpty();
			case MajordomoPackage.PROGRAM__RULES:
				return rules != null && !rules.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProgramImpl

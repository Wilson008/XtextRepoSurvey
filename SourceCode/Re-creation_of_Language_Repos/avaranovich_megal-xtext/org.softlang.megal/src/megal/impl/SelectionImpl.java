/**
 */
package megal.impl;

import java.util.Collection;

import megal.MegalPackage;
import megal.QueryEntry;
import megal.QueryStatement;
import megal.Selection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Selection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link megal.impl.SelectionImpl#getSelect <em>Select</em>}</li>
 *   <li>{@link megal.impl.SelectionImpl#getQuery <em>Query</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectionImpl extends MinimalEObjectImpl.Container implements Selection {
	/**
	 * The cached value of the '{@link #getSelect() <em>Select</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelect()
	 * @generated
	 * @ordered
	 */
	protected EList<QueryEntry> select;

	/**
	 * The cached value of the '{@link #getQuery() <em>Query</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected EList<QueryStatement> query;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MegalPackage.Literals.SELECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QueryEntry> getSelect() {
		if (select == null) {
			select = new EObjectContainmentEList<QueryEntry>(QueryEntry.class, this, MegalPackage.SELECTION__SELECT);
		}
		return select;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QueryStatement> getQuery() {
		if (query == null) {
			query = new EObjectContainmentEList<QueryStatement>(QueryStatement.class, this, MegalPackage.SELECTION__QUERY);
		}
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MegalPackage.SELECTION__SELECT:
				return ((InternalEList<?>)getSelect()).basicRemove(otherEnd, msgs);
			case MegalPackage.SELECTION__QUERY:
				return ((InternalEList<?>)getQuery()).basicRemove(otherEnd, msgs);
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
			case MegalPackage.SELECTION__SELECT:
				return getSelect();
			case MegalPackage.SELECTION__QUERY:
				return getQuery();
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
			case MegalPackage.SELECTION__SELECT:
				getSelect().clear();
				getSelect().addAll((Collection<? extends QueryEntry>)newValue);
				return;
			case MegalPackage.SELECTION__QUERY:
				getQuery().clear();
				getQuery().addAll((Collection<? extends QueryStatement>)newValue);
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
			case MegalPackage.SELECTION__SELECT:
				getSelect().clear();
				return;
			case MegalPackage.SELECTION__QUERY:
				getQuery().clear();
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
			case MegalPackage.SELECTION__SELECT:
				return select != null && !select.isEmpty();
			case MegalPackage.SELECTION__QUERY:
				return query != null && !query.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SelectionImpl

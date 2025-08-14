/**
 */
package hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl;

import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.AbstractRosFileElement;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.FilePackage;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.FilterDefinition;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.FilePackageImpl#getAbstractroselement <em>Abstractroselement</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.FilePackageImpl#getFilter <em>Filter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FilePackageImpl extends RosElementImpl implements FilePackage {
	/**
	 * The cached value of the '{@link #getAbstractroselement() <em>Abstractroselement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractroselement()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractRosFileElement> abstractroselement;

	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected EList<FilterDefinition> filter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilePackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatepubsubmodelPackage.Literals.FILE_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractRosFileElement> getAbstractroselement() {
		if (abstractroselement == null) {
			abstractroselement = new EObjectContainmentWithInverseEList<AbstractRosFileElement>(
					AbstractRosFileElement.class, this, StatepubsubmodelPackage.FILE_PACKAGE__ABSTRACTROSELEMENT,
					StatepubsubmodelPackage.ABSTRACT_ROS_FILE_ELEMENT__FILEPACKAGE);
		}
		return abstractroselement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FilterDefinition> getFilter() {
		if (filter == null) {
			filter = new EObjectContainmentEList<FilterDefinition>(FilterDefinition.class, this,
					StatepubsubmodelPackage.FILE_PACKAGE__FILTER);
		}
		return filter;
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
		case StatepubsubmodelPackage.FILE_PACKAGE__ABSTRACTROSELEMENT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAbstractroselement()).basicAdd(otherEnd,
					msgs);
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
		case StatepubsubmodelPackage.FILE_PACKAGE__ABSTRACTROSELEMENT:
			return ((InternalEList<?>) getAbstractroselement()).basicRemove(otherEnd, msgs);
		case StatepubsubmodelPackage.FILE_PACKAGE__FILTER:
			return ((InternalEList<?>) getFilter()).basicRemove(otherEnd, msgs);
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
		case StatepubsubmodelPackage.FILE_PACKAGE__ABSTRACTROSELEMENT:
			return getAbstractroselement();
		case StatepubsubmodelPackage.FILE_PACKAGE__FILTER:
			return getFilter();
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
		case StatepubsubmodelPackage.FILE_PACKAGE__ABSTRACTROSELEMENT:
			getAbstractroselement().clear();
			getAbstractroselement().addAll((Collection<? extends AbstractRosFileElement>) newValue);
			return;
		case StatepubsubmodelPackage.FILE_PACKAGE__FILTER:
			getFilter().clear();
			getFilter().addAll((Collection<? extends FilterDefinition>) newValue);
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
		case StatepubsubmodelPackage.FILE_PACKAGE__ABSTRACTROSELEMENT:
			getAbstractroselement().clear();
			return;
		case StatepubsubmodelPackage.FILE_PACKAGE__FILTER:
			getFilter().clear();
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
		case StatepubsubmodelPackage.FILE_PACKAGE__ABSTRACTROSELEMENT:
			return abstractroselement != null && !abstractroselement.isEmpty();
		case StatepubsubmodelPackage.FILE_PACKAGE__FILTER:
			return filter != null && !filter.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FilePackageImpl

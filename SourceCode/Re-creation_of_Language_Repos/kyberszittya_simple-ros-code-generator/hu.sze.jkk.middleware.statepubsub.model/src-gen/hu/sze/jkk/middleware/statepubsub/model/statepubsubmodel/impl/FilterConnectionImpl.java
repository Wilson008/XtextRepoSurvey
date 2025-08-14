/**
 */
package hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl;

import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.FilterConnection;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.FilterDefinition;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.InternalNode;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.FilterConnectionImpl#getUsedfilter <em>Usedfilter</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.FilterConnectionImpl#getInput <em>Input</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.FilterConnectionImpl#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FilterConnectionImpl extends InternalEdgeImpl implements FilterConnection {
	/**
	 * The cached value of the '{@link #getUsedfilter() <em>Usedfilter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedfilter()
	 * @generated
	 * @ordered
	 */
	protected FilterDefinition usedfilter;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<InternalNode> input;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected InternalNode output;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilterConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatepubsubmodelPackage.Literals.FILTER_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterDefinition getUsedfilter() {
		if (usedfilter != null && usedfilter.eIsProxy()) {
			InternalEObject oldUsedfilter = (InternalEObject) usedfilter;
			usedfilter = (FilterDefinition) eResolveProxy(oldUsedfilter);
			if (usedfilter != oldUsedfilter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StatepubsubmodelPackage.FILTER_CONNECTION__USEDFILTER, oldUsedfilter, usedfilter));
			}
		}
		return usedfilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterDefinition basicGetUsedfilter() {
		return usedfilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsedfilter(FilterDefinition newUsedfilter) {
		FilterDefinition oldUsedfilter = usedfilter;
		usedfilter = newUsedfilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatepubsubmodelPackage.FILTER_CONNECTION__USEDFILTER,
					oldUsedfilter, usedfilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InternalNode> getInput() {
		if (input == null) {
			input = new EObjectResolvingEList<InternalNode>(InternalNode.class, this,
					StatepubsubmodelPackage.FILTER_CONNECTION__INPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalNode getOutput() {
		if (output != null && output.eIsProxy()) {
			InternalEObject oldOutput = (InternalEObject) output;
			output = (InternalNode) eResolveProxy(oldOutput);
			if (output != oldOutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StatepubsubmodelPackage.FILTER_CONNECTION__OUTPUT, oldOutput, output));
			}
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalNode basicGetOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput(InternalNode newOutput) {
		InternalNode oldOutput = output;
		output = newOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatepubsubmodelPackage.FILTER_CONNECTION__OUTPUT,
					oldOutput, output));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StatepubsubmodelPackage.FILTER_CONNECTION__USEDFILTER:
			if (resolve)
				return getUsedfilter();
			return basicGetUsedfilter();
		case StatepubsubmodelPackage.FILTER_CONNECTION__INPUT:
			return getInput();
		case StatepubsubmodelPackage.FILTER_CONNECTION__OUTPUT:
			if (resolve)
				return getOutput();
			return basicGetOutput();
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
		case StatepubsubmodelPackage.FILTER_CONNECTION__USEDFILTER:
			setUsedfilter((FilterDefinition) newValue);
			return;
		case StatepubsubmodelPackage.FILTER_CONNECTION__INPUT:
			getInput().clear();
			getInput().addAll((Collection<? extends InternalNode>) newValue);
			return;
		case StatepubsubmodelPackage.FILTER_CONNECTION__OUTPUT:
			setOutput((InternalNode) newValue);
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
		case StatepubsubmodelPackage.FILTER_CONNECTION__USEDFILTER:
			setUsedfilter((FilterDefinition) null);
			return;
		case StatepubsubmodelPackage.FILTER_CONNECTION__INPUT:
			getInput().clear();
			return;
		case StatepubsubmodelPackage.FILTER_CONNECTION__OUTPUT:
			setOutput((InternalNode) null);
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
		case StatepubsubmodelPackage.FILTER_CONNECTION__USEDFILTER:
			return usedfilter != null;
		case StatepubsubmodelPackage.FILTER_CONNECTION__INPUT:
			return input != null && !input.isEmpty();
		case StatepubsubmodelPackage.FILTER_CONNECTION__OUTPUT:
			return output != null;
		}
		return super.eIsSet(featureID);
	}

} //FilterConnectionImpl

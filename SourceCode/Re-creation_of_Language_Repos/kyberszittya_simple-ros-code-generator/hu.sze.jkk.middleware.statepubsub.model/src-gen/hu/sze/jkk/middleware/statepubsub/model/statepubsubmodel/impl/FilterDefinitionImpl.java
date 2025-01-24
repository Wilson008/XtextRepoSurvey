/**
 */
package hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl;

import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.FilterDefinition;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.SerializedField;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.FilterDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.FilterDefinitionImpl#getInput_field <em>Input field</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.FilterDefinitionImpl#getOutput_field <em>Output field</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FilterDefinitionImpl extends MinimalEObjectImpl.Container implements FilterDefinition {
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
	 * The cached value of the '{@link #getInput_field() <em>Input field</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput_field()
	 * @generated
	 * @ordered
	 */
	protected EList<SerializedField> input_field;

	/**
	 * The cached value of the '{@link #getOutput_field() <em>Output field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput_field()
	 * @generated
	 * @ordered
	 */
	protected SerializedField output_field;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilterDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatepubsubmodelPackage.Literals.FILTER_DEFINITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StatepubsubmodelPackage.FILTER_DEFINITION__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SerializedField> getInput_field() {
		if (input_field == null) {
			input_field = new EObjectContainmentEList<SerializedField>(SerializedField.class, this,
					StatepubsubmodelPackage.FILTER_DEFINITION__INPUT_FIELD);
		}
		return input_field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SerializedField getOutput_field() {
		return output_field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutput_field(SerializedField newOutput_field, NotificationChain msgs) {
		SerializedField oldOutput_field = output_field;
		output_field = newOutput_field;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					StatepubsubmodelPackage.FILTER_DEFINITION__OUTPUT_FIELD, oldOutput_field, newOutput_field);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput_field(SerializedField newOutput_field) {
		if (newOutput_field != output_field) {
			NotificationChain msgs = null;
			if (output_field != null)
				msgs = ((InternalEObject) output_field).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - StatepubsubmodelPackage.FILTER_DEFINITION__OUTPUT_FIELD, null, msgs);
			if (newOutput_field != null)
				msgs = ((InternalEObject) newOutput_field).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - StatepubsubmodelPackage.FILTER_DEFINITION__OUTPUT_FIELD, null, msgs);
			msgs = basicSetOutput_field(newOutput_field, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StatepubsubmodelPackage.FILTER_DEFINITION__OUTPUT_FIELD, newOutput_field, newOutput_field));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StatepubsubmodelPackage.FILTER_DEFINITION__INPUT_FIELD:
			return ((InternalEList<?>) getInput_field()).basicRemove(otherEnd, msgs);
		case StatepubsubmodelPackage.FILTER_DEFINITION__OUTPUT_FIELD:
			return basicSetOutput_field(null, msgs);
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
		case StatepubsubmodelPackage.FILTER_DEFINITION__NAME:
			return getName();
		case StatepubsubmodelPackage.FILTER_DEFINITION__INPUT_FIELD:
			return getInput_field();
		case StatepubsubmodelPackage.FILTER_DEFINITION__OUTPUT_FIELD:
			return getOutput_field();
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
		case StatepubsubmodelPackage.FILTER_DEFINITION__NAME:
			setName((String) newValue);
			return;
		case StatepubsubmodelPackage.FILTER_DEFINITION__INPUT_FIELD:
			getInput_field().clear();
			getInput_field().addAll((Collection<? extends SerializedField>) newValue);
			return;
		case StatepubsubmodelPackage.FILTER_DEFINITION__OUTPUT_FIELD:
			setOutput_field((SerializedField) newValue);
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
		case StatepubsubmodelPackage.FILTER_DEFINITION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case StatepubsubmodelPackage.FILTER_DEFINITION__INPUT_FIELD:
			getInput_field().clear();
			return;
		case StatepubsubmodelPackage.FILTER_DEFINITION__OUTPUT_FIELD:
			setOutput_field((SerializedField) null);
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
		case StatepubsubmodelPackage.FILTER_DEFINITION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case StatepubsubmodelPackage.FILTER_DEFINITION__INPUT_FIELD:
			return input_field != null && !input_field.isEmpty();
		case StatepubsubmodelPackage.FILTER_DEFINITION__OUTPUT_FIELD:
			return output_field != null;
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

} //FilterDefinitionImpl

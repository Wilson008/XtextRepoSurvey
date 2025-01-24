/**
 */
package hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl;

import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.NodeParameter;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.NodeParameterGroup;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage;

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
 * An implementation of the model object '<em><b>Node Parameter Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.NodeParameterGroupImpl#getNodeparameter <em>Nodeparameter</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.NodeParameterGroupImpl#getConfig_obj <em>Config obj</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.NodeParameterGroupImpl#isGenerate_struct <em>Generate struct</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeParameterGroupImpl extends AbstractNodeParameterImpl implements NodeParameterGroup {
	/**
	 * The cached value of the '{@link #getNodeparameter() <em>Nodeparameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeparameter()
	 * @generated
	 * @ordered
	 */
	protected EList<NodeParameter> nodeparameter;

	/**
	 * The default value of the '{@link #getConfig_obj() <em>Config obj</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfig_obj()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIG_OBJ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfig_obj() <em>Config obj</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfig_obj()
	 * @generated
	 * @ordered
	 */
	protected String config_obj = CONFIG_OBJ_EDEFAULT;

	/**
	 * The default value of the '{@link #isGenerate_struct() <em>Generate struct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerate_struct()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_STRUCT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGenerate_struct() <em>Generate struct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerate_struct()
	 * @generated
	 * @ordered
	 */
	protected boolean generate_struct = GENERATE_STRUCT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeParameterGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatepubsubmodelPackage.Literals.NODE_PARAMETER_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NodeParameter> getNodeparameter() {
		if (nodeparameter == null) {
			nodeparameter = new EObjectContainmentEList<NodeParameter>(NodeParameter.class, this,
					StatepubsubmodelPackage.NODE_PARAMETER_GROUP__NODEPARAMETER);
		}
		return nodeparameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfig_obj() {
		return config_obj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfig_obj(String newConfig_obj) {
		String oldConfig_obj = config_obj;
		config_obj = newConfig_obj;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StatepubsubmodelPackage.NODE_PARAMETER_GROUP__CONFIG_OBJ, oldConfig_obj, config_obj));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGenerate_struct() {
		return generate_struct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerate_struct(boolean newGenerate_struct) {
		boolean oldGenerate_struct = generate_struct;
		generate_struct = newGenerate_struct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StatepubsubmodelPackage.NODE_PARAMETER_GROUP__GENERATE_STRUCT, oldGenerate_struct,
					generate_struct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StatepubsubmodelPackage.NODE_PARAMETER_GROUP__NODEPARAMETER:
			return ((InternalEList<?>) getNodeparameter()).basicRemove(otherEnd, msgs);
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
		case StatepubsubmodelPackage.NODE_PARAMETER_GROUP__NODEPARAMETER:
			return getNodeparameter();
		case StatepubsubmodelPackage.NODE_PARAMETER_GROUP__CONFIG_OBJ:
			return getConfig_obj();
		case StatepubsubmodelPackage.NODE_PARAMETER_GROUP__GENERATE_STRUCT:
			return isGenerate_struct();
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
		case StatepubsubmodelPackage.NODE_PARAMETER_GROUP__NODEPARAMETER:
			getNodeparameter().clear();
			getNodeparameter().addAll((Collection<? extends NodeParameter>) newValue);
			return;
		case StatepubsubmodelPackage.NODE_PARAMETER_GROUP__CONFIG_OBJ:
			setConfig_obj((String) newValue);
			return;
		case StatepubsubmodelPackage.NODE_PARAMETER_GROUP__GENERATE_STRUCT:
			setGenerate_struct((Boolean) newValue);
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
		case StatepubsubmodelPackage.NODE_PARAMETER_GROUP__NODEPARAMETER:
			getNodeparameter().clear();
			return;
		case StatepubsubmodelPackage.NODE_PARAMETER_GROUP__CONFIG_OBJ:
			setConfig_obj(CONFIG_OBJ_EDEFAULT);
			return;
		case StatepubsubmodelPackage.NODE_PARAMETER_GROUP__GENERATE_STRUCT:
			setGenerate_struct(GENERATE_STRUCT_EDEFAULT);
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
		case StatepubsubmodelPackage.NODE_PARAMETER_GROUP__NODEPARAMETER:
			return nodeparameter != null && !nodeparameter.isEmpty();
		case StatepubsubmodelPackage.NODE_PARAMETER_GROUP__CONFIG_OBJ:
			return CONFIG_OBJ_EDEFAULT == null ? config_obj != null : !CONFIG_OBJ_EDEFAULT.equals(config_obj);
		case StatepubsubmodelPackage.NODE_PARAMETER_GROUP__GENERATE_STRUCT:
			return generate_struct != GENERATE_STRUCT_EDEFAULT;
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
		result.append(" (config_obj: ");
		result.append(config_obj);
		result.append(", generate_struct: ");
		result.append(generate_struct);
		result.append(')');
		return result.toString();
	}

} //NodeParameterGroupImpl

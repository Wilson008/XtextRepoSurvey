/**
 */
package io.yaktor.types.impl;

import io.yaktor.types.MappedField;
import io.yaktor.types.Projection;
import io.yaktor.types.TypeContainmentField;
import io.yaktor.types.TypesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Containment Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.yaktor.types.impl.TypeContainmentFieldImpl#getProjection <em>Projection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeContainmentFieldImpl extends NewFieldImpl implements TypeContainmentField {
	/**
	 * The cached value of the '{@link #getProjection() <em>Projection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjection()
	 * @generated
	 * @ordered
	 */
	protected Projection projection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeContainmentFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.TYPE_CONTAINMENT_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Projection getProjection() {
		return projection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProjection(Projection newProjection, NotificationChain msgs) {
		Projection oldProjection = projection;
		projection = newProjection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.TYPE_CONTAINMENT_FIELD__PROJECTION, oldProjection, newProjection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProjection(Projection newProjection) {
		if (newProjection != projection) {
			NotificationChain msgs = null;
			if (projection != null)
				msgs = ((InternalEObject)projection).eInverseRemove(this, TypesPackage.PROJECTION__PARENT, Projection.class, msgs);
			if (newProjection != null)
				msgs = ((InternalEObject)newProjection).eInverseAdd(this, TypesPackage.PROJECTION__PARENT, Projection.class, msgs);
			msgs = basicSetProjection(newProjection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.TYPE_CONTAINMENT_FIELD__PROJECTION, newProjection, newProjection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.TYPE_CONTAINMENT_FIELD__PROJECTION:
				if (projection != null)
					msgs = ((InternalEObject)projection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.TYPE_CONTAINMENT_FIELD__PROJECTION, null, msgs);
				return basicSetProjection((Projection)otherEnd, msgs);
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
			case TypesPackage.TYPE_CONTAINMENT_FIELD__PROJECTION:
				return basicSetProjection(null, msgs);
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
			case TypesPackage.TYPE_CONTAINMENT_FIELD__PROJECTION:
				return getProjection();
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
			case TypesPackage.TYPE_CONTAINMENT_FIELD__PROJECTION:
				setProjection((Projection)newValue);
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
			case TypesPackage.TYPE_CONTAINMENT_FIELD__PROJECTION:
				setProjection((Projection)null);
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
			case TypesPackage.TYPE_CONTAINMENT_FIELD__PROJECTION:
				return projection != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == MappedField.class) {
			switch (derivedFeatureID) {
				case TypesPackage.TYPE_CONTAINMENT_FIELD__PROJECTION: return TypesPackage.MAPPED_FIELD__PROJECTION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == MappedField.class) {
			switch (baseFeatureID) {
				case TypesPackage.MAPPED_FIELD__PROJECTION: return TypesPackage.TYPE_CONTAINMENT_FIELD__PROJECTION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //TypeContainmentFieldImpl

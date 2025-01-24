/**
 */
package majordomo.impl;

import java.lang.reflect.InvocationTargetException;

import majordomo.BooleanSensor;
import majordomo.MajordomoPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class BooleanSensorImpl extends SensorImpl implements BooleanSensor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanSensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MajordomoPackage.Literals.BOOLEAN_SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean getValue() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case MajordomoPackage.BOOLEAN_SENSOR___GET_VALUE:
				return getValue();
		}
		return super.eInvoke(operationID, arguments);
	}

} //BooleanSensorImpl

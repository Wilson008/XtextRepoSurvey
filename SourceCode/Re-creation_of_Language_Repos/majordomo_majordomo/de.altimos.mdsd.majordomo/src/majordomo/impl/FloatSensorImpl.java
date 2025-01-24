/**
 */
package majordomo.impl;

import java.lang.reflect.InvocationTargetException;

import majordomo.FloatSensor;
import majordomo.MajordomoPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Float Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class FloatSensorImpl extends SensorImpl implements FloatSensor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FloatSensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MajordomoPackage.Literals.FLOAT_SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getValue() {
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
			case MajordomoPackage.FLOAT_SENSOR___GET_VALUE:
				return getValue();
		}
		return super.eInvoke(operationID, arguments);
	}

} //FloatSensorImpl

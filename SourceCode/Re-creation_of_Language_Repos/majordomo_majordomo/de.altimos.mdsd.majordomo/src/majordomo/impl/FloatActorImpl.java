/**
 */
package majordomo.impl;

import java.lang.reflect.InvocationTargetException;

import majordomo.FloatActor;
import majordomo.MajordomoPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Float Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class FloatActorImpl extends ActorImpl implements FloatActor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FloatActorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MajordomoPackage.Literals.FLOAT_ACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(float value) {
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
			case MajordomoPackage.FLOAT_ACTOR___SET_VALUE__FLOAT:
				setValue((Float)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //FloatActorImpl

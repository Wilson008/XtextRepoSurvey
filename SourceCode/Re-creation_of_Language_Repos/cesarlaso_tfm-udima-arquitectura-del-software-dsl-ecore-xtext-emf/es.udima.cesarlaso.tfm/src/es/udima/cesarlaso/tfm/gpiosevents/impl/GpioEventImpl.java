/**
 */
package es.udima.cesarlaso.tfm.gpiosevents.impl;

import es.udima.cesarlaso.tfm.events.impl.EventImpl;

import es.udima.cesarlaso.tfm.gpiosevents.GpioEvent;
import es.udima.cesarlaso.tfm.gpiosevents.GpioseventsPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gpio Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class GpioEventImpl extends EventImpl implements GpioEvent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GpioEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GpioseventsPackage.Literals.GPIO_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void performed() {
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
			case GpioseventsPackage.GPIO_EVENT___PERFORMED:
				performed();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //GpioEventImpl

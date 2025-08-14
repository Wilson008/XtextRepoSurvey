/**
 */
package es.udima.cesarlaso.tfm.gpiosactuators.impl;

import es.udima.cesarlaso.tfm.events.impl.ActuatorImpl;

import es.udima.cesarlaso.tfm.gpiosactuators.GpioActuator;
import es.udima.cesarlaso.tfm.gpiosactuators.GpiosactuatorsPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gpio Actuator</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class GpioActuatorImpl extends ActuatorImpl implements GpioActuator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GpioActuatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GpiosactuatorsPackage.Literals.GPIO_ACTUATOR;
	}

} //GpioActuatorImpl

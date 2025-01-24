/**
 */
package es.udima.cesarlaso.tfm.healthmonitors.impl;

import es.udima.cesarlaso.tfm.healthmonitors.GpuTemperature;
import es.udima.cesarlaso.tfm.healthmonitors.HealthmonitorsPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gpu Temperature</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class GpuTemperatureImpl extends TemperatureImpl implements GpuTemperature {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GpuTemperatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HealthmonitorsPackage.Literals.GPU_TEMPERATURE;
	}

} //GpuTemperatureImpl

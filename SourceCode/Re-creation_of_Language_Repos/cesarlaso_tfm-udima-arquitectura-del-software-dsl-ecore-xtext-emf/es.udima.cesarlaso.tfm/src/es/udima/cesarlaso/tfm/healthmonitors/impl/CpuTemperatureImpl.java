/**
 */
package es.udima.cesarlaso.tfm.healthmonitors.impl;

import es.udima.cesarlaso.tfm.healthmonitors.CpuTemperature;
import es.udima.cesarlaso.tfm.healthmonitors.HealthmonitorsPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cpu Temperature</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class CpuTemperatureImpl extends TemperatureImpl implements CpuTemperature {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CpuTemperatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HealthmonitorsPackage.Literals.CPU_TEMPERATURE;
	}

} //CpuTemperatureImpl

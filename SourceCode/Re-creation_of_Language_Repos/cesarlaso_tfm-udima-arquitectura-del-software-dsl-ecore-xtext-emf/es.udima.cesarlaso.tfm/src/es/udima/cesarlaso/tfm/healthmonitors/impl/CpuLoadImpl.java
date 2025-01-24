/**
 */
package es.udima.cesarlaso.tfm.healthmonitors.impl;

import es.udima.cesarlaso.tfm.healthmonitors.CpuLoad;
import es.udima.cesarlaso.tfm.healthmonitors.HealthmonitorsPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cpu Load</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class CpuLoadImpl extends LoadImpl implements CpuLoad {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CpuLoadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HealthmonitorsPackage.Literals.CPU_LOAD;
	}

} //CpuLoadImpl

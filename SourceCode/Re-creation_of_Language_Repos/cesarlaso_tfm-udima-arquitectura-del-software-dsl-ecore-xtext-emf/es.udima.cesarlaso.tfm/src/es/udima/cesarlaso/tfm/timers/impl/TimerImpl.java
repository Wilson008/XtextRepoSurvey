/**
 */
package es.udima.cesarlaso.tfm.timers.impl;

import es.udima.cesarlaso.tfm.timers.Timer;
import es.udima.cesarlaso.tfm.timers.TimersPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timer</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class TimerImpl extends MinimalEObjectImpl.Container implements Timer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimersPackage.Literals.TIMER;
	}

} //TimerImpl

/**
 */
package es.udima.cesarlaso.tfm.operatingsystemactuators.util;

import es.udima.cesarlaso.tfm.events.Actuator;

import es.udima.cesarlaso.tfm.operatingsystemactuators.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.OperatingsystemactuatorsPackage
 * @generated
 */
public class OperatingsystemactuatorsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OperatingsystemactuatorsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatingsystemactuatorsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OperatingsystemactuatorsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperatingsystemactuatorsSwitch<Adapter> modelSwitch =
		new OperatingsystemactuatorsSwitch<Adapter>() {
			@Override
			public Adapter caseOperatingSystemActuator(OperatingSystemActuator object) {
				return createOperatingSystemActuatorAdapter();
			}
			@Override
			public Adapter caseSystemCommand(SystemCommand object) {
				return createSystemCommandAdapter();
			}
			@Override
			public Adapter casePlaySound(PlaySound object) {
				return createPlaySoundAdapter();
			}
			@Override
			public Adapter caseDownload(Download object) {
				return createDownloadAdapter();
			}
			@Override
			public Adapter caseBackgroundImage(BackgroundImage object) {
				return createBackgroundImageAdapter();
			}
			@Override
			public Adapter caseScreen(Screen object) {
				return createScreenAdapter();
			}
			@Override
			public Adapter caseDrawImage(DrawImage object) {
				return createDrawImageAdapter();
			}
			@Override
			public Adapter casePlayVideo(PlayVideo object) {
				return createPlayVideoAdapter();
			}
			@Override
			public Adapter caseFilePath(FilePath object) {
				return createFilePathAdapter();
			}
			@Override
			public Adapter caseActuator(Actuator object) {
				return createActuatorAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.OperatingSystemActuator <em>Operating System Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.OperatingSystemActuator
	 * @generated
	 */
	public Adapter createOperatingSystemActuatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.SystemCommand <em>System Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.SystemCommand
	 * @generated
	 */
	public Adapter createSystemCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.PlaySound <em>Play Sound</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.PlaySound
	 * @generated
	 */
	public Adapter createPlaySoundAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.Download <em>Download</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.Download
	 * @generated
	 */
	public Adapter createDownloadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.BackgroundImage <em>Background Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.BackgroundImage
	 * @generated
	 */
	public Adapter createBackgroundImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.Screen <em>Screen</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.Screen
	 * @generated
	 */
	public Adapter createScreenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.DrawImage <em>Draw Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.DrawImage
	 * @generated
	 */
	public Adapter createDrawImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.PlayVideo <em>Play Video</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.PlayVideo
	 * @generated
	 */
	public Adapter createPlayVideoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.operatingsystemactuators.FilePath <em>File Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.operatingsystemactuators.FilePath
	 * @generated
	 */
	public Adapter createFilePathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.udima.cesarlaso.tfm.events.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.udima.cesarlaso.tfm.events.Actuator
	 * @generated
	 */
	public Adapter createActuatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //OperatingsystemactuatorsAdapterFactory

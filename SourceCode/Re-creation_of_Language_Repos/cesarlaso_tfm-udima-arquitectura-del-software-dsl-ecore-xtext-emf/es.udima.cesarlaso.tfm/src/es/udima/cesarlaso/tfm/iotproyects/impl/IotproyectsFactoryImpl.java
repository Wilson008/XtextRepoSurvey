/**
 */
package es.udima.cesarlaso.tfm.iotproyects.impl;

import es.udima.cesarlaso.tfm.iotproyects.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IotproyectsFactoryImpl extends EFactoryImpl implements IotproyectsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IotproyectsFactory init() {
		try {
			IotproyectsFactory theIotproyectsFactory = (IotproyectsFactory)EPackage.Registry.INSTANCE.getEFactory(IotproyectsPackage.eNS_URI);
			if (theIotproyectsFactory != null) {
				return theIotproyectsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IotproyectsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IotproyectsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case IotproyectsPackage.IOT_PROYECT: return createIotProyect();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IotProyect createIotProyect() {
		IotProyectImpl iotProyect = new IotProyectImpl();
		return iotProyect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IotproyectsPackage getIotproyectsPackage() {
		return (IotproyectsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IotproyectsPackage getPackage() {
		return IotproyectsPackage.eINSTANCE;
	}

} //IotproyectsFactoryImpl

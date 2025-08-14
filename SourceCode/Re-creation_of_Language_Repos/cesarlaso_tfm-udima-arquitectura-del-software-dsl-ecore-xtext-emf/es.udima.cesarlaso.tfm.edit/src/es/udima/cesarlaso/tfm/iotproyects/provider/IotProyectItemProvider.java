/**
 */
package es.udima.cesarlaso.tfm.iotproyects.provider;


import es.udima.cesarlaso.tfm.deploymentdevices.DeploymentdevicesFactory;

import es.udima.cesarlaso.tfm.healthmonitors.HealthmonitorsFactory;

import es.udima.cesarlaso.tfm.iotproyects.IotProyect;
import es.udima.cesarlaso.tfm.iotproyects.IotproyectsPackage;

import es.udima.cesarlaso.tfm.programs.ProgramsFactory;

import es.udima.cesarlaso.tfm.servers.ServersFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link es.udima.cesarlaso.tfm.iotproyects.IotProyect} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IotProyectItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IotProyectItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addProductCodePropertyDescriptor(object);
			addVersionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IotProyect_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IotProyect_name_feature", "_UI_IotProyect_type"),
				 IotproyectsPackage.Literals.IOT_PROYECT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Product Code feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProductCodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IotProyect_productCode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IotProyect_productCode_feature", "_UI_IotProyect_type"),
				 IotproyectsPackage.Literals.IOT_PROYECT__PRODUCT_CODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IotProyect_version_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IotProyect_version_feature", "_UI_IotProyect_type"),
				 IotproyectsPackage.Literals.IOT_PROYECT__VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(IotproyectsPackage.Literals.IOT_PROYECT__PROGRAM);
			childrenFeatures.add(IotproyectsPackage.Literals.IOT_PROYECT__DEPLOYMENT_DEVICE);
			childrenFeatures.add(IotproyectsPackage.Literals.IOT_PROYECT__SERVER);
			childrenFeatures.add(IotproyectsPackage.Literals.IOT_PROYECT__HEALTH_MONITORS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns IotProyect.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IotProyect"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IotProyect)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_IotProyect_type") :
			getString("_UI_IotProyect_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(IotProyect.class)) {
			case IotproyectsPackage.IOT_PROYECT__NAME:
			case IotproyectsPackage.IOT_PROYECT__PRODUCT_CODE:
			case IotproyectsPackage.IOT_PROYECT__VERSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case IotproyectsPackage.IOT_PROYECT__PROGRAM:
			case IotproyectsPackage.IOT_PROYECT__DEPLOYMENT_DEVICE:
			case IotproyectsPackage.IOT_PROYECT__SERVER:
			case IotproyectsPackage.IOT_PROYECT__HEALTH_MONITORS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(IotproyectsPackage.Literals.IOT_PROYECT__PROGRAM,
				 ProgramsFactory.eINSTANCE.createProgram()));

		newChildDescriptors.add
			(createChildParameter
				(IotproyectsPackage.Literals.IOT_PROYECT__DEPLOYMENT_DEVICE,
				 DeploymentdevicesFactory.eINSTANCE.createSimulator()));

		newChildDescriptors.add
			(createChildParameter
				(IotproyectsPackage.Literals.IOT_PROYECT__DEPLOYMENT_DEVICE,
				 DeploymentdevicesFactory.eINSTANCE.createRaspberry()));

		newChildDescriptors.add
			(createChildParameter
				(IotproyectsPackage.Literals.IOT_PROYECT__DEPLOYMENT_DEVICE,
				 DeploymentdevicesFactory.eINSTANCE.createBeaglebone()));

		newChildDescriptors.add
			(createChildParameter
				(IotproyectsPackage.Literals.IOT_PROYECT__DEPLOYMENT_DEVICE,
				 DeploymentdevicesFactory.eINSTANCE.createESP8266()));

		newChildDescriptors.add
			(createChildParameter
				(IotproyectsPackage.Literals.IOT_PROYECT__SERVER,
				 ServersFactory.eINSTANCE.createJavaServer()));

		newChildDescriptors.add
			(createChildParameter
				(IotproyectsPackage.Literals.IOT_PROYECT__HEALTH_MONITORS,
				 HealthmonitorsFactory.eINSTANCE.createCpuLoadItem()));

		newChildDescriptors.add
			(createChildParameter
				(IotproyectsPackage.Literals.IOT_PROYECT__HEALTH_MONITORS,
				 HealthmonitorsFactory.eINSTANCE.createRamLoadItem()));

		newChildDescriptors.add
			(createChildParameter
				(IotproyectsPackage.Literals.IOT_PROYECT__HEALTH_MONITORS,
				 HealthmonitorsFactory.eINSTANCE.createCpuTemperatureItem()));

		newChildDescriptors.add
			(createChildParameter
				(IotproyectsPackage.Literals.IOT_PROYECT__HEALTH_MONITORS,
				 HealthmonitorsFactory.eINSTANCE.createGpuTemperatureItem()));

		newChildDescriptors.add
			(createChildParameter
				(IotproyectsPackage.Literals.IOT_PROYECT__HEALTH_MONITORS,
				 HealthmonitorsFactory.eINSTANCE.createStorageItem()));

		newChildDescriptors.add
			(createChildParameter
				(IotproyectsPackage.Literals.IOT_PROYECT__HEALTH_MONITORS,
				 HealthmonitorsFactory.eINSTANCE.createNetworkItem()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return IotProyectsEditPlugin.INSTANCE;
	}

}

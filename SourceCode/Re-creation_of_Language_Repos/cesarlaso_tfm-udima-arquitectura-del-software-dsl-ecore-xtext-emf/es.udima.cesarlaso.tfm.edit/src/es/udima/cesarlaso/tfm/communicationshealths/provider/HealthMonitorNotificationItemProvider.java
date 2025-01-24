/**
 */
package es.udima.cesarlaso.tfm.communicationshealths.provider;


import es.udima.cesarlaso.tfm.communicationshealths.CommunicationshealthsPackage;
import es.udima.cesarlaso.tfm.communicationshealths.HealthMonitorNotification;

import es.udima.cesarlaso.tfm.healthmonitors.HealthmonitorsFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link es.udima.cesarlaso.tfm.communicationshealths.HealthMonitorNotification} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HealthMonitorNotificationItemProvider extends HealthServiceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthMonitorNotificationItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(CommunicationshealthsPackage.Literals.HEALTH_MONITOR_NOTIFICATION__MONITOR);
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
	 * This returns HealthMonitorNotification.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/HealthMonitorNotification"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_HealthMonitorNotification_type");
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

		switch (notification.getFeatureID(HealthMonitorNotification.class)) {
			case CommunicationshealthsPackage.HEALTH_MONITOR_NOTIFICATION__MONITOR:
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
				(CommunicationshealthsPackage.Literals.HEALTH_MONITOR_NOTIFICATION__MONITOR,
				 HealthmonitorsFactory.eINSTANCE.createCpuLoadData()));

		newChildDescriptors.add
			(createChildParameter
				(CommunicationshealthsPackage.Literals.HEALTH_MONITOR_NOTIFICATION__MONITOR,
				 HealthmonitorsFactory.eINSTANCE.createRamLoadData()));

		newChildDescriptors.add
			(createChildParameter
				(CommunicationshealthsPackage.Literals.HEALTH_MONITOR_NOTIFICATION__MONITOR,
				 HealthmonitorsFactory.eINSTANCE.createCpuTemperatureData()));

		newChildDescriptors.add
			(createChildParameter
				(CommunicationshealthsPackage.Literals.HEALTH_MONITOR_NOTIFICATION__MONITOR,
				 HealthmonitorsFactory.eINSTANCE.createGpuTemperatureData()));

		newChildDescriptors.add
			(createChildParameter
				(CommunicationshealthsPackage.Literals.HEALTH_MONITOR_NOTIFICATION__MONITOR,
				 HealthmonitorsFactory.eINSTANCE.createStorageData()));

		newChildDescriptors.add
			(createChildParameter
				(CommunicationshealthsPackage.Literals.HEALTH_MONITOR_NOTIFICATION__MONITOR,
				 HealthmonitorsFactory.eINSTANCE.createNetworkData()));
	}

}

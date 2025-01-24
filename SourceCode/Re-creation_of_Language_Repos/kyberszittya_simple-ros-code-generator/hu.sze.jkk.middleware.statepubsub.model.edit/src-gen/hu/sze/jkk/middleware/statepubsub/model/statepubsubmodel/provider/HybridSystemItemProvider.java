/**
 */
package hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.provider;

import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.HybridSystem;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelFactory;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.HybridSystem} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HybridSystemItemProvider extends BehaviorItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HybridSystemItemProvider(AdapterFactory adapterFactory) {
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
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_HybridSystem_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_HybridSystem_name_feature",
								"_UI_HybridSystem_type"),
						StatepubsubmodelPackage.Literals.HYBRID_SYSTEM__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(StatepubsubmodelPackage.Literals.HYBRID_SYSTEM__LOCATION);
			childrenFeatures.add(StatepubsubmodelPackage.Literals.HYBRID_SYSTEM__TRANSITION);
			childrenFeatures.add(StatepubsubmodelPackage.Literals.HYBRID_SYSTEM__VARIABLE);
			childrenFeatures.add(StatepubsubmodelPackage.Literals.HYBRID_SYSTEM__ACTIVITY);
			childrenFeatures.add(StatepubsubmodelPackage.Literals.HYBRID_SYSTEM__EVENT);
			childrenFeatures.add(StatepubsubmodelPackage.Literals.HYBRID_SYSTEM__INVARIANT);
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
	 * This returns HybridSystem.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/HybridSystem"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((HybridSystem) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_HybridSystem_type")
				: getString("_UI_HybridSystem_type") + " " + label;
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

		switch (notification.getFeatureID(HybridSystem.class)) {
		case StatepubsubmodelPackage.HYBRID_SYSTEM__NAME:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case StatepubsubmodelPackage.HYBRID_SYSTEM__LOCATION:
		case StatepubsubmodelPackage.HYBRID_SYSTEM__TRANSITION:
		case StatepubsubmodelPackage.HYBRID_SYSTEM__VARIABLE:
		case StatepubsubmodelPackage.HYBRID_SYSTEM__ACTIVITY:
		case StatepubsubmodelPackage.HYBRID_SYSTEM__EVENT:
		case StatepubsubmodelPackage.HYBRID_SYSTEM__INVARIANT:
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

		newChildDescriptors.add(createChildParameter(StatepubsubmodelPackage.Literals.HYBRID_SYSTEM__LOCATION,
				StatepubsubmodelFactory.eINSTANCE.createLocation()));

		newChildDescriptors.add(createChildParameter(StatepubsubmodelPackage.Literals.HYBRID_SYSTEM__LOCATION,
				StatepubsubmodelFactory.eINSTANCE.createErrorLocation()));

		newChildDescriptors.add(createChildParameter(StatepubsubmodelPackage.Literals.HYBRID_SYSTEM__TRANSITION,
				StatepubsubmodelFactory.eINSTANCE.createTransition()));

		newChildDescriptors.add(createChildParameter(StatepubsubmodelPackage.Literals.HYBRID_SYSTEM__VARIABLE,
				StatepubsubmodelFactory.eINSTANCE.createContinuousVariable()));

		newChildDescriptors.add(createChildParameter(StatepubsubmodelPackage.Literals.HYBRID_SYSTEM__ACTIVITY,
				StatepubsubmodelFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add(createChildParameter(StatepubsubmodelPackage.Literals.HYBRID_SYSTEM__EVENT,
				StatepubsubmodelFactory.eINSTANCE.createDiscreteEvent()));

		newChildDescriptors.add(createChildParameter(StatepubsubmodelPackage.Literals.HYBRID_SYSTEM__INVARIANT,
				StatepubsubmodelFactory.eINSTANCE.createInvariant()));
	}

}

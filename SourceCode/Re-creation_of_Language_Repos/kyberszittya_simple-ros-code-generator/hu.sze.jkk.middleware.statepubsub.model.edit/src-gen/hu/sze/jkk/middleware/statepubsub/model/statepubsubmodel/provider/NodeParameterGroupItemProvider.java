/**
 */
package hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.provider;

import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.NodeParameterGroup;
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
 * This is the item provider adapter for a {@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.NodeParameterGroup} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NodeParameterGroupItemProvider extends AbstractNodeParameterItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeParameterGroupItemProvider(AdapterFactory adapterFactory) {
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

			addConfig_objPropertyDescriptor(object);
			addGenerate_structPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Config obj feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConfig_objPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_NodeParameterGroup_config_obj_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_NodeParameterGroup_config_obj_feature",
								"_UI_NodeParameterGroup_type"),
						StatepubsubmodelPackage.Literals.NODE_PARAMETER_GROUP__CONFIG_OBJ, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Generate struct feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenerate_structPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_NodeParameterGroup_generate_struct_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_NodeParameterGroup_generate_struct_feature", "_UI_NodeParameterGroup_type"),
						StatepubsubmodelPackage.Literals.NODE_PARAMETER_GROUP__GENERATE_STRUCT, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(StatepubsubmodelPackage.Literals.NODE_PARAMETER_GROUP__NODEPARAMETER);
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
	 * This returns NodeParameterGroup.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/NodeParameterGroup"));
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
		String label = ((NodeParameterGroup) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_NodeParameterGroup_type")
				: getString("_UI_NodeParameterGroup_type") + " " + label;
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

		switch (notification.getFeatureID(NodeParameterGroup.class)) {
		case StatepubsubmodelPackage.NODE_PARAMETER_GROUP__CONFIG_OBJ:
		case StatepubsubmodelPackage.NODE_PARAMETER_GROUP__GENERATE_STRUCT:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case StatepubsubmodelPackage.NODE_PARAMETER_GROUP__NODEPARAMETER:
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

		newChildDescriptors
				.add(createChildParameter(StatepubsubmodelPackage.Literals.NODE_PARAMETER_GROUP__NODEPARAMETER,
						StatepubsubmodelFactory.eINSTANCE.createNodeParameter()));

		newChildDescriptors
				.add(createChildParameter(StatepubsubmodelPackage.Literals.NODE_PARAMETER_GROUP__NODEPARAMETER,
						StatepubsubmodelFactory.eINSTANCE.createDoubleParameter()));

		newChildDescriptors
				.add(createChildParameter(StatepubsubmodelPackage.Literals.NODE_PARAMETER_GROUP__NODEPARAMETER,
						StatepubsubmodelFactory.eINSTANCE.createStringParameter()));

		newChildDescriptors
				.add(createChildParameter(StatepubsubmodelPackage.Literals.NODE_PARAMETER_GROUP__NODEPARAMETER,
						StatepubsubmodelFactory.eINSTANCE.createBooleanParameter()));

		newChildDescriptors
				.add(createChildParameter(StatepubsubmodelPackage.Literals.NODE_PARAMETER_GROUP__NODEPARAMETER,
						StatepubsubmodelFactory.eINSTANCE.createIntegerParameter()));
	}

}

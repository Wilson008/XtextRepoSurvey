/**
 */
package hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.provider;

import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.RosRuntimeElement;
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
 * This is the item provider adapter for a {@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.RosRuntimeElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RosRuntimeElementItemProvider extends DescriptiveElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RosRuntimeElementItemProvider(AdapterFactory adapterFactory) {
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
			addGenerateartifactPropertyDescriptor(object);
			addFilepackagePropertyDescriptor(object);
			addImplementsPropertyDescriptor(object);
			addNamespacePropertyDescriptor(object);
			addLanguagePropertyDescriptor(object);
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
						getResourceLocator(), getString("_UI_RosElement_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_RosElement_name_feature",
								"_UI_RosElement_type"),
						StatepubsubmodelPackage.Literals.ROS_ELEMENT__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Generateartifact feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenerateartifactPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_RosElement_generateartifact_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_RosElement_generateartifact_feature",
								"_UI_RosElement_type"),
						StatepubsubmodelPackage.Literals.ROS_ELEMENT__GENERATEARTIFACT, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Filepackage feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFilepackagePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_AbstractRosFileElement_filepackage_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_AbstractRosFileElement_filepackage_feature", "_UI_AbstractRosFileElement_type"),
						StatepubsubmodelPackage.Literals.ABSTRACT_ROS_FILE_ELEMENT__FILEPACKAGE, true, false, true,
						null, null, null));
	}

	/**
	 * This adds a property descriptor for the Implements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_RosRuntimeElement_implements_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_RosRuntimeElement_implements_feature",
						"_UI_RosRuntimeElement_type"),
				StatepubsubmodelPackage.Literals.ROS_RUNTIME_ELEMENT__IMPLEMENTS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Namespace feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamespacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_RosRuntimeElement_namespace_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_RosRuntimeElement_namespace_feature",
						"_UI_RosRuntimeElement_type"),
				StatepubsubmodelPackage.Literals.ROS_RUNTIME_ELEMENT__NAMESPACE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Language feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLanguagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_RosRuntimeElement_language_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_RosRuntimeElement_language_feature",
						"_UI_RosRuntimeElement_type"),
				StatepubsubmodelPackage.Literals.ROS_RUNTIME_ELEMENT__LANGUAGE, true, false, false,
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
			childrenFeatures.add(StatepubsubmodelPackage.Literals.ROS_RUNTIME_ELEMENT__CONTINOUSSTATE);
			childrenFeatures.add(StatepubsubmodelPackage.Literals.ROS_RUNTIME_ELEMENT__BEHAVIOR);
			childrenFeatures.add(StatepubsubmodelPackage.Literals.ROS_RUNTIME_ELEMENT__NODEPARAMETERS);
			childrenFeatures.add(StatepubsubmodelPackage.Literals.ROS_RUNTIME_ELEMENT__PORT);
			childrenFeatures.add(StatepubsubmodelPackage.Literals.ROS_RUNTIME_ELEMENT__FILTERCONNECTION);
			childrenFeatures.add(StatepubsubmodelPackage.Literals.ROS_RUNTIME_ELEMENT__INTERNALEDGE);
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
	 * This returns RosRuntimeElement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RosRuntimeElement"));
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
		String label = ((RosRuntimeElement) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_RosRuntimeElement_type")
				: getString("_UI_RosRuntimeElement_type") + " " + label;
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

		switch (notification.getFeatureID(RosRuntimeElement.class)) {
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__NAME:
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__GENERATEARTIFACT:
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__NAMESPACE:
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__LANGUAGE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__CONTINOUSSTATE:
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__BEHAVIOR:
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__NODEPARAMETERS:
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__PORT:
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__FILTERCONNECTION:
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__INTERNALEDGE:
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
				.add(createChildParameter(StatepubsubmodelPackage.Literals.ROS_RUNTIME_ELEMENT__CONTINOUSSTATE,
						StatepubsubmodelFactory.eINSTANCE.createContinousState()));

		newChildDescriptors.add(createChildParameter(StatepubsubmodelPackage.Literals.ROS_RUNTIME_ELEMENT__BEHAVIOR,
				StatepubsubmodelFactory.eINSTANCE.createHybridSystem()));

		newChildDescriptors.add(createChildParameter(StatepubsubmodelPackage.Literals.ROS_RUNTIME_ELEMENT__BEHAVIOR,
				StatepubsubmodelFactory.eINSTANCE.createFuzzyHybridSystem()));

		newChildDescriptors
				.add(createChildParameter(StatepubsubmodelPackage.Literals.ROS_RUNTIME_ELEMENT__NODEPARAMETERS,
						StatepubsubmodelFactory.eINSTANCE.createNodeParameter()));

		newChildDescriptors
				.add(createChildParameter(StatepubsubmodelPackage.Literals.ROS_RUNTIME_ELEMENT__NODEPARAMETERS,
						StatepubsubmodelFactory.eINSTANCE.createNodeParameterGroup()));

		newChildDescriptors
				.add(createChildParameter(StatepubsubmodelPackage.Literals.ROS_RUNTIME_ELEMENT__NODEPARAMETERS,
						StatepubsubmodelFactory.eINSTANCE.createDoubleParameter()));

		newChildDescriptors
				.add(createChildParameter(StatepubsubmodelPackage.Literals.ROS_RUNTIME_ELEMENT__NODEPARAMETERS,
						StatepubsubmodelFactory.eINSTANCE.createStringParameter()));

		newChildDescriptors
				.add(createChildParameter(StatepubsubmodelPackage.Literals.ROS_RUNTIME_ELEMENT__NODEPARAMETERS,
						StatepubsubmodelFactory.eINSTANCE.createBooleanParameter()));

		newChildDescriptors
				.add(createChildParameter(StatepubsubmodelPackage.Literals.ROS_RUNTIME_ELEMENT__NODEPARAMETERS,
						StatepubsubmodelFactory.eINSTANCE.createIntegerParameter()));

		newChildDescriptors.add(createChildParameter(StatepubsubmodelPackage.Literals.ROS_RUNTIME_ELEMENT__PORT,
				StatepubsubmodelFactory.eINSTANCE.createInputPort()));

		newChildDescriptors.add(createChildParameter(StatepubsubmodelPackage.Literals.ROS_RUNTIME_ELEMENT__PORT,
				StatepubsubmodelFactory.eINSTANCE.createOutputPort()));

		newChildDescriptors
				.add(createChildParameter(StatepubsubmodelPackage.Literals.ROS_RUNTIME_ELEMENT__FILTERCONNECTION,
						StatepubsubmodelFactory.eINSTANCE.createFilterConnection()));

		newChildDescriptors.add(createChildParameter(StatepubsubmodelPackage.Literals.ROS_RUNTIME_ELEMENT__INTERNALEDGE,
				StatepubsubmodelFactory.eINSTANCE.createFilterConnection()));

		newChildDescriptors.add(createChildParameter(StatepubsubmodelPackage.Literals.ROS_RUNTIME_ELEMENT__INTERNALEDGE,
				StatepubsubmodelFactory.eINSTANCE.createDirectConnection()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == StatepubsubmodelPackage.Literals.ROS_RUNTIME_ELEMENT__FILTERCONNECTION
				|| childFeature == StatepubsubmodelPackage.Literals.ROS_RUNTIME_ELEMENT__INTERNALEDGE;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}

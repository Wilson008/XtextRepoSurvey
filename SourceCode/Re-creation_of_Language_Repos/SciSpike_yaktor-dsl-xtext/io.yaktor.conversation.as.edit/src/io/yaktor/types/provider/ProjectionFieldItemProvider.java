/**
 */
package io.yaktor.types.provider;


import io.yaktor.conversation.provider.ConversationEditPlugin;

import io.yaktor.domain.DomainFactory;

import io.yaktor.types.ProjectionField;
import io.yaktor.types.TypesPackage;

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
 * This is the item provider adapter for a {@link io.yaktor.types.ProjectionField} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProjectionFieldItemProvider 
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
	public ProjectionFieldItemProvider(AdapterFactory adapterFactory) {
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

			addAliasPropertyDescriptor(object);
			addOldFieldPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Alias feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAliasPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectionField_alias_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectionField_alias_feature", "_UI_ProjectionField_type"),
				 TypesPackage.Literals.PROJECTION_FIELD__ALIAS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Old Field feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOldFieldPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectionField_oldField_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectionField_oldField_feature", "_UI_ProjectionField_type"),
				 TypesPackage.Literals.PROJECTION_FIELD__OLD_FIELD,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(TypesPackage.Literals.PROJECTION_FIELD__NEW_FIELD);
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
	 * This returns ProjectionField.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ProjectionField"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ProjectionField)object).getAlias();
		return label == null || label.length() == 0 ?
			getString("_UI_ProjectionField_type") :
			getString("_UI_ProjectionField_type") + " " + label;
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

		switch (notification.getFeatureID(ProjectionField.class)) {
			case TypesPackage.PROJECTION_FIELD__ALIAS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TypesPackage.PROJECTION_FIELD__NEW_FIELD:
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
				(TypesPackage.Literals.PROJECTION_FIELD__NEW_FIELD,
				 DomainFactory.eINSTANCE.createField()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.PROJECTION_FIELD__NEW_FIELD,
				 DomainFactory.eINSTANCE.createConstraintTypeField()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.PROJECTION_FIELD__NEW_FIELD,
				 DomainFactory.eINSTANCE.createStringField()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.PROJECTION_FIELD__NEW_FIELD,
				 DomainFactory.eINSTANCE.createDateField()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.PROJECTION_FIELD__NEW_FIELD,
				 DomainFactory.eINSTANCE.createIntegerField()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.PROJECTION_FIELD__NEW_FIELD,
				 DomainFactory.eINSTANCE.createAssociationEnd()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.PROJECTION_FIELD__NEW_FIELD,
				 DomainFactory.eINSTANCE.createEnumField()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.PROJECTION_FIELD__NEW_FIELD,
				 DomainFactory.eINSTANCE.createNumericField()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.PROJECTION_FIELD__NEW_FIELD,
				 DomainFactory.eINSTANCE.createBooleanField()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.PROJECTION_FIELD__NEW_FIELD,
				 DomainFactory.eINSTANCE.createTypeField()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.PROJECTION_FIELD__NEW_FIELD,
				 DomainFactory.eINSTANCE.createAnyField()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.PROJECTION_FIELD__NEW_FIELD,
				 DomainFactory.eINSTANCE.createPriceField()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.PROJECTION_FIELD__NEW_FIELD,
				 DomainFactory.eINSTANCE.createAmountField()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.PROJECTION_FIELD__NEW_FIELD,
				 DomainFactory.eINSTANCE.createCountField()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.PROJECTION_FIELD__NEW_FIELD,
				 DomainFactory.eINSTANCE.createEntityReferenceField()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.PROJECTION_FIELD__NEW_FIELD,
				 DomainFactory.eINSTANCE.createGeoLocationField()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.PROJECTION_FIELD__NEW_FIELD,
				 DomainFactory.eINSTANCE.createIdField()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.PROJECTION_FIELD__NEW_FIELD,
				 DomainFactory.eINSTANCE.createShortIdField()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ConversationEditPlugin.INSTANCE;
	}

}

/**
 */
package io.yaktor.conversation.provider;


import io.yaktor.access.AccessFactory;

import io.yaktor.conversation.Conversation;
import io.yaktor.conversation.ConversationFactory;
import io.yaktor.conversation.ConversationPackage;

import io.yaktor.types.TypesFactory;

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
 * This is the item provider adapter for a {@link io.yaktor.conversation.Conversation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConversationItemProvider 
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
	public ConversationItemProvider(AdapterFactory adapterFactory) {
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
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Conversation_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Conversation_name_feature", "_UI_Conversation_type"),
				 ConversationPackage.Literals.CONVERSATION__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(ConversationPackage.Literals.CONVERSATION__AGENTS);
			childrenFeatures.add(ConversationPackage.Literals.CONVERSATION__DEFINED_TYPES);
			childrenFeatures.add(ConversationPackage.Literals.CONVERSATION__REST_SERVICES);
			childrenFeatures.add(ConversationPackage.Literals.CONVERSATION__SERVICES);
			childrenFeatures.add(ConversationPackage.Literals.CONVERSATION__IMPORTED_TYPES);
			childrenFeatures.add(ConversationPackage.Literals.CONVERSATION__IMPORTED_AGENTS);
			childrenFeatures.add(ConversationPackage.Literals.CONVERSATION__VIEWS);
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
	 * This returns Conversation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Conversation"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Conversation)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Conversation_type") :
			getString("_UI_Conversation_type") + " " + label;
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

		switch (notification.getFeatureID(Conversation.class)) {
			case ConversationPackage.CONVERSATION__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ConversationPackage.CONVERSATION__AGENTS:
			case ConversationPackage.CONVERSATION__DEFINED_TYPES:
			case ConversationPackage.CONVERSATION__REST_SERVICES:
			case ConversationPackage.CONVERSATION__SERVICES:
			case ConversationPackage.CONVERSATION__IMPORTED_TYPES:
			case ConversationPackage.CONVERSATION__IMPORTED_AGENTS:
			case ConversationPackage.CONVERSATION__VIEWS:
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
				(ConversationPackage.Literals.CONVERSATION__AGENTS,
				 ConversationFactory.eINSTANCE.createAgent()));

		newChildDescriptors.add
			(createChildParameter
				(ConversationPackage.Literals.CONVERSATION__DEFINED_TYPES,
				 TypesFactory.eINSTANCE.createProjection()));

		newChildDescriptors.add
			(createChildParameter
				(ConversationPackage.Literals.CONVERSATION__REST_SERVICES,
				 AccessFactory.eINSTANCE.createRestService()));

		newChildDescriptors.add
			(createChildParameter
				(ConversationPackage.Literals.CONVERSATION__SERVICES,
				 AccessFactory.eINSTANCE.createService()));

		newChildDescriptors.add
			(createChildParameter
				(ConversationPackage.Literals.CONVERSATION__IMPORTED_TYPES,
				 ConversationFactory.eINSTANCE.createTypeImport()));

		newChildDescriptors.add
			(createChildParameter
				(ConversationPackage.Literals.CONVERSATION__IMPORTED_AGENTS,
				 ConversationFactory.eINSTANCE.createAgentImport()));

		newChildDescriptors.add
			(createChildParameter
				(ConversationPackage.Literals.CONVERSATION__VIEWS,
				 AccessFactory.eINSTANCE.createView()));
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

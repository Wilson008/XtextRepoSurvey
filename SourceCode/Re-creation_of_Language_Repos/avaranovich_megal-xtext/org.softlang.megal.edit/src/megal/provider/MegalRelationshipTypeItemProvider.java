/**
 */
package megal.provider;


import java.util.Collection;
import java.util.List;

import megal.MegalPackage;
import megal.MegalRelationshipType;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link megal.MegalRelationshipType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MegalRelationshipTypeItemProvider extends MegalNamedItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MegalRelationshipTypeItemProvider(AdapterFactory adapterFactory) {
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

			addLeftPropertyDescriptor(object);
			addRightPropertyDescriptor(object);
			addLeftBothPropertyDescriptor(object);
			addRightBothPropertyDescriptor(object);
			addLeftManyPropertyDescriptor(object);
			addRightManyPropertyDescriptor(object);
			addLeftParamsPropertyDescriptor(object);
			addRightParamsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Left feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLeftPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MegalRelationshipType_left_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MegalRelationshipType_left_feature", "_UI_MegalRelationshipType_type"),
				 MegalPackage.Literals.MEGAL_RELATIONSHIP_TYPE__LEFT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Right feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MegalRelationshipType_right_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MegalRelationshipType_right_feature", "_UI_MegalRelationshipType_type"),
				 MegalPackage.Literals.MEGAL_RELATIONSHIP_TYPE__RIGHT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Left Both feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLeftBothPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MegalRelationshipType_leftBoth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MegalRelationshipType_leftBoth_feature", "_UI_MegalRelationshipType_type"),
				 MegalPackage.Literals.MEGAL_RELATIONSHIP_TYPE__LEFT_BOTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Right Both feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRightBothPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MegalRelationshipType_rightBoth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MegalRelationshipType_rightBoth_feature", "_UI_MegalRelationshipType_type"),
				 MegalPackage.Literals.MEGAL_RELATIONSHIP_TYPE__RIGHT_BOTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Left Many feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLeftManyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MegalRelationshipType_leftMany_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MegalRelationshipType_leftMany_feature", "_UI_MegalRelationshipType_type"),
				 MegalPackage.Literals.MEGAL_RELATIONSHIP_TYPE__LEFT_MANY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Right Many feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRightManyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MegalRelationshipType_rightMany_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MegalRelationshipType_rightMany_feature", "_UI_MegalRelationshipType_type"),
				 MegalPackage.Literals.MEGAL_RELATIONSHIP_TYPE__RIGHT_MANY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Left Params feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLeftParamsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MegalRelationshipType_leftParams_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MegalRelationshipType_leftParams_feature", "_UI_MegalRelationshipType_type"),
				 MegalPackage.Literals.MEGAL_RELATIONSHIP_TYPE__LEFT_PARAMS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Right Params feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRightParamsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MegalRelationshipType_rightParams_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MegalRelationshipType_rightParams_feature", "_UI_MegalRelationshipType_type"),
				 MegalPackage.Literals.MEGAL_RELATIONSHIP_TYPE__RIGHT_PARAMS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns MegalRelationshipType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MegalRelationshipType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MegalRelationshipType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MegalRelationshipType_type") :
			getString("_UI_MegalRelationshipType_type") + " " + label;
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

		switch (notification.getFeatureID(MegalRelationshipType.class)) {
			case MegalPackage.MEGAL_RELATIONSHIP_TYPE__LEFT_BOTH:
			case MegalPackage.MEGAL_RELATIONSHIP_TYPE__RIGHT_BOTH:
			case MegalPackage.MEGAL_RELATIONSHIP_TYPE__LEFT_MANY:
			case MegalPackage.MEGAL_RELATIONSHIP_TYPE__RIGHT_MANY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}

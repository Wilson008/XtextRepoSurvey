/**
 */
package io.yaktor.domain.provider;


import io.yaktor.domain.DomainFactory;
import io.yaktor.domain.DomainPackage;
import io.yaktor.domain.JpaGenOptions;

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
 * This is the item provider adapter for a {@link io.yaktor.domain.JpaGenOptions} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class JpaGenOptionsItemProvider extends GenOptionsItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JpaGenOptionsItemProvider(AdapterFactory adapterFactory) {
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

			addUseAspectsPropertyDescriptor(object);
			addMetaDataPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Use Aspects feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUseAspectsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JpaGenOptions_useAspects_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JpaGenOptions_useAspects_feature", "_UI_JpaGenOptions_type"),
				 DomainPackage.Literals.JPA_GEN_OPTIONS__USE_ASPECTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Meta Data feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMetaDataPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JpaGenOptions_metaData_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JpaGenOptions_metaData_feature", "_UI_JpaGenOptions_type"),
				 DomainPackage.Literals.JPA_GEN_OPTIONS__META_DATA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(DomainPackage.Literals.JPA_GEN_OPTIONS__PROJECT);
			childrenFeatures.add(DomainPackage.Literals.JPA_GEN_OPTIONS__PERSISTENCE);
			childrenFeatures.add(DomainPackage.Literals.JPA_GEN_OPTIONS__GENERATION_INCLUSION);
			childrenFeatures.add(DomainPackage.Literals.JPA_GEN_OPTIONS__TABLE_OPTIONS);
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
	 * This returns JpaGenOptions.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/JpaGenOptions"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((JpaGenOptions)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_JpaGenOptions_type") :
			getString("_UI_JpaGenOptions_type") + " " + label;
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

		switch (notification.getFeatureID(JpaGenOptions.class)) {
			case DomainPackage.JPA_GEN_OPTIONS__USE_ASPECTS:
			case DomainPackage.JPA_GEN_OPTIONS__META_DATA:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DomainPackage.JPA_GEN_OPTIONS__PROJECT:
			case DomainPackage.JPA_GEN_OPTIONS__PERSISTENCE:
			case DomainPackage.JPA_GEN_OPTIONS__GENERATION_INCLUSION:
			case DomainPackage.JPA_GEN_OPTIONS__TABLE_OPTIONS:
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
				(DomainPackage.Literals.JPA_GEN_OPTIONS__PROJECT,
				 DomainFactory.eINSTANCE.createProjectOptions()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.JPA_GEN_OPTIONS__PERSISTENCE,
				 DomainFactory.eINSTANCE.createPersistenceOptions()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.JPA_GEN_OPTIONS__GENERATION_INCLUSION,
				 DomainFactory.eINSTANCE.createGenerationInclusion()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.JPA_GEN_OPTIONS__TABLE_OPTIONS,
				 DomainFactory.eINSTANCE.createJpaTableOptions()));
	}

}

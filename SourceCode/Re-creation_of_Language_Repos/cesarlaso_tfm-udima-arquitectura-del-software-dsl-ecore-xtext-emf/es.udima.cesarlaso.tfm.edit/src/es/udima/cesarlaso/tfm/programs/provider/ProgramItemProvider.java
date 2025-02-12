/**
 */
package es.udima.cesarlaso.tfm.programs.provider;


import es.udima.cesarlaso.tfm.communicationsprograms.CommunicationsprogramsFactory;

import es.udima.cesarlaso.tfm.gpios.GpiosFactory;

import es.udima.cesarlaso.tfm.operatingsystemactuators.OperatingsystemactuatorsFactory;

import es.udima.cesarlaso.tfm.programs.Program;
import es.udima.cesarlaso.tfm.programs.ProgramsFactory;
import es.udima.cesarlaso.tfm.programs.ProgramsPackage;

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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link es.udima.cesarlaso.tfm.programs.Program} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProgramItemProvider 
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
	public ProgramItemProvider(AdapterFactory adapterFactory) {
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

			addStatePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Program_state_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Program_state_feature", "_UI_Program_type"),
				 ProgramsPackage.Literals.PROGRAM__STATE,
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
			childrenFeatures.add(ProgramsPackage.Literals.PROGRAM__STATES);
			childrenFeatures.add(ProgramsPackage.Literals.PROGRAM__GPIO_ALIASES);
			childrenFeatures.add(ProgramsPackage.Literals.PROGRAM__REMOTE_IDENTIFIERS);
			childrenFeatures.add(ProgramsPackage.Literals.PROGRAM__FILES);
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
	 * This returns Program.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Program"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Program_type");
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

		switch (notification.getFeatureID(Program.class)) {
			case ProgramsPackage.PROGRAM__STATES:
			case ProgramsPackage.PROGRAM__GPIO_ALIASES:
			case ProgramsPackage.PROGRAM__REMOTE_IDENTIFIERS:
			case ProgramsPackage.PROGRAM__FILES:
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
				(ProgramsPackage.Literals.PROGRAM__STATES,
				 ProgramsFactory.eINSTANCE.createProgramState()));

		newChildDescriptors.add
			(createChildParameter
				(ProgramsPackage.Literals.PROGRAM__GPIO_ALIASES,
				 GpiosFactory.eINSTANCE.createDigitalInputPin()));

		newChildDescriptors.add
			(createChildParameter
				(ProgramsPackage.Literals.PROGRAM__GPIO_ALIASES,
				 GpiosFactory.eINSTANCE.createDigitalOutputPin()));

		newChildDescriptors.add
			(createChildParameter
				(ProgramsPackage.Literals.PROGRAM__GPIO_ALIASES,
				 GpiosFactory.eINSTANCE.createAnalogInputPin()));

		newChildDescriptors.add
			(createChildParameter
				(ProgramsPackage.Literals.PROGRAM__GPIO_ALIASES,
				 GpiosFactory.eINSTANCE.createAnalogOutputPin()));

		newChildDescriptors.add
			(createChildParameter
				(ProgramsPackage.Literals.PROGRAM__REMOTE_IDENTIFIERS,
				 CommunicationsprogramsFactory.eINSTANCE.createRemoteEventIdentifier()));

		newChildDescriptors.add
			(createChildParameter
				(ProgramsPackage.Literals.PROGRAM__REMOTE_IDENTIFIERS,
				 CommunicationsprogramsFactory.eINSTANCE.createRemoteActuatorIdentifier()));

		newChildDescriptors.add
			(createChildParameter
				(ProgramsPackage.Literals.PROGRAM__FILES,
				 OperatingsystemactuatorsFactory.eINSTANCE.createFilePath()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ProgramsEditPlugin.INSTANCE;
	}

}

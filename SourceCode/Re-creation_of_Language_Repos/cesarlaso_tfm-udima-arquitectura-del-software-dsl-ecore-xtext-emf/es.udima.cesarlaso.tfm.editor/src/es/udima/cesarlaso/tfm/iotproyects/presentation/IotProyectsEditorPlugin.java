/**
 */
package es.udima.cesarlaso.tfm.iotproyects.presentation;

import es.udima.cesarlaso.tfm.communications.provider.CommunicationsEditPlugin;

import es.udima.cesarlaso.tfm.communicationsprograms.provider.CommunicationsProgramsEditPlugin;

import es.udima.cesarlaso.tfm.deploymentdevices.provider.DeploymentDevicesEditPlugin;

import es.udima.cesarlaso.tfm.events.provider.EventsEditPlugin;

import es.udima.cesarlaso.tfm.gpios.provider.GpiosEditPlugin;

import es.udima.cesarlaso.tfm.healthmonitors.provider.HealthMonitorsEditPlugin;

import es.udima.cesarlaso.tfm.operatingsystemactuators.provider.OperatingSystemActuatorsEditPlugin;

import es.udima.cesarlaso.tfm.programs.provider.ProgramsEditPlugin;

import es.udima.cesarlaso.tfm.servers.provider.ServersEditPlugin;

import es.udima.cesarlaso.tfm.timers.provider.TimersEditPlugin;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.ui.EclipseUIPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

/**
 * This is the central singleton for the IotProyects editor plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class IotProyectsEditorPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final IotProyectsEditorPlugin INSTANCE = new IotProyectsEditorPlugin();
	
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Implementation plugin;

	/**
	 * Create the instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IotProyectsEditorPlugin() {
		super
			(new ResourceLocator [] {
				CommunicationsEditPlugin.INSTANCE,
				CommunicationsProgramsEditPlugin.INSTANCE,
				DeploymentDevicesEditPlugin.INSTANCE,
				EventsEditPlugin.INSTANCE,
				GpiosEditPlugin.INSTANCE,
				HealthMonitorsEditPlugin.INSTANCE,
				OperatingSystemActuatorsEditPlugin.INSTANCE,
				ProgramsEditPlugin.INSTANCE,
				ServersEditPlugin.INSTANCE,
				TimersEditPlugin.INSTANCE,
			});
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}
	
	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	public static Implementation getPlugin() {
		return plugin;
	}
	
	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class Implementation extends EclipseUIPlugin {
		/**
		 * Creates an instance.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Implementation() {
			super();
	
			// Remember the static instance.
			//
			plugin = this;
		}
	}

}

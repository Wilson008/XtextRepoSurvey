/*
 * generated by Xtext 2.35.0
 */
package org.xtext.example.rmodp.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.example.rmodp.ui.internal.RmodpActivator;

public class RmOdpUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return RmodpActivator.getInstance().getInjector("org.xtext.example.rmodp.RmOdp");
	}

}

/*
 * generated by Xtext 2.35.0
 */
package mgpl.ui.tests;

import com.google.inject.Injector;
import mgpl.ui.internal.MgplActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class MGPLUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return MgplActivator.getInstance().getInjector("mgpl.MGPL");
	}

}

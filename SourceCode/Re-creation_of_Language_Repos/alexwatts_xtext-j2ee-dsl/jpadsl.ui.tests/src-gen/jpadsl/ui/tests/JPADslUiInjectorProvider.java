/*
 * generated by Xtext 2.35.0
 */
package jpadsl.ui.tests;

import com.google.inject.Injector;
import jpadsl.ui.internal.JpadslActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class JPADslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return JpadslActivator.getInstance().getInjector("jpadsl.JPADsl");
	}

}

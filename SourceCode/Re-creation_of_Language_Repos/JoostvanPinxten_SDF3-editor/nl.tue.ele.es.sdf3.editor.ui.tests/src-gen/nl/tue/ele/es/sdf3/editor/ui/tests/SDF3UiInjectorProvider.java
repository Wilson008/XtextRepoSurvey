/*
 * generated by Xtext 2.35.0
 */
package nl.tue.ele.es.sdf3.editor.ui.tests;

import com.google.inject.Injector;
import nl.tue.ele.es.sdf3.editor.ui.internal.EditorActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class SDF3UiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return EditorActivator.getInstance().getInjector("nl.tue.ele.es.sdf3.editor.SDF3");
	}

}

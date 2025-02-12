/*
 * generated by Xtext 2.35.0
 */
package workflowdsl.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import workflowdsl.WorkflowDslRuntimeModule;
import workflowdsl.WorkflowDslStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class WorkflowDslIdeSetup extends WorkflowDslStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new WorkflowDslRuntimeModule(), new WorkflowDslIdeModule()));
	}
	
}

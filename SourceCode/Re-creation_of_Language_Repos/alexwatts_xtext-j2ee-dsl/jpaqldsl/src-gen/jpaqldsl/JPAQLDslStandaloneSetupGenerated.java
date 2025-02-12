/*
 * generated by Xtext 2.35.0
 */
package jpaqldsl;

import com.google.inject.Guice;
import com.google.inject.Injector;
import jpaqldsl.jPAQLDsl.JPAQLDslPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.xbase.XbaseStandaloneSetup;

@SuppressWarnings("all")
public class JPAQLDslStandaloneSetupGenerated implements ISetup {

	@Override
	public Injector createInjectorAndDoEMFRegistration() {
		XbaseStandaloneSetup.doSetup();

		Injector injector = createInjector();
		register(injector);
		return injector;
	}
	
	public Injector createInjector() {
		return Guice.createInjector(new JPAQLDslRuntimeModule());
	}
	
	public void register(Injector injector) {
		if (!EPackage.Registry.INSTANCE.containsKey("http://www.JPAQLDsl.jpaqldsl")) {
			EPackage.Registry.INSTANCE.put("http://www.JPAQLDsl.jpaqldsl", JPAQLDslPackage.eINSTANCE);
		}
		IResourceFactory resourceFactory = injector.getInstance(IResourceFactory.class);
		IResourceServiceProvider serviceProvider = injector.getInstance(IResourceServiceProvider.class);
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xml", resourceFactory);
		IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put("xml", serviceProvider);
	}
}

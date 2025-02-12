/*
 * generated by Xtext 2.35.0
 */
package io.yaktor.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public abstract class AbstractConversationValidator extends DomainValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>(super.getEPackages());
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.eclipse.org/Xtext/io.yaktor.conversation"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.eclipse.org/Xtext/io.yaktor.types"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.eclipse.org/Xtext/io.yaktor.access"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.eclipse.org/Xtext/io.yaktor.domain"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.eclipse.org/Xtext/io.yaktor.domain.mongoNode"));
		return result;
	}
}

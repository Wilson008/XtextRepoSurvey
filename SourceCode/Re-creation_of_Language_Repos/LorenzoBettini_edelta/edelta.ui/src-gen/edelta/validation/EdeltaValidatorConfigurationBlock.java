/*
 * generated by Xtext 2.35.0
 */
package edelta.validation;

import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.xtext.xbase.ui.validation.XbaseValidationConfigurationBlock;

@SuppressWarnings("restriction")
public class EdeltaValidatorConfigurationBlock extends XbaseValidationConfigurationBlock {

	protected static final String SETTINGS_SECTION_NAME = "Edelta";

	@Override
	protected void fillSettingsPage(Composite composite, int nColumns, int defaultIndent) {
		addComboBox(EdeltaConfigurableIssueCodesProvider.DEPRECATED_MODEL_PART, "Deprecated Model Part", composite, defaultIndent);
		super.fillSettingsPage(composite, nColumns, defaultIndent);
	}

	@Override
	public void dispose() {
		storeSectionExpansionStates(getDialogSettings());
		super.dispose();
	}

	@Override
	protected IDialogSettings getDialogSettings() {
		IDialogSettings dialogSettings = super.getDialogSettings();
		IDialogSettings section = dialogSettings.getSection(SETTINGS_SECTION_NAME);
		if (section == null) {
			return dialogSettings.addNewSection(SETTINGS_SECTION_NAME);
		}
		return section;
	}
}

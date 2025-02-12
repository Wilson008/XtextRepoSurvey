/*
 * generated by Xtext 2.35.0
 */
package hu.sze.aut.ros.middleware.statepubsub.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import hu.sze.aut.ros.middleware.statepubsub.ide.contentassist.antlr.internal.InternalRosNetworkDslParser;
import hu.sze.aut.ros.middleware.statepubsub.services.RosNetworkDslGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class RosNetworkDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(RosNetworkDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, RosNetworkDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getAbstractRosFileElementAccess().getAlternatives(), "rule__AbstractRosFileElement__Alternatives");
			builder.put(grammarAccess.getAbstractMessageTypeAccess().getAlternatives(), "rule__AbstractMessageType__Alternatives");
			builder.put(grammarAccess.getNetworkTypeAccess().getAlternatives(), "rule__NetworkType__Alternatives");
			builder.put(grammarAccess.getChannelAccess().getAlternatives(), "rule__Channel__Alternatives");
			builder.put(grammarAccess.getNodeParameterAccess().getAlternatives(), "rule__NodeParameter__Alternatives");
			builder.put(grammarAccess.getAbstractNodeParameterAccess().getAlternatives(), "rule__AbstractNodeParameter__Alternatives");
			builder.put(grammarAccess.getRosRuntimeElementAccess().getAlternatives(), "rule__RosRuntimeElement__Alternatives");
			builder.put(grammarAccess.getLanguageTypeAccess().getAlternatives(), "rule__LanguageType__Alternatives");
			builder.put(grammarAccess.getPortAccess().getAlternatives(), "rule__Port__Alternatives");
			builder.put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getMiddleWareNetworkAccess().getGroup(), "rule__MiddleWareNetwork__Group__0");
			builder.put(grammarAccess.getMiddleWareNetworkAccess().getGroup_6(), "rule__MiddleWareNetwork__Group_6__0");
			builder.put(grammarAccess.getMiddleWareNetworkAccess().getGroup_9(), "rule__MiddleWareNetwork__Group_9__0");
			builder.put(grammarAccess.getFilePackageAccess().getGroup(), "rule__FilePackage__Group__0");
			builder.put(grammarAccess.getFilePackageAccess().getGroup_7(), "rule__FilePackage__Group_7__0");
			builder.put(grammarAccess.getFilterDefinitionAccess().getGroup(), "rule__FilterDefinition__Group__0");
			builder.put(grammarAccess.getFilterDefinitionAccess().getGroup_6(), "rule__FilterDefinition__Group_6__0");
			builder.put(grammarAccess.getSerializedFieldAccess().getGroup(), "rule__SerializedField__Group__0");
			builder.put(grammarAccess.getTopicMessageAccess().getGroup(), "rule__TopicMessage__Group__0");
			builder.put(grammarAccess.getServiceTypeAccess().getGroup(), "rule__ServiceType__Group__0");
			builder.put(grammarAccess.getServiceAccess().getGroup(), "rule__Service__Group__0");
			builder.put(grammarAccess.getTopicAccess().getGroup(), "rule__Topic__Group__0");
			builder.put(grammarAccess.getBooleanParameterAccess().getGroup(), "rule__BooleanParameter__Group__0");
			builder.put(grammarAccess.getBooleanParameterAccess().getGroup_5(), "rule__BooleanParameter__Group_5__0");
			builder.put(grammarAccess.getIntegerParameterAccess().getGroup(), "rule__IntegerParameter__Group__0");
			builder.put(grammarAccess.getIntegerParameterAccess().getGroup_10(), "rule__IntegerParameter__Group_10__0");
			builder.put(grammarAccess.getDoubleParameterAccess().getGroup(), "rule__DoubleParameter__Group__0");
			builder.put(grammarAccess.getDoubleParameterAccess().getGroup_10(), "rule__DoubleParameter__Group_10__0");
			builder.put(grammarAccess.getNodeParameterGroupAccess().getGroup(), "rule__NodeParameterGroup__Group__0");
			builder.put(grammarAccess.getNodeParameterGroupAccess().getGroup_3(), "rule__NodeParameterGroup__Group_3__0");
			builder.put(grammarAccess.getNodeParameterGroupAccess().getGroup_4(), "rule__NodeParameterGroup__Group_4__0");
			builder.put(grammarAccess.getLibraryAccess().getGroup(), "rule__Library__Group__0");
			builder.put(grammarAccess.getLibraryAccess().getGroup_5(), "rule__Library__Group_5__0");
			builder.put(grammarAccess.getLibraryAccess().getGroup_10(), "rule__Library__Group_10__0");
			builder.put(grammarAccess.getLibraryAccess().getGroup_11(), "rule__Library__Group_11__0");
			builder.put(grammarAccess.getLibraryAccess().getGroup_12(), "rule__Library__Group_12__0");
			builder.put(grammarAccess.getLibraryAccess().getGroup_13(), "rule__Library__Group_13__0");
			builder.put(grammarAccess.getNodeAccess().getGroup(), "rule__Node__Group__0");
			builder.put(grammarAccess.getNodeAccess().getGroup_5(), "rule__Node__Group_5__0");
			builder.put(grammarAccess.getNodeAccess().getGroup_10(), "rule__Node__Group_10__0");
			builder.put(grammarAccess.getNodeAccess().getGroup_11(), "rule__Node__Group_11__0");
			builder.put(grammarAccess.getNodeAccess().getGroup_12(), "rule__Node__Group_12__0");
			builder.put(grammarAccess.getNodeAccess().getGroup_13(), "rule__Node__Group_13__0");
			builder.put(grammarAccess.getNodeAccess().getGroup_14(), "rule__Node__Group_14__0");
			builder.put(grammarAccess.getFilterConnectionAccess().getGroup(), "rule__FilterConnection__Group__0");
			builder.put(grammarAccess.getFilterConnectionAccess().getGroup_7(), "rule__FilterConnection__Group_7__0");
			builder.put(grammarAccess.getContinuousStateAccess().getGroup(), "rule__ContinuousState__Group__0");
			builder.put(grammarAccess.getInputPortAccess().getGroup(), "rule__InputPort__Group__0");
			builder.put(grammarAccess.getInputPortAccess().getGroup_5(), "rule__InputPort__Group_5__0");
			builder.put(grammarAccess.getInputPortAccess().getGroup_6(), "rule__InputPort__Group_6__0");
			builder.put(grammarAccess.getOutputPortAccess().getGroup(), "rule__OutputPort__Group__0");
			builder.put(grammarAccess.getOutputPortAccess().getGroup_5(), "rule__OutputPort__Group_5__0");
			builder.put(grammarAccess.getDoubleAccess().getGroup(), "rule__Double__Group__0");
			builder.put(grammarAccess.getMiddleWareNetworkAccess().getNameAssignment_2(), "rule__MiddleWareNetwork__NameAssignment_2");
			builder.put(grammarAccess.getMiddleWareNetworkAccess().getNetworktypeAssignment_5(), "rule__MiddleWareNetwork__NetworktypeAssignment_5");
			builder.put(grammarAccess.getMiddleWareNetworkAccess().getNetworktypeAssignment_6_1(), "rule__MiddleWareNetwork__NetworktypeAssignment_6_1");
			builder.put(grammarAccess.getMiddleWareNetworkAccess().getFilepackageAssignment_7(), "rule__MiddleWareNetwork__FilepackageAssignment_7");
			builder.put(grammarAccess.getMiddleWareNetworkAccess().getFilepackageAssignment_8(), "rule__MiddleWareNetwork__FilepackageAssignment_8");
			builder.put(grammarAccess.getMiddleWareNetworkAccess().getChannelsAssignment_9_2(), "rule__MiddleWareNetwork__ChannelsAssignment_9_2");
			builder.put(grammarAccess.getMiddleWareNetworkAccess().getChannelsAssignment_9_3(), "rule__MiddleWareNetwork__ChannelsAssignment_9_3");
			builder.put(grammarAccess.getFilePackageAccess().getNameAssignment_2(), "rule__FilePackage__NameAssignment_2");
			builder.put(grammarAccess.getFilePackageAccess().getGenerateartifactAssignment_3(), "rule__FilePackage__GenerateartifactAssignment_3");
			builder.put(grammarAccess.getFilePackageAccess().getAbstractroselementAssignment_5(), "rule__FilePackage__AbstractroselementAssignment_5");
			builder.put(grammarAccess.getFilePackageAccess().getAbstractroselementAssignment_6(), "rule__FilePackage__AbstractroselementAssignment_6");
			builder.put(grammarAccess.getFilePackageAccess().getFilterAssignment_7_0(), "rule__FilePackage__FilterAssignment_7_0");
			builder.put(grammarAccess.getFilePackageAccess().getFilterAssignment_7_1(), "rule__FilePackage__FilterAssignment_7_1");
			builder.put(grammarAccess.getFilterDefinitionAccess().getNameAssignment_2(), "rule__FilterDefinition__NameAssignment_2");
			builder.put(grammarAccess.getFilterDefinitionAccess().getInput_fieldAssignment_5(), "rule__FilterDefinition__Input_fieldAssignment_5");
			builder.put(grammarAccess.getFilterDefinitionAccess().getInput_fieldAssignment_6_1(), "rule__FilterDefinition__Input_fieldAssignment_6_1");
			builder.put(grammarAccess.getFilterDefinitionAccess().getOutput_fieldAssignment_8(), "rule__FilterDefinition__Output_fieldAssignment_8");
			builder.put(grammarAccess.getSerializedFieldAccess().getIdAssignment_2(), "rule__SerializedField__IdAssignment_2");
			builder.put(grammarAccess.getSerializedFieldAccess().getTopicmessageAssignment_3(), "rule__SerializedField__TopicmessageAssignment_3");
			builder.put(grammarAccess.getTopicMessageAccess().getNameAssignment_2(), "rule__TopicMessage__NameAssignment_2");
			builder.put(grammarAccess.getServiceTypeAccess().getNameAssignment_2(), "rule__ServiceType__NameAssignment_2");
			builder.put(grammarAccess.getServiceAccess().getNameAssignment_2(), "rule__Service__NameAssignment_2");
			builder.put(grammarAccess.getServiceAccess().getTypeAssignment_4(), "rule__Service__TypeAssignment_4");
			builder.put(grammarAccess.getTopicAccess().getNameAssignment_2(), "rule__Topic__NameAssignment_2");
			builder.put(grammarAccess.getTopicAccess().getTypeAssignment_4(), "rule__Topic__TypeAssignment_4");
			builder.put(grammarAccess.getBooleanParameterAccess().getNameAssignment_2(), "rule__BooleanParameter__NameAssignment_2");
			builder.put(grammarAccess.getBooleanParameterAccess().getDefaultvalAssignment_4(), "rule__BooleanParameter__DefaultvalAssignment_4");
			builder.put(grammarAccess.getBooleanParameterAccess().getTargetvarAssignment_5_1(), "rule__BooleanParameter__TargetvarAssignment_5_1");
			builder.put(grammarAccess.getIntegerParameterAccess().getNameAssignment_2(), "rule__IntegerParameter__NameAssignment_2");
			builder.put(grammarAccess.getIntegerParameterAccess().getDefaultvalAssignment_4(), "rule__IntegerParameter__DefaultvalAssignment_4");
			builder.put(grammarAccess.getIntegerParameterAccess().getMinvalAssignment_6(), "rule__IntegerParameter__MinvalAssignment_6");
			builder.put(grammarAccess.getIntegerParameterAccess().getMaxvalAssignment_8(), "rule__IntegerParameter__MaxvalAssignment_8");
			builder.put(grammarAccess.getIntegerParameterAccess().getTargetvarAssignment_10_1(), "rule__IntegerParameter__TargetvarAssignment_10_1");
			builder.put(grammarAccess.getDoubleParameterAccess().getNameAssignment_2(), "rule__DoubleParameter__NameAssignment_2");
			builder.put(grammarAccess.getDoubleParameterAccess().getDefaultvalAssignment_4(), "rule__DoubleParameter__DefaultvalAssignment_4");
			builder.put(grammarAccess.getDoubleParameterAccess().getMinvalAssignment_6(), "rule__DoubleParameter__MinvalAssignment_6");
			builder.put(grammarAccess.getDoubleParameterAccess().getMaxvalAssignment_8(), "rule__DoubleParameter__MaxvalAssignment_8");
			builder.put(grammarAccess.getDoubleParameterAccess().getTargetvarAssignment_10_1(), "rule__DoubleParameter__TargetvarAssignment_10_1");
			builder.put(grammarAccess.getNodeParameterGroupAccess().getNameAssignment_2(), "rule__NodeParameterGroup__NameAssignment_2");
			builder.put(grammarAccess.getNodeParameterGroupAccess().getConfig_objAssignment_3_1(), "rule__NodeParameterGroup__Config_objAssignment_3_1");
			builder.put(grammarAccess.getNodeParameterGroupAccess().getGenerate_structAssignment_4_1(), "rule__NodeParameterGroup__Generate_structAssignment_4_1");
			builder.put(grammarAccess.getNodeParameterGroupAccess().getNodeparameterAssignment_6(), "rule__NodeParameterGroup__NodeparameterAssignment_6");
			builder.put(grammarAccess.getNodeParameterGroupAccess().getNodeparameterAssignment_7(), "rule__NodeParameterGroup__NodeparameterAssignment_7");
			builder.put(grammarAccess.getLibraryAccess().getNameAssignment_2(), "rule__Library__NameAssignment_2");
			builder.put(grammarAccess.getLibraryAccess().getNamespaceAssignment_4(), "rule__Library__NamespaceAssignment_4");
			builder.put(grammarAccess.getLibraryAccess().getImplementsAssignment_5_1(), "rule__Library__ImplementsAssignment_5_1");
			builder.put(grammarAccess.getLibraryAccess().getGenerateartifactAssignment_6(), "rule__Library__GenerateartifactAssignment_6");
			builder.put(grammarAccess.getLibraryAccess().getLanguageAssignment_9(), "rule__Library__LanguageAssignment_9");
			builder.put(grammarAccess.getLibraryAccess().getLanguageAssignment_10_1(), "rule__Library__LanguageAssignment_10_1");
			builder.put(grammarAccess.getLibraryAccess().getNodeparametersAssignment_11_2(), "rule__Library__NodeparametersAssignment_11_2");
			builder.put(grammarAccess.getLibraryAccess().getNodeparametersAssignment_11_3(), "rule__Library__NodeparametersAssignment_11_3");
			builder.put(grammarAccess.getLibraryAccess().getContinousstateAssignment_12_2(), "rule__Library__ContinousstateAssignment_12_2");
			builder.put(grammarAccess.getLibraryAccess().getPortAssignment_13_0(), "rule__Library__PortAssignment_13_0");
			builder.put(grammarAccess.getLibraryAccess().getPortAssignment_13_1(), "rule__Library__PortAssignment_13_1");
			builder.put(grammarAccess.getNodeAccess().getNameAssignment_2(), "rule__Node__NameAssignment_2");
			builder.put(grammarAccess.getNodeAccess().getNamespaceAssignment_4(), "rule__Node__NamespaceAssignment_4");
			builder.put(grammarAccess.getNodeAccess().getImplementsAssignment_5_1(), "rule__Node__ImplementsAssignment_5_1");
			builder.put(grammarAccess.getNodeAccess().getGenerateartifactAssignment_6(), "rule__Node__GenerateartifactAssignment_6");
			builder.put(grammarAccess.getNodeAccess().getLanguageAssignment_9(), "rule__Node__LanguageAssignment_9");
			builder.put(grammarAccess.getNodeAccess().getLanguageAssignment_10_1(), "rule__Node__LanguageAssignment_10_1");
			builder.put(grammarAccess.getNodeAccess().getNodeparametersAssignment_11_2(), "rule__Node__NodeparametersAssignment_11_2");
			builder.put(grammarAccess.getNodeAccess().getNodeparametersAssignment_11_3(), "rule__Node__NodeparametersAssignment_11_3");
			builder.put(grammarAccess.getNodeAccess().getContinousstateAssignment_12_2(), "rule__Node__ContinousstateAssignment_12_2");
			builder.put(grammarAccess.getNodeAccess().getPortAssignment_13_0(), "rule__Node__PortAssignment_13_0");
			builder.put(grammarAccess.getNodeAccess().getPortAssignment_13_1(), "rule__Node__PortAssignment_13_1");
			builder.put(grammarAccess.getNodeAccess().getFilterconnectionAssignment_14_0(), "rule__Node__FilterconnectionAssignment_14_0");
			builder.put(grammarAccess.getNodeAccess().getFilterconnectionAssignment_14_1(), "rule__Node__FilterconnectionAssignment_14_1");
			builder.put(grammarAccess.getFilterConnectionAccess().getNameAssignment_2(), "rule__FilterConnection__NameAssignment_2");
			builder.put(grammarAccess.getFilterConnectionAccess().getUsedfilterAssignment_4(), "rule__FilterConnection__UsedfilterAssignment_4");
			builder.put(grammarAccess.getFilterConnectionAccess().getInputAssignment_6(), "rule__FilterConnection__InputAssignment_6");
			builder.put(grammarAccess.getFilterConnectionAccess().getInputAssignment_7_1(), "rule__FilterConnection__InputAssignment_7_1");
			builder.put(grammarAccess.getFilterConnectionAccess().getOutputAssignment_10(), "rule__FilterConnection__OutputAssignment_10");
			builder.put(grammarAccess.getContinuousStateAccess().getNameAssignment_2(), "rule__ContinuousState__NameAssignment_2");
			builder.put(grammarAccess.getInputPortAccess().getNameAssignment_2(), "rule__InputPort__NameAssignment_2");
			builder.put(grammarAccess.getInputPortAccess().getChannelAssignment_4(), "rule__InputPort__ChannelAssignment_4");
			builder.put(grammarAccess.getInputPortAccess().getEstimated_freqAssignment_5_1(), "rule__InputPort__Estimated_freqAssignment_5_1");
			builder.put(grammarAccess.getInputPortAccess().getSample_toleranceAssignment_5_3(), "rule__InputPort__Sample_toleranceAssignment_5_3");
			builder.put(grammarAccess.getInputPortAccess().getDebugAssignment_5_4(), "rule__InputPort__DebugAssignment_5_4");
			builder.put(grammarAccess.getInputPortAccess().getSynchronizesStateAssignment_6_1(), "rule__InputPort__SynchronizesStateAssignment_6_1");
			builder.put(grammarAccess.getOutputPortAccess().getNameAssignment_2(), "rule__OutputPort__NameAssignment_2");
			builder.put(grammarAccess.getOutputPortAccess().getChannelAssignment_4(), "rule__OutputPort__ChannelAssignment_4");
			builder.put(grammarAccess.getOutputPortAccess().getEstimated_freqAssignment_5_1(), "rule__OutputPort__Estimated_freqAssignment_5_1");
			builder.put(grammarAccess.getOutputPortAccess().getDebugAssignment_5_2(), "rule__OutputPort__DebugAssignment_5_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private RosNetworkDslGrammarAccess grammarAccess;

	@Override
	protected InternalRosNetworkDslParser createParser() {
		InternalRosNetworkDslParser result = new InternalRosNetworkDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public RosNetworkDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(RosNetworkDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}

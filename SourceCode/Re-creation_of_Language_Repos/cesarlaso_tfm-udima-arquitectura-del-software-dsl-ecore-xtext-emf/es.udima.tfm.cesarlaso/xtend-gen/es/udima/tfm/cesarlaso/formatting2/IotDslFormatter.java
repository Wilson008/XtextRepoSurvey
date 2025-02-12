/**
 * generated by Xtext 2.35.0
 */
package es.udima.tfm.cesarlaso.formatting2;

import com.google.inject.Inject;
import es.udima.cesarlaso.tfm.communicationsprograms.RemoteIdentifier;
import es.udima.cesarlaso.tfm.deploymentdevices.Device;
import es.udima.cesarlaso.tfm.gpios.Pin;
import es.udima.cesarlaso.tfm.iotproyects.IotProyect;
import es.udima.cesarlaso.tfm.operatingsystemactuators.FilePath;
import es.udima.cesarlaso.tfm.programs.Program;
import es.udima.cesarlaso.tfm.programs.ProgramState;
import es.udima.cesarlaso.tfm.servers.Server;
import es.udima.tfm.cesarlaso.services.IotDslGrammarAccess;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class IotDslFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private IotDslGrammarAccess _iotDslGrammarAccess;

  protected void _format(final IotProyect iotProyect, @Extension final IFormattableDocument document) {
    EList<Device> _deploymentDevice = iotProyect.getDeploymentDevice();
    for (final Device device : _deploymentDevice) {
      document.<Device>format(device);
    }
    EList<Server> _server = iotProyect.getServer();
    for (final Server server : _server) {
      document.<Server>format(server);
    }
    document.<Program>format(iotProyect.getProgram());
  }

  protected void _format(final Program program, @Extension final IFormattableDocument document) {
    EList<Pin> _gpioAliases = program.getGpioAliases();
    for (final Pin pin : _gpioAliases) {
      document.<Pin>format(pin);
    }
    EList<RemoteIdentifier> _remoteIdentifiers = program.getRemoteIdentifiers();
    for (final RemoteIdentifier remoteIdentifier : _remoteIdentifiers) {
      document.<RemoteIdentifier>format(remoteIdentifier);
    }
    EList<FilePath> _files = program.getFiles();
    for (final FilePath filePath : _files) {
      document.<FilePath>format(filePath);
    }
    EList<ProgramState> _states = program.getStates();
    for (final ProgramState programState : _states) {
      document.<ProgramState>format(programState);
    }
  }

  public void format(final Object iotProyect, final IFormattableDocument document) {
    if (iotProyect instanceof XtextResource) {
      _format((XtextResource)iotProyect, document);
      return;
    } else if (iotProyect instanceof IotProyect) {
      _format((IotProyect)iotProyect, document);
      return;
    } else if (iotProyect instanceof Program) {
      _format((Program)iotProyect, document);
      return;
    } else if (iotProyect instanceof EObject) {
      _format((EObject)iotProyect, document);
      return;
    } else if (iotProyect == null) {
      _format((Void)null, document);
      return;
    } else if (iotProyect != null) {
      _format(iotProyect, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(iotProyect, document).toString());
    }
  }
}

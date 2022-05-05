import org.junit.platform.engine.discovery.DiscoverySelectors;
import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.core.LauncherConfig;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;

import java.io.PrintWriter;

public class TestLauncher {

  public static void main(String[] args) {
    LauncherConfig launcherConfig = org.junit.platform.launcher.core.LauncherConfig
            .builder()
            .build();
    Launcher launcher = LauncherFactory.create(launcherConfig);

    SummaryGeneratingListener summaryGeneratingListener = new SummaryGeneratingListener();

    LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder
            .request()
            .selectors(DiscoverySelectors.selectPackage("base.page.tests"))
            .build();
    launcher.execute(request, summaryGeneratingListener);

    try (PrintWriter printWriter = new PrintWriter(System.out)) {
      summaryGeneratingListener.getSummary().printTo(printWriter);
    }
  }
}

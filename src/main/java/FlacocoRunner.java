import fr.spoonlabs.flacoco.api.Flacoco;
import fr.spoonlabs.flacoco.api.result.Location;
import fr.spoonlabs.flacoco.api.result.Suspiciousness;
import fr.spoonlabs.flacoco.core.config.FlacocoConfig;
import fr.spoonlabs.flacoco.api.result.FlacocoResult;
import fr.spoonlabs.flacoco.core.test.method.TestMethod;
import fr.spoonlabs.flacoco.localization.spectrum.SpectrumFormula;

import java.util.*;

public class FlacocoRunner {
    public static void main(String[] args) {
        FlacocoConfig config = new FlacocoConfig();
        config.setProjectPath("C4BJ/");
        config.setClasspath("C4BJ/target/classes:C4BJ/target/test-classes");

        config.setFamily(FlacocoConfig.FaultLocalizationFamily.SPECTRUM_BASED);
        config.setSpectrumFormula(SpectrumFormula.OCHIAI);

        Flacoco flacoco = new Flacoco(config);
        FlacocoResult result = flacoco.run();

        Set<TestMethod> failingTests = result.getFailingTests();
        Map<Location, Suspiciousness> mapping = result.getDefaultSuspiciousnessMap();
    }
}
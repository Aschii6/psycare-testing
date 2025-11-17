package runners;

import org.junit.platform.suite.api.*;

@Suite
@IncludeEngines("cucumber")
@SelectPackages("features")
@ConfigurationParameter(key = "cucumber.glue", value = "steps, hooks")
@ConfigurationParameter(key = "cucumber.plugin", value = "pretty, html:target/cucumber-reports.html")
public class CucumberTestRunner {
}

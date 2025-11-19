package runners;

import org.junit.platform.suite.api.*;

@Suite
@IncludeEngines("cucumber")
@SelectPackages("features")
@ConfigurationParameter(key = "cucumber.glue", value = "steps, hooks")
@ConfigurationParameter(key = "cucumber.plugin", value = "pretty, html:target/cucumber-reports.html")
//@ConfigurationParameter(key = "cucumber.filter.tags", value = "@FR-006") // Run specific feature by tag
public class CucumberTestRunner {
}

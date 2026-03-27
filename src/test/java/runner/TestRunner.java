package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue ="stepdefinitions",
        plugin = {"pretty",
                "junit:target/JUNITReports/report.xml",
                "html:target/HtmlReports/report.html",
                "json:target/JSONReports/report.json"
        },
        tags = "@SmokeTest"
)

public class TestRunner {
}

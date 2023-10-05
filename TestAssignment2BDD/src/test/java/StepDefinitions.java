import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.w3c.dom.ls.LSOutput;

public class StepDefinitions {
    String input;
    UtilityController utilityController = new UtilityController();

    @Given("I have a string {string}")
    public void iHaveAString(String arg0) {
        this.input = arg0;
    }


    @When("I reverse the string")
    public void iReverseTheString() {
        this.input = utilityController.ReverseString(input);
    }

    @When("I capitalize the string")
    public void iCapitalizeTheString() {
        this.input = utilityController.CapitalizeString(input);
    }

    @When("I lowercase the string")
    public void iLowercaseTheString() {
        this.input = utilityController.LowercaseString(input);
    }


    @Then("the result should be {string}")
    public void theResultShouldBe(String arg0) {
        Assert.assertEquals(arg0, input);
    }
}

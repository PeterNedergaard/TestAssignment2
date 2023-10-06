import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class Stepdefs {

    Game game;

    @Given("a new game")
    public void aNewGame() {
        this.game = new Game();
    }

    @When("I roll {int} times {int} pins")
    public void iRollTimesPins(int arg0, int arg1) {
        for (int i = 0; i < arg0; i++) {
            game.roll(arg1);
        }
    }

    @Then("my total score should be {int}")
    public void myTotalScoreShouldBe(int arg0) {
        Assert.assertEquals(arg0, game.score());
    }

    @When("I roll {int} pins")
    public void iRollPins(int arg0) {
        game.roll(arg0);
    }
}

package skeleton;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;


public class Stepdefs {

    // Se crea una instancia de la clase Belly para simular un estómago
    Belly belly = new Belly();

    // Método que se ejecuta cuando se indica que se han comido cierta cantidad de pepinos
    @Given("^I have eaten (\\d+) cukes$")
    public void I_have_eaten_cukes(int cukes) throws Throwable {
        System.out.println("I'm eating " + cukes + " cukes!"); // Se imprime un mensaje indicando cuántos pepinos se están comiendo
        belly.eat(cukes); // Se llama al método eat() del objeto Belly para simular la acción de comer pepinos
    }

    // Método que se ejecuta cuando se indica que se debe esperar cierto tiempo en horas
    @When("^I wait (\\d+) hour$")
    public void i_wait_hour(int arg1) throws Throwable {
        belly.wait(arg1); // Se llama al método wait() del objeto Belly para simular la acción de esperar
    }

    // Método que se ejecuta para verificar si el estómago está gruñendo (vacío)
    @Then("^(?i)my\\s*belly\\s*should\\s*growl$")
    public void my_belly_should_growl() throws Throwable {
        assertTrue(belly.isGrowling()); // Se verifica si el estómago está gruñendo
    }

    // Método que se ejecuta para verificar si el estómago no está gruñendo (lleno)
    @Then("^(?i)my\\s*belly\\s*should\\s*not\\s*growl$")
    public void my_belly_should_not_growl() throws Throwable {
        assertTrue(!belly.isGrowling()); // Se verifica si el estómago no está gruñendo
    }
}

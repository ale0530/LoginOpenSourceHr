LoginSteps.java: Pasos para el login.

package com.choucair.automation.steps;

import com.choucair.automation.tasks.LoginTask;
import io.cucumber.java.es.Given;
import net.serenitybdd.screenplay.Actor;

public class LoginSteps {

    Actor actor = Actor.named("Recruiter");

    @Given("que el reclutador se encuentra en la página de login")
    public void queElReclutadorSeEncuentraEnLaPaginaDeLogin() {
        actor.attemptsTo(LoginTask.withCredentials("Admin", "admin123"));
    }
}

RecruitmentSteps.java: Pasos para la contratación.

package com.choucair.automation.steps;

import com.choucair.automation.models.Person;
import com.choucair.automation.tasks.RecruitmentTask;
import io.cucumber.java.This.When;
import io.cucumber.java.This.Then;
import net.serenitybdd.screenplay.Actor;

public class RecruitmentSteps {

    Actor actor = Actor.named("Recruiter");

    @When("el reclutador agrega una persona con los siguientes datos")
    public void elReclutadorAgregaUnaPersonaConLosSiguientesDatos() {
        Person person = new Person("Oscar", "Roa", "oscarroa@gmail.com", "Payroll Administrator");
        actor.attemptsTo(RecruitmentTask.forPerson(person));
    }

    @Then("el reclutador debe ver que la persona fue contratada")
    public void elReclutadorDebeVerQueLaPersonaFueContratada() {
        // Aquí se validaría que el estado del candidato sea "Hired"
    }
}
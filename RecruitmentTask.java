package com.choucair.automation.tasks;

import com.choucair.automation.models.Person;
import com.choucair.automation.userinterfaces.RecruitmentPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;

public class RecruitmentTask implements Task {

    private Person person;

    public RecruitmentTask(Person person) {
        this.person = person;
    }

    public static RecruitmentTask forPerson(Person person) {
        return new RecruitmentTask(person);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RecruitmentPage.ADD_BUTTON),
                Enter.theValue(person.getFirstName()).into(RecruitmentPage.FIRST_NAME),
                Enter.theValue(person.getLastName()).into(RecruitmentPage.LAST_NAME),
                Enter.theValue(person.getEmail()).into(RecruitmentPage.EMAIL),
                Enter.theValue(person.getVacancyTitle()).into(RecruitmentPage.Vacancy_TITLE),
				Enter.theValue(person.getContactNumber()).into(RecruitmentPage.CONTACT_NUMBER),
                Click.on(RecruitmentPage.HIRE_BUTTON)
        );
    }
}
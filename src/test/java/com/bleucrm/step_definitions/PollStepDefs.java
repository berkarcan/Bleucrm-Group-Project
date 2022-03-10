package com.bleucrm.step_definitions;
import com.bleucrm.pages.DashBoardPage;
import com.bleucrm.pages.PollPage;
import com.bleucrm.utilities.BrowserUtils;
import com.bleucrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PollStepDefs {
    PollPage pollPage = new PollPage();

    @When("user clicks on poll tab")
    public void userClicksOnPollTab() {
        new DashBoardPage().poll_tab.click();
        BrowserUtils.waitForVisibility(pollPage.firstQuestion,10);
    }

    @When("user click on destination input box and clicks Employees and Departments")
    public void userClickOnDestinationInputBoxAndClicksEmployeesAndDepartments() {
        pollPage.destinationInputBox.click();


    }

    @When("user clicks {string} and clicks Employees and Departments")
    public void userClicksAddMoreAndClicksEmployeesAndDepartments(String Addmore) {
        Driver.get().findElement(By.linkText(Addmore)).click();
        pollPage.EmployeesDepartmentsTab.click();

    }

    int RandomIndex;
    List<Integer> randil=new ArrayList<>();
    @And("user can click to add {int} departments and {int} employees randomly")
    public void userCanClickToAddDepartmentsAndEmployeesRandomly(int dep_num, int employee_num) {
        List<WebElement> dep_list = new ArrayList<>();

        for (WebElement webElement : pollPage.departments) {
            if (!webElement.getText().contains("Cyber Vet")) {
                dep_list.add(webElement);
            }
        }
        System.out.println(BrowserUtils.getElementsText(dep_list));

        for (int i = 0; i < dep_num; i++) {
            RandomIndex = new Random().nextInt(dep_list.size());
            while (randil.contains(RandomIndex )){
                RandomIndex = new Random().nextInt(dep_list.size());
            }
            randil.add(RandomIndex);
            new Actions(Driver.get()).moveToElement( dep_list.get(RandomIndex));
            dep_list.get(RandomIndex).click();
            BrowserUtils.waitFor(1.0);
            pollPage.department_check.get(RandomIndex).click();
        }
        for (int i = 0; i < employee_num; i++) {
            RandomIndex = new Random().nextInt(pollPage.employees.size());
            new Actions(Driver.get()).moveToElement(pollPage.employees.get(RandomIndex));
            pollPage.employees.get(RandomIndex).click();
        }

    }

    @When("user clicks on link icon")
    public void userClicksOnLinkIcon() {
        pollPage.linkIcon.click();
    }


    @Then("user can save text {string} or link {string}")
    public void userCanSaveTextAndorLink(String text, String link) {
        if (!text.isEmpty()) {
            pollPage.textBox.sendKeys(text);
        }
        if (!link.isEmpty()) {
            pollPage.linkBox.sendKeys(link);
        }
        pollPage.saveButton.click();
    }

    @When("user clicks on add mention icon and clicks on Employees and Departments")
    public void userClicksOnAddMentionIconAndClicksOnEmployeesAndDepartments() {
        pollPage.addMentionIcon.click();
        pollPage.EmployeesDepartmentsTabMention.click();
    }


    @Then("user can select {int} employee emails randomly to mention")
    public void userCanSelectEmployeeEmailsRandomlyToMention(int employee_num) {
        for (int i = 0; i < employee_num; i++) {
            int RandomIndex = new Random().nextInt(pollPage.employees.size());
            pollPage.employees.get(RandomIndex).click();
            pollPage.addMentionIcon.click();
            pollPage.EmployeesDepartmentsTabMention.click();
        }
    }

    @Then("user can select an employee email randomly to mention")
    public void userCanSelectAnEmployeeEmailRandomlyToMention() {
        int RandomIndex = new Random().nextInt(pollPage.employees.size());
        pollPage.employees.get(RandomIndex).click();
    }

    int expectedNumOfQuestions;
    @When("user clicks on {string} text to add question {int} times")
    public void userClicksOnTextToAddQuestionTimeS(String addq, int nClick) {

        expectedNumOfQuestions = pollPage.questions.size()+nClick; //on the page, existing former poll questions+number of clicks
        System.out.println("nClick = " + nClick);
        System.out.println("expectedNumOfQuestions = " + expectedNumOfQuestions);
        for (int i = 0; i < nClick; i++) {
            Driver.get().findElement(By.linkText(addq)).click();
        }

    }


    @Then("text boxes for n+1 questions and their answer boxes are displayed")
    public void text_boxes_for_n_1_questions_and_their_answer_boxes_are_displayed() {
        int actualNumOfQuestions = pollPage.questions.size();
        Assert.assertEquals(expectedNumOfQuestions, actualNumOfQuestions);
    }

    int expectedNumofAnswers;
    int lastAnswerNo;
    @When("user clicks on the last answer box of question {int} {int} times")
    public int user_clicks_on_the_last_answer_box_of_question(Integer Qnumber, Integer clickTimes) {

        for (int i = 0; i < clickTimes; i++) {
            lastAnswerNo = Driver.get().findElements(By.cssSelector("[id^=answer_" + (Qnumber - 1) + "]")).size() - 1;
            //answernos starts from 0, so the no is size-1

            Driver.get().findElement(By.id("answer_" + (Qnumber - 1) + "__" + lastAnswerNo + "_")).click();

        }
        expectedNumofAnswers = lastAnswerNo + 2; //last answer increases by 1 and size is already+1 wrt number
        return expectedNumofAnswers;
    }

    @Then("new answer boxes added below the clicked last answer of question {int}")
    public void an_new_answer_box_is_added_below_the_clicked_last_answer_of_question(Integer Qnumber) {
        int actualNumofAnswers = Driver.get().findElements(By.cssSelector("[id^=answer_" + (Qnumber - 1) + "]")).size();
        Assert.assertEquals(expectedNumofAnswers, actualNumofAnswers);

    }

    @Then("user can delete the following questions with the numbers")
    public void user_can_delete_the_following_questions_with_the_numbers(List<Integer> Qnums) {
        //List<WebElement> deleteQIcons = Driver.get().findElements(By.xpath("//*[@class='vote-block-close delq']"));
        List<WebElement> deleteQIcons =pollPage.deleteQIcons;
        for (Integer qnum : Qnums) {
            Driver.get().findElement(By.id("question_" + (qnum - 1))).click();
            deleteQIcons.get(qnum - 1).click();
        }

    }

    @Then("user can delete {int} answers of question {int}")
    public void userCanDeleteAnswersOfQuestion(int numOfAnswersToDelete, int questionNumber) {
        List<WebElement> deleteQIcons = Driver.get().findElements(By.xpath("//*[@class='vote-block-close dela']"));
        int numOfAnswers= Driver.get().findElements(By.cssSelector("[id^=answer_"+(questionNumber-1)+"]")).size();
        for (int i = 0; i < numOfAnswersToDelete; i++) {

            WebElement answer= Driver.get().findElement(By.id("answer_" + (questionNumber - 1)+"__"+(numOfAnswers-numOfAnswersToDelete+i)+"_"));
            deleteQIcons.get((questionNumber - 1)*2+numOfAnswers+i-numOfAnswersToDelete).click();
        }
    }

    @When("user allows multiple choices, insert questions and answers")
    public void userAllowsMultipleChoicesInsertQuestionsAndAnswers() {
        int n=0;
        for (WebElement question : pollPage.questions) {
//            JavascriptExecutor executor = (JavascriptExecutor) Driver.get();
//            executor.executeScript("arguments[0].scrollIntoView(true);", question);
            BrowserUtils.waitForVisibility(question,10);
            question.sendKeys("question "+n+" ?");
            //click checkbox
            new Actions(Driver.get()).moveToElement(pollPage.allowMultipleCheckboxes.get(n));
            BrowserUtils.waitForClickablility(pollPage.allowMultipleCheckboxes.get(n),10);
            pollPage.allowMultipleCheckboxes.get(n).click();
            n++;
        }

        List<WebElement> answers=Driver.get().findElements(By.cssSelector("[id^=answer_]"));
        int t=1;
        for (WebElement answer : answers) {
            new Actions(Driver.get()).moveToElement(answer);
            BrowserUtils.waitForClickablility(answer,10);
            answer.sendKeys("Good answer "+t);
            t++;
        }

    }

    @Then("user can send the poll")
    public void userCanSendThePoll() {
        pollPage.sendButton.click();
    }
}


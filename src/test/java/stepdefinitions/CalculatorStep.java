package stepdefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static locators.Label.*;
import static org.junit.Assert.assertEquals;
import static util.Drivers.*;


public class CalculatorStep {



    @Given("^a clear calculator$")
    public void a_clear_calculator() throws Throwable {

        System.out.println("Clear Calculator Step");
        findElementById(CLEAR).click();
    }

    @Then("^I should see them in the Calculator display$")
    public void i_should_see_them_in_the_Calculator_display() throws Throwable {

        System.out.println("Checking numbers from 0-9 in Display");
        assertEquals("0123456789", findElementById(DISPLAY_OUTPUT).getText());

    }

    @When("^I press \"(.*?)\"$")
    public void i_press(String num) throws Throwable {

        String[] n = num.split("");

        for( String singleNumber: n){ /* Pressing each number passed */
            System.out.println("Pressing number: " + singleNumber);

            if(singleNumber.equals("0")) findElementById(NUMBER_0).click();
            else if(singleNumber.equals("1")) findElementById(NUMBER_1).click();
            else if(singleNumber.equals("2")) findElementById(NUMBER_2).click();
            else if(singleNumber.equals("3")) findElementById(NUMBER_3).click();
            else if(singleNumber.equals("4")) findElementById(NUMBER_4).click();
            else if(singleNumber.equals("5")) findElementById(NUMBER_5).click();
            else if(singleNumber.equals("6")) findElementById(NUMBER_6).click();
            else if(singleNumber.equals("7")) findElementById(NUMBER_7).click();
            else if(singleNumber.equals("8")) findElementById(NUMBER_8).click();
            else if(singleNumber.equals("9")) findElementById(NUMBER_9).click();
            else if(singleNumber.equals(".")) findElementById(DECIMAL).click();

        }

    }

    @Then("^I should get \"(.*?)\"$")
    public void i_should_get(String expected) throws Throwable {

        System.out.println("Comparing Display.");
        assertEquals(expected, findElementById(DISPLAY_OUTPUT).getText());
    }

    @When("^I press Add button$")
    public void i_press_Add_button() throws Throwable {

        System.out.println("Pressing Add(+) Button.");
        findElementById(OPERATOR_PLUS).click();
    }

    @When("^I press Subtract button$")
    public void i_press_Subtract_button() throws Throwable {

        System.out.println("Pressing Minus(-) Button.");
        findElementById(OPERATOR_MINUS).click();
    }

    @When("^I press Multiplication button$")
    public void i_press_Multiplication_button() throws Throwable {

        System.out.println("Pressing Multiply(*) Button.");
        findElementById(OPERATOR_MULTIPLY).click();
    }

    @When("^I press Divide button$")
    public void i_press_Divide_button() throws Throwable {

        System.out.println("Pressing Divide(/) Button.");
        findElementById(OPERATOR_DIVIDE).click();
    }

    @When("^I press Equals button$")
    public void i_press_Equals_button() throws Throwable {

        System.out.println("Pressing Equals(=) Button.");
        findElementById(OPERATOR_EQUALS).click();
    }

    @When("^I press \"(.*?)\" button$")
    public void i_press_button(String clearButton) throws Throwable {

        System.out.println("Pressing Clear(C) Button");
        findElementById(CLEAR).click();
    }

    @Then("^I should see the display cleared$")
    public void i_should_see_the_display_cleared() throws Throwable {

        assertEquals("", findElementById(DISPLAY_OUTPUT).getText());
    }

    @When("^I press following numbers and operations repeatedly$")
    public void i_press_following_numbers_and_operations_repeatedly(DataTable numbersAndOperators) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)


        List<List<String>> data = numbersAndOperators.raw();

        data.get(0).get(0); //First Row + First Column
        data.get(0).get(1); //First Row + Second Column

        for(int i=0; i<=4; i++){ //Rows
            for(int j=0; j<=1; j++){ //Column

                String numOrOp = data.get(i).get(j);
                String[] n = numOrOp.split("");

                for( String singleNumber: n){ /* Pressing each number or Operator passed */
                    System.out.println("Pressing: " + singleNumber);

                    if(singleNumber.equals("0")) findElementById(NUMBER_0).click();
                    else if(singleNumber.equals("1")) findElementById(NUMBER_1).click();
                    else if(singleNumber.equals("2")) findElementById(NUMBER_2).click();
                    else if(singleNumber.equals("3")) findElementById(NUMBER_3).click();
                    else if(singleNumber.equals("4")) findElementById(NUMBER_4).click();
                    else if(singleNumber.equals("5")) findElementById(NUMBER_5).click();
                    else if(singleNumber.equals("6")) findElementById(NUMBER_6).click();
                    else if(singleNumber.equals("7")) findElementById(NUMBER_7).click();
                    else if(singleNumber.equals("8")) findElementById(NUMBER_8).click();
                    else if(singleNumber.equals("9")) findElementById(NUMBER_9).click();
                    else if(singleNumber.equals(".")) findElementById(DECIMAL).click();

                    else if(singleNumber.equals("*")) findElementById(OPERATOR_MULTIPLY).click();
                    else if(singleNumber.equals("+")) findElementById(OPERATOR_PLUS).click();
                    else if(singleNumber.equals("/")) findElementById(OPERATOR_DIVIDE).click();
                    else if(singleNumber.equals("-")) findElementById(OPERATOR_MINUS).click();
                    else if(singleNumber.equals("=")) findElementById(OPERATOR_EQUALS).click();

                }
            }
        }
    }

    @When("^I click on Display field$")
    public void i_click_on_Display_field() throws Throwable {

        System.out.println("Clicking on Number display field");
        findElementById(DISPLAY_OUTPUT).click();
    }

    @When("^I type \"(.*?)\"$")
    public void i_type(String text) throws Throwable {

        System.out.println("Typing: " + text);
        findElementById(DISPLAY_OUTPUT).sendKeys(text);

    }

    @Then("^I should not see them in the display field$")
    public void i_should_not_see_them_in_the_display_field() throws Throwable {

        System.out.println("Checking blank Display");
        assertEquals("", findElementById(DISPLAY_OUTPUT).getText());
    }



}

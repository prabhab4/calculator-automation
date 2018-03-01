package stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import java.net.MalformedURLException;

import static util.Drivers.*;


public class Hooks {


    @Before
    public void beforeFunction() throws MalformedURLException {

        setUp();
    }

    @After
    public void afterFunction(){

        tearDown();
    }
}

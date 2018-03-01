

# Run Maven Suite
to run the whole Test suite use:
 `mvn "-Dcucumber.options=--tags @fullCalculatorTestSuite" clean test`

In order to pass any other variables like non-Default Device Name. use:
 `mvn "-Dcucumber.options=--tags @fullCalculatorTestSuite" -DDEVICE_NAME=SAMSUNG clean test`

##  Pass Maven parameters when needed
Available parameters to pass:
**ANDROID_VERSION, OS, DEVICE_NAME, APP_PACKAGE, APP_ACTIVITY, APP_PATH**


# Flow of the project
 *runner/RunCalculatorTest.java -> features/calculator.feature -> (stepdefinitions/Hooks.java AND stepdefinitions/CalculatorStep.java)*

# Further info on project
 - This Project uses Cucumber feature files as test cases
 - Packaged using maven
 - Appium server and framework

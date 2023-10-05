# Test Assignment 2

## 1. Reflections

### 1.1 Computer Mouse

**Identify the types of testing you would perform on a computer mouse, to make sure
that it is of the highest quality.**

#### **Unit tests**
- Laser sensor works and generates some sort of output
- Right and left mousebutton generates output when pressed, and no output when not pressed
- Scrollwheel generates one output when scrolled one way, and another output when scrolled the other way

#### **Integration tests**
- The controller-unit receives the expected input from the laser sensor in the expected format
- The controller-unit can differentiate between the right and left mousebuttons being pressed and not pressed
- The controller-unit can differentiate between the scrollwheel being scrolled one way, and being scrolled the other way

#### **System tests**
- The inputs and outputs of the mouse are tested as a complete system


#### **Acceptance tests**
- The mouse fulfills the clients requirements
- The mouse acts and reacts as the client has previously described


### 1.2 Catastrophic Failure

**Find a story where a software system defect had a bad outcome. Describe what
happened. Can you identify a test that would have prevented it?**



## 3. Investigation of tools

### 3.1 JUnit 5

**Investigate JUnit 5 (Jupiter). Explain the following, and how they are useful**

- **@Tag**
Tags can be put on tests, which can then later be used to filter tests at runtime. You can for example choose to only run tests tagged with "CustomerTests"

- **@Disabled**
These tests will not be executed

- **@RepeatedTest**
These tests will be run a specified number of times

- **@BeforeEach, @AfterEach**
Methods with these annotations will be run either before or after each test

- **@BeforeAll, @AfterAll**
Methods with these annotations will be run once either before or after all the tests

- **@DisplayName**
This annotation is used to provide tests with a more easily readable name. Can make results more descriptive

- **@Nested**
Can be used to nest tests within eachother. Useful if related tests needs to be grouped

- **assumeFalse, assumeTrue**
Can be used to abandon a test, without marking it as failed, if a certain condition is not met at the start of the test


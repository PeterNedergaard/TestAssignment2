# Test Assignment 2

## Reflections

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
/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package statesandcapitals;

import org.junit.jupiter.api.Test;
import statesandcapitals.statesAndCapitals.StatesAndCapitals;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void Test_states_and_capitals() throws IOException
    {
        StatesAndCapitals sut = new StatesAndCapitals();
        sut.testStatesAndCapitals();
    }
}

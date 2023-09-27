package statesandcapitals;

import org.junit.jupiter.api.Test;
import statesandcapitals.statesAndCapitals.StatesAndCapitals;

import java.io.IOException;

class StatesAndCapitalsTest
{
    @Test void Test_states_and_capitals() throws IOException
    {
        StatesAndCapitals sut = new StatesAndCapitals();
        sut.testStatesAndCapitals();
    }
}
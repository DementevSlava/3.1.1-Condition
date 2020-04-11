package ru.netology;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConditionTest {

    @ParameterizedTest
    @CsvSource(
            value= {
                    "30,-30,-31,-29",
                    "30,-30,-30,-29",
                    "30,-30,0,1",
                    "30,-30,29,30",
                    "30,-30,30,30",
                    "30,-30,31,30"
            }
    )

    public void increaseCurrentTemperature(int setMaxTemperature , int setMinTemperature, int setCurrentTemperature, int expected) {
        Condition condition = new Condition();
        condition.setMaxTemperature(setMaxTemperature);
        condition.setMinTemperature(setMinTemperature);
        condition.setCurrentTemperature(setCurrentTemperature);
        condition.increaseCurrentTemperature();
        assertEquals(expected, condition.getCurrentTemperature());
    }

    @ParameterizedTest
    @CsvSource(
            value= {
                    "30,-30,29,28",
                    "30,-30,30,29",
                    "30,-30,31,29",
                    "30,-30,0,-1",
                    "30,-30,-29,-30",
                    "30,-30,-30,-30",
                    "30,-30,-31,-30"
            }
    )
    public void decreaseCurrentTemperature(int setMaxTemperature , int setMinTemperature, int setCurrentTemperature, int expected) {
        Condition condition = new Condition();
        condition.setMaxTemperature(setMaxTemperature);
        condition.setMinTemperature(setMinTemperature);
        condition.setCurrentTemperature(setCurrentTemperature);
        condition.decreaseCurrentTemperature();
        assertEquals(expected, condition.getCurrentTemperature());
    }

}
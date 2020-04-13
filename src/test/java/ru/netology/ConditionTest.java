package ru.netology;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConditionTest {

    @ParameterizedTest
    @CsvSource(
            value= {
                    "'set temperature below minimum',30,-30,-31,-29",
                    "'set minimum current temperature',30,-30,-30,-29",
                    "'set current temperature in the middle',30,-30,0,1",
                    "'set current temperature is pre-maximal',30,-30,29,30",
                    "'set maximum current temperature',30,-30,30,30",
                    "'set temperature is higher than maximum',30,-30,31,30"
            }
    )

    public void increaseCurrentTemperature(String message, int maxTemperature , int minTemperature, int currentTemperature, int expected) {
        Condition condition = new Condition();
        condition.setMaxTemperature(maxTemperature);
        condition.setMinTemperature(minTemperature);
        condition.setCurrentTemperature(currentTemperature);
        condition.increaseCurrentTemperature();
        assertEquals(expected, condition.getCurrentTemperature(), message);
    }

    @ParameterizedTest
    @CsvSource(
            value= {
                    "'set maximum current temperature',30,-30,30,29",
                    "'set temperature is higher than maximum',30,-30,31,29",
                    "'set current temperature in the middle',30,-30,0,-1",
                    "'set current temperature is pre-minimal',30,-30,-29,-30",
                    "'set minimum current temperature',30,-30,-30,-30",
                    "'set temperature below minimum',30,-30,-31,-30"
            }
    )
    public void decreaseCurrentTemperature(String message, int maxTemperature , int minTemperature, int currentTemperature, int expected) {
        Condition condition = new Condition();
        condition.setMaxTemperature(maxTemperature);
        condition.setMinTemperature(minTemperature);
        condition.setCurrentTemperature(currentTemperature);
        condition.decreaseCurrentTemperature();
        assertEquals(expected, condition.getCurrentTemperature(), message);
    }

}
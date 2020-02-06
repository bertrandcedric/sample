package sample;

import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;

public class SampleTest {

    Sample sample;

    @Before
    public void before() {
        sample = new Sample();
    }

    @Test
    public void extractFromListTest() {
        List<String> data = asList("girafe", "Chat", "Chien", "poisson", "CacHalot", "reQuin", "chameau");

        List<String> result = sample.extractFromListAndFilter(data, "cha");

        Assertions.assertThat(result).containsExactly("chameau", "chat");
    }

    @After
    public void after() {

    }
}
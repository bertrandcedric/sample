package sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static java.util.Arrays.asList;

public class Sample {

    private static final Logger logger = LoggerFactory.getLogger(Sample.class);

    public static void main(String[] args) {
        Sample sample = new Sample();
        List<String> data = asList("girafe", "Chat", "Chien", "poisson", "CacHalot", "reQuin", "chameau");

        List<String> result = sample.extractFromListAndFilter(data, "cha");
        logger.info(result.toString());
    }

    public List<String> extractFromListAndFilter(List<String> data, String prefix) {
        return null;
    }

}

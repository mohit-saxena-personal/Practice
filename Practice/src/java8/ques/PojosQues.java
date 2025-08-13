package java8.ques;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PojosQues {
    public static void main(String[] args) {
        List<String> sentences = List.of(
                "Java is great",
                "Streams are powerful",
                "Java streams rock"
        );

        List<String> str = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split("\\s+")))
                .map(String::toLowerCase)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(str);

    }

}

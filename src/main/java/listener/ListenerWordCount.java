package listener;

import model.WordCount;
import org.apache.kafka.streams.kstream.KStream;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;

public interface ListenerWordCount {

    String INPUT = "input";
    String OUTPUT = "output";

    @Input(INPUT)
    KStream<Object, String> input();

    @Output(OUTPUT)
    KStream<?, WordCount> output();
}

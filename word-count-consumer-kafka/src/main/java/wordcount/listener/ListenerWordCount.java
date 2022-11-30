package wordcount.listener;

import org.apache.kafka.streams.kstream.KStream;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import wordcount.model.WordCount;

public interface ListenerWordCount {

    String INPUT = "input";
    String OUTPUT = "output";

    @Input(INPUT)
    KStream<Object, String> input();

    @Output(OUTPUT)
    KStream<?, WordCount> output();
}

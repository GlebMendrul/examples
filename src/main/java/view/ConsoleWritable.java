package view;

import java.io.IOException;

/**
 * Created by gleb on 18.11.15.
 */
public class ConsoleWritable implements Writeable {
    public void write(String message) throws IOException {
        System.out.println(message);
    }
}

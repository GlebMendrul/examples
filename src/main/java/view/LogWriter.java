package view;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

/**
 * Created by gleb on 18.11.15.
 */
public class LogWriter implements Writeable {

    public void write(String message) throws IOException {
        File file = new File("/tmp/test");
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        writer.write(new Date() + ": " + message);
        writer.close();
    }
}

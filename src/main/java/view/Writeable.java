package view;

import java.io.IOException;

/**
 * Created by gleb on 18.11.15.
 */
public interface Writeable {
    void write(String message) throws IOException;
}

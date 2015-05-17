package dynamic;

import java.io.IOException;

/**
 * Created by Pipin on 14.05.2015.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Father f = new Father();
        f.setReader(new ClassOne());
        f.Show();
        f.setReader(new ClassTwo());
        f.Show();
    }
}

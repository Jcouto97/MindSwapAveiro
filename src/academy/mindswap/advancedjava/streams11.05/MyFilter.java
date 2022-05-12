package academy.mindswap.advancedjava.streams11

import java.io.File;
import java.io.FilenameFilter;

public class MyFilter implements FilenameFilter {
    @Override
    public boolean accept(File dir, String name) {
        return false;
    }
}

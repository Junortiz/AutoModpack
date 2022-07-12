package pl.skidam.automodpack.utils;

import java.net.URL;
import java.net.URLConnection;

import static pl.skidam.automodpack.AutoModpackMain.*;

public class WebFileSize {
    // GITHUB COPILOT, I LOVE YOU!!!
    public static String webfileSize(String link) {
        String size = "";
        try {
            URL url = new URL(link);
            URLConnection conn = url.openConnection();
            size = conn.getHeaderField("Content-Length");
            if (size == null) {
                size = "0";
            }
        } catch (Exception e) {
            new Error();
            LOGGER.error("Make sure that you have an internet connection!");
        }

        return size;  // returns the size of the file in bytes
    }
}

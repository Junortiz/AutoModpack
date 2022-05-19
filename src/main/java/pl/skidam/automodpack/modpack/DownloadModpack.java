package pl.skidam.automodpack.modpack;

import pl.skidam.automodpack.AutoModpackClient;
import pl.skidam.automodpack.utils.Download;

import static pl.skidam.automodpack.AutoModpackClient.*;

public class DownloadModpack {

    public DownloadModpack() {
        boolean Error = false;

        Thread.currentThread().setPriority(10);
        AutoModpackClient.LOGGER.info("Downloading Modpack...");

        // Download and check if download is successful *magic*

        // TODO
        boolean Check = true;
        if (Check != Download.Download(link, out)) {
            AutoModpackClient.LOGGER.info("Failed downloaded modpack!" + Check);
        }
        AutoModpackClient.LOGGER.info("Successfully downloaded modpack!" + Check);


        new UnZip(out, Error, "true");
    }
}

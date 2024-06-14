package concurrencyextras;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class FileWatcherExample {
    public static void main(String[] args) throws IOException {
        WatchService watchService = FileSystems.getDefault().newWatchService();
        Path directory = Paths.get(".");
        WatchKey watchKey = directory.register(watchService,
                StandardWatchEventKinds.ENTRY_CREATE,
                StandardWatchEventKinds.ENTRY_MODIFY,
                StandardWatchEventKinds.ENTRY_DELETE);

        boolean keepGoing = true;
        while (keepGoing) {
            try {
                watchKey = watchService.take();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            List<WatchEvent<?>> events = watchKey.pollEvents();

            for (WatchEvent<?> event : events) {
                Path context = (Path) event.context();
                System.out.printf("Event type: %s - Context %s%n",
                        event.kind(), context);
            }

            watchKey.reset();
        }
    }
}

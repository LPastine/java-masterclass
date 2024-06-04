package inputoutput.managingfiles;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class Main {
    public static void main(String[] args) {
//        File oldFile = new File("src/inputoutput/managingfiles/students.json");
//        File newFile = new File("src/inputoutput/managingfiles/student-activity.json");
//
//        if (oldFile.exists()) {
//            oldFile.renameTo(newFile);
//            System.out.println("Filed renamed successfully!");
//        } else {
//            System.out.println("File does not exist!");
//        }

//        Path oldPath = Path.of("src/inputoutput/managingfiles/students.json");
//        Path newPath = Path.of("src/inputoutput/managingfiles/files/student-activity.json");
//
//        try {
//            Files.createDirectories(newPath.subpath(0, newPath.getNameCount() - 1));
//            Files.move(oldPath, newPath);
//            System.out.println(oldPath + "moved (renamed to) --> " + newPath);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        Path fileDir = Path.of("src/inputoutput/managingfiles/files");
        Path resourceDir = Path.of("resources/data");
        try {
            recurseDelete(resourceDir);
            recurseCopy(fileDir, resourceDir);
            System.out.println("Directory renamed");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void recurseCopy(Path source, Path target) throws IOException {
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
        if (Files.isDirectory(source)) {
            try (var children = Files.list(source)) {
                children.toList().forEach(
                        p -> {
                            try {
                                Main.recurseCopy(
                                        p, target.resolve(p.getFileName())
                                );
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        }
                );
            }
        }
    }

    public static void recurseDelete(Path target) throws IOException {
        if (Files.isDirectory(target)) {
            try (var children = Files.list(target)) {
                children.toList().forEach(
                        p -> {
                            try {
                                Main.recurseDelete(p);
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        }
                );
            }
        }

        Files.delete(target);
    }
}

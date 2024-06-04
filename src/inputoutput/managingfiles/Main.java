package inputoutput.managingfiles;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

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
            Files.copy(fileDir, resourceDir);
            System.out.println("Directory renamed");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package hashcode.year2019;


import hashcode.year2019.model.Slideshow;
import hashcode.year2019.service.Service;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

class Main {

    public static void main(String[] args) {
        final Service service = new Service();

        LocalDateTime begin = LocalDateTime.now();
        System.out.println(begin);
        try {
            Path inputPath = Paths.get("src", "main", "resources", "in");
            Path outputPath = Paths.get("src", "main", "resources", "out");

            Files.newDirectoryStream(inputPath,
                    path -> path.toString().endsWith(".txt"))
                    .forEach(path -> {
                        service.readInputFile(path);
                        Slideshow slideshow = service.prepareSlideshowC();
                        service.writeOutputFile(outputPath.resolve(path.getFileName()), slideshow);
                        System.out.println();
                    });

        } catch (Exception e) {
            e.printStackTrace();
        }
        LocalDateTime end = LocalDateTime.now();

        System.out.println(end);
        long between = ChronoUnit.MINUTES.between(begin, end);

        System.out.println("between:" + between);


    }
}

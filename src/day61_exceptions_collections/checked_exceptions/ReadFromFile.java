package day61_exceptions_collections.checked_exceptions;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadFromFile {
    public static void main(String[] args)  {
        String filePath = "src/day61_exceptions_collections/checked_exceptions/data.txt";
       try {
        List<String>
        data = Files.readAllLines(Paths.get(filePath));

        System.out.println("first line = "+data.get(0));
        for (String line: data) {
            System.out.println(line);
        }
        }catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("---THE END---");
    }

}

package Homework7;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.*;

public class PracticeWithCSV {

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\ASUS\\IdeaProjects\\HillellJavaAuto\\src\\main\\java\\Homework7\\data.csv");
        Map<Integer, String> users = detDataFromFile(Objects.requireNonNull(file));
        System.out.println(users);
        System.out.println("Name by requested ID: " + getDataById(users, 2586));
        System.out.println("Number of Occurrences = " + getNumberOfOccurrences(users, "Ivanov"));
    }

    public static Map<Integer, String> detDataFromFile(File fileToRead) throws IOException {
        Map<Integer, String> result = new HashMap<>();
        for (int i = 0; i < FileUtils.readLines(fileToRead, Charset.defaultCharset()).size(); i++) {
            String[] split = FileUtils.readLines(fileToRead, Charset.defaultCharset()).get(i).split(",");
            Integer index = Integer.parseInt(split[0]);
            result.put(index, split[1]);
        }
        return result;
    }

    public static String getDataById(Map<Integer, String> mapData, Integer id) {
        try {
            return mapData.get(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static int getNumberOfOccurrences(Map<Integer, String> mapData, String lastName) {
        int count = 0;
        for (String user : mapData.values()) {
            String[] split = user.split(" ");
            if (Objects.equals(split[0], lastName)) {
                count++;
            }
        }
        return count;
    }
}

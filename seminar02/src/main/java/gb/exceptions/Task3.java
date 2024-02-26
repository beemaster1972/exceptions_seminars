package gb.exceptions;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        String fileName = "/home/beemaster/gb/Exceptions/Seminars/seminar02/src/main/java/gb/exceptions/data.txt";
        writeToFile(fileName);
    }

    private static void writeToFile(String fileName){

        FileWriter fileWriter=null;
        try {
            Map<String,Integer> map = readFromFile(fileName);
            fileWriter = new FileWriter(fileName);
            for(Map.Entry entry: map.entrySet()){
                fileWriter.write(String.format("%s%n",entry.toString()));
            }
            fileWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

    }

    private static Map<String, Integer> readFromFile(String fileName) {
        Map<String, Integer> result = new HashMap<>();
        File file = new File(fileName);
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                String string = scanner.next();
                putDataToMap(string, result);
            }

        } catch (Exception e) {
            System.err.println(String.format("Ошибка %s при чтении из файла %s", e, fileName));
            return null;
        }
        return result;
    }

    private static void putDataToMap(String string, Map<String, Integer> map) {
//        Pattern pattern = Pattern.compile("\\d+");
        String[] keyAndValue = string.split("=");
        String key = keyAndValue[0];
        String value = keyAndValue[1];
//        Matcher matcher = pattern.matcher(value);
        if (isNumber(value)) {
            map.put(key, Integer.parseInt(value));
        } else if(value.equals("?")){
            map.put(key,key.length());
        } else throw new IllegalArgumentException("Не верное значение");

    }
    private static boolean isNumber(String str){
        try{
            Double.parseDouble(str);
            return true;
        }
        catch (NumberFormatException e){
            return false;
        }
    }
}

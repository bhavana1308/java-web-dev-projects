package org.launchcode.studio;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class CountingCharacters {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter a string: ");
//        String myString = scanner.nextLine();

        String filePath = "control-flow-and-collections/chapter-example/student-example/src/main/utils/file.txt";

        try {
            File file = new File(filePath);
            String myString = FileUtils.readFileToString(file, "UTF-8");


            char[] charactersInString = myString.toCharArray();


            HashMap<Character, Integer> charCountMap = new HashMap<>();

            for (char c : charactersInString) {
                if (charCountMap.containsKey(c)) {
                    charCountMap.put(c, charCountMap.get(c) + 1);
                } else {
                    charCountMap.put(c, 1);
                }
            }
            for (HashMap.Entry entry : charCountMap.entrySet()) {
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Words {
    public static void main(String[] args) {
        String[] words = {
                "apple", "banana", "orange", "apple", "kiwi",
                "banana", "grape", "kiwi", "apple", "melon",
                "grape", "kiwi", "banana", "orange", "melon",
                "apple", "kiwi"
        };

        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        Set<String> uniqueWords = new HashSet<>(wordCount.keySet());


        System.out.println("Уникальные слова:");
        for (String word : uniqueWords) {
            System.out.println(word);
        }


        System.out.println("\nКоличество вхождений каждого слова:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
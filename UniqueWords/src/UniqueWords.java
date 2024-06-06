import java.util.*;

public class UniqueWords {
    public static void main(String[] args) {
        String[] words = {
                "apple", "banana", "apple", "orange", "banana", "grape",
                "lemon", "grape", "apple", "melon", "cherry", "cherry",
                "lemon", "apple", "grape", "orange", "banana", "kiwi"
        };

        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));

        System.out.println("Уникальные слова: " + uniqueWords);

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Количество вхождений каждого слова: " + wordCount);
    }
}

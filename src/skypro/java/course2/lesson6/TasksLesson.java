package skypro.java.course2.lesson6;

import java.util.*;


public class TasksLesson {
    public static void main(String[] args) {

        // Задание 1
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 13, 13, 4, 4, 5, 8, 8, 5, 6, 7));
        nums.removeIf(e -> e % 2 == 0);
        System.out.println(nums);

        // Задание 2
        List<Integer> numbers = new ArrayList<>(List.of(1, 1, 2, 3, 11, 11, 4, 4, 5, 8, 8, 5, 6, 7));
        numbers.removeIf(e -> e % 2 == 1);
        removeRepeats(numbers);
        numbers.sort(Comparator.naturalOrder());
        System.out.println(numbers);

        // Задание 3 и 4
        List<String> words = new ArrayList<>(List.of("hello", "night", "day", "car", "hello", "welcome", "car", "day"));
        countRepeats(words);
        removeRepeats(words);
        System.out.println(words);


    }

    public static <T> void removeRepeats (List<T> list) {
        Set<T> s = new LinkedHashSet<>(list);
        list.clear();
        list.addAll(s);
    }

    public static <T> void countRepeats (List<T> list) {
        int sum = 0;

        for(int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if(list.get(i) == list.get(j)) {
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }

}

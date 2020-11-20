// https://habr.com/ru/post/237043/ Java collection framework

import java.util.*;

public class LessonCollectionsAndMap {
    public static void main(String[] args) {

        // интерфейс Collection;
        Collection<String> arrayList = new ArrayList<>();
        Collection<String> linkedList = new LinkedList<>();
        Collection<String> stack = new Stack<>();
        Collection<String> vector = new Vector<>();

        // интерфейс Map;
        Map<String, String> hashMap = new HashMap<>();
        Map<String, String> hashtable = new Hashtable<>();
    }
}

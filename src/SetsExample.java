import java.util.*;

public class SetsExample {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        Random r = new Random();
//        int n = 10000000;
//        for (int i = 0; i < n; i++) {
//            int cur = r.nextInt();
//            set.add(cur);
//            list.add(cur);
//        }

//        List<Integer> array = new ArrayList<>();
//        Set<Integer> arrayBased = new HashSet<>();
//        arrayBased.addAll(list);
//
//        int k = 1000;
//        List<Integer> requests = new ArrayList<>();
//        for (int i = 0; i < k; i++) {
//            requests.add(r.nextInt());
//        }
//
//        CollectionsExample.time = 0;
//        CollectionsExample.start();
//        boolean result = true;
//        List<Boolean> listResults = new ArrayList<>();
//        for (Integer request : requests) {
//            listResults.add(list.contains(request));
//        }
//        CollectionsExample.finish();
//
//        CollectionsExample.start();
//        List<Boolean> setResults = new ArrayList<>();
//        result = true;
//        for (Integer request : requests) {
//            setResults.add(set.contains(request));
//        }
//        CollectionsExample.finish();


//        System.out.println(listResults.equals(setResults));

        Scanner sc = new Scanner(System.in);
        int a = 0;
        Set<Integer> numbers = new HashSet<>();
        while((a = sc.nextInt()) != 0) {
            System.out.println(a);
            numbers.add(a);
        }


        System.out.println(numbers);
    }
}

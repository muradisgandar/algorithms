//package aziidatastructuredersi.dekabr1;
//
//import java.util.Iterator;
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.stream.IntStream;
//
//public class Task2 {
//
//    public static void main(String[] args) {
//        Queue<Integer> queue = new LinkedList<>();
//        fill(queue);
//        print(queue);
//        int toFind = 21;
//        int position = findPos(queue, toFind);
//
//        System.out.println(position > -1 ? found(toFind, position) : notFound(toFind));
//
//    }
//
//    private static String notFound(int toFind) {
//        return ("There is no such value as " + toFind);
//    }
//
//    private static String found(int toFind, int pos) {
//        return ("The number " + toFind + " is in " + pos + " position");
//    }
//
//    private static int findPos(Queue<Integer> queue, int i) {
//        int index = 0;
//
//        Iterator<Integer> iterator = queue.iterator();
//        while (iterator.hasNext()) {
//            if (iterator.next() == i) {
//                return index;
//            }
//            index++;
//        }
//        return -1;
//    }
//
//
//    private static void print(Queue<Integer> queue) {
//        Iterator<Integer> iterator = queue.iterator();
//        while (iterator.hasNext()) {
//            System.out.printf("%d\t", iterator.next());
//        }
//        System.out.println();
//    }
//
//    private static void fill(Queue<Integer> queue) {
//
//        IntStream.range(0, 100).filter(i -> i % 3 == 0).limit(10).forEach(queue::add);
//    }
//
//}

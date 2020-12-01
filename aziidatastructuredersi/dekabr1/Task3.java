//package aziidatastructuredersi.dekabr1;
//
//import java.util.Iterator;
//import java.util.PriorityQueue;
//import java.util.Queue;
//import java.util.stream.IntStream;
//
//public class Task3 {
//
//    public static void main(String[] args) {
//        Queue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);
//        fill(queue);
//        print(queue);
//    }
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
//        IntStream.iterate(100, i -> i - 10).limit(10).forEach(queue::add);
//    }
//}

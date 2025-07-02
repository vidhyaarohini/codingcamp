import java.util.*;

public class QueueOP {
    public static void main(String[] args) {
        Queue<String> queue1 = new Queue<String>() {
            @Override
            public boolean add(String s) {
                return false;
            }

            @Override
            public boolean offer(String s) {
                return false;
            }

            @Override
            public String remove() {
                return "";
            }

            @Override
            public String poll() {
                return "";
            }

            @Override
            public String element() {
                return "";
            }

            @Override
            public String peek() {
                return "";
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<String> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends String> c) {
                return true;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };
        //Queue1
        Queue<String> stringQueue = new LinkedList<>();
        stringQueue.add("java");
        stringQueue.add("is");
        stringQueue.add("a");
        stringQueue.add("programming language");
        stringQueue.offer("check this");
        //queue2
        Queue<String> stringQueue1 = new LinkedList<>();

        stringQueue1.offer("programming");
        stringQueue1.offer("language");

      //  Stack<String> stringStack = new Stack<>();
        // stack is class and queue is interface so if add new Queue then it will automatically add all the methods.
        // adding to queue
        System.out.println("queue "+stringQueue);

        stringQueue.remove();
        System.out.println("rem 1"+stringQueue);
        stringQueue.poll();
        System.out.println("rem 2"+stringQueue);
        //System.out.println("");
        stringQueue.addAll(stringQueue1);
        queue1.addAll(stringQueue1);
        System.out.println("after addeed elements "+stringQueue);
        System.out.println("after added to queue 1 "+Arrays.toString(queue1.toArray()));

        stringQueue.retainAll(stringQueue1);
        System.out.println("check stringqueue"+stringQueue);
        System.out.println("stringqueue1 "+stringQueue1);

    }
}

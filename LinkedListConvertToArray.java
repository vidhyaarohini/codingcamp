import java.util.ArrayList;
import java.util.List;

class Node{
    int val;
    Node prev, next;
    Node(int v){
        this.val = v;
    }
}
public class LinkedListConvertToArray {
    public List<Integer> addLinkedListToArray(Node node){
        List<Integer> integerList = new ArrayList<>();
        while (node!= null){
            integerList.add(node.val);
            node = node.next;
        }
        return integerList;
    }

    public static void main(String[] args) {
        Node node1 = new Node(4);
        Node node2 = new Node(8);
        Node node3 = new Node(9);
        Node node4 = new Node(10);
        Node node5 = new Node(12);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        LinkedListConvertToArray linkedListConvertToArray = new LinkedListConvertToArray();
        List<Integer> integerList =linkedListConvertToArray.addLinkedListToArray(node1);
        System.out.println("list val : "+integerList);
    }
}

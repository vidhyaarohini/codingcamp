import java.util.Stack;

public class StackOp {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        // methods push(), pop(), peek(), empty(), search()
        //check stack is empty
        System.out.println("stack "+stack.empty());// return true
        //adding item
        stack.push("java");
        stack.push("python");
        stack.push("javascript");
        System.out.println("checking "+stack);
        // removing the item from stack
        stack.pop();
        System.out.println("check stack "+stack);
        // printing the last inserted element.
        System.out.println("check peek :"+ stack.peek());
        System.out.println("stack val "+stack);
        //search an item in the stack
        System.out.println("find java"+ stack.search("java"));// 2
        System.out.println("find python "+stack.search("python"));//1 return
        System.out.println(stack.search("mongoDB"));//-1
        // when we are attempting to store a billion of records to stack using push we will get outofmemory error.

    }
}

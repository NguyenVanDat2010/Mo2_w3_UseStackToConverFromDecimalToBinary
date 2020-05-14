import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Integer num = 155;
        Stack<Integer> myStack = new Stack<>();
        while (num > 0) {
            int temp = num % 2;
            num = num / 2;
            myStack.push(temp);
        }
        Collections.reverse(myStack);
        System.out.println(Arrays.toString(new Stack[]{myStack}));
    }
}

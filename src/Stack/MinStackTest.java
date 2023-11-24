package Stack;

/*
    Tests via LeetCode
    -> only to debug
 */

public class MinStackTest {

    public static void main(String[] args) {

        //case_01();
        case_02();


    }

    private static void case_01() {
        int i;

        MinStack data = new MinStack();

        System.out.println("init");
        printStacks(5, data);

        System.out.println("push 2");
        data.push(2);
        printStacks(5, data);

        System.out.println("push -1");
        data.push(-1);
        printStacks(5, data);

        System.out.println("push 5");
        data.push(5);
        printStacks(5, data);

        System.out.println("push -3");
        data.push(-3);
        printStacks(5, data);

        System.out.println("push 3");
        data.push(3);
        printStacks(5, data);

        System.out.println("top: " + data.top());
        printStacks(5, data);

        System.out.println("pop");
        data.pop();
        printStacks(5, data);

        System.out.println("min.: " + data.getMin());
        printStacks(5, data);

        System.out.println("pop");
        data.pop();
        printStacks(5, data);

        System.out.println("min: " + data.getMin());
        printStacks(5, data);

        System.out.println("pop");
        data.pop();
        printStacks(5, data);

        System.out.println("min: " + data.getMin());
        printStacks(5, data);

        System.out.println("pop");
        data.pop();
        printStacks(5, data);
    }

    private static void case_02() {

        System.out.println("init");
        MinStack data = new MinStack();
        printStacks(4, data);

        System.out.println("push -2");
        data.push(-2);
        printStacks(4, data);

        System.out.println("push 0");
        data.push(0);
        printStacks(4, data);

        System.out.println("push -1");
        data.push(-1);
        printStacks(4, data);

        System.out.println("min: " +data.getMin());
        printStacks(4, data);

        System.out.println("top: "+data.top());
        printStacks(4, data);

        System.out.println("pop");
        data.pop();
        printStacks(4, data);

        System.out.println("min: "+data.getMin());
        printStacks(4, data);

    }

    private static void printStacks(int number, MinStack stack) {

        System.out.print("storage -> ");

        for (int i = 0; i < number; i++) {
            System.out.print(stack.storage[i] + ", ");
        }

        System.out.print("   | storagePtr: " + stack.storagePtr);

        System.out.print("\nminimum -> ");

        for (int i = 0; i < number; i++) {
            System.out.print(stack.minimum[i] + ", ");
        }

        System.out.print("   | minimumPtr: " + stack.minimumPtr);

        System.out.println("\n---------------------------------");

    }

}
package Stack;

/*
    LeetCode Problem 155
    Design a stack that supports push, pop, top, and retrieving
    the minimum element in constant time.
    Implement the MinStack class:
    - MinStack() initializes the stack object.
    - void push(int val) pushes the element val onto the stack.
    - void pop() removes the element on the top of the stack.
    - int top() gets the top element of the stack.
    - int getMin() retrieves the minimum element in the stack.
    You must implement a solution with O(1) time complexity for each function.
 */

public class MinStack {

    int[] storage = new int[100];
    int[] minimum = new int[100];
    int storagePtr = 0;
    int minimumPtr = 0;

    public MinStack() {
    }

    public void push(int val) {
        this.storage[storagePtr] = val;

        if (storagePtr == 0) {
            this.minimum[minimumPtr] = val;
            minimumPtr++;
        } else if (val <= this.minimum[minimumPtr - 1]) {
            this.minimum[minimumPtr] = val;
            minimumPtr++;
        }

        storagePtr++;
    }

    public void pop() {
        storagePtr--;

        if (storage[storagePtr] == minimum[minimumPtr - 1]) {
            minimumPtr--;
            this.minimum[minimumPtr] = 0;
        }

        this.storage[storagePtr] = 0;

    }

    public int top() {
        return this.storage[storagePtr - 1];
    }

    public int getMin() {
        return this.minimum[minimumPtr - 1];
    }
}
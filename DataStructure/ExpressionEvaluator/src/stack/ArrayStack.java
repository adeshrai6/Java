package stack;

/**
 * File: ArrayStack.java
 * This implements the IStack interface using an array to
 * represent the body of the stack. The user decides the
 * maximum size of the stack at the time of instantiation.
 *
 * @author trao
 *
 * @param <T>
 */
public class ArrayStack<T> implements IStack<T> {
    private T stackBody[];
    private int top;
    //--------------------------------------------------------
    /**
     * Constructor
     * Size is passed by user as a parameter
     */
    public ArrayStack(int size) {
        // Java does not permit creation of generic arrays!!
        // So, we cant do this.
        // stackBody = new T [size];
        // Instead we create an object array and cast it to T.
        // You get a warning. Ignore it.
        stackBody = (T[])new Object [size];
        top = -1;
    }
    //--------------------------------------------------------
    /**
     * Test for emptiness: variable top represents the location
     * of the top-most element of the stack. top = -1 implies
     * empty stack
     */
    public boolean isEmpty() {
        return (top == -1);
    }

    //--------------------------------------------------------
    /**
     * Insert a new item into stack.
     * First make sure that there is room. Increment top and
     * store new item at the new top location
     * If there is no room, report error. Nothing is pushed.
     */
    public void push(T item) {
        if (top < stackBody.length-1)
        {
            top++;
            stackBody[top] = item;
        }
        else
        {
            System.out.println("Error in ArrayStack.push() Stack Full ");
        }
    }
    //--------------------------------------------------------
    /**
     * Remove the top element of the stack. Report error if
     * stack is empty,
     */
    public T pop() {
        if (isEmpty()) {
            System.out.println("Error in ArrayStack.pop() Stack Empty ");
            return null;
        }
        else
        {
            T topElement = stackBody[top];
            top--;
            return topElement;
        }
    }
    //--------------------------------------------------------
    /**
     * Fetch the top-most element of the stack without
     * removing it. Report error if stack is empty and
     * return null.
     */
    public T top() {
        if (isEmpty())
        {
            System.out.println("Error in ArrayStack.top() Stack Empty ");
            return null;
        }
        else
        {
            T topElement = stackBody[top];
            return topElement;
        }
    }

}

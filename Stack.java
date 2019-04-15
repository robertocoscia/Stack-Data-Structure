//This is just a small exercise where I have practiced the creation of Stack in Data Structure
public class Stack {
    private int[] stack;
    private int top;
    private int size;

    //constructors without parameter
    public Stack() {
        top = -1;
        size = 50;
        stack = new int[50];
    }
    // constructor with parameter
    public Stack(int size){
        top = -1;
        this.size = size;
        stack = new int[this.size];
    }

    // method isFull
    public boolean isFull() {
        return (top == stack.length - 1);
    }
    
    public boolean push(int item) {
        if (!isFull()) {
            top++;
            stack[top] = item;
            return true;
        } else {
            return false;
        }
    }
    public int pop(){
        return stack[top--];
    }
    public boolean isEmpty(){
        return (top==-1);
    }



}

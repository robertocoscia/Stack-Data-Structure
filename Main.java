public class Main {
    public static void main(String[] args){
        Stack list = new Stack();
       
        if (!list.isFull()) {
            list.push(2);
            list.push(3);
        }
        System.out.println(list.pop());
        System.out.println(list.pop());
    }
}

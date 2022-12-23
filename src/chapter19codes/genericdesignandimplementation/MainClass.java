package chapter19codes.genericdesignandimplementation;

public class MainClass {
    public static void main(String [] args){
        GenericStack<String> stack1 = new GenericStack<>();
        GenericStack<Object> stack2 = new GenericStack<>();
        stack2.push("Java");
        stack2.push(2);
        stack1.push("Sun");

        add(stack1,stack2);
    }

    public static  <T> void  add (GenericStack<? extends T> stack1, GenericStack<T> stack2){
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
    }
}

import java.util.Stack;
class stack{
    public static void main(String args[])
    {
        Stack<String> animals = new Stack<>();

        //   stack.push() :- To add element in stack
        animals.push("Lion");
        animals.push("Rabbit");
        animals.push("Tiger");
        animals.push("Dog");
        animals.push("Cat");

        System.out.println(animals);

        System.out.println(animals.peek());   // get the topmost element in stack (last push element)

        animals.pop();                   //remove the topmost element from task 
        System.out.println(animals);
        System.out.println(animals.peek());


    }
}
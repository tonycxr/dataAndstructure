package Stack;

public class ArrayStackTest {
    public static void main(String[] args) {
        StackByArray stackByArray = new StackByArray(5);
        stackByArray.push(3);
        stackByArray.push(4);
        stackByArray.push(5);
        stackByArray.push(6);
        stackByArray.push(7);
        System.out.println(stackByArray.getPop());
        stackByArray.push(8);
        stackByArray.list();
        System.out.println(stackByArray.isFull());
    }
}

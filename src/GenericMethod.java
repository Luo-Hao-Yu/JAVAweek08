public class GenericMethod {
    public static <T> void printArray(T[] array){
        for(T element : array){
            System.out.print(element+" ");
        }
        System.out.println();
    }

    public static <T> T printFirstElement(T[] array){
        return array[0];
    }

    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5};
        String[] stringArray = {"apple","banana"};
        printArray(intArray);
        printArray(stringArray);
        System.out.println("数组第一个元素是"+printFirstElement(intArray));
    }
}
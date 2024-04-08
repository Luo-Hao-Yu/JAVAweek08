import java.util.List;
import java.util.ArrayList;
public class wildcard {
//    打印未知元素的列表
    public static void printListContents(List<?> list){
        for(Object item : list){
            System.out.println(item);
        }
    }

//    打印任何包含Number或及其子类的列表
    public static void printNumberList(List<? extends Number> numberList){
        for(Number n : numberList){
            System.out.println(n);
        }
    }

//    接受任何包含Number或及其超类的列表，并向其添加Number 对象
    public static void addIntegersToSuperList(List<? super Number> list,Number...integers){
        for(Number e : integers){
            list.add(e);
        }
    }

    public static void main(String[] args) {
//        添加整形类型数组的列表
        List<Number> numberList = new ArrayList<>();
        addIntegersToSuperList(numberList,1.1,2,3,4);
//       打印列表
        printNumberList(numberList);
        printListContents(numberList);
    }
}

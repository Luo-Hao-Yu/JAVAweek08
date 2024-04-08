import java.util.ArrayList;
import java.util.List;
public class arrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

//        增
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        System.out.println(list);

//        删
        list.remove(0);
        System.out.println(list);

//        改
        list.set(0,"hello");
        System.out.println(list);

//        查
        System.out.println(list.get(0));
        System.out.println(list.contains("Banana"));

//        遍历
        for(String fruit : list ){
            System.out.print(fruit+" ");
        }
        System.out.println();

//        获取列表大小
        System.out.println(list.size());
    }
}

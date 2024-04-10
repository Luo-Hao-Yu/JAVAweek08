import java.util.Random;

public class commonUseClass {
    public static void main(String[] args) {
//        toString()方法
        Object o1 = new Object();
        System.out.println(o1.toString());
        System.out.println();

//        String类中的equals()方法
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1.equals(s2));
        System.out.println();

//        字符串转为整数
        System.out.println("判断字符串能否转为整数");
        String[] str = {"123", "123abc", "abc123", "abcxyz"};
        for(String str1 : str) {
            try {
                int m = Integer.parseInt(str1, 10);
                System.out.println(str1 + " 可以转换为整数 " + m);
            } catch (Exception e) {
                System.out.println(str1 + " 无法转换为整数");
            }
        }
        System.out.println();

//Math类
        System.out.println("Math类");
        System.out.println(Math.sqrt(16));
        System.out.println(Math.cbrt(8));
        System.out.println(Math.pow(3,2));
        System.out.println(Math.max(2.3,4.5));
        System.out.println(Math.min(2.3,4.5));
        System.out.println();

// abs求绝对值
        System.out.println("abs求绝对值");
        System.out.println(Math.abs(-10.4));
        System.out.println(Math.abs(10.1));
        System.out.println();

//ceil天花板的意思，向上取整
        System.out.println("向上取整");
        System.out.println(Math.ceil(-10.1));
        System.out.println(Math.ceil(10.7));
        System.out.println(Math.ceil(-0.7));
        System.out.println(Math.ceil(0.0));
        System.out.println(Math.ceil(-0.0));
        System.out.println(Math.ceil(-1.7));
        System.out.println();

//        floor地板的意思，向下取整
        System.out.println("向下取整");
        System.out.println(Math.floor(-10.1));
        System.out.println(Math.floor(10.7));
        System.out.println(Math.floor(-0.7));
        System.out.println(Math.floor(0.0));
        System.out.println(Math.floor(-0.0));
        System.out.println();

// random 取得一个大于或者等于0.0小于不等于1.0的随机数 [0,1)
        System.out.println("取得一个大于或者等于0.0小于不等于1.0的随机数 [0,1)");
        System.out.println(Math.random());
        System.out.println(Math.random()+1);
        System.out.println();

// rint 四舍五入，返回double值 注意 .5的时候会取偶数
        System.out.println("四舍五入");
        System.out.println(Math.rint(10.1));
        System.out.println(Math.rint(10.7));
        System.out.println(Math.rint(11.5));
        System.out.println(Math.rint(10.5));
        System.out.println(Math.rint(10.51));
        System.out.println(Math.rint(-10.5));
        System.out.println();

        //    随机数
        Random rand = new Random();

//        产生的随机数为0-10的整数,
        System.out.println("整型");
        int r1 = rand.nextInt(10);
        System.out.println(r1);
        System.out.println();

//        产生类型为bool型的随机数
        System.out.println("bool型");
        boolean r2 = rand.nextBoolean();
        System.out.println(r2);
        System.out.println();

//        产生正态分布的双精度浮点型的随机数
        System.out.println("正态分布");
        double r3 = rand.nextGaussian();
        System.out.println(r3);
        System.out.println();

//        对于种子相同的Random对象，生成的随机数序列是一样的
        Random rand1 = new Random(10);
        Random rand2 = new Random(10);
        System.out.println("使用种子为10的Random对象生成[0,10)内随机整数序列: ");
        for(int i =0;i<5;i++){
            System.out.print(rand1.nextInt(10)+" ");
        }
        System.out.println();
        System.out.println("使用另一个种子为10的Random对象生成[0,10)内随机整数序列: ");
        for(int i =0;i<5;i++){
            System.out.print(rand2.nextInt(10)+" ");
        }
    }
}

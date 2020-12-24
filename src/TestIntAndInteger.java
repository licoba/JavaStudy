// 比较int 和integer是否相等

public class TestIntAndInteger {

    // 基于JDK 1.8
    public static void main(String[] args) {
        int i = 0;
        Integer integer = 0;
        System.out.println("相同值的 int 和 Integer 比较==：" + (i == integer));
        // int 和 Integer比较，integer会自动拆箱

        Integer integer1 = 100;// 等同于 Integer integer1 = Integer.valueOf(100);
        Integer integer2 = 100;// 等同于 Integer integer1 = Integer.valueOf(100);
        System.out.println("相同值(-128到127内)的Integer比较==：" + (integer1 == integer2));// true

        Integer integer3 = 200;// 等同于 Integer integer1 = Integer.valueOf(200);
        Integer integer4 = 200;// 等同于 Integer integer1 = Integer.valueOf(200);
        System.out.println("相同值(不在-128~127范围内)的Integer比较==：" + (integer3 == integer4));// true
        System.out.println("相同值的Integer比较equals：" + (integer3.equals(integer4)));// true

        //上面两个比较需要注意：== 比较的是地址，也就是，比较==左右两边，是否为同一个对象，而在 -128~127范围内，
        // Integer的valueOf函数会将对象进行缓存，所以对象就是是同一个对象
        // integer3 == integer4  <==> Integer.valueOf(200) == Integer.valueOf(200) 两句是等价的

        System.out.println("相同值的Integer.valueOf比较100==：" + (Integer.valueOf(100) == Integer.valueOf(100)));// true
        System.out.println("相同值的Integer.valueOf比较200==：" + (Integer.valueOf(200) == Integer.valueOf(200)));// false

    }
}

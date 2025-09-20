public class TestTybe {
    public static void main(String[] args) {
        //基本数据类型
        //1.整数类型
        byte a = 10; //范围负128到127
        short b = 20;//正负三万
        int c = 30;//正负21亿
        long d = 40;//最大，表示的数范围超过int类型就要在数字后面加L

        //2.浮点类型
        float e = 3.14f;  //如果用float类型表示一个小数，后面加f
        double f = 3.14;  //不用加f，而且可以表示精度更高的浮点

        //3.字符型
        char g = 'a';  //单引号引起来的单个字符，字符串是双引号，多个单字符拼接

        //4。布尔类型
        boolean flag = true;  //布尔值只有两个，ture和fal
    }
}

/**
 * @ClassName HelloA
 * @Desc TODO
 * @Auther 28893
 * @Date 2019/9/4  19:52
 * @Veresion 1.0
 */
public class HelloA {
    //构造⽅法
    public HelloA(){
        System.out.println("Hello A!⽗类构造⽅法");
    }
    //⾮静态代码块
    {
        System.out.println("i'm A class.⽗类⾮静态代码块");
    }
    //静态代码块
    static{
        System.out.println("static A ⽗类静态代码块");
    }
}
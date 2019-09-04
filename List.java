/**
 * @ClassName List
 * @Desc TODO
 * @Auther 28893
 * @Date 2019/9/3  20:32
 * @Veresion 1.0
 */
public class List {
    protected int size=0;
    public void insert(int index,int element){
        System.out.println("No Acomplish");
    }
    public void pushFront(int element){
        insert(0,element);
    }
    public void pushBack(int element){
        insert(size,element);
    }
}

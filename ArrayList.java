/**
 * @ClassName ArrayList
 * @Desc TODO
 * @Auther 28893
 * @Date 2019/9/3  20:35
 * @Veresion 1.0
 */
public class ArrayList extends List {
    private int[] array=new int[10];
    @Override
    public void insert(int index, int element) {
        for(int i=size;i<index;i--){
            array[i]=array[i-1];
        }
        array[index]=element;
        size++;
    }

    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.pushFront(1);
        al.pushBack(2);
        al.pushBack(3);

    }
}

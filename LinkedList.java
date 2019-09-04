/**
 * @ClassName LinkedList
 * @Desc TODO
 * @Auther 28893
 * @Date 2019/9/3  20:40
 * @Veresion 1.0
 */
class Node1{
    int val;
    Node1 next=null;
    public Node1(int val){
        this.val=val;
    }
}
public class LinkedList extends List {
    Node1 head=new Node1(-1);
    @Override
    public void insert(int index, int element) {
        Node1 node=new Node1(element);
        if(index==0){
            head=node;
        }
        if(index==size){

        }
        Node1 cur=head;
        for(int i=0;i<index-1;i++){
            cur=cur.next;
        }
       node.next=cur.next;
        cur.next=node;
    }

    public static void main(String[] args) {

    }
}

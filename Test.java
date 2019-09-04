/**
 * @ClassName Test
 * @Desc TODO
 * @Auther 28893
 * @Date 2019/9/3  18:36
 * @Veresion 1.0
 */
class Node{
    int val;
    Node next=null;
    public Node(int val){
        this.val=val;

    }
}

public class Test {
   public static  Node reverse(Node head){
        Node result=null;
        Node cur=head;
        while(cur!=null){
            Node next=cur.next;
            cur.next=result;
            result=cur;
            cur=next;
        }
        return result;
    }
    public static Node merge1(Node head1,Node head2){
        Node cur1=head1;
        Node cur2=head2;
        Node s=new Node(-1);
        Node result=s;
        if(cur1==null){
            return head2;
        }
        if(cur2==null){
            return head1;
        }
        while(cur1!=null&&cur2!=null){
            if(cur1.val<=cur2.val){
                result.next=cur1;
                cur1=cur1.next;

            }
            else{
                result.next=cur2;
                cur2=cur2.next;
            }
        }
        if(cur1!=null){
            result.next=cur1;
        }
        else{
            result.next=cur2;
        }
        return s.next;
    }

}

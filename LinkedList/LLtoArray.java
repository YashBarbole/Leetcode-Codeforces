package LinkedList;

public class LLtoArray {

   static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node ArrtoLL(int arr[]){
        int n=arr.length;
        if(arr.length==0) return null;

        Node head=new Node(arr[0]);
        Node curr=head;

        for(int i=1;i<n;i++){
            curr.next=new Node(arr[i]);
            curr=curr.next;

        }
        return head;
    }
    public static void main(String[] args) {
        int arr[]={2,3,4};
        Node head=ArrtoLL(arr);

        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("NULL");

    }
}

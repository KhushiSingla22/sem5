package sem5;
import java.util.*;
public class Rotation 
{
   static class node
   {
    int data;
    node next;
    
   }
   static node head;
    public static node insert(node head,int data)
    {
        
       node temp=new node();
       temp.data=data;
       if(head==null)
       {
           head=temp;
       }
       else
       {
           node ptr=head;
           while(ptr.next!=null)
           {
               ptr=ptr.next;
           }
           ptr.next=temp;
       }
       return head;
   }
    public static void display(node head)
   {
       node p=head;
       while(p!=null)
       {
           System.out.print(p.data+"->");
           p=p.next;
       }
       System.out.println("Null");
       System.out.println("");
   }
    public static node rotate(node head,int m)
    {
        node ptr=head;
        node prev=head;
        
        while(m!=0)
        {
            prev=ptr;
            ptr=ptr.next;
            m--;
        }
        
        node t=head;
        while(t.next!=null)

        {
            t=t.next;
        }
        prev.next=null;
        t.next=head;
        head=ptr;
        
        return head;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of linked list: ");
        int n=sc.nextInt();
        System.out.println("Enter the elements of list: ");
        for(int i=0;i<n;i++)
        {
            head=insert(head,sc.nextInt());
        }
        System.out.println("Enter K");
        int o=sc.nextInt();
        System.out.println("Rotated linked list: ");
        if(o<=n)
        {
            head=rotate(head,o);
            display(head);
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}
public class ReverseLL {
    
    Node head;
    private int size;
    ReverseLL(){
        this.size =0;
    }
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    // add - first and last
    public void addFirst(String data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    // add-last 
    public void addLast(String data){
         Node newNode = new Node(data);
           if(head == null){
             head = newNode;
          return;
      }
      Node currNode = head;
      while(currNode.next != null){
        currNode = currNode.next;

      }
      currNode.next=newNode;
    }
    // print
    public void printList(){
           Node currNode = head;
   while(currNode != null){
    System.out.print(currNode.data + "->");
     currNode = currNode.next;
   }
   System.out.println("NULL");

    }
    // delete first
    public void deleteFirst(){
        if(head == null){
            System.out.println(" This list is empty");
            return;
        }
        head= head.next;
        size--;
    }
    // delete last
    public void deleteLast(){
          if(head == null){
      System.out.println(" This list is empty");
      return;
  }
  size--;
  if(head.next == null){
    head = null;
    return;
  }
  Node secondLast = head;
  Node lastNode = head.next;
  while(lastNode.next != null){
    lastNode = lastNode.next;
    secondLast = secondLast.next;
  }
  secondLast.next = null;

    }
    public int getsize(){
        return size;
    }
    // reverse linked list
    public void reverseIterative() {

       if(head == null || head.next == null) {

           return;

       }


       Node prevNode = head;

       Node currNode = head.next;

       while(currNode != null) {

           Node nextNode = currNode.next;

           currNode.next = prevNode;

           prevNode = currNode;

           currNode = nextNode;

       }

       head.next = null;

       head = prevNode;

   }

    public static void main(String args[]){
        LL list = new LL();
        list.addFirst("4");
        list.addFirst("3");
        list.addFirst("2");
        list.addFirst("1");
        list.printList();

        list.reverseItreative();
        list.printlist();

        
    }
    

    
}

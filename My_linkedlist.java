import java.util.Scanner;
public class My_linkedlist {
    Noad head;

    //create function
    void add(int data) {

        Noad toAdd = new Noad(data);
        if (isEmpty()) {
            head = toAdd;
            return;
        }
        Noad temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = toAdd;


    }
    //print function
    void print() {

        Noad temp=head;
        while (temp != null) {
            System.out.println(temp.data+" ");
            temp= temp.next;
        }

    }
    boolean isEmpty(){
        if (head==null){
           return true;
        }else {
         return false;
        }
    }

        //noad class creating
        public class Noad {
            int data;
            Noad next;

            //constractter
            public Noad(int data) {
                this.data = data;
                next = null;
            }
        }







        public static void main(String[] args) {
            Interface Mll = new Interface();
            for (int i=0;i<=10;i++){
                Mll.add(i);
            }
            Mll.print();


        }
    }




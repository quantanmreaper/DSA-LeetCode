package Stack.Basic_Stack_Implementation;

//Stack implementation using an Array 

public class Stack{
    static final  int maxSize =  100;
    public int top; //Declaring the top variable
     public String b[] = new String[maxSize];
     boolean isEmpty(){//This method ensures that if the stack is empty initially then it remains -1
        return top == -1;
     }

     boolean push(String data){//Push method for adding data to a stack 
        if(top>=(maxSize-1)){// Checking whether the stack is full or not if its full then display error message otherwise add the data to the stack
            System.out.println("Stack Overflow Maximum Amount has been reached");
            return false;
        }
        else{
             //a[++top]=  data;
             b[++top] = data;
             System.out.println(data + " pushed into stack");
            return true;
        }
     }
     
      //int pop()
      String pop(){//Pop method for removing data from a stack
        if(top<0){
            System.out.println("Stack Underflow the stack is empty please add in data");
            return "Sorry";
        }

        else{
           // int data = a[top--];
           String data = b[top--];
            return data ;
        }
     }
     
     
     String peek(){//Peek method for viewing the top element of a stack
        if(top<0){
            System.out.println("Stack Underflow the stack is empty please add in data");
           // return 0;
           return "Sorry";
        }
        else{
               //int data = a[top];
               String data = b[top];
               return data;
        }
     }

    void print(){

        //This one Prints data in the form of LIFO last in first out
       /*  for(int i = top; i>-1; i--){
           System.out.print(" " + b[i]);
        }
     } */ 

     //This one Prints data in the order that it was added in the Array
     for(int i = 1; i<=top; i++){
        System.out.print(" " + b[i]);
     }
  } 
}
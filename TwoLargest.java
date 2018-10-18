
public class TwoLargest {

    public static void main(String[] args){

        double num=0, secondLargest=0, largest=0, termValue=0, temp=0, count=0;

        boolean ifDone= true;

        
        termValue= IO.readDouble();

        

        num=IO.readDouble();

        if(num==termValue){

                      while(num==termValue){

                                    IO.reportBadInput();

                                    num= IO.readDouble();            

                      }

        }

        count++;

        secondLargest= num;

        largest= num;

        temp= largest;



        while(ifDone){

                     

                      num= IO.readDouble();

                      count++;

        if(num == termValue){

                      ifDone=false;

        }else{

                      if(largest<= num){

                                    temp= largest;

                                    largest=num;

                                    secondLargest= temp;

                      }else {

                                    if(count==2) {

                                                 if(secondLargest==largest) {

                                                               secondLargest=num;

                                                 }

                                    }

                                   

                      }

       

        }





}

        IO.outputDoubleAnswer(largest);

        IO.outputDoubleAnswer(secondLargest);

}

}


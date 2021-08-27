public class Fibonacci {
    public int n1;
    public int n2;
    public int count;
    public int i;
    public int n3;


    public int soma(){
            for (i=2;i<count;i++){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
return  n3;
    }





}

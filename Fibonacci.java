public class Fibonacci {
    public int n1;
    public int n2;
    public int count;
    public int i;
    public int n3;


    public int soma() {
        for (i = 1; i < count; i++) {
            if(n1 == 0){
                n1 = n1 + 1;
            }

            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;

        }
        return n3;
    }
}

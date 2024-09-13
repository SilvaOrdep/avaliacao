package questao01;

public class Fibonacci {
    private int a,b,c;

    public Fibonacci() {
        this.a=0;
        this.b=1;
        this.c=this.a+this.b;
    }

    public int proximoTermo() {
        int atual=this.a;
        this.a=this.b;
        this.b=this.c;
        this.c=this.a+this.b;
        return atual;
    }
}

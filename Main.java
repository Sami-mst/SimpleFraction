public class Main {
    public static void main(String[] args){
        Fraction f1=new Fraction(8,2);
        
    }
}
class Fraction {
    public int numérateur;
    public int denominateur;
    public Fraction(int numérateur,int denominateur){
        this.numérateur=numérateur;
        this.denominateur=denominateur;
    }
    public Fraction(int numérateur){
        this.numérateur=numérateur;
        this.denominateur=1;
    }
    public Fraction(){
        this.numérateur=0;
        this.denominateur=1;
    }
    public String toString(){
        return "Je suis une fraction.";
    }
}
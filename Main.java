
public class Main {
    public static void main(String[] args){
        Fraction f1=new Fraction(0,2);
        final Fraction ZERO=new Fraction(0,1);
        final Fraction UN=new Fraction(1,1);
        System.out.println(UN.compareTo(f1));
        Number aNumber = java.math.BigDecimal.ONE;
        Number anotherNumber = new Fraction(1, 2);
        assert java.lang.Math.abs(aNumber.doubleValue() + anotherNumber.doubleValue() - 1.5) < 1E-8;
    }

}
class Fraction extends Number implements Comparable<Fraction>{
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
    public int getNumerateur(){
        return numérateur;
    }
    public int getDenominateur(){
        return denominateur;
    }
    public double getDoubleNumerateur(){
        Integer num = Integer.valueOf(numérateur);
        return num.doubleValue();
    }
    public double getDoubleDenominateur(){
        Integer den = Integer.valueOf(denominateur);
        return den.doubleValue();
    }
    public float add(Fraction F2){
        return (this.numérateur/this.denominateur)+(F2.getNumerateur()/F2.getDenominateur());
    }
    public boolean egale(Fraction F2){
        return (numérateur/denominateur)==(F2.getNumerateur()/F2.getDenominateur());
    }
    @Override
    public int compareTo(Fraction f2) {
        return Integer.compare(this.numérateur * f2.getDenominateur(), f2.getNumerateur() * this.denominateur); 
    }
    @Override
    public int intValue() {
        return numérateur / denominateur;
    }

    @Override
    public long longValue() {
        return (long) numérateur / denominateur;
    }

    @Override
    public float floatValue() {
        return (float) numérateur / denominateur;
    }

    @Override
    public double doubleValue() {
        return (double) numérateur / denominateur;
    }
}
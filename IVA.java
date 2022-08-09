public class IVA {

    double total;
    
    public IVA(double total) {
        this.total = total*1.21;
    }
    public IVA(double total, double prctg) {
        double iva = prctg/100;
        this.total = total * (1 + iva);
    }

    public static void main(String[] args) {
        IVA case1 = new IVA(100);
        IVA case2 = new IVA(100, 22);
        IVA case3 = new IVA(100, 24);

        System.out.println(case1.total);
        System.out.println(case2.total);
        System.out.println(case3.total);
    }

}
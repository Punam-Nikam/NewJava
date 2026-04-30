// Define a class calculation to implement method overloading for addition of two integers and two double 
// variables. 
class Addition{
    int add(int a,int b){
        return a+b;
    }
    double add(double a,double b){
        return a+b;
    }

    public static void main(String[] a){
        Addition ad=new Addition();
        int c=ad.add(2,3);
        double d=ad.add(4,2);
        System.out.println(c);
        System.out.println(d);

    }
}
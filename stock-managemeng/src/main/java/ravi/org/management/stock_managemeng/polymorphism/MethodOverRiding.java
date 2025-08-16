package ravi.org.management.stock_managemeng.polymorphism;

public class MethodOverRiding extends MethodOverLoading {

    @Override
    public String m1()
    {
        super.m1();
        System.out.println(super.m1());
        return "ravi dada";
    }

    public static void main(String[] args) {
        MethodOverRiding obj1 = new MethodOverRiding();
        System.out.println(obj1.m1());
        System.out.println(obj1.m1());
    }
}

//public class StudentMarksDetails {
//    public String result() {
//        String student1 = "Aman";
//        String student2 = "Ravi";
//        String student3 = "Durgesh";
//        student1 = student1 + " " + this.subject("manth", 40);
//        student2 = student2 + " " + this.subject("manth", 40);
//        student3 = student3 + " " + this.subject("manth", 40);
//        String resultAll = student1 + "/n" + student2 + "/n" + student3;
//        return res


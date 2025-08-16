package ravi.org.management.stock_managemeng.corejava;

public class BasicConcepts {
    public String stringreturn(String s, int i)
    {
        String name = "first program";
        //type casting
        int number = 101;
        String sumOBothParameters=s.concat(String.valueOf(i));

        int firttvariable=1000;
        float secondVariable=20.5f;
        String bothVariableSum=String.valueOf(firttvariable).concat(String.valueOf(secondVariable));
        String returnAllValues=sumOBothParameters.concat(bothVariableSum);
        //return sumOBothParameters;
        return returnAllValues;
    }
    public static String third(int num, int value, int marks ){
        int addall = num+value+marks;
        int multi = num*value*marks;
        int finalthird = num+value-marks;

        String finalValue="firstResult"+String.valueOf(addall)+"secondResult"+String.valueOf(multi)+"thirdResult"+String.valueOf(finalthird);
        return finalValue;
    }

    public static void main(String[] args) {
        System.out.println(third(1,2,3));

    }

    public Object newmagic(){
        int a = 100;
        String b = "ravi arnjan";
        return a+b;
    }
}


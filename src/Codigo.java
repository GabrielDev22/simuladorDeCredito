import java.util.ArrayList;
import java.util.List;
public class Codigo {
    public int variable1;
    public boolean variable2;
    public String variable3;
    private Integer variable4;
    private Boolean variable5;

    public List<Boolean> variableList1 = new ArrayList<>();

    public List<Boolean> getBooleanList(){

        return variableList1;
    }

    public void listOfBooleanByDefault(){
        variableList1.add(false);
        variableList1.add(false);
        variableList1.add(true);
        variableList1.add(false);
    }

    public void addBooleanValueToList(Boolean newBoolean){
        variableList1.add(newBoolean);
    }

    public String method1(){
        variable3 = "hello";
        return variable3;
    }
    public boolean method2(){
        variable2 = true;
        return variable2;
    }
    public int method3(){
        variable1 = 10;
        return variable1;
    }
    private Integer method4(){
        variable4 = 20;
        return variable4;
    }
    private Boolean method5(){
        variable5 = false;
        return variable5;
    }
}

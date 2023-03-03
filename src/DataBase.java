import java.util.ArrayList;
import java.util.List;

public class DataBase {

    public List<String> getBlackList(){
        List<String> blackList = new ArrayList<>();
        blackList.add("ARMAS");
        blackList.add("POLITICO");

        return blackList;
    }

    public List<String> getPermitLowRoles() {
        List<String> permitLowRoles = new ArrayList<>();
        permitLowRoles.add("VENDEDOR");
        permitLowRoles.add("COCINERO");

        return permitLowRoles;
    }

    public List<String> getPermitHighRoles(){
        List<String> permitHighRoles = new ArrayList<>();
        permitHighRoles.add("GENERAL");
        permitHighRoles.add("GERENTE");

        return permitHighRoles;
    }




}

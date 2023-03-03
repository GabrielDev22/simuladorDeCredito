public class Main {
    public static void main(String[] args) {

        DataBase dataInfo = new DataBase();

        Condiciones condiciones = new Condiciones();

        Prospect prospectWithBlackList = new Prospect(40, 645, dataInfo.getBlackList(), 342);

        Prospect prospectWithLowRoles = new Prospect(34, 520, dataInfo.getPermitLowRoles(), 123);

        Prospect prospectWithHighRoles = new Prospect(52, 401, dataInfo.getPermitHighRoles(), 9712);

        prospectWithHighRoles.setPermitLowRoles(dataInfo.getPermitLowRoles());

        prospectWithLowRoles.setBlackList(dataInfo.getBlackList());

        condiciones.solicitarCredito(prospectWithLowRoles);

    }

}
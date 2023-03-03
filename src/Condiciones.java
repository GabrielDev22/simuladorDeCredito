import java.util.List;

public class Condiciones {

    public boolean solicitarCredito(Prospect prospect){

        if(!prospect.isMayor()){
            System.out.println("Rechazado por que no cumple con la mayoria de edad");
            return false;
        }

        if(validateIsBlackList(prospect.getCargos())){
            System.out.println("Rechazado por que el cargo pertenece a la BlackList");
            return false;
        }

        if(prospect.getSalario() < 100){
            System.out.println("Rechazado por que no tiene el minimo permitido para solicitud de credito");
            return false;
        }

        if(validateIsPermitHighRoles(prospect.getCargos()) && prospect.getSalario() >= 500){
            System.out.println("Aceptado por cumplir con las condiciones del credito alto");
            return true;
        }

        System.out.println("Se ha aceptado por cumplir las condiciones del credito bajo");
        return true;
    }

    private boolean validateIsBlackList(List<String> cargos){
        for(String particularCargo: cargos){
            if(particularCargo == "ARMAS" || particularCargo == "POLITICO"){
                return true;
            }
        }
        return false;
    }

    private boolean validateIsPermitHighRoles(List<String> cargos){
        for(String particularCargo: cargos){
            if(particularCargo == "GENERAL" || particularCargo == "GERENTE"){
                return true;
            }
        }
        return false;
    }






}

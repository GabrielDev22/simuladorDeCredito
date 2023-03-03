import java.util.List;

public class Prospect {

    public int edad;
    public int salario;
    public List<String>cargos;
    public int dinero;

    public Prospect() {
    }

    public Prospect(int edad, int salario, List<String> cargos, int dinero) {
        this.edad = edad;
        this.salario = salario;
        this.cargos = cargos;
        this.dinero = dinero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isMayor() {
        return getEdad() >= 21;
    }


    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public List<String>getCargos() {
        return cargos;
    }

    public void setCargos(List<String> cargos) {
        this.cargos = cargos;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public void setBlackList(List<String> blackList){
        cargos.addAll(blackList);
    }

    public void setPermitLowRoles(List<String> permitLowRoles){
        cargos.addAll(permitLowRoles);
    }

    public void setPermitHighRoles(List<String> permitHighRoles){
        cargos.addAll(permitHighRoles);
    }




}

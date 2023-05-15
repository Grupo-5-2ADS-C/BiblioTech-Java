package Cargo;

/**
 *
 * @author vrp19
 */
public class Cargo {
    
    private Integer id_cargo;
    private String cargo;

    public Integer getId_cargo() {
        return id_cargo;
    }

    public void setId_cargo(Integer id_cargo) {
        this.id_cargo = id_cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public void sendToBD(){
    }
    
}

package utp.misiontic2022.c2.p23.reto4.modelo.vo;

public class Requerimiento_2 {
    // Su código
    private Integer ID_Proyecto;
    private String constructora;
    

    public void Requerimiento_2Vo() {
    }
    public Integer getID_Proyecto() {
        return ID_Proyecto;
    }
    public void setID_Proyecto(Integer iD_Proyecto) {
        ID_Proyecto = iD_Proyecto;
    }
    public String getConstructora() {
        return constructora;
    }
    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }
    @Override
    public String toString() {
        return ID_Proyecto + " " + constructora;
    }
}

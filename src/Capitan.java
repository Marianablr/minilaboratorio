public class Capitan extends Soldado implements OperacionesMilitares {
    private int soldados_cantidad;
    private Rango rango;

    public Capitan(String nombre, String id, int soldados_cantidad) {
        super(nombre, id, "Capitan");
        this.soldados_cantidad = soldados_cantidad;
        this.rango = new Rango(3) {
            @Override
            public void realizarAccion() {
                System.out.println(nombre + " está coordinando una misión.");
            }
        };
    }
    @Override
    public void realizarAccion() {
        rango.realizarAccion(); 
    }

    @Override
    public void asignarMision(String mision) {
        System.out.println("Misión asignada al Capitán: " + mision);
    }

    @Override
    public void reportarEstado() {
        System.out.println("Estado del Capitán: Coordinando misiones con " + soldados_cantidad + " soldados.");
    }
}
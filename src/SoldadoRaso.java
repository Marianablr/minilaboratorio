public class SoldadoRaso extends Soldado implements OperacionesMilitares {
    private Rango rango;

    public SoldadoRaso(String nombre, String id) {
        super(nombre, id, "Soldado Raso");
        this.rango = new Rango(1) {
            @Override
            public void realizarAccion() {
                System.out.println(nombre + " sigue las órdenes.");
            }
        };
    }


    @Override
    public void realizarAccion() {
        rango.realizarAccion();
    }

    @Override
    public void asignarMision(String mision) {
        System.out.println("Misión asignada al Soldado Raso: " + mision);
    }

    @Override
    public void reportarEstado() {
        System.out.println("Estado del Soldado Raso: Cumpliendo órdenes.");
    }
}
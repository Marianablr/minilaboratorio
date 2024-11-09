import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("====================================");
            System.out.print("Ingrese el nombre del Soldado Raso:");
            String nombreSoldado = scanner.nextLine();
            System.out.print("\nIngrese el ID del Soldado Raso:");
            String idSoldado = scanner.nextLine();
            SoldadoRaso soldado1 = new SoldadoRaso(nombreSoldado, idSoldado);
            System.out.println("\n====================================");

            
            System.out.print("Ingrese el nombre del Teniente:");
            String nombreTeniente = scanner.nextLine();
            System.out.print("\nIngrese el ID del Teniente:");
            String idTeniente = scanner.nextLine();
            System.out.print("\nIngrese la unidad del Teniente:");
            String unidadTeniente = scanner.nextLine();
            Teniente teniente1 = new Teniente(nombreTeniente, idTeniente, unidadTeniente);
            System.out.println("\n====================================");
            
            System.out.print("\nIngrese el nombre del Capitan:");
            String nombreCapitan = scanner.nextLine();
            System.out.print(" \nIngrese el ID del Capitan:");
            String idCapitan = scanner.nextLine();
            System.out.print("\nIngrese los años de servicio del Capitan:");
            int anosServicioCapitan = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            Capitan capitan1 = new Capitan(nombreCapitan, idCapitan, anosServicioCapitan);
            System.out.println("\n====================================");
            
            System.out.print("Ingrese el nombre del Coronel:");
            String nombreCoronel = scanner.nextLine();
            System.out.print("\nIngrese el ID del Coronel:");
            String idCoronel = scanner.nextLine();
            System.out.print("\nIngrese la operación del Coronel:");
            String operacionCoronel = scanner.nextLine();
            Coronel coronel1 = new Coronel(nombreCoronel, idCoronel, operacionCoronel);
            System.out.println("\n====================================");
            
            // Mostrar información
            soldado1.mostrarInformacion();
            teniente1.mostrarInformacion();
            capitan1.mostrarInformacion();
            coronel1.mostrarInformacion();
            
            // Acciones específicas de cada rango
            soldado1.realizarAccion();
            teniente1.realizarAccion();
            capitan1.realizarAccion();
            coronel1.realizarAccion();
            
            // Asignar misiones y reportar estado
            soldado1.asignarMision("Patrullaje");
            soldado1.reportarEstado();
            
            teniente1.asignarMision("Supervisar entrenamiento");
            teniente1.reportarEstado();
            
            capitan1.asignarMision("Coordinar defensa");
            capitan1.reportarEstado();
            
            coronel1.asignarMision("Plan de ataque");
            coronel1.reportarEstado();
        }
    }
}
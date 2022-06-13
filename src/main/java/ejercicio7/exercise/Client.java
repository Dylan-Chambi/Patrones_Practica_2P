package ejercicio7.exercise;

public class Client {
    public static void main(String []args){
        Prestamo prestamo1 = new Prestamo("Juan", "12345", 1000.0);

        Banco banco = Banco.getInstance();
        System.out.println("\n----------------------------Prestamo 1----------------------------");
        banco.prestarse(prestamo1);
        banco.pagarPrestamo(prestamo1, 150.0);

        Prestamo prestamo2 = new Prestamo("Juan", "12345", 2000.0);
        System.out.println("\n----------------------------Prestamo 2----------------------------");
        banco.prestarse(prestamo2);
        banco.pagarPrestamo(prestamo2, 250.0);

        System.out.println("\n----------------------------Prestamo 1----------------------------");
        banco.pagarPrestamo(prestamo1, 170.0);
        System.out.println("\n----------------------------Prestamo 1----------------------------");
        banco.pagarPrestamo(prestamo1, 210.0);
        System.out.println("\n----------------------------Prestamo 1----------------------------");
        banco.pagarPrestamo(prestamo1, 230.0);
        System.out.println("\n----------------------------Prestamo 1----------------------------");
        banco.pagarPrestamo(prestamo1, 190.0);

        System.out.println("\n----------------------------Prestamo 2----------------------------");
        banco.prestarse(prestamo2);
        banco.pagarPrestamo(prestamo2, 250.0);
    }
}

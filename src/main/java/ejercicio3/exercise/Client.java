package ejercicio3.exercise;

public class Client {
    public static void main (String[]args) {

        TiendaCelulares tiendaCelulares = new TiendaCelulares();

        tiendaCelulares.addCelular(new Celular("Galaxy S10", "Samsung", "Alta", 2500));
        tiendaCelulares.addCelular(new Celular("Galaxy S10", "Samsung", "Alta", 2400));
        tiendaCelulares.addCelular(new Celular("Galaxy S10", "Samsung", "Alta", 2300));
        tiendaCelulares.addCelular(new Celular("Galaxy S10", "Samsung", "Alta", 2550));

        tiendaCelulares.addCelular(new Celular("Iphone X", "Apple", "Alta", 5500));
        tiendaCelulares.addCelular(new Celular("Iphone X", "Apple", "Alta", 5400));
        tiendaCelulares.addCelular(new Celular("Iphone X", "Apple", "Alta", 5480));
        tiendaCelulares.addCelular(new Celular("Iphone X", "Apple", "Alta", 5530));

        tiendaCelulares.addCelular(new Celular("P10 Lite", "Huawei", "Baja", 1000));
        tiendaCelulares.addCelular(new Celular("P10 Lite", "Huawei", "Baja", 900));
        tiendaCelulares.addCelular(new Celular("P10 Lite", "Huawei", "Baja", 1100));
        tiendaCelulares.addCelular(new Celular("P10 Lite", "Huawei", "Baja", 1050));

        tiendaCelulares.addCelular(new Celular("Redmi Note 8", "Xiaomi", "Media", 1000));
        tiendaCelulares.addCelular(new Celular("Redmi Note 8", "Xiaomi", "Media", 900));
        tiendaCelulares.addCelular(new Celular("Redmi Note 8", "Xiaomi", "Media", 1100));
        tiendaCelulares.addCelular(new Celular("Redmi Note 8", "Xiaomi", "Media", 1050));



        tiendaCelulares.setStrategy(new BusquedaPocosDatos());

        System.out.println("------------------- Pocos Datos - Busqueda por modelo -------------------");
        tiendaCelulares.buscarCelularModelo("Galaxy S10");
        System.out.println("------------------- Pocos Datos - Busqueda por precio -------------------");
        tiendaCelulares.buscarCelularPrecio(1100);
        System.out.println("------------------- Pocos Datos - Busqueda por precio y modelo -------------------");
        tiendaCelulares.buscarCelularPrecioyModelo("Galaxy S10", 2300);

        tiendaCelulares.setStrategy(new BusquedaMuchosDatos());

        System.out.println("------------------- Muchos Datos - Busqueda por modelo -------------------");
        tiendaCelulares.buscarCelularModelo("Galaxy S10");
        System.out.println("------------------- Muchos Datos - Busqueda por precio -------------------");
        tiendaCelulares.buscarCelularPrecio(1100);
        System.out.println("------------------- Muchos Datos - Busqueda por precio y modelo -------------------");
        tiendaCelulares.buscarCelularPrecioyModelo("Galaxy S10", 2300);

    }
}

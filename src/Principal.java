public class Principal {
    public static void main(String[] args) {
/*
        Operaciones op=new Operaciones();
        Lista lis=new Lista();

        op.insertarN(lis);
        op.mostrar(lis);




        System.out.print("Marca buscada:");
        String mda=Leer.dato();
        op.placaMarca(lis,mda);*/

        Operaciones op=new Operaciones();
        Lista lis=new Lista();

        op.insertarN(lis);

        System.out.println("----------------------------------------------------------------------------------------");

        op.mostrar(lis);

        System.out.println("----------------------------------------------------------------------------------------");

        Vehiculo datoFinal = new Vehiculo();
        datoFinal.leer();
        op.insertarFin(lis, datoFinal);

        System.out.println("----------------------------------------------------------------------------------------");

        op.mostrar(lis);

        System.out.println("----------------------------------------------------------------------------------------");

        String placaDadaa;
        System.out.println("Dame la placa que deseas eliminar de esta lista");
        placaDadaa = Leer.dato();
        op.eliminarPorPlacaDada(lis, placaDadaa);

        System.out.println("----------------------------------------------------------------------------------------");

        op.mostrar(lis);

        System.out.println("----------------------------------------------------------------------------------------");




    }
}

public class Operaciones {
    // Insertar N nodos
    public void insertarN(Lista L)
    { System.out.println("No. nodos= ");
        int nn=Leer.datoInt();
        for(int i=1;i<=nn;i++) {
            System.out.print("Dato= ");
            Vehiculo d= new Vehiculo();
            d.leer();
            L.insertar(d);
        }
    }
    public void insertarFin(Lista L, Vehiculo x)
    {  // Conectar el nuevo nodo a la lista
        if(L.listaVacia()) { // Caso1: lista vacía
            L.insertar(x);
        }
        else {// Caso2: lista no vacía
            Nodo p=L.primero;
            while(p.sig!=null) { p=p.sig;
            }
            L.insertar2(x, p);
        }
    }

    // MOSTRAR
    public void mostrar(Lista L) {
        Nodo p=L.primero;
        while(p!=null) {
            System.out.println("Dato:  ");
            p.dato.mostrar();
            p=p.sig;
        }
    }
    // Placa de los vehículos de una marca dada
    public void placaMarca(Lista L, String md)
    {Nodo p=L.primero;
        while(p!=null) {
            if(md.compareTo(p.dato.marca)==0)
                System.out.println("placa="+p.dato.placa);
            p=p.sig;
        }
    }

    public void eliminarPorPlacaDada(Lista L, String placaDada)
    {
        if(placaDada.equals(L.primero.dato.placa)) {
            // Caso1: primer nodo
            L.eliminar();
        }
        else {
            // Caso2: nodo distinto del primero
            Nodo p=L.primero;
            while(p.sig!=null && p.sig.dato.placa != placaDada) {
                p=p.sig;
            }
            if(p.sig!=null) {
                L.eliminar2(p);
            }
        }
    }

}



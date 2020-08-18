public class Nodo
{ // Campos
    Vehiculo dato;
    Nodo sig;
    // Constructor por defecto
    public Nodo()
    {  dato=null;
        sig=null;
    }
    // Constructor ordinario
    public Nodo (Vehiculo vd)
    {  dato= vd;
        sig=null;
    }
}

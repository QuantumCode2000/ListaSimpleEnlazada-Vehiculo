public class Lista
{ // Campos
    Nodo primero;
    // Constructor por defecto
    public Lista()
    {  primero=null; }
    // Inicializar
    public void inicializar ()
    {  primero=null; }
    //Verificar si lista es vacía
    public boolean listaVacia()
    {  return primero==null; }
    // Insertar al principio de la lista
    public void insertar(Vehiculo x)
    { // Crear el nuevo nodo
        Nodo nuevo=new Nodo(x);
// Conectar el nuevo nodo a la lista
        nuevo.sig=primero;
        primero=nuevo;
    }
    // Eliminar el primer nodo
    public void eliminar() {
        if(!listaVacia()) { // Lista no vacía
            primero=primero.sig;
        }
    }
    public void insertar2(Vehiculo datoVehiculo, Nodo pos)
    { // Crear el nuevo nodo
        Nodo nuevo=new Nodo(datoVehiculo);
        // Conectar el nuevo nodo a la lista
        nuevo.sig=pos.sig;
        pos.sig=nuevo;
    }
    public void eliminar2(Nodo pos)
    {
        // Desconectar el nodo a la lista
        pos.sig=pos.sig.sig;
    }
}

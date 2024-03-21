public class Pila {
    private Nodo cabeza; 

    // Constructor
    public Pila() {
        this.cabeza = null;
    }

    // Método para verificar si la pila está vacía
    public boolean isEmpty() {
        return cabeza == null;
    }

    // Método para agregar un elemento a la pila (push)
    public void push(Object dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (isEmpty()) {
            cabeza = nuevoNodo;
        } else {
            nuevoNodo.setSiguiente(cabeza);
            cabeza = nuevoNodo;
        }
        //System.out.println("Se agregó " + dato + " a la pila.");
    }

    // Método para eliminar y devolver el elemento superior de la pila (pop)
    public Object pop() {
        if (isEmpty()) {
            System.out.println("La pila está vacía.");
            return null;
        }
        Object elementoEliminado = cabeza.getDato();
        cabeza = cabeza.getSiguiente();
        //System.out.println("Se eliminó " + elementoEliminado + " de la pila.");
        return elementoEliminado;
    }

    // Método para obtener el elemento superior de la pila sin eliminarlo (peek)
    public Object peek() {
        if (isEmpty()) {
            System.out.println("La pila está vacía.");
            return ""; 
        }
        return cabeza.getDato();
    }

    
}

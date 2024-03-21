public class Lista{
    private Object dato;
    private Lista siguiente;

    /** Construye una lista con un dato , seguida de otra lista . */
    public Lista (Object dato, Lista siguiente){
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public Object getDato(){
        return dato;
    }

    /** Versión funcional de un método que trabaja con la lista. */
    public static void imprimeLista(Lista l){
        if(l == null ) return; // Caso base, escrito explícitamente .
        else {
            System.out.println(l.dato);
            imprimeLista (l.siguiente);
        }
    }

    
   public static void imprimeListaInversa1(Lista l) {
        Pila pila = new Pila();
        if (l == null) {
            return;
        } else {
            while (l != null) {
                pila.push(l.dato);
                l = l.siguiente;
            }
            while (!pila.isEmpty()) {
                System.out.println(pila.pop());
            }
        }
    }
    

    public static void imprimeListaInversa2(Lista l) {
        if (l == null) {
            return;
        }
        imprimeListaInversa2(l.siguiente);
        System.out.println(l.dato);
    }
    
}
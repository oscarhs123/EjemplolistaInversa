public class UsoLista {
    public static void main ( String [] args ) {
        Lista vacia = null;
        Lista unAnimal = new Lista ("Perro", null);
        Lista dosAnimales = new Lista ("Gato", new Lista ("Perro", null));
        Lista frutas = new Lista ("Bananas",
                                  new Lista ("Manzanas",
                                             new Lista ("Toronjas",
                                                        new Lista ("Uvas", new Lista ("Peras", null)))));
        Lista.imprimeLista(frutas);
        System.out.println("");
        Lista.imprimeListaInversa1(frutas);
        System.out.println("");
        Lista.imprimeListaInversa2(frutas);
    }
}

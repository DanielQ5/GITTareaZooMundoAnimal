public class Animal {

    public String nombreAnimal;
    public String tipoAnimal;
    public int vecesPorAlimentar;
    public int vecesAlimentado;

    public Animal(String nombreAnimal, String tipoAnimal, int vecesPorAlimentar, int vecesAlimentado) {
        this.nombreAnimal = nombreAnimal;
        this.tipoAnimal = tipoAnimal;
        this.vecesPorAlimentar = vecesPorAlimentar;
        this.vecesAlimentado = 0;
    }

    public void alimentar(){
        if (vecesAlimentado < vecesPorAlimentar) {
            vecesAlimentado++;
            int vecesFaltantesPorAlimentar = vecesPorAlimentar - vecesPorAlimentar;

            if (vecesPorAlimentar - vecesAlimentado > 1) {
                System.out.println("El animal " + nombreAnimal + " debe ser alimentado " + (vecesPorAlimentar-vecesAlimentado) + " veces mas");
            } else if(vecesPorAlimentar - vecesAlimentado == 1) {
                System.out.println("El animal " + nombreAnimal + " debe ser alimentado " +
                (vecesPorAlimentar - vecesAlimentado) + " veces mas");
            } else {
                System.out.println("El animal " + nombreAnimal + " ya ha sido alimentado la cantidad de veces correcta.");
                
            }

        }
    }

}

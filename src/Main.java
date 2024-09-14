//En el zoológico "Mundo Salvaje", los cuidadores tienen que alimentar
// a los animales varias veces al día. El zoológico cuenta con varios animales,
// y cada uno debe ser alimentado un número específico de veces según su tipo.
//Tu tarea es crear un programa en Java que permita simular
// el proceso de alimentación de un animal usando la estructura while.

public class Main {
    public static void main (String[] args) {

        Animal[] animales= {
                new Animal("Leon" , "Carnivoro" , 3 , 0),
                new Animal("Elefante" , "Herbivoro" , 5 , 0),
                new Animal("Oso" ,"Carnivoro" , 4 , 0),
                new Animal("Avestruz" ,"Herbivoro" , 2 , 0),
        };

        for (Animal animal : animales) {
            if (animal.nombreAnimal.equals("Leon")) {
                while (animal.vecesAlimentado < animal.vecesPorAlimentar) {
                    animal.alimentar();
            }

            }
        }

    }
}

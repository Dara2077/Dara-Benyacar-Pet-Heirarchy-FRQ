import java.util.ArrayList;

public class Kennel {
    private ArrayList<Pet> petList;

    public Kennel(){
        petList = new ArrayList<Pet>();
    }
    public void allSpeak(){
        for (Pet pet : petList){
            System.out.println(pet.getName() + " " + pet.speak());
        }
    }

    public void addPetToList(Pet p){
        petList.add(p);
    }
}

package gestionZoo.entities;

public class Dolphin extends Aquatic{
    private float swimmingSpeed;

    public Dolphin(){
    }

    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed){
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    public void swim(){
        System.out.println("the dolphin is swimming");
    }
}

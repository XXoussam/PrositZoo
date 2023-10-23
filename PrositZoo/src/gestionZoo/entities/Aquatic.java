package gestionZoo.entities;

public abstract non-sealed class Aquatic extends Animal{
    private String habitat;

    public Aquatic(){
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat){
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String toString(){
        return super.toString() + "habitat: " + habitat;
    }

    public abstract void swim();

    public boolean equals(Aquatic a1 , Aquatic a2){
        return a1.getName().equals(a2.getName()) &&
                a1.getAge() == a2.getAge() &&
                a1.getHabitat().equals(a2.getHabitat());
    }

}

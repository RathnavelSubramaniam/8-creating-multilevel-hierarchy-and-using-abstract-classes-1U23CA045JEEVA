 abstract class Animal {
protected String species;
protected int age;

public Animal(String species,int age){
    this.species = species;
    this.age = age;
}
 abstract void sound();
@Override
public String toString(){
    return"Species:"+species+",Age:"+age;
}
@Override
public boolean equals(Object obj){
    if(this == obj)return true;
    if(this == null || getClass()!= obj.getClass())return false;
    Animal otherAnimal = (Animal)obj;
    return species.equals(otherAnimal.species)&&age == otherAnimal.age;
}
}

class Mammal extends Animal {
private String habitat;
public Mammal(String species,int age,String habitat){
    super(species,age);
    this.habitat = habitat;
}
public void sound(){

}
}
class Bird extends Animal {
private String featherColor;
public Bird(String species, int age, String featherColor){
    super(species,age);
    this.featherColor = featherColor;
}
public void sound(){

}
}
class Parrot extends Bird {
private boolean canSpeak;
 Parrot(String species, int age, String featherColor, boolean canSpeak){
    super(species,age,featherColor);
    this.canSpeak = canSpeak;
}
public void sound()
    {if (canSpeak){
        System.out.println("Parrot speaking");
    }else{
        System.out.println("Parrot sound");
    }
    }
}
public class Practical8 {
public static void main(String[] args) {
 Mammal lion = new Mammal("Lion",5,"Grasslands");
 Bird eagle = new Bird("Eagle",3,"Brown");
 Parrot talkingParrot = new Parrot("TalkingParrot",2,"Green",true);
 System.out.println("Are lion and eagle equal?" +lion.equals(eagle));
 System.out.println("Are lion and eagle equal?" +lion.equals(new Mammal("Lion",5,"Grassland")));
}
}

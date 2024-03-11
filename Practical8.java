
abstract class Animal {
 protected String species;
 protected int age;
 abstract void sound();
   Animal(String species,int age){
    this.species=species;
    this.age=age;

   }
   @Override
   public String toString (){
     return "Species: "+species+","+" Age: "+age;
   }
   @Override
   public boolean equals(Object obj){
       if(this==obj)
        return true;
       if(obj==null|| getClass()!=obj.getClass())
       return false;

       Animal otherAnimal =(Animal)obj; 
  return species.equals(otherAnimal.species)&&age==otherAnimal.age;
   }
}
 class Mammal extends Animal {
 private String habiat;
 Mammal(String species,int age,String habiat){
    super(species,age);
    this.habiat=habiat;
 }
 void sound(){
    System.out.println("Animals Sounds");
 }
}
 class Bird extends Animal {
 String feather;
     Bird(String species,int age,String feather)
     {
   super(species,age);
       this.feather=feather;//
     }
     void sound(){
        System.out.println("Birds Sounds");
     }
}
 class Parrot extends Bird {
     private boolean canspeak;
     Parrot (String species,int age,String feather,boolean canspeak){
  super(species,age,feather);
  this.canspeak=canspeak;
     }
     void sound(){
        if(canspeak){
System.out.println("Parrot Speak");
        }
        else{
            System.out.println("Parrot sound");
        }
     }
}
public class Practical8 {
public static void main(String[] args) {
    Mammal v1 = new Mammal("Lion",5,"GrasssLands");
    Bird v2 = new Bird("Eagle",3,"Brown");
    Parrot v3 =new Parrot("Talking Parrot",2,"Red",true);
        System.out.println(v1.toString());
        System.out.println(v2.toString());
        System.out.println(v3.toString());
    System.out.println("Are lion and eagle equal? "+v1.equals(v2));
    System.out.println("Are lion and lion equal? "+v1.equals(v1));



}
}

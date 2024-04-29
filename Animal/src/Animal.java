public class Animal {
    
    public Animal() {
    }
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	String name = "Arcs";
    	float weight = (float)8.5565;
    	String nameSlave = "SKKU";
    	Cat cat = new Cat(name, weight, nameSlave);
    	cat.getName();
    	cat.setName("Arcs2");
    	cat.getName();
    	cat.getWeight();
    	cat.setWeight((float)8.556);
    	cat.getWeight();
    	cat.getNameSlave();
    	cat.setNameSlave("SNU");
    	cat.getNameSlave();
    	cat.bark();
    	cat.getFood();
    	
    	
    	}
}


abstract class Mammal extends Animal {
    
    abstract String bark();
    abstract String getFood();
}


abstract class Reptile extends Animal {
    
    abstract String getFood();
}


final class Cat extends Mammal {
    
    private String name;
    private float weight;
    private String nameSlave;

   
    public Cat(String name, float weight, String nameSlave) {
        this.name = name;
        this.weight = weight;
        this.nameSlave = nameSlave;
    }

    
    public String getName() {
        System.out.println("Name: " + name); 
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        System.out.println("Weight: " + weight); 
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getNameSlave() {
        System.out.println("NameSlave: " + nameSlave); 
        return nameSlave;
    }

    public void setNameSlave(String nameSlave) {
        this.nameSlave = nameSlave;
    }

    
   
    String bark() {
        System.out.println("Meow"); 
        return "Meow";
    }

    String getFood() {
        System.out.println("Fish"); 
        return "Fish";
    }
}


final class Dog extends Mammal {
    
    private String name;
    private float weight;
    private String nameMaster;

    
    public Dog(String name, float weight, String nameMaster) {
        this.name = name;
        this.weight = weight;
        this.nameMaster = nameMaster;
    }

    
    public String getName() {
        System.out.println("Name: " + name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        System.out.println("Weight: " + weight); 
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getNameMaster() {
        System.out.println("NameMaster: " + nameMaster); 
        return nameMaster;
    }

    public void setNameMaster(String nameMaster) {
        this.nameMaster = nameMaster;
    }

    
    String bark() {
        System.out.println("Bowbow"); 
        return "Bowbow";
    }

    String getFood() {
        System.out.println("Apple"); 
        return "Apple";
    }
}


final class Crocodile extends Reptile {
    
    private String name;
    private float weight;

    
    public Crocodile(String name, float weight) {
        this.name = name;
        this.weight = weight;
    }

    
    public String getName() {
        System.out.println("Name: " + name); 
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        System.out.println("Weight: " + weight); 
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    
    String getFood() {
        System.out.println("Meat"); 
        return "Meat";
    }
}

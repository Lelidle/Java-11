package CompositumSolution;

public class Animal implements DataElement {
    
    private String name;
    private int age; 

    /**
     * constructor for a basic animal
     * @param name name of the animal
     * @param age age of the animal
     */
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    /**
     * Helper method to get the Name of the animal
     * @return returns the name of the animal
     */
    @Override
    public String getData(){
        return name;
    }

    /**
     * Helper method to get the age of the animal
     * @return returns the age of the animal
     * @return
     */
    public int getAge(){
        return age;
    }

    /**
     * Helper method for testing, let's an animal present the information
     */
    @Override
    public void presentation(){
        System.out.println("This is " + name + " and " + name + " is " + age + " years old");
    }

    /**
     * Overrides the comparison method to check whether the animal
     * has the same age and name as this object
     * @param o the compared object
     * @return returns a boolean stating if both objects are equal
     */
    @Override
    public boolean equals(Object o){
        if(this == o) {
            return true;
        }
        if(! (o instanceof Animal)){
            return false;
        } 
        Animal h = (Animal) o;
        if(h.getData() == this.name && h.getAge() == this.age){
            return true;
        } else {
            return false;
        }
    }

    /**
     * Method for comparing two animals. Uses only the age to compare
     * @param data the animal that shall be compared to this
     * @return returns true if this animal is older
     */
    @Override
    public boolean isGreater(DataElement data) {
        Animal animal = null;
        try {
            animal = (Animal) data;
        } catch (Exception e) {
            System.out.println("The element for the comparison is not an animal!");
        }
        if(this.getAge() > animal.getAge()) {
            return true;
        }
        return false; 
    }
}

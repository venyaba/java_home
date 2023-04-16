public class Cat {
    int age;
    double weight;
    String name;
    public  Cat (String name, double weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

     public void out(){
        System.out.println(
            "Name: " + name+"\n"+
            "Age: " + age +"\n"+
            "Weight: " + weight
        );
    }

}

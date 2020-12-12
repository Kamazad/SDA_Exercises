package sobota;


public class Cat {
    private String name;
    private Integer mouseCounter;

    public Cat(String name) {
        this.name = name;
        this.mouseCounter = 0;
    }

    public Cat(String name, Integer mouseCounter) {
        this.name = name;
        this.mouseCounter = mouseCounter;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setMouseCounter(Integer mouseCounter){
        this.mouseCounter = mouseCounter;
    }

    public Integer getMouseCounter(){
        return this.mouseCounter;
    }

    public void makeSound() {
        System.out.println(name + "Miau");
    }

    public void eatMouse() {
        this.mouseCounter++;
//         this.mouseCounter = this.mouseCouter +1;
        System.out.println("Zjadłem już " + mouseCounter + " myszy");
    }

}

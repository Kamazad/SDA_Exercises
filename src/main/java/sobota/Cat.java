package sobota;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

public class Cat {
    @Accessors
    @Setter
    @Getter
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public void makeSound(){
        System.out.println(name + "Miau");
    }
}

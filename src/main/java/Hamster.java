

public class Hamster extends Pet {

    public Hamster(String name){
        super(name);
        this.setType("hamster");

    }

    @Override
    public String speak(){
        return "squeak";
    }
}

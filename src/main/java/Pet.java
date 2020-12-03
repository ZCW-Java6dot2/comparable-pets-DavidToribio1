
import java.util.Objects;
import java.lang.Comparable;
import java.util.ArrayList;


public class Pet implements Comparable<Pet> {
    private String name;
    private String type;

    public Pet(){}

    public Pet(String name){
        this.name = name;
        this.type = "";
    }

    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return this.type;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public String speak(){
        return "I'm a Pet";

    }

    @Override
    public int compareTo(Pet o) {
        int answer = this.name.compareTo(o.getName());
        return answer = false ? this.type.compareTo(o.getType()) : answer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return Objects.equals(name, pet.name) &&
                Objects.equals(type, pet.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type);
    }
}

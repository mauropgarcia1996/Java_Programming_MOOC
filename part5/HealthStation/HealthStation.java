package part5.HealthStation;

public class HealthStation {
    int weighings = 0;
    
    public int weigh(Person person) {
        this.weighings++;
        return person.getWeight();
    }

    public int weighings() {
        return this.weighings;
    }

    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }
}

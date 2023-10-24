public class Gecko {

    private String name;
    private int age;
    private int energy;

    public Gecko() {
        this.name = "Unknown";
        this.age = 0;
        this.energy = 100;
        System.out.println("Hello!");
    }

    public Gecko(String name) {
        this.name = name;
        this.age = 0;
        this.energy = 100;
        System.out.println("Hello " + this.name + "!");
    }

    public Gecko(String name, int age) {
        this.name = name;
        this.age = age;
        this.energy = 100;
        System.out.println("Hello " + this.name + "!");
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void status() {
        switch (this.age) {
            case 0 :
                System.out.println("Unborn Gecko");
                break;
            case 1 :
            case 2 :
                System.out.println("Baby Gecko");
                break;
            case 3 :
            case 4 :
            case 5 :
            case 6 :
            case 7 :
            case 8 :
            case 9 :
            case 10 :
                System.out.println("Adult Gecko");
                break;
            case 11 :
            case 12 :
            case 13 :
                System.out.println("Old Gecko");
                break;
            default:
                System.out.println("Impossible Gecko");
        }
    }

    public void hello(String text) {
        System.out.println("Hello " + text + ", I'm " + this.name + "!" );
    }

    public void hello(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Hello, I'm " + this.name + "!");
        }
    }

    public void eat(String food) {
        switch(food.toLowerCase()) {
            case "meat" :
                this.energy = Math.min(this.energy + 10, 100);
                System.out.println("Yummy!");
                break;
            case "vegetable" :
                this.energy = Math.max(this.energy - 10, 0);
                System.out.println("Erk!");
                break;
            default :
                System.out.println("I can't eat this!");
        }
    }

    public int getEnergy() {
        return this.energy;
    }

    public void setEnergy() {
        this.energy = Math.min(Math.max(energy, 0), 100);
    }

    public void work() {
        if (this.energy >= 25) {
            System.out.println("I'm working T.T");
            this.energy -= 9;
        } else {
            System.out.println("Heyyy I'm too sleepy, better take a nap!");
            this.energy += 50;
            this.energy = Math.min(this.energy, 100);
        }
    }


}

package Work3OCP;

public class Greeter {
    private Formality formality;

    public Greeter(Formality formality) {
        this.formality = formality;
    }

    public String greet() {
        return formality.greet();
    }
}


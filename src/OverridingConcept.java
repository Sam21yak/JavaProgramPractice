public class OverridingConcept {
    public static void main(String[] args) {
        OverrideClass1 p = new OverrideClass1();
        p.marry(); //call parant class method

        OverrideClass2 c = new OverrideClass2();
        c.marry(); //call child class method

        OverrideClass1 pc = new OverrideClass2();
        pc.marry(); //parant class method

       // OverrideClass2 cp = new OverrideClass1();

    }

}

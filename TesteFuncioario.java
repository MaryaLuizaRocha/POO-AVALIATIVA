public class TesteFuncioario  {

    public static void main(String[] args) {

        Funcionarios A = new Funcionarios("Marya", 25 , 4500);
        Funcionarios B = new Funcionarios("Joana", 30, 4000);
        Gerente G1 = new Gerente("Gabriel", 45, 6000, "TI");
        Gerente G2 = new Gerente("Ana", 40, 7800, "RH");

        A.info();
        B.info();
        G1.info();
        G2.info();
    }
}

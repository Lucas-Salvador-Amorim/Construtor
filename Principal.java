public class Principal {
    public static void main(String[] args) {
        Bicicleta bike = new Bicicleta();

        Carro car = new Carro();
        Carro car2 = new Carro("1.0 ", " Up. " , 4 , 63000 );

        Trator trator = new Trator();
        Trator trator2 = new Trator(4,"4x2", "Massey"," MF 7316 Dyna-3", 185000);
        Carro car3= new Carro("4.0 ", "John Deere ", "total ");

        car2.dadosVeiculo();

    }
}

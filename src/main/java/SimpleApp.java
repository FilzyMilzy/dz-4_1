public class SimpleApp {
    public static void main(String[] argv){

        IntegerVault integerVault = new IntegerVault();

    /*Since getIntValue method already has a sout that prints int value to console
    (according to assignment point 4.b.)
    I assume its ok to just call on the method and not use sout in main as stated in point 5*/
        integerVault.getIntValue();

    }
}
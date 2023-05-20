public class CafeJava {
    public static void main(String[] args) {
        
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        String mistake = " sorry for the mistake Jimmy,you have to pay us: $ ";

        double mochaPrice = 3.5;
        double DripCoffe = 2.5;
        double Latte = 3.25;
        double Cappucino = 4.55;
    
        String customer1 = "Cindhuri";
        String customer2 = "Noah";
        String customer3 = "Sam";
        String customer4 = "Jimmy";
    
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = true;

        System.out.println(generalGreeting + customer1); 
        if(isReadyOrder1) {
            System.out.println(readyMessage + displayTotalMessage + DripCoffe);
        }
        else {
            System.out.println(pendingMessage);
        }

        System.out.println(generalGreeting + customer2); 
        if(isReadyOrder2) {
            System.out.println(readyMessage + displayTotalMessage + Cappucino);
        }
        else {
            System.out.println(pendingMessage);
        }

        System.out.println(generalGreeting + customer3); 
        if(isReadyOrder3) {
            System.out.println(readyMessage + displayTotalMessage + 2*Latte);
        }
        else {
            System.out.println(pendingMessage);
        }
        System.out.println(generalGreeting + customer4); 
        if(isReadyOrder4) {
            System.out.println( mistake + (Latte-DripCoffe));
        }
        else {
            System.out.println(pendingMessage);
        }







    }



    



}

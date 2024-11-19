public class Main {

    public static void main(String[] args) {

        // Create instances of different payment methods

        Payment creditCard = new CreditCardPayment();

        Payment payPal = new PayPalPayment();

        Payment bankTransfer = new BankTransferPayment();



        // Process payments

        processPayment(creditCard, 150.0);

        processPayment(payPal, 200.50);

        processPayment(bankTransfer, 1000.0);

    }



    // Method to process the payment using the provided payment method

    public static void processPayment(Payment paymentMethod, double amount) {

        paymentMethod.processPayment(amount);

    }

}


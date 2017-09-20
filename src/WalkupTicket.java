/**
 * Name: David Johnson
 * Date: September 20, 2017
 * Course: CS211
 * Assignment: #9a
 * Ticket Exercises from text
 */

class WalkupTicket extends Ticket{

    WalkupTicket() {
        super(0);
    }

    WalkupTicket(int number) {
        super(number);
    }

    @Override
    public double getPrice() {
        // Ordinary citizens pay full price at window
        this.price = 50.0;
        return this.price;
    }
    
}

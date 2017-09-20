/**
 * Name: David Johnson
 * Date: September 20, 2017
 * Course: CS211
 * Assignment: #9a
 * Ticket Exercises from text
 */

public class AdvanceTicket extends Ticket{
    
    private int daysInAdvance;
    
    public AdvanceTicket(int number, int days) {
        super(number);
        // Cannot buy tikets in arrears!
        if(days < 0) {
            throw new IllegalArgumentException("daysInAdvance must be a positive integer!");
        }
        else {
        this.daysInAdvance = days;
        }
    }

    @Override
    public double getPrice() {
        // If purchase 10 or more days in advance, you get a discount!
        if(this.daysInAdvance >= 10) {
            this.price = 30.0;
        }
        else {
            this.price = 40.0;
        }
        return this.price;
    }
    
}

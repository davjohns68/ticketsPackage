/**
 * Name: David Johnson
 * Date: September 20, 2017
 * Course: CS211
 * Assignment: #9a
 * Ticket Exercises from text
 */

public class StudentAdvanceTicket extends AdvanceTicket{

    public StudentAdvanceTicket(int number, int days) {
        super(number, days);
    }

    // Included this constructor since it was used in the test harness
    // Assuming no params equals no preferred ticket number and 0 days in advance
    StudentAdvanceTicket() {
        this(0,0);
    }

    @Override
    public double getPrice() {
        // Students get tickets at half price!
        this.price = super.getPrice() / 2;
        return this.price;
    }
    
    @Override
    public String toString() {
        // Don't forget to ask for Student ID!
        return super.toString() + " (ID required)";
    }
    
}

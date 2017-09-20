//import ticketsPackage.*;

// CS211 BC, W.P. Iverson
// modified July 2017
public class TicketTester {
// testing code for Ticket Classes
// BJP text Exercises, Chapter 9
    public static void main(String[] args) {
        Ticket[] scam = new Ticket[15]; // an array of Tickets that don't exist
        for (Ticket tick: scam) {
            tick = new WalkupTicket(); // actually calls a constructor for each
        }
 
        AdvanceTicket one = new AdvanceTicket(10, 5); // constructor overloaded
        //one.price = 17; // not allowed, wrong package, protected access
            // Page 657: Above is ticket number 10, purchased 20 days in advance
            //one.setNumber(17); // not allowed, no such method, keeps unique
            // But two lines above might work if you don't follow directions!!!
        System.out.println(one); // output should be Number: 15, Price: 30.0
 
        WalkupTicket two = new WalkupTicket(2); // number 2 used, so grabs next
        System.out.println(two); // output should be Number: 16, Price: 50.0
 
        StudentAdvanceTicket last = new StudentAdvanceTicket(0,0); // default number 
        System.out.println(last); // Number: 17, (from Ticket) plus (ID Required)
    }
}
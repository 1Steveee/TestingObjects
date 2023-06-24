package org.example;

public class Main {
    public static void main(String[] args) {


        System.out.println("Testing to understand how Object within another object is referenced");

        BookingDates bookingDates = new BookingDates("June 23, 2023", "June 30,2023");
        Booking booking = new Booking("Steven", "Franco", bookingDates);

        System.out.println("--------- Here is some information about your trip -----------");
        System.out.println("The booking is for: " +
                booking.getFirstName() + " " + booking.getLastName());
        System.out.println("The check in time is: " + booking.getBookingDates().getCheckIn());
        System.out.println("The check out time is: " + booking.getBookingDates().getCheckOut());
    }
}
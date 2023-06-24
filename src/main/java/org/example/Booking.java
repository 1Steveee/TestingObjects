package org.example;

public class Booking {
    private String lastName;
    private BookingDates bookingDates;
    private String firstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BookingDates getBookingDates() {
        return bookingDates;
    }

    public void setBookingDates(BookingDates bookingDates) {
        this.bookingDates = bookingDates;
    }


    public Booking(String firstName, String lastName, BookingDates bookingDates) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bookingDates = bookingDates;
    }


}

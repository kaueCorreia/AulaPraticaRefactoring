public class HtmlStatement extends Statement {

    protected String headerString(Customer aCustomer) {
        return "<H1>Rentals for <EM>" + aCustomer.getName() + "</EM></H1><P>\n";
    }

    protected String eachRentalString(Rental each) {
        return each.getMovie().getTitle() + ": " +
                String.valueOf(each.getCharge()) + "<BR>\n";
    }

    protected String footerString(Customer aCustomer) {
        return "<P>You owe <EM>" + aCustomer.getTotalCharge() + "</EM><P>\n" +
                "On this rental you earned <EM>" +
                aCustomer.getTotalFrequentRenterPoints() +
                "</EM> frequent renter points<P>";
    }
}

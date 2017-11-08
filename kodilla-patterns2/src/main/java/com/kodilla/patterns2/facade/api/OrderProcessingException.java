package com.kodilla.patterns2.facade.api;

public class OrderProcessingException extends Exception {
   public static String ERR_NOT_AUTHORISED = "Użytkownik nie jest zalogowany";
   public static String ERR_PAYMENT_REJECTED = "Płatność odrzuczona";
   public static String ERR_VERIFICATION_ERROR = "Błąd weryfikacji";
   public static String ERR_SUBMITTING_ERROR = "Nie można zapisać zamówienia";

   public OrderProcessingException(String message) {
       super(message);
   }
}

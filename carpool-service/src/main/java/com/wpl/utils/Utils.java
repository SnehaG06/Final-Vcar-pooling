package com.wpl.utils;

import javax.servlet.http.HttpServletRequest;

import com.wpl.model.Ride;

public class Utils {

  // Products in the cart, stored in Session.
  public static Ride getRiderInSession(HttpServletRequest request) {

     Ride rider = (Ride) request.getSession().getAttribute("myride");

   
     if (rider == null) {
        rider = new Ride();
         
        request.getSession().setAttribute("myride", rider);
     }

     return rider;
  }

  public static void removeRiderInSession(HttpServletRequest request) {
     request.getSession().removeAttribute("myride");
  }

  public static void storeLastRideInSession(HttpServletRequest request, Ride rider) {
     request.getSession().setAttribute("lastRide", rider);
  }

  public static Ride getLastRiderInSession(HttpServletRequest request) {
     return (Ride) request.getSession().getAttribute("lastRide");
  }
   
}

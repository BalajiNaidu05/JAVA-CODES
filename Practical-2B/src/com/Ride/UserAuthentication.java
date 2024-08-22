package com.Ride;
//Singleton UserAuthentication class
class UserAuthentication {
 private static UserAuthentication instance;

 private UserAuthentication() {
     // Private constructor to prevent instantiation
 }

 public static synchronized UserAuthentication getInstance() {
     if (instance == null) {
         instance = new UserAuthentication();
     }
     return instance;
 }

 public void authenticateUser(String username, String password) {
     // Authentication logic (simplified)
     System.out.println("Authenticating user: " + username);
 }
}
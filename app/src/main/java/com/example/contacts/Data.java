package com.example.contacts;

import java.util.ArrayList;

public class Data {
        private static ArrayList<Contact> contacts = new ArrayList<>();

        public static void save(Contact c){
            contacts.add(c);
        }

        public static ArrayList<Contact> getcontacts(){
            return contacts;
        }



}

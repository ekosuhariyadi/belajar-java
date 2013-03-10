/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codeimpact.belajargson.util;

import com.codeimpact.belajargson.model.Person;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 *
 * @author eko
 */
public class JsonUtil {

    public static String convertPersonToJson(Person person) {
        return convertPersonToJson(person, true);
    }

    public static String convertPersonToJson(Person person, boolean prettyPrint) {
        GsonBuilder builder = new GsonBuilder();
        builder.serializeNulls();
        if (prettyPrint) {
            builder.setPrettyPrinting();
        }
        Gson gson = builder.create();

        return gson.toJson(person, Person.class);
    }

    public static Person getPersonFromJson(String json) {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();

        return gson.fromJson(json, Person.class);
    }
}

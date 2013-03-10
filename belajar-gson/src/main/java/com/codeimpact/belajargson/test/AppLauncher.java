/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codeimpact.belajargson.test;

import com.codeimpact.belajargson.model.Person;
import com.codeimpact.belajargson.util.JsonUtil;
import java.util.Arrays;

/**
 *
 * @author eko
 */
public class AppLauncher {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Eko Suhariyadi");
        person.setAge(26);
        person.setMessage(Arrays.asList("Uzumaki Naruto", "Uchiha Sasuke", "Hatake Kakashi", "Jackson Michael"));

        String jsonCompact = JsonUtil.convertPersonToJson(person, false);
        System.out.println("Json compact:");
        System.out.println(jsonCompact);


        String jsonPretty = JsonUtil.convertPersonToJson(person, true);
        System.out.println("\nJson prettyprint:");
        System.out.println(jsonPretty);

        Person fromJson = JsonUtil.getPersonFromJson(jsonPretty);
        System.out.println(fromJson);
    }
}

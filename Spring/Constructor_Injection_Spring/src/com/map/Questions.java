package com.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//Bean Class
public class Questions {
    private int id;
    private String question;
    private Map<String,String> answers;

    public Questions(int id, String question, Map<String, String> answers) {
        this.id = id;
        this.question = question;
        this.answers = answers;
    }

    public void answerInfo()
    {
        System.out.println("ID: " + id);
        System.out.println("Question: " + question);
        Set<Map.Entry<String,String>> s = answers.entrySet();

        Iterator<Map.Entry<String,String>> it = s.iterator();

        while(it.hasNext())
        {
            Map.Entry<String,String> x = it.next();
            System.out.println(x.getKey() + ": " + x.getValue());

        }


    }
}

package com.list;

import java.util.Iterator;
import java.util.Set;

//Bean Class
public class Questions {
    private int id;
    private String question;
    private Set<String> answers;

    public Questions(int id, String question, Set<String> answers) {
        this.id = id;
        this.question = question;
        this.answers = answers;
    }

    public void answerInfo()
    {
        System.out.println("ID = " +id+ "\nQuestion: " + question);
        System.out.println("\nAnswers: ");
        Iterator<String> i = answers.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}

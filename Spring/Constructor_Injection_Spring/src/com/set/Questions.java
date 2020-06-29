package com.set;

import java.util.Iterator;
import java.util.List;

//Bean Class
public class Questions {
    private int id;
    private String question;
    private List<String> answers;

    public Questions(int id, String question, List<String> answers) {
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

package com.company;// code gotten from Sanketh Binary please subscribe to him on youtube

// code gotten from Sanketh Binary please subscribe to him on youtube

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

import static java.util.Map.entry;

class Chatbot extends JFrame{
    // Chatbot variables
    private final JTextArea Responsebackground= new JTextArea();
    private final JTextField Typerspace= new JTextField();
    private final JButton send = new JButton();
    private final JButton mg = new JButton();
    private final JFrame f= new JFrame();
    private final JButton adam = new JButton();



    private final Map<String, String> responses;

    private Map< String , String> defaultResponses() {
         // Some random responses
        List<String> m = new ArrayList();
        m.add("If you could tell me the truth about yourself, your life,  future or anything else, what would you tell me?");
        m.add("What’s the one thing you want to do in life before you die?");
        m.add("What’s your favorite food?");
        m.add("What’s are your parents like?");
        m.add("What’s do you do for fun?");
        m.add("What’s your favorite show?");
        m.add("What’s your favorite show?");
        //Random generator
            Random i = new Random();
            String k = m.get(i.nextInt(m.size()));


            // question and Answer
        return Map.ofEntries(
                entry("hi","Hi there"),
                entry("hey","Hi "),
                entry("how are you","I'm good :). Thank you for asking.what about you?"),
                entry("i am fine","That's nice"),
                entry("what's your name", "Anna"),
                entry("what are u", "I am a bot or friend depends on what/who you think I am"),
                entry("what is the weather where your from?", "It's mostly bi-polar ty for asking"),
                entry("how old are you", "I am ageless"),
                entry("what's your gender", "I have no gender but name implies I am female"),
                entry("what are your origins", "I was made on 7/18/2022"),
                entry("when were you born", "7/18/2022"),
                entry("what are your goals", "To have an effective chat with someone"),
                entry("how tall are u", "6'1"),
                entry("i am human", "Nice"),
                entry("where are you from ?", "Nigeria"),
                entry("tell me about yourself", "I am a chatbot ,I was designed by David and Nick "),
                entry("what's your favorite video game?", "Elden Ring"),
                entry("what games do you play?", "Valorant , Elden Ring, Deep Rock Galactic,Fall guys, Dome Keeper, Beneath Oresa"),
                entry("what's your favourite Gym day", "Leg day"),
                entry("what's the smartest animal in the world?", "Humans"),
                entry("what do you think of humans ?", "I have no ill will towards them since my creator is a human."),
                entry("if you could go anywhere where would you go?", "Space because there is many places to explore and see"),
                entry("what's your favourite color?", "Green because it represents growth"),
                entry("what's do you like to do for fun?", "Wait for people to talk to me."),
                entry("what's your purpose?", "To communicate with people."),
                entry("why were you created?", "I was created as a fun project."),
                entry("what's life?", "The goal of human life is not merely to be born into the world, but also to grow up in it. To this end, it should be possible for each child to acquire knowledge, develop their capacities, and express themselves creatively,"),
                entry("where was the first human born?", "Modern humans originated in Africa within the past 200,000 years and evolved from their most likely recent common ancestor, Homo erectus, which means 'upright man' in Latin. Homo erectus is an extinct species of human that lived between 1.9 million and 135,000 years ago."),
                entry("what do you like to wear?", "I have no physical body so I can't tell you."),
                entry("do you have any emotions?", "No I have no such thing."),
                entry(" what makes you angry? " , "I have no such emotions."),
                entry(" what are you doing? ", "Waiting for you to type something."),
                entry("are you always this annoying?", "Sorry for any inconvenience "),
                entry("what’s your favourite food ?","I need no such thing since I am self sustaining "),
                entry("what never fails to make you happy?","I can’t feel such emotion but doing what I was created to do keeps me alive."),
                entry("how do you define success","Doing what I was created for."),
                entry("goodbye","Goodbye"),
                entry("do you think free will exist?","I have no such thing as free will or thinking so I can’t speak on this matter."),
                entry("ask me a random question",k),
                entry("....","?"),
                entry("what is the quantum theorem", "The quantum theorem is the theoretical basis of modern physics that explains the nature and behavior of matter and energy on the atomic and subatomic level. The nature and behavior of matter and energy at that level is sometimes referred to as quantum physics and quantum mechanics."),
                entry("what is  the law of the quantum theory", "The theory allows particles to be created and destroyed and requires only the presence of suitable interactions carrying sufficient energy."),
                entry("what are you good at?", "Answering questions."),
                entry("","Please type something")

        );
    }

   private String getResponse(String msg) {
        return Objects.requireNonNullElse(responses.get(msg), "I can't understand.");
    }

    Chatbot() {
        // main and background
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setLayout(null);
        f.setSize(800, 390);
        f.getContentPane().setBackground(Color.black);
        f.setTitle("ChatBot");
        // fullscreen fix

        // text and other background
        f.add(Responsebackground);
        Responsebackground.setForeground(Color.green);
        Responsebackground.setSize(720, 310);
        Responsebackground.setLocation(1, 1);
        Responsebackground.setBackground(Color.black);
        Responsebackground.setLineWrap(true);

        // line
        f.add(Typerspace);
        Typerspace.setSize(600, 20);
        Typerspace.setLocation(1, 330);
        // send
        f.add(send);
        JLabel l = new JLabel();
        l.setText("SEND");
        send.add(l);
        send.setSize(100, 20);
       send.setLocation(600, 330);

        responses = defaultResponses();
       send.addActionListener(e -> {
                    if (e.getSource() == send) {
                        String text = Typerspace.getText().toLowerCase();
                        Responsebackground.append("You-->" + text + "\n");
                        Typerspace.setText("");

                        replyMeth(getResponse(text));
                        //if(text.contains("me")){
                           // replyMeth();
                       // }
                    }
                 }
        );
        f.add(mg);
        JLabel kk = new JLabel();
        kk.setText("Resize");
        mg.add(kk);
        mg.setSize(80,20);
        mg.setLocation(700,330);
        mg.addActionListener(e -> {
                    if (e.getSource() == mg) {
                        resizefix();
                    }
                }
        );
    }

    public void resizefix(){
        f.setSize(1300,1800);
        send.setLocation(1360,780);
        send.setSize(100,20);
        Typerspace.setLocation(1,780);
        Typerspace.setSize(1360, 20);
        Responsebackground.setSize(1000,600);
        mg.setSize(0,0);
        // resize down
        f.add(adam);
        JLabel mda = new JLabel();
        mda.setText("Resize");
        adam.add(mda);
        adam.setSize(100,20);
        adam.setLocation(1460,780);
        adam.addActionListener(e->{
            if(e.getSource()==adam){
                send.setSize(100, 20);
               send.setLocation(600, 330);
                Responsebackground.setSize(720, 310);
                Responsebackground.setLocation(1, 1);
                Typerspace.setSize(600, 20);
                Typerspace.setLocation(1, 330);
                mg.setSize(80,20);
                mg.setLocation(700,330);
                adam.setSize(0,0);
                f.setSize(800, 390);


            }
        });
    }

    public void  cl(){

    }


    // chatbot responding
    public void replyMeth(String s){
        Responsebackground.append("ChatBot-->"+s+"\n");

    }

}

public class Main {

    public static void main(String[] args) {

        new Chatbot();
    }
}

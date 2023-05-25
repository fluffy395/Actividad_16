package Hilos.Chat;

import Hilos.Ejemplos.EscrituraLenta;

public class ChatDemo implements Runnable {
    @Override
    public void run() {
        String megm1 = ("Hi, there!");
        String kathyo1 = ("Hi, Meg!");
        String megm2 = ("What are you doing?");
        String kathyo2 = ("I'm sitting on my bed with my laptop. I'm doing my homework");
        String megm3 = ("What are you working on?");
        String kathyo3 = ("I'm writing an essay for Spanish class :) " + "\n" +
                " Where are you?");
        String megm4 = ("I'm in a cafe with my friend Carmen. " + "\n" +
                " I'm having coffee, and she's talking on the phone outside." + "\n" +
                " How is your Family");
        String kathyo4 = ("They're all fine! My father's watching a baseball game with his friends." + "\n" +
                " My mother is out shopping.");
        String megm5 = ("Where's your brother?");
        String kathyo5 = ("John's playing soccer in the park. Oh, wait. My phone is ringing. " + "\n" +
                " My brother is calling go. I've got to go! Bye!");
        String megm6 = ("OK! Bye");

        EscrituraLenta.escribir("Meg: " + megm1, 50);
        EscrituraLenta.escribir("\nKathy: " + kathyo1, 50);
        EscrituraLenta.escribir("\nMeg: " + megm2, 50);
        EscrituraLenta.escribir("\nKathy: " + kathyo2, 50);
        EscrituraLenta.escribir("\nMeg: " + megm3, 50);
        EscrituraLenta.escribir("\nKathy: " + kathyo3, 50);
        EscrituraLenta.escribir("\nMeg: " + megm4, 50);
        EscrituraLenta.escribir("\nKathy: " + kathyo4, 50);
        EscrituraLenta.escribir("\nMeg: " + megm5, 50);
        EscrituraLenta.escribir("\nKathy: " + kathyo5, 50);
        EscrituraLenta.escribir("\nMeg: " + megm6, 50);
    }

    public static void main (String[] args) {
        Thread ChatDemo = new Thread(new Thread(new ChatDemo()));
        ChatDemo.start();
    }
}
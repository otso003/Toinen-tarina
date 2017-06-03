package javaapplication58;



public class JavaApplication58 {

    public static void main(String[] args) {
        // muokkaa tarinaa tehtävänannon mukaisesti
        
        String henkilo = "Hattivatti ja Joku Muu Tuttu";
        String paikka = "Hattivatistan naapurin";
        String asu = "kaapu ja keppi";
        String valine = "räpylä ja maila";
        
        System.out.println("Olipa kerran " + henkilo + ", joka asui paikassa ");
        System.out.println("nimeltä " + paikka + ". Eräänä päivänä tepastellessaan");
        System.out.println(henkilo + " kohtasi hirviön, jolla oli päällään " + asu + ".");
        System.out.println("'Hmm...' mietti " + henkilo + " ja muisti, että hänellä");
        System.out.println("oli mukanaan " + valine + ". " + henkilo + " heilautti sitä,");
        System.out.println("*puff* hirviö katosi!");
        
    }
}
public class Notifications {
    // atribute
    private String email;
    private String mesajDefault;
    private boolean eActiv;

    // constructor
    public Notifications(String email, String mesajDefault, boolean eActiv) {
        this.email = email;
        this.mesajDefault = mesajDefault;
        this.eActiv = eActiv;
    }

    // metoda principala care trimite alerta
    public void trimiteAlerta(String mesajNou) {
        if (!eActiv) {
            System.out.println("Eroare: Notificarile sunt oprite pt " + email);
            return;
        }

        System.out.println("--- Trimitere Notificare ---");
        System.out.println("Catre: " + email);
        
        // punem mesajul nou daca exista, daca nu il bagam pe ala default
        if (mesajNou != null && !mesajNou.isEmpty()) {
            System.out.println("Mesaj: " + mesajNou);
        } else {
            System.out.println("Mesaj: " + mesajDefault);
        }
        
        System.out.println("Status: Trimis ok!");
        System.out.println("----------------------------\n");
    }

    public static void main(String[] args) {
        // cream obiectul pt test
        Notifications notificare = new Notifications("student@gmail.com", "Salut! Ai intrat in sistem.", true);

        // test 1 (dam un mesaj specific)
        notificare.trimiteAlerta("Ai o alerta noua din frontend!");
        
        // test 2 (lasam gol ca sa ia mesajul default)
        notificare.trimiteAlerta("");
    }
}
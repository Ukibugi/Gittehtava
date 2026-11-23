public class App {
    public static void main(String[] args) throws Exception {
Elain elain = new Elain();
        elain.Nopeus = 5;
        elain.Laji = "kissa";
        elain.liiku();

    }
}
//Elain liikkumaan ja määritetty nopeus
class Elain {
    public int Nopeus;
    public String Laji;

    public void liiku()
    {
        System.out.println("Eläin liikkuu");
            System.out.println("Eläimen nopeus on " + Nopeus + " km/h");
            System.out.println("Eläimen laji on " + Laji + ".");
    }
	

    // Milon kommentti
    // Hennan kommentti, lisäsin eläinlajin

    
    // Tähän voitte muut sitten vaikka jatkaa Javalla mutta sehän ei ollut edes pakollista
    //  vaan sai vaan kirjoittaa jotain tähän ja sitten committaa se yhteiseen reposotoryyn.
	// Toivottavasti tämä kommentti tulee näkyviin, Tämä muutos tehty 23.11.2026 klo 16.09 
}
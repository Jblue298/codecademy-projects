//This project calls on inheritances from multiple files to pull together language family info
class Language {
   
  protected String name;
  protected int numSpeakers;
  protected String regionsSpoken;
  protected String wordOrder;

  Language (String langName, int speakers, String regions, String wdOrder) {
    this.name = langName;
    this.numSpeakers = speakers;
    this.regionsSpoken = regions;
    this.wordOrder = wdOrder;
  }
  
  public void getInfo() {

   System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken + ".");
   System.out.println("The language follows the world order: " + wordOrder);
   
  }

  public static void main(String[] args) {
  
    Mayan chʼol = new Mayan("chʼol", 212117);
    chʼol.getInfo();

    SinoTibetan mandarin = new SinoTibetan("Mandarin Chinese", 10000000);
    mandarin.getInfo();
    SinoTibetan burmese = new SinoTibetan("Burmese", 320000);
    burmese.getInfo();
  }
}

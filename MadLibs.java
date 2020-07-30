public class MadLibs {
    /* This program generates a mad libbed story.
        Author: J.Blue
        Date: 7/24/2020 
    */
    public static void main(String[] args){
        String name1 = "Jim";
        String name2 = "Jemimah";
        String adjective1 = "crappy";
        String adjective2 = "superb";
        String adjective3 =  "deplorable";
        String verb1 = "driving";
        String noun1 = "pillow";
        String noun2 = "bike";
        String noun3 = "mountain";
        String noun4 = "jelly";
        String noun5 = "potato";
        String noun6 = "couch";
        int theYear = 2042;
        String place1 = "Geneva";
             
        //The template for the story
        String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+theYear+", in a world where "+noun6+"s ruled the world.";
      
      System.out.println(story);
      
      
      }       
  }
//Jack Metcalf
// 8/25/25
// P:4

public class Stringart{
     public static void main(String args[]){
        /**
         * Challenge 1
         */
        String pop = "Popcorn";
        String pic = "Picture";
        String comp = "Computer";
        int alen = pop.length();
        String aFL = pop.substring(0,1);
        String aLL = pop.substring(alen-1);
        String amiddle = pop.substring(1,alen-1);
        int blen = pic.length();
         String bFL = pic.substring(0,1);
         String bLL = pic.substring(alen-1);
        String bmiddle = pic.substring(1,alen-1);
        int clen = comp.length();
         String cFL = comp.substring(0,1);
         String cLL = comp.substring(clen-1);
        String cmiddle = comp.substring(1,clen-1);
        String aR = aLL + amiddle + aFL;
        String bR = bLL + bmiddle + bFL;
        String cR = cLL + cmiddle + cFL;
        System.out.println(aR.toLowerCase());
        System.out.println(bR.toLowerCase());
        System.out.println(cR.toLowerCase());
        /**
         * Challenge 2
         */
        String art = """
            .  . 
           / /\\
        .-`  \\ \\      __
      .'  .-  `-`-..-`  `-.
     /  .'  .-  .  .-.     \\
    /  /  /  /  /   \\ \\     \\
   /  /  /  /  /     \\ \\     \\
  /  /  /__/__/_______\\ \\     \\
 /__/____________________\\_____\\
    \\   )__________            /
     \\________________________/
       /\\     ____     /\\
      /  \\   / __ \\   /  \\
      |  o|  | |  | |  o  |
      |___|  | |__| |  ___|
        ""    ""  ""    7
        """;

        System.out.print(art);
  

     }

}
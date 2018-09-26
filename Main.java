package colors;

public class Main {


    public static void main (String args[]){

        Colour colour1 = new Colour(2,2,2);
        Colour colour2 = new Colour(4,3,6);
        Colour colour3 = new Colour(7,7,7);
        Colour colour4 = new Colour(10,20,15);
        Colour colour5 = new Colour(23,15,10);
        Colour colourMix = new Colour(11,13,7);

        ColourPalette palette1 = new ColourPalette(10);

        palette1.addColour(colour1);
        palette1.addColour(colour2);
        palette1.addColour(colour3);
        palette1.addColour(colour4);
        palette1.addColour(colour5);

        int index = 1;
        System.out.println(palette1.getNumberOfColours());
        System.out.println(palette1.getColour(1));
        System.out.println(colourMix);
        palette1.mixColour(1,colourMix);
        System.out.println("New Colour: " + palette1.getColour(1));
        System.out.println("Number of Grey Colours: "+palette1.getNumberOfGreyColours());
        
    }
}

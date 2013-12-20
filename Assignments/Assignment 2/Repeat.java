// Wesley Chow // V00727646
// CSC 110 // May 25, 2012
// Repeat (Assignment 2)
// Repeats certain lyrics from "The House that Jack Built" using static methods

public class Repeat
{
    //Put all unique lines of song in main method, call rested of them
    public static void main(String [] args)
    {
        //Verse 1
        System.out.println("This is the house that Jack built.\n");
        //Verse 2
        System.out.println("This is the malt");
        System.out.println("That lay in the house that Jack built.\n");
        //Verse 3
        System.out.println("This is the rat,");
        Verse3();
        //Verse 4
        System.out.println("This is the cat,");
        Verse4();
        //Verse 5
        System.out.println("This is the dog,");
        Verse5();
        //Verse 6
        System.out.println("This is the cow with the crumpled horn,");
        Verse6();
        //Verse 7
        System.out.println("This is the maiden all forlorn");
        Verse7();
    }

    //Declaring methods
    public static void Verse3()
    {

        System.out.println("That ate the malt");
        System.out.println("That lay in the house that Jack built.\n");
    }

    public static void Verse4()
    {

        System.out.println("That killed the rat,");
        Verse3();
    }

    public static void Verse5()
    {

        System.out.println("That worried the cat,");
        Verse4();
    }

    public static void Verse6()
    {

        System.out.println("That tossed the dog,");
        Verse5();
    }

    public static void Verse7()
    {

        System.out.println("That milked the cow with the crumpled horn,");
        Verse6();
    }

}

//Output from program:

/*
This is the house that Jack built.

This is the malt
That lay in the house that Jack built.

This is the rat,
That ate the malt
That lay in the house that Jack built.

This is the cat,
That killed the rat,
That ate the malt
That lay in the house that Jack built.

This is the dog,
That worried the cat,
That killed the rat,
That ate the malt
That lay in the house that Jack built.

This is the cow with the crumpled horn,
That tossed the dog,
That worried the cat,
That killed the rat,
That ate the malt
That lay in the house that Jack built.

This is the maiden all forlorn
That milked the cow with the crumpled horn,
That tossed the dog,
That worried the cat,
That killed the rat,
That ate the malt
That lay in the house that Jack built.
*/
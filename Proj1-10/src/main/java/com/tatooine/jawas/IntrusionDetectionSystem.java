package com.tatooine.jawas;

/**
 *
 */
public class IntrusionDetectionSystem
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public Boolean isAllowed(String name){
        if(name.contains("Jedi")){
            return false;
        }
        return true;
    }


    public Boolean fromDarkSide(String name) {
//        throw new UnknownError("Unable to determine which Side");
        if(!name.contains("Darth")){
            return false;
        }
        return true;
    }

}

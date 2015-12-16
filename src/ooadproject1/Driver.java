
package ooadproject1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Driver {
 
    private List<Game> myGames = new ArrayList<Game>(); 
    private Game myGame;
    private Child child1;
    private Parent myParent;
    private Scanner scan = new Scanner(System.in);
    private boolean runSystem;
    public Driver()
    {
        runSystem = true;
        String input ="";
        createGamesList();
        createChildParent();
        System.out.println("For testing Do you want parental rating for all games to be set to 100 Y or N");
        input = scan.next();
        while(runSystem)
        {
        System.out.println("assume user is logged in as child && for testing purposes and that the child is "+child1.getAge());
        setMockParentalRatings(input);
        System.out.println("Chose a game to play form the following list");
        System.out.print(outPutGamesList());
        String myGameChoice = scan.next();
        playGame(myGameChoice);
        System.out.println("do you want to continue running the system ? y/n");
        input = scan.next();
        if (input.equalsIgnoreCase("n"))
        {
            System.exit(0);
        }
        }
    }
    public static void main(String[]args)
{
      Driver d = new Driver();
    
}

    private void rateTheGame(int gameIndex)
    {
        String input = "";
        float rating =0;
        
      if (myGames.get(gameIndex).hasPlayed(child1.getChildId()))
       {
        if (myGames.get(gameIndex).hasChildRatedGame(child1.getChildId()))
        {
            System.out.println("sorry you have already rated the game "+myGames.get(gameIndex).getGameName());
        }
        else 
        {
            System.out.println("would you like to submit a rating for "+myGames.get(gameIndex).getGameName()+" ? Y/N");
            input = scan.next();
            
            if(input.equalsIgnoreCase("Y"))
            {
                System.out.println("Enter your rating for the game");
                input = scan.next();
                rating = Float.valueOf(input);
                if (myGames.get(gameIndex).isValidRating(rating))
                {
                    myGames.get(gameIndex).sumbitChildRating(rating,child1.getChildId());
                    System.out.println("Rating succesfully submitted !!\nThe new rating for "+myGames.get(gameIndex).getGameName()+" is "+myGames.get(gameIndex).getChildRatingAverage());
                    System.out.println("would you like to submit a comment ? y/n");
                    input = scan.next();
                    if (input.equalsIgnoreCase("y"))
                    {
                        System.out.println("enter your comment");
                       // input = scan.next();
                        input = scan.nextLine();
                        input = scan.nextLine();
                        myGames.get(gameIndex).setChildComment(child1.getChildId(), input);
                        System.out.println("comment submitted your comment was : "+myGames.get(gameIndex).getChildComment(child1.getChildId()));
                    }
                    else
                    {
                        System.out.println("comment was not submitted");
                    }
                    
                }
                else
                {
                    System.out.println("That is an incorrect value rating must be between 0.0 and 100.0");
                }
            }
        }
        
       }
      else
      {
          System.out.println("Sorry you have to play a game before you can rate it");
      }
    }
    private void setMockParentalRatings(String ans)
    {
        if (ans.equalsIgnoreCase("y"))
        {
            for (int i = 0;i< myGames.size();i++)
            {
                myGames.get(i).submitParentRating(true, myParent.getParentId());
            }
        }
    }
    private void playGame(String gameName)
    {
        int gameIndex=0;
        if (doesGameExist(gameName))
        {
            gameIndex = getGameIndex(gameName);
            if (myGames.get(gameIndex).isAppropriateAge(child1.getAge()))
            {
                
                if (myGames.get(gameIndex).hasPartentalApproval())
                {
                    myGames.get(gameIndex).play(child1.getChildId());
                    System.out.println("you played the game");
                    rateTheGame(gameIndex);
                }
                else
                {
                    System.out.println("Game has not been approved by majority of parents");
                }
            }
            else
            {
                System.out.println("Your too young to play this game");
            }
                    
        }
        else
        {
            System.out.println(gameName+" was not on the list");
        }
        
    }
    private int getGameIndex(String gameName)
    {
         for(int i =0;i<myGames.size();i++)
        {
            if (myGames.get(i).getGameName().equalsIgnoreCase(gameName))
            {
                return i;
            }
        }
        return 0;
    }
    private boolean doesGameExist(String gameName)
    {
        for(int i =0;i<myGames.size();i++)
        {
            if (myGames.get(i).getGameName().equalsIgnoreCase(gameName))
            {
                return true;
            }
        }
        return false;
    }
    private String outPutGamesList()
    {
        String output = "";
        
        for (int i = 0;i<myGames.size();i++)
        {
            output+= myGames.get(i).getGameName()+" AgeRating : "+myGames.get(i).getAgeRating()+" Game rating : "+myGames.get(i).getChildRatingAverage()+"\n";
            
        }
        return output;
    }
    private void createGamesList()
    {
        myGame = new Game("Sonic","1990","this is a description of a sonic game",12);
        myGames.add(myGame);
        myGame = new Game("Mario","1995","this is a description of a mario game",1);
        myGames.add(myGame);
        myGame = new Game("Gta","1996","this is a description of a gta game",18);
        myGames.add(myGame);
        myGame = new Game("Derpina","1998","this is a description of a derpina game",14);
        myGames.add(myGame);
        myGame = new Game("007","1995","this is a description of a 007 game",8);
        myGames.add(myGame);
    }
    private void createChildParent()
    {
        child1 = new Child(12,1);
        myParent = new Parent(1);
    }
}


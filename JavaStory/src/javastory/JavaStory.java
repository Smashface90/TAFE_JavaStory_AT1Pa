/*
AT2 Part a.
Script written by Evan Waters M124566
Version 0.1
Start Date: 15/2/23

Devnotes: Will admit I got a little carried away. Decided to look up a few
          lines of code and then tried to break down and explain what they do
*/
package javastory;

import java.util.Random;
import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class JavaStory {
    
    //sets new decimal format to have the first 2 decimal places shown ONLY.
    //Has to be set in final because it will not be changed and is in fact changing to a whole new methos of displaying decimal
    private static final DecimalFormat df = new DecimalFormat("0.00");
    
    public static void main(String[] args) {
    
        //sets the rounding of decimal palaces to the nearest 1 up
        df.setRoundingMode(RoundingMode.DOWN);
        //name for scanner. The input needed for writing
        Scanner scan = new Scanner(System.in);
        
        //-------------------------------
        
        //players name
        String playerName;
        //race output
        String playerRace;
        //string Class
        String playerClass;
        
        //---------------------------
        
        //number to trigger string
        int raceNumber;
        //number to trigger string in if statement
        int classNumber;
        //race health, number depends on what class has been chosen
        //race and class hp have to declare their ints because theyre being added later in formula to make player health
        int raceHealth =0;
        //class health, number depends on what class has been chosen
        int classHealth =0;
        //player health. tied to race and class
        int playerHealth;
        //stam tied to health *2
        int playerStam;
        //str is stam /3
        int playerStr;
        //luck is based on the weapon damage double *2. it will however chopp the decimal place
        int playerLuck;
        //charisma is str (which is health + stam) + luck (which is weapon damaga *2) + 2)
        int playerCha;
        
        //---------------------------
        
        //to randomise 
        double randomNumber = new Random().nextDouble();
        //min of weap double
        double minRange = 1;
        //max
        double maxRange = 6;
        //output double number
        double weaponStat;
        
        //Intro print with name question
        System.out.println("AT2 Part a. M124566");
        System.out.println("----------------------------------------------");
        System.out.println("");
        System.out.println("Welcome to the EvanRPG");
        System.out.println("Character Creator");
        System.out.println("");
        System.out.println("What is your character's name? ");
        
        //player name input
        playerName = scan.nextLine();
        
        System.out.println("What is your character's race?");
        System.out.println("\n (1) Human \n (2) Wood Elf \n (3) Orc \n (4) Fae");
        
        raceNumber = scan.nextInt();
        
        //if statement to select what your int input is to then trigger the string output
        if(raceNumber ==1)
        {
            playerRace = "Human";
            raceHealth = 4;
        }
        else if(raceNumber ==2)
        {
            playerRace = "Wood Elf";
            raceHealth = 6;
        }
        else if(raceNumber ==3)
        {
            playerRace = "Orc";
            raceHealth = 10;
        }
        else if(raceNumber ==4)
        {
            playerRace = "Fae";
            raceHealth = 2;
        }
        else
        {
            playerRace = "Invalid Race";
        }
        
        System.out.println("What is your character's class?");
        System.out.println("\n (1) Warrior \n (2) Mage \n (3) Cleric \n (4) Druid");
        
        classNumber = scan.nextInt();
        
        //if statement to select what your int input is to then trigger the string output
        if(classNumber ==1)
        {
            playerClass = "Warrior";
            classHealth = 8;
        }
        else if(classNumber ==2)
        {
            playerClass = "Mage";
            classHealth = 2;
        }
        else if(classNumber ==3)
        {
            playerClass = "Cleric";
            classHealth = 4;
        }
        else if(classNumber ==4)
        {
            playerClass = "Druid";
            classHealth = 6;
        }
        else
        {
            playerClass = "Invalid Class";
        }
        
        playerHealth = raceHealth + classHealth;
        //player stamina = the health int *2
        playerStam = playerHealth *2;
        //player Str is the players stam /3
        playerStr = playerStam /3;  
        //weapon dmg
        weaponStat = minRange + (randomNumber * (maxRange - minRange));
        //playerLuck = weaponStat *2
        playerLuck = (int) (weaponStat *2);
        playerCha = playerStr + playerLuck + 2;
        
        
        
        System.out.println("");
        System.out.println("-----------------------------------------");
        System.out.println("Character Sheet:");
        System.out.println("-----------------------------------------");
        System.out.println("");
        System.out.println(playerName + ", the " + playerRace + " " + playerClass);
        System.out.println(" ");
        System.out.println("Health: " + playerHealth);
        System.out.println("Stamina: " + playerStam);
        System.out.println("Strength: " + playerStr);
        System.out.println("Charisma: " + playerCha);
        System.out.println("Luck: " + playerLuck);
        System.out.println(" ");        
        System.out.println("Weapon Damage: " + df.format(weaponStat));
        
        
        
        
        
        
    }
    
}

package PROJECTS;

import java.util.Scanner;
class Guesser{
    int GuesserNum;
    public int GuesserNumb(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Give the Number you want to be Guessed : ");
        GuesserNum = sc.nextInt();
        return GuesserNum;
    }
}
class Player {
    int PlayerNum;
    public int playerNumb() {
        Scanner sc = new Scanner(System.in);
        PlayerNum = sc.nextInt();
        return PlayerNum;
    }
}
class Empire
{
    int Guessernum;
    int Playernum1;
    int Playernum2;
    int Playernum3;

    public void collectNumFromGuesser() {
        Guesser Gu = new Guesser();
        Guessernum = Gu.GuesserNumb();
    }
    public void collectNumFromPlayer() {
        System.out.println("Guess the Number Player 1 : ");
        Player p1 = new Player();
        Playernum1 = p1.playerNumb();

        System.out.println("Guess the Number Player 2 : ");
        Player p2 = new Player();
        Playernum2 = p2.playerNumb();

        System.out.println("Guess the Number Player 3 : ");
        Player p3 = new Player();
        Playernum3 = p3.playerNumb();
    }
    public void compare(){
        if(Guessernum==Playernum1){
            if( Guessernum==Playernum2 && Guessernum==Playernum3 ){
                System.out.println("ALL PLAYER WON THE GAME");
            }
            else if ( Guessernum==Playernum2 ){
                System.out.println("PLAYER 1 & 2 GUESS IT RIGHT");
            }
            else if ( Guessernum==Playernum3 ){
                System.out.println("PLAYER 1 & 3 GUESS IT RIGHT");
            }
            else {
                System.out.println("ONLY PLAYER 1 GUESS IT RIGHT");
            }
        }
        else  if( Guessernum==Playernum2 ){
            if(  Guessernum==Playernum3 ) {
                System.out.println("PLAYER 2 & 3 GUESS IT RIGHT");
            }
            else {
                System.out.println("ONLY PLAYER 2 GUESS IT RIGHT");
            }
        } else if ( Guessernum==Playernum3 ){
            System.out.println("ONLY PLAYER 3 GUESS IT RIGHT");
        }
        else {
            System.out.println("NO ONE GUESS IT RiGHT");
        }
    }
}

public class Gusser_Game {
    public static void main(String[] args) {
        System.out.println("------Game Start------");
        Empire em = new Empire();
        em.collectNumFromGuesser();
        em.collectNumFromPlayer();
        em.compare();
        System.out.println("------Game over------");

    }
}

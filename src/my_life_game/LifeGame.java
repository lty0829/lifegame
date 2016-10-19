package my_life_game;

import javax.swing.JFrame;




public class LifeGame extends JFrame{
	LifeGame(){  
        this.setSize(630,600);  
        this.setTitle("…˙√¸”Œœ∑");  
        this.add(new World());  
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        this.setLocationRelativeTo(null);  
        this.setResizable(false);  
    }  
	
	 public static void main(String[] args){
		LifeGame game = new LifeGame();  
        game.setVisible(true);  
	}

}

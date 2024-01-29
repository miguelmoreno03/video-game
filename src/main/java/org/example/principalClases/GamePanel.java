package org.example.principalClases;
import org.example.inputs.KeyBoardInputs;
import org.example.inputs.MouseInputs;
import javax.swing.*;
import java.awt.*;
import static org.example.principalClases.Game.GAME_WIDTH;
import static org.example.principalClases.Game.GAME_HEIGHT;

public class GamePanel extends JPanel {
    private MouseInputs mouseInputs;
    private Game game;
    public GamePanel(Game game){
      mouseInputs=new MouseInputs(this);
      this.game=game;
      setPanelSize();
      addKeyListener(new KeyBoardInputs(this));
      addMouseListener(mouseInputs);
      addMouseMotionListener(mouseInputs);
    }

    private void setPanelSize() {
        Dimension size = new Dimension(GAME_WIDTH,GAME_HEIGHT);
        setPreferredSize(size);
        System.out.println("size : " + GAME_WIDTH + ": "+GAME_HEIGHT);
    }
    public void updateGame() {

    }
    public void paintComponent(Graphics g ){
     super.paintComponent(g);
     game.render(g);
    }
   public Game getGame(){
        return game;
   }


}

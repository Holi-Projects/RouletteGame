package model.enumeration;

import model.interfaces.Player;
import model.interfaces.Slot;

/**
 * Provided enum type for Further Programming representing a type of Bet<br>
 * See inline comments for where you need to provide additional code
 * 
 * @author Caspar Ryan
 * 
 */
public enum BetType
{
   RED
   {
      @Override
      public void applyWinLoss(Player player, Slot winSlot)
      {
         // TODO implementation
    	 if(winSlot.getColor()==Color.RED) {
    		 if(player.getBetType() == RED) {
    			 player.setPoints(player.getPoints() + player.getBet());
    		 }
    	 }
    	 else {
			 player.setPoints(player.getPoints() - player.getBet());
		 }
      }
   },
	BLACK
	   {
	      @Override
	      public void applyWinLoss(Player player, Slot winSlot)
	      {
	         // TODO implementation
	    	 if(winSlot.getColor()==Color.BLACK) {
	    		 if(player.getBetType() == BLACK) {
	    			 player.setPoints(player.getPoints() + player.getBet());
	    		 }
	    	 }
	    	 else {
    			 player.setPoints(player.getPoints() - player.getBet());
    		 }
	      }
	   },
	   GREEN0
	   {
	      @Override
	      public void applyWinLoss(Player player, Slot winSlot)
	      {
	         // TODO implementation
	    	 if(winSlot.getColor() == Color.GREEN0) {
	    		 if(player.getBetType() == GREEN0) {
	    			 player.setPoints(player.getBet()*18);
	    		 }
	    	 }
	    	 else {
    			 player.setPoints(player.getPoints() - player.getBet());
    		 }
	      }
	   },
	   GREEN00
	   {
	      @Override
	      public void applyWinLoss(Player player, Slot winSlot)
	      {
	         // TODO implementation
	    	 if(winSlot.getColor() == Color.GREEN00 ) {
	    		 if(player.getBetType() == GREEN00) {
	    			 player.setPoints(player.getBet()*18);
	    		 }
	    		 
	    	 }
	    	 else {
    			 player.setPoints(player.getPoints() - player.getBet());
    		 }
	      }
	   };
   
   // TODO finish this class with other enum constants
 
   /**
    * This method is to be overridden for each bet type<br>
    * see assignment specification for betting odds and how win/loss is applied
    * 
    * @param player - the player to apply the win/loss points balance adjustment
    * @param winSlot - the winning slot the ball landed on
    */
   public abstract void applyWinLoss(Player player, Slot winSlot);
}
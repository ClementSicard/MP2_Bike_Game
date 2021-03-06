package ch.epfl.cs107.play.game.actor.general;

import ch.epfl.cs107.play.game.actor.Actor;
import ch.epfl.cs107.play.game.actor.ActorGame;
import ch.epfl.cs107.play.game.actor.ImageGraphics;
import ch.epfl.cs107.play.window.Canvas;
import ch.epfl.cs107.play.math.BasicContactListener;
import ch.epfl.cs107.play.math.Vector;


public class Coin extends Trigger implements Actor {

	private ImageGraphics graphics;
	private BasicContactListener listener;
	
	public Coin(ActorGame game, boolean fixed, Vector position, float width, float height) {
		super(game, fixed, position, width, height);
		graphics = new ImageGraphics("coin.gold.png", width, height);
		graphics.setParent(this); 
		getOwner().addActor(this);
		listener = new BasicContactListener();		
		this.getEntity().addContactListener(listener);
	}
	
	public void destroy() {
		getEntity().destroy();
		getOwner().removeActor(this);
	}

	@Override
	public void draw(Canvas canvas) {
		graphics.draw(canvas);
	}
}
	

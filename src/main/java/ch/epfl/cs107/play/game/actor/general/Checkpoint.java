package ch.epfl.cs107.play.game.actor.general;

import ch.epfl.cs107.play.game.actor.Actor;
import ch.epfl.cs107.play.game.actor.ActorGame;
import ch.epfl.cs107.play.math.BasicContactListener;
import ch.epfl.cs107.play.game.actor.ImageGraphics;
import ch.epfl.cs107.play.window.Canvas;
import ch.epfl.cs107.play.math.Vector;


public class Checkpoint extends Trigger implements Actor {

	private ImageGraphics graphics;
	private BasicContactListener listener;
	
	public Checkpoint(ActorGame game, boolean fixed, Vector position, String name) {
		
		super(game, fixed, position, 1.f, 1.f);
		graphics = new ImageGraphics("flag.red.png", 1.f, 1.f);
		graphics.setParent(this); 
		getOwner().addActor(this);
		listener = new BasicContactListener();		
		this.getEntity().addContactListener(listener);
	}
	
	
	@Override
	public Vector getPosition() {
		return getEntity().getPosition();
	}
	
	
	@Override
	public void draw(Canvas canvas) {
		graphics.draw(canvas);
	}
	
	
	public void destroy() {
		getEntity().destroy();
	}
}

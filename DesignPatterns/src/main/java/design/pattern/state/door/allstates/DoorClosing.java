package design.pattern.state.door.allstates;

import design.pattern.state.door.Door2;
import design.pattern.state.door.DoorState;

public class DoorClosing extends DoorState {

	public DoorClosing(Door2 door) {
		super(door);
	}

	@Override
	public void touch() {
		door.setState(door.OPENING);
	}
	
	public void compete(){
		door.setState(door.CLOSED);
	}

}

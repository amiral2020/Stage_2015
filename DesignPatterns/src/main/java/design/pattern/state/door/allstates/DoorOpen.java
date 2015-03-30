package design.pattern.state.door.allstates;

import design.pattern.state.door.Door2;
import design.pattern.state.door.DoorState;

public class DoorOpen extends DoorState {

	public DoorOpen(Door2 door) {
		super(door);
	}

	public void touch() {
		door.setState(door.STAYOPEN);
	}

	public void timeout() {
		door.setState(door.CLOSING);
	}
	
	
}

package design.pattern.state.door;

import java.util.Observable;

import design.pattern.state.door.allstates.DoorClosed;
import design.pattern.state.door.allstates.DoorClosing;
import design.pattern.state.door.allstates.DoorOpen;
import design.pattern.state.door.allstates.DoorOpening;
import design.pattern.state.door.allstates.DoorStayOpen;

public class Door2 extends Observable {
	
	public final DoorState CLOSED = new DoorClosed(this);
	public final DoorState CLOSING = new DoorClosing(this);
	public final DoorState OPEN = new DoorOpen(this);
	public final DoorState OPENING = new DoorOpening(this);
	public final DoorState STAYOPEN = new DoorStayOpen(this);
	
	private DoorState state = CLOSED;
	
	
	public void touch() {
		state.touch();
	}

	public void complete() {
		state.complete();
	}

	public void timeout() {
		state.timeout();
	}

	public String status() {
		return state.status();
	}

	public void setState(DoorState state) {
		this.state = state;
		setChanged();
		notifyObservers();
	}
	
	
	public static void main(String[] args) {
		Door2 door2 = new Door2();
		System.out.println(door2.status());
		door2.touch();
		System.out.println(door2.status());
		door2.touch();
		System.out.println(door2.status());
	}
}

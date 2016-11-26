package event;

public abstract class Event implements IEvent{
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return getClass().toString();
	}
}

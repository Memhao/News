package event;

public abstract class Event implements IEvent{
	private Type type;
	public Event(Type type)
	{
		this.type = type;
	}
	@Override
	public Type getType() {
		// TODO Auto-generated method stub
		return type;
	}
}

package event;

public interface EventHandler<T extends Event> {
	void handleEvent( T event, Filter f );
}

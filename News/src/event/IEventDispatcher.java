package event;

public interface IEventDispatcher<T extends IEvent> {
	void registerFilter(String eventType,IFilter<? extends IEvent> filter);
	void dispatch(T event);
}

package event;

public interface IEventDispatcher<T extends IEvent> {
	void registerFilter(Type eventType,IFilter<? extends IEvent> filter);
	void dispatch(T event);
}

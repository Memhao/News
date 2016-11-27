package event;

public interface IEventDispatcher<T extends IEvent> {
	void registerFilter(Class<? extends IEvent> event,IFilter<? extends IEvent> filter);
	void dispatch(T event);
}

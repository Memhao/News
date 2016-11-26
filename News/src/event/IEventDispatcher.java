package event;

public interface IEventDispatcher<T extends IEvent> {
	void registerFilter(String newsType,IFilter<? extends IEvent> filter);
	void dispatch(T news);
}

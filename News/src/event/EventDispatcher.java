package event;

import java.util.HashMap;
import java.util.Map;

public class EventDispatcher implements IEventDispatcher<IEvent> {

	private Map<Class<? extends IEvent>, EventHandler> events;

	
	public  EventDispatcher() {
		// TODO Auto-generated constructor stub
		events = new HashMap< Class<? extends IEvent>,EventHandler>();
	}
	
	@Override
	public void registerFilter(Class<? extends IEvent> event, IFilter<? extends IEvent> filter) {
		// TODO Auto-generated method stub
		events.put(event, (EventHandler)filter);
	}

	@Override
	public void dispatch(IEvent event) {
		// TODO Auto-generated method stub
		events.get(event).dispatch(event);
	}

}

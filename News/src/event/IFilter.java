package event;
/**
 * 
 * @author xander
 * 
 * @param <T>
 * 
 * every filter should be responsible for a specific news (aka listener)
 */
public interface IFilter <T extends IEvent> {
	void dispatch(T event);
}

package event;
/**
 * 
 * @author xander
 * 
 * @param <T>
 * 
 * every filter should be responsible for a specific news
 */
public interface IFilter <T extends IEvent> {
	void dispatch(T news);
}

package event;
/**
 * 
 * @author xander
 * Interface for getting each kind of news ( sport news , business news etc...) each news should be associated 
 * with its handler
 */
public interface IEvent {
	  public Type  getType();
}

package contract;


/**
 * @author Cindy Moukam
 *
 */
public interface IBoulderDashController {
	
	/**
	 * @throws InterruptedException
	 */
	void play();
	
	/**
	 * @return this
	 */
	IOrderPerformer getOrderPerformer();
}

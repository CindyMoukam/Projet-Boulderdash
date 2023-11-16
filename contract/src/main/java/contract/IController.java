package contract;


/**
 * The interface IController
 * @author Wilfried
 *
 */
public interface IController {

    /**
     * @throws InterruptedException
     */
    void play();

    /**
     * @return this
     */
    IOrderPerformer getOrderPerformer();
}

package contract;

import java.io.IOException;

/**
 * The interface IOrderPerformer
 * @author Wilfried
 *
 */
public interface IOrderPerformer {

    /**
     * @param userOrder
     * @throws IOException
     */
    void orderPerform(UserOrder userOrder) throws IOException;

}

package contract;

import entity.IMap;
import entity.mobile.IMobile;


/**
 * The Interface IModel.
 *
 * @author Wilfired
 */
public interface IModel {

    IMap getMap();

    IMobile getMyPlayer();

}
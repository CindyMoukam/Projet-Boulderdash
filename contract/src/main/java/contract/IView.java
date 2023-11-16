package contract;

import fr.exia.showboard.BoardFrame;

/**
 * The Interface IView.
 *
 * @author Wilfried
 */
public interface IView {

    void displayMessage(final String message);

    void followMyPlayer();

    void updateView();

    BoardFrame getBoardFrame();
}

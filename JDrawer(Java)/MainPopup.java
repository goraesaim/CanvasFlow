import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MainPopup extends Popup
{
	private static final long serialVersionUID = -5296349184547363210L;
	MainPopup(DrawerView view) {
		super("±×¸²");

		JMenuItem pointItem = new JMenuItem(view.getPointAction());
		popupPtr.add(pointItem);

		JMenuItem boxItem = new JMenuItem(view.getBoxAction());
		popupPtr.add(boxItem);

		JMenuItem lineItem = new JMenuItem(view.getLineAction());
		popupPtr.add(lineItem);

		JMenuItem circleItem = new JMenuItem(view.getCircleAction());
		popupPtr.add(circleItem);

		JMenuItem tvItem = new JMenuItem(view.getTVAction());
		popupPtr.add(tvItem);

		JMenuItem kiteItem = new JMenuItem(view.getKiteAction());
		popupPtr.add(kiteItem);

		JMenuItem textItem = new JMenuItem(view.getTextAction());
		popupPtr.add(textItem);
	}
}

import java.util.List;
import java.util.Map;

import net.dv8tion.jda.core.entities.User;
import net.dv8tion.jda.core.events.Event;
import net.dv8tion.jda.core.events.ReadyEvent;
import net.dv8tion.jda.core.hooks.EventListener;

public class PotatoBank implements EventListener {

	@SuppressWarnings("null")
	@Override
	public void onEvent(Event event) {
		if(event instanceof ReadyEvent) {
			List<User> abc = event.getJDA().getUsers();
			String list = abc.toString();
			String listTemp, userID = "";

			for(int i = 0; i < list.length(); i++) {
				if(list.substring(i, i+1).equals("(")) {
					listTemp = list.substring(i+1, list.length());
					userID = listTemp.substring(0, 18);
					userID = "";
				}
			}
		}
	}
}

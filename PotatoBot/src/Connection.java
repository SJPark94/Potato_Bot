import javax.security.auth.login.LoginException;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.events.Event;
import net.dv8tion.jda.core.events.ReadyEvent;
import net.dv8tion.jda.core.exceptions.RateLimitedException;
import net.dv8tion.jda.core.hooks.EventListener;

public class Connection {
	public static void main(String args[])
	{

		try {
			JDA jda = new JDABuilder(AccountType.BOT)
					.setToken(Constants.discordToken)
					.addEventListener(new ReadCommand())
					.addEventListener(new ServerEvents())
					.addEventListener(new PotatoBank())
					.buildBlocking();
		} catch (LoginException | IllegalArgumentException | InterruptedException | RateLimitedException e) {
			e.printStackTrace();
		}
	}
}

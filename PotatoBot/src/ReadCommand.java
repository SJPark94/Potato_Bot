import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class ReadCommand extends ListenerAdapter{
	
	public void onMessageReceived(MessageReceivedEvent event) {

		if(event.getChannel().getName().equals(Constants.BOT_CHANNEL)) {
			String userCommand = event.getMessage().getContent();
			String user = "`**" + event.getAuthor().getName() + "**`";
			String response = null;

			if(!userCommand.startsWith("!")) return;

			switch(userCommand) {
			case "!hello":
				response = user + " You have called me to greet you but I will insult you instead. Faggot.";
				event.getTextChannel().sendMessage(response).queue();
				break;
			case "!help":
				response = "```I am currently being coded and more features will be added later. \n\n"
						+ "Type !hello to receive a rude greeting. \n"
						+ "Type !ping for basic pong response. \n"
						+ "Type !pbank to access your potato bank account. WIP."
						+ "```";
				event.getTextChannel().sendMessage(response).queue();
				break;
			case "!ping":
				response = "``` PONG ```";
				event.getTextChannel().sendMessage(response).queue();
				break;
			case "!pbank":
				response = user + ", you have **0** " + ":potato:'s";
				event.getTextChannel().sendMessage(response).queue();
				break;
			case "!count":
				int members = event.getGuild().getMembers().size();
				response = "We have a total amount of " + members + " members in this server!";
				event.getTextChannel().sendMessage(response).queue();
				break;
			}
			if(userCommand.startsWith("!userID")) {
				String userID = event.getMessage().getMentionedUsers().get(0).getId();
				response = userID;
				event.getTextChannel().sendMessage(response).queue();
			}
		}
	}
}

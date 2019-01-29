import net.dv8tion.jda.core.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class ServerEvents extends ListenerAdapter{
	public static String newUser, greet;
	public final String channelID = "327780647940915201";
	public static int members;

	public void onGuildMemberJoin(GuildMemberJoinEvent event) {
		
		String userID = event.getMember().getUser().getId();

		newUser = event.getGuild().getMemberById(userID).getUser().getAsMention().toString();
		greet = "Hey! Welcome to Potatoville, " + newUser + "!"
				+ " Type !help for commands available on the server!";
		
		event.getGuild().getTextChannelById(channelID).sendMessage(greet).queue();
	}

}

import java.util.*;

//The force users are struggling to remember which side is the different forceUsers
//from because they switch them too often. So you are tasked to create
//a web application to manage their profiles.

//You will receive several input lines in one of the following formats:

//"{force_side} | {force_user}"
//"{force_user} -> {force_side}"
//The "force_user" and "force_side" are strings containing any character.
//If you receive "force_side | force_user":

//If there is no such force user and no such force side ->
//create a new force side and add the force user to the corresponding side.

//Only if there is no such force user on any force side ->
//add the force user to the corresponding side.

//If there is such force user already ->
//skip the command and continue to the next operation.

//If you receive a "force_user -> force_side":

//If there is such force user already -> change their side.

//If there is no such force user on any force side ->
//add the force user to the corresponding force side.

//If there is no such force user and no such force side ->
//create a new force side and add the force user to the corresponding side

//Then you should print on the console: "{force_user} joins the {force_side} side!".

//You should end your program when you receive the command "Lumpawaroo".
//At that point, you should print each force side.
//For each side, print the force users.

//In case there are no force users on a side, you shouldn't print the side information.

//Input / Constraints

//The input comes in the form of commands in one of the formats specified above.

//The input ends when you receive the command "Lumpawaroo".

//Output

//As output for each force side, you must print all the force users.

//The output format is:
//"Side: {forceSide}, Members: {forceUsers.Count}
//! {forceUser}
//! {forceUser}
//! {forceUser}"
//In case there are NO forceUsers, don't print this side.

//Example

//Input:
//Light | Peter
//Dark | Kim
//Lumpawaroo

//Output:
//Side: Light, Members: 1
//! Peter
//Side: Dark, Members: 1 ! Kim


public class ForceBook {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> teams = new LinkedHashMap<>();

        while (!input.equals("Lumpawaroo")) {

            if (input.contains("|")) {

                String teamName = input.split(" \\| ")[0];
                String playerName = input.split(" \\| ")[1];

                if (!teams.containsKey(teamName)) {
                    teams.put(teamName, new ArrayList<>());
                }

                boolean isThisPlayerPartOfAnotherTeam = false;
                for (List<String> team : teams.values()) {
                    if (team.contains(playerName)) {
                        isThisPlayerPartOfAnotherTeam = true;
                        break;
                    }
                }


                if (!isThisPlayerPartOfAnotherTeam) {
                    teams.get(teamName).add(playerName);
                }
            } else if (input.contains("->")) {

                String playerName = input.split(" -> ")[0];
                String teamName = input.split(" -> ")[1];

                for (List<String> team : teams.values()) {
                    team.remove(playerName);
                }

                if (teams.containsKey(teamName)) {
                    teams.get(teamName).add(playerName);
                } else {
                    teams.put(teamName, new ArrayList<>());
                    teams.get(teamName).add(playerName);
                }
                System.out.printf("%s joins the %s side!%n", playerName, teamName);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : teams.entrySet()) {
            String teamName = entry.getKey();
            List<String> players = entry.getValue();

            if (players.size() > 0) {
                System.out.println("Side: " + teamName + ", Members: " + players.size());
                players.forEach(player -> System.out.println("! " + player));
            }
        }
    }
}

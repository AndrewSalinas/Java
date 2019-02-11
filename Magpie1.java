/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie1
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Why henlo der.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.contains("no"))
		{
			response = "Why so negative?";
		}
		else if (statement.contains("mother")
				|| statement.contains("father")
				|| statement.contains("sister")
				|| statement.contains("brother")
				|| statement.contains("Father")
				|| statement.contains("Sister")
				|| statement.contains("Mother")
				|| statement.contains("Brother"))
		{
			response = "Tell me more about your family.";
		}

        else if (statement.contains("cat")||statement.contains("dog")){
            response = "Dogs are way better than cats...";
        }

        else if (statement.contains("pussy")||statement.contains("bitch")||statement.contains("nigga")
                ||statement.contains("ass")||statement.contains("gay")||statement.contains("fuck")) {
			response = "No cursing on my Christian Magpie!!";
		}
        else if (statement.contains("tv")){
				response = "What's your favorite TV show?";
			}

			else if (statement.contains("henlo")||statement.contains("Henlo")){
			response = "Ah, I see you are a man of culture as well...";
		}

				else if (statement.contains("ty")||statement.contains("bae")){
			response = "Np bb";

		}
		else {
			response = getRandomResponse();
		}


		return response;

	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 5;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "The ting goes skkrrraaaaaaaaa!!!";
		}
		else if (whichResponse == 1)
		{
			response = "I see said the blind man.";
		}
		else if (whichResponse == 2)
		{
			response = "Why so blue panda bear?";
		}
		else if (whichResponse == 3)
		{
			response = "Sounds Dank.";
		}
		else if (whichResponse == 4)
		{
			response = "Wot n' illegal immigration.";
		}

		return response;
	}
}


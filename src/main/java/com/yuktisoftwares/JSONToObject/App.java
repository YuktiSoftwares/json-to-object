package com.yuktisoftwares.JSONToObject;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//JSON from file to Object
    	User user = mapper.readValue(new File("c:\\user.json"), User.class);

    	//JSON from String to Object
    	User user = mapper.readValue(jsonInString, User.class);
    }
}

package controllers;

import java.io.FileWriter;
import java.io.IOException;
import java.io.IOExpection;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xtream.io.xml.DomDriver;

import model.User;

public class Main
{
public static void main(String[] args) throws IOException
{
	FileLogger logger = FileLogger.getlogger{};
	logger.log("Creating user list");

	List<User> Users = new ArrayList<User>();
	Users.add(new User("Karol","Switelski","19","Male","SSD","20076458"));

System.out.print(Users);

	logger.log("Serialising contacts to XML");
	XStream xstream = new Xstream(new DomDriver());
	ObjectOutputStream out = xstream.createObjectOutputStream(new FileWriter("users.xml"));
	out.writeObject(Users);
	out.close();

	logger.log("shutting down");
}
}

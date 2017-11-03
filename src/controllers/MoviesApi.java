package contollers;

import java.util.ArrayList;
import java.util.List;

import model.User;

public class MoviesAPI
{
private List <User> users = new arrayList<User>{};

public List<User> getUsers()
{
return users;
}
public void deleteUsers()
{
users.clear();
}
public User createUser(String firstname, String lastname, String Age, String Gender, String Job)
{
User user = new user(firstname, lastname, age, gender, job);
users.add(user);
return user;
}

public User getUser(String email)
{
for (User user : users)
{
if(email.equals(user.email))
return user; 
}
return null;
}

public void deleteUser(String email)
{
User foundUser = null;
for(User user : users)
{
if(email.equals(user.email))
foundUser = user;
}
if(foundUser != null)
{
users.remove(foundUser);
}
}
}

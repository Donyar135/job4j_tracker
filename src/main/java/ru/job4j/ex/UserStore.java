package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User user : users) {
            if (user.getUsername().equals(login)) {
                return user;
            }
        }
        throw new UserNotFoundException("User Not Found Exception");
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user == null) {
            throw new UserInvalidException("User is null");
        }

        if (user.getUsername().length() < 3) {
            throw new UserInvalidException("User Invalid: Username too short");
        }

        if (!user.isValid()) {
            throw new UserInvalidException("User Invalid: User is not valid");
        }
        return true;
    }

    public static void main(String[] args) {
        try {
            User[] users = {
                    new User("Petr Arsentev", true)
            };
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException in) {
            System.out.println("User Invalid Exception");
            in.printStackTrace();
        } catch (UserNotFoundException nf) {
            System.out.println("User Not Found Exception");
            nf.printStackTrace();
        }
    }
}
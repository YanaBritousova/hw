package Task6;
//Если login не
//        соответствует этим требованиям, необходимо выбросить WrongLoginException. Длина
//        password должна быть меньше 20 символов, не должен содержать пробелом и должен
//        содержать хотя бы одну цифру. Также password и confirmPassword должны быть равны.
//        Если password не соответствует этим требованиям, необходимо выбросить
//        WrongPasswordException.
public class Auth {
    public static boolean auth(String login, String password, String confirmPassword) throws WrongPasswordException, WrongLoginException {
        boolean isOK = false;
        if (login==null || login.length()>=20 || login.contains(" ")) {
            throw new WrongLoginException("Неправильный логин!");
        }
        else if (password==null || password.length()>=20 || password.contains(" ") || !password.matches(".*[0-9].*") ){
            throw new WrongPasswordException("Неверный пароль!");
        }
        else if (!password.equals(confirmPassword)){
            throw new WrongPasswordException("Пароли не совпадают!");
        }
        isOK=true;
        return isOK;
    }
    public static void main(String[] args){
        try {
            System.out.println(auth("login","pass0","pass0"));
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}

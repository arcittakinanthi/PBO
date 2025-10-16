import java.util.HashMap;

public class userSistem {
    private HashMap<String, user> users = new HashMap<>();
    private user userLogin;

    public void register(String email, String fullName, String password) throws BadRequestException, ConflictException {
        if (password.length() < 8) {
            throw new BadRequestException("Password kurang dari 8 karakter!");
        }
        if (users.containsKey(email)) {
            throw new ConflictException("Email " + email + " sudah digunakan!");
        }
        users.put(email, new user(email, fullName, password));
        System.out.println("Register berhasil!");
    }

    public void login(String email, String password) throws ConflictException, UnAuthorizedException {
        if (!users.containsKey(email)) {
            throw new ConflictException("Email tidak ditemukan!");
        }
        user u = users.get(email);
        if (!u.getPassword().equals(password)) {
            throw new UnAuthorizedException("Password salah!");
        }
        userLogin = u;
        System.out.println("Login berhasil");
    }

    public void tampilProfil() throws UnAuthorizedException {
        if (userLogin == null) {
            throw new UnAuthorizedException("Kamu belum login!");
        }
        System.out.println("\nBerikut profile kamu : ");
        System.out.println("Email : " + userLogin.getEmail());
        System.out.println("Fullname : " + userLogin.getFullName());
    }

    public void logout() throws UnAuthorizedException {
        if (userLogin == null) {
            throw new UnAuthorizedException("Belum login!");
        }
        System.out.println("Logout berhasil. Sampai jumpa, " + userLogin.getFullName() + "!");
        userLogin = null;
    }
}

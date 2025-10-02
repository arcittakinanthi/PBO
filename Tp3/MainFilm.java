public class MainFilm {
    public static void main(String[] args) {
        Film film1 = new Film("Mr. & Mrs. Smith", "Amerika Serikat", 120, 2005);
        film1.tambahAktor("John Smiith");
        film1.tambahAktor("Jane Smith");

        Film film2 = new Film("Oppenheimer", "Amerika Serikat", 180, 2023);
        film2.tambahAktor("Cillian Murphy");
        film2.tambahAktor("Emily Blunt");
        film2.tambahAktor("Matt Damon");

        System.out.println("Sebelum hapus aktor: ");
        film1.tampilkanDataFilm();
        film2.tampilkanDataFilm();

        film1.hapusAktor("John Smiith");
        System.out.println("Sesudah hapus aktor: ");
        
        film1.tampilkanDataFilm();
        film2.tampilkanDataFilm();
    }
}

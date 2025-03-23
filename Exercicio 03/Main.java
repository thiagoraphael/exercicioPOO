public class Main {
    public static void main(String[] args) {

        LivroAutoAjuda autoAjuda = new LivroAutoAjuda(2020, 300);
        LivroRomance romance = new LivroRomance(2018, 250);
        LivroFiccao ficcao = new LivroFiccao(2021, 400);
        Gibi gibi = new Gibi(2015, 50);

        Rock rock = new Rock(1990, 4.5);
        MPB mpb = new MPB(1985, 3.2);

        FilmeComedia comedia = new FilmeComedia(2010);
        FilmeFiccao ficcaoFilme = new FilmeFiccao(2022);


        autoAjuda.detalhes();
        romance.detalhes();
        ficcao.detalhes();
        gibi.detalhes();
        rock.detalhes();
        mpb.detalhes();
        comedia.detalhes();
        ficcaoFilme.detalhes();
    }
}
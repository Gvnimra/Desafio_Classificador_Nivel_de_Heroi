import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Heroi {
    String nome;
    int xp;

    public Heroi(String nome, int xp) {
        this.nome = nome;
        this.xp = xp;
    }
}

public class Main {
    public static List<Heroi> herois = new ArrayList<>();

    public static String determinarNivel(int xp) {
        if (xp < 1000) {
            return "Ferro";
        } else if (xp <= 2000) {
            return "Bronze";
        } else if (xp <= 5000) {
            return "Prata";
        } else if (xp <= 7000) {
            return "Ouro";
        } else if (xp <= 8000) {
            return "Platina";
        } else if (xp <= 9000) {
            return "Ascendente";
        } else if (xp <= 10000) {
            return "Imortal";
        } else {
            return "Radiante";
        }
    }

    public static void consultarNivel() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do herói: ");
        String nomeHeroi = scanner.nextLine().trim(); // Remover espaços em branco

        System.out.print("Digite o XP do herói: ");
        String xpInput = scanner.nextLine().trim(); // Remover espaços em branco
        int xpHeroi;

        try {
            xpHeroi = Integer.parseInt(xpInput);
        } catch (NumberFormatException e) {
            System.out.println("Por favor, insira um valor numérico para XP.");
            return;
        }

        String nivel = determinarNivel(xpHeroi);

        herois.add(new Heroi(nomeHeroi, xpHeroi));

        System.out.println("O Herói de nome " + nomeHeroi + " está no nível de " + nivel);
    }

    public static void main(String[] args) {
        consultarNivel();
    }
}

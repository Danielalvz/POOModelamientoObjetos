import java.util.ArrayList;
import java.util.List;

public class Planetas {
    public static List<CuerpoCeleste> listarSistemaPlanetario() {
        List<CuerpoCeleste> sistema = new ArrayList<>();
        sistema.add(mercurio);
        sistema.add(venus);
        sistema.add(tierra);
        sistema.add(marte);
        sistema.add(jupiter);
        sistema.add(saturno);
        sistema.add(urano);
        sistema.add(neptuno);
        sistema.add(ceres);
        sistema.add(makemake);
        sistema.add(haumea);
        sistema.add(eris);
        sistema.add(pluton);
        sistema.add(sol);

        return sistema;
    }
    static CuerpoCeleste mercurio = new CuerpoCeleste(
            3.30e23,
            5.4,
            4879,
            57910,
            1,
            "Mercurio"
    );

    static CuerpoCeleste venus = new CuerpoCeleste(
            4.87e24,
            5.2,
            12104,
            108200,
            2,
            "Venus"
    );

    static CuerpoCeleste tierra = new CuerpoCeleste(
            5.97e24,
            5.5,
            12756,
            149600,
            3,
            "Tierra"
    );

    static CuerpoCeleste marte = new CuerpoCeleste(
            6.42e23,
            3.9,
            6792,
            227940,
            4,
            "Marte"
    );

    static CuerpoCeleste jupiter = new CuerpoCeleste(
            1.90e27,
            1.3,
            142984,
            778330,
            5,
            "Jupiter"
    );

    static CuerpoCeleste saturno = new CuerpoCeleste(
            5.68e26,
            0.7,
            120436,
            1429400,
            6,
            "Saturno"
    );

    static CuerpoCeleste urano = new CuerpoCeleste(
            8.68e25,
            1.3,
            51118,
            2879990,
            7,
            "Urano"
    );

    static CuerpoCeleste neptuno = new CuerpoCeleste(
            1.02e26,
            1.6,
            49528,
            4504300,
            8,
            "Neptuno"
    );

    //Planetas enanos:
    static CuerpoCeleste ceres = new CuerpoCeleste(
            9.38e20,
            2.09,
            946,
            413690250,
            9,
            "Ceres"
    );
    static CuerpoCeleste makemake = new CuerpoCeleste(
            4.4e21,
            1.7,
            6783345606.0,
            6783345606.0,
            10,
            "Makemake"
    );
    static CuerpoCeleste haumea = new CuerpoCeleste(
            4e21,
            2.6,
            1632,
            6432011461.0,
            11,
            "Haumea"
    );
    static CuerpoCeleste eris = new CuerpoCeleste(
            1.66e22,
            2.52,
            2326,
            10180122852.0,
            12,
            "Eris"
    );
    static CuerpoCeleste pluton = new CuerpoCeleste(
            1.30e22,
            2050,
            2376,
            5906440628.0,
            13,
            "Plutón"
    );

    //Sol
    static CuerpoCeleste sol = new CuerpoCeleste(
            1.989e30,
            1.41,
            1392684,
            0,
            14,
            "Sol"
    );
}

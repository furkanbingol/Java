package Basics.Intro01;

import java.util.Objects;

public class Selam {
    String world = "millet";

    public String selamSoyle(String kime){
        String cumle;

        if(!Objects.equals(kime, ""))
            cumle = "Selam " + kime + " :)";
        else
            cumle = "Selam " + world + " :)";
        return cumle;
    }
}

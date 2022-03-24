package vilagtalanvirologusok;

/**
 * A játékban, amikor a játékosra egy ágenst rákennek, amennyiben birtokolja ezt a tárgyat,
 * akkor annak a hatását automatikusan a rákenő játékos kapja meg.
 * A tárgy háromszor használható utána a kör elején a tárgy eltűnik.
 */

public class Glove extends Equipment{
    public void CastBack(Virologist v, Agent a){
        System.out.println("Glove: CastBack()");
    }
}

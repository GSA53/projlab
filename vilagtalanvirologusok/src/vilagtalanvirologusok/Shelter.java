package vilagtalanvirologusok;

/**
 * A játékban szereplő óvóhelyeket reprezentálja,
 * ezeken a helyszíneken tudnak a virológusok felszereléseket gyűjteni saját maguk számára.
 */

public class Shelter extends Center{
    public void SpawnEquipment(){
        System.out.println("Shelter: SpawnEquipment()");
    }
    public void RemoveEquipment(Equipment e){
        System.out.println("Shelter: RemoveEquipment()");
    }
}

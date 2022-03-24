package vilagtalanvirologusok;

/**
* A játékban szereplő raktárakat reprezentálja, ezeken a helyszíneken tudnak a virológusok anyagokat gyűjteni.
 */
public class Storage extends Center {
    public void SpawnMaterial(){
        System.out.println("Storage: SpawnMaterial()");
    }
    public void RemoveMaterial(Material m){
        System.out.println("Storage: RemoveMaterial()");
    }
}

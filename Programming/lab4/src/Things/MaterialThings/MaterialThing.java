package Things.MaterialThings;

import Enums.Color;
import Enums.Material;
import Things.PhysicalThing;

import java.util.Objects;

public abstract class MaterialThing extends PhysicalThing {
    private Material material;
    protected MaterialThing(){
        super();
    }
    public MaterialThing(Material material){
        super();
        this.material = material;
    }
    public MaterialThing(Color color, String shape, Material material){
        super(color, shape);
        this.material = material;
    }
    public void setMaterial(Material material){
        this.material = material;
    }
    public Material getMaterial(){
        return material;
    }
    @Override
    public boolean equals(Object otherObject){
        if (!super.equals(otherObject)) return false;
        var other = (MaterialThing) otherObject;
        return Objects.equals(material, other.material);
    }
    @Override
    public int hashCode(){
        return Objects.hash(super.hashCode(), material);
    }
    @Override
    public String toString(){
        return super.toString() + "[material=" + material + "]";
    }
}

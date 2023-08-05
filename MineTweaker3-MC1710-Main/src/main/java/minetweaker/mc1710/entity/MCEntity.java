package minetweaker.mc1710.entity;

import minetweaker.api.entity.IEntity;
import minetweaker.api.minecraft.MineTweakerMC;
import minetweaker.api.util.Position3f;
import minetweaker.api.world.IDimension;
import net.minecraft.entity.Entity;

import java.util.Objects;

public class MCEntity implements IEntity {

    private Entity entity;

    public MCEntity(Entity entity) {
        this.entity = entity;
    }

    @Override
    public float getX() {
        return (float) entity.posX;
    }

    @Override
    public float getY() {
        return (float) entity.posY;
    }

    @Override
    public float getZ() {
        return (float) entity.posZ;
    }


    @Override
    public String toString() {
        return entity.toString();
    }

    @Override
    public IDimension getDimension() {
        return MineTweakerMC.getDimension(entity.worldObj);
    }

    @Override
    public Position3f getPosition() {
      return new Position3f((float) entity.posX, (float) entity.posY, (float) entity.posZ);
    }

    @Override
    public void setPosition(Position3f position3f) {
      entity.setPosition(position3f.getX(), position3f.getY(), position3f.getZ());
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof MCEntity && entity.isEntityEqual(((MCEntity) obj).entity)) || super.equals(obj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(entity);
    }
}

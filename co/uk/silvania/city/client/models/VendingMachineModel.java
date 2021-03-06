package co.uk.silvania.city.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class VendingMachineModel extends ModelBase
{
  //fields
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape8;
    ModelRenderer Shape9;
    ModelRenderer Shape10;
    ModelRenderer Shape11;
  
  public VendingMachineModel()
  {
    textureWidth = 64;
    textureHeight = 128;
    
      Shape1 = new ModelRenderer(this, 0, 0);
      Shape1.addBox(0F, 0F, 0F, 16, 32, 12);
      Shape1.setRotationPoint(-8F, -8F, -4F);
      Shape1.setTextureSize(64, 128);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 0, 44);
      Shape2.addBox(0F, 0F, 0F, 12, 24, 2);
      Shape2.setRotationPoint(-8F, -8F, -6F);
      Shape2.setTextureSize(64, 128);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 28, 44);
      Shape3.addBox(0F, 0F, 0F, 12, 4, 2);
      Shape3.setRotationPoint(-8F, 20F, -6F);
      Shape3.setTextureSize(64, 128);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);
      Shape4 = new ModelRenderer(this, 28, 50);
      Shape4.addBox(0F, 0F, 0F, 2, 4, 2);
      Shape4.setRotationPoint(-8F, 16F, -6F);
      Shape4.setTextureSize(64, 128);
      Shape4.mirror = true;
      setRotation(Shape4, 0F, 0F, 0F);
      Shape5 = new ModelRenderer(this, 36, 50);
      Shape5.addBox(0F, 0F, 0F, 2, 4, 2);
      Shape5.setRotationPoint(2F, 16F, -6F);
      Shape5.setTextureSize(64, 128);
      Shape5.mirror = true;
      setRotation(Shape5, 0F, 0F, 0F);
      Shape6 = new ModelRenderer(this, 28, 58);
      Shape6.addBox(0F, 0F, 0F, 2, 1, 1);
      Shape6.setRotationPoint(5F, 4F, -4.5F);
      Shape6.setTextureSize(64, 128);
      Shape6.mirror = true;
      setRotation(Shape6, 0F, 0F, 0F);
      Shape7 = new ModelRenderer(this, 28, 60);
      Shape7.addBox(0F, 0F, 0F, 2, 1, 1);
      Shape7.setRotationPoint(5F, 6F, -4.5F);
      Shape7.setTextureSize(64, 128);
      Shape7.mirror = true;
      setRotation(Shape7, 0F, 0F, 0F);
      Shape8 = new ModelRenderer(this, 28, 62);
      Shape8.addBox(0F, 0F, 0F, 2, 1, 1);
      Shape8.setRotationPoint(5F, 8F, -4.5F);
      Shape8.setTextureSize(64, 128);
      Shape8.mirror = true;
      setRotation(Shape8, 0F, 0F, 0F);
      Shape9 = new ModelRenderer(this, 28, 64);
      Shape9.addBox(0F, 0F, 0F, 2, 1, 1);
      Shape9.setRotationPoint(5F, 10F, -4.5F);
      Shape9.setTextureSize(64, 128);
      Shape9.mirror = true;
      setRotation(Shape9, 0F, 0F, 0F);
      Shape10 = new ModelRenderer(this, 28, 66);
      Shape10.addBox(0F, 0F, 0F, 2, 1, 1);
      Shape10.setRotationPoint(5F, 12F, -4.5F);
      Shape10.setTextureSize(64, 128);
      Shape10.mirror = true;
      setRotation(Shape10, 0F, 0F, 0F);
      Shape11 = new ModelRenderer(this, 28, 56);
      Shape11.addBox(0F, 0F, 0F, 2, 1, 1);
      Shape11.setRotationPoint(5F, 2F, -4.5F);
      Shape11.setTextureSize(64, 128);
      Shape11.mirror = true;
      setRotation(Shape11, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Shape1.render(f5);
    Shape2.render(f5);
    Shape3.render(f5);
    Shape4.render(f5);
    Shape5.render(f5);
    Shape6.render(f5);
    Shape7.render(f5);
    Shape8.render(f5);
    Shape9.render(f5);
    Shape10.render(f5);
    Shape11.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}

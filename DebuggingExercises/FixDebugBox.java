public class FixDebugBox
{
   private int width;
   private int length;
   private int height;
   public FixDebugBox()
   {
      length = 1;
      width = 1;
      height = 1;
   }
   public FixDebugBox(int w, int l, int h)
   {
      width = w;
      length = l;
      height = h;
   }
   public void showData()
   {
     System.out.println("Width: "  + width + "  Length: " +
       length + "  Height: " + height);
   }
   public void showVolume()
   { 
     double vol = length * width * height;
     System.out.println(vol);
   }
}

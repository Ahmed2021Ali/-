  // احمد علي عبدالغني علي 
package assignment.__1;
public class TV {
    public int channel;
    public int volumelevel;
    public boolean on;
    public TV()
    {
        channel=120;
        volumelevel=7;
        on=false;
    }
    public void turn_on()
    {
       if( on==true)
        System.out.println("Error  TV is on");
       else
       {
           on=true;
           System.out.println("TV turn on");
       }
    }
    public void turn_off()
    {
       if( on==false)
        System.out.println("Error  TV is off");
       else
       {
           on=false;
           System.out.println("TV turn off");
       }
    }
    public void set_Channal(int newchannal)
    {
       if( channel>=newchannal)
            System.out.println(" channal is exisit");
       else
       {
           channel=newchannal;
           System.out.println(" channal is set");
        }
           
    }
    public void set_Volume(int newvolumelevel)
    {
       if( volumelevel>=newvolumelevel)
            System.out.println("The TV in Volume "+newvolumelevel);
       else
       {
           volumelevel=newvolumelevel;
           System.out.println("the volume is set");
       }
    }
    public void channal_Up()
    {
        channel++;
    }
    public void channalDown()
    {
        channel--;
    }
    public void volumeUp()
    {
        volumelevel++;
    }
    public void volumeDown()
    {
        volumelevel--;
    }

}

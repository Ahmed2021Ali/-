package assignment.__1;
public class Assignment__1 
{
    public static void main(String[] args)
    {
         // احمد علي عبدالغني علي 
       TV t1=new TV();
        t1.on=true;
        t1.turn_on();
        t1.channal_Up();
       t1.channal_Up();
       System.out.println(t1.channel);
        t1.channalDown();
        System.out.println(t1.channel);
        t1.set_Channal(120);
        t1.set_Channal(121);
        t1.set_Channal(122);
        System.out.println(t1.channel);
        t1.volumeUp();
        t1.volumeUp();
        System.out.println(t1.volumelevel);
        t1.set_Volume(6);
        t1.set_Volume(7);
        t1.set_Volume(10);
        System.out.println(t1.volumelevel);
        
        
        
    }
    
}

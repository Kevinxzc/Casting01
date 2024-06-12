public class Casting01 {
    public static void main(String[] args) {
        //Declarei short
        short myShort = 128;
        //declarei byte
        byte myByte = 127;
        //
        myShort = (short)myByte;
     
        //adicionei ++ para byte e joguei na tela 
        myByte++;
        System.out.println(myByte);
        
        myByte++;
        System.out.println(myByte);
        
        
        
    }    
}

public class Due extends Uno{
    
    public int val = 1;

    public void show(){
        System.out.println(val);
    }

    public void superShow(){
        System.out.println(super.val);
        super.show();
    }
}

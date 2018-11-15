
public class Drink {
	private int size, amount;

    public Drink(int size) {
        this.size = size;
        this.amount = size;
}
    
    public int sip() {
       amount--;
        return amount;
    }

    public int gulp(int n) {
        for (int i = 0; i < n; i++) {
            sip();
        }
        return amount;
    }

    public int refill() {
        amount = size;
        return amount;
    }


    public static void main(String[] args){
    	Drink drink1 = new Drink(12);
		//Drink drink1 = new Drink(16);
		Drink drink2 = new Drink(32);
		//Drink drink2 = drink1;
		//drink1.gulp(2);
		drink2.gulp(drink1.sip() / 2);
		int r = drink1.sip() + drink2.sip();
		System.out.print(r);
	
    }
}
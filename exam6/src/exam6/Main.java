package exam6;

public class Main {

	public static void main(String[] args) {
        Tasse[] t=new Tasse[3];
        for(int i=0;i<t.length;i++) {
        	t[i]=new Tasse();
        }
		
		 t[0].AjouterLiquide(new Liquide());
		 t[1].AjouterLiquide(new Cafe());
		 t[2].AjouterLiquide(new Lait());
		 
		 for(int i=0;i<t.length;i++) {
			 t[i].imprimer();
		 }
		
	}

}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Tasse[] lestasse=new Tasse[3];
for(int i=0;i<lestasse.length;i++) {
lestasse[i]=new Tasse();

}


lestasse[0].ajouterliquid(new Cafe());
lestasse[1].ajouterliquid(new Lait());
lestasse[2].ajouterliquid(new Liquide());

for(int i=0;i<lestasse.length;i++) {
lestasse[i].imprimer();
}

}

}

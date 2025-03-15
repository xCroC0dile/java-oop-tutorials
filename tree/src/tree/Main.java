package tree;


public class Main {
static void prefixe(node A) {
if(A!=null) {
System.out.print(A.getElm());
prefixe(A.left);
prefixe(A.right);
}
}

static void infixe(node A) {
if(A!=null) {
infixe(A.left);
System.out.print(A.getElm());
infixe(A.right);
}
}


static void postfixe(node A) {
if(A!=null) {
postfixe(A.left);
postfixe(A.right);
System.out.print(A.getElm());
}
}

static boolean empty(node A) {
if(A==null) {
return true;
}
else {
return false;
}
}

static void leaf(node A) {
int leaf;
if(empty(A)==true) {
leaf=-1;
System.out.println(leaf);
}
else {
if((empty(A.left))&&empty(A.left)) {
leaf=1;
System.out.println(leaf);
}
else {
leaf=0;
System.out.println(leaf);
}
}
}


static int length(node n) {
if(n==null) {
return 0;
}
else {
return 1+length(n.left)+length(n.right);
}
}
	public static void main(String[] args) {
	node A=new node('A');
	node B=new node('B');
	node C=new node('C');
	node D=new node('D');
	node E=new node('E');
	node F=new node('F');
	node G=new node('G');
	node H=new node('H');
	node J=new node('J');
	node I=new node('I');

	
A.left=B;
B.left=E;
B.left=E;
B.right=C;
C.left=F;
C.right=D;
F.right=G;
G.left=I;
G.right=H;
I.right=J;
System.out.println("tree empty? :" +empty(A));
System.out.println("prefixe:");
prefixe(A);
System.out.println("");
System.out.println("infixe:");
infixe(A);
System.out.println("");
System.out.println("postfixe:");

postfixe(A);
System.out.println("");
	System.out.println("the legth of tree is "+length(A));
	System.out.println(A);
	
leaf(A);
	}

}

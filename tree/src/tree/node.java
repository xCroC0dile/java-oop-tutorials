package tree;

public class node {
node left=null;
node right=null;
private char elm;
node(char elm){
this.elm=elm;
}
public char getElm() {
return elm;
}
public void setElm(char elm) {
this.elm=elm;
}
String s=Character.toString(elm);
public String toString() {

return s;
}
}


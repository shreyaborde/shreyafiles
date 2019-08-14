public class Symboltable{
air[] Table;
int size;
Symboltable(){
air[] Table= new air[17];
size=17;
}
private int hash(String s){return s.length()%17;}


public void insert(air a){
int loc = hash(a.Name);
if(Table[loc]==null){Table[loc]=a;}
else{
air temp=Table[loc];
while(temp.next!=null){
temp=temp.next;}
temp.next=a;
}
}


}


public class main {
    public static  void main(String[] args){
        carclass c1=new carclass('F','o',"Pink",3000.00,720,2017);
        carclass c2=new carclass('A','N',"Silver",60000.00,1000,2015);

        System.out.println(c1.toString());
        System.out.println(c2.toString());

        c1.sell(300);
        c1.setColor("grey");
        c2.delivery(50);

        System.out.println("");
        System.out.println(c1.toString());
        c2.delivery(45);
        c2.setColor("Lilac");
        System.out.println(c2.toString());


    }
}

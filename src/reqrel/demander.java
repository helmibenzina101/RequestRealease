package reqrel;

public class demander extends Thread {
    private  monitor monitor ;
    private int amount ;
    private  String name ;

public demander(monitor monitor , int amount , String name){
    this.monitor=monitor;
    this.amount=amount;
    this.name=name;
}
    public void run (){
          monitor.request(amount , name);
          monitor.acces_memoire();
          monitor.release(amount , name);
    }

}

package reqrel;

import jdk.jfr.Name;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class monitor {
    private  final ReentrantLock l = new ReentrantLock();
    private Condition c1 = l.newCondition();
    private Condition c2 = l.newCondition();
    private int nbrcel = 10 ;
    int nbrdisp = 10;

      public void request(int a, String name) {
          l.lock();
          try {

              while ((nbrdisp - a) < 0 || nbrdisp == 0) {
                  System.out.println(name+" Request en attente");
                  c2.signal(); // signaler aux autres threads en attente
                  c2.await(); // attendre
                    System.out.println(name+" Request quitte l attente");
              }
               nbrdisp-=a;

              System.out.println(name+" Request done of "+a+" Nbrdisp = "+nbrdisp);

          } catch (Exception e) {
              throw new RuntimeException(e);
          } finally {
              l.unlock();
          }
      }
      public void acces_memoire() {
          System.out.println ("Acces memoire");
      }
          public void release(int a , String name) {
          l.lock();
          try {

              nbrdisp+=a ;
              c2.signal();

              System.out.println(name+" Release done Nbrdisp = "+nbrdisp +  " valeur ajouté "+a);
          }
          catch (Exception e)
            {
                throw new RuntimeException(e);
            }
          finally {
              l.unlock();
          }
      }
}

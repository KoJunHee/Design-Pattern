package isp;

public class Manager {
    IWorkable worker;

    public void setWorker(IWorkable worker){
        this.worker = worker;
    }

    public void mange(){
        worker.work();
    }
}





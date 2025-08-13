package lld.obderverPattern.obeserver;

import lld.obderverPattern.obeservable.StockObservable;

public class EmailAlertOberverImpl implements NotificationAlertObserver{

    String emailId;
    StockObservable observable;
    public EmailAlertOberverImpl(String emailId, StockObservable observable){
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update(){
        sendMail(emailId, "product is in stock!!!");
    }

    private void sendMail(String emailId, String s) {
        System.out.println("mail sent to:"+emailId +"with msg"+ s);
    }
}

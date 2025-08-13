package lld.obderverPattern.obeserver;

import lld.obderverPattern.obeservable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{

    String userName;
    StockObservable observable;

    public MobileAlertObserverImpl(String userName,StockObservable observable){
        this.observable = observable;
        this.userName = userName;
    }

    @Override
    public void update(){
        sendMsgOnMobile(userName, "product is in stock");
    }

    private void sendMsgOnMobile(String userName, String productIsInStock) {
        System.out.println("msg sent to" +userName);
    }
}

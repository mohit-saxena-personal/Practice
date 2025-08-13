package lld.obderverPattern;

import lld.obderverPattern.obeservable.IphoneObservableImpl;
import lld.obderverPattern.obeservable.StockObservable;
import lld.obderverPattern.obeserver.EmailAlertOberverImpl;
import lld.obderverPattern.obeserver.MobileAlertObserverImpl;
import lld.obderverPattern.obeserver.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StockObservable iphoneStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver ob1 = new EmailAlertOberverImpl("abc@gmail.com",iphoneStockObservable);
        NotificationAlertObserver ob2 = new EmailAlertOberverImpl("abc2@gmail.com",iphoneStockObservable);
        NotificationAlertObserver ob3 = new MobileAlertObserverImpl("abc_123",iphoneStockObservable);

        iphoneStockObservable.add(ob1);
        iphoneStockObservable.add(ob2);
        iphoneStockObservable.add(ob3);

        iphoneStockObservable.setStockCount(10);
    }
}

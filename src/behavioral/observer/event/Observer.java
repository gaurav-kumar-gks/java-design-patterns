package behavioral.observer.event;

import behavioral.observer.stock.Stock;

public interface Observer {
    void update(Stock stock);
}


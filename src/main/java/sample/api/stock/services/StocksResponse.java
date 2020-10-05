package sample.api.stock.services;

import sample.api.stock.models.Stock;

import java.util.List;

public class StocksResponse {

    List<Stock> stocks;

    public StocksResponse(List<Stock> stocks) {
        this.stocks = stocks;
    }

    public List<Stock> getStocks() {
        return stocks;
    }

    public void setStocks(List<Stock> stocks) {
        this.stocks = stocks;
    }
}

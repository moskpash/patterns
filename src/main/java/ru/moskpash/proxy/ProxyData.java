package ru.moskpash.proxy;

public class ProxyData implements Data {

    private final OriginalData originalData;

    public ProxyData(String dataSource) {
        originalData = new OriginalData(dataSource);
    }

    @Override
    public void requestData() throws InterruptedException {
        long time = System.currentTimeMillis();
        originalData.requestData();
        System.out.println(System.currentTimeMillis() - time);
    }
}

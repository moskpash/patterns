package ru.moskpash.proxy;

public class OriginalData implements Data {
    private final String dataSource;

    public OriginalData(String dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void requestData() throws InterruptedException {
        int i = 0;
        System.out.println();
        while (i < 20) {
            System.out.print("\r");
            System.out.print("loading " + dataSource + " ");
            for (int j = 0; j < i; j++) {
                System.out.print("=");
            }
            System.out.print(">");
            Thread.sleep(500);
            i++;
        }
        System.out.println();
    }
}

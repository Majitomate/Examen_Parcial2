public class HiloNumero extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 40; i++) {
            if (i % 2 == 0){
                System.out.println("Hilo: " + i);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

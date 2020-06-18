package responsibility_chain;

public class Main {
    public static void main(String[] args) {
        final double base = 500;
        ChainBuilder<PurchaseRequest> chainBuilder = ChainBuilder.chainBuilder();
        Chain<PurchaseRequest> chain = chainBuilder
                .first(request -> {
                    System.out.println("first");
                    if (request.getAmount() < base * 10) {
                        System.out.println("A will approve $" + request.getAmount());
                        return true;
                    }
                    return false;
                })
                .successor(request -> {
                    System.out.println("second");
                    if (request.getAmount() < base * 20) {
                        System.out.println("B will approve $" + request.getAmount());
                        return true;
                    }
                    return false;
                })
                .successor(request -> {
                    System.out.println("third");
                    if (request.getAmount() < base * 30) {
                        System.out.println("C will approve $" + request.getAmount());
                    }
                    return true;
                }).build();

        chain.handle(new PurchaseRequest(10000));
    }
}

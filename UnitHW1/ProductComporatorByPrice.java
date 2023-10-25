public class ProductComporatorByPrice<P extends GroupItem> implements Comparator<P> {

    @Override
    public int compare(P o1, P o2) {
        return o1.getCost()- o2.getCost();
    }
}
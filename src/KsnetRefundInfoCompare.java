import java.util.Comparator;

public class KsnetRefundInfoCompare implements Comparator<KsnetRefundInfo> {
    int ret = 0;
    @Override
    public int compare(KsnetRefundInfo o1, KsnetRefundInfo o2) {
        int o1StatusNum = o1.getStatusNum();
        int o2StatusNum = o2.getStatusNum();
        String o1Date = o1.getDealDate().concat(o1.getDealDate());
        String o2Date = o2.getDealDate().concat(o2.getDealDate());


       if (o1StatusNum==1) {
           o1StatusNum=2;
       } else if (o1StatusNum == 2) {
           o1StatusNum=1;
       }
       if (o2StatusNum==1) {
           o2StatusNum=2;
        } else if ( o2StatusNum == 2) {
           o2StatusNum=1;
        }
        // 양수일때 내림차순, 음수일때 오름차순
        if (o1StatusNum < o2StatusNum) {
            ret = 1;
        }
            if (o1StatusNum == o2StatusNum) {
                if (o1Date.compareTo(o2Date) < 0) {
                    return 1;
                } else if (o1Date.compareTo(o2Date) == 0) {
                    return 0;
                } else if (o1Date.compareTo(o2Date) > 0) {
                    return -1;
                }
            }
        if (o1StatusNum > o2StatusNum) {
            return -1;
        }
        return ret;
    }
}


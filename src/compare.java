import com.sun.istack.internal.Nullable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class compare {
    public static void main(String[] args) {
        List<KsnetRefundInfo> list = new ArrayList<>();
        @Nullable
        int statusNum;

        String status;
        String dealDate;
        String dealTime;
        KsnetRefundInfo k1 = new KsnetRefundInfo(1,"환불안됨","20200101","1530");
        KsnetRefundInfo k2 = new KsnetRefundInfo(1,"환불안됨","20200202","1430");
        KsnetRefundInfo k3 = new KsnetRefundInfo(2,"환불완료","20200301","1530");
        KsnetRefundInfo k4 = new KsnetRefundInfo(2,"환불완료","20200401","2230");
        KsnetRefundInfo k5 = new KsnetRefundInfo(2,"환불완료","20200501","0130");
        KsnetRefundInfo k6 = new KsnetRefundInfo(2,"환불완료","20200601","2330");
        KsnetRefundInfo k7 = new KsnetRefundInfo(3,"환불실패","20200201","0730");
        KsnetRefundInfo k8 = new KsnetRefundInfo(3,"환불실패","20200801","1130");
        KsnetRefundInfo k9 = new KsnetRefundInfo(4,"환불실패(기타)","20200201","1530");
        KsnetRefundInfo k10 = new KsnetRefundInfo(4,"환불실패(기타)","202001001","1530");

        KsnetRefundInfo k11 = new KsnetRefundInfo(5,"???","202001001","1530");
        KsnetRefundInfo k12 = new KsnetRefundInfo(5,"???","202002001","1530");

        list.add(k1);list.add(k2);list.add(k3);list.add(k4);list.add(k5);
        list.add(k6);list.add(k7);list.add(k8);list.add(k9);list.add(k10);list.add(k12);list.add(k11);

        Collections.sort(list,new KsnetRefundInfoCompare());

        for (KsnetRefundInfo data: list
             ) {
            System.out.println(data.toString());
        }


    }
}

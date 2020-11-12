



public class KsnetRefundInfo {
    int statusNum;
    String status;
    String dealDate;

    public KsnetRefundInfo(int statusNum, String status, String dealDate, String dealTime) {
        this.statusNum = statusNum;
        this.status = status;
        this.dealDate = dealDate;
        this.dealTime = dealTime;
    }

    String dealTime;

    public KsnetRefundInfo(Integer statusNum, String status, String dealDate, String dealTime) {
        this.statusNum = statusNum.intValue();
        this.status = status;
        this.dealDate = dealDate;
        this.dealTime = dealTime;
    }

    public int getStatusNum() {
        return statusNum;
    }

    public void setStatusNum(int statusNum) {
        this.statusNum = statusNum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDealDate() {
        return dealDate;
    }

    public void setDealDate(String dealDate) {
        this.dealDate = dealDate;
    }

    public String getDealTime() {
        return dealTime;
    }

    public void setDealTime(String dealTime) {
        this.dealTime = dealTime;
    }


    @Override
    public String toString() {
        return "KsnetRefundInfo{" +
                "statusNum=" + statusNum +
                ", status='" + status + '\'' +
                ", dealDate='" + dealDate + '\'' +
                ", dealTime='" + dealTime + '\'' +
                '}';
    }
}

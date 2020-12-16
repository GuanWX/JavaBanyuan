package club.banyuan.structure;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/16 7:33 下午
 */
public class Bill {
    private int id;
    private int ispay;
    private String isPayStr;
    private String money;
    private String product;
    private int providerId;
    private String providerName;
    private String updateTime;

    public Bill(int id, int ispay, String isPayStr, String money, String product, int providerId, String providerName, String updateTime) {
        this.id = id;
        this.ispay = ispay;
        this.isPayStr = isPayStr;
        this.money = money;
        this.product = product;
        this.providerId = providerId;
        this.providerName = providerName;
        this.updateTime = updateTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIspay() {
        return ispay;
    }

    public void setIspay(int ispay) {
        this.ispay = ispay;
    }

    public String getIsPayStr() {
        return isPayStr;
    }

    public void setIsPayStr(String isPayStr) {
        this.isPayStr = isPayStr;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getProviderId() {
        return providerId;
    }

    public void setProviderId(int providerId) {
        this.providerId = providerId;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}

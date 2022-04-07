package xcx;


public class CommonSpecialRosterRequestVO   {
    private String id;

    private String phone;

    private String name;

    private String channelId;

    private String channelName;

    private String rostersType;

    private String rostersValue;

    private String useFlag;

    private String operatePeopleName;

    private String remark;

    private Integer pageNo = 1;

    private Integer pageSize = 20;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getRostersType() {
        return rostersType;
    }

    public void setRostersType(String rostersType) {
        this.rostersType = rostersType;
    }

    public String getRostersValue() {
        return rostersValue;
    }

    public void setRostersValue(String rostersValue) {
        this.rostersValue = rostersValue;
    }

    public String getUseFlag() {
        return useFlag;
    }

    public void setUseFlag(String useFlag) {
        this.useFlag = useFlag;
    }

    public String getOperatePeopleName() {
        return operatePeopleName;
    }

    public void setOperatePeopleName(String operatePeopleName) {
        this.operatePeopleName = operatePeopleName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}

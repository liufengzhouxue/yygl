package yycg.base.pojo.vo;

/**
 * 用于页面向action传递参数
 */
public class SysuserQueryVo {
    private SysuserCustom sysuserCustom;
    private PageQuery pageQuery;

    public PageQuery getPageQuery() {
        return pageQuery;
    }

    public void setPageQuery(PageQuery pageQuery) {
        this.pageQuery = pageQuery;
    }

    public SysuserCustom getSysuserCustom() {
        return sysuserCustom;
    }

    public void setSysuserCustom(SysuserCustom sysuserCustom) {
        this.sysuserCustom = sysuserCustom;
    }
}

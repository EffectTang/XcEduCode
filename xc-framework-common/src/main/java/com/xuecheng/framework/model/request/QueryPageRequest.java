package com.xuecheng.framework.model.request;

import lombok.Data;

/**
 * @author starlord
 * @description
 * @create 2025/2/10
 */
@Data
public class QueryPageRequest {

    //站点id
    private String siteId;
    //页面ID
    private String pageId;
    //页面名称
    private String pageName;
    //别名
    private String pageAliase;
    //模版id
    private String templateId;
}

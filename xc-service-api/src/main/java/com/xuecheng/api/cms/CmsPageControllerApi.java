package com.xuecheng.api.cms;

import com.xuecheng.framework.model.request.QueryPageRequest;
import com.xuecheng.framework.model.response.QueryResponseResult;

/**
 * @author starlord
 * @description
 * @create 2025/2/10
 */
public interface CmsPageControllerApi {

    public QueryResponseResult findList(int page, int size, QueryPageRequest queryPageRequest);

}

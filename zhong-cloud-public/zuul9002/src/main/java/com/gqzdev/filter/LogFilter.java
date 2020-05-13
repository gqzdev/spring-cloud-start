package com.gqzdev.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName: LogFilter
 * @author: ganquanzhong
 * @date: 2020/5/13 14:44
 */

@Component
public class LogFilter extends ZuulFilter {

    /**
     *  自定Filter的类型  zuul 4中类型
     */

    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    /**
     *  多个filter时，指定优先级  order  值越小 级别越高
     *
     *  Zuul在各个级别都有一个默认的过滤器
     */
    @Override
    public int filterOrder() {
        //在zuul默认pre_type类型的前面
        return FilterConstants.PRE_DECORATION_FILTER_ORDER+1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        //主要逻辑

        RequestContext ctx = RequestContext.getCurrentContext();
        //获取微服务  中真正的请求地址
        String routeUrl = ctx.get(FilterConstants.REQUEST_URI_KEY).toString();
        HttpServletRequest request = ctx.getRequest();
        
        System.out.println(request.getRemoteAddr()+"访问了"+request.getRequestURL());

        System.out.println("访问的微服务地址"+routeUrl);
        return null;
    }
}

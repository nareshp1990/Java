package com.example.cloud.zuul.filters;

import com.netflix.zuul.ZuulFilter;

/**
 * @author Naresh Patchipulusu (GSIHYD-1298)
 *
 * Implemented On: 28/12/17 5:36 AM
 */
public class PostFilter extends ZuulFilter{

    @Override
    public String filterType() {
        return "post";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        System.out.println("Inside Response Filter");
        return null;
    }
}

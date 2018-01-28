package com.example.cloud.zuul.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author Naresh Patchipulusu (GSIHYD-1298)
 *
 * Implemented On: 28/12/17 11:21 AM
 */
@Component
public class AccessLogFilter extends ZuulFilter {

    Logger logger = LoggerFactory.getLogger(AccessLogFilter.class);

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
        HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
        HttpServletResponse response = RequestContext.getCurrentContext().getResponse();

        logger.info(
            "REQUEST :: < " + request.getScheme() + " " + request.getLocalAddr() + ":" + request
                .getLocalPort());
        logger.info(
            "REQUEST :: < " + request.getMethod() + " " + request.getRequestURI() + " " + request
                .getProtocol());
        logger.info("RESPONSE:: > HTTP:" + response.getStatus());

        return null;
    }
}

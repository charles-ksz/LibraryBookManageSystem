package com.dhu.interceptor;
import com.opensymphony.xwork2.*;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class PrivilegeInterceptor extends AbstractInterceptor{
    private  static final  long serialVersionUID=1L;
    public String intercept (ActionInvocation invocation) throws Exception{
        ActionContext actionContext=invocation.getInvocationContext();
        Object user=actionContext.getSession().get("user");
        if (user==null)
        {
            actionContext.put("msg","您还未登录，请先登录！");
            return Action.LOGIN;
        }
        else
        {
                return invocation.invoke();
        }
    }
}

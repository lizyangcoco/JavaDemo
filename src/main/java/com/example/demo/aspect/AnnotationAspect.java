package com.example.demo.aspect;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.annotation.Annotation;
import com.example.demo.utils.HttpRequestUtil;
import com.example.demo.utils.MapBeanUtil;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author by lizyang @on 2021/5/27 17:57
 * @description:自定义注解，参数获取
 */
@Aspect
@Component
public class AnnotationAspect {

    /**
     * 自定义注解，切面实现类
     *
     * @param point      切点
     * @param annotation 自定义注解
     * @throws Throwable
     */
    @Around("@annotation(annotation)")
    public void around(ProceedingJoinPoint point, Annotation annotation) throws Throwable {
        // 获取请求的参数
        Object[] args = point.getArgs();

        //请求的方法名
        MethodSignature signature = (MethodSignature) point.getSignature();
        String className = point.getTarget().getClass().getName();
        String methodName = signature.getName();

        // 获取入参
        boolean hasOpen = annotation.hasOpen();
        String value = annotation.value();

        // 从request中获取参数
        ServletRequestAttributes currentRequestAttributes = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
        HttpServletRequest request = currentRequestAttributes.getRequest();

        // get请求参数
        String params = request.getParameter("params");

        // post请求参数
        String bodyContent = HttpRequestUtil.getBodyContent(request);
        Map objectObjectMap = (Map) JSONObject.parseObject(bodyContent);
        // map转对应得dto对象
        Object obj = (Object) MapBeanUtil.map2Object(objectObjectMap, Object.class);

        // todo 做对应的业务，或者其他事情，


        if (true) {
            // todo 做对应的事情
        }


    }

}

package com.adun.domain.template;

import org.springframework.beans.factory.InitializingBean;

/**
 * @author ADun
 * @date 2023/2/1 0:30
 */
public abstract class AbstractHandler implements InitializingBean {
    public void AA(String nickName){
        throw new UnsupportedOperationException();
    }

    public void BB(String nickName){
        throw new UnsupportedOperationException();
    }
}

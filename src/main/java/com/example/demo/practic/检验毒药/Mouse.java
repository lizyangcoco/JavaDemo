package com.example.demo.practic.检验毒药;

import lombok.Data;

/**
 * @author by 李泽阳 @on 2020/11/5
 * @description:小白鼠
 */
@Data
public class Mouse {
    /** 小白鼠生命*/
    private Boolean live;

    /** 所有初始化小白鼠都为存活状态*/
    public Mouse() {
        this.live = true;
    }

    /**
     * 试毒：如果有毒，当前老鼠立即死亡
     */
    public void tryBane(Boolean bane) {
        if (bane) {
            this.live = false;
        }
    }

}

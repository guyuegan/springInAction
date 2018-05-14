package com.gyg.chapter02.soundSystem;

import org.springframework.stereotype.Component;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 下午 4:56 2017/9/26 0026
 * Q    Q: 1784286916
 * </pre>
 */
@Component(value = "compactDisc")//声明为组件类，被spring上下文容器管理，可以自由设置id
public class MusicDisc implements ICompactDisc{

    private String title = "let it be";
    private String artist = "the beatles";

    @Override
    public void dispaly() {
        System.out.println(artist +" sing: " + title);
    }
}

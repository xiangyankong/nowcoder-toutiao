package com.nowcoder.toutiao.model;

import org.springframework.stereotype.Component;

/**
 * Created by kongxy on 2018/5/2 0002.
 */
@Component
public class HostHolder {
    private static ThreadLocal<User> users = new ThreadLocal<>();

    public User getUser() {
        return users.get();
    }

    public void setUser(User user) {
        users.set(user);
    }

    public void clear() {
        users.remove();
    }
}

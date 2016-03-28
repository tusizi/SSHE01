package sy.service.impl;

import org.springframework.stereotype.Service;
import sy.service.UserServiceI;

/**
 * Created by tusizi on 2016/3/21.
 */
@Service("userService")
public class UserServiceImpl implements UserServiceI {
    @Override
    public void test() {
        System.out.println("sssss");
    }
}

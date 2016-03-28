package sy.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;

/**
 * Created by tusizi on 2016/3/28.
 */
@ParentPackage("basePackage")
@Namespace("/")
@Action(value = "userAction")
public class UserAction {
    public void test(){
        System.out.println("进入action");
    }
}

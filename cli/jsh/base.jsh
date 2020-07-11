// import main
import cn.rectcircle.explore.springbootwithjshell.*

// import 组件
import cn.rectcircle.explore.springbootwithjshell.controller.*
import cn.rectcircle.explore.springbootwithjshell.dto.*
import cn.rectcircle.explore.springbootwithjshell.service.*
import cn.rectcircle.explore.springbootwithjshell.util.*

void help() {
    System.out.println();
    System.out.println("该脚本预执行了大量代码，导入了很多类，参见：");
    System.out.println("        cli/jsh/base.jsh");
    System.out.println("        cli/jsh/explore-spring-boot-with-jshell.jsh");
    System.out.println();
    System.out.println("同时，上下文中存在注入了 springContext: ApplicationContext 等变量");
    System.out.println();
    System.out.println("常见命令如下：");
    System.out.println("        /?  查看命令帮助");
    System.out.println("        /vars  查看定义变量");
    System.out.println("        /list  查看历史命令");
    System.out.println();
}
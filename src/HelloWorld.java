/**
 * 我的第一个 Java 程序：Hello World
 *
 * 编译：javac HelloWorld.java   （在 src 目录下执行）
 * 运行：java HelloWorld
 *
 * 代码结构说明：
 *  - public class HelloWorld：类名必须和文件名一致
 *  - public static void main(String[] args)：程序入口，JVM 从这里开始执行
 *  - System.out.println(...)：向控制台打印一行文字
 */
public class HelloWorld {

    public static void main(String[] args) {
        // 经典开场白
        System.out.println("Hello, GitHub!");

        // 中文输出也没问题（注意文件编码要用 UTF-8）
        System.out.println("这是我通过豆包 GitHub 插件上传的第一个仓库！");

        // 小练习：试着改动下面的文字，重新编译运行看看效果
        System.out.println("我正在学习 Java 后端开发，加油！");
    }
}

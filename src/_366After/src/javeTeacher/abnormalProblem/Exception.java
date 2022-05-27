package _366After.src.javeTeacher.abnormalProblem;

//如何自定义：异常类
/*
1-继承异常结果： RuntimeException、Exception
2-提供全局常量：serialVersionUID
3-重载构造器
 */
public class Exception extends RuntimeException {

    static final long serialVersionUID = -7034897190745766939L;

    public Exception() {
    }

    public Exception(String msg) {
        super(msg);
    }

}

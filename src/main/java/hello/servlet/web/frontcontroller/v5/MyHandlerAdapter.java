package hello.servlet.web.frontcontroller.v5;

import hello.servlet.web.frontcontroller.ModelView;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import javax.sql.rowset.serial.SerialException;
import java.io.IOException;

public interface MyHandlerAdapter {

    //handler 지원 가능 여부 파악
    boolean support(Object handler);

    ModelView handle(HttpServletRequest request, HttpServletResponse response, Object handler) throws SerialException, IOException;
}

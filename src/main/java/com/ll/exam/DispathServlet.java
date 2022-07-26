package com.ll.exam;

import com.ll.exam.article.ArticleController;
import com.ll.exam.merber.MerberController;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/url/*")
public class DispathServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Rq rq = new Rq(req,resp);
        MerberController merberController = new MerberController();
        ArticleController articleController = new ArticleController();


        switch (rq.getPath()){
            case "/url/merber/login":
                merberController.showList(rq);
                break;
            case "/url/article/list/free":
                articleController.showList(rq);
                break;
            case "/url/article/write/free":
                articleController.showWrite(rq);
                break;
        }
    }


}

package fr.univrouen.rss25sb.rss25sb.controller;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class ErrorController {
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String handleException(Exception ex, Model model) {
        Map<String, String> error = new HashMap<>();
        error.put("status", "ERROR");
        error.put("description", ex.getMessage());
        model.addAttribute("error", error);
        return "error";
    }
}
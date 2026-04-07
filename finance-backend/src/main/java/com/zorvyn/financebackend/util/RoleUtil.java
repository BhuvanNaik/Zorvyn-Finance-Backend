package com.zorvyn.financebackend.util;


import jakarta.servlet.http.HttpServletRequest;

public class RoleUtil {

    public static void checkAdmin(HttpServletRequest req) {
        String role = (String) req.getAttribute("role");

        if (!"ADMIN".equals(role)) {
            throw new RuntimeException("Access Denied");
        }
    }
}

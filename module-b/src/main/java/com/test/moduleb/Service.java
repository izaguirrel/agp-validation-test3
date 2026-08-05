package com.test.moduleb;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Service {
    private static final ObjectMapper mapper = new ObjectMapper();

    public String toJson(Object obj) throws Exception {
        return mapper.writeValueAsString(obj);
    }

    public static void main(String[] args) throws Exception {
        Service service = new Service();
        String json = service.toJson("Module B - Hello World!");
        System.out.println(json);
    }
}

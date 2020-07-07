import com.google.gson.Gson;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String json2obj = "{\"nome\":\"Luiz Filipy\",\"idade\":\"20\", \"isActive\": \"true\"}";
        Gson gson = new Gson();

        Pessoa pessoa = gson.fromJson(json2obj, Pessoa.class);
        pessoa.print();

        String obj2json = gson.toJson(new Pessoa("Maria Souza", 23, false));
        System.out.println(obj2json);

        // ================

        String arr2obj = "[" +
                "{\"nome\":\"Luiz Filipy\",\"idade\":\"20\", \"isActive\": \"true\"}," +
                "{\"nome\":\"José Souza\",\"idade\":\"34\", \"isActive\": \"false\"}," +
                "{\"nome\":\"Maria Lima\",\"idade\":\"19\", \"isActive\": \"true\"}]";
        Pessoa[] pessoas = gson.fromJson(arr2obj, Pessoa[].class);
        Arrays.asList(pessoas).forEach(p -> p.print());

        Pessoa[] pessoas2 = {
                new Pessoa("Luiz Filipy", 20, true),
                new Pessoa("João Silva", 30, false)
        };
        String arr2json = gson.toJson(pessoas2);
        System.out.println(arr2json);
    }
}
